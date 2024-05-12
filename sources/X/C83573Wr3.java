package X;

import Y.ARunnableS12S0101000_8;
import Y.ARunnableS8S0201000_5;
import android.os.Handler;
import com.bytedance.ies.effecteditor.swig.UIAnnotationErrorCode;

/* renamed from: X.Wr3, reason: case insensitive filesystem */
/* loaded from: classes15.dex */
public final class C83573Wr3 {
    public static volatile C83573Wr3 LIZIZ;
    public Handler LIZ = new Handler(C16880lQ.LLJJJJ());

    public static C83573Wr3 LIZJ() {
        if (LIZIZ != null) {
            return LIZIZ;
        }
        synchronized (C83573Wr3.class) {
            if (LIZIZ != null) {
                return LIZIZ;
            }
            LIZIZ = new C83573Wr3();
            return LIZIZ;
        }
    }

    public final void finalize() {
        this.LIZ.removeCallbacksAndMessages(null);
        this.LIZ = null;
        super.finalize();
    }

    public static void LIZ(C2V c2v) {
        if (c2v == null) {
            return;
        }
        LIZJ().LIZ.post(new ARunnableS12S0101000_8(2, c2v, 2));
    }

    public static void LIZIZ(C2V c2v, UIAnnotationErrorCode uIAnnotationErrorCode) {
        if (c2v == null) {
            return;
        }
        LIZJ().LIZ.post(new ARunnableS8S0201000_5(1, c2v, uIAnnotationErrorCode, 4));
    }
}
