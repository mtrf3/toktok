package X;

import Y.IDRunnableS29S0200000;
import Y.IDRunnableS6S0101000;
import android.graphics.Typeface;
import android.os.Handler;

/* renamed from: X.0dh, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C12090dh {
    public final MPE LIZ;
    public final Handler LIZIZ;

    public final void LIZ(C12150dn c12150dn) {
        int i = c12150dn.LIZIZ;
        if (i == 0) {
            Typeface typeface = c12150dn.LIZ;
            this.LIZIZ.post(new IDRunnableS29S0200000(this.LIZ, typeface, 27));
        } else {
            this.LIZIZ.post(new IDRunnableS6S0101000(i, this.LIZ, 24));
        }
    }

    public C12090dh(C41481k0 c41481k0, Handler handler) {
        this.LIZ = c41481k0;
        this.LIZIZ = handler;
    }
}
