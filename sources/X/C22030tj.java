package X;

import kotlin.jvm.internal.o;

/* renamed from: X.0tj, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C22030tj {
    public static final C22030tj LIZJ = new C22030tj(C21990tf.LIZIZ);
    public final float LIZ;
    public final int LIZIZ = 17;

    public final int hashCode() {
        return (Float.floatToIntBits(this.LIZ) * 31) + this.LIZIZ;
    }

    public final String toString() {
        boolean z;
        String LIZIZ;
        String str;
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("LineHeightStyle(alignment=");
        float f = this.LIZ;
        if (f == 0.0f) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            LIZIZ = "LineHeightStyle.Alignment.Top";
        } else if (f == C21990tf.LIZ) {
            LIZIZ = "LineHeightStyle.Alignment.Center";
        } else if (f == C21990tf.LIZIZ) {
            LIZIZ = "LineHeightStyle.Alignment.Proportional";
        } else if (f == C21990tf.LIZJ) {
            LIZIZ = "LineHeightStyle.Alignment.Bottom";
        } else {
            StringBuilder LIZ2 = X1D.LIZ();
            LIZ2.append("LineHeightStyle.Alignment(topPercentage = ");
            LIZ2.append(f);
            LIZ2.append(')');
            LIZIZ = X1D.LIZIZ(LIZ2);
        }
        LIZ.append((Object) LIZIZ);
        LIZ.append(", trim=");
        int i = this.LIZIZ;
        if (i == 1) {
            str = "LineHeightStyle.Trim.FirstLineTop";
        } else if (i == 16) {
            str = "LineHeightStyle.Trim.LastLineBottom";
        } else if (i == 17) {
            str = "LineHeightStyle.Trim.Both";
        } else if (i == 0) {
            str = "LineHeightStyle.Trim.None";
        } else {
            str = "Invalid";
        }
        LIZ.append((Object) str);
        LIZ.append(')');
        return X1D.LIZIZ(LIZ);
    }

    public C22030tj(float f) {
        this.LIZ = f;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C22030tj)) {
            return false;
        }
        C22030tj c22030tj = (C22030tj) obj;
        if (o.LJ(Float.valueOf(this.LIZ), Float.valueOf(c22030tj.LIZ)) && this.LIZIZ == c22030tj.LIZIZ) {
            return true;
        }
        return false;
    }
}
