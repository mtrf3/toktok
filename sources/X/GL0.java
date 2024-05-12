package X;

import android.os.Parcel;
import android.os.Parcelable;
import com.ss.android.ugc.aweme.creative.model.AvatarUpdateInfoStruct;
import kotlin.jvm.internal.o;

/* loaded from: classes8.dex */
public final class GL0 implements Parcelable.Creator<AvatarUpdateInfoStruct> {
    @Override // android.os.Parcelable.Creator
    public final AvatarUpdateInfoStruct createFromParcel(Parcel parcel) {
        o.LJIIIZ(parcel, "parcel");
        return new AvatarUpdateInfoStruct(parcel.readString(), parcel.readString());
    }

    @Override // android.os.Parcelable.Creator
    public final AvatarUpdateInfoStruct[] newArray(int i) {
        return new AvatarUpdateInfoStruct[i];
    }
}
