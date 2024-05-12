package androidx.lifecycle;

import X.ActivityC45651qj;
import androidx.fragment.app.Fragment;

/* loaded from: classes.dex */
public class ViewModelStores {
    public static ViewModelStore of(ActivityC45651qj activityC45651qj) {
        return activityC45651qj.getViewModelStore();
    }

    public static ViewModelStore of(Fragment fragment) {
        return fragment.getViewModelStore();
    }
}
