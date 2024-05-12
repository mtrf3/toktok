package com.ss.android.ugc.aweme.ad.settings;

import X.C221108m2;
import X.C59139NIx;
import X.C62822Ol8;
import X.InterfaceC65349Pkn;
import X.X1D;
import defpackage.b0;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* loaded from: classes11.dex */
public final class UploadAdWebPreloadInfoConfig {
    public static final UAWPIConfig LIZIZ;
    public static final UploadAdWebPreloadInfoConfig LIZ = new UploadAdWebPreloadInfoConfig();
    public static final C62822Ol8 LIZJ = C221108m2.LIZIZ(C59139NIx.LJLIL);

    /* loaded from: classes11.dex */
    public static final class UAWPIConfig {

        @InterfaceC65349Pkn("max_upload_fail_url")
        public final int maxUploadFailUrl;

        @InterfaceC65349Pkn("perf_rate")
        public final int perfRate;

        @InterfaceC65349Pkn("sampling_rate")
        public final int samplingRate;

        /* JADX WARN: Illegal instructions before constructor call */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public UAWPIConfig() {
            /*
                r6 = this;
                r1 = 0
                r4 = 7
                r5 = 0
                r0 = r6
                r2 = r1
                r3 = r1
                r0.<init>(r1, r2, r3, r4, r5)
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.ad.settings.UploadAdWebPreloadInfoConfig.UAWPIConfig.<init>():void");
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof UAWPIConfig)) {
                return false;
            }
            UAWPIConfig uAWPIConfig = (UAWPIConfig) obj;
            return this.maxUploadFailUrl == uAWPIConfig.maxUploadFailUrl && this.samplingRate == uAWPIConfig.samplingRate && this.perfRate == uAWPIConfig.perfRate;
        }

        public final int hashCode() {
            return (((this.maxUploadFailUrl * 31) + this.samplingRate) * 31) + this.perfRate;
        }

        public final String toString() {
            StringBuilder LIZ = X1D.LIZ();
            LIZ.append("UAWPIConfig(maxUploadFailUrl=");
            LIZ.append(this.maxUploadFailUrl);
            LIZ.append(", samplingRate=");
            LIZ.append(this.samplingRate);
            LIZ.append(", perfRate=");
            return b0.LIZJ(LIZ, this.perfRate, ')', LIZ);
        }

        public UAWPIConfig(int i, int i2, int i3) {
            this.maxUploadFailUrl = i;
            this.samplingRate = i2;
            this.perfRate = i3;
        }

        public /* synthetic */ UAWPIConfig(int i, int i2, int i3, int i4, DefaultConstructorMarker defaultConstructorMarker) {
            this((i4 & 1) != 0 ? 50 : i, (i4 & 2) != 0 ? 3 : i2, (i4 & 4) != 0 ? 4 : i3);
        }
    }

    static {
        int i = 0;
        LIZIZ = new UAWPIConfig(i, i, i, 7, null);
    }

    public static final UAWPIConfig LIZ() {
        return (UAWPIConfig) LIZJ.getValue();
    }
}
