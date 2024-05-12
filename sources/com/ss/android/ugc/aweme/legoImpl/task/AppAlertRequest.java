package com.ss.android.ugc.aweme.legoImpl.task;

import X.AnonymousClass030;
import X.C38776FJs;
import X.C73040SlY;
import X.EF7;
import X.EFM;
import X.EFN;
import X.EnumC36092EEm;
import X.EnumC36103EEx;
import android.content.Context;
import com.ss.android.common.applog.AppLog;
import java.util.List;

/* loaded from: classes7.dex */
public final class AppAlertRequest implements EFM {
    @Override // X.EEY
    public final String key() {
        return "AppAlertRequest";
    }

    @Override // X.EEY
    public final /* synthetic */ boolean meetTrigger() {
        return true;
    }

    @Override // X.EEY
    public final /* synthetic */ String prefix() {
        return "request_";
    }

    @Override // X.EEY
    public final /* synthetic */ void run(Context context) {
    }

    @Override // X.EEY
    public final /* synthetic */ int targetProcess() {
        return AnonymousClass030.LIZ();
    }

    @Override // X.EEY
    public final /* synthetic */ List triggerOtherLegoComponents() {
        return null;
    }

    @Override // X.EEY
    public final /* synthetic */ EnumC36103EEx triggerType() {
        return AnonymousClass030.LIZIZ(this);
    }

    @Override // X.EEY
    public final EnumC36092EEm scenesType() {
        return EnumC36092EEm.DEFAULT;
    }

    @Override // X.EFM
    public final EFN type() {
        return EFN.NORMAL;
    }

    @Override // X.EFM
    public final void LIZJ(Context context, boolean z) {
        AppLog.activeUser(EF7.LIZIZ());
        C38776FJs.LJIIL().LJIIJJI(EF7.LIZIZ(), "last_active_version", EF7.LIZLLL());
        C38776FJs.LJIIL().LJIIJJI(EF7.LIZIZ(), "last_channel", EF7.LJIILIIL);
        C38776FJs.LJIIL().LJIIJJI(EF7.LIZIZ(), "last_device_id", AppLog.getServerDeviceId());
        C38776FJs.LJIIL().LJIIJJI(EF7.LIZIZ(), "last_install_id", AppLog.getInstallId());
        C73040SlY.LJIIIIZZ(context, "event_v1", "monitor", "app_alert", 0L, 0L, null);
    }
}
