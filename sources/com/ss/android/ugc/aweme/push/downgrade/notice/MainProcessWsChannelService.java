package com.ss.android.ugc.aweme.push.downgrade.notice;

import X.C35532Dx2;
import X.C38413F5t;
import X.C66163Pxv;
import X.C84763XOl;
import android.content.Context;
import android.content.Intent;
import com.bytedance.common.wschannel.server.WsChannelService;

/* loaded from: classes7.dex */
public class MainProcessWsChannelService extends WsChannelService {
    @Override // com.bytedance.common.wschannel.server.WsChannelService, android.app.Service
    public final int onStartCommand(Intent intent, int i, int i2) {
        C66163Pxv.LIZ(this, intent, i, i2);
        super.onStartCommand(intent, i, i2);
        return 2;
    }

    @Override // com.bytedance.common.wschannel.server.WsChannelService, com.bytedance.common.wschannel.app.AbsMessengerService, android.app.Service, android.content.ContextWrapper
    public final void attachBaseContext(Context context) {
        if (!C84763XOl.LJIIJJI && C38413F5t.LIZ("serviceAttachBaseContext")) {
            C35532Dx2.LIZJ();
        }
        super.attachBaseContext(context);
    }
}
