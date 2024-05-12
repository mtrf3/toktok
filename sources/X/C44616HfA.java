package X;

import android.os.Parcel;
import android.os.Parcelable;
import com.ss.android.ugc.aweme.shortvideo.edit.CompileProbeResult;
import kotlin.jvm.internal.o;

/* renamed from: X.HfA, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C44616HfA implements Parcelable.Creator<CompileProbeResult.ResultStatus> {
    @Override // android.os.Parcelable.Creator
    public final CompileProbeResult.ResultStatus createFromParcel(Parcel parcel) {
        o.LJIIIZ(parcel, "parcel");
        return new CompileProbeResult.ResultStatus(CompileProbeResult.State.CREATOR.createFromParcel(parcel), parcel.readInt(), parcel.readInt(), parcel.readString());
    }

    @Override // android.os.Parcelable.Creator
    public final CompileProbeResult.ResultStatus[] newArray(int i) {
        return new CompileProbeResult.ResultStatus[i];
    }
}
