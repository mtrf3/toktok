package X;

import android.os.Parcel;
import android.os.Parcelable;
import com.bytedance.android.livesdk.model.message.ext.PromotionView;
import com.ss.android.ugc.aweme.ecommerce.base.pdp.repository.dto.BuyButton;
import com.ss.android.ugc.aweme.ecommerce.base.pdp.repository.dto.PurchaseNotice;
import com.ss.android.ugc.aweme.ecommerce.base.sku.model.dto.AddToCartButton;
import com.ss.android.ugc.aweme.ecommerce.base.sku.model.dto.PreOrderInfo;
import com.ss.android.ugc.aweme.ecommerce.base.sku.model.dto.SkuItem;
import com.ss.android.ugc.aweme.ecommerce.base.sku.model.dto.SkuPrice;
import com.ss.android.ugc.aweme.ecommerce.base.sku.model.dto.SkuQuantityProperty;
import com.ss.android.ugc.aweme.ecommerce.base.sku.model.dto.SkuSaleProp;
import com.ss.android.ugc.aweme.ecommerce.base.sku.model.dto.SkuVoucher;
import java.util.ArrayList;
import kotlin.jvm.internal.o;

/* loaded from: classes13.dex */
public final class RWC implements Parcelable.Creator<SkuItem> {
    @Override // android.os.Parcelable.Creator
    public final SkuItem createFromParcel(Parcel parcel) {
        ArrayList arrayList;
        Integer valueOf;
        Integer valueOf2;
        SkuPrice createFromParcel;
        boolean z;
        Boolean valueOf3;
        SkuVoucher createFromParcel2;
        AddToCartButton createFromParcel3;
        PurchaseNotice createFromParcel4;
        Integer valueOf4;
        boolean z2;
        Boolean valueOf5;
        BuyButton createFromParcel5;
        SkuQuantityProperty createFromParcel6;
        Integer valueOf6;
        Integer valueOf7;
        PreOrderInfo createFromParcel7;
        Integer valueOf8;
        o.LJIIIZ(parcel, "parcel");
        String readString = parcel.readString();
        Integer num = null;
        if (parcel.readInt() == 0) {
            arrayList = null;
        } else {
            int readInt = parcel.readInt();
            arrayList = new ArrayList(readInt);
            int i = 0;
            while (i != readInt) {
                i = C279117r.LIZIZ(SkuSaleProp.CREATOR, parcel, arrayList, i, 1);
            }
        }
        String readString2 = parcel.readString();
        if (parcel.readInt() == 0) {
            valueOf = null;
        } else {
            valueOf = Integer.valueOf(parcel.readInt());
        }
        String readString3 = parcel.readString();
        if (parcel.readInt() == 0) {
            valueOf2 = null;
        } else {
            valueOf2 = Integer.valueOf(parcel.readInt());
        }
        if (parcel.readInt() == 0) {
            createFromParcel = null;
        } else {
            createFromParcel = SkuPrice.CREATOR.createFromParcel(parcel);
        }
        SkuPrice skuPrice = createFromParcel;
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
            createFromParcel2 = null;
        } else {
            createFromParcel2 = SkuVoucher.CREATOR.createFromParcel(parcel);
        }
        SkuVoucher skuVoucher = createFromParcel2;
        String readString4 = parcel.readString();
        if (parcel.readInt() == 0) {
            createFromParcel3 = null;
        } else {
            createFromParcel3 = AddToCartButton.CREATOR.createFromParcel(parcel);
        }
        AddToCartButton addToCartButton = createFromParcel3;
        if (parcel.readInt() == 0) {
            createFromParcel4 = null;
        } else {
            createFromParcel4 = PurchaseNotice.CREATOR.createFromParcel(parcel);
        }
        PurchaseNotice purchaseNotice = createFromParcel4;
        PromotionView promotionView = (PromotionView) parcel.readParcelable(SkuItem.class.getClassLoader());
        if (parcel.readInt() == 0) {
            valueOf4 = null;
        } else {
            valueOf4 = Integer.valueOf(parcel.readInt());
        }
        if (parcel.readInt() == 0) {
            valueOf5 = null;
        } else {
            if (parcel.readInt() != 0) {
                z2 = true;
            } else {
                z2 = false;
            }
            valueOf5 = Boolean.valueOf(z2);
        }
        if (parcel.readInt() == 0) {
            createFromParcel5 = null;
        } else {
            createFromParcel5 = BuyButton.CREATOR.createFromParcel(parcel);
        }
        BuyButton buyButton = createFromParcel5;
        if (parcel.readInt() == 0) {
            createFromParcel6 = null;
        } else {
            createFromParcel6 = SkuQuantityProperty.CREATOR.createFromParcel(parcel);
        }
        SkuQuantityProperty skuQuantityProperty = createFromParcel6;
        if (parcel.readInt() == 0) {
            valueOf6 = null;
        } else {
            valueOf6 = Integer.valueOf(parcel.readInt());
        }
        if (parcel.readInt() == 0) {
            valueOf7 = null;
        } else {
            valueOf7 = Integer.valueOf(parcel.readInt());
        }
        String readString5 = parcel.readString();
        if (parcel.readInt() == 0) {
            createFromParcel7 = null;
        } else {
            createFromParcel7 = PreOrderInfo.CREATOR.createFromParcel(parcel);
        }
        PreOrderInfo preOrderInfo = createFromParcel7;
        ArrayList<String> createStringArrayList = parcel.createStringArrayList();
        String readString6 = parcel.readString();
        if (parcel.readInt() == 0) {
            valueOf8 = null;
        } else {
            valueOf8 = Integer.valueOf(parcel.readInt());
        }
        if (parcel.readInt() != 0) {
            num = Integer.valueOf(parcel.readInt());
        }
        return new SkuItem(readString, arrayList, readString2, valueOf, readString3, valueOf2, skuPrice, valueOf3, skuVoucher, readString4, addToCartButton, purchaseNotice, promotionView, valueOf4, valueOf5, buyButton, skuQuantityProperty, valueOf6, valueOf7, readString5, preOrderInfo, createStringArrayList, readString6, valueOf8, num, parcel.createStringArrayList(), parcel.readString(), parcel.createStringArrayList(), parcel.readString(), parcel.readString());
    }

    @Override // android.os.Parcelable.Creator
    public final SkuItem[] newArray(int i) {
        return new SkuItem[i];
    }
}
