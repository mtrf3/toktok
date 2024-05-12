package X;

import com.ss.android.ugc.aweme.ecommerce.base.pdp.repository.dto.ModelCard;
import com.ss.android.ugc.aweme.ecommerce.service.vo.Image;
import kotlin.jvm.internal.o;

/* renamed from: X.Aqr, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C27505Aqr {
    public final ModelCard LIZ;
    public final String LIZIZ;
    public final String LIZJ;
    public final Image LIZLLL;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C27505Aqr)) {
            return false;
        }
        C27505Aqr c27505Aqr = (C27505Aqr) obj;
        return o.LJ(this.LIZ, c27505Aqr.LIZ) && o.LJ(this.LIZIZ, c27505Aqr.LIZIZ) && o.LJ(this.LIZJ, c27505Aqr.LIZJ) && o.LJ(this.LIZLLL, c27505Aqr.LIZLLL);
    }

    public final int hashCode() {
        ModelCard modelCard = this.LIZ;
        int hashCode = (modelCard == null ? 0 : modelCard.hashCode()) * 31;
        String str = this.LIZIZ;
        int hashCode2 = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.LIZJ;
        int hashCode3 = (hashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
        Image image = this.LIZLLL;
        return hashCode3 + (image != null ? image.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("TTFPdpSizeGuideVO(modelCard=");
        LIZ.append(this.LIZ);
        LIZ.append(", sizeGuideSchema=");
        LIZ.append(this.LIZIZ);
        LIZ.append(", sizeGuideTitle=");
        LIZ.append(this.LIZJ);
        LIZ.append(", originSizeGuideImage=");
        LIZ.append(this.LIZLLL);
        LIZ.append(')');
        return X1D.LIZIZ(LIZ);
    }

    public C27505Aqr(ModelCard modelCard, String str, String str2, Image image) {
        this.LIZ = modelCard;
        this.LIZIZ = str;
        this.LIZJ = str2;
        this.LIZLLL = image;
    }
}
