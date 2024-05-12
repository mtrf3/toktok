package X;

import android.os.Parcel;
import android.os.Parcelable;
import com.ss.android.ugc.aweme.ecommerce.base.pdp.repository.dto.SellerDetailInfo;
import com.ss.android.ugc.aweme.ecommerce.base.pdp.repository.dto.SellerDetailPopup;
import kotlin.jvm.internal.o;

/* renamed from: X.Are, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C27554Are implements Parcelable.Creator<SellerDetailInfo> {
    @Override // android.os.Parcelable.Creator
    public final SellerDetailInfo createFromParcel(Parcel parcel) {
        Long valueOf;
        o.LJIIIZ(parcel, "parcel");
        String readString = parcel.readString();
        String readString2 = parcel.readString();
        SellerDetailPopup sellerDetailPopup = null;
        if (parcel.readInt() == 0) {
            valueOf = null;
        } else {
            valueOf = Long.valueOf(parcel.readLong());
        }
        String readString3 = parcel.readString();
        String readString4 = parcel.readString();
        if (parcel.readInt() != 0) {
            sellerDetailPopup = SellerDetailPopup.CREATOR.createFromParcel(parcel);
        }
        return new SellerDetailInfo(readString, readString2, valueOf, readString3, readString4, sellerDetailPopup);
    }

    @Override // android.os.Parcelable.Creator
    public final SellerDetailInfo[] newArray(int i) {
        return new SellerDetailInfo[i];
    }
}
