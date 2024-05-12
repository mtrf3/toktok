package com.bytedance.android.livesdk.livesetting.performance;

import X.C221108m2;
import X.C30997CEn;
import X.C5H3;
import X.InterfaceC65349Pkn;
import com.bytedance.android.live.annotation.Group;
import com.bytedance.android.live.annotation.SettingsKey;
import kotlin.jvm.internal.DefaultConstructorMarker;

@SettingsKey("live_watch_layout_preload_log_opt")
/* loaded from: classes6.dex */
public final class LiveWatchLayoutPreloadLogOpt {

    @Group(isDefault = true, value = "default")
    public static final LayoutPreloadConfig DEFAULT;
    public static final LiveWatchLayoutPreloadLogOpt INSTANCE = new LiveWatchLayoutPreloadLogOpt();
    public static final C5H3 value$delegate = C221108m2.LIZIZ(C30997CEn.LJLIL);

    static {
        int i = 0;
        DEFAULT = new LayoutPreloadConfig(i, i, 3, null);
    }

    private final LayoutPreloadConfig getValue() {
        return (LayoutPreloadConfig) value$delegate.getValue();
    }

    public static final boolean isEnableAnchor() {
        return INSTANCE.isBitEnable(2);
    }

    public static final boolean isEnableWatch() {
        return INSTANCE.isBitEnable(1);
    }

    public static final int sampleRate() {
        return INSTANCE.getValue().sampleRate;
    }

    public final boolean isEnable() {
        if (isEnableWatch() || isEnableAnchor()) {
            return true;
        }
        return false;
    }

    private final boolean isBitEnable(int i) {
        if ((getValue().enableRole & i) == i) {
            return true;
        }
        return false;
    }

    /* loaded from: classes6.dex */
    public static final class LayoutPreloadConfig {

        @InterfaceC65349Pkn("enable_role")
        public int enableRole;

        @InterfaceC65349Pkn("sample_rate")
        public int sampleRate;

        /* JADX WARN: Illegal instructions before constructor call */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public LayoutPreloadConfig() {
            /*
                r3 = this;
                r2 = 3
                r1 = 0
                r0 = 0
                r3.<init>(r0, r0, r2, r1)
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.bytedance.android.livesdk.livesetting.performance.LiveWatchLayoutPreloadLogOpt.LayoutPreloadConfig.<init>():void");
        }

        public LayoutPreloadConfig(int i, int i2) {
            this.enableRole = i;
            this.sampleRate = i2;
        }

        public /* synthetic */ LayoutPreloadConfig(int i, int i2, int i3, DefaultConstructorMarker defaultConstructorMarker) {
            this((i3 & 1) != 0 ? 0 : i, (i3 & 2) != 0 ? 5 : i2);
        }
    }
}
