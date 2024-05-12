package X;

import android.os.Parcel;
import android.os.Parcelable;
import com.ss.android.ugc.aweme.shortvideo.edit.CompileProbeResult;
import kotlin.jvm.internal.o;

/* renamed from: X.Hlf, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C45019Hlf implements Parcelable.Creator<CompileProbeResult.State> {
    @Override // android.os.Parcelable.Creator
    public final CompileProbeResult.State createFromParcel(Parcel parcel) {
        o.LJIIIZ(parcel, "parcel");
        return CompileProbeResult.State.valueOf(parcel.readString());
    }

    @Override // android.os.Parcelable.Creator
    public final CompileProbeResult.State[] newArray(int i) {
        return new CompileProbeResult.State[i];
    }
}
