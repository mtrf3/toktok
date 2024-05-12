package com.bytedance.common.wschannel.server;

import X.C35532Dx2;
import X.C38413F5t;
import X.C66163Pxv;
import X.C84763XOl;
import X.QMH;
import X.QMP;
import X.RunnableC39007FSp;
import Y.ARunnableS30S0200000_11;
import android.content.Context;
import android.content.Intent;
import android.os.Message;
import com.bytedance.common.utility.Logger;
import com.bytedance.common.wschannel.app.AbsMessengerService;

/* loaded from: classes12.dex */
public class WsChannelService extends AbsMessengerService {
    public static final /* synthetic */ int LJLIL = 0;

    @Override // com.bytedance.common.wschannel.app.AbsMessengerService, android.app.Service
    public final void onCreate() {
        Logger.debug();
        super.onCreate();
    }

    @Override // com.bytedance.common.wschannel.app.AbsMessengerService, android.app.Service
    public final void onDestroy() {
        super.onDestroy();
    }

    @Override // com.bytedance.common.wschannel.app.AbsMessengerService, android.app.Service, android.content.ContextWrapper
    public void attachBaseContext(Context context) {
        if (!C84763XOl.LJIIJJI && C38413F5t.LIZ("serviceAttachBaseContext")) {
            C35532Dx2.LIZJ();
        }
        super.attachBaseContext(context);
    }

    @Override // com.bytedance.common.wschannel.app.AbsMessengerService, com.bytedance.common.utility.collection.WeakHandler.IHandler
    public final void handleMsg(Message message) {
        super.handleMsg(message);
        if (message == null) {
            return;
        }
        Logger.debug();
        if (QMP.LIZ == null) {
            synchronized (QMH.class) {
                if (QMP.LIZ == null) {
                    QMP.LIZ = QMP.LIZ(this);
                }
            }
        }
        QMP.LIZ.handleMsg(message);
    }

    @Override // android.app.Service
    public int onStartCommand(Intent intent, int i, int i2) {
        C66163Pxv.LIZ(this, intent, i, i2);
        Logger.debug();
        RunnableC39007FSp.LIZIZ(new ARunnableS30S0200000_11(this, intent, 2));
        return 2;
    }
}
