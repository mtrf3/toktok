package X;

import com.ss.android.ugc.aweme.feed.model.CardStruct;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.o;

/* renamed from: X.JoY, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C50294JoY {
    public boolean LIZ;
    public String LIZIZ;
    public String LIZJ;
    public final List<String> LIZLLL;
    public final List<String> LJ;
    public final List<String> LJFF;
    public String LJI;
    public String LJII;
    public String LJIIIIZZ;
    public final List<String> LJIIIZ;
    public List<String> LJIIJ;
    public final List<String> LJIIJJI;
    public long LJIIL;
    public long LJIILIIL;
    public long LJIILJJIL;
    public long LJIILL;
    public long LJIILLIIL;
    public long LJIIZILJ;
    public long LJIJ;
    public long LJIJI;
    public long LJIJJ;

    public C50294JoY() {
        this(null);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C50294JoY)) {
            return false;
        }
        C50294JoY c50294JoY = (C50294JoY) obj;
        return this.LIZ == c50294JoY.LIZ && o.LJ(this.LIZIZ, c50294JoY.LIZIZ) && o.LJ(this.LIZJ, c50294JoY.LIZJ) && o.LJ(this.LIZLLL, c50294JoY.LIZLLL) && o.LJ(this.LJ, c50294JoY.LJ) && o.LJ(this.LJFF, c50294JoY.LJFF) && o.LJ(this.LJI, c50294JoY.LJI) && o.LJ(this.LJII, c50294JoY.LJII) && o.LJ(this.LJIIIIZZ, c50294JoY.LJIIIIZZ) && o.LJ(this.LJIIIZ, c50294JoY.LJIIIZ) && o.LJ(this.LJIIJ, c50294JoY.LJIIJ) && o.LJ(this.LJIIJJI, c50294JoY.LJIIJJI) && this.LJIIL == c50294JoY.LJIIL && this.LJIILIIL == c50294JoY.LJIILIIL && this.LJIILJJIL == c50294JoY.LJIILJJIL && this.LJIILL == c50294JoY.LJIILL && this.LJIILLIIL == c50294JoY.LJIILLIIL && this.LJIIZILJ == c50294JoY.LJIIZILJ && this.LJIJ == c50294JoY.LJIJ && this.LJIJI == c50294JoY.LJIJI && this.LJIJJ == c50294JoY.LJIJJ;
    }

    public final String toString() {
        return "MaskedSearchMobData(masked_search=" + this.LIZ + ", comment_panel_is_opened=" + this.LIZIZ + ", masked_default_keywords=" + this.LIZJ + ", masked_comment_named_entity_search_keywords=" + this.LIZLLL + ", masked_recom_keywords=" + this.LJ + ", masked_masked_under_bar_words=" + this.LJFF + ", masked_recom_request_id=" + this.LJI + ", masked_comment_related_search_keywords=" + this.LJII + ", masked_feed_bar_keywords=" + this.LJIIIIZZ + ", masked_rs_keywords=" + this.LJIIIZ + ", masked_rs_keywords_mob=" + this.LJIIJ + ", masked_cs_keywords=" + this.LJIIJJI + ", masked_default_keywords_time=" + this.LJIIL + ", masked_comment_named_entity_search_keywords_time=" + this.LJIILIIL + ", masked_recom_keywords_time=" + this.LJIILJJIL + ", masked_under_bar_words_time=" + this.LJIILL + ", masked_comment_related_search_keywords_time=" + this.LJIILLIIL + ", masked_feed_bar_keywords_time=" + this.LJIIZILJ + ", masked_rs_keywords_time=" + this.LJIJ + ", masked_rs_keywords_mob_time=" + this.LJIJI + ", masked_cs_keywords_time=" + this.LJIJJ + ')';
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v1, types: [int] */
    /* JADX WARN: Type inference failed for: r0v33 */
    /* JADX WARN: Type inference failed for: r0v34 */
    public final int hashCode() {
        int hashCode;
        int hashCode2;
        int hashCode3;
        boolean z = this.LIZ;
        ?? r0 = z;
        if (z) {
            r0 = 1;
        }
        int LJ = C79062V1e.LJ(this.LIZIZ, r0 * 31, 31);
        String str = this.LIZJ;
        int i = 0;
        if (str == null) {
            hashCode = 0;
        } else {
            hashCode = str.hashCode();
        }
        int LIZIZ = AnonymousClass391.LIZIZ(this.LJFF, AnonymousClass391.LIZIZ(this.LJ, AnonymousClass391.LIZIZ(this.LIZLLL, (LJ + hashCode) * 31, 31), 31), 31);
        String str2 = this.LJI;
        if (str2 == null) {
            hashCode2 = 0;
        } else {
            hashCode2 = str2.hashCode();
        }
        int i2 = (LIZIZ + hashCode2) * 31;
        String str3 = this.LJII;
        if (str3 == null) {
            hashCode3 = 0;
        } else {
            hashCode3 = str3.hashCode();
        }
        int i3 = (i2 + hashCode3) * 31;
        String str4 = this.LJIIIIZZ;
        if (str4 != null) {
            i = str4.hashCode();
        }
        return C16880lQ.LLJIJIL(this.LJIJJ) + JBR.LIZJ(this.LJIJI, JBR.LIZJ(this.LJIJ, JBR.LIZJ(this.LJIIZILJ, JBR.LIZJ(this.LJIILLIIL, JBR.LIZJ(this.LJIILL, JBR.LIZJ(this.LJIILJJIL, JBR.LIZJ(this.LJIILIIL, JBR.LIZJ(this.LJIIL, AnonymousClass391.LIZIZ(this.LJIIJJI, AnonymousClass391.LIZIZ(this.LJIIJ, AnonymousClass391.LIZIZ(this.LJIIIZ, (i3 + i) * 31, 31), 31), 31), 31), 31), 31), 31), 31), 31), 31), 31);
    }

    public C50294JoY(Object obj) {
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        ArrayList arrayList3 = new ArrayList();
        ArrayList arrayList4 = new ArrayList();
        ArrayList arrayList5 = new ArrayList();
        ArrayList arrayList6 = new ArrayList();
        this.LIZ = false;
        this.LIZIZ = CardStruct.IStatusCode.DEFAULT;
        this.LIZJ = "";
        this.LIZLLL = arrayList;
        this.LJ = arrayList2;
        this.LJFF = arrayList3;
        this.LJI = "";
        this.LJII = "";
        this.LJIIIIZZ = "";
        this.LJIIIZ = arrayList4;
        this.LJIIJ = arrayList5;
        this.LJIIJJI = arrayList6;
        this.LJIIL = 0L;
        this.LJIILIIL = 0L;
        this.LJIILJJIL = 0L;
        this.LJIILL = 0L;
        this.LJIILLIIL = 0L;
        this.LJIIZILJ = 0L;
        this.LJIJ = 0L;
        this.LJIJI = 0L;
        this.LJIJJ = 0L;
    }
}
