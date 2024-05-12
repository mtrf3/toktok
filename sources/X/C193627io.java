package X;

import com.ss.android.ugc.aweme.feed.model.Aweme;
import java.util.List;
import kotlin.jvm.internal.o;

/* renamed from: X.7io, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C193627io {
    public final String LIZ;
    public final String LIZIZ;
    public final String LIZJ;
    public final String LIZLLL;
    public final long LJ;
    public final boolean LJFF;
    public final List<Aweme> LJI;
    public final String LJII;
    public final String LJIIIIZZ;
    public final String LJIIIZ;
    public final String LJIIJ;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C193627io)) {
            return false;
        }
        C193627io c193627io = (C193627io) obj;
        return o.LJ(this.LIZ, c193627io.LIZ) && o.LJ(this.LIZIZ, c193627io.LIZIZ) && o.LJ(this.LIZJ, c193627io.LIZJ) && o.LJ(this.LIZLLL, c193627io.LIZLLL) && this.LJ == c193627io.LJ && this.LJFF == c193627io.LJFF && o.LJ(this.LJI, c193627io.LJI) && o.LJ(this.LJII, c193627io.LJII) && o.LJ(this.LJIIIIZZ, c193627io.LJIIIIZZ) && o.LJ(this.LJIIIZ, c193627io.LJIIIZ) && o.LJ(this.LJIIJ, c193627io.LJIIJ);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final int hashCode() {
        int hashCode;
        int hashCode2;
        int hashCode3;
        int hashCode4;
        int LIZJ = JBR.LIZJ(this.LJ, C79062V1e.LJ(this.LIZLLL, C79062V1e.LJ(this.LIZJ, C79062V1e.LJ(this.LIZIZ, this.LIZ.hashCode() * 31, 31), 31), 31), 31);
        boolean z = this.LJFF;
        int i = z;
        if (z != 0) {
            i = 1;
        }
        int i2 = (LIZJ + i) * 31;
        List<Aweme> list = this.LJI;
        int i3 = 0;
        if (list == null) {
            hashCode = 0;
        } else {
            hashCode = list.hashCode();
        }
        int i4 = (i2 + hashCode) * 31;
        String str = this.LJII;
        if (str == null) {
            hashCode2 = 0;
        } else {
            hashCode2 = str.hashCode();
        }
        int i5 = (i4 + hashCode2) * 31;
        String str2 = this.LJIIIIZZ;
        if (str2 == null) {
            hashCode3 = 0;
        } else {
            hashCode3 = str2.hashCode();
        }
        int i6 = (i5 + hashCode3) * 31;
        String str3 = this.LJIIIZ;
        if (str3 == null) {
            hashCode4 = 0;
        } else {
            hashCode4 = str3.hashCode();
        }
        int i7 = (i6 + hashCode4) * 31;
        String str4 = this.LJIIJ;
        if (str4 != null) {
            i3 = str4.hashCode();
        }
        return i7 + i3;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("VideoCollectionShareDetail(id=");
        sb.append(this.LIZ);
        sb.append(", uid=");
        sb.append(this.LIZIZ);
        sb.append(", name=");
        sb.append(this.LIZJ);
        sb.append(", authorName=");
        sb.append(this.LIZLLL);
        sb.append(", total=");
        sb.append(this.LJ);
        sb.append(", isPublic=");
        sb.append(this.LJFF);
        sb.append(", content=");
        sb.append(this.LJI);
        sb.append(", enterFrom=");
        sb.append(this.LJII);
        sb.append(", shareUrl=");
        sb.append(this.LJIIIIZZ);
        sb.append(", shareDesc=");
        sb.append(this.LJIIIZ);
        sb.append(", shareTitle=");
        return C07670Rv.LIZIZ(sb, this.LJIIJ, ')');
    }

    /* JADX WARN: Multi-variable type inference failed */
    public C193627io(String str, String str2, String str3, String str4, long j, boolean z, List<? extends Aweme> list, String str5, String str6, String str7, String str8) {
        this.LIZ = str;
        this.LIZIZ = str2;
        this.LIZJ = str3;
        this.LIZLLL = str4;
        this.LJ = j;
        this.LJFF = z;
        this.LJI = list;
        this.LJII = str5;
        this.LJIIIIZZ = str6;
        this.LJIIIZ = str7;
        this.LJIIJ = str8;
    }
}
