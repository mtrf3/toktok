package X;

import android.os.Parcel;
import android.os.Parcelable;
import com.ss.android.ugc.aweme.ecommerce.base.common.model.Icon;
import com.ss.android.ugc.aweme.ecommerce.base.review.repo.dto.ReviewItemStruct;
import com.ss.android.ugc.aweme.ecommerce.service.vo.Image;
import kotlin.jvm.internal.o;

/* renamed from: X.RVn, reason: case insensitive filesystem */
/* loaded from: classes13.dex */
public final class C69659RVn implements Parcelable.Creator<ReviewItemStruct.User> {
    @Override // android.os.Parcelable.Creator
    public final ReviewItemStruct.User createFromParcel(Parcel parcel) {
        Icon createFromParcel;
        o.LJIIIZ(parcel, "parcel");
        String readString = parcel.readString();
        String readString2 = parcel.readString();
        Image image = (Image) parcel.readParcelable(ReviewItemStruct.User.class.getClassLoader());
        String readString3 = parcel.readString();
        if (parcel.readInt() == 0) {
            createFromParcel = null;
        } else {
            createFromParcel = Icon.CREATOR.createFromParcel(parcel);
        }
        return new ReviewItemStruct.User(readString, readString2, image, readString3, createFromParcel);
    }

    @Override // android.os.Parcelable.Creator
    public final ReviewItemStruct.User[] newArray(int i) {
        return new ReviewItemStruct.User[i];
    }
}
