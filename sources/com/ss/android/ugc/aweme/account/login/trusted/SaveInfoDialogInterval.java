package com.ss.android.ugc.aweme.account.login.trusted;

import X.InterfaceC65349Pkn;
import java.util.concurrent.TimeUnit;

/* loaded from: classes16.dex */
public final class SaveInfoDialogInterval {

    @InterfaceC65349Pkn("new_user_delay_time")
    public long newUserDelayDay;

    @InterfaceC65349Pkn("show_dialog_interval")
    public long showDialogInterval;

    public SaveInfoDialogInterval() {
        TimeUnit timeUnit = TimeUnit.DAYS;
        this.showDialogInterval = timeUnit.toMillis(1L);
        this.newUserDelayDay = timeUnit.toMillis(5L);
    }
}
