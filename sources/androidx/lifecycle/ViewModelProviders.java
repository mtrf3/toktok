package androidx.lifecycle;

import X.ActivityC45651qj;
import android.app.Activity;
import android.app.Application;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.ViewModelProvider;

/* loaded from: classes.dex */
public class ViewModelProviders {

    /* loaded from: classes.dex */
    public static class DefaultFactory extends ViewModelProvider.AndroidViewModelFactory {
        public DefaultFactory(Application application) {
            super(application);
        }
    }

    public static Activity checkActivity(Fragment fragment) {
        ActivityC45651qj mo49getActivity = fragment.mo49getActivity();
        if (mo49getActivity != null) {
            return mo49getActivity;
        }
        throw new IllegalStateException("Can't create ViewModelProvider for detached fragment");
    }

    public static Application checkApplication(Activity activity) {
        Application application = activity.getApplication();
        if (application != null) {
            return application;
        }
        throw new IllegalStateException("Your activity/fragment is not yet attached to Application. You can't request ViewModel before onCreate call.");
    }

    public static ViewModelProvider of(ActivityC45651qj activityC45651qj) {
        return of(activityC45651qj, (ViewModelProvider.Factory) null);
    }

    public static ViewModelProvider of(Fragment fragment) {
        return of(fragment, (ViewModelProvider.Factory) null);
    }

    public static ViewModelProvider of(Fragment fragment, ViewModelProvider.Factory factory) {
        Application checkApplication = checkApplication(checkActivity(fragment));
        if (factory == null) {
            factory = ViewModelProvider.AndroidViewModelFactory.getInstance(checkApplication);
        }
        return new ViewModelProvider(fragment.getViewModelStore(), factory);
    }

    public static ViewModelProvider of(ActivityC45651qj activityC45651qj, ViewModelProvider.Factory factory) {
        Application checkApplication = checkApplication(activityC45651qj);
        if (factory == null) {
            factory = ViewModelProvider.AndroidViewModelFactory.getInstance(checkApplication);
        }
        return new ViewModelProvider(activityC45651qj.getViewModelStore(), factory);
    }
}
