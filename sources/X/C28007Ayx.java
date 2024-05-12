package X;

import android.os.Parcel;
import android.os.Parcelable;
import com.ss.android.ugc.aweme.ecommerce.base.common.model.Price;
import com.ss.android.ugc.aweme.ecommerce.base.sku.model.dto.SkuPrice;
import kotlin.jvm.internal.o;

/* renamed from: X.Ayx, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C28007Ayx implements Parcelable.Creator<SkuPrice> {
    @Override // android.os.Parcelable.Creator
    public final SkuPrice createFromParcel(Parcel parcel) {
        Price createFromParcel;
        o.LJIIIZ(parcel, "parcel");
        if (parcel.readInt() == 0) {
            createFromParcel = null;
        } else {
            createFromParcel = Price.CREATOR.createFromParcel(parcel);
        }
        return new SkuPrice(createFromParcel, parcel.readString(), parcel.readString(), parcel.readString());
    }

    @Override // android.os.Parcelable.Creator
    public final SkuPrice[] newArray(int i) {
        return new SkuPrice[i];
    }
}
