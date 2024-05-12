package X;

import android.os.Looper;

/* loaded from: classes14.dex */
public class V9Q implements V9V {
    public final /* synthetic */ V9P LIZ;

    @Override // X.V9V
    public final void LIZ() {
    }

    @Override // X.V9V
    public final void LIZIZ() {
        if (Looper.myLooper() == C16880lQ.LLJJJJ()) {
            this.LIZ.invalidate();
        } else {
            this.LIZ.postInvalidate();
        }
    }

    public V9Q(V9P v9p) {
        this.LIZ = v9p;
    }
}
