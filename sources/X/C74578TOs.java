package X;

import kotlin.jvm.internal.o;

/* renamed from: X.TOs, reason: case insensitive filesystem */
/* loaded from: classes13.dex */
public final class C74578TOs {
    public final String LIZ;
    public final String LIZIZ;
    public final String LIZJ = "media_tray";
    public final boolean LIZLLL;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C74578TOs)) {
            return false;
        }
        C74578TOs c74578TOs = (C74578TOs) obj;
        return o.LJ(this.LIZ, c74578TOs.LIZ) && o.LJ(this.LIZIZ, c74578TOs.LIZIZ) && o.LJ(this.LIZJ, c74578TOs.LIZJ) && this.LIZLLL == c74578TOs.LIZLLL;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final int hashCode() {
        String str = this.LIZ;
        int hashCode = (str != null ? str.hashCode() : 0) * 31;
        String str2 = this.LIZIZ;
        int hashCode2 = (hashCode + (str2 != null ? str2.hashCode() : 0)) * 31;
        String str3 = this.LIZJ;
        int hashCode3 = (hashCode2 + (str3 != null ? str3.hashCode() : 0)) * 31;
        boolean z = this.LIZLLL;
        int i = z;
        if (z != 0) {
            i = 1;
        }
        return hashCode3 + i;
    }

    public final String toString() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("SelectParam(giphyId=");
        LIZ.append(this.LIZ);
        LIZ.append(", stickerId=");
        LIZ.append(this.LIZIZ);
        LIZ.append(", tabName=");
        LIZ.append(this.LIZJ);
        LIZ.append(", isImage=");
        return C19U.LIZ(LIZ, this.LIZLLL, ")", LIZ);
    }

    public C74578TOs(String str, String str2, boolean z) {
        this.LIZ = str;
        this.LIZIZ = str2;
        this.LIZLLL = z;
    }
}
