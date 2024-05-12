package X;

import com.ss.android.ugc.aweme.notice.repo.list.bean.MusNotice;
import kotlin.jvm.internal.o;

/* renamed from: X.MUk, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public final class C56890MUk {
    public final MusNotice LIZ;
    public final int LIZIZ;
    public final String LIZJ;
    public final String LIZLLL;
    public final String LJ;
    public final boolean LJFF;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C56890MUk)) {
            return false;
        }
        C56890MUk c56890MUk = (C56890MUk) obj;
        return o.LJ(this.LIZ, c56890MUk.LIZ) && this.LIZIZ == c56890MUk.LIZIZ && o.LJ(this.LIZJ, c56890MUk.LIZJ) && o.LJ(this.LIZLLL, c56890MUk.LIZLLL) && o.LJ(this.LJ, c56890MUk.LJ) && this.LJFF == c56890MUk.LJFF;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final int hashCode() {
        int hashCode;
        int LJ = C79062V1e.LJ(this.LIZJ, ((this.LIZ.hashCode() * 31) + this.LIZIZ) * 31, 31);
        String str = this.LIZLLL;
        if (str == null) {
            hashCode = 0;
        } else {
            hashCode = str.hashCode();
        }
        int LJ2 = C79062V1e.LJ(this.LJ, (LJ + hashCode) * 31, 31);
        boolean z = this.LJFF;
        int i = z;
        if (z != 0) {
            i = 1;
        }
        return LJ2 + i;
    }

    public final String toString() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("NoticeTemplateBindData(notice=");
        LIZ.append(this.LIZ);
        LIZ.append(", clientOrder=");
        LIZ.append(this.LIZIZ);
        LIZ.append(", timelineType=");
        LIZ.append(this.LIZJ);
        LIZ.append(", tabName=");
        LIZ.append(this.LIZLLL);
        LIZ.append(", enterFrom=");
        LIZ.append(this.LJ);
        LIZ.append(", isSecondPage=");
        return C48339Iy7.LIZJ(LIZ, this.LJFF, ')', LIZ);
    }

    public C56890MUk(MusNotice musNotice, int i, String timelineType, String str, String str2, boolean z) {
        o.LJIIIZ(timelineType, "timelineType");
        this.LIZ = musNotice;
        this.LIZIZ = i;
        this.LIZJ = timelineType;
        this.LIZLLL = str;
        this.LJ = str2;
        this.LJFF = z;
    }
}
