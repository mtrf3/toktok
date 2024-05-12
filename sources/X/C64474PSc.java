package X;

import android.os.Parcel;
import android.os.Parcelable;
import com.ss.android.ugc.aweme.ecommerce.showcase.service.vo.StoreFreqBoughtTag;
import com.ss.android.ugc.aweme.ecommerce.showcase.service.vo.StoreGoodReviewTag;
import com.ss.android.ugc.aweme.ecommerce.showcase.service.vo.StoreLabel;
import com.ss.android.ugc.aweme.ecommerce.showcase.service.vo.StoreOfficialLabel;
import com.ss.android.ugc.aweme.ecommerce.showcase.service.vo.StoreRegVisitorTag;
import kotlin.jvm.internal.o;

/* renamed from: X.PSc, reason: case insensitive filesystem */
/* loaded from: classes12.dex */
public final class C64474PSc implements Parcelable.Creator<StoreLabel> {
    @Override // android.os.Parcelable.Creator
    public final StoreLabel createFromParcel(Parcel parcel) {
        StoreOfficialLabel createFromParcel;
        StoreRegVisitorTag createFromParcel2;
        StoreGoodReviewTag createFromParcel3;
        o.LJIIIZ(parcel, "parcel");
        StoreFreqBoughtTag storeFreqBoughtTag = null;
        if (parcel.readInt() == 0) {
            createFromParcel = null;
        } else {
            createFromParcel = StoreOfficialLabel.CREATOR.createFromParcel(parcel);
        }
        StoreOfficialLabel storeOfficialLabel = createFromParcel;
        if (parcel.readInt() == 0) {
            createFromParcel2 = null;
        } else {
            createFromParcel2 = StoreRegVisitorTag.CREATOR.createFromParcel(parcel);
        }
        StoreRegVisitorTag storeRegVisitorTag = createFromParcel2;
        if (parcel.readInt() == 0) {
            createFromParcel3 = null;
        } else {
            createFromParcel3 = StoreGoodReviewTag.CREATOR.createFromParcel(parcel);
        }
        StoreGoodReviewTag storeGoodReviewTag = createFromParcel3;
        if (parcel.readInt() != 0) {
            storeFreqBoughtTag = StoreFreqBoughtTag.CREATOR.createFromParcel(parcel);
        }
        return new StoreLabel(storeOfficialLabel, storeRegVisitorTag, storeGoodReviewTag, storeFreqBoughtTag);
    }

    @Override // android.os.Parcelable.Creator
    public final StoreLabel[] newArray(int i) {
        return new StoreLabel[i];
    }
}
