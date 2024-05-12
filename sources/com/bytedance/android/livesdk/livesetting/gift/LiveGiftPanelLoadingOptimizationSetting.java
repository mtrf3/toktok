package com.bytedance.android.livesdk.livesetting.gift;

import X.C221108m2;
import X.C5H3;
import X.CGX;
import X.EnumC221088m0;
import X.InterfaceC65349Pkn;
import com.bytedance.android.live.annotation.Group;
import com.bytedance.android.live.annotation.SettingsKey;
import kotlin.jvm.internal.DefaultConstructorMarker;

@SettingsKey("live_gift_panel_loading_optimization_config")
/* loaded from: classes6.dex */
public final class LiveGiftPanelLoadingOptimizationSetting {

    @Group(isDefault = true, value = "default group")
    public static final GiftPanelOptimizationConfig DEFAULT;
    public static final LiveGiftPanelLoadingOptimizationSetting INSTANCE = new LiveGiftPanelLoadingOptimizationSetting();
    public static final C5H3 settingValue$delegate = C221108m2.LIZ(EnumC221088m0.NONE, CGX.LJLIL);

    static {
        boolean z = false;
        DEFAULT = new GiftPanelOptimizationConfig(z, z, z, 7, null);
    }

    private final GiftPanelOptimizationConfig getSettingValue() {
        return (GiftPanelOptimizationConfig) settingValue$delegate.getValue();
    }

    public final GiftPanelOptimizationConfig getValue() {
        GiftPanelOptimizationConfig settingValue = getSettingValue();
        if (settingValue == null) {
            boolean z = false;
            return new GiftPanelOptimizationConfig(z, z, z, 7, null);
        }
        return settingValue;
    }

    /* loaded from: classes6.dex */
    public static final class GiftPanelOptimizationConfig {

        @InterfaceC65349Pkn("live_cache_hit_optimization")
        public boolean cacheHitOptimization;

        @InterfaceC65349Pkn("live_file_util_optimization")
        public boolean fileUtilOptimization;

        @InterfaceC65349Pkn("live_image_load_report_optimization")
        public boolean imageLoadReportOptimization;

        /* JADX WARN: Illegal instructions before constructor call */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public GiftPanelOptimizationConfig() {
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
            throw new UnsupportedOperationException("Method not decompiled: com.bytedance.android.livesdk.livesetting.gift.LiveGiftPanelLoadingOptimizationSetting.GiftPanelOptimizationConfig.<init>():void");
        }

        public GiftPanelOptimizationConfig(boolean z, boolean z2, boolean z3) {
            this.fileUtilOptimization = z;
            this.cacheHitOptimization = z2;
            this.imageLoadReportOptimization = z3;
        }

        public /* synthetic */ GiftPanelOptimizationConfig(boolean z, boolean z2, boolean z3, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this((i & 1) != 0 ? false : z, (i & 2) != 0 ? false : z2, (i & 4) != 0 ? false : z3);
        }
    }
}
