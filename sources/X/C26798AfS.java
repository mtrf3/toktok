package X;

import com.ss.android.ugc.aweme.ecommerce.base.review.repo.dto.ReviewMedia;
import com.ss.android.ugc.aweme.ecommerce.service.vo.Image;
import kotlin.jvm.internal.o;

/* renamed from: X.AfS, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C26798AfS {
    public final Image LIZ;
    public final String LIZIZ;
    public final int LIZJ;
    public final boolean LIZLLL;
    public final Integer LJ;
    public final ReviewMedia LJFF;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C26798AfS)) {
            return false;
        }
        C26798AfS c26798AfS = (C26798AfS) obj;
        return o.LJ(this.LIZ, c26798AfS.LIZ) && o.LJ(this.LIZIZ, c26798AfS.LIZIZ) && this.LIZJ == c26798AfS.LIZJ && this.LIZLLL == c26798AfS.LIZLLL && o.LJ(this.LJ, c26798AfS.LJ) && o.LJ(this.LJFF, c26798AfS.LJFF);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final int hashCode() {
        Image image = this.LIZ;
        int hashCode = (image == null ? 0 : image.hashCode()) * 31;
        String str = this.LIZIZ;
        int hashCode2 = (((hashCode + (str == null ? 0 : str.hashCode())) * 31) + this.LIZJ) * 31;
        boolean z = this.LIZLLL;
        int i = z;
        if (z != 0) {
            i = 1;
        }
        int i2 = (hashCode2 + i) * 31;
        Integer num = this.LJ;
        int hashCode3 = (i2 + (num == null ? 0 : num.hashCode())) * 31;
        ReviewMedia reviewMedia = this.LJFF;
        return hashCode3 + (reviewMedia != null ? reviewMedia.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("PdpReviewImage(image=");
        LIZ.append(this.LIZ);
        LIZ.append(", reviewId=");
        LIZ.append(this.LIZIZ);
        LIZ.append(", index=");
        LIZ.append(this.LIZJ);
        LIZ.append(", isOwner=");
        LIZ.append(this.LIZLLL);
        LIZ.append(", rating=");
        LIZ.append(this.LJ);
        LIZ.append(", media=");
        LIZ.append(this.LJFF);
        LIZ.append(')');
        return X1D.LIZIZ(LIZ);
    }

    public C26798AfS(Image image, String str, int i, boolean z, Integer num, ReviewMedia reviewMedia) {
        this.LIZ = image;
        this.LIZIZ = str;
        this.LIZJ = i;
        this.LIZLLL = z;
        this.LJ = num;
        this.LJFF = reviewMedia;
    }
}
