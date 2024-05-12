package X;

import android.os.Parcel;
import android.os.Parcelable;
import com.ss.android.ugc.aweme.ecommerce.base.pdpv2.vo.SellerInfoBizData;
import com.ss.android.ugc.aweme.ecommerce.service.vo.Image;
import kotlin.jvm.internal.o;

/* renamed from: X.RUb, reason: case insensitive filesystem */
/* loaded from: classes13.dex */
public final class C69621RUb implements Parcelable.Creator<SellerInfoBizData> {
    @Override // android.os.Parcelable.Creator
    public final SellerInfoBizData createFromParcel(Parcel parcel) {
        Long valueOf;
        Float valueOf2;
        o.LJIIIZ(parcel, "parcel");
        String readString = parcel.readString();
        String readString2 = parcel.readString();
        Image image = (Image) parcel.readParcelable(SellerInfoBizData.class.getClassLoader());
        Long l = null;
        if (parcel.readInt() == 0) {
            valueOf = null;
        } else {
            valueOf = Long.valueOf(parcel.readLong());
        }
        String readString3 = parcel.readString();
        Image image2 = (Image) parcel.readParcelable(SellerInfoBizData.class.getClassLoader());
        String readString4 = parcel.readString();
        if (parcel.readInt() == 0) {
            valueOf2 = null;
        } else {
            valueOf2 = Float.valueOf(parcel.readFloat());
        }
        if (parcel.readInt() != 0) {
            l = Long.valueOf(parcel.readLong());
        }
        return new SellerInfoBizData(readString, readString2, image, valueOf, readString3, image2, readString4, valueOf2, l, parcel.readString());
    }

    @Override // android.os.Parcelable.Creator
    public final SellerInfoBizData[] newArray(int i) {
        return new SellerInfoBizData[i];
    }
}
