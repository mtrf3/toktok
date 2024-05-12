package X;

import androidx.fragment.app.Fragment;
import androidx.lifecycle.ViewModelProvider;

/* renamed from: X.YTk, reason: case insensitive filesystem */
/* loaded from: classes16.dex */
public final class C87440YTk {
    public static ViewModelProvider.Factory LIZ(C1AU c1au) {
        return LIZJ(((InterfaceC87441YTl) C1E5.LIZLLL(InterfaceC87441YTl.class, c1au)).LJII());
    }

    public static ViewModelProvider.Factory LIZIZ(C8W0 c8w0) {
        return LIZJ(((InterfaceC87442YTm) C1E5.LIZLLL(InterfaceC87442YTm.class, c8w0)).LIZ());
    }

    public static ViewModelProvider.Factory LIZJ(java.util.Set<ViewModelProvider.Factory> set) {
        if (set.isEmpty()) {
            return null;
        }
        if (set.size() <= 1) {
            ViewModelProvider.Factory next = set.iterator().next();
            if (next != null) {
                return next;
            }
            throw new IllegalStateException("Default view model factory must not be null.");
        }
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("At most one default view model factory is expected. Found ");
        LIZ.append(set);
        throw new IllegalStateException(X1D.LIZIZ(LIZ));
    }

    public static ViewModelProvider.Factory LIZLLL(Fragment fragment) {
        return LIZJ(((InterfaceC87443YTn) C1E5.LIZLLL(InterfaceC87443YTn.class, fragment)).LJ());
    }
}
