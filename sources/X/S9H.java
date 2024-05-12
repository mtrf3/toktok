package X;

import android.os.Parcel;
import android.os.Parcelable;
import com.ss.android.ugc.aweme.influencer.ecommercelive.business.effect2.model.BillboardNewUser;
import com.ss.android.ugc.aweme.influencer.ecommercelive.business.effect2.model.BillboardSetting;
import com.ss.android.ugc.aweme.influencer.ecommercelive.business.effect2.model.BillboardSettingsData;
import kotlin.jvm.internal.o;

/* loaded from: classes13.dex */
public final class S9H implements Parcelable.Creator<BillboardSettingsData> {
    @Override // android.os.Parcelable.Creator
    public final BillboardSettingsData createFromParcel(Parcel parcel) {
        o.LJIIIZ(parcel, "parcel");
        return new BillboardSettingsData(BillboardSetting.CREATOR.createFromParcel(parcel), BillboardNewUser.CREATOR.createFromParcel(parcel));
    }

    @Override // android.os.Parcelable.Creator
    public final BillboardSettingsData[] newArray(int i) {
        return new BillboardSettingsData[i];
    }
}
