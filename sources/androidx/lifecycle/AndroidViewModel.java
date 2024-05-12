package androidx.lifecycle;

import android.app.Application;

/* loaded from: classes.dex */
public class AndroidViewModel extends ViewModel {
    public Application mApplication;

    public <T extends Application> T getApplication() {
        return (T) this.mApplication;
    }

    public AndroidViewModel(Application application) {
        this.mApplication = application;
    }
}
