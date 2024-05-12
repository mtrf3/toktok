package X;

import com.bytedance.mt.protector.impl.string2number.CastLongProtector;

/* renamed from: X.QRl, reason: case insensitive filesystem */
/* loaded from: classes12.dex */
public class C67005QRl {
    public Long LIZ;
    public long LIZIZ;

    public final int hashCode() {
        return this.LIZ.hashCode();
    }

    public final String toString() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append(String.valueOf(this.LIZ));
        LIZ.append("|");
        LIZ.append(String.valueOf(this.LIZIZ));
        return X1D.LIZIZ(LIZ);
    }

    public final void LIZ(String str) {
        String[] split;
        if (str != null && (split = str.split("\\|")) != null && split.length == 2) {
            this.LIZ = CastLongProtector.valueOf(split[0]);
            this.LIZIZ = CastLongProtector.valueOf(split[1]).longValue();
        }
    }

    public final boolean equals(Object obj) {
        if ((obj instanceof C67005QRl) && obj != null) {
            return this.LIZ.equals(((C67005QRl) obj).LIZ);
        }
        return super.equals(obj);
    }
}
