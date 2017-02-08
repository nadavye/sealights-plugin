package io.sealights.plugins.sealightsjenkins.buildsteps.cli.executors;

import io.sealights.plugins.sealightsjenkins.buildsteps.cli.entities.StartCommandArguments;
import io.sealights.plugins.sealightsjenkins.utils.Logger;

/**
 * Executor for the 'start' command.
 */
public class StartCommandExecutor extends AbstractCommandExecutor {

    private StartCommandArguments startCommandArguments;

    public StartCommandExecutor(Logger logger, StartCommandArguments startCommandArguments) {
        super(logger, startCommandArguments.getBaseArgs());
        this.startCommandArguments = startCommandArguments;
    }

    @Override
    public String getAdditionalArguments() {
        StringBuilder sb = new StringBuilder();
        addArgumentKeyVal(sb, "testStage", startCommandArguments.getNewEnvironment());
        return sb.toString();
    }
}
