package X;

import android.os.Parcel;
import android.os.Parcelable;
import com.bytedance.android.livesdkapi.session.EnterRoomConfig;
import kotlin.jvm.internal.o;

/* loaded from: classes6.dex */
public final class BJR implements Parcelable.Creator<EnterRoomConfig.StreamData> {
    @Override // android.os.Parcelable.Creator
    public final EnterRoomConfig.StreamData createFromParcel(Parcel parcel) {
        boolean z;
        boolean z2;
        boolean z3;
        boolean z4;
        o.LJIIIZ(parcel, "parcel");
        String readString = parcel.readString();
        String readString2 = parcel.readString();
        String readString3 = parcel.readString();
        String readString4 = parcel.readString();
        String readString5 = parcel.readString();
        String readString6 = parcel.readString();
        if (parcel.readInt() != 0) {
            z = true;
        } else {
            z = false;
        }
        if (parcel.readInt() != 0) {
            z2 = true;
        } else {
            z2 = false;
        }
        int readInt = parcel.readInt();
        int readInt2 = parcel.readInt();
        if (parcel.readInt() != 0) {
            z3 = true;
        } else {
            z3 = false;
        }
        long readLong = parcel.readLong();
        if (parcel.readInt() != 0) {
            z4 = true;
        } else {
            z4 = false;
        }
        return new EnterRoomConfig.StreamData(readString, readString2, readString3, readString4, readString5, readString6, z, z2, readInt, readInt2, z3, readLong, z4, parcel.readLong());
    }

    @Override // android.os.Parcelable.Creator
    public final EnterRoomConfig.StreamData[] newArray(int i) {
        return new EnterRoomConfig.StreamData[i];
    }
}
