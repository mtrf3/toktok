package X;

import android.os.Parcel;
import android.os.Parcelable;
import com.ss.android.ugc.aweme.influencer.ecommercelive.business.effect2.model.BillboardSetting;
import kotlin.jvm.internal.o;

/* loaded from: classes13.dex */
public final class S9G implements Parcelable.Creator<BillboardSetting> {
    @Override // android.os.Parcelable.Creator
    public final BillboardSetting createFromParcel(Parcel parcel) {
        boolean z;
        o.LJIIIZ(parcel, "parcel");
        if (parcel.readInt() != 0) {
            z = true;
        } else {
            z = false;
        }
        return new BillboardSetting(z);
    }

    @Override // android.os.Parcelable.Creator
    public final BillboardSetting[] newArray(int i) {
        return new BillboardSetting[i];
    }
}
