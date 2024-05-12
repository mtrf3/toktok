package X;

import android.os.Parcel;
import android.os.Parcelable;
import com.ss.android.ugc.aweme.ecommerce.base.pdp.repository.dto.ProductPrice;
import com.ss.android.ugc.aweme.ecommerce.base.pdp.repository.dto.PromotionLogo;
import com.ss.android.ugc.aweme.ecommerce.base.pdpv2.vo.ProductInfoBizData;
import kotlin.jvm.internal.o;

/* renamed from: X.AuI, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C27718AuI implements Parcelable.Creator<ProductInfoBizData> {
    @Override // android.os.Parcelable.Creator
    public final ProductInfoBizData createFromParcel(Parcel parcel) {
        ProductPrice createFromParcel;
        Integer valueOf;
        Float valueOf2;
        PromotionLogo createFromParcel2;
        boolean z;
        Boolean valueOf3;
        Integer valueOf4;
        o.LJIIIZ(parcel, "parcel");
        String readString = parcel.readString();
        Integer num = null;
        if (parcel.readInt() == 0) {
            createFromParcel = null;
        } else {
            createFromParcel = ProductPrice.CREATOR.createFromParcel(parcel);
        }
        ProductPrice productPrice = createFromParcel;
        if (parcel.readInt() == 0) {
            valueOf = null;
        } else {
            valueOf = Integer.valueOf(parcel.readInt());
        }
        if (parcel.readInt() == 0) {
            valueOf2 = null;
        } else {
            valueOf2 = Float.valueOf(parcel.readFloat());
        }
        if (parcel.readInt() == 0) {
            createFromParcel2 = null;
        } else {
            createFromParcel2 = PromotionLogo.CREATOR.createFromParcel(parcel);
        }
        PromotionLogo promotionLogo = createFromParcel2;
        if (parcel.readInt() == 0) {
            valueOf3 = null;
        } else {
            if (parcel.readInt() != 0) {
                z = true;
            } else {
                z = false;
            }
            valueOf3 = Boolean.valueOf(z);
        }
        if (parcel.readInt() == 0) {
            valueOf4 = null;
        } else {
            valueOf4 = Integer.valueOf(parcel.readInt());
        }
        if (parcel.readInt() != 0) {
            num = Integer.valueOf(parcel.readInt());
        }
        return new ProductInfoBizData(readString, productPrice, valueOf, valueOf2, promotionLogo, valueOf3, valueOf4, num);
    }

    @Override // android.os.Parcelable.Creator
    public final ProductInfoBizData[] newArray(int i) {
        return new ProductInfoBizData[i];
    }
}
