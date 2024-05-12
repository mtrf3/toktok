package com.bytedance.android.livesdk.giftlimitnotification;

import X.BE9;
import X.BEA;
import com.bytedance.android.live.gift.IGiftReminderService;
import com.bytedance.android.livesdk.livesetting.gift.LiveGiftLimitNotificationSetting;
import com.bytedance.android.livesdk.livesetting.gift.LiveGiftLimitNotificationSettingV2;

/* loaded from: classes6.dex */
public class GiftReminderService implements IGiftReminderService {
    @Override // X.InterfaceC06390Mx
    public final /* synthetic */ void onInit() {
    }

    @Override // com.bytedance.android.live.gift.IGiftReminderService
    public final boolean Lq0() {
        BEA.LIZ.getClass();
        if (LiveGiftLimitNotificationSetting.INSTANCE.getValue() == 1) {
            return true;
        }
        return false;
    }

    @Override // com.bytedance.android.live.gift.IGiftReminderService
    public final int P10() {
        BEA.LIZ.getClass();
        return LiveGiftLimitNotificationSettingV2.INSTANCE.getValue();
    }

    @Override // com.bytedance.android.live.gift.IGiftReminderService
    public final GiftLimitSettingDialog cz() {
        return new GiftLimitSettingDialog();
    }

    @Override // com.bytedance.android.live.gift.IGiftReminderService
    public final void k90() {
        BEA.LIZ.LIZLLL();
    }

    @Override // com.bytedance.android.live.gift.IGiftReminderService
    public final void np() {
        BEA.LIZ.getClass();
        BEA.LJJIIZI = "settings";
        BE9.LIZ(BEA.LJ() ? 1 : 0, "settings");
    }

    @Override // com.bytedance.android.live.gift.IGiftReminderService
    public final boolean zc0() {
        BEA.LIZ.getClass();
        return BEA.LIZJ();
    }

    @Override // com.bytedance.android.live.gift.IGiftReminderService
    public final LiveGiftReminderFragment Kx(int i) {
        LiveGiftReminderFragment liveGiftReminderFragment = new LiveGiftReminderFragment();
        liveGiftReminderFragment.LJLIL = i;
        return liveGiftReminderFragment;
    }

    @Override // com.bytedance.android.live.gift.IGiftReminderService
    public final void Pc0(int i) {
        BEA.LIZ.getClass();
        BEA.LJI(i);
    }
}
