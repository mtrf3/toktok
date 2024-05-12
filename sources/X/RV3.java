package X;

import android.os.Parcel;
import android.os.Parcelable;
import com.bytedance.android.livesdk.model.message.ext.GImage;
import com.ss.android.ugc.aweme.ecommerce.base.pdp.repository.dto.HalfWaistBanner;
import kotlin.jvm.internal.o;

/* loaded from: classes13.dex */
public final class RV3 implements Parcelable.Creator<HalfWaistBanner> {
    @Override // android.os.Parcelable.Creator
    public final HalfWaistBanner createFromParcel(Parcel parcel) {
        o.LJIIIZ(parcel, "parcel");
        return new HalfWaistBanner((GImage) parcel.readParcelable(HalfWaistBanner.class.getClassLoader()), (GImage) parcel.readParcelable(HalfWaistBanner.class.getClassLoader()), parcel.readString(), parcel.readString());
    }

    @Override // android.os.Parcelable.Creator
    public final HalfWaistBanner[] newArray(int i) {
        return new HalfWaistBanner[i];
    }
}
