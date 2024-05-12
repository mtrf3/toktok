package X;

import android.os.Parcel;
import android.os.Parcelable;
import com.ss.android.ugc.aweme.ecommerce.base.pdp.repository.dto.ProductPrice;
import com.ss.android.ugc.aweme.ecommerce.service.vo.Image;
import java.util.ArrayList;
import kotlin.jvm.internal.o;

/* renamed from: X.RUk, reason: case insensitive filesystem */
/* loaded from: classes13.dex */
public final class C69630RUk implements Parcelable.Creator<com.ss.android.ugc.aweme.ecommerce.base.sku.model.dto.Skc> {
    @Override // android.os.Parcelable.Creator
    public final com.ss.android.ugc.aweme.ecommerce.base.sku.model.dto.Skc createFromParcel(Parcel parcel) {
        ArrayList arrayList;
        o.LJIIIZ(parcel, "parcel");
        String readString = parcel.readString();
        String readString2 = parcel.readString();
        Image image = (Image) parcel.readParcelable(com.ss.android.ugc.aweme.ecommerce.base.sku.model.dto.Skc.class.getClassLoader());
        ProductPrice productPrice = null;
        if (parcel.readInt() == 0) {
            arrayList = null;
        } else {
            int readInt = parcel.readInt();
            arrayList = new ArrayList(readInt);
            int i = 0;
            while (i != readInt) {
                i = C5YW.LIZ(com.ss.android.ugc.aweme.ecommerce.base.sku.model.dto.Skc.class, parcel, arrayList, i, 1);
            }
        }
        ArrayList<String> createStringArrayList = parcel.createStringArrayList();
        int readInt2 = parcel.readInt();
        String readString3 = parcel.readString();
        if (parcel.readInt() != 0) {
            productPrice = ProductPrice.CREATOR.createFromParcel(parcel);
        }
        return new com.ss.android.ugc.aweme.ecommerce.base.sku.model.dto.Skc(readString, readString2, image, arrayList, createStringArrayList, readInt2, readString3, productPrice, parcel.readString());
    }

    @Override // android.os.Parcelable.Creator
    public final com.ss.android.ugc.aweme.ecommerce.base.sku.model.dto.Skc[] newArray(int i) {
        return new com.ss.android.ugc.aweme.ecommerce.base.sku.model.dto.Skc[i];
    }
}
