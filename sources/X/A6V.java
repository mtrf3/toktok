package X;

import android.os.Parcel;
import android.os.Parcelable;
import com.ss.android.ugc.aweme.music.OriginMusicArg;
import com.ss.android.ugc.aweme.profile.model.User;
import kotlin.jvm.internal.o;

/* loaded from: classes5.dex */
public final class A6V implements Parcelable.Creator<OriginMusicArg> {
    @Override // android.os.Parcelable.Creator
    public final OriginMusicArg createFromParcel(Parcel parcel) {
        boolean z;
        o.LJIIIZ(parcel, "parcel");
        User user = (User) parcel.readSerializable();
        if (parcel.readInt() != 0) {
            z = true;
        } else {
            z = false;
        }
        return new OriginMusicArg(user, z, parcel.readString(), parcel.readString(), parcel.readInt(), parcel.readString());
    }

    @Override // android.os.Parcelable.Creator
    public final OriginMusicArg[] newArray(int i) {
        return new OriginMusicArg[i];
    }
}
