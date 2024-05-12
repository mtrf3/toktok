package X;

import java.util.List;
import kotlin.jvm.internal.o;

/* renamed from: X.RTk, reason: case insensitive filesystem */
/* loaded from: classes13.dex */
public final class C69604RTk {
    public final String LIZ;
    public final String LIZIZ;
    public final String LIZJ;
    public final C69603RTj LIZLLL;
    public final List<C71830SHa> LJ;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C69604RTk)) {
            return false;
        }
        C69604RTk c69604RTk = (C69604RTk) obj;
        return o.LJ(this.LIZ, c69604RTk.LIZ) && o.LJ(this.LIZIZ, c69604RTk.LIZIZ) && o.LJ(this.LIZJ, c69604RTk.LIZJ) && o.LJ(this.LIZLLL, c69604RTk.LIZLLL) && o.LJ(this.LJ, c69604RTk.LJ);
    }

    public final int hashCode() {
        String str = this.LIZ;
        int hashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.LIZIZ;
        int hashCode2 = (hashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.LIZJ;
        int hashCode3 = (this.LIZLLL.hashCode() + ((hashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31)) * 31;
        List<C71830SHa> list = this.LJ;
        return hashCode3 + (list != null ? list.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("QnaCellDataAnswersSubsection(avatarUrlThumbnail=");
        LIZ.append(this.LIZ);
        LIZ.append(", avatarAdjacentTextDisplayName=");
        LIZ.append(this.LIZIZ);
        LIZ.append(", avatarAdjacentTextTimestamp=");
        LIZ.append(this.LIZJ);
        LIZ.append(", profileData=");
        LIZ.append(this.LIZLLL);
        LIZ.append(", videoThumbnail=");
        return C1NE.LIZIZ(LIZ, this.LJ, ')', LIZ);
    }

    public C69604RTk(String str, String str2, String str3, C69603RTj c69603RTj, List<C71830SHa> list) {
        this.LIZ = str;
        this.LIZIZ = str2;
        this.LIZJ = str3;
        this.LIZLLL = c69603RTj;
        this.LJ = list;
    }
}
