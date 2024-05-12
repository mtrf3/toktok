package com.bytedance.android.livesdk.livesetting.performance;

import X.C162476Zf;
import X.InterfaceC65349Pkn;
import X.VCH;
import X.VCI;
import com.bytedance.android.live.annotation.Group;
import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.o;

@SettingsKey("webcast_live_sdk_thread_priority_opt_2")
/* loaded from: classes15.dex */
public final class LivePlayThreadPrioritySettings {

    @Group(isDefault = true, value = "default group")
    public static final ThreadConfig DEFAULT;
    public static final LivePlayThreadPrioritySettings INSTANCE = new LivePlayThreadPrioritySettings();

    static {
        int i = 0;
        DEFAULT = new ThreadConfig(i, i, i, i, i, 31, null);
    }

    public final int getThreadPriority(VCI type) {
        o.LJIIIZ(type, "type");
        ThreadConfig threadConfig = (ThreadConfig) SettingsManager.INSTANCE.getValueSafely(LivePlayThreadPrioritySettings.class);
        if (threadConfig == null) {
            threadConfig = DEFAULT;
        }
        int i = VCH.LIZ[type.ordinal()];
        if (i != 1) {
            if (i != 2) {
                if (i != 3) {
                    if (i == 4) {
                        return threadConfig.downgrade3rdNice;
                    }
                    throw new C162476Zf();
                }
                return threadConfig.downgradeTeaNice;
            }
            return threadConfig.downgradeLoggerNice;
        }
        return threadConfig.upgradeNice;
    }

    public final boolean isEnabled(VCI type) {
        o.LJIIIZ(type, "type");
        ThreadConfig threadConfig = (ThreadConfig) SettingsManager.INSTANCE.getValueSafely(LivePlayThreadPrioritySettings.class);
        if (threadConfig == null) {
            threadConfig = DEFAULT;
        }
        if ((threadConfig.enable & type.getValue()) == type.getValue()) {
            return true;
        }
        return false;
    }

    /* loaded from: classes15.dex */
    public static final class ThreadConfig {

        @InterfaceC65349Pkn("downgrade_3rd_thread_nice_value")
        public int downgrade3rdNice;

        @InterfaceC65349Pkn("downgrade_logger_thread_nice_value")
        public int downgradeLoggerNice;

        @InterfaceC65349Pkn("downgrade_tea_thread_nice_value")
        public int downgradeTeaNice;

        @InterfaceC65349Pkn("enable_live_play_thread_priority_opt")
        public int enable;

        @InterfaceC65349Pkn("upgrade_live_play_conrol_thread_nice_value")
        public int upgradeNice;

        /* JADX WARN: Illegal instructions before constructor call */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public ThreadConfig() {
            /*
                r8 = this;
                r1 = 0
                r6 = 31
                r7 = 0
                r0 = r8
                r2 = r1
                r3 = r1
                r4 = r1
                r5 = r1
                r0.<init>(r1, r2, r3, r4, r5, r6, r7)
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.bytedance.android.livesdk.livesetting.performance.LivePlayThreadPrioritySettings.ThreadConfig.<init>():void");
        }

        public ThreadConfig(int i, int i2, int i3, int i4, int i5) {
            this.enable = i;
            this.upgradeNice = i2;
            this.downgradeLoggerNice = i3;
            this.downgradeTeaNice = i4;
            this.downgrade3rdNice = i5;
        }

        public /* synthetic */ ThreadConfig(int i, int i2, int i3, int i4, int i5, int i6, DefaultConstructorMarker defaultConstructorMarker) {
            this((i6 & 1) != 0 ? 0 : i, (i6 & 2) != 0 ? -1 : i2, (i6 & 4) != 0 ? 19 : i3, (i6 & 8) != 0 ? 19 : i4, (i6 & 16) == 0 ? i5 : 19);
        }
    }
}
