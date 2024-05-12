package X;

import android.os.Parcel;
import android.os.Parcelable;
import com.ss.android.ugc.aweme.creative.model.PUgcTemplateData;
import java.util.ArrayList;
import kotlin.jvm.internal.o;

/* loaded from: classes8.dex */
public final class GL5 implements Parcelable.Creator<PUgcTemplateData> {
    @Override // android.os.Parcelable.Creator
    public final PUgcTemplateData createFromParcel(Parcel parcel) {
        boolean z;
        o.LJIIIZ(parcel, "parcel");
        String readString = parcel.readString();
        if (parcel.readInt() != 0) {
            z = true;
        } else {
            z = false;
        }
        ArrayList<String> createStringArrayList = parcel.createStringArrayList();
        int readInt = parcel.readInt();
        ArrayList arrayList = new ArrayList(readInt);
        for (int i = 0; i != readInt; i++) {
            arrayList.add(Integer.valueOf(parcel.readInt()));
        }
        String readString2 = parcel.readString();
        int readInt2 = parcel.readInt();
        int readInt3 = parcel.readInt();
        ArrayList arrayList2 = new ArrayList(readInt3);
        for (int i2 = 0; i2 != readInt3; i2++) {
            arrayList2.add(Integer.valueOf(parcel.readInt()));
        }
        return new PUgcTemplateData(readString, z, createStringArrayList, arrayList, readString2, readInt2, arrayList2);
    }

    @Override // android.os.Parcelable.Creator
    public final PUgcTemplateData[] newArray(int i) {
        return new PUgcTemplateData[i];
    }
}
