package X;

import kotlin.jvm.internal.o;

/* renamed from: X.aRa, reason: case insensitive filesystem */
/* loaded from: classes34.dex */
public final class C93482aRa {
    public final String LIZ;
    public final String LIZIZ;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C93482aRa)) {
            return false;
        }
        C93482aRa c93482aRa = (C93482aRa) obj;
        return o.LJ(this.LIZ, c93482aRa.LIZ) && o.LJ(this.LIZIZ, c93482aRa.LIZIZ);
    }

    public final int hashCode() {
        String str = this.LIZ;
        int hashCode = (str != null ? str.hashCode() : 0) * 31;
        String str2 = this.LIZIZ;
        return hashCode + (str2 != null ? str2.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("StepInfo(stepTip=");
        LIZ.append(this.LIZ);
        LIZ.append(", content=");
        LIZ.append(this.LIZIZ);
        LIZ.append(")");
        return X1D.LIZIZ(LIZ);
    }

    public C93482aRa() {
        this("", "");
    }

    public C93482aRa(String stepTip, String content) {
        o.LJIIIZ(stepTip, "stepTip");
        o.LJIIIZ(content, "content");
        this.LIZ = stepTip;
        this.LIZIZ = content;
    }
}
