package X;

import android.os.Parcel;
import android.os.Parcelable;
import com.ss.android.ugc.aweme.image.model.ImageDisplayInfo;
import com.ss.android.ugc.aweme.image.model.ImageEncodeInfo;
import com.ss.android.ugc.aweme.image.model.ImageQualityInfo;
import com.ss.android.ugc.aweme.image.model.ImageResizeInfo;
import com.ss.android.ugc.aweme.image.model.ImageSourceInfo;
import kotlin.jvm.internal.o;

/* renamed from: X.HHw, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C43824HHw implements Parcelable.Creator<ImageQualityInfo> {
    @Override // android.os.Parcelable.Creator
    public final ImageQualityInfo createFromParcel(Parcel parcel) {
        ImageSourceInfo createFromParcel;
        ImageResizeInfo createFromParcel2;
        ImageDisplayInfo createFromParcel3;
        o.LJIIIZ(parcel, "parcel");
        ImageEncodeInfo imageEncodeInfo = null;
        if (parcel.readInt() == 0) {
            createFromParcel = null;
        } else {
            createFromParcel = ImageSourceInfo.CREATOR.createFromParcel(parcel);
        }
        ImageSourceInfo imageSourceInfo = createFromParcel;
        if (parcel.readInt() == 0) {
            createFromParcel2 = null;
        } else {
            createFromParcel2 = ImageResizeInfo.CREATOR.createFromParcel(parcel);
        }
        ImageResizeInfo imageResizeInfo = createFromParcel2;
        if (parcel.readInt() == 0) {
            createFromParcel3 = null;
        } else {
            createFromParcel3 = ImageDisplayInfo.CREATOR.createFromParcel(parcel);
        }
        ImageDisplayInfo imageDisplayInfo = createFromParcel3;
        if (parcel.readInt() != 0) {
            imageEncodeInfo = ImageEncodeInfo.CREATOR.createFromParcel(parcel);
        }
        return new ImageQualityInfo(imageSourceInfo, imageResizeInfo, imageDisplayInfo, imageEncodeInfo);
    }

    @Override // android.os.Parcelable.Creator
    public final ImageQualityInfo[] newArray(int i) {
        return new ImageQualityInfo[i];
    }
}
