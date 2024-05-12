package X;

import android.os.Parcel;
import android.os.Parcelable;
import com.ss.android.ugc.aweme.ecommerce.base.common.model.Video;
import com.ss.android.ugc.aweme.ecommerce.base.pdpv2.vo.HeaderItem;
import com.ss.android.ugc.aweme.ecommerce.service.vo.Image;
import kotlin.jvm.internal.o;

/* renamed from: X.RVv, reason: case insensitive filesystem */
/* loaded from: classes13.dex */
public final class C69667RVv implements Parcelable.Creator<HeaderItem> {
    @Override // android.os.Parcelable.Creator
    public final HeaderItem createFromParcel(Parcel parcel) {
        Integer valueOf;
        o.LJIIIZ(parcel, "parcel");
        Video video = null;
        if (parcel.readInt() == 0) {
            valueOf = null;
        } else {
            valueOf = Integer.valueOf(parcel.readInt());
        }
        Image image = (Image) parcel.readParcelable(HeaderItem.class.getClassLoader());
        if (parcel.readInt() != 0) {
            video = Video.CREATOR.createFromParcel(parcel);
        }
        return new HeaderItem(valueOf, image, video);
    }

    @Override // android.os.Parcelable.Creator
    public final HeaderItem[] newArray(int i) {
        return new HeaderItem[i];
    }
}
