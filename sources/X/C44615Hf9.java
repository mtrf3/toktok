package X;

import android.os.Parcel;
import android.os.Parcelable;
import com.ss.android.ugc.aweme.shortvideo.edit.CompileProbeResult;
import kotlin.jvm.internal.o;

/* renamed from: X.Hf9, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C44615Hf9 implements Parcelable.Creator<CompileProbeResult> {
    @Override // android.os.Parcelable.Creator
    public final CompileProbeResult createFromParcel(Parcel parcel) {
        CompileProbeResult.ResultData createFromParcel;
        o.LJIIIZ(parcel, "parcel");
        CompileProbeResult.ResultStatus createFromParcel2 = CompileProbeResult.ResultStatus.CREATOR.createFromParcel(parcel);
        if (parcel.readInt() == 0) {
            createFromParcel = null;
        } else {
            createFromParcel = CompileProbeResult.ResultData.CREATOR.createFromParcel(parcel);
        }
        return new CompileProbeResult(createFromParcel2, createFromParcel, parcel.readInt());
    }

    @Override // android.os.Parcelable.Creator
    public final CompileProbeResult[] newArray(int i) {
        return new CompileProbeResult[i];
    }
}
