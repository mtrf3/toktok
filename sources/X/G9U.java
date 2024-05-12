package X;

import android.graphics.Bitmap;
import android.os.Parcel;
import android.os.Parcelable;
import com.ss.android.ugc.aweme.shortvideo.pugc.PUgcSlotData;
import kotlin.jvm.internal.o;

/* loaded from: classes8.dex */
public final class G9U implements Parcelable.Creator<PUgcSlotData> {
    @Override // android.os.Parcelable.Creator
    public final PUgcSlotData createFromParcel(Parcel parcel) {
        boolean z;
        o.LJIIIZ(parcel, "parcel");
        String readString = parcel.readString();
        String readString2 = parcel.readString();
        float readFloat = parcel.readFloat();
        boolean z2 = false;
        if (parcel.readInt() != 0) {
            z = true;
        } else {
            z = false;
        }
        if (parcel.readInt() != 0) {
            z2 = true;
        }
        return new PUgcSlotData(readString, readString2, readFloat, z, z2, parcel.readLong(), parcel.readFloat(), (Bitmap) parcel.readParcelable(PUgcSlotData.class.getClassLoader()));
    }

    @Override // android.os.Parcelable.Creator
    public final PUgcSlotData[] newArray(int i) {
        return new PUgcSlotData[i];
    }
}
