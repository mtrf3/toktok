package X;

import android.os.Parcel;
import android.os.Parcelable;
import com.bytedance.android.livesdkapi.session.EnterRoomConfig;
import kotlin.jvm.internal.o;

/* loaded from: classes6.dex */
public final class BL1 implements Parcelable.Creator<EnterRoomConfig.GuestUser> {
    @Override // android.os.Parcelable.Creator
    public final EnterRoomConfig.GuestUser createFromParcel(Parcel parcel) {
        o.LJIIIZ(parcel, "parcel");
        return new EnterRoomConfig.GuestUser(parcel.readLong(), parcel.readString(), parcel.readInt(), parcel.readString());
    }

    @Override // android.os.Parcelable.Creator
    public final EnterRoomConfig.GuestUser[] newArray(int i) {
        return new EnterRoomConfig.GuestUser[i];
    }
}
