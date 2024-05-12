package com.bytedance.android.livesdk.init;

import X.AbstractC31208CMq;
import X.C86881Y7x;
import X.CCJ;
import X.CN1;
import X.InterfaceC30950CCs;
import com.bytedance.android.live.broadcast.api.IBroadcastService;
import com.bytedance.android.live.function.IRoomFunctionService;
import com.bytedance.android.live.gift.IGiftService;
import com.bytedance.android.livesdk.api.revenue.subscription.ISubscribeService;
import com.bytedance.android.livesdk.livesetting.performance.LiveServiceManagerOptSetting;
import com.bytedance.android.livesdkapi.host.IHostAppContext;
import java.util.Locale;

@InterfaceC30950CCs
/* loaded from: classes6.dex */
public class I18nInitTask extends AbstractC31208CMq {
    @Override // X.AbstractC31208CMq
    public String getTaskName() {
        return "i18n_init_task";
    }

    @Override // X.AbstractC31208CMq
    public void run() {
        IHostAppContext iHostAppContext = (IHostAppContext) CN1.LIZ(IHostAppContext.class);
        Locale currentLocale = iHostAppContext.currentLocale();
        C86881Y7x.LIZIZ().LIZJ(currentLocale);
        if (CCJ.LIZ(iHostAppContext.context()) && LiveServiceManagerOptSetting.enable()) {
            ((IBroadcastService) CN1.LIZ(IBroadcastService.class)).onLocaleChanged(currentLocale);
            ((IGiftService) CN1.LIZ(IGiftService.class)).onLocaleChanged(currentLocale);
            ((ISubscribeService) CN1.LIZ(ISubscribeService.class)).onLocaleChanged(currentLocale);
            ((IRoomFunctionService) CN1.LIZ(IRoomFunctionService.class)).onLocaleChanged(currentLocale);
        }
    }
}
