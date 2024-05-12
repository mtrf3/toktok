package X;

import android.os.Parcel;
import android.os.Parcelable;
import com.ss.android.ugc.aweme.relation.ffp.FindFriendsPageArg;
import kotlin.jvm.internal.o;

/* loaded from: classes9.dex */
public final class KMX implements Parcelable.Creator<FindFriendsPageArg> {
    @Override // android.os.Parcelable.Creator
    public final FindFriendsPageArg createFromParcel(Parcel parcel) {
        boolean z;
        boolean z2;
        o.LJIIIZ(parcel, "parcel");
        if (parcel.readInt() != 0) {
            z = true;
        } else {
            z = false;
        }
        int readInt = parcel.readInt();
        String readString = parcel.readString();
        KMR valueOf = KMR.valueOf(parcel.readString());
        String readString2 = parcel.readString();
        int readInt2 = parcel.readInt();
        if (parcel.readInt() != 0) {
            z2 = true;
        } else {
            z2 = false;
        }
        return new FindFriendsPageArg(z, readInt, readString, valueOf, readString2, readInt2, z2);
    }

    @Override // android.os.Parcelable.Creator
    public final FindFriendsPageArg[] newArray(int i) {
        return new FindFriendsPageArg[i];
    }
}
