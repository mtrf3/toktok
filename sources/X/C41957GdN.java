package X;

import android.os.Parcel;
import android.os.Parcelable;
import com.ss.android.ugc.aweme.creative.model.OnThisDayData;
import java.util.ArrayList;
import kotlin.jvm.internal.o;

/* renamed from: X.GdN, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C41957GdN implements Parcelable.Creator<OnThisDayData> {
    @Override // android.os.Parcelable.Creator
    public final OnThisDayData createFromParcel(Parcel parcel) {
        boolean z;
        boolean z2;
        o.LJIIIZ(parcel, "parcel");
        if (parcel.readInt() != 0) {
            z = true;
        } else {
            z = false;
        }
        int readInt = parcel.readInt();
        int readInt2 = parcel.readInt();
        String readString = parcel.readString();
        long readLong = parcel.readLong();
        int readInt3 = parcel.readInt();
        ArrayList arrayList = new ArrayList(readInt3);
        for (int i = 0; i != readInt3; i++) {
            arrayList.add(Integer.valueOf(parcel.readInt()));
        }
        if (parcel.readInt() != 0) {
            z2 = true;
        } else {
            z2 = false;
        }
        return new OnThisDayData(z, readInt, readInt2, readString, readLong, arrayList, z2);
    }

    @Override // android.os.Parcelable.Creator
    public final OnThisDayData[] newArray(int i) {
        return new OnThisDayData[i];
    }
}
