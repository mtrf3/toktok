package X;

import com.ss.android.ugc.aweme.ecommerce.service.vo.Image;
import kotlin.jvm.internal.o;

/* renamed from: X.Rh6, reason: case insensitive filesystem */
/* loaded from: classes13.dex */
public final class C70216Rh6 {
    public final String LIZ;
    public final String LIZIZ;
    public final Image LIZJ;
    public final boolean LIZLLL;
    public boolean LJ;
    public boolean LJFF;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C70216Rh6)) {
            return false;
        }
        C70216Rh6 c70216Rh6 = (C70216Rh6) obj;
        return o.LJ(this.LIZ, c70216Rh6.LIZ) && o.LJ(this.LIZIZ, c70216Rh6.LIZIZ) && o.LJ(this.LIZJ, c70216Rh6.LIZJ) && this.LIZLLL == c70216Rh6.LIZLLL;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final int hashCode() {
        int hashCode;
        int LJ = C79062V1e.LJ(this.LIZIZ, this.LIZ.hashCode() * 31, 31);
        Image image = this.LIZJ;
        if (image == null) {
            hashCode = 0;
        } else {
            hashCode = image.hashCode();
        }
        int i = (LJ + hashCode) * 31;
        boolean z = this.LIZLLL;
        int i2 = z;
        if (z != 0) {
            i2 = 1;
        }
        return i + i2;
    }

    public final String toString() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("ItemViewInfo(id=");
        LIZ.append(this.LIZ);
        LIZ.append(", text=");
        LIZ.append(this.LIZIZ);
        LIZ.append(", image=");
        LIZ.append(this.LIZJ);
        LIZ.append(", isSkc=");
        return C48339Iy7.LIZJ(LIZ, this.LIZLLL, ')', LIZ);
    }

    public C70216Rh6(String id, String text, Image image, boolean z) {
        o.LJIIIZ(id, "id");
        o.LJIIIZ(text, "text");
        this.LIZ = id;
        this.LIZIZ = text;
        this.LIZJ = image;
        this.LIZLLL = z;
        this.LJ = true;
    }
}
