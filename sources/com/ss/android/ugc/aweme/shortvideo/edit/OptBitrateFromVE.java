package com.ss.android.ugc.aweme.shortvideo.edit;

import X.C44542Hdy;
import X.F9E;
import android.os.Parcel;
import android.os.Parcelable;
import java.io.Serializable;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.o;

/* loaded from: classes8.dex */
public final class OptBitrateFromVE extends F9E implements Parcelable, Serializable {
    public static final Parcelable.Creator<OptBitrateFromVE> CREATOR = new C44542Hdy();
    public final float minOptBitrate;
    public final float minOptBitrateHD;
    public final float optBitrate;
    public final float optBitrateHD;

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public OptBitrateFromVE() {
        /*
            r7 = this;
            r1 = 0
            r5 = 15
            r6 = 0
            r0 = r7
            r2 = r1
            r3 = r1
            r4 = r1
            r0.<init>(r1, r2, r3, r4, r5, r6)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.shortvideo.edit.OptBitrateFromVE.<init>():void");
    }

    public static /* synthetic */ OptBitrateFromVE copy$default(OptBitrateFromVE optBitrateFromVE, float f, float f2, float f3, float f4, int i, Object obj) {
        if ((i & 1) != 0) {
            f = optBitrateFromVE.minOptBitrate;
        }
        if ((i & 2) != 0) {
            f2 = optBitrateFromVE.optBitrate;
        }
        if ((i & 4) != 0) {
            f3 = optBitrateFromVE.minOptBitrateHD;
        }
        if ((i & 8) != 0) {
            f4 = optBitrateFromVE.optBitrateHD;
        }
        return optBitrateFromVE.copy(f, f2, f3, f4);
    }

    public final OptBitrateFromVE copy(float f, float f2, float f3, float f4) {
        return new OptBitrateFromVE(f, f2, f3, f4);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @Override // X.F9E
    public Object[] getObjects() {
        return new Object[]{Float.valueOf(this.minOptBitrate), Float.valueOf(this.optBitrate), Float.valueOf(this.minOptBitrateHD), Float.valueOf(this.optBitrateHD)};
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel out, int i) {
        o.LJIIIZ(out, "out");
        out.writeFloat(this.minOptBitrate);
        out.writeFloat(this.optBitrate);
        out.writeFloat(this.minOptBitrateHD);
        out.writeFloat(this.optBitrateHD);
    }

    public final float getMinOptBitrate() {
        return this.minOptBitrate;
    }

    public final float getMinOptBitrateHD() {
        return this.minOptBitrateHD;
    }

    public final float getOptBitrate() {
        return this.optBitrate;
    }

    public final float getOptBitrateHD() {
        return this.optBitrateHD;
    }

    public OptBitrateFromVE(float f, float f2, float f3, float f4) {
        this.minOptBitrate = f;
        this.optBitrate = f2;
        this.minOptBitrateHD = f3;
        this.optBitrateHD = f4;
    }

    public /* synthetic */ OptBitrateFromVE(float f, float f2, float f3, float f4, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? 0.0f : f, (i & 2) != 0 ? 0.0f : f2, (i & 4) != 0 ? 0.0f : f3, (i & 8) != 0 ? 0.0f : f4);
    }
}
