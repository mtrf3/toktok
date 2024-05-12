package X;

import android.os.Parcel;
import android.os.Parcelable;
import com.ss.android.ugc.aweme.im.message.template.component.ImageComponent;
import com.ss.android.ugc.aweme.im.message.template.component.UserInfoComponent;
import kotlin.jvm.internal.o;

/* loaded from: classes14.dex */
public final class V3M implements Parcelable.Creator<UserInfoComponent> {
    @Override // android.os.Parcelable.Creator
    public final UserInfoComponent createFromParcel(Parcel parcel) {
        o.LJIIIZ(parcel, "parcel");
        return new UserInfoComponent(parcel.readLong(), parcel.readString(), ImageComponent.CREATOR.createFromParcel(parcel));
    }

    @Override // android.os.Parcelable.Creator
    public final UserInfoComponent[] newArray(int i) {
        return new UserInfoComponent[i];
    }
}
