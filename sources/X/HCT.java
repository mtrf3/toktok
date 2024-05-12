package X;

import android.os.Parcel;
import android.os.Parcelable;
import com.ss.android.ugc.aweme.shortvideo.jsbopenrecord.OptionalComponents;
import kotlin.jvm.internal.o;

/* loaded from: classes8.dex */
public final class HCT implements Parcelable.Creator<OptionalComponents> {
    @Override // android.os.Parcelable.Creator
    public final OptionalComponents createFromParcel(Parcel parcel) {
        boolean z;
        boolean z2;
        o.LJIIIZ(parcel, "parcel");
        boolean z3 = false;
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
        if (parcel.readInt() != 0) {
            z3 = true;
        }
        return new OptionalComponents(z, z2, z3);
    }

    @Override // android.os.Parcelable.Creator
    public final OptionalComponents[] newArray(int i) {
        return new OptionalComponents[i];
    }
}
