package X;

import android.content.Context;

/* loaded from: classes12.dex */
public final class R1N implements InterfaceC68461Qtt {
    @Override // X.InterfaceC68461Qtt
    public final R1O LIZ(Context context, String str, R1P r1p) {
        R1O r1o = new R1O();
        int LIZIZ = r1p.LIZIZ(context, str, false);
        r1o.LIZIZ = LIZIZ;
        if (LIZIZ == 0) {
            r1o.LIZJ = 0;
        } else {
            r1o.LIZJ = 1;
        }
        return r1o;
    }
}
