package X;

import android.os.Parcel;
import android.os.Parcelable;
import com.ss.android.ugc.aweme.creative.model.MirrorMode;
import kotlin.jvm.internal.o;

/* loaded from: classes8.dex */
public final class H8P implements Parcelable.Creator<MirrorMode> {
    @Override // android.os.Parcelable.Creator
    public final MirrorMode createFromParcel(Parcel parcel) {
        boolean z;
        o.LJIIIZ(parcel, "parcel");
        boolean z2 = false;
        if (parcel.readInt() != 0) {
            z = true;
        } else {
            z = false;
        }
        if (parcel.readInt() != 0) {
            z2 = true;
        }
        return new MirrorMode(z, z2);
    }

    @Override // android.os.Parcelable.Creator
    public final MirrorMode[] newArray(int i) {
        return new MirrorMode[i];
    }
}
