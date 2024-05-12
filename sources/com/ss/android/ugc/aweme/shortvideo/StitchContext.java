package com.ss.android.ugc.aweme.shortvideo;

import X.HBP;
import X.X1D;
import android.os.Parcel;
import android.os.Parcelable;
import com.ss.android.ugc.aweme.shortvideo.stitch.StitchParams;
import com.ss.android.ugc.aweme.shortvideo.ui.TimeSpeedModelExtension;
import kotlin.jvm.internal.o;

/* loaded from: classes8.dex */
public final class StitchContext implements Parcelable {
    public static final Parcelable.Creator<StitchContext> CREATOR = new HBP();
    public TimeSpeedModelExtension stitchClip;
    public StitchParams stitchParams;

    public StitchContext() {
        this(null, null);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof StitchContext)) {
            return false;
        }
        StitchContext stitchContext = (StitchContext) obj;
        return o.LJ(this.stitchParams, stitchContext.stitchParams) && o.LJ(this.stitchClip, stitchContext.stitchClip);
    }

    public final int hashCode() {
        StitchParams stitchParams = this.stitchParams;
        int hashCode = (stitchParams == null ? 0 : stitchParams.hashCode()) * 31;
        TimeSpeedModelExtension timeSpeedModelExtension = this.stitchClip;
        return hashCode + (timeSpeedModelExtension != null ? timeSpeedModelExtension.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("StitchContext(stitchParams=");
        LIZ.append(this.stitchParams);
        LIZ.append(", stitchClip=");
        LIZ.append(this.stitchClip);
        LIZ.append(')');
        return X1D.LIZIZ(LIZ);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel out, int i) {
        o.LJIIIZ(out, "out");
        out.writeParcelable(this.stitchParams, i);
        out.writeParcelable(this.stitchClip, i);
    }

    public StitchContext(StitchParams stitchParams, TimeSpeedModelExtension timeSpeedModelExtension) {
        this.stitchParams = stitchParams;
        this.stitchClip = timeSpeedModelExtension;
    }
}
