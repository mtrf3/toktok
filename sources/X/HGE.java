package X;

import android.os.Parcel;
import android.os.Parcelable;
import com.ss.android.ugc.aweme.tools.policysecurity.OriginalSoundUploadTask;
import kotlin.jvm.internal.o;

/* loaded from: classes8.dex */
public final class HGE implements Parcelable.Creator<OriginalSoundUploadTask> {
    @Override // android.os.Parcelable.Creator
    public final OriginalSoundUploadTask createFromParcel(Parcel parcel) {
        boolean z;
        o.LJIIIZ(parcel, "parcel");
        String readString = parcel.readString();
        String readString2 = parcel.readString();
        String readString3 = parcel.readString();
        long readLong = parcel.readLong();
        String readString4 = parcel.readString();
        String readString5 = parcel.readString();
        int readInt = parcel.readInt();
        boolean z2 = false;
        if (parcel.readInt() != 0) {
            z = true;
        } else {
            z = false;
        }
        int readInt2 = parcel.readInt();
        if (parcel.readInt() != 0) {
            z2 = true;
        }
        return new OriginalSoundUploadTask(readString, readString2, readString3, readLong, readString4, readString5, readInt, z, readInt2, z2, parcel.readInt());
    }

    @Override // android.os.Parcelable.Creator
    public final OriginalSoundUploadTask[] newArray(int i) {
        return new OriginalSoundUploadTask[i];
    }
}
