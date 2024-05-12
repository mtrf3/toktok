package X;

import android.app.Activity;
import android.app.Application;
import androidx.lifecycle.ViewModelProvider;

/* renamed from: X.6et, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C165716et {
    public static ViewModelProvider LIZ(WM7 wm7) {
        Activity activity = wm7.mActivity;
        if (activity != null) {
            Application application = activity.getApplication();
            if (application != null) {
                return new ViewModelProvider(wm7.getViewModelStore(), ViewModelProvider.AndroidViewModelFactory.getInstance(application));
            }
            throw new IllegalStateException("Your activity is not yet attached to Application. You can't request ViewModel before onCreate call.");
        }
        throw new IllegalStateException("Can't create ViewModelProvider for removed scene");
    }
}
