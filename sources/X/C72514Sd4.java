package X;

import com.ss.android.ugc.aweme.notice.repo.list.bean.MusNotice;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.o;

/* renamed from: X.Sd4, reason: case insensitive filesystem */
/* loaded from: classes13.dex */
public final class C72514Sd4 {
    public final List<C72523SdD> LIZ;
    public final List<C72523SdD> LIZIZ;
    public final List<MusNotice> LIZJ;
    public boolean LIZLLL;
    public long LJ;
    public long LJFF;

    public C72514Sd4() {
        this(0);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C72514Sd4)) {
            return false;
        }
        C72514Sd4 c72514Sd4 = (C72514Sd4) obj;
        return o.LJ(this.LIZ, c72514Sd4.LIZ) && o.LJ(this.LIZIZ, c72514Sd4.LIZIZ) && o.LJ(this.LIZJ, c72514Sd4.LIZJ) && this.LIZLLL == c72514Sd4.LIZLLL && this.LJ == c72514Sd4.LJ && this.LJFF == c72514Sd4.LJFF;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final int hashCode() {
        int LIZIZ = AnonymousClass391.LIZIZ(this.LIZJ, AnonymousClass391.LIZIZ(this.LIZIZ, this.LIZ.hashCode() * 31, 31), 31);
        boolean z = this.LIZLLL;
        int i = z;
        if (z != 0) {
            i = 1;
        }
        return C16880lQ.LLJIJIL(this.LJFF) + JBR.LIZJ(this.LJ, (LIZIZ + i) * 31, 31);
    }

    public final String toString() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append('[');
        DIL.LIZIZ(this.LIZ, LIZ, ", ");
        DIL.LIZIZ(this.LIZIZ, LIZ, ", ");
        DIL.LIZIZ(this.LIZJ, LIZ, ", ");
        LIZ.append(this.LIZLLL);
        LIZ.append(", ");
        LIZ.append(this.LJ);
        LIZ.append(", ");
        return C47135Ieh.LIZIZ(LIZ, this.LJFF, ']', LIZ);
    }

    public C72514Sd4(int i) {
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        ArrayList arrayList3 = new ArrayList();
        this.LIZ = arrayList;
        this.LIZIZ = arrayList2;
        this.LIZJ = arrayList3;
        this.LIZLLL = false;
        this.LJ = 0L;
        this.LJFF = 0L;
    }
}
