package project.exampleusedagger2;

import android.app.Application;

/**
 * Created by kikep on 23/06/2016.
 */
public class MyAPP extends Application {
    private NoteComponent mNoteComponent;

    @Override
    public void onCreate() {
        super.onCreate();

        // Dagger%COMPONENT_NAME%
        mNoteComponent = DaggerNoteComponent.builder()
                // list of modules that are part of this component need to be created here too
                .noteModule(new NoteModule())
                .build();

    }
    NoteComponent getmNoteComponent(){
        return mNoteComponent;
    }

}
