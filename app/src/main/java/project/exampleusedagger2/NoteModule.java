package project.exampleusedagger2;

import dagger.Module;
import dagger.Provides;

/**
 * Created by kikep on 23/06/2016.
 */
@Module
public class NoteModule {
    @Provides
    Note provideUser(){
        return new Note();
    }
}
