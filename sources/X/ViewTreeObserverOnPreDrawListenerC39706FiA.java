package X;

import android.os.Build;
import android.view.ViewTreeObserver;
import com.bytedance.common.jato.gfx.DoFrameController;

/* renamed from: X.FiA, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public class ViewTreeObserverOnPreDrawListenerC39706FiA implements ViewTreeObserver.OnPreDrawListener {
    @Override // android.view.ViewTreeObserver.OnPreDrawListener
    public final boolean onPreDraw() {
        long j;
        if (C39707FiB.LIZIZ != -1) {
            if (C39707FiB.LIZJ) {
                C39707FiB.LIZJ = false;
                return false;
            }
            if (DoFrameController.LJFF != null) {
                if (Build.VERSION.SDK_INT >= 31) {
                    j = DoFrameController.LJFF[3];
                } else {
                    j = DoFrameController.LJFF[2];
                }
                if (j != 0 && System.nanoTime() - j > C39707FiB.LIZIZ) {
                    C39707FiB.LIZJ = true;
                }
            }
        }
        return true;
    }
}
