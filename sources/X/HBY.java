package X;

import android.os.Parcel;
import android.os.Parcelable;
import com.ss.android.ugc.aweme.shortvideo.jsbopenrecord.CompressConfig;
import java.util.ArrayList;
import kotlin.jvm.internal.o;

/* loaded from: classes8.dex */
public final class HBY implements Parcelable.Creator<CompressConfig> {
    @Override // android.os.Parcelable.Creator
    public final CompressConfig createFromParcel(Parcel parcel) {
        Float valueOf;
        Float valueOf2;
        o.LJIIIZ(parcel, "parcel");
        ArrayList arrayList = null;
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
            int readInt = parcel.readInt();
            arrayList = new ArrayList(readInt);
            for (int i = 0; i != readInt; i++) {
                arrayList.add(Integer.valueOf(parcel.readInt()));
            }
        }
        return new CompressConfig(valueOf, valueOf2, arrayList);
    }

    @Override // android.os.Parcelable.Creator
    public final CompressConfig[] newArray(int i) {
        return new CompressConfig[i];
    }
}
