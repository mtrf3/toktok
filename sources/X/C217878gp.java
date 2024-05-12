package X;

import com.ss.android.ugc.aweme.discover.model.Position;
import com.ss.android.ugc.aweme.discover.model.suggest.Word;
import java.util.List;
import kotlin.jvm.internal.o;

/* renamed from: X.8gp, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C217878gp {
    public final boolean LIZ;
    public final EnumC217828gk LIZIZ;
    public final boolean LIZJ;
    public final Word LIZLLL;
    public final String LJ;
    public final String LJFF;
    public final int LJI;
    public final List<Position> LJII;
    public final List<Position> LJIIIIZZ;

    public C217878gp() {
        this(false, null, false, null, null, null, 0, null, null, 511);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C217878gp)) {
            return false;
        }
        C217878gp c217878gp = (C217878gp) obj;
        return this.LIZ == c217878gp.LIZ && this.LIZIZ == c217878gp.LIZIZ && this.LIZJ == c217878gp.LIZJ && o.LJ(this.LIZLLL, c217878gp.LIZLLL) && o.LJ(this.LJ, c217878gp.LJ) && o.LJ(this.LJFF, c217878gp.LJFF) && this.LJI == c217878gp.LJI && o.LJ(this.LJII, c217878gp.LJII) && o.LJ(this.LJIIIIZZ, c217878gp.LJIIIIZZ);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v1, types: [int] */
    /* JADX WARN: Type inference failed for: r0v17 */
    /* JADX WARN: Type inference failed for: r0v18 */
    public final int hashCode() {
        int hashCode;
        boolean z = this.LIZ;
        int i = 1;
        ?? r0 = z;
        if (z) {
            r0 = 1;
        }
        int hashCode2 = (this.LIZIZ.hashCode() + (r0 * 31)) * 31;
        if (!this.LIZJ) {
            i = 0;
        }
        int i2 = (hashCode2 + i) * 31;
        Word word = this.LIZLLL;
        int i3 = 0;
        if (word == null) {
            hashCode = 0;
        } else {
            hashCode = word.hashCode();
        }
        int i4 = (i2 + hashCode) * 31;
        String str = this.LJ;
        if (str != null) {
            i3 = str.hashCode();
        }
        return this.LJIIIIZZ.hashCode() + AnonymousClass391.LIZIZ(this.LJII, (C79062V1e.LJ(this.LJFF, (i4 + i3) * 31, 31) + this.LJI) * 31, 31);
    }

    public final String toString() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("MentionUserExtraInfo(isMentionEnabled=");
        LIZ.append(this.LIZ);
        LIZ.append(", mentionUserType=");
        LIZ.append(this.LIZIZ);
        LIZ.append(", isFromSug=");
        LIZ.append(this.LIZJ);
        LIZ.append(", wordRecord=");
        LIZ.append(this.LIZLLL);
        LIZ.append(", relationType=");
        LIZ.append(this.LJ);
        LIZ.append(", requestId=");
        LIZ.append(this.LJFF);
        LIZ.append(", searchType=");
        LIZ.append(this.LJI);
        LIZ.append(", position=");
        LIZ.append(this.LJII);
        LIZ.append(", highlightPositions=");
        return C1NE.LIZIZ(LIZ, this.LJIIIIZZ, ')', LIZ);
    }

    public C217878gp(boolean z, EnumC217828gk mentionUserType, boolean z2, Word word, String str, String requestId, int i, List position, List highlightPositions, int i2) {
        z = (i2 & 1) != 0 ? true : z;
        mentionUserType = (i2 & 2) != 0 ? EnumC217828gk.ALL : mentionUserType;
        z2 = (i2 & 4) != 0 ? false : z2;
        word = (i2 & 8) != 0 ? null : word;
        str = (i2 & 16) != 0 ? "" : str;
        requestId = (i2 & 32) != 0 ? "" : requestId;
        i = (i2 & 64) != 0 ? -1 : i;
        position = (i2 & 128) != 0 ? C61878OQg.INSTANCE : position;
        highlightPositions = (i2 & 256) != 0 ? C61878OQg.INSTANCE : highlightPositions;
        o.LJIIIZ(mentionUserType, "mentionUserType");
        o.LJIIIZ(requestId, "requestId");
        o.LJIIIZ(position, "position");
        o.LJIIIZ(highlightPositions, "highlightPositions");
        this.LIZ = z;
        this.LIZIZ = mentionUserType;
        this.LIZJ = z2;
        this.LIZLLL = word;
        this.LJ = str;
        this.LJFF = requestId;
        this.LJI = i;
        this.LJII = position;
        this.LJIIIIZZ = highlightPositions;
    }
}
