package X;

import android.content.Context;

/* loaded from: classes12.dex */
public final class R1I implements InterfaceC68461Qtt {
    @Override // X.InterfaceC68461Qtt
    public final R1O LIZ(Context context, String str, R1P r1p) {
        R1O r1o = new R1O();
        r1o.LIZ = r1p.LIZ(context, str);
        int LIZIZ = r1p.LIZIZ(context, str, true);
        r1o.LIZIZ = LIZIZ;
        int i = r1o.LIZ;
        if (i == 0) {
            i = 0;
            if (LIZIZ == 0) {
                r1o.LIZJ = 0;
                return r1o;
            }
        }
        if (i >= LIZIZ) {
            r1o.LIZJ = -1;
        } else {
            r1o.LIZJ = 1;
        }
        return r1o;
    }
}
