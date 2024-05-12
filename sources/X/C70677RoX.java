package X;

import com.ss.android.ugc.aweme.ecommerce.base.review.repo.dto.ReviewItemStruct;
import com.ss.android.ugc.aweme.ecommerce.base.review.repo.dto.ShopReviewProductCard;
import defpackage.s0;
import kotlin.jvm.internal.o;

/* renamed from: X.RoX, reason: case insensitive filesystem */
/* loaded from: classes13.dex */
public final class C70677RoX extends AbstractC70686Rog {
    public final ReviewItemStruct LIZ;
    public final ShopReviewProductCard LIZIZ;
    public final String LIZJ;
    public final String LIZLLL;
    public final boolean LJ;
    public final boolean LJFF;
    public final boolean LJI;
    public final boolean LJII;
    public boolean LJIIIIZZ;
    public Integer LJIIIZ;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C70677RoX)) {
            return false;
        }
        C70677RoX c70677RoX = (C70677RoX) obj;
        return o.LJ(this.LIZ, c70677RoX.LIZ) && o.LJ(this.LIZIZ, c70677RoX.LIZIZ) && o.LJ(this.LIZJ, c70677RoX.LIZJ) && o.LJ(this.LIZLLL, c70677RoX.LIZLLL) && this.LJ == c70677RoX.LJ && this.LJFF == c70677RoX.LJFF && this.LJI == c70677RoX.LJI && this.LJII == c70677RoX.LJII && this.LJIIIIZZ == c70677RoX.LJIIIIZZ && o.LJ(this.LJIIIZ, c70677RoX.LJIIIZ);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final int hashCode() {
        int hashCode = this.LIZ.hashCode() * 31;
        ShopReviewProductCard shopReviewProductCard = this.LIZIZ;
        int hashCode2 = (hashCode + (shopReviewProductCard == null ? 0 : shopReviewProductCard.hashCode())) * 31;
        String str = this.LIZJ;
        int hashCode3 = (hashCode2 + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.LIZLLL;
        int hashCode4 = (hashCode3 + (str2 == null ? 0 : str2.hashCode())) * 31;
        boolean z = this.LJ;
        int i = z;
        if (z != 0) {
            i = 1;
        }
        int i2 = (hashCode4 + i) * 31;
        boolean z2 = this.LJFF;
        int i3 = z2;
        if (z2 != 0) {
            i3 = 1;
        }
        int i4 = (i2 + i3) * 31;
        boolean z3 = this.LJI;
        int i5 = z3;
        if (z3 != 0) {
            i5 = 1;
        }
        int i6 = (i4 + i5) * 31;
        boolean z4 = this.LJII;
        int i7 = z4;
        if (z4 != 0) {
            i7 = 1;
        }
        int i8 = (((i6 + i7) * 31) + (this.LJIIIIZZ ? 1 : 0)) * 31;
        Integer num = this.LJIIIZ;
        return i8 + (num != null ? num.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("ReviewCellVO(struct=");
        LIZ.append(this.LIZ);
        LIZ.append(", productCard=");
        LIZ.append(this.LIZIZ);
        LIZ.append(", daInfo=");
        LIZ.append(this.LIZJ);
        LIZ.append(", tipsText=");
        LIZ.append(this.LIZLLL);
        LIZ.append(", mainReviewExpand=");
        LIZ.append(this.LJ);
        LIZ.append(", appendReviewExpand=");
        LIZ.append(this.LJFF);
        LIZ.append(", sellerFistReplyExpand=");
        LIZ.append(this.LJI);
        LIZ.append(", sellerAppendReplyExpand=");
        LIZ.append(this.LJII);
        LIZ.append(", showDivider=");
        LIZ.append(this.LJIIIIZZ);
        LIZ.append(", marginTop=");
        return s0.LIZJ(LIZ, this.LJIIIZ, ')', LIZ);
    }

    public /* synthetic */ C70677RoX(ReviewItemStruct reviewItemStruct, ShopReviewProductCard shopReviewProductCard, String str, String str2, boolean z, int i) {
        this(reviewItemStruct, (i & 2) != 0 ? null : shopReviewProductCard, (i & 4) != 0 ? null : str, (i & 8) != 0 ? null : str2, false, false, false, false, (i & 256) != 0 ? true : z, null);
    }

    public static C70677RoX LIZ(C70677RoX c70677RoX, ReviewItemStruct reviewItemStruct, boolean z, boolean z2, boolean z3, boolean z4, int i) {
        ShopReviewProductCard shopReviewProductCard;
        String str;
        String str2;
        boolean z5;
        boolean z6 = z4;
        boolean z7 = z3;
        boolean z8 = z2;
        ReviewItemStruct struct = reviewItemStruct;
        boolean z9 = z;
        if ((i & 1) != 0) {
            struct = c70677RoX.LIZ;
        }
        Integer num = null;
        if ((i & 2) != 0) {
            shopReviewProductCard = c70677RoX.LIZIZ;
        } else {
            shopReviewProductCard = null;
        }
        if ((i & 4) != 0) {
            str = c70677RoX.LIZJ;
        } else {
            str = null;
        }
        if ((i & 8) != 0) {
            str2 = c70677RoX.LIZLLL;
        } else {
            str2 = null;
        }
        if ((i & 16) != 0) {
            z9 = c70677RoX.LJ;
        }
        if ((i & 32) != 0) {
            z8 = c70677RoX.LJFF;
        }
        if ((i & 64) != 0) {
            z7 = c70677RoX.LJI;
        }
        if ((i & 128) != 0) {
            z6 = c70677RoX.LJII;
        }
        if ((i & 256) != 0) {
            z5 = c70677RoX.LJIIIIZZ;
        } else {
            z5 = false;
        }
        if ((i & 512) != 0) {
            num = c70677RoX.LJIIIZ;
        }
        c70677RoX.getClass();
        o.LJIIIZ(struct, "struct");
        return new C70677RoX(struct, shopReviewProductCard, str, str2, z9, z8, z7, z6, z5, num);
    }

    public C70677RoX(ReviewItemStruct struct, ShopReviewProductCard shopReviewProductCard, String str, String str2, boolean z, boolean z2, boolean z3, boolean z4, boolean z5, Integer num) {
        o.LJIIIZ(struct, "struct");
        this.LIZ = struct;
        this.LIZIZ = shopReviewProductCard;
        this.LIZJ = str;
        this.LIZLLL = str2;
        this.LJ = z;
        this.LJFF = z2;
        this.LJI = z3;
        this.LJII = z4;
        this.LJIIIIZZ = z5;
        this.LJIIIZ = num;
    }
}
