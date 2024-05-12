package X;

import android.os.Parcel;
import android.os.Parcelable;
import com.ss.android.ugc.gamora.recorder.localmedia.LocalMediaArgument;
import kotlin.jvm.internal.o;

/* loaded from: classes8.dex */
public final class HRN implements Parcelable.Creator<LocalMediaArgument> {
    @Override // android.os.Parcelable.Creator
    public final LocalMediaArgument createFromParcel(Parcel parcel) {
        boolean z;
        boolean z2;
        o.LJIIIZ(parcel, "parcel");
        int readInt = parcel.readInt();
        int readInt2 = parcel.readInt();
        int readInt3 = parcel.readInt();
        if (parcel.readByte() != 0) {
            z = true;
        } else {
            z = false;
        }
        int readInt4 = parcel.readInt();
        long readLong = parcel.readLong();
        int readInt5 = parcel.readInt();
        int readInt6 = parcel.readInt();
        int readInt7 = parcel.readInt();
        int readInt8 = parcel.readInt();
        int readInt9 = parcel.readInt();
        int readInt10 = parcel.readInt();
        if (parcel.readByte() != 0) {
            z2 = true;
        } else {
            z2 = false;
        }
        int readInt11 = parcel.readInt();
        int readInt12 = parcel.readInt();
        String readString = parcel.readString();
        String str = "";
        if (readString == null) {
            readString = "";
        }
        String readString2 = parcel.readString();
        if (readString2 != null) {
            str = readString2;
        }
        return new LocalMediaArgument(readInt, readInt2, readInt3, z, readInt4, readLong, readInt5, readInt6, readInt7, readInt8, readInt9, readInt10, z2, readInt11, readInt12, readString, str, null, 131072);
    }

    @Override // android.os.Parcelable.Creator
    public final LocalMediaArgument[] newArray(int i) {
        return new LocalMediaArgument[i];
    }
}
