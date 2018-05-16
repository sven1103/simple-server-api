package life.qbic;

import picocli.CommandLine;
import life.qbic.SimpleServer;

public class Main {

    public static void main(String[] args){

        CliOptions cmd = new CliOptions();
        new CommandLine(cmd).parse(args);

        if (cmd.helpRequested){
            CommandLine.usage(new CliOptions(), System.out);
            System.exit(0);
        }

        SimpleServer simpleServer = new SimpleServer(8080, "/");


    }

}
