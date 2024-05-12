package X;

import android.view.View;
import java.lang.ref.WeakReference;

/* loaded from: classes7.dex */
public final class E6D implements E67 {
    public final WeakReference<View> LIZ;

    @Override // X.E67
    public final int getScene() {
        return E6G.SHOOT.getValue();
    }

    @Override // X.E67
    public final int getType() {
        return E6E.GO_LIVE.getValue();
    }

    public E6D(WeakReference<View> weakReference) {
        this.LIZ = weakReference;
    }
}
