package com.bytedance.android.livesdk.livesetting.linkmic;

import com.bytedance.android.live.annotation.Group;
import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;

@SettingsKey("live_linkmic_guest_gift_rank_list_and_not_show_checkbox_type")
/* loaded from: classes6.dex */
public final class MultiGuestGiftRankListAndNotShowCheckboxTypeSetting {

    @Group(isDefault = true, value = "default group")
    public static final int DEFAULT = 0;
    public static final MultiGuestGiftRankListAndNotShowCheckboxTypeSetting INSTANCE = new MultiGuestGiftRankListAndNotShowCheckboxTypeSetting();

    @Group("only_active_leave_show_rank_without_checkbox")
    public static final int ONLY_ACTIVE_LEAVE_SHOW_RANK_WITHOUT_CHECKBOX = 1;

    @Group("only_active_leave_show_rank_with_checkbox")
    public static final int ONLY_ACTIVE_LEAVE_SHOW_RANK_WITH_CHECKBOX = 2;

    @Group("show_all")
    public static final int SHOW_ALL = 3;

    public final int getValue() {
        return SettingsManager.INSTANCE.getIntValue(MultiGuestGiftRankListAndNotShowCheckboxTypeSetting.class);
    }
}
