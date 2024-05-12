package X;

import kotlin.jvm.internal.o;

/* loaded from: classes9.dex */
public final class JBB implements C33Q {
    public final C43I<Boolean> LJLIL;
    public final C43I<Integer> LJLILLLLZI;
    public final C43I<Integer> LJLJI;
    public final C43I<Boolean> LJLJJI;
    public final C43I<Boolean> LJLJJL;
    public final C43I<C76800UCe> LJLJJLL;

    public JBB() {
        this(0);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof JBB)) {
            return false;
        }
        JBB jbb = (JBB) obj;
        return o.LJ(this.LJLIL, jbb.LJLIL) && o.LJ(this.LJLILLLLZI, jbb.LJLILLLLZI) && o.LJ(this.LJLJI, jbb.LJLJI) && o.LJ(this.LJLJJI, jbb.LJLJJI) && o.LJ(this.LJLJJL, jbb.LJLJJL) && o.LJ(this.LJLJJLL, jbb.LJLJJLL);
    }

    public final int hashCode() {
        int hashCode;
        int LIZIZ = C40328FsC.LIZIZ(this.LJLJJL, C40328FsC.LIZIZ(this.LJLJJI, C40328FsC.LIZIZ(this.LJLJI, C40328FsC.LIZIZ(this.LJLILLLLZI, this.LJLIL.hashCode() * 31, 31), 31), 31), 31);
        C43I<C76800UCe> c43i = this.LJLJJLL;
        if (c43i == null) {
            hashCode = 0;
        } else {
            hashCode = c43i.hashCode();
        }
        return LIZIZ + hashCode;
    }

    public final String toString() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("MidAdState(requestSuccess=");
        LIZ.append(this.LJLIL);
        LIZ.append(", countDownTime=");
        LIZ.append(this.LJLILLLLZI);
        LIZ.append(", skipAdTime=");
        LIZ.append(this.LJLJI);
        LIZ.append(", enterReplaceAd=");
        LIZ.append(this.LJLJJI);
        LIZ.append(", enterReplaceOrigin=");
        LIZ.append(this.LJLJJL);
        LIZ.append(", hideCountDown=");
        return C61845OOz.LIZIZ(LIZ, this.LJLJJLL, ')', LIZ);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public /* synthetic */ JBB(int r9) {
        /*
            r8 = this;
            X.43I r2 = new X.43I
            java.lang.Boolean r1 = java.lang.Boolean.FALSE
            r2.<init>(r1)
            X.43I r3 = new X.43I
            r0 = -1
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            r3.<init>(r0)
            X.43I r4 = new X.43I
            r0 = 0
            r4.<init>(r0)
            X.43I r5 = new X.43I
            r5.<init>(r1)
            X.43I r6 = new X.43I
            r6.<init>(r1)
            r7 = 0
            r1 = r8
            r1.<init>(r2, r3, r4, r5, r6, r7)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.JBB.<init>(int):void");
    }

    public JBB(C43I<Boolean> requestSuccess, C43I<Integer> countDownTime, C43I<Integer> skipAdTime, C43I<Boolean> enterReplaceAd, C43I<Boolean> enterReplaceOrigin, C43I<C76800UCe> c43i) {
        o.LJIIIZ(requestSuccess, "requestSuccess");
        o.LJIIIZ(countDownTime, "countDownTime");
        o.LJIIIZ(skipAdTime, "skipAdTime");
        o.LJIIIZ(enterReplaceAd, "enterReplaceAd");
        o.LJIIIZ(enterReplaceOrigin, "enterReplaceOrigin");
        this.LJLIL = requestSuccess;
        this.LJLILLLLZI = countDownTime;
        this.LJLJI = skipAdTime;
        this.LJLJJI = enterReplaceAd;
        this.LJLJJL = enterReplaceOrigin;
        this.LJLJJLL = c43i;
    }

    public static JBB LIZ(JBB jbb, C43I c43i, C43I c43i2, C43I c43i3, C43I c43i4, C43I c43i5, C43I c43i6, int i) {
        C43I c43i7 = c43i6;
        C43I enterReplaceOrigin = c43i5;
        C43I enterReplaceAd = c43i4;
        C43I skipAdTime = c43i3;
        C43I requestSuccess = c43i;
        C43I countDownTime = c43i2;
        if ((i & 1) != 0) {
            requestSuccess = jbb.LJLIL;
        }
        if ((i & 2) != 0) {
            countDownTime = jbb.LJLILLLLZI;
        }
        if ((i & 4) != 0) {
            skipAdTime = jbb.LJLJI;
        }
        if ((i & 8) != 0) {
            enterReplaceAd = jbb.LJLJJI;
        }
        if ((i & 16) != 0) {
            enterReplaceOrigin = jbb.LJLJJL;
        }
        if ((i & 32) != 0) {
            c43i7 = jbb.LJLJJLL;
        }
        jbb.getClass();
        o.LJIIIZ(requestSuccess, "requestSuccess");
        o.LJIIIZ(countDownTime, "countDownTime");
        o.LJIIIZ(skipAdTime, "skipAdTime");
        o.LJIIIZ(enterReplaceAd, "enterReplaceAd");
        o.LJIIIZ(enterReplaceOrigin, "enterReplaceOrigin");
        return new JBB(requestSuccess, countDownTime, skipAdTime, enterReplaceAd, enterReplaceOrigin, c43i7);
    }
}
