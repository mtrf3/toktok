package X;

import android.os.Parcel;
import android.os.Parcelable;
import com.ss.android.ugc.aweme.ecommerce.base.pdp.repository.dto.SellerDetailPopup;
import kotlin.jvm.internal.o;

/* renamed from: X.Arf, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C27555Arf implements Parcelable.Creator<SellerDetailPopup> {
    @Override // android.os.Parcelable.Creator
    public final SellerDetailPopup createFromParcel(Parcel parcel) {
        o.LJIIIZ(parcel, "parcel");
        return new SellerDetailPopup(parcel.readString());
    }

    @Override // android.os.Parcelable.Creator
    public final SellerDetailPopup[] newArray(int i) {
        return new SellerDetailPopup[i];
    }
}
