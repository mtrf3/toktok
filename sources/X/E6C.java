package X;

import android.view.View;
import java.lang.ref.WeakReference;

/* loaded from: classes7.dex */
public final class E6C implements E67 {
    public final WeakReference<View> LIZ;
    public final WeakReference<LUF> LIZIZ;

    @Override // X.E67
    public final int getScene() {
        return E6G.FEED.getValue();
    }

    @Override // X.E67
    public final int getType() {
        return E69.MAKE_ANOTHER_VIDEO.getValue();
    }

    public E6C(WeakReference<View> weakReference, WeakReference<LUF> weakReference2) {
        this.LIZ = weakReference;
        this.LIZIZ = weakReference2;
    }
}
