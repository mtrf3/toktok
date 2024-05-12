package X;

import android.os.Parcel;
import android.os.Parcelable;
import com.ss.android.ugc.aweme.ecommerce.service.vo.Image;
import com.ss.android.ugc.aweme.ecommercebase.view.PromotionLogo;
import kotlin.jvm.internal.o;

/* renamed from: X.RbK, reason: case insensitive filesystem */
/* loaded from: classes13.dex */
public final class C69858RbK implements Parcelable.Creator<PromotionLogo> {
    @Override // android.os.Parcelable.Creator
    public final PromotionLogo createFromParcel(Parcel parcel) {
        Image createFromParcel;
        o.LJIIIZ(parcel, "parcel");
        Image image = null;
        if (parcel.readInt() == 0) {
            createFromParcel = null;
        } else {
            createFromParcel = Image.CREATOR.createFromParcel(parcel);
        }
        Image image2 = createFromParcel;
        if (parcel.readInt() != 0) {
            image = Image.CREATOR.createFromParcel(parcel);
        }
        return new PromotionLogo(image2, image, parcel.readString(), parcel.readString());
    }

    @Override // android.os.Parcelable.Creator
    public final PromotionLogo[] newArray(int i) {
        return new PromotionLogo[i];
    }
}
