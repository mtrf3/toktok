package X;

import android.os.Parcel;
import android.os.Parcelable;
import com.ss.android.ugc.aweme.ecommerce.base.pdp.repository.dto.PickTag;
import com.ss.android.ugc.aweme.ecommerce.service.vo.Image;
import kotlin.jvm.internal.o;

/* loaded from: classes13.dex */
public final class RV9 implements Parcelable.Creator<PickTag> {
    @Override // android.os.Parcelable.Creator
    public final PickTag createFromParcel(Parcel parcel) {
        o.LJIIIZ(parcel, "parcel");
        return new PickTag(parcel.readString(), parcel.readString(), (Image) parcel.readParcelable(PickTag.class.getClassLoader()), parcel.readString());
    }

    @Override // android.os.Parcelable.Creator
    public final PickTag[] newArray(int i) {
        return new PickTag[i];
    }
}
