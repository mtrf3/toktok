package X;

import Y.IDRunnableS0S0201000;
import Y.IDRunnableS6S0101000;
import android.graphics.Typeface;
import android.os.Handler;

/* renamed from: X.0Oa, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC06680Oa {
    public abstract void LIZJ(int i);

    public abstract void LIZLLL(Typeface typeface);

    public final void LIZ(int i) {
        new Handler(C16880lQ.LLJJJJ()).post(new IDRunnableS6S0101000(i, this, 18));
    }

    public final void LIZIZ(Typeface typeface) {
        new Handler(C16880lQ.LLJJJJ()).post(new IDRunnableS0S0201000(0, this, typeface, 9));
    }
}
