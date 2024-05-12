package X;

import android.os.Parcel;
import android.os.Parcelable;
import com.ss.android.ugc.aweme.ecommerce.base.common.model.MediaItem;
import com.ss.android.ugc.aweme.ecommerce.base.common.model.Video;
import com.ss.android.ugc.aweme.ecommerce.service.vo.Image;
import kotlin.jvm.internal.o;

/* renamed from: X.RVx, reason: case insensitive filesystem */
/* loaded from: classes13.dex */
public final class C69669RVx implements Parcelable.Creator<MediaItem> {
    @Override // android.os.Parcelable.Creator
    public final MediaItem createFromParcel(Parcel parcel) {
        Video createFromParcel;
        o.LJIIIZ(parcel, "parcel");
        Image image = (Image) parcel.readParcelable(MediaItem.class.getClassLoader());
        if (parcel.readInt() == 0) {
            createFromParcel = null;
        } else {
            createFromParcel = Video.CREATOR.createFromParcel(parcel);
        }
        return new MediaItem(image, createFromParcel, parcel.readInt());
    }

    @Override // android.os.Parcelable.Creator
    public final MediaItem[] newArray(int i) {
        return new MediaItem[i];
    }
}
