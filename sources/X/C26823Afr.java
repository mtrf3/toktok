package X;

import android.os.Parcel;
import android.os.Parcelable;
import com.ss.android.ugc.aweme.ecommerce.base.pdp.repository.dto.SellerPromotionItem;
import kotlin.jvm.internal.o;

/* renamed from: X.Afr, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C26823Afr implements Parcelable.Creator<SellerPromotionItem> {
    @Override // android.os.Parcelable.Creator
    public final SellerPromotionItem createFromParcel(Parcel parcel) {
        o.LJIIIZ(parcel, "parcel");
        return new SellerPromotionItem(parcel.readString(), parcel.readString(), parcel.readString());
    }

    @Override // android.os.Parcelable.Creator
    public final SellerPromotionItem[] newArray(int i) {
        return new SellerPromotionItem[i];
    }
}
