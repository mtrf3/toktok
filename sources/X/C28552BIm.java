package X;

import android.os.Parcel;
import android.os.Parcelable;
import com.bytedance.android.livesdkapi.session.EnterRoomConfig;
import java.util.ArrayList;
import java.util.HashMap;
import kotlin.jvm.internal.o;

/* renamed from: X.BIm, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C28552BIm implements Parcelable.Creator<EnterRoomConfig.ECWrapData> {
    @Override // android.os.Parcelable.Creator
    public final EnterRoomConfig.ECWrapData createFromParcel(Parcel parcel) {
        HashMap hashMap;
        o.LJIIIZ(parcel, "parcel");
        int readInt = parcel.readInt();
        int readInt2 = parcel.readInt();
        String readString = parcel.readString();
        int readInt3 = parcel.readInt();
        HashMap hashMap2 = new HashMap(readInt3);
        for (int i = 0; i != readInt3; i++) {
            hashMap2.put(parcel.readString(), parcel.readString());
        }
        int readInt4 = parcel.readInt();
        int readInt5 = parcel.readInt();
        ArrayList arrayList = null;
        if (parcel.readInt() == 0) {
            hashMap = null;
        } else {
            int readInt6 = parcel.readInt();
            hashMap = new HashMap(readInt6);
            for (int i2 = 0; i2 != readInt6; i2++) {
                hashMap.put(parcel.readString(), parcel.readString());
            }
        }
        String readString2 = parcel.readString();
        if (parcel.readInt() != 0) {
            int readInt7 = parcel.readInt();
            arrayList = new ArrayList(readInt7);
            for (int i3 = 0; i3 != readInt7; i3++) {
                arrayList.add(Long.valueOf(parcel.readLong()));
            }
        }
        return new EnterRoomConfig.ECWrapData(readInt, readInt2, readString, hashMap2, readInt4, readInt5, hashMap, readString2, arrayList);
    }

    @Override // android.os.Parcelable.Creator
    public final EnterRoomConfig.ECWrapData[] newArray(int i) {
        return new EnterRoomConfig.ECWrapData[i];
    }
}
