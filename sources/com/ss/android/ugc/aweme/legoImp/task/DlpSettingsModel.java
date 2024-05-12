package com.ss.android.ugc.aweme.legoImp.task;

import X.F9E;
import X.InterfaceC65349Pkn;
import com.bytedance.android.livesdk.livesetting.linkmic.LivesdkLinkmicFloatWindowOptimizeSetting;

/* loaded from: classes7.dex */
public final class DlpSettingsModel extends F9E {

    @InterfaceC65349Pkn("analyser")
    public final int analyser;

    @InterfaceC65349Pkn("breached_threshold")
    public final double breachedThreshold;

    @InterfaceC65349Pkn("enabled")
    public final boolean enabled;

    @InterfaceC65349Pkn("pack_size")
    public final int packSize;

    @InterfaceC65349Pkn("sample_rate")
    public final double sampleRate;

    public DlpSettingsModel() {
        this(false, LivesdkLinkmicFloatWindowOptimizeSetting.CORNER_RADIUS_PX, 0, LivesdkLinkmicFloatWindowOptimizeSetting.CORNER_RADIUS_PX, 0, 31, null);
    }

    @Override // X.F9E
    public final Object[] getObjects() {
        return new Object[]{Boolean.valueOf(this.enabled), Double.valueOf(this.sampleRate), Integer.valueOf(this.analyser), Double.valueOf(this.breachedThreshold), Integer.valueOf(this.packSize)};
    }

    public DlpSettingsModel(boolean z, double d, int i, double d2, int i2) {
        this.enabled = z;
        this.sampleRate = d;
        this.analyser = i;
        this.breachedThreshold = d2;
        this.packSize = i2;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public DlpSettingsModel(boolean r3, double r4, int r6, double r7, int r9, int r10, kotlin.jvm.internal.DefaultConstructorMarker r11) {
        /*
            r2 = this;
            r0 = r10 & 1
            java.lang.String r1 = "local_test"
            if (r0 == 0) goto Lc
            java.lang.String r0 = X.EF7.LJIILIIL
            boolean r3 = kotlin.jvm.internal.o.LJ(r0, r1)
        Lc:
            r0 = r10 & 2
            if (r0 == 0) goto L1d
            java.lang.String r0 = X.EF7.LJIILIIL
            boolean r0 = kotlin.jvm.internal.o.LJ(r0, r1)
            if (r0 == 0) goto L34
            r4 = 4572414629676717179(0x3f747ae147ae147b, double:0.005)
        L1d:
            r0 = r10 & 4
            if (r0 == 0) goto L22
            r6 = 1
        L22:
            r0 = r10 & 8
            if (r0 == 0) goto L2b
            r7 = 4606281698874543309(0x3feccccccccccccd, double:0.9)
        L2b:
            r0 = r10 & 16
            if (r0 == 0) goto L30
            r9 = 1
        L30:
            r2.<init>(r3, r4, r6, r7, r9)
            return
        L34:
            r4 = 4557750909289998844(0x3f40624dd2f1a9fc, double:5.0E-4)
            goto L1d
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.legoImp.task.DlpSettingsModel.<init>(boolean, double, int, double, int, int, kotlin.jvm.internal.DefaultConstructorMarker):void");
    }
}
