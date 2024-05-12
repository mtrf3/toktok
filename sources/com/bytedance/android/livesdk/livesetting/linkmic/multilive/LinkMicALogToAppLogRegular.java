package com.bytedance.android.livesdk.livesetting.linkmic.multilive;

import com.bytedance.android.live.annotation.Group;
import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;
import java.util.List;

@SettingsKey("alog_to_applog_regular")
/* loaded from: classes6.dex */
public final class LinkMicALogToAppLogRegular {
    public static final LinkMicALogToAppLogRegular INSTANCE = new LinkMicALogToAppLogRegular();

    @Group(isDefault = true, value = "default group")
    public static final LinkMicALogToAppLogRegularBean DEFAULT = new LinkMicALogToAppLogRegularBean(null, null, null, 7, null);

    private final LinkMicALogToAppLogRegularBean getValue() {
        LinkMicALogToAppLogRegularBean linkMicALogToAppLogRegularBean = (LinkMicALogToAppLogRegularBean) SettingsManager.INSTANCE.getValueSafely(LinkMicALogToAppLogRegular.class);
        if (linkMicALogToAppLogRegularBean == null) {
            return DEFAULT;
        }
        return linkMicALogToAppLogRegularBean;
    }

    public final List<String> getBlockList() {
        return getValue().blockList;
    }

    public final List<String> getLevelAllowList() {
        return getValue().levelAllowList;
    }

    public final List<String> getTagModuleAllowList() {
        return getValue().tagModuleAllowList;
    }
}
