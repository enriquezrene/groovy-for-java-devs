package com.enriquezrene.part01

/**
 * Created by rene on 08/03/16.
 */
class RunningCommands_02 {


    public static final String COMMAND = "ls"

    public static void main(String[] args) {
        runAndPrintOutputGroovyStyle()
        runAndPrintOutputJavaStyle()
    }

    public static void runAndPrintOutputGroovyStyle() {
        println COMMAND.execute().text
    }

    public static void runAndPrintOutputJavaStyle() {
        try {
            Process proc = Runtime.getRuntime().exec(COMMAND);
            BufferedReader result = new BufferedReader(new InputStreamReader(proc.getInputStream()));
            String line;
            while ((line = result.readLine()) != null) {
                System.out.println(line);
            }
        } catch (IOException ex) {
            ex.printStackTrace();
        }
    }
}
