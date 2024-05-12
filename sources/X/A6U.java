package X;

import android.os.Parcel;
import android.os.Parcelable;
import com.ss.android.ugc.aweme.profile.aigc.ProfileAIGCMainArg;
import kotlin.jvm.internal.o;

/* loaded from: classes5.dex */
public final class A6U implements Parcelable.Creator<ProfileAIGCMainArg> {
    @Override // android.os.Parcelable.Creator
    public final ProfileAIGCMainArg createFromParcel(Parcel parcel) {
        boolean z;
        Boolean valueOf;
        o.LJIIIZ(parcel, "parcel");
        String readString = parcel.readString();
        String readString2 = parcel.readString();
        if (parcel.readInt() == 0) {
            valueOf = null;
        } else {
            if (parcel.readInt() != 0) {
                z = true;
            } else {
                z = false;
            }
            valueOf = Boolean.valueOf(z);
        }
        return new ProfileAIGCMainArg(readString, readString2, valueOf, parcel.readString(), parcel.readString(), (C72121SSf) parcel.readSerializable());
    }

    @Override // android.os.Parcelable.Creator
    public final ProfileAIGCMainArg[] newArray(int i) {
        return new ProfileAIGCMainArg[i];
    }
}
