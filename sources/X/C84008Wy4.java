package X;

import android.os.Parcel;
import android.os.Parcelable;
import com.ss.android.ugc.asve.recorder.ASMediaSegment;
import kotlin.jvm.internal.o;

/* renamed from: X.Wy4, reason: case insensitive filesystem */
/* loaded from: classes15.dex */
public final class C84008Wy4 implements Parcelable.Creator<ASMediaSegment> {
    @Override // android.os.Parcelable.Creator
    public final ASMediaSegment createFromParcel(Parcel parcel) {
        o.LJIIIZ(parcel, "parcel");
        return new ASMediaSegment(parcel.readDouble(), parcel.readLong());
    }

    @Override // android.os.Parcelable.Creator
    public final ASMediaSegment[] newArray(int i) {
        return new ASMediaSegment[i];
    }
}
