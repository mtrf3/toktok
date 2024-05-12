package X;

import android.os.Parcel;
import android.os.Parcelable;
import com.ss.android.ugc.aweme.ecommerce.base.common.model.Video;
import com.ss.android.ugc.aweme.ecommerce.base.review.repo.dto.ReviewMedia;
import com.ss.android.ugc.aweme.ecommerce.service.vo.Image;
import kotlin.jvm.internal.o;

/* renamed from: X.At5, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C27643At5 implements Parcelable.Creator<ReviewMedia> {
    @Override // android.os.Parcelable.Creator
    public final ReviewMedia createFromParcel(Parcel parcel) {
        Integer valueOf;
        o.LJIIIZ(parcel, "parcel");
        Video video = null;
        if (parcel.readInt() == 0) {
            valueOf = null;
        } else {
            valueOf = Integer.valueOf(parcel.readInt());
        }
        Image image = (Image) parcel.readParcelable(ReviewMedia.class.getClassLoader());
        if (parcel.readInt() != 0) {
            video = Video.CREATOR.createFromParcel(parcel);
        }
        return new ReviewMedia(valueOf, image, video);
    }

    @Override // android.os.Parcelable.Creator
    public final ReviewMedia[] newArray(int i) {
        return new ReviewMedia[i];
    }
}
