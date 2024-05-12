package X;

import com.ss.android.ugc.aweme.ecommerce.base.pdp.repository.dto.FlashSaleReminderButton;
import com.ss.android.ugc.aweme.ecommerce.service.vo.Image;
import kotlin.jvm.internal.o;

/* loaded from: classes13.dex */
public final class RV8 {
    public final String LIZ;
    public final String LIZIZ;
    public final String LIZJ;
    public final String LIZLLL;
    public final FlashSaleReminderButton LJ;
    public final Image LJFF;
    public final String LJI;
    public final Image LJII;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof RV8)) {
            return false;
        }
        RV8 rv8 = (RV8) obj;
        return o.LJ(this.LIZ, rv8.LIZ) && o.LJ(this.LIZIZ, rv8.LIZIZ) && o.LJ(this.LIZJ, rv8.LIZJ) && o.LJ(this.LIZLLL, rv8.LIZLLL) && o.LJ(this.LJ, rv8.LJ) && o.LJ(this.LJFF, rv8.LJFF) && o.LJ(this.LJI, rv8.LJI) && o.LJ(this.LJII, rv8.LJII);
    }

    public final int hashCode() {
        String str = this.LIZ;
        int hashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.LIZIZ;
        int hashCode2 = (hashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.LIZJ;
        int hashCode3 = (hashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.LIZLLL;
        int hashCode4 = (hashCode3 + (str4 == null ? 0 : str4.hashCode())) * 31;
        FlashSaleReminderButton flashSaleReminderButton = this.LJ;
        int hashCode5 = (hashCode4 + (flashSaleReminderButton == null ? 0 : flashSaleReminderButton.hashCode())) * 31;
        Image image = this.LJFF;
        int hashCode6 = (hashCode5 + (image == null ? 0 : image.hashCode())) * 31;
        String str5 = this.LJI;
        int hashCode7 = (hashCode6 + (str5 == null ? 0 : str5.hashCode())) * 31;
        Image image2 = this.LJII;
        return hashCode7 + (image2 != null ? image2.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("FlashSaleReminderVO(productID=");
        LIZ.append(this.LIZ);
        LIZ.append(", startTime=");
        LIZ.append(this.LIZIZ);
        LIZ.append(", countdown=");
        LIZ.append(this.LIZJ);
        LIZ.append(", endTime=");
        LIZ.append(this.LIZLLL);
        LIZ.append(", remindButton=");
        LIZ.append(this.LJ);
        LIZ.append(", bgImage=");
        LIZ.append(this.LJFF);
        LIZ.append(", price=");
        LIZ.append(this.LJI);
        LIZ.append(", tagImage=");
        LIZ.append(this.LJII);
        LIZ.append(')');
        return X1D.LIZIZ(LIZ);
    }

    public RV8(String str, String str2, String str3, String str4, FlashSaleReminderButton flashSaleReminderButton, Image image, String str5, Image image2) {
        this.LIZ = str;
        this.LIZIZ = str2;
        this.LIZJ = str3;
        this.LIZLLL = str4;
        this.LJ = flashSaleReminderButton;
        this.LJFF = image;
        this.LJI = str5;
        this.LJII = image2;
    }
}
