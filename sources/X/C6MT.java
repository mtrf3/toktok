package X;

import com.ss.android.ugc.gamora.editor.recommendeffect.net.RecommendEffectItem;
import java.util.List;
import kotlin.jvm.internal.o;

/* renamed from: X.6MT, reason: invalid class name */
/* loaded from: classes3.dex */
public final class C6MT {
    public final boolean LIZ;
    public final Integer LIZIZ;
    public final C08630Vn<Integer> LIZJ;
    public final List<RecommendEffectItem> LIZLLL;
    public final OSZ<Integer, List<RecommendEffectItem>> LJ;
    public final float LJFF;
    public final boolean LJI;
    public final int LJII;
    public final C08630Vn<Boolean> LJIIIIZZ;
    public final C08630Vn<Boolean> LJIIIZ;
    public final OSZ<Boolean, Boolean> LJIIJ;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C6MT)) {
            return false;
        }
        C6MT c6mt = (C6MT) obj;
        return this.LIZ == c6mt.LIZ && o.LJ(this.LIZIZ, c6mt.LIZIZ) && o.LJ(this.LIZJ, c6mt.LIZJ) && o.LJ(this.LIZLLL, c6mt.LIZLLL) && o.LJ(this.LJ, c6mt.LJ) && Float.compare(this.LJFF, c6mt.LJFF) == 0 && this.LJI == c6mt.LJI && this.LJII == c6mt.LJII && o.LJ(this.LJIIIIZZ, c6mt.LJIIIIZZ) && o.LJ(this.LJIIIZ, c6mt.LJIIIZ) && o.LJ(this.LJIIJ, c6mt.LJIIJ);
    }

    public final String toString() {
        return "RecommendEffectStates(show=" + this.LIZ + ", selectEffectPos=" + this.LIZIZ + ", flingToNextPos=" + this.LIZJ + ", recommendEffectItemList=" + this.LIZLLL + ", insertEffectItemList=" + this.LJ + ", changeTopMarginForBottomUI=" + this.LJFF + ", loadingUIState=" + this.LJI + ", scrollDistanceX=" + this.LJII + ", isScrollEnd=" + this.LJIIIIZZ + ", showPlaceHolder=" + this.LJIIIZ + ", showControlBar=" + this.LJIIJ + ')';
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v1, types: [int] */
    /* JADX WARN: Type inference failed for: r0v27 */
    /* JADX WARN: Type inference failed for: r0v28 */
    public final int hashCode() {
        int hashCode;
        int hashCode2;
        int hashCode3;
        int hashCode4;
        int hashCode5;
        boolean z = this.LIZ;
        int i = 1;
        ?? r0 = z;
        if (z) {
            r0 = 1;
        }
        int i2 = r0 * 31;
        Integer num = this.LIZIZ;
        int i3 = 0;
        if (num == null) {
            hashCode = 0;
        } else {
            hashCode = num.hashCode();
        }
        int i4 = (i2 + hashCode) * 31;
        C08630Vn<Integer> c08630Vn = this.LIZJ;
        if (c08630Vn == null) {
            hashCode2 = 0;
        } else {
            hashCode2 = c08630Vn.hashCode();
        }
        int LIZIZ = AnonymousClass391.LIZIZ(this.LIZLLL, (i4 + hashCode2) * 31, 31);
        OSZ<Integer, List<RecommendEffectItem>> osz = this.LJ;
        if (osz == null) {
            hashCode3 = 0;
        } else {
            hashCode3 = osz.hashCode();
        }
        int LIZIZ2 = C47959Irz.LIZIZ(this.LJFF, (LIZIZ + hashCode3) * 31, 31);
        if (!this.LJI) {
            i = 0;
        }
        int i5 = (((LIZIZ2 + i) * 31) + this.LJII) * 31;
        C08630Vn<Boolean> c08630Vn2 = this.LJIIIIZZ;
        if (c08630Vn2 == null) {
            hashCode4 = 0;
        } else {
            hashCode4 = c08630Vn2.hashCode();
        }
        int i6 = (i5 + hashCode4) * 31;
        C08630Vn<Boolean> c08630Vn3 = this.LJIIIZ;
        if (c08630Vn3 == null) {
            hashCode5 = 0;
        } else {
            hashCode5 = c08630Vn3.hashCode();
        }
        int i7 = (i6 + hashCode5) * 31;
        OSZ<Boolean, Boolean> osz2 = this.LJIIJ;
        if (osz2 != null) {
            i3 = osz2.hashCode();
        }
        return i7 + i3;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public C6MT(boolean z, Integer num, C08630Vn<Integer> c08630Vn, List<RecommendEffectItem> list, OSZ<Integer, ? extends List<RecommendEffectItem>> osz, float f, boolean z2, int i, C08630Vn<Boolean> c08630Vn2, C08630Vn<Boolean> c08630Vn3, OSZ<Boolean, Boolean> osz2) {
        this.LIZ = z;
        this.LIZIZ = num;
        this.LIZJ = c08630Vn;
        this.LIZLLL = list;
        this.LJ = osz;
        this.LJFF = f;
        this.LJI = z2;
        this.LJII = i;
        this.LJIIIIZZ = c08630Vn2;
        this.LJIIIZ = c08630Vn3;
        this.LJIIJ = osz2;
    }

    public static C6MT LIZ(C6MT c6mt, boolean z, Integer num, C08630Vn c08630Vn, List list, OSZ osz, float f, boolean z2, int i, C08630Vn c08630Vn2, C08630Vn c08630Vn3, OSZ osz2, int i2) {
        OSZ osz3 = osz2;
        C08630Vn c08630Vn4 = c08630Vn3;
        C08630Vn c08630Vn5 = c08630Vn2;
        int i3 = i;
        boolean z3 = z2;
        Integer num2 = num;
        boolean z4 = z;
        C08630Vn c08630Vn6 = c08630Vn;
        List recommendEffectItemList = list;
        OSZ osz4 = osz;
        float f2 = f;
        if ((i2 & 1) != 0) {
            z4 = c6mt.LIZ;
        }
        if ((i2 & 2) != 0) {
            num2 = c6mt.LIZIZ;
        }
        if ((i2 & 4) != 0) {
            c08630Vn6 = c6mt.LIZJ;
        }
        if ((i2 & 8) != 0) {
            recommendEffectItemList = c6mt.LIZLLL;
        }
        if ((i2 & 16) != 0) {
            osz4 = c6mt.LJ;
        }
        if ((i2 & 32) != 0) {
            f2 = c6mt.LJFF;
        }
        if ((i2 & 64) != 0) {
            z3 = c6mt.LJI;
        }
        if ((i2 & 128) != 0) {
            i3 = c6mt.LJII;
        }
        if ((i2 & 256) != 0) {
            c08630Vn5 = c6mt.LJIIIIZZ;
        }
        if ((i2 & 512) != 0) {
            c08630Vn4 = c6mt.LJIIIZ;
        }
        if ((i2 & 1024) != 0) {
            osz3 = c6mt.LJIIJ;
        }
        c6mt.getClass();
        o.LJIIIZ(recommendEffectItemList, "recommendEffectItemList");
        return new C6MT(z4, num2, c08630Vn6, recommendEffectItemList, osz4, f2, z3, i3, c08630Vn5, c08630Vn4, osz3);
    }
}
