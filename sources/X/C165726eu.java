package X;

import android.app.Application;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.ViewModelProvider;
import androidx.lifecycle.ViewModelStoreOwner;

/* renamed from: X.6eu, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C165726eu {
    public static ViewModelProvider LIZ(Fragment fragment, ViewModelStoreOwner viewModelStoreOwner) {
        ActivityC45651qj mo49getActivity = fragment.mo49getActivity();
        if (mo49getActivity != null) {
            Application application = mo49getActivity.getApplication();
            if (application != null) {
                return new ViewModelProvider(viewModelStoreOwner.getViewModelStore(), ViewModelProvider.AndroidViewModelFactory.getInstance(application));
            }
            throw new IllegalStateException("Your activity/fragment is not yet attached to Application. You can't request ViewModel before onCreate call.");
        }
        throw new IllegalStateException("Can't create ViewModelProvider for detached fragment");
    }
}
