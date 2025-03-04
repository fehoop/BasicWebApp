package de.tum.in.ase.eist;

import org.springframework.stereotype.Service;

@Service
public class QueryProcessor {

    public String process(String query) {
        query = query.toLowerCase();
        if (query.contains("shakespeare")) {
            return "William Shakespeare (26 April 1564 - 23 April 1616) was an " +
                    "English poet, playwright, and actor, widely regarded as the greatest " +
                    "writer in the English language and the world's pre-eminent dramatist.";
        } else if (query.contains("name")) {
            return "fehoop";
        } else if (query.contains("plus")) {
            final String[] split = query.split(" ");
            int posPlus = -1;
            for (int i = 0; i < split.length; i++) {
                if (split[i].equals("plus")) {
                    posPlus = i;
                }
            }
            if (posPlus >= 0) {
                return String.valueOf(Integer.parseInt(split[posPlus - 1]) + Integer.parseInt(split[posPlus + 1]));
            }
            return null;
        } else {
            return null;
        }
    }
}
