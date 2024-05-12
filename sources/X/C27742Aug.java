package X;

import android.os.Parcel;
import android.os.Parcelable;
import com.ss.android.ugc.aweme.ecommerce.base.pdp.repository.dto.ShopRecommend;
import kotlin.jvm.internal.o;

/* renamed from: X.Aug, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C27742Aug implements Parcelable.Creator<ShopRecommend> {
    @Override // android.os.Parcelable.Creator
    public final ShopRecommend createFromParcel(Parcel parcel) {
        boolean z;
        Boolean valueOf;
        o.LJIIIZ(parcel, "parcel");
        if (parcel.readInt() == 0) {
            valueOf = null;
        } else {
            if (parcel.readInt() != 0) {
                z = true;
            } else {
                z = false;
            }
            valueOf = Boolean.valueOf(z);
        }
        return new ShopRecommend(valueOf, parcel.readString(), parcel.readString(), parcel.readString());
    }

    @Override // android.os.Parcelable.Creator
    public final ShopRecommend[] newArray(int i) {
        return new ShopRecommend[i];
    }
}
