package X;

import android.os.Parcel;
import android.os.Parcelable;
import com.ss.android.ugc.aweme.ecommerce.base.pdp.repository.dto.CombinedSalesVolume;
import com.ss.android.ugc.aweme.ecommerce.base.pdp.repository.dto.LogisticLinkRichText;
import kotlin.jvm.internal.o;

/* renamed from: X.RVz, reason: case insensitive filesystem */
/* loaded from: classes13.dex */
public final class C69671RVz implements Parcelable.Creator<CombinedSalesVolume> {
    @Override // android.os.Parcelable.Creator
    public final CombinedSalesVolume createFromParcel(Parcel parcel) {
        LogisticLinkRichText createFromParcel;
        o.LJIIIZ(parcel, "parcel");
        if (parcel.readInt() == 0) {
            createFromParcel = null;
        } else {
            createFromParcel = LogisticLinkRichText.CREATOR.createFromParcel(parcel);
        }
        return new CombinedSalesVolume(createFromParcel, parcel.readString());
    }

    @Override // android.os.Parcelable.Creator
    public final CombinedSalesVolume[] newArray(int i) {
        return new CombinedSalesVolume[i];
    }
}
