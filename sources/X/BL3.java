package X;

import android.os.Parcel;
import android.os.Parcelable;
import com.bytedance.android.livesdkapi.session.EnterRoomConfig;
import kotlin.jvm.internal.o;

/* loaded from: classes6.dex */
public final class BL3 implements Parcelable.Creator<EnterRoomConfig.DrawParams> {
    @Override // android.os.Parcelable.Creator
    public final EnterRoomConfig.DrawParams createFromParcel(Parcel parcel) {
        boolean z;
        o.LJIIIZ(parcel, "parcel");
        boolean z2 = false;
        if (parcel.readInt() != 0) {
            z = true;
        } else {
            z = false;
        }
        if (parcel.readInt() != 0) {
            z2 = true;
        }
        return new EnterRoomConfig.DrawParams(z, z2);
    }

    @Override // android.os.Parcelable.Creator
    public final EnterRoomConfig.DrawParams[] newArray(int i) {
        return new EnterRoomConfig.DrawParams[i];
    }
}
