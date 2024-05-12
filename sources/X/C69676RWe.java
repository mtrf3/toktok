package X;

import android.os.Parcel;
import android.os.Parcelable;
import com.ss.android.ugc.aweme.ecommerce.base.pdp.repository.dto.WaistBanner;
import com.ss.android.ugc.aweme.ecommerce.service.vo.Image;
import kotlin.jvm.internal.o;

/* renamed from: X.RWe, reason: case insensitive filesystem */
/* loaded from: classes13.dex */
public final class C69676RWe implements Parcelable.Creator<WaistBanner> {
    @Override // android.os.Parcelable.Creator
    public final WaistBanner createFromParcel(Parcel parcel) {
        o.LJIIIZ(parcel, "parcel");
        return new WaistBanner(parcel.readString(), (Image) parcel.readParcelable(WaistBanner.class.getClassLoader()), parcel.readString());
    }

    @Override // android.os.Parcelable.Creator
    public final WaistBanner[] newArray(int i) {
        return new WaistBanner[i];
    }
}
