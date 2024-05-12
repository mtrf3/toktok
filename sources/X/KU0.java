package X;

import androidx.fragment.app.Fragment;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.ViewModelProvider;
import com.ss.android.ugc.feed.platform.monitor.ComponentTraceVM;

/* loaded from: classes9.dex */
public final class KU0 {
    public static ComponentTraceVM LIZ(Fragment fragment) {
        ComponentTraceVM componentTraceVM = null;
        if (fragment == null || fragment.getLifecycle().getCurrentState() == Lifecycle.State.DESTROYED || fragment.isDetached()) {
            return null;
        }
        try {
            componentTraceVM = (ComponentTraceVM) new ViewModelProvider(fragment).get(ComponentTraceVM.class);
            return componentTraceVM;
        } catch (Exception unused) {
            return componentTraceVM;
        }
    }
}
