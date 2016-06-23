package project.exampleusedagger2;

import javax.inject.Singleton;

import dagger.Component;

/**
 * Created by kikep on 23/06/2016.
 */
@Singleton
@Component(modules={NoteModule.class})
public interface NoteComponent {
    void inject(MainActivity activity);
}
