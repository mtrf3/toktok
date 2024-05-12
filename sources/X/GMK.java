package X;

import android.os.Parcel;
import android.os.Parcelable;
import com.ss.android.ugc.aweme.i18n.musically.cut.AvatarCutActivityArgs;
import kotlin.jvm.internal.o;

/* loaded from: classes8.dex */
public final class GMK implements Parcelable.Creator<AvatarCutActivityArgs> {
    @Override // android.os.Parcelable.Creator
    public final AvatarCutActivityArgs createFromParcel(Parcel parcel) {
        o.LJIIIZ(parcel, "parcel");
        return new AvatarCutActivityArgs(parcel.readString());
    }

    @Override // android.os.Parcelable.Creator
    public final AvatarCutActivityArgs[] newArray(int i) {
        return new AvatarCutActivityArgs[i];
    }
}
