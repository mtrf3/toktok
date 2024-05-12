package X;

import kotlin.jvm.internal.o;

/* renamed from: X.URw, reason: case insensitive filesystem */
/* loaded from: classes14.dex */
public final class C77208URw extends F9E {
    public final C77207URv LJLIL;
    public final URP LJLILLLLZI;

    @Override // X.F9E
    public final Object[] getObjects() {
        return new Object[]{this.LJLIL, this.LJLILLLLZI};
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public C77208URw(X.C77207URv r13, int r14) {
        /*
            r12 = this;
            r3 = r13
            r0 = r14 & 1
            r1 = 0
            if (r0 == 0) goto L39
            X.URv r3 = new X.URv
            android.app.Activity r4 = com.ss.android.ugc.aweme.utils.ActivityStack.getTopActivity()
            java.lang.String r0 = "getTopActivity()"
            kotlin.jvm.internal.o.LJIIIIZZ(r4, r0)
            X.1qj r5 = X.C45804HyK.LJJIFFI(r4)
            X.UtN r2 = X.C36636EZk.LIZ
            X.Nsf r0 = X.T2R.LJIIJJI()
            X.MBA r0 = r2.plus(r0)
            X.2gm r6 = X.C48841JEv.LIZ(r0)
            X.M3s r7 = X.EnumC56196M3s.UNKNOWN
            X.URh r8 = new X.URh
            r8.<init>(r1)
            X.USH r9 = new X.USH
            r9.<init>(r1)
            X.M4B r10 = new X.M4B
            r10.<init>(r1)
            r11 = 0
            r3.<init>(r4, r5, r6, r7, r8, r9, r10, r11)
        L39:
            r0 = r14 & 2
            if (r0 == 0) goto L46
            X.URP r0 = new X.URP
            r0.<init>(r1)
        L42:
            r12.<init>(r3, r0)
            return
        L46:
            r0 = 0
            goto L42
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C77208URw.<init>(X.URv, int):void");
    }

    public C77208URw(C77207URv config, URP curRes) {
        o.LJIIIZ(config, "config");
        o.LJIIIZ(curRes, "curRes");
        this.LJLIL = config;
        this.LJLILLLLZI = curRes;
    }
}
