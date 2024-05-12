package X;

import android.os.Parcel;
import android.os.Parcelable;
import com.ss.android.ugc.aweme.ecommerce.base.sku.model.dto.SalePropValue;
import com.ss.android.ugc.aweme.ecommerce.service.vo.Image;
import kotlin.jvm.internal.o;

/* loaded from: classes13.dex */
public final class RX2 implements Parcelable.Creator<SalePropValue> {
    @Override // android.os.Parcelable.Creator
    public final SalePropValue createFromParcel(Parcel parcel) {
        o.LJIIIZ(parcel, "parcel");
        return new SalePropValue(parcel.readString(), parcel.readString(), (Image) parcel.readParcelable(SalePropValue.class.getClassLoader()));
    }

    @Override // android.os.Parcelable.Creator
    public final SalePropValue[] newArray(int i) {
        return new SalePropValue[i];
    }
}
