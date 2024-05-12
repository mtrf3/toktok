package com.bytedance.android.livesdk.livesetting.linkmic;

import X.C38350F3i;
import com.bytedance.android.live.annotation.Group;
import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;
import java.util.ArrayList;
import java.util.List;

@SettingsKey("multi_co_host_forbid_pre_join_channel")
/* loaded from: classes6.dex */
public final class MultiCoHostForbidPreJoinChannelSetting {
    public static final MultiCoHostForbidPreJoinChannelSetting INSTANCE = new MultiCoHostForbidPreJoinChannelSetting();

    @Group(isDefault = true, value = "default group")
    public static final String[] DEFAULT = new String[0];

    public static final List<Integer> getValue() {
        String[] stringArrayValue = SettingsManager.INSTANCE.getStringArrayValue(MultiCoHostForbidPreJoinChannelSetting.class);
        ArrayList arrayList = new ArrayList(stringArrayValue.length);
        for (String str : stringArrayValue) {
            arrayList.add(C38350F3i.LJJIL(str));
        }
        return arrayList;
    }
}
