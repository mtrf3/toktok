package X;

import android.graphics.Rect;
import android.os.Parcel;
import android.os.Parcelable;
import com.bytedance.android.livesdk.model.AdLiveEnterRoomConfig;
import com.bytedance.android.livesdkapi.session.EnterRoomConfig;
import com.bytedance.android.livesdkapi.session.deeplink.DeepLinkData;
import java.util.ArrayList;
import kotlin.jvm.internal.o;

/* renamed from: X.BKz, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C28617BKz implements Parcelable.Creator<EnterRoomConfig.RoomsData> {
    @Override // android.os.Parcelable.Creator
    public final EnterRoomConfig.RoomsData createFromParcel(Parcel parcel) {
        boolean z;
        boolean z2;
        boolean z3;
        boolean z4;
        boolean z5;
        AdLiveEnterRoomConfig createFromParcel;
        boolean z6;
        boolean z7;
        Boolean valueOf;
        boolean z8;
        boolean z9;
        boolean z10;
        EnterRoomConfig.TimeStamp createFromParcel2;
        boolean z11;
        boolean z12;
        boolean z13;
        boolean z14;
        boolean z15;
        boolean z16;
        boolean z17;
        o.LJIIIZ(parcel, "parcel");
        if (parcel.readInt() != 0) {
            z = true;
        } else {
            z = false;
        }
        if (parcel.readInt() != 0) {
            z2 = true;
        } else {
            z2 = false;
        }
        String readString = parcel.readString();
        if (parcel.readInt() != 0) {
            z3 = true;
        } else {
            z3 = false;
        }
        if (parcel.readInt() != 0) {
            z4 = true;
        } else {
            z4 = false;
        }
        String readString2 = parcel.readString();
        String readString3 = parcel.readString();
        String readString4 = parcel.readString();
        if (parcel.readInt() != 0) {
            z5 = true;
        } else {
            z5 = false;
        }
        String readString5 = parcel.readString();
        String readString6 = parcel.readString();
        String readString7 = parcel.readString();
        EnterRoomConfig.GuestUser guestUser = null;
        if (parcel.readInt() == 0) {
            createFromParcel = null;
        } else {
            createFromParcel = AdLiveEnterRoomConfig.CREATOR.createFromParcel(parcel);
        }
        AdLiveEnterRoomConfig adLiveEnterRoomConfig = createFromParcel;
        if (parcel.readInt() != 0) {
            z6 = true;
        } else {
            z6 = false;
        }
        String readString8 = parcel.readString();
        DeepLinkData deepLinkData = (DeepLinkData) parcel.readParcelable(EnterRoomConfig.RoomsData.class.getClassLoader());
        int readInt = parcel.readInt();
        String readString9 = parcel.readString();
        int readInt2 = parcel.readInt();
        int readInt3 = parcel.readInt();
        String readString10 = parcel.readString();
        long readLong = parcel.readLong();
        if (parcel.readInt() == 0) {
            valueOf = null;
        } else {
            if (parcel.readInt() != 0) {
                z7 = true;
            } else {
                z7 = false;
            }
            valueOf = Boolean.valueOf(z7);
        }
        ArrayList<String> createStringArrayList = parcel.createStringArrayList();
        ArrayList<String> createStringArrayList2 = parcel.createStringArrayList();
        String readString11 = parcel.readString();
        String readString12 = parcel.readString();
        if (parcel.readInt() != 0) {
            z8 = true;
        } else {
            z8 = false;
        }
        String readString13 = parcel.readString();
        String readString14 = parcel.readString();
        String readString15 = parcel.readString();
        String readString16 = parcel.readString();
        String readString17 = parcel.readString();
        String readString18 = parcel.readString();
        String readString19 = parcel.readString();
        int readInt4 = parcel.readInt();
        Rect rect = (Rect) parcel.readParcelable(EnterRoomConfig.RoomsData.class.getClassLoader());
        long[] createLongArray = parcel.createLongArray();
        String readString20 = parcel.readString();
        if (parcel.readInt() != 0) {
            z9 = true;
        } else {
            z9 = false;
        }
        String readString21 = parcel.readString();
        String readString22 = parcel.readString();
        if (parcel.readInt() != 0) {
            z10 = true;
        } else {
            z10 = false;
        }
        String readString23 = parcel.readString();
        String readString24 = parcel.readString();
        long readLong2 = parcel.readLong();
        String readString25 = parcel.readString();
        int readInt5 = parcel.readInt();
        String readString26 = parcel.readString();
        String readString27 = parcel.readString();
        long readLong3 = parcel.readLong();
        String readString28 = parcel.readString();
        String readString29 = parcel.readString();
        String readString30 = parcel.readString();
        String readString31 = parcel.readString();
        long readLong4 = parcel.readLong();
        if (parcel.readInt() == 0) {
            createFromParcel2 = null;
        } else {
            createFromParcel2 = EnterRoomConfig.TimeStamp.CREATOR.createFromParcel(parcel);
        }
        EnterRoomConfig.TimeStamp timeStamp = createFromParcel2;
        if (parcel.readInt() != 0) {
            z11 = true;
        } else {
            z11 = false;
        }
        String readString32 = parcel.readString();
        long readLong5 = parcel.readLong();
        if (parcel.readInt() != 0) {
            z12 = true;
        } else {
            z12 = false;
        }
        if (parcel.readInt() != 0) {
            z13 = true;
        } else {
            z13 = false;
        }
        if (parcel.readInt() != 0) {
            z14 = true;
        } else {
            z14 = false;
        }
        long readLong6 = parcel.readLong();
        long readLong7 = parcel.readLong();
        if (parcel.readInt() != 0) {
            z15 = true;
        } else {
            z15 = false;
        }
        long readLong8 = parcel.readLong();
        if (parcel.readInt() != 0) {
            z16 = true;
        } else {
            z16 = false;
        }
        String readString33 = parcel.readString();
        if (parcel.readInt() != 0) {
            guestUser = EnterRoomConfig.GuestUser.CREATOR.createFromParcel(parcel);
        }
        EnterRoomConfig.GuestUser guestUser2 = guestUser;
        String readString34 = parcel.readString();
        if (parcel.readInt() != 0) {
            z17 = true;
        } else {
            z17 = false;
        }
        return new EnterRoomConfig.RoomsData(z, z2, readString, z3, z4, readString2, readString3, readString4, z5, readString5, readString6, readString7, adLiveEnterRoomConfig, z6, readString8, deepLinkData, readInt, readString9, readInt2, readInt3, readString10, readLong, valueOf, createStringArrayList, createStringArrayList2, readString11, readString12, z8, readString13, readString14, readString15, readString16, readString17, readString18, readString19, readInt4, rect, createLongArray, readString20, z9, readString21, readString22, z10, readString23, readString24, readLong2, readString25, readInt5, readString26, readString27, readLong3, readString28, readString29, readString30, readString31, readLong4, timeStamp, z11, readString32, readLong5, z12, z13, z14, readLong6, readLong7, z15, readLong8, z16, readString33, guestUser2, readString34, z17, parcel.readString(), parcel.readInt(), parcel.readString(), parcel.readString(), parcel.readInt(), parcel.readInt(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readInt(), parcel.readInt(), parcel.readInt());
    }

    @Override // android.os.Parcelable.Creator
    public final EnterRoomConfig.RoomsData[] newArray(int i) {
        return new EnterRoomConfig.RoomsData[i];
    }
}
