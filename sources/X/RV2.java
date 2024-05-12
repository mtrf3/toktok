package X;

import android.os.Parcel;
import android.os.Parcelable;
import com.ss.android.ugc.aweme.ecommerce.base.pdp.repository.dto.ReminderItem;
import kotlin.jvm.internal.o;

/* loaded from: classes13.dex */
public final class RV2 implements Parcelable.Creator<ReminderItem> {
    @Override // android.os.Parcelable.Creator
    public final ReminderItem createFromParcel(Parcel parcel) {
        o.LJIIIZ(parcel, "parcel");
        return new ReminderItem(parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString());
    }

    @Override // android.os.Parcelable.Creator
    public final ReminderItem[] newArray(int i) {
        return new ReminderItem[i];
    }
}
