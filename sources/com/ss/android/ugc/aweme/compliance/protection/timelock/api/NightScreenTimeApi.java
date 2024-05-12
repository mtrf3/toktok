package com.ss.android.ugc.aweme.compliance.protection.timelock.api;

import X.AbstractC73672Svk;
import X.E4T;
import X.InterfaceC27211Am7;

/* loaded from: classes10.dex */
public interface NightScreenTimeApi {
    @E4T("/tiktok/v1/night_screen_time/reminder/")
    AbstractC73672Svk<NightReminderResponse> getNightReiminderSettings(@InterfaceC27211Am7 NightReminder nightReminder);

    @E4T("/tiktok/v1/night_screen_time/popup/")
    AbstractC73672Svk<NightPopupResponse> updateUserDialogAction(@InterfaceC27211Am7 UpdateUserAction updateUserAction);
}
