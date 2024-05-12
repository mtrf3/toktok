package X;

import android.os.Parcel;
import android.os.Parcelable;
import com.ss.android.ugc.aweme.ecommerce.base.common.model.Icon;
import com.ss.android.ugc.aweme.ecommerce.base.pdp.repository.dto.UserRightTag;
import kotlin.jvm.internal.o;

/* renamed from: X.RVr, reason: case insensitive filesystem */
/* loaded from: classes13.dex */
public final class C69663RVr implements Parcelable.Creator<UserRightTag> {
    @Override // android.os.Parcelable.Creator
    public final UserRightTag createFromParcel(Parcel parcel) {
        Icon createFromParcel;
        o.LJIIIZ(parcel, "parcel");
        String readString = parcel.readString();
        String readString2 = parcel.readString();
        if (parcel.readInt() == 0) {
            createFromParcel = null;
        } else {
            createFromParcel = Icon.CREATOR.createFromParcel(parcel);
        }
        return new UserRightTag(readString, readString2, createFromParcel, parcel.readString());
    }

    @Override // android.os.Parcelable.Creator
    public final UserRightTag[] newArray(int i) {
        return new UserRightTag[i];
    }
}
