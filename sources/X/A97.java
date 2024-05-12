package X;

import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.profile.model.User;
import java.util.List;
import kotlin.jvm.internal.o;

/* loaded from: classes5.dex */
public final class A97 {
    public final long LIZ;
    public final String LIZIZ;
    public final String LIZJ;
    public final User LIZLLL;
    public final String LJ;
    public final List<Aweme> LJFF;
    public final String LJI;
    public final String LJII;
    public final boolean LJIIIIZZ;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof A97)) {
            return false;
        }
        A97 a97 = (A97) obj;
        return this.LIZ == a97.LIZ && o.LJ(this.LIZIZ, a97.LIZIZ) && o.LJ(this.LIZJ, a97.LIZJ) && o.LJ(this.LIZLLL, a97.LIZLLL) && o.LJ(this.LJ, a97.LJ) && o.LJ(this.LJFF, a97.LJFF) && o.LJ(this.LJI, a97.LJI) && o.LJ(this.LJII, a97.LJII) && this.LJIIIIZZ == a97.LJIIIIZZ;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final int hashCode() {
        int hashCode;
        int hashCode2;
        int LJ = C79062V1e.LJ(this.LIZJ, C79062V1e.LJ(this.LIZIZ, C16880lQ.LLJIJIL(this.LIZ) * 31, 31), 31);
        User user = this.LIZLLL;
        int i = 0;
        if (user == null) {
            hashCode = 0;
        } else {
            hashCode = user.hashCode();
        }
        int LIZIZ = AnonymousClass391.LIZIZ(this.LJFF, C79062V1e.LJ(this.LJ, (LJ + hashCode) * 31, 31), 31);
        String str = this.LJI;
        if (str == null) {
            hashCode2 = 0;
        } else {
            hashCode2 = str.hashCode();
        }
        int i2 = (LIZIZ + hashCode2) * 31;
        String str2 = this.LJII;
        if (str2 != null) {
            i = str2.hashCode();
        }
        int i3 = (i2 + i) * 31;
        boolean z = this.LJIIIIZZ;
        int i4 = z;
        if (z != 0) {
            i4 = 1;
        }
        return i3 + i4;
    }

    public final String toString() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("PaidContentSeriesParams(collectionId=");
        LIZ.append(this.LIZ);
        LIZ.append(", title=");
        LIZ.append(this.LIZIZ);
        LIZ.append(", subtitle=");
        LIZ.append(this.LIZJ);
        LIZ.append(", author=");
        LIZ.append(this.LIZLLL);
        LIZ.append(", deeplink=");
        LIZ.append(this.LJ);
        LIZ.append(", awemeList=");
        LIZ.append(this.LJFF);
        LIZ.append(", enterFrom=");
        LIZ.append(this.LJI);
        LIZ.append(", collectionCover=");
        LIZ.append(this.LJII);
        LIZ.append(", ifPurchase=");
        return C48339Iy7.LIZJ(LIZ, this.LJIIIIZZ, ')', LIZ);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public A97(long j, String title, String subtitle, User user, String str, List<? extends Aweme> list, String str2, String str3, boolean z) {
        o.LJIIIZ(title, "title");
        o.LJIIIZ(subtitle, "subtitle");
        this.LIZ = j;
        this.LIZIZ = title;
        this.LIZJ = subtitle;
        this.LIZLLL = user;
        this.LJ = str;
        this.LJFF = list;
        this.LJI = str2;
        this.LJII = str3;
        this.LJIIIIZZ = z;
    }
}
