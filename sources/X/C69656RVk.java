package X;

import android.os.Parcel;
import android.os.Parcelable;
import com.ss.android.ugc.aweme.ecommerce.base.common.model.Icon;
import com.ss.android.ugc.aweme.ecommerce.base.pdp.repository.dto.RemindBox;
import kotlin.jvm.internal.o;

/* renamed from: X.RVk, reason: case insensitive filesystem */
/* loaded from: classes13.dex */
public final class C69656RVk implements Parcelable.Creator<RemindBox> {
    @Override // android.os.Parcelable.Creator
    public final RemindBox createFromParcel(Parcel parcel) {
        Icon createFromParcel;
        o.LJIIIZ(parcel, "parcel");
        String readString = parcel.readString();
        Icon icon = null;
        if (parcel.readInt() == 0) {
            createFromParcel = null;
        } else {
            createFromParcel = Icon.CREATOR.createFromParcel(parcel);
        }
        Icon icon2 = createFromParcel;
        String readString2 = parcel.readString();
        String readString3 = parcel.readString();
        if (parcel.readInt() != 0) {
            icon = Icon.CREATOR.createFromParcel(parcel);
        }
        return new RemindBox(readString, icon2, readString2, readString3, icon);
    }

    @Override // android.os.Parcelable.Creator
    public final RemindBox[] newArray(int i) {
        return new RemindBox[i];
    }
}
