package com.bytedance.common.wschannel.client;

import X.C35532Dx2;
import X.C38413F5t;
import X.C66925QOj;
import X.C66930QOo;
import X.C66938QOw;
import X.C66941QOz;
import X.C84763XOl;
import X.EnumC66933QOr;
import X.InterfaceC66931QOp;
import X.X1D;
import Y.ARunnableS7S0200100_11;
import android.app.Service;
import android.content.Context;
import android.content.Intent;
import android.os.Handler;
import android.os.IBinder;
import android.os.Message;
import android.os.Messenger;
import android.os.SystemClock;
import com.bytedance.common.utility.Logger;
import com.bytedance.common.utility.collection.WeakHandler;
import com.bytedance.common.wschannel.model.ServiceConnectEvent;
import com.bytedance.common.wschannel.model.WsChannelMsg;
import org.json.JSONObject;

/* loaded from: classes12.dex */
public abstract class AbsWsClientService extends Service implements WeakHandler.IHandler, InterfaceC66931QOp {
    public Messenger mMessenger;
    public final Handler mHandler = new WeakHandler(this);
    public final C66925QOj parser = new C66925QOj(this);

    @Override // android.app.Service, android.content.ContextWrapper
    public void attachBaseContext(Context context) {
        com_bytedance_common_wschannel_client_AbsWsClientService_com_ss_android_ugc_aweme_feed_lancet_JatoBoostLancet_serviceAttachBaseContext(this, context);
    }

    public void com_bytedance_common_wschannel_client_AbsWsClientService__attachBaseContext$___twin___(Context context) {
        super.attachBaseContext(context);
    }

    @Override // X.InterfaceC66931QOp
    public void onReceive(WsChannelMsg wsChannelMsg) {
    }

    @Override // X.InterfaceC66931QOp
    public abstract /* synthetic */ void onReceiveConnectEvent(C66930QOo c66930QOo, JSONObject jSONObject);

    @Override // X.InterfaceC66931QOp
    public abstract /* synthetic */ void onReceiveServiceEvent(ServiceConnectEvent serviceConnectEvent);

    @Override // X.InterfaceC66931QOp
    public void onSendResult(String str, boolean z) {
    }

    public abstract /* synthetic */ void replySendMsgResult(WsChannelMsg wsChannelMsg, boolean z);

    @Override // X.InterfaceC66931QOp
    public abstract /* synthetic */ void syncState(int i, EnumC66933QOr enumC66933QOr, boolean z);

    @Override // android.app.Service
    public void onCreate() {
        super.onCreate();
        this.mMessenger = new Messenger(this.mHandler);
    }

    @Override // android.app.Service
    public void onDestroy() {
        super.onDestroy();
        Logger.debug();
    }

    @Override // com.bytedance.common.utility.collection.WeakHandler.IHandler
    public void handleMsg(Message message) {
        try {
            long elapsedRealtimeNanos = SystemClock.elapsedRealtimeNanos();
            if (message != null && message.what == 10123) {
                Intent intent = (Intent) message.getData().getParcelable("DATA_INTENT");
                Logger.debug();
                if (intent != null) {
                    C66941QOz LIZ = C66941QOz.LIZ();
                    ARunnableS7S0200100_11 aRunnableS7S0200100_11 = new ARunnableS7S0200100_11(this, intent, elapsedRealtimeNanos, 1);
                    LIZ.getClass();
                    C66941QOz.LJLILLLLZI.post(aRunnableS7S0200100_11);
                }
            }
        } catch (Exception unused) {
        }
    }

    @Override // android.app.Service
    public IBinder onBind(Intent intent) {
        return this.mMessenger.getBinder();
    }

    public static void com_bytedance_common_wschannel_client_AbsWsClientService_com_ss_android_ugc_aweme_feed_lancet_JatoBoostLancet_serviceAttachBaseContext(AbsWsClientService absWsClientService, Context context) {
        if (!C84763XOl.LJIIJJI && C38413F5t.LIZ("serviceAttachBaseContext")) {
            C35532Dx2.LIZJ();
        }
        absWsClientService.com_bytedance_common_wschannel_client_AbsWsClientService__attachBaseContext$___twin___(context);
    }

    public void handleIntent(Intent intent, long j) {
        if (intent == null) {
            return;
        }
        this.parser.LIZ(intent, new C66938QOw(j));
    }

    @Override // android.app.Service
    public int onStartCommand(Intent intent, int i, int i2) {
        String str;
        if (Logger.debug()) {
            StringBuilder LIZ = X1D.LIZ();
            LIZ.append("onStartCommand intent = ");
            if (intent != null) {
                str = intent.toString();
            } else {
                str = "null";
            }
            LIZ.append(str);
            Logger.d("AbsWsClientService", X1D.LIZIZ(LIZ));
        }
        long elapsedRealtimeNanos = SystemClock.elapsedRealtimeNanos();
        C66941QOz LIZ2 = C66941QOz.LIZ();
        ARunnableS7S0200100_11 aRunnableS7S0200100_11 = new ARunnableS7S0200100_11(this, intent, elapsedRealtimeNanos, 0);
        LIZ2.getClass();
        C66941QOz.LJLILLLLZI.post(aRunnableS7S0200100_11);
        return 2;
    }
}
