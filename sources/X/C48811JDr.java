package X;

import kotlin.jvm.internal.o;

/* renamed from: X.JDr, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C48811JDr extends C48813JDt {
    public final /* synthetic */ JEG LIZLLL;

    public C48811JDr() {
        throw null;
    }

    public final int LIZ() {
        int LIZJ;
        Integer valueOf;
        if (this.LIZIZ) {
            C48812JDs c48812JDs = this.LIZJ;
            Integer num = c48812JDs.LIZJ;
            if (num != null) {
                return num.intValue();
            }
            if (c48812JDs.LIZIZ != null && (valueOf = Integer.valueOf((int) (r0.intValue() / this.LIZ))) != null) {
                return valueOf.intValue();
            }
            return LIZIZ();
        }
        C48812JDs c48812JDs2 = this.LIZJ;
        Integer num2 = c48812JDs2.LJ;
        if (num2 != null) {
            return num2.intValue();
        }
        Integer num3 = c48812JDs2.LIZLLL;
        if (num3 != null) {
            LIZJ = num3.intValue();
        } else {
            LIZJ = LIZJ();
        }
        return (int) (LIZJ / this.LIZ);
    }

    public final int LIZIZ() {
        JEG jeg = this.LIZLLL;
        int i = (jeg.LJIIJJI - jeg.LJIIL) - jeg.LJIILIIL;
        int i2 = JEG.LJIJ;
        return C47135Ieh.LIZ(1, Math.min(i - i2, jeg.LJIIJ - (i2 * 2)));
    }

    public final int LIZJ() {
        Integer valueOf;
        int LIZ;
        if (this.LIZIZ) {
            C48812JDs c48812JDs = this.LIZJ;
            Integer num = c48812JDs.LIZIZ;
            if (num != null) {
                return num.intValue();
            }
            Integer num2 = c48812JDs.LIZJ;
            if (num2 != null) {
                LIZ = num2.intValue();
            } else {
                LIZ = LIZ();
            }
            return (int) (LIZ * this.LIZ);
        }
        C48812JDs c48812JDs2 = this.LIZJ;
        Integer num3 = c48812JDs2.LIZLLL;
        if (num3 != null) {
            return num3.intValue();
        }
        if (c48812JDs2.LJ != null && (valueOf = Integer.valueOf((int) (r0.intValue() * this.LIZ))) != null) {
            return valueOf.intValue();
        }
        return LIZIZ();
    }

    public final int hashCode() {
        return this.LIZJ.hashCode() + C07250Qf.LIZ(this.LIZIZ, Float.floatToIntBits(this.LIZ) * 31, 31);
    }

    public final String toString() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("WindowSizeInternal( w/h: ");
        LIZ.append(this.LIZ);
        LIZ.append(", isPortrait: ");
        LIZ.append(this.LIZIZ);
        LIZ.append(", mode: ");
        LIZ.append(this.LIZJ.LIZ);
        LIZ.append(" ), Dimen( max: (");
        int i = this.LIZLLL.LJIIJ;
        int i2 = JEG.LJIJ;
        LIZ.append(i - (i2 * 2));
        LIZ.append(", ");
        JEG jeg = this.LIZLLL;
        LIZ.append(((jeg.LJIIJJI - jeg.LJIIL) - jeg.LJIILIIL) - i2);
        LIZ.append("), real: (");
        LIZ.append(LIZJ());
        LIZ.append(", ");
        LIZ.append(LIZ());
        LIZ.append("))");
        return X1D.LIZIZ(LIZ);
    }

    public final boolean equals(Object obj) {
        Class<?> cls;
        if (this == obj) {
            return true;
        }
        if (obj != null) {
            cls = obj.getClass();
        } else {
            cls = null;
        }
        if (!o.LJ(C48811JDr.class, cls)) {
            return false;
        }
        o.LJII(obj, "null cannot be cast to non-null type com.ss.android.ugc.aweme.pipfeed.widget.FloatingWindow.WindowSizeInternal");
        C48813JDt c48813JDt = (C48813JDt) obj;
        if (this.LIZ == c48813JDt.LIZ && this.LIZIZ == c48813JDt.LIZIZ && o.LJ(this.LIZJ, c48813JDt.LIZJ)) {
            return true;
        }
        return false;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public C48811JDr(X.JEG r5, X.C48813JDt r6) {
        /*
            r4 = this;
            java.lang.String r0 = "from"
            kotlin.jvm.internal.o.LJIIIZ(r6, r0)
            float r3 = r6.LIZ
            boolean r2 = r6.LIZIZ
            X.JDs r1 = r6.LIZJ
            java.lang.String r0 = "modeSpec"
            kotlin.jvm.internal.o.LJIIIZ(r1, r0)
            r4.LIZLLL = r5
            r4.<init>(r3, r2, r1)
            int r2 = r4.LIZJ()
            int r0 = r4.LIZIZ()
            if (r2 > r0) goto L29
            int r2 = r4.LIZ()
            int r0 = r4.LIZIZ()
            if (r2 <= r0) goto La3
        L29:
            int r0 = r4.LIZJ()
            float r2 = (float) r0
            int r0 = r4.LIZ()
            float r0 = (float) r0
            float r3 = java.lang.Math.max(r2, r0)
            int r0 = r4.LIZIZ()
            int r0 = r0 + (-1)
            float r0 = (float) r0
            float r3 = r3 / r0
            java.lang.Integer r0 = r1.LIZIZ
            r2 = 0
            if (r0 == 0) goto La8
            int r0 = r0.intValue()
            float r0 = (float) r0
            float r0 = r0 / r3
            int r0 = (int) r0
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
        L4f:
            r1.LIZIZ = r0
            java.lang.Integer r0 = r1.LIZLLL
            if (r0 == 0) goto La6
            int r0 = r0.intValue()
            float r0 = (float) r0
            float r0 = r0 / r3
            int r0 = (int) r0
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
        L60:
            r1.LIZLLL = r0
            java.lang.Integer r0 = r1.LIZJ
            if (r0 == 0) goto La4
            int r0 = r0.intValue()
            float r0 = (float) r0
            float r0 = r0 / r3
            int r0 = (int) r0
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
        L71:
            r1.LIZJ = r0
            java.lang.Integer r0 = r1.LJ
            if (r0 == 0) goto L82
            int r0 = r0.intValue()
            float r0 = (float) r0
            float r0 = r0 / r3
            int r0 = (int) r0
            java.lang.Integer r2 = java.lang.Integer.valueOf(r0)
        L82:
            r1.LJ = r2
            X.JEa r2 = r5.LJFF()
            java.lang.StringBuilder r1 = X.X1D.LIZ()
            java.lang.String r0 = "[WindowSizeInternal#init] Window size adjusted to fit window with "
            r1.append(r0)
            r1.append(r3)
            java.lang.String r0 = ". Current spec: "
            r1.append(r0)
            r1.append(r4)
            java.lang.String r0 = X.X1D.LIZIZ(r1)
            r2.LJIIIIZZ(r0)
        La3:
            return
        La4:
            r0 = r2
            goto L71
        La6:
            r0 = r2
            goto L60
        La8:
            r0 = r2
            goto L4f
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C48811JDr.<init>(X.JEG, X.JDt):void");
    }
}
