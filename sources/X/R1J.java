package X;

import android.content.Context;

/* loaded from: classes12.dex */
public final class R1J implements InterfaceC68461Qtt {
    @Override // X.InterfaceC68461Qtt
    public final R1O LIZ(Context context, String str, R1P r1p) {
        int LIZIZ;
        R1O r1o = new R1O();
        int LIZ = r1p.LIZ(context, str);
        r1o.LIZ = LIZ;
        int i = 0;
        if (LIZ != 0) {
            LIZIZ = r1p.LIZIZ(context, str, false);
            r1o.LIZIZ = LIZIZ;
        } else {
            LIZIZ = r1p.LIZIZ(context, str, true);
            r1o.LIZIZ = LIZIZ;
        }
        int i2 = r1o.LIZ;
        if (i2 == 0) {
            if (LIZIZ == 0) {
                r1o.LIZJ = 0;
                return r1o;
            }
        } else {
            i = i2;
        }
        if (i >= LIZIZ) {
            r1o.LIZJ = -1;
        } else {
            r1o.LIZJ = 1;
        }
        return r1o;
    }
}
