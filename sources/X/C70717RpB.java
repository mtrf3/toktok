package X;

import com.ss.android.ugc.aweme.ecommerce.base.review.repo.dto.ReviewMedia;
import kotlin.jvm.internal.o;

/* renamed from: X.RpB, reason: case insensitive filesystem */
/* loaded from: classes13.dex */
public final class C70717RpB {
    public final ReviewMedia LIZ;
    public final C69698RXa LIZIZ;

    public C70717RpB() {
        this(null, null);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C70717RpB)) {
            return false;
        }
        C70717RpB c70717RpB = (C70717RpB) obj;
        return o.LJ(this.LIZ, c70717RpB.LIZ) && o.LJ(this.LIZIZ, c70717RpB.LIZIZ);
    }

    public final int hashCode() {
        ReviewMedia reviewMedia = this.LIZ;
        int hashCode = (reviewMedia == null ? 0 : reviewMedia.hashCode()) * 31;
        C69698RXa c69698RXa = this.LIZIZ;
        return hashCode + (c69698RXa != null ? c69698RXa.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("ReviewImageItem(media=");
        LIZ.append(this.LIZ);
        LIZ.append(", reviewItem=");
        LIZ.append(this.LIZIZ);
        LIZ.append(')');
        return X1D.LIZIZ(LIZ);
    }

    public C70717RpB(ReviewMedia reviewMedia, C69698RXa c69698RXa) {
        this.LIZ = reviewMedia;
        this.LIZIZ = c69698RXa;
    }
}
