package X;

import android.view.MotionEvent;
import android.view.ScaleGestureDetector;

/* renamed from: X.WVj, reason: case insensitive filesystem */
/* loaded from: classes15.dex */
public final class C82395WVj extends WXA {
    public final /* synthetic */ C82390WVe LJLIL;

    public C82395WVj(C82390WVe c82390WVe) {
        this.LJLIL = c82390WVe;
    }

    @Override // X.WXB, X.WXG
    public final boolean LJJIIZI(MotionEvent motionEvent) {
        C82390WVe c82390WVe = this.LJLIL;
        if (c82390WVe.LLIIII) {
            c82390WVe.LLIIII = false;
        }
        return false;
    }

    @Override // X.WXB, X.WXG
    public final boolean onScaleBegin(ScaleGestureDetector scaleGestureDetector) {
        this.LJLIL.LLIIII = true;
        return this instanceof W17;
    }
}
