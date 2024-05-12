package X;

import android.os.Parcel;
import android.os.Parcelable;
import com.ss.android.ugc.aweme.live.LiveGameDualDeviceActivityArgs;
import kotlin.jvm.internal.o;

/* loaded from: classes11.dex */
public final class O6V implements Parcelable.Creator<LiveGameDualDeviceActivityArgs> {
    @Override // android.os.Parcelable.Creator
    public final LiveGameDualDeviceActivityArgs createFromParcel(Parcel parcel) {
        o.LJIIIZ(parcel, "parcel");
        return new LiveGameDualDeviceActivityArgs(parcel.readString(), parcel.readInt(), parcel.readString(), parcel.readInt(), parcel.readInt(), parcel.readInt());
    }

    @Override // android.os.Parcelable.Creator
    public final LiveGameDualDeviceActivityArgs[] newArray(int i) {
        return new LiveGameDualDeviceActivityArgs[i];
    }
}
