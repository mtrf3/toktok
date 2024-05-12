package X;

import android.os.Parcel;
import android.os.Parcelable;
import com.ss.android.ugc.aweme.ecommerce.base.sku.model.dto.SkuSaleProp;
import kotlin.jvm.internal.o;

/* renamed from: X.RWv, reason: case insensitive filesystem */
/* loaded from: classes13.dex */
public final class C69693RWv implements Parcelable.Creator<SkuSaleProp> {
    @Override // android.os.Parcelable.Creator
    public final SkuSaleProp createFromParcel(Parcel parcel) {
        o.LJIIIZ(parcel, "parcel");
        return new SkuSaleProp(parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString());
    }

    @Override // android.os.Parcelable.Creator
    public final SkuSaleProp[] newArray(int i) {
        return new SkuSaleProp[i];
    }
}
