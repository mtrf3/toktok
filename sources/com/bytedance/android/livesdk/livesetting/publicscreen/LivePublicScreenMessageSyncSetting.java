package com.bytedance.android.livesdk.livesetting.publicscreen;

import X.InterfaceC65349Pkn;
import com.bytedance.android.live.annotation.Group;
import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;
import kotlin.jvm.internal.DefaultConstructorMarker;

@SettingsKey("live_public_screen_message_sync")
/* loaded from: classes6.dex */
public final class LivePublicScreenMessageSyncSetting {

    @Group(isDefault = true, value = "default group")
    public static final LivePublicScreenMessageSyncConfig DEFAULT;
    public static final LivePublicScreenMessageSyncSetting INSTANCE = new LivePublicScreenMessageSyncSetting();

    static {
        boolean z = false;
        long j = 0;
        DEFAULT = new LivePublicScreenMessageSyncConfig(z, z, j, j, j, j, j, 127, null);
    }

    public static final LivePublicScreenMessageSyncConfig getValue() {
        LivePublicScreenMessageSyncConfig livePublicScreenMessageSyncConfig = (LivePublicScreenMessageSyncConfig) SettingsManager.INSTANCE.getValueSafely(LivePublicScreenMessageSyncSetting.class);
        if (livePublicScreenMessageSyncConfig == null) {
            return DEFAULT;
        }
        return livePublicScreenMessageSyncConfig;
    }

    /* loaded from: classes6.dex */
    public static final class LivePublicScreenMessageSyncConfig {

        @InterfaceC65349Pkn("c2c_delay_max")
        public long c2cDelayMax;

        @InterfaceC65349Pkn("enable_message_priority")
        public boolean enableMessagePriority;

        @InterfaceC65349Pkn("enable_message_sync")
        public boolean enableMessageSync;

        @InterfaceC65349Pkn("host_c2c_delay")
        public long hostC2CDelay;

        @InterfaceC65349Pkn("sei_delay_max")
        public long seiDelayMax;

        @InterfaceC65349Pkn("sync_delay_max")
        public long syncDelayMax;

        @InterfaceC65349Pkn("sync_delay_reduce")
        public long syncDelayReduce;

        /* JADX WARN: Illegal instructions before constructor call */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public LivePublicScreenMessageSyncConfig() {
            /*
                r15 = this;
                r1 = 0
                r3 = 0
                r13 = 127(0x7f, float:1.78E-43)
                r14 = 0
                r0 = r15
                r2 = r1
                r5 = r3
                r7 = r3
                r9 = r3
                r11 = r3
                r0.<init>(r1, r2, r3, r5, r7, r9, r11, r13, r14)
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.bytedance.android.livesdk.livesetting.publicscreen.LivePublicScreenMessageSyncSetting.LivePublicScreenMessageSyncConfig.<init>():void");
        }

        public LivePublicScreenMessageSyncConfig(boolean z, boolean z2, long j, long j2, long j3, long j4, long j5) {
            this.enableMessagePriority = z;
            this.enableMessageSync = z2;
            this.hostC2CDelay = j;
            this.c2cDelayMax = j2;
            this.seiDelayMax = j3;
            this.syncDelayMax = j4;
            this.syncDelayReduce = j5;
        }

        public /* synthetic */ LivePublicScreenMessageSyncConfig(boolean z, boolean z2, long j, long j2, long j3, long j4, long j5, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this((i & 1) != 0 ? true : z, (i & 2) != 0 ? false : z2, (i & 4) != 0 ? 1770L : j, (i & 8) != 0 ? 10000L : j2, (i & 16) != 0 ? 10000L : j3, (i & 32) == 0 ? j4 : 10000L, (i & 64) != 0 ? 0L : j5);
        }
    }
}
