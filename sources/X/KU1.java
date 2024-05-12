package X;

import androidx.fragment.app.Fragment;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.ViewModelProvider;
import com.ss.android.ugc.feed.platform.performance.ScopePerformanceVM;

/* loaded from: classes9.dex */
public final class KU1 {
    public static ScopePerformanceVM LIZ(Fragment fragment) {
        ScopePerformanceVM scopePerformanceVM = null;
        if (fragment == null || fragment.getLifecycle().getCurrentState() == Lifecycle.State.DESTROYED || fragment.isDetached()) {
            return null;
        }
        try {
            scopePerformanceVM = (ScopePerformanceVM) new ViewModelProvider(fragment).get(ScopePerformanceVM.class);
            return scopePerformanceVM;
        } catch (Exception unused) {
            return scopePerformanceVM;
        }
    }
}
