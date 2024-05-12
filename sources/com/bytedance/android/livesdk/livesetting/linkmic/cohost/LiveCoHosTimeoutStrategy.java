package com.bytedance.android.livesdk.livesetting.linkmic.cohost;

import X.C113554cx;
import X.OSZ;
import com.bytedance.android.live.annotation.Group;
import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;
import com.bytedance.android.livesdk.livesetting.linkmic.MtCoHostInviteTimeOutSetting;
import com.bytedance.android.livesdk.livesetting.linkmic.MtCoHostReplyTimeOutSetting;
import java.util.HashMap;
import java.util.Map;

@SettingsKey("live_cohost_timeout_strategy")
/* loaded from: classes11.dex */
public final class LiveCoHosTimeoutStrategy {

    @Group(isDefault = true, value = "default group")
    public static final HashMap<String, Object> DEFAULT;
    public static final LiveCoHosTimeoutStrategy INSTANCE = new LiveCoHosTimeoutStrategy();

    static {
        MtCoHostInviteTimeOutSetting mtCoHostInviteTimeOutSetting = MtCoHostInviteTimeOutSetting.INSTANCE;
        MtCoHostReplyTimeOutSetting mtCoHostReplyTimeOutSetting = MtCoHostReplyTimeOutSetting.INSTANCE;
        DEFAULT = C113554cx.LJJJLZIJ(new OSZ("inviter_timeout", Integer.valueOf(mtCoHostInviteTimeOutSetting.getValue())), new OSZ("invitee_timeout", Integer.valueOf(mtCoHostReplyTimeOutSetting.getValue())), new OSZ("apply_timeout", Integer.valueOf(mtCoHostInviteTimeOutSetting.getValue())), new OSZ("handler_timeout", Integer.valueOf(mtCoHostReplyTimeOutSetting.getValue())));
    }

    public final Map<String, Object> getValue() {
        Map<String, Object> map = (Map) SettingsManager.INSTANCE.getValueSafely(LiveCoHosTimeoutStrategy.class);
        if (map == null) {
            return DEFAULT;
        }
        return map;
    }
}
