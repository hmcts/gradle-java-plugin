package uk.gov.hmcts;

import com.sun.tools.javac.util.List;
import org.gradle.api.Project;
import org.gradle.api.tasks.compile.JavaCompile;

public class JavacSetup {
    public static void apply(Project project) {
        for (JavaCompile javaCompile : project.getTasks().withType(JavaCompile.class)) {
            // Turn on all compiler warnings with warnings as errors.
            javaCompile.getOptions().getCompilerArgs().addAll(List.of(
                "-Xlint:all",
                "-Werror" ));
        }
    }
}
