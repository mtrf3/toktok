package X;

import android.os.Parcel;
import android.os.Parcelable;
import com.ss.android.ugc.aweme.shortvideo.edit.CompileProbeResult;
import com.ss.android.ugc.aweme.shortvideo.edit.OptBitrateFromVE;
import kotlin.jvm.internal.o;

/* renamed from: X.HCl, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C43683HCl implements Parcelable.Creator<CompileProbeResult.ResultData> {
    @Override // android.os.Parcelable.Creator
    public final CompileProbeResult.ResultData createFromParcel(Parcel parcel) {
        o.LJIIIZ(parcel, "parcel");
        return new CompileProbeResult.ResultData(parcel.readInt(), parcel.readFloat(), parcel.readInt(), parcel.readInt(), parcel.readInt(), parcel.readInt(), parcel.readInt(), parcel.readFloat(), parcel.readInt(), parcel.readInt(), parcel.readDouble(), parcel.readInt(), parcel.readFloat(), OptBitrateFromVE.CREATOR.createFromParcel(parcel));
    }

    @Override // android.os.Parcelable.Creator
    public final CompileProbeResult.ResultData[] newArray(int i) {
        return new CompileProbeResult.ResultData[i];
    }
}
