package X;

import android.os.Parcel;
import android.os.Parcelable;
import com.ss.android.ugc.aweme.shortvideo.jsb.comment.ExteriorRecordModel;
import java.util.ArrayList;
import kotlin.jvm.internal.o;

/* loaded from: classes8.dex */
public final class HB6 implements Parcelable.Creator<ExteriorRecordModel> {
    @Override // android.os.Parcelable.Creator
    public final ExteriorRecordModel createFromParcel(Parcel parcel) {
        Float valueOf;
        Float valueOf2;
        boolean z;
        o.LJIIIZ(parcel, "parcel");
        HB8 valueOf3 = HB8.valueOf(parcel.readString());
        int readInt = parcel.readInt();
        ArrayList arrayList = new ArrayList(readInt);
        for (int i = 0; i != readInt; i++) {
            arrayList.add(HUJ.valueOf(parcel.readString()));
        }
        HB9 valueOf4 = HB9.valueOf(parcel.readString());
        long readLong = parcel.readLong();
        long readLong2 = parcel.readLong();
        int readInt2 = parcel.readInt();
        int readInt3 = parcel.readInt();
        ArrayList arrayList2 = null;
        if (parcel.readInt() == 0) {
            valueOf = null;
        } else {
            valueOf = Float.valueOf(parcel.readFloat());
        }
        if (parcel.readInt() == 0) {
            valueOf2 = null;
        } else {
            valueOf2 = Float.valueOf(parcel.readFloat());
        }
        if (parcel.readInt() != 0) {
            int readInt4 = parcel.readInt();
            arrayList2 = new ArrayList(readInt4);
            for (int i2 = 0; i2 != readInt4; i2++) {
                arrayList2.add(Integer.valueOf(parcel.readInt()));
            }
        }
        if (parcel.readInt() != 0) {
            z = true;
        } else {
            z = false;
        }
        return new ExteriorRecordModel(valueOf3, arrayList, valueOf4, readLong, readLong2, readInt2, readInt3, valueOf, valueOf2, arrayList2, z, parcel.readString());
    }

    @Override // android.os.Parcelable.Creator
    public final ExteriorRecordModel[] newArray(int i) {
        return new ExteriorRecordModel[i];
    }
}
