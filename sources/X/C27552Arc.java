package X;

import android.os.Parcel;
import android.os.Parcelable;
import com.ss.android.ugc.aweme.ecommerce.base.osp.repository.dto.LinkRichText;
import com.ss.android.ugc.aweme.ecommerce.base.pdp.repository.dto.SellerSellingPoint;
import kotlin.jvm.internal.o;

/* renamed from: X.Arc, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C27552Arc implements Parcelable.Creator<SellerSellingPoint> {
    @Override // android.os.Parcelable.Creator
    public final SellerSellingPoint createFromParcel(Parcel parcel) {
        LinkRichText createFromParcel;
        o.LJIIIZ(parcel, "parcel");
        String readString = parcel.readString();
        if (parcel.readInt() == 0) {
            createFromParcel = null;
        } else {
            createFromParcel = LinkRichText.CREATOR.createFromParcel(parcel);
        }
        return new SellerSellingPoint(readString, createFromParcel);
    }

    @Override // android.os.Parcelable.Creator
    public final SellerSellingPoint[] newArray(int i) {
        return new SellerSellingPoint[i];
    }
}
