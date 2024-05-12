package X;

import com.ss.android.ugc.aweme.feed.model.CardStruct;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.o;

/* renamed from: X.JoZ, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C50295JoZ {
    public boolean LIZ;
    public final String LIZIZ;
    public String LIZJ;
    public final List<String> LIZLLL;
    public final List<String> LJ;
    public final String LJFF;
    public final String LJI;
    public final List<String> LJII;
    public final List<String> LJIIIIZZ;
    public final List<String> LJIIIZ;
    public long LJIIJ;
    public final long LJIIJJI;
    public long LJIIL;
    public final long LJIILIIL;
    public final long LJIILJJIL;
    public final long LJIILL;
    public final long LJIILLIIL;
    public final long LJIIZILJ;

    public C50295JoZ() {
        this(null);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C50295JoZ)) {
            return false;
        }
        C50295JoZ c50295JoZ = (C50295JoZ) obj;
        return this.LIZ == c50295JoZ.LIZ && o.LJ(this.LIZIZ, c50295JoZ.LIZIZ) && o.LJ(this.LIZJ, c50295JoZ.LIZJ) && o.LJ(this.LIZLLL, c50295JoZ.LIZLLL) && o.LJ(this.LJ, c50295JoZ.LJ) && o.LJ(this.LJFF, c50295JoZ.LJFF) && o.LJ(this.LJI, c50295JoZ.LJI) && o.LJ(this.LJII, c50295JoZ.LJII) && o.LJ(this.LJIIIIZZ, c50295JoZ.LJIIIIZZ) && o.LJ(this.LJIIIZ, c50295JoZ.LJIIIZ) && this.LJIIJ == c50295JoZ.LJIIJ && this.LJIIJJI == c50295JoZ.LJIIJJI && this.LJIIL == c50295JoZ.LJIIL && this.LJIILIIL == c50295JoZ.LJIILIIL && this.LJIILJJIL == c50295JoZ.LJIILJJIL && this.LJIILL == c50295JoZ.LJIILL && this.LJIILLIIL == c50295JoZ.LJIILLIIL && this.LJIIZILJ == c50295JoZ.LJIIZILJ;
    }

    public final String toString() {
        return "EcMaskedSearchMobData(masked_search=" + this.LIZ + ", comment_panel_is_opened=" + this.LIZIZ + ", masked_default_keywords=" + this.LIZJ + ", masked_comment_named_entity_search_keywords=" + this.LIZLLL + ", masked_recom_keywords=" + this.LJ + ", masked_comment_related_search_keywords=" + this.LJFF + ", masked_feed_bar_keywords=" + this.LJI + ", masked_rs_keywords=" + this.LJII + ", masked_rs_keywords_mob=" + this.LJIIIIZZ + ", masked_cs_keywords=" + this.LJIIIZ + ", masked_default_keywords_time=" + this.LJIIJ + ", masked_comment_named_entity_search_keywords_time=" + this.LJIIJJI + ", masked_recom_keywords_time=" + this.LJIIL + ", masked_comment_related_search_keywords_time=" + this.LJIILIIL + ", masked_feed_bar_keywords_time=" + this.LJIILJJIL + ", masked_rs_keywords_time=" + this.LJIILL + ", masked_rs_keywords_mob_time=" + this.LJIILLIIL + ", masked_cs_keywords_time=" + this.LJIIZILJ + ')';
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v1, types: [int] */
    /* JADX WARN: Type inference failed for: r0v27 */
    /* JADX WARN: Type inference failed for: r0v28 */
    public final int hashCode() {
        int hashCode;
        int hashCode2;
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
        int LIZIZ = AnonymousClass391.LIZIZ(this.LJ, AnonymousClass391.LIZIZ(this.LIZLLL, (LJ + hashCode) * 31, 31), 31);
        String str2 = this.LJFF;
        if (str2 == null) {
            hashCode2 = 0;
        } else {
            hashCode2 = str2.hashCode();
        }
        int i2 = (LIZIZ + hashCode2) * 31;
        String str3 = this.LJI;
        if (str3 != null) {
            i = str3.hashCode();
        }
        return C16880lQ.LLJIJIL(this.LJIIZILJ) + JBR.LIZJ(this.LJIILLIIL, JBR.LIZJ(this.LJIILL, JBR.LIZJ(this.LJIILJJIL, JBR.LIZJ(this.LJIILIIL, JBR.LIZJ(this.LJIIL, JBR.LIZJ(this.LJIIJJI, JBR.LIZJ(this.LJIIJ, AnonymousClass391.LIZIZ(this.LJIIIZ, AnonymousClass391.LIZIZ(this.LJIIIIZZ, AnonymousClass391.LIZIZ(this.LJII, (i2 + i) * 31, 31), 31), 31), 31), 31), 31), 31), 31), 31), 31);
    }

    public C50295JoZ(Object obj) {
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        ArrayList arrayList3 = new ArrayList();
        ArrayList arrayList4 = new ArrayList();
        ArrayList arrayList5 = new ArrayList();
        this.LIZ = false;
        this.LIZIZ = CardStruct.IStatusCode.DEFAULT;
        this.LIZJ = "";
        this.LIZLLL = arrayList;
        this.LJ = arrayList2;
        this.LJFF = "";
        this.LJI = "";
        this.LJII = arrayList3;
        this.LJIIIIZZ = arrayList4;
        this.LJIIIZ = arrayList5;
        this.LJIIJ = 0L;
        this.LJIIJJI = 0L;
        this.LJIIL = 0L;
        this.LJIILIIL = 0L;
        this.LJIILJJIL = 0L;
        this.LJIILL = 0L;
        this.LJIILLIIL = 0L;
        this.LJIIZILJ = 0L;
    }
}
