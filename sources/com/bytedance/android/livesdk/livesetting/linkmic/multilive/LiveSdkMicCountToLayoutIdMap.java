package com.bytedance.android.livesdk.livesetting.linkmic.multilive;

import X.InterfaceC65349Pkn;
import com.bytedance.android.live.annotation.Group;
import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.o;

@SettingsKey(preciseExperiment = false, value = "livesdk_micCount_to_layoutId_map")
/* loaded from: classes14.dex */
public final class LiveSdkMicCountToLayoutIdMap {

    @Group(isDefault = true, value = "default group")
    public static final MicCountToLayoutIdMapping DEFAULT;
    public static final LiveSdkMicCountToLayoutIdMap INSTANCE = new LiveSdkMicCountToLayoutIdMap();
    public static final MicCountToLayoutIdMapping settings;

    /* JADX WARN: Multi-variable type inference failed */
    static {
        MicCountToLayoutIdMapping micCountToLayoutIdMapping = new MicCountToLayoutIdMapping(null, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 31, 0 == true ? 1 : 0);
        DEFAULT = micCountToLayoutIdMapping;
        MicCountToLayoutIdMapping micCountToLayoutIdMapping2 = (MicCountToLayoutIdMapping) SettingsManager.INSTANCE.getValueSafely(LiveSdkMicCountToLayoutIdMap.class);
        if (micCountToLayoutIdMapping2 != null) {
            micCountToLayoutIdMapping = micCountToLayoutIdMapping2;
        }
        settings = micCountToLayoutIdMapping;
    }

    public final String getFixGrid3UiBtnLayoutId() {
        return settings.fixGrid3UiBtn;
    }

    public final String getFixGrid5UiBtnLayoutId() {
        return settings.fixGrid5UiBtn;
    }

    public final String getFixGrid8UiBtnLayoutId() {
        return settings.fixGrid8UiBtn;
    }

    public final String getFixPanel4UiBtnLayoutId() {
        return settings.fixPanel4UiBtn;
    }

    public final String getFixPanel6UiBtnLayoutId() {
        return settings.fixPanel6UiBtn;
    }

    public final MicCountToLayoutIdMapping getSettings() {
        return settings;
    }

    /* loaded from: classes14.dex */
    public static final class MicCountToLayoutIdMapping {

        @InterfaceC65349Pkn("fix_grid_3_ui_btn")
        public String fixGrid3UiBtn;

        @InterfaceC65349Pkn("fix_grid_5_ui_btn")
        public String fixGrid5UiBtn;

        @InterfaceC65349Pkn("fix_grid_8_ui_btn")
        public String fixGrid8UiBtn;

        @InterfaceC65349Pkn("fix_panel_4_ui_btn")
        public String fixPanel4UiBtn;

        @InterfaceC65349Pkn("fix_panel_6_ui_btn")
        public String fixPanel6UiBtn;

        /* JADX WARN: Multi-variable type inference failed */
        public MicCountToLayoutIdMapping() {
            this(null, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 31, 0 == true ? 1 : 0);
        }

        public MicCountToLayoutIdMapping(String fixGrid3UiBtn, String fixGrid5UiBtn, String fixGrid8UiBtn, String fixPanel4UiBtn, String fixPanel6UiBtn) {
            o.LJIIIZ(fixGrid3UiBtn, "fixGrid3UiBtn");
            o.LJIIIZ(fixGrid5UiBtn, "fixGrid5UiBtn");
            o.LJIIIZ(fixGrid8UiBtn, "fixGrid8UiBtn");
            o.LJIIIZ(fixPanel4UiBtn, "fixPanel4UiBtn");
            o.LJIIIZ(fixPanel6UiBtn, "fixPanel6UiBtn");
            this.fixGrid3UiBtn = fixGrid3UiBtn;
            this.fixGrid5UiBtn = fixGrid5UiBtn;
            this.fixGrid8UiBtn = fixGrid8UiBtn;
            this.fixPanel4UiBtn = fixPanel4UiBtn;
            this.fixPanel6UiBtn = fixPanel6UiBtn;
        }

        public /* synthetic */ MicCountToLayoutIdMapping(String str, String str2, String str3, String str4, String str5, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this((i & 1) != 0 ? "1015" : str, (i & 2) != 0 ? "1006" : str2, (i & 4) != 0 ? "1014" : str3, (i & 8) != 0 ? "1002" : str4, (i & 16) != 0 ? "1012" : str5);
        }
    }
}
