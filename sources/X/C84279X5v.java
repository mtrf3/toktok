package X;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import com.ss.android.ugc.aweme.profile.arg.UserProfileArg;
import java.util.HashMap;
import kotlin.jvm.internal.o;

/* renamed from: X.X5v, reason: case insensitive filesystem */
/* loaded from: classes16.dex */
public final class C84279X5v implements Parcelable.Creator<UserProfileArg> {
    @Override // android.os.Parcelable.Creator
    public final UserProfileArg createFromParcel(Parcel parcel) {
        Integer valueOf;
        boolean z;
        o.LJIIIZ(parcel, "parcel");
        String readString = parcel.readString();
        String readString2 = parcel.readString();
        String readString3 = parcel.readString();
        String readString4 = parcel.readString();
        String readString5 = parcel.readString();
        String readString6 = parcel.readString();
        String readString7 = parcel.readString();
        String readString8 = parcel.readString();
        String readString9 = parcel.readString();
        HashMap hashMap = null;
        if (parcel.readInt() == 0) {
            valueOf = null;
        } else {
            valueOf = Integer.valueOf(parcel.readInt());
        }
        String readString10 = parcel.readString();
        String readString11 = parcel.readString();
        String readString12 = parcel.readString();
        String readString13 = parcel.readString();
        String readString14 = parcel.readString();
        String readString15 = parcel.readString();
        String readString16 = parcel.readString();
        if (parcel.readInt() != 0) {
            z = true;
        } else {
            z = false;
        }
        String readString17 = parcel.readString();
        String readString18 = parcel.readString();
        String readString19 = parcel.readString();
        String readString20 = parcel.readString();
        String readString21 = parcel.readString();
        String readString22 = parcel.readString();
        String readString23 = parcel.readString();
        String readString24 = parcel.readString();
        String readString25 = parcel.readString();
        String readString26 = parcel.readString();
        String readString27 = parcel.readString();
        Bundle readBundle = parcel.readBundle();
        String readString28 = parcel.readString();
        if (parcel.readInt() != 0) {
            int readInt = parcel.readInt();
            hashMap = new HashMap(readInt);
            for (int i = 0; i != readInt; i++) {
                hashMap.put(parcel.readString(), parcel.readString());
            }
        }
        return new UserProfileArg(readString, readString2, readString3, readString4, readString5, readString6, readString7, readString8, readString9, valueOf, readString10, readString11, readString12, readString13, readString14, readString15, readString16, z, readString17, readString18, readString19, readString20, readString21, readString22, readString23, readString24, readString25, readString26, readString27, readBundle, readString28, hashMap);
    }

    @Override // android.os.Parcelable.Creator
    public final UserProfileArg[] newArray(int i) {
        return new UserProfileArg[i];
    }
}
