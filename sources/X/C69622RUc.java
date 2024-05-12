package X;

import android.os.Parcel;
import android.os.Parcelable;
import com.ss.android.ugc.aweme.ecommerce.base.pdp.repository.dto.GlobalWaistBanner;
import com.ss.android.ugc.aweme.ecommerce.service.vo.Image;
import kotlin.jvm.internal.o;

/* renamed from: X.RUc, reason: case insensitive filesystem */
/* loaded from: classes13.dex */
public final class C69622RUc implements Parcelable.Creator<GlobalWaistBanner> {
    @Override // android.os.Parcelable.Creator
    public final GlobalWaistBanner createFromParcel(Parcel parcel) {
        Integer valueOf;
        o.LJIIIZ(parcel, "parcel");
        Long l = null;
        if (parcel.readInt() == 0) {
            valueOf = null;
        } else {
            valueOf = Integer.valueOf(parcel.readInt());
        }
        String readString = parcel.readString();
        String readString2 = parcel.readString();
        Image image = (Image) parcel.readParcelable(GlobalWaistBanner.class.getClassLoader());
        Image image2 = (Image) parcel.readParcelable(GlobalWaistBanner.class.getClassLoader());
        if (parcel.readInt() != 0) {
            l = Long.valueOf(parcel.readLong());
        }
        return new GlobalWaistBanner(valueOf, readString, readString2, image, image2, l, parcel.readString());
    }

    @Override // android.os.Parcelable.Creator
    public final GlobalWaistBanner[] newArray(int i) {
        return new GlobalWaistBanner[i];
    }
}
