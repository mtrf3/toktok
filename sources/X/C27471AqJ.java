package X;

import android.os.Parcel;
import android.os.Parcelable;
import com.ss.android.ugc.aweme.ecommerce.base.pdp.repository.dto.EntranceBannerInfo;
import com.ss.android.ugc.aweme.ecommerce.base.pdp.repository.dto.EntranceButtonInfo;
import com.ss.android.ugc.aweme.ecommerce.service.vo.Image;
import kotlin.jvm.internal.o;

/* renamed from: X.AqJ, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C27471AqJ implements Parcelable.Creator<EntranceBannerInfo> {
    @Override // android.os.Parcelable.Creator
    public final EntranceBannerInfo createFromParcel(Parcel parcel) {
        EntranceButtonInfo createFromParcel;
        o.LJIIIZ(parcel, "parcel");
        String readString = parcel.readString();
        Image image = (Image) parcel.readParcelable(EntranceBannerInfo.class.getClassLoader());
        if (parcel.readInt() == 0) {
            createFromParcel = null;
        } else {
            createFromParcel = EntranceButtonInfo.CREATOR.createFromParcel(parcel);
        }
        return new EntranceBannerInfo(readString, image, createFromParcel);
    }

    @Override // android.os.Parcelable.Creator
    public final EntranceBannerInfo[] newArray(int i) {
        return new EntranceBannerInfo[i];
    }
}
