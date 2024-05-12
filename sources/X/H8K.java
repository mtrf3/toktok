package X;

import android.os.Parcel;
import android.os.Parcelable;
import com.ss.android.ugc.aweme.creative.model.EffectDataTransport;
import java.util.ArrayList;
import kotlin.jvm.internal.o;

/* loaded from: classes8.dex */
public final class H8K implements Parcelable.Creator<EffectDataTransport> {
    @Override // android.os.Parcelable.Creator
    public final EffectDataTransport createFromParcel(Parcel parcel) {
        ArrayList arrayList;
        o.LJIIIZ(parcel, "parcel");
        String readString = parcel.readString();
        if (parcel.readInt() == 0) {
            arrayList = null;
        } else {
            int readInt = parcel.readInt();
            arrayList = new ArrayList(readInt);
            for (int i = 0; i != readInt; i++) {
                arrayList.add(Long.valueOf(parcel.readLong()));
            }
        }
        return new EffectDataTransport(readString, arrayList);
    }

    @Override // android.os.Parcelable.Creator
    public final EffectDataTransport[] newArray(int i) {
        return new EffectDataTransport[i];
    }
}
