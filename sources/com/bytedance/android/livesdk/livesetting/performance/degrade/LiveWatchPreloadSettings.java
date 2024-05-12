package com.bytedance.android.livesdk.livesetting.performance.degrade;

import X.C5H3;
import X.C78996UzQ;
import X.InterfaceC65349Pkn;
import X.YAA;
import com.bytedance.android.live.annotation.Group;
import com.bytedance.android.live.annotation.SettingsKey;
import kotlin.jvm.internal.DefaultConstructorMarker;

@SettingsKey("live_watch_preload")
/* loaded from: classes16.dex */
public final class LiveWatchPreloadSettings {

    @Group(isDefault = true, value = "default group")
    public static final Item DEFAULT;
    public static final LiveWatchPreloadSettings INSTANCE = new LiveWatchPreloadSettings();
    public static final C5H3 value$delegate = C78996UzQ.LJJIJIIJI(YAA.LJLIL);

    static {
        boolean z = false;
        DEFAULT = new Item(z, z, z, z, z, z, z, 127, null);
    }

    private final Item getValue() {
        return (Item) value$delegate.getValue();
    }

    public final boolean breakUpPlayFragmentCreate() {
        return getValue().breakUpPlayFragmentCreate;
    }

    public final boolean callAheadPrepareNextStep() {
        return getValue().callAheadPrepareNextStep;
    }

    public final boolean disableUnusedLog() {
        return getValue().disableUnusedTeaLog;
    }

    public final boolean gpuInfoDisable() {
        return getValue().gpuInfoDisable;
    }

    public final boolean messageManagerDisable() {
        return getValue().messageManagerDisable;
    }

    public final boolean reGetGOpt() {
        return getValue().resGetOpt;
    }

    public final boolean xmlResDisable() {
        return getValue().xmlResDisable;
    }

    /* loaded from: classes16.dex */
    public static final class Item {

        @InterfaceC65349Pkn("breakup_play_fragment_create")
        public boolean breakUpPlayFragmentCreate;

        @InterfaceC65349Pkn("call_ahead_prepare_next_step")
        public boolean callAheadPrepareNextStep;

        @InterfaceC65349Pkn("disable_unused_tea_log")
        public boolean disableUnusedTeaLog;

        @InterfaceC65349Pkn("gpu_info_disable")
        public boolean gpuInfoDisable;

        @InterfaceC65349Pkn("message_manager")
        public boolean messageManagerDisable;

        @InterfaceC65349Pkn("res_get_opt")
        public boolean resGetOpt;

        @InterfaceC65349Pkn("xml_res")
        public boolean xmlResDisable;

        /* JADX WARN: Illegal instructions before constructor call */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public Item() {
            /*
                r10 = this;
                r1 = 0
                r8 = 127(0x7f, float:1.78E-43)
                r9 = 0
                r0 = r10
                r2 = r1
                r3 = r1
                r4 = r1
                r5 = r1
                r6 = r1
                r7 = r1
                r0.<init>(r1, r2, r3, r4, r5, r6, r7, r8, r9)
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.bytedance.android.livesdk.livesetting.performance.degrade.LiveWatchPreloadSettings.Item.<init>():void");
        }

        public Item(boolean z, boolean z2, boolean z3, boolean z4, boolean z5, boolean z6, boolean z7) {
            this.xmlResDisable = z;
            this.messageManagerDisable = z2;
            this.gpuInfoDisable = z3;
            this.resGetOpt = z4;
            this.breakUpPlayFragmentCreate = z5;
            this.disableUnusedTeaLog = z6;
            this.callAheadPrepareNextStep = z7;
        }

        public /* synthetic */ Item(boolean z, boolean z2, boolean z3, boolean z4, boolean z5, boolean z6, boolean z7, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this((i & 1) != 0 ? false : z, (i & 2) != 0 ? false : z2, (i & 4) != 0 ? false : z3, (i & 8) != 0 ? false : z4, (i & 16) != 0 ? false : z5, (i & 32) != 0 ? false : z6, (i & 64) != 0 ? false : z7);
        }
    }
}
