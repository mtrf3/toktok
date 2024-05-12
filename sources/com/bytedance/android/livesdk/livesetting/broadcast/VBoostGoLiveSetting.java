package com.bytedance.android.livesdk.livesetting.broadcast;

import X.C162476Zf;
import X.C32017ChR;
import X.EnumC32018ChS;
import X.InterfaceC65349Pkn;
import com.bytedance.android.live.annotation.Group;
import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.o;

@SettingsKey("webcast_broadcast_go_live_vboost_time")
/* loaded from: classes6.dex */
public final class VBoostGoLiveSetting {

    @Group(isDefault = true, value = "default group")
    public static final VBoostSettings DEFAULT;
    public static final VBoostGoLiveSetting INSTANCE = new VBoostGoLiveSetting();

    static {
        long j = 0;
        DEFAULT = new VBoostSettings(0, j, j, j, 15, null);
    }

    public final long getTime(EnumC32018ChS type) {
        o.LJIIIZ(type, "type");
        VBoostSettings vBoostSettings = (VBoostSettings) SettingsManager.INSTANCE.getValueSafely(VBoostGoLiveSetting.class);
        if (vBoostSettings == null) {
            vBoostSettings = DEFAULT;
        }
        int i = C32017ChR.LIZ[type.ordinal()];
        if (i != 1) {
            if (i != 2) {
                if (i == 3) {
                    return vBoostSettings.gpuTime;
                }
                throw new C162476Zf();
            }
            return vBoostSettings.cpuCoreTime;
        }
        return vBoostSettings.cpuTime;
    }

    public final boolean isEnable(EnumC32018ChS type) {
        o.LJIIIZ(type, "type");
        VBoostSettings vBoostSettings = (VBoostSettings) SettingsManager.INSTANCE.getValueSafely(VBoostGoLiveSetting.class);
        if (vBoostSettings == null) {
            vBoostSettings = DEFAULT;
        }
        if ((vBoostSettings.settings & type.getValue()) == type.getValue()) {
            return true;
        }
        return false;
    }

    /* loaded from: classes6.dex */
    public static final class VBoostSettings {

        @InterfaceC65349Pkn("webcast_broadcast_go_live_vboost_cpu_core_time")
        public long cpuCoreTime;

        @InterfaceC65349Pkn("webcast_broadcast_go_live_vboost_cpu_time")
        public long cpuTime;

        @InterfaceC65349Pkn("webcast_broadcast_go_live_vboost_gpu_time")
        public long gpuTime;

        @InterfaceC65349Pkn("webcast_broadcast_go_live_vboost_settings")
        public int settings;

        /* JADX WARN: Illegal instructions before constructor call */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public VBoostSettings() {
            /*
                r10 = this;
                r1 = 0
                r2 = 0
                r8 = 15
                r9 = 0
                r0 = r10
                r4 = r2
                r6 = r2
                r0.<init>(r1, r2, r4, r6, r8, r9)
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.bytedance.android.livesdk.livesetting.broadcast.VBoostGoLiveSetting.VBoostSettings.<init>():void");
        }

        public VBoostSettings(int i, long j, long j2, long j3) {
            this.settings = i;
            this.cpuTime = j;
            this.cpuCoreTime = j2;
            this.gpuTime = j3;
        }

        public /* synthetic */ VBoostSettings(int i, long j, long j2, long j3, int i2, DefaultConstructorMarker defaultConstructorMarker) {
            this((i2 & 1) != 0 ? 0 : i, (i2 & 2) != 0 ? 0L : j, (i2 & 4) != 0 ? 0L : j2, (i2 & 8) != 0 ? 0L : j3);
        }
    }
}
