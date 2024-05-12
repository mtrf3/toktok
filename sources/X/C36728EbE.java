package X;

import java.io.File;

/* renamed from: X.EbE, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C36728EbE {
    public final File LIZ;
    public final String LIZIZ;

    public C36728EbE() {
    }

    public C36728EbE(File file, String str) {
        this();
        this.LIZ = file;
        if (str == null) {
            throw new NullPointerException("Null splitId");
        }
        this.LIZIZ = str;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof C36728EbE) {
            C36728EbE c36728EbE = (C36728EbE) obj;
            if (this.LIZ.equals(c36728EbE.LIZ) && this.LIZIZ.equals(c36728EbE.LIZIZ)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((this.LIZ.hashCode() ^ 1000003) * 1000003) ^ this.LIZIZ.hashCode();
    }

    public final String toString() {
        String valueOf = String.valueOf(this.LIZ);
        String str = this.LIZIZ;
        StringBuilder sb = new StringBuilder(valueOf.length() + 35 + str.length());
        YE1.LIZLLL(sb, "SplitFileInfo{splitFile=", valueOf, ", splitId=", str);
        sb.append("}");
        return sb.toString();
    }
}
