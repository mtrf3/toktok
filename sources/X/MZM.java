package X;

import android.os.Parcel;
import android.os.Parcelable;
import com.ss.android.ugc.aweme.notification.bean.MusNotificationDetailArg;
import kotlin.jvm.internal.o;

/* loaded from: classes10.dex */
public final class MZM implements Parcelable.Creator<MusNotificationDetailArg> {
    @Override // android.os.Parcelable.Creator
    public final MusNotificationDetailArg createFromParcel(Parcel parcel) {
        boolean z;
        o.LJIIIZ(parcel, "parcel");
        int readInt = parcel.readInt();
        int readInt2 = parcel.readInt();
        String readString = parcel.readString();
        String readString2 = parcel.readString();
        String readString3 = parcel.readString();
        if (parcel.readInt() != 0) {
            z = true;
        } else {
            z = false;
        }
        return new MusNotificationDetailArg(readInt, readInt2, readString, readString2, readString3, z, parcel.readLong(), parcel.readString());
    }

    @Override // android.os.Parcelable.Creator
    public final MusNotificationDetailArg[] newArray(int i) {
        return new MusNotificationDetailArg[i];
    }
}
