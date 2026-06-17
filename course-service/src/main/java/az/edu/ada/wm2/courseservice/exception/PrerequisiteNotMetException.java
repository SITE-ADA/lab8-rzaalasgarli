package az.edu.ada.wm2.courseservice.exception;

public class PrerequisiteNotMetException extends RuntimeException {
    public PrerequisiteNotMetException(Long prerequisiteCourseId) {
        super("Prerequisite course with id " + prerequisiteCourseId + " has not been completed.");
    }
}