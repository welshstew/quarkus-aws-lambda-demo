package com.codergists;

import javax.enterprise.context.ApplicationScoped;
import javax.inject.Named;
import io.quarkus.runtime.annotations.RegisterForReflection;


@ApplicationScoped
@Named("processingService")
@RegisterForReflection
public class ProcessingService {

    public static final String CAN_ONLY_GREET_NICKNAMES = "Can only greet nicknames";

    public OutputObject doStuff(InputObject input) {
        if (input.getName().equals("Stuart")) {
            throw new IllegalArgumentException(CAN_ONLY_GREET_NICKNAMES);
        }
        String result = input.getGreeting() + " " + input.getName();
        OutputObject out = new OutputObject();
        out.setResult(result);
        return out;
    }

    public OutputObject process(InputObject input) {
        if (input.getName().equals("Stuart")) {
            throw new IllegalArgumentException(CAN_ONLY_GREET_NICKNAMES);
        }
        String result = input.getGreeting() + " " + input.getName();
        OutputObject out = new OutputObject();
        out.setResult(result);
        return out;
    }
}
