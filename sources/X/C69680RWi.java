package X;

import android.os.Parcel;
import android.os.Parcelable;
import com.ss.android.ugc.aweme.ecommerce.base.pdp.repository.dto.BuyTogether;
import com.ss.android.ugc.aweme.ecommerce.base.pdp.repository.dto.LazyLoadInfo;
import kotlin.jvm.internal.o;

/* renamed from: X.RWi, reason: case insensitive filesystem */
/* loaded from: classes13.dex */
public final class C69680RWi implements Parcelable.Creator<LazyLoadInfo> {
    @Override // android.os.Parcelable.Creator
    public final LazyLoadInfo createFromParcel(Parcel parcel) {
        BuyTogether createFromParcel;
        o.LJIIIZ(parcel, "parcel");
        if (parcel.readInt() == 0) {
            createFromParcel = null;
        } else {
            createFromParcel = BuyTogether.CREATOR.createFromParcel(parcel);
        }
        return new LazyLoadInfo(createFromParcel);
    }

    @Override // android.os.Parcelable.Creator
    public final LazyLoadInfo[] newArray(int i) {
        return new LazyLoadInfo[i];
    }
}
