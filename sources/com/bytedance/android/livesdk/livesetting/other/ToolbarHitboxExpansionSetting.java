package com.bytedance.android.livesdk.livesetting.other;

import X.C30989CEf;
import X.C5H3;
import X.C78996UzQ;
import X.InterfaceC65349Pkn;
import com.bytedance.android.live.annotation.Group;
import com.bytedance.android.live.annotation.SettingsKey;
import kotlin.jvm.internal.DefaultConstructorMarker;

@SettingsKey("live_toolbar_hitbox_expansion_config")
/* loaded from: classes6.dex */
public final class ToolbarHitboxExpansionSetting {

    @Group(isDefault = true, value = "default group")
    public static final ToolbarHitboxConfig DEFAULT;
    public static final ToolbarHitboxExpansionSetting INSTANCE = new ToolbarHitboxExpansionSetting();
    public static final C5H3 settingValue$delegate = C78996UzQ.LJJIJIIJI(C30989CEf.LJLIL);

    static {
        boolean z = false;
        DEFAULT = new ToolbarHitboxConfig(z, z, 3, null);
    }

    private final ToolbarHitboxConfig getSettingValue() {
        return (ToolbarHitboxConfig) settingValue$delegate.getValue();
    }

    public final ToolbarHitboxConfig getIconNoTextValue() {
        return new ToolbarHitboxConfig(false, false);
    }

    public final ToolbarHitboxConfig getValue() {
        ToolbarHitboxConfig settingValue = getSettingValue();
        if (settingValue == null) {
            boolean z = false;
            return new ToolbarHitboxConfig(z, z, 3, null);
        }
        return settingValue;
    }

    /* loaded from: classes6.dex */
    public static final class ToolbarHitboxConfig {

        @InterfaceC65349Pkn("live_toolbar_hitbox_expand_bottom")
        public boolean expandBottom;

        @InterfaceC65349Pkn("live_toolbar_hitbox_expand_top")
        public boolean expandTop;

        /* JADX WARN: Illegal instructions before constructor call */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public ToolbarHitboxConfig() {
            /*
                r3 = this;
                r2 = 3
                r1 = 0
                r0 = 0
                r3.<init>(r0, r0, r2, r1)
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.bytedance.android.livesdk.livesetting.other.ToolbarHitboxExpansionSetting.ToolbarHitboxConfig.<init>():void");
        }

        public ToolbarHitboxConfig(boolean z, boolean z2) {
            this.expandTop = z;
            this.expandBottom = z2;
        }

        public /* synthetic */ ToolbarHitboxConfig(boolean z, boolean z2, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this((i & 1) != 0 ? false : z, (i & 2) != 0 ? false : z2);
        }
    }
}
