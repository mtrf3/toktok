package X;

import android.os.Parcel;
import android.os.Parcelable;
import com.ss.android.ugc.aweme.profile.MiniUser;
import kotlin.jvm.internal.o;

/* loaded from: classes11.dex */
public final class OS8 implements Parcelable.Creator<MiniUser> {
    @Override // android.os.Parcelable.Creator
    public final MiniUser createFromParcel(Parcel parcel) {
        boolean z;
        o.LJIIIZ(parcel, "parcel");
        String readString = parcel.readString();
        String readString2 = parcel.readString();
        String readString3 = parcel.readString();
        int readInt = parcel.readInt();
        int readInt2 = parcel.readInt();
        String readString4 = parcel.readString();
        if (parcel.readInt() != 0) {
            z = true;
        } else {
            z = false;
        }
        return new MiniUser(z, readString, readInt, readString2, readInt2, readString3, readString4, parcel.readString(), parcel.readString());
    }

    @Override // android.os.Parcelable.Creator
    public final MiniUser[] newArray(int i) {
        return new MiniUser[i];
    }
}
