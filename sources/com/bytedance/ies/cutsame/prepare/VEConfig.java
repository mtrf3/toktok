package com.bytedance.ies.cutsame.prepare;

import X.C44621HfF;
import X.F9E;
import X.InterfaceC65349Pkn;
import X.InterfaceC88472Yns;
import android.os.Parcel;
import android.os.Parcelable;
import kotlin.jvm.internal.AqS173S0100000_7;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.o;

/* loaded from: classes8.dex */
public final class VEConfig extends F9E implements Parcelable {
    public static final C44621HfF CREATOR = new C44621HfF();

    @InterfaceC65349Pkn("bps_config")
    public final VECompileBpsConfig bpsConfig;
    public final InterfaceC88472Yns<Integer, Integer> bpsGenerator;

    @InterfaceC65349Pkn("bps")
    public final int defaultBps;

    @InterfaceC65349Pkn("encodeProfile")
    public final String encodeProfile;

    @InterfaceC65349Pkn("feature_switch")
    public final FeatureConfig featureConfig;

    @InterfaceC65349Pkn("fps")
    public final int fps;

    @InterfaceC65349Pkn("gopSize")
    public final int gopSize;

    @InterfaceC65349Pkn("hw")
    public final boolean hardware;

    /* JADX WARN: Multi-variable type inference failed */
    public VEConfig() {
        this(false, 0 == true ? 1 : 0, 0 == true ? 1 : 0, null, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 127, 0 == true ? 1 : 0);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // X.F9E
    public final Object[] getObjects() {
        return new Object[]{Boolean.valueOf(this.hardware), Integer.valueOf(this.fps), Integer.valueOf(this.gopSize), this.bpsConfig, Integer.valueOf(this.defaultBps), this.encodeProfile, this.featureConfig};
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public VEConfig(android.os.Parcel r15) {
        /*
            r14 = this;
            java.lang.String r0 = "parcel"
            r1 = r15
            kotlin.jvm.internal.o.LJIIIZ(r1, r0)
            byte r2 = r1.readByte()
            r9 = 0
            r0 = 1
            if (r2 != r0) goto L5d
            r2 = 1
        Lf:
            int r3 = r1.readInt()
            int r4 = r1.readInt()
            X.HfE r0 = com.bytedance.ies.cutsame.prepare.VECompileBpsConfig.CREATOR
            java.lang.Class r0 = r0.getClass()
            java.lang.ClassLoader r0 = r0.getClassLoader()
            android.os.Parcelable r5 = r1.readParcelable(r0)
            com.bytedance.ies.cutsame.prepare.VECompileBpsConfig r5 = (com.bytedance.ies.cutsame.prepare.VECompileBpsConfig) r5
            if (r5 != 0) goto L33
            com.bytedance.ies.cutsame.prepare.VECompileBpsConfig r5 = new com.bytedance.ies.cutsame.prepare.VECompileBpsConfig
            r12 = 7
            r13 = 0
            r8 = r5
            r10 = r9
            r11 = r9
            r8.<init>(r9, r10, r11, r12, r13)
        L33:
            int r6 = r1.readInt()
            java.lang.String r7 = r1.readString()
            if (r7 != 0) goto L3f
            java.lang.String r7 = "high"
        L3f:
            X.HfD r0 = com.bytedance.ies.cutsame.prepare.FeatureConfig.CREATOR
            java.lang.Class r0 = r0.getClass()
            java.lang.ClassLoader r0 = r0.getClassLoader()
            android.os.Parcelable r8 = r1.readParcelable(r0)
            com.bytedance.ies.cutsame.prepare.FeatureConfig r8 = (com.bytedance.ies.cutsame.prepare.FeatureConfig) r8
            if (r8 != 0) goto L58
            com.bytedance.ies.cutsame.prepare.FeatureConfig r8 = new com.bytedance.ies.cutsame.prepare.FeatureConfig
            r1 = 3
            r0 = 0
            r8.<init>(r9, r9, r1, r0)
        L58:
            r1 = r14
            r1.<init>(r2, r3, r4, r5, r6, r7, r8)
            return
        L5d:
            r2 = 0
            goto Lf
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.ies.cutsame.prepare.VEConfig.<init>(android.os.Parcel):void");
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        if (parcel == null) {
            return;
        }
        parcel.writeByte(this.hardware ? (byte) 1 : (byte) 0);
        parcel.writeInt(this.fps);
        parcel.writeInt(this.gopSize);
        parcel.writeParcelable(this.bpsConfig, i);
        parcel.writeInt(this.defaultBps);
        parcel.writeString(this.encodeProfile);
        parcel.writeParcelable(this.featureConfig, i);
    }

    public VEConfig(boolean z, int i, int i2, VECompileBpsConfig bpsConfig, int i3, String encodeProfile, FeatureConfig featureConfig) {
        o.LJIIIZ(bpsConfig, "bpsConfig");
        o.LJIIIZ(encodeProfile, "encodeProfile");
        o.LJIIIZ(featureConfig, "featureConfig");
        this.hardware = z;
        this.fps = i;
        this.gopSize = i2;
        this.bpsConfig = bpsConfig;
        this.defaultBps = i3;
        this.encodeProfile = encodeProfile;
        this.featureConfig = featureConfig;
        this.bpsGenerator = new AqS173S0100000_7(this, 33);
    }

    public /* synthetic */ VEConfig(boolean z, int i, int i2, VECompileBpsConfig vECompileBpsConfig, int i3, String str, FeatureConfig featureConfig, int i4, DefaultConstructorMarker defaultConstructorMarker) {
        this((i4 & 1) != 0 ? true : z, (i4 & 2) != 0 ? 30 : i, (i4 & 4) != 0 ? 35 : i2, (i4 & 8) != 0 ? new VECompileBpsConfig(0, 0, false, 7, null) : vECompileBpsConfig, (i4 & 16) != 0 ? 10000000 : i3, (i4 & 32) != 0 ? "high" : str, (i4 & 64) != 0 ? new FeatureConfig(0, 0, 3, null) : featureConfig);
    }
}
