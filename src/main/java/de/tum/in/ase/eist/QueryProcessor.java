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
        } else { // TODO extend the programm here
            final String[] split = query.split(",");
            int max = Integer.MIN_VALUE;
            if (split.length > 1) {
                for (int i = 1; i < split.length; i++) {
                    max = Math.max(Integer.parseInt(split[i]), max);
                }
            }
            return String.valueOf(max);
        }
    }
}
