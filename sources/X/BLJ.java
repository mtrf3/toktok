package X;

import android.os.Parcel;
import android.os.Parcelable;
import com.bytedance.android.livesdkapi.session.EnterRoomConfig;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import kotlin.jvm.internal.o;

/* loaded from: classes6.dex */
public final class BLJ implements Parcelable.Creator<EnterRoomConfig.LogData> {
    @Override // android.os.Parcelable.Creator
    public final EnterRoomConfig.LogData createFromParcel(Parcel parcel) {
        ArrayList arrayList;
        LinkedHashMap linkedHashMap;
        Integer valueOf;
        Integer valueOf2;
        Integer valueOf3;
        Integer valueOf4;
        Integer valueOf5;
        boolean z;
        boolean z2;
        o.LJIIIZ(parcel, "parcel");
        boolean z3 = false;
        Boolean bool = null;
        if (parcel.readInt() == 0) {
            arrayList = null;
        } else {
            int readInt = parcel.readInt();
            arrayList = new ArrayList(readInt);
            int i = 0;
            while (i != readInt) {
                i = C279117r.LIZIZ(EnterRoomConfig.CREATOR, parcel, arrayList, i, 1);
            }
        }
        if (parcel.readInt() == 0) {
            linkedHashMap = null;
        } else {
            int readInt2 = parcel.readInt();
            linkedHashMap = new LinkedHashMap(readInt2);
            for (int i2 = 0; i2 != readInt2; i2++) {
                linkedHashMap.put(parcel.readString(), parcel.readString());
            }
        }
        String readString = parcel.readString();
        String readString2 = parcel.readString();
        String readString3 = parcel.readString();
        String readString4 = parcel.readString();
        String readString5 = parcel.readString();
        String readString6 = parcel.readString();
        if (parcel.readInt() == 0) {
            valueOf = null;
        } else {
            valueOf = Integer.valueOf(parcel.readInt());
        }
        String readString7 = parcel.readString();
        if (parcel.readInt() == 0) {
            valueOf2 = null;
        } else {
            valueOf2 = Integer.valueOf(parcel.readInt());
        }
        if (parcel.readInt() == 0) {
            valueOf3 = null;
        } else {
            valueOf3 = Integer.valueOf(parcel.readInt());
        }
        if (parcel.readInt() == 0) {
            valueOf4 = null;
        } else {
            valueOf4 = Integer.valueOf(parcel.readInt());
        }
        if (parcel.readInt() == 0) {
            valueOf5 = null;
        } else {
            valueOf5 = Integer.valueOf(parcel.readInt());
        }
        String readString8 = parcel.readString();
        String readString9 = parcel.readString();
        String readString10 = parcel.readString();
        String readString11 = parcel.readString();
        long readLong = parcel.readLong();
        if (parcel.readInt() != 0) {
            z = true;
        } else {
            z = false;
        }
        String readString12 = parcel.readString();
        long readLong2 = parcel.readLong();
        String readString13 = parcel.readString();
        String readString14 = parcel.readString();
        String readString15 = parcel.readString();
        String readString16 = parcel.readString();
        String readString17 = parcel.readString();
        String readString18 = parcel.readString();
        long readLong3 = parcel.readLong();
        long readLong4 = parcel.readLong();
        long readLong5 = parcel.readLong();
        String readString19 = parcel.readString();
        String readString20 = parcel.readString();
        String readString21 = parcel.readString();
        String readString22 = parcel.readString();
        int readInt3 = parcel.readInt();
        String readString23 = parcel.readString();
        String readString24 = parcel.readString();
        String readString25 = parcel.readString();
        String readString26 = parcel.readString();
        String readString27 = parcel.readString();
        String readString28 = parcel.readString();
        String readString29 = parcel.readString();
        String readString30 = parcel.readString();
        String readString31 = parcel.readString();
        String readString32 = parcel.readString();
        int readInt4 = parcel.readInt();
        String readString33 = parcel.readString();
        String readString34 = parcel.readString();
        String readString35 = parcel.readString();
        String readString36 = parcel.readString();
        String readString37 = parcel.readString();
        String readString38 = parcel.readString();
        int readInt5 = parcel.readInt();
        if (parcel.readInt() != 0) {
            z2 = true;
        } else {
            z2 = false;
        }
        int readInt6 = parcel.readInt();
        String readString39 = parcel.readString();
        long readLong6 = parcel.readLong();
        long readLong7 = parcel.readLong();
        String readString40 = parcel.readString();
        int readInt7 = parcel.readInt();
        String readString41 = parcel.readString();
        String readString42 = parcel.readString();
        String readString43 = parcel.readString();
        String readString44 = parcel.readString();
        String readString45 = parcel.readString();
        int readInt8 = parcel.readInt();
        int readInt9 = parcel.readInt();
        int readInt10 = parcel.readInt();
        String readString46 = parcel.readString();
        if (parcel.readInt() != 0) {
            if (parcel.readInt() != 0) {
                z3 = true;
            }
            bool = Boolean.valueOf(z3);
        }
        return new EnterRoomConfig.LogData(arrayList, linkedHashMap, readString, readString2, readString3, readString4, readString5, readString6, valueOf, readString7, valueOf2, valueOf3, valueOf4, valueOf5, readString8, readString9, readString10, readString11, readLong, z, readString12, readLong2, readString13, readString14, readString15, readString16, readString17, readString18, readLong3, readLong4, readLong5, readString19, readString20, readString21, readString22, readInt3, readString23, readString24, readString25, readString26, readString27, readString28, readString29, readString30, readString31, readString32, readInt4, readString33, readString34, readString35, readString36, readString37, readString38, readInt5, z2, readInt6, readString39, readLong6, readLong7, readString40, readInt7, readString41, readString42, readString43, readString44, readString45, readInt8, readInt9, readInt10, readString46, bool);
    }

    @Override // android.os.Parcelable.Creator
    public final EnterRoomConfig.LogData[] newArray(int i) {
        return new EnterRoomConfig.LogData[i];
    }
}
