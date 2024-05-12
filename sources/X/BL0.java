package X;

import android.os.Parcel;
import android.os.Parcelable;
import com.bytedance.android.livesdkapi.session.EnterRoomConfig;
import kotlin.jvm.internal.o;

/* loaded from: classes6.dex */
public final class BL0 implements Parcelable.Creator<EnterRoomConfig.TimeStamp> {
    @Override // android.os.Parcelable.Creator
    public final EnterRoomConfig.TimeStamp createFromParcel(Parcel parcel) {
        Long valueOf;
        o.LJIIIZ(parcel, "parcel");
        long readLong = parcel.readLong();
        if (parcel.readInt() == 0) {
            valueOf = null;
        } else {
            valueOf = Long.valueOf(parcel.readLong());
        }
        return new EnterRoomConfig.TimeStamp(readLong, valueOf);
    }

    @Override // android.os.Parcelable.Creator
    public final EnterRoomConfig.TimeStamp[] newArray(int i) {
        return new EnterRoomConfig.TimeStamp[i];
    }
}
