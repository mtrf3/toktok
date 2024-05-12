package com.bytedance.android.livesdk.livesetting.performance;

import X.C162476Zf;
import X.C31149CKj;
import X.EnumC31148CKi;
import X.InterfaceC65349Pkn;
import com.bytedance.android.live.annotation.Group;
import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.o;

@SettingsKey("webcast_live_stream_thread_priority_opt")
/* loaded from: classes6.dex */
public final class LiveStreamABThreadPrioritSettings {

    @Group(isDefault = true, value = "default group")
    public static final ThreadConfig DEFAULT;
    public static final LiveStreamABThreadPrioritSettings INSTANCE = new LiveStreamABThreadPrioritSettings();

    static {
        int i = 0;
        DEFAULT = new ThreadConfig(i, i, i, i, 15, null);
    }

    public final int getThreadPriority(EnumC31148CKi type) {
        o.LJIIIZ(type, "type");
        ThreadConfig threadConfig = (ThreadConfig) SettingsManager.INSTANCE.getValueSafely(LiveStreamABThreadPrioritSettings.class);
        if (threadConfig == null) {
            threadConfig = DEFAULT;
        }
        int i = C31149CKj.LIZ[type.ordinal()];
        if (i != 1) {
            if (i != 2) {
                if (i == 3) {
                    return threadConfig.grkPriority;
                }
                throw new C162476Zf();
            }
            return threadConfig.videoCapturePriority;
        }
        return threadConfig.workPriority;
    }

    public final boolean isEnabled(EnumC31148CKi type) {
        o.LJIIIZ(type, "type");
        ThreadConfig threadConfig = (ThreadConfig) SettingsManager.INSTANCE.getValueSafely(LiveStreamABThreadPrioritSettings.class);
        if (threadConfig == null) {
            threadConfig = DEFAULT;
        }
        if ((threadConfig.settings & type.getValue()) == type.getValue()) {
            return true;
        }
        return false;
    }

    /* loaded from: classes6.dex */
    public static final class ThreadConfig {

        @InterfaceC65349Pkn("webcast_live_stream_grk_thread_priority")
        public int grkPriority;

        @InterfaceC65349Pkn("webcast_live_stream_thread_priority_settings")
        public int settings;

        @InterfaceC65349Pkn("webcast_live_stream_videocapture_thread_priority")
        public int videoCapturePriority;

        @InterfaceC65349Pkn("webcast_live_stream_worker_thread_priority")
        public int workPriority;

        /* JADX WARN: Illegal instructions before constructor call */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public ThreadConfig() {
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
            throw new UnsupportedOperationException("Method not decompiled: com.bytedance.android.livesdk.livesetting.performance.LiveStreamABThreadPrioritSettings.ThreadConfig.<init>():void");
        }

        public ThreadConfig(int i, int i2, int i3, int i4) {
            this.settings = i;
            this.workPriority = i2;
            this.videoCapturePriority = i3;
            this.grkPriority = i4;
        }

        public /* synthetic */ ThreadConfig(int i, int i2, int i3, int i4, int i5, DefaultConstructorMarker defaultConstructorMarker) {
            this((i5 & 1) != 0 ? 0 : i, (i5 & 2) != 0 ? -1 : i2, (i5 & 4) != 0 ? -1 : i3, (i5 & 8) != 0 ? -1 : i4);
        }
    }
}
