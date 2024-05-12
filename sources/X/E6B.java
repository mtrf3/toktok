package X;

import android.view.View;
import java.lang.ref.WeakReference;

/* loaded from: classes7.dex */
public final class E6B implements E67 {
    public final WeakReference<View> LIZ;

    @Override // X.E67
    public final int getScene() {
        return E6G.FEED.getValue();
    }

    @Override // X.E67
    public final int getType() {
        return E69.CREATE_WITH_PHOTOS.getValue();
    }

    public E6B(WeakReference<View> weakReference) {
        this.LIZ = weakReference;
    }
}
