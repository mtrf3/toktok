package com.bytedance.android.livesdk.livesetting.linkmic;

import com.bytedance.android.live.annotation.Group;
import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;

@SettingsKey("mt_cohost_p2p_group_change_im_timestamp_check_enabled")
/* loaded from: classes6.dex */
public final class MtCohostP2PgroupchangeImTimestampCheckSetting {

    @Group(isDefault = true, value = "default group")
    public static final boolean DEFAULT = true;
    public static final MtCohostP2PgroupchangeImTimestampCheckSetting INSTANCE = new MtCohostP2PgroupchangeImTimestampCheckSetting();

    public final boolean getValue() {
        return SettingsManager.INSTANCE.getBooleanValue(MtCohostP2PgroupchangeImTimestampCheckSetting.class);
    }
}
