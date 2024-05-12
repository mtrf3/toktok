package com.bytedance.android.livesdk.livesetting.watchlive;

import X.C221108m2;
import X.C5H3;
import X.C6X;
import X.InterfaceC65349Pkn;
import com.bytedance.android.live.annotation.Group;
import com.bytedance.android.live.annotation.SettingsKey;
import kotlin.jvm.internal.DefaultConstructorMarker;

@SettingsKey("watch_live_memory_leak_opt")
/* loaded from: classes6.dex */
public final class WatchMemoryLeakOpt {

    @Group(isDefault = true, value = "default")
    public static final WatchMemoryLeakOptConfig DEFAULT;
    public static final WatchMemoryLeakOpt INSTANCE = new WatchMemoryLeakOpt();
    public static final C5H3 configValue$delegate = C221108m2.LIZIZ(C6X.LJLIL);

    static {
        boolean z = false;
        DEFAULT = new WatchMemoryLeakOptConfig(z, z, z, z, 15, null);
    }

    private final WatchMemoryLeakOptConfig getConfigValue() {
        return (WatchMemoryLeakOptConfig) configValue$delegate.getValue();
    }

    public final boolean removeDataChannel() {
        if (getConfigValue().enable && getConfigValue().removeDataChannel) {
            return true;
        }
        return false;
    }

    public final boolean removeFragmentTag() {
        if (getConfigValue().enable && getConfigValue().removeFragment) {
            return true;
        }
        return false;
    }

    public final boolean settingValue() {
        return getConfigValue().enable;
    }

    public final boolean valueForEc() {
        if (getConfigValue().enable && getConfigValue().ecValue) {
            return true;
        }
        return false;
    }

    /* loaded from: classes6.dex */
    public static final class WatchMemoryLeakOptConfig {

        @InterfaceC65349Pkn("opt_ec_leak")
        public boolean ecValue;

        @InterfaceC65349Pkn("enable")
        public boolean enable;

        @InterfaceC65349Pkn("live_remove_channel")
        public boolean removeDataChannel;

        @InterfaceC65349Pkn("live_remove_fragment_tag")
        public boolean removeFragment;

        /* JADX WARN: Illegal instructions before constructor call */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public WatchMemoryLeakOptConfig() {
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
            throw new UnsupportedOperationException("Method not decompiled: com.bytedance.android.livesdk.livesetting.watchlive.WatchMemoryLeakOpt.WatchMemoryLeakOptConfig.<init>():void");
        }

        public WatchMemoryLeakOptConfig(boolean z, boolean z2, boolean z3, boolean z4) {
            this.enable = z;
            this.removeFragment = z2;
            this.removeDataChannel = z3;
            this.ecValue = z4;
        }

        public /* synthetic */ WatchMemoryLeakOptConfig(boolean z, boolean z2, boolean z3, boolean z4, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this((i & 1) != 0 ? false : z, (i & 2) != 0 ? false : z2, (i & 4) != 0 ? false : z3, (i & 8) != 0 ? false : z4);
        }
    }
}
