package X;

import android.os.Parcel;
import android.os.Parcelable;
import com.ss.android.ugc.aweme.shortvideo.edit.OptBitrateFromVE;
import kotlin.jvm.internal.o;

/* renamed from: X.Hdy, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C44542Hdy implements Parcelable.Creator<OptBitrateFromVE> {
    @Override // android.os.Parcelable.Creator
    public final OptBitrateFromVE createFromParcel(Parcel parcel) {
        o.LJIIIZ(parcel, "parcel");
        return new OptBitrateFromVE(parcel.readFloat(), parcel.readFloat(), parcel.readFloat(), parcel.readFloat());
    }

    @Override // android.os.Parcelable.Creator
    public final OptBitrateFromVE[] newArray(int i) {
        return new OptBitrateFromVE[i];
    }
}
