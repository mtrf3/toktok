package X;

import android.os.Parcel;
import android.os.Parcelable;
import com.ss.android.ugc.aweme.ecommerce.base.pdp.repository.dto.ProductUnavailableInfo;
import kotlin.jvm.internal.o;

/* loaded from: classes13.dex */
public final class RVX implements Parcelable.Creator<ProductUnavailableInfo> {
    @Override // android.os.Parcelable.Creator
    public final ProductUnavailableInfo createFromParcel(Parcel parcel) {
        Integer valueOf;
        Integer valueOf2;
        o.LJIIIZ(parcel, "parcel");
        String readString = parcel.readString();
        String readString2 = parcel.readString();
        Integer num = null;
        if (parcel.readInt() == 0) {
            valueOf = null;
        } else {
            valueOf = Integer.valueOf(parcel.readInt());
        }
        if (parcel.readInt() == 0) {
            valueOf2 = null;
        } else {
            valueOf2 = Integer.valueOf(parcel.readInt());
        }
        String readString3 = parcel.readString();
        if (parcel.readInt() != 0) {
            num = Integer.valueOf(parcel.readInt());
        }
        return new ProductUnavailableInfo(readString, readString2, valueOf, valueOf2, readString3, num);
    }

    @Override // android.os.Parcelable.Creator
    public final ProductUnavailableInfo[] newArray(int i) {
        return new ProductUnavailableInfo[i];
    }
}
