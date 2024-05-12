package X;

import android.os.Parcel;
import android.os.Parcelable;
import com.ss.android.ugc.aweme.ecommerce.service.vo.Image;
import com.ss.android.ugc.aweme.ecommerce.showcase.service.vo.StoreOfficialLabel;
import kotlin.jvm.internal.o;

/* renamed from: X.AgW, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C26864AgW implements Parcelable.Creator<StoreOfficialLabel> {
    @Override // android.os.Parcelable.Creator
    public final StoreOfficialLabel createFromParcel(Parcel parcel) {
        Integer valueOf;
        o.LJIIIZ(parcel, "parcel");
        Image image = (Image) parcel.readParcelable(StoreOfficialLabel.class.getClassLoader());
        Image image2 = (Image) parcel.readParcelable(StoreOfficialLabel.class.getClassLoader());
        if (parcel.readInt() == 0) {
            valueOf = null;
        } else {
            valueOf = Integer.valueOf(parcel.readInt());
        }
        return new StoreOfficialLabel(image, image2, valueOf, parcel.readString());
    }

    @Override // android.os.Parcelable.Creator
    public final StoreOfficialLabel[] newArray(int i) {
        return new StoreOfficialLabel[i];
    }
}
