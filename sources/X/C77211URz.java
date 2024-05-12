package X;

import kotlin.jvm.internal.o;

/* renamed from: X.URz, reason: case insensitive filesystem */
/* loaded from: classes14.dex */
public final class C77211URz extends F9E {
    public final C77210URy LJLIL;
    public final C77216USe LJLILLLLZI;

    public C77211URz() {
        this((C77210URy) null, 3);
    }

    @Override // X.F9E
    public final Object[] getObjects() {
        return new Object[]{this.LJLIL, this.LJLILLLLZI};
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public C77211URz(X.C77210URy r11, int r12) {
        /*
            r10 = this;
            r3 = r11
            r0 = r12 & 1
            r2 = 0
            if (r0 == 0) goto L32
            X.URy r3 = new X.URy
            android.app.Activity r4 = com.ss.android.ugc.aweme.utils.ActivityStack.getTopActivity()
            java.lang.String r0 = "getTopActivity()"
            kotlin.jvm.internal.o.LJIIIIZZ(r4, r0)
            X.1qj r5 = X.C45804HyK.LJJIFFI(r4)
            X.UtN r1 = X.C36636EZk.LIZ
            X.Nsf r0 = X.T2R.LJIIJJI()
            X.MBA r0 = r1.plus(r0)
            X.2gm r6 = X.C48841JEv.LIZ(r0)
            X.USH r7 = new X.USH
            r7.<init>(r2)
            X.M4B r8 = new X.M4B
            r8.<init>(r2)
            r9 = 0
            r3.<init>(r4, r5, r6, r7, r8, r9)
        L32:
            r0 = r12 & 2
            if (r0 == 0) goto L3f
            X.USe r0 = new X.USe
            r0.<init>(r2)
        L3b:
            r10.<init>(r3, r0)
            return
        L3f:
            r0 = 0
            goto L3b
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C77211URz.<init>(X.URy, int):void");
    }

    public C77211URz(C77210URy config, C77216USe curRes) {
        o.LJIIIZ(config, "config");
        o.LJIIIZ(curRes, "curRes");
        this.LJLIL = config;
        this.LJLILLLLZI = curRes;
    }
}
