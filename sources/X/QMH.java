package X;

import Y.ARunnableS30S0200000_11;
import android.content.Context;
import android.os.Looper;
import android.os.Message;
import android.text.TextUtils;
import com.bytedance.android.livesdk.livesetting.performance.LiveLayoutPreloadThreadPriority;
import com.bytedance.common.utility.Logger;
import com.bytedance.common.utility.collection.WeakHandler;
import com.bytedance.common.wschannel.app.IWsApp;
import com.bytedance.common.wschannel.channel.IWsChannelClient;
import com.bytedance.common.wschannel.model.SocketState;
import com.bytedance.common.wschannel.model.WsChannelMsg;
import com.bytedance.common.wschannel.server.WsChannelService;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.google.gson.internal.b;
import com.ss.android.ugc.aweme.feed.model.CardStruct;
import defpackage.a1;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.concurrent.atomic.AtomicLong;
import kotlin.jvm.internal.o;
import org.json.JSONObject;
import ujb.s;

/* loaded from: classes12.dex */
public final class QMH implements WeakHandler.IHandler, QMM {
    public final WeakHandler LJLIL;
    public final Context LJLILLLLZI;
    public final QMK LJLJJI;
    public final QMJ LJLJJL;
    public final QGL LJLJJLL;
    public final QML LJLJLJ;
    public final Object LJLJI = new Object();
    public final AtomicLong LJLJL = new AtomicLong(0);
    public boolean LJLJLLL = false;

    public static WsChannelMsg LJI(WsChannelMsg wsChannelMsg) {
        FQ7 fq7 = C66455Q6h.LIZJ;
        if (fq7 == null) {
            return wsChannelMsg;
        }
        try {
            for (Map.Entry entry : ((HashMap) fq7.LIZIZ(wsChannelMsg.LIZIZ())).entrySet()) {
                String str = (String) entry.getKey();
                String str2 = (String) entry.getValue();
                WsChannelMsg.MsgHeader msgHeader = new WsChannelMsg.MsgHeader();
                msgHeader.key = str;
                msgHeader.value = str2;
                wsChannelMsg.msgHeaders.add(msgHeader);
            }
        } catch (Exception unused) {
        }
        return wsChannelMsg;
    }

    public final void LIZ(IWsApp iWsApp) {
        int LJJLI;
        C78946Uyc.LJJIFFI("5.2->doOnParamChange");
        Logger.debug();
        if (iWsApp == null) {
            LJJLI = LiveLayoutPreloadThreadPriority.DEFAULT;
        } else {
            LJJLI = iWsApp.LJJLI();
        }
        if (this.LJLJLJ.isEnable()) {
            try {
                IWsChannelClient iWsChannelClient = (IWsChannelClient) ((java.util.Map) this.LJLJJLL.LIZIZ).get(Integer.valueOf(iWsApp.LJJLI()));
                synchronized (WsChannelService.class) {
                    IWsApp iWsApp2 = (IWsApp) ((java.util.Map) this.LJLJJLL.LIZ).get(Integer.valueOf(LJJLI));
                    if (iWsChannelClient != null && (!iWsApp.equals(iWsApp2) || !iWsChannelClient.isConnected())) {
                        ((java.util.Map) this.LJLJJLL.LIZ).put(Integer.valueOf(LJJLI), iWsApp);
                        this.LJLJJI.LIZ((java.util.Map) this.LJLJJLL.LIZ);
                        iWsChannelClient.onParameterChange(LIZJ(iWsApp), iWsApp.LLLLZ());
                    }
                }
            } catch (Throwable unused) {
            }
        }
    }

    public final void LIZIZ(IWsApp iWsApp) {
        int LJJLI;
        boolean z;
        boolean z2;
        C78946Uyc.LJJIFFI("5.0->doRegisterChannel");
        if (iWsApp == null) {
            LJJLI = LiveLayoutPreloadThreadPriority.DEFAULT;
        } else {
            LJJLI = iWsApp.LJJLI();
        }
        if (!this.LJLJLJ.isEnable()) {
            return;
        }
        synchronized (WsChannelService.class) {
            IWsApp iWsApp2 = (IWsApp) ((java.util.Map) this.LJLJJLL.LIZ).get(Integer.valueOf(LJJLI));
            IWsChannelClient iWsChannelClient = (IWsChannelClient) ((java.util.Map) this.LJLJJLL.LIZIZ).get(Integer.valueOf(LJJLI));
            z = false;
            z2 = true;
            if (iWsApp2 != null) {
                if (iWsApp.equals(iWsApp2)) {
                    if (iWsChannelClient != null) {
                        z2 = false;
                    }
                }
            } else {
                ((java.util.Map) this.LJLJJLL.LIZ).put(Integer.valueOf(LJJLI), iWsApp);
                this.LJLJJI.LIZ((java.util.Map) this.LJLJJLL.LIZ);
            }
            z = z2;
            z2 = false;
        }
        if (z) {
            LJIIIIZZ(iWsApp);
        } else {
            if (!z2) {
                return;
            }
            LIZ(iWsApp);
        }
    }

    public final java.util.Map<String, Object> LIZJ(IWsApp iWsApp) {
        String str;
        HashMap hashMap = new HashMap();
        hashMap.put("app_key", iWsApp.getAppKey());
        hashMap.put("fpid", Integer.valueOf(iWsApp.LLJJJJLIIL()));
        hashMap.put("sdk_version", 2);
        hashMap.put("platform", 0);
        hashMap.put("app_version", Integer.valueOf(iWsApp.getAppVersion()));
        hashMap.put("aid", Integer.valueOf(iWsApp.getAppId()));
        hashMap.put("device_id", iWsApp.getDeviceId());
        hashMap.put("iid", iWsApp.LIZJ());
        hashMap.put("custom_headers", iWsApp.LJFF());
        String extra = iWsApp.getExtra();
        if (extra == null) {
            LIZLLL("extra");
            extra = "";
        }
        if (C66455Q6h.LIZIZ(this.LJLILLLLZI).LIZ.LIZIZ("enableAppStateChangeReport", false)) {
            String[] split = extra.split("&");
            StringBuilder LIZ = X1D.LIZ();
            LIZ.append("is_background=");
            if (this.LJLJLLL) {
                str = CardStruct.IStatusCode.DEFAULT;
            } else {
                str = "1";
            }
            LIZ.append(str);
            String LIZIZ = X1D.LIZIZ(LIZ);
            if (split.length > 0 && !TextUtils.isEmpty(split[0])) {
                extra = a1.LJ(extra, "&", LIZIZ);
            } else {
                extra = LIZIZ;
            }
        }
        hashMap.put("extra", extra);
        if (iWsApp.getDeviceId() == null) {
            LIZLLL("device_id");
        }
        if (iWsApp.LIZJ() == null) {
            LIZLLL("install_id");
        }
        if (C38354F3m.LJ(iWsApp.getAppKey())) {
            LIZLLL("app_key");
        }
        hashMap.put("private_protocol_enable", Boolean.valueOf(iWsApp.g()));
        if (iWsApp.LLLLILI() != null) {
            hashMap.put("service_id_list", iWsApp.LLLLILI());
        }
        if (!TextUtils.isEmpty(iWsApp.LLLLLIL())) {
            hashMap.put("private_protocol_url", iWsApp.LLLLLIL());
        }
        hashMap.put("transport_mode", Integer.valueOf(iWsApp.LLLZLL()));
        hashMap.put("disable_fallback_websocket", Boolean.valueOf(iWsApp.LLLIILIL()));
        if (iWsApp.LJLLL() != null) {
            hashMap.put("monitor_service_id_list", iWsApp.LJLLL());
        }
        return hashMap;
    }

    public final void LIZLLL(String str) {
        b.LJJI(this.LJLILLLLZI, "wschannel_param_null", C0H1.LIZ("param_name", str));
    }

    public final void LJ(boolean z) {
        if (z) {
            LJII(this.LJLJJI.LIZIZ());
            return;
        }
        try {
            synchronized (this.LJLJI) {
                Iterator it = ((java.util.Map) this.LJLJJLL.LIZIZ).entrySet().iterator();
                while (it.hasNext()) {
                    IWsChannelClient iWsChannelClient = (IWsChannelClient) ((Map.Entry) it.next()).getValue();
                    if (iWsChannelClient != null) {
                        iWsChannelClient.destroy();
                    }
                }
                ((java.util.Map) this.LJLJJLL.LIZIZ).clear();
            }
            ((java.util.Map) this.LJLJJLL.LIZ).clear();
        } catch (Throwable unused) {
        }
    }

    public final void LJFF(IWsChannelClient iWsChannelClient) {
        String str;
        if (iWsChannelClient == null) {
            return;
        }
        QMR qmr = new QMR(Integer.MAX_VALUE);
        qmr.LJ = 4;
        qmr.LIZLLL = 9000;
        qmr.LIZJ = 1008601L;
        qmr.LJFF = new byte[0];
        qmr.LJII = "pb";
        qmr.LJI = "pb";
        if (this.LJLJLLL) {
            str = CardStruct.IStatusCode.DEFAULT;
        } else {
            str = "1";
        }
        ((HashMap) qmr.LIZIZ).put("IsBackground", str);
        WsChannelMsg LIZ = qmr.LIZ();
        if (iWsChannelClient.privateProtocolEnabled()) {
            iWsChannelClient.sendMessage(LIZ);
        } else {
            iWsChannelClient.sendMessage(C66509Q8j.LIZIZ(LIZ));
        }
    }

    public final void LJII(java.util.Map<Integer, IWsApp> map) {
        C66455Q6h LIZIZ;
        Context context = this.LJLILLLLZI;
        if ((context == null || (LIZIZ = C66455Q6h.LIZIZ(context)) == null || !LIZIZ.LIZ.LIZIZ("key_enable_offline_detect", false) || C48005Isj.LIZJ(this.LJLILLLLZI)) && this.LJLJLJ.isEnable() && map != null) {
            for (IWsApp iWsApp : map.values()) {
                if (iWsApp != null) {
                    LIZIZ(iWsApp);
                }
            }
        }
    }

    public final void LJIIIIZZ(IWsApp iWsApp) {
        IWsChannelClient iWsChannelClient;
        String msg = iWsApp.getExtra();
        o.LJIIIZ(msg, "msg");
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("status", 3);
            JSONObject jSONObject2 = new JSONObject();
            jSONObject2.put("message", msg);
            try {
                jSONObject2.put("enter_from", (String) ListProtector.get(s.LJLJJL((CharSequence) ListProtector.get(s.LJLJJL(msg, new String[]{"em="}, 0, 6), 1), new String[]{"&"}, 0, 6), 0));
            } catch (Exception e) {
                C36922EeM.LJFF(e);
            }
            C09900aA.LJI("aweme_long_connection_status", jSONObject, null, jSONObject2);
        } catch (Exception e2) {
            C36922EeM.LIZ(e2);
        }
        C78946Uyc.LJJIFFI("5.1->tryOpenConnection");
        Logger.debug();
        synchronized (this.LJLJI) {
            iWsChannelClient = (IWsChannelClient) ((java.util.Map) this.LJLJJLL.LIZIZ).get(Integer.valueOf(iWsApp.LJJLI()));
            if (iWsChannelClient == null) {
                iWsChannelClient = new QMI(iWsApp.LJJLI(), this.LJLJJL, this.LJLIL);
                iWsChannelClient.init(this.LJLILLLLZI, iWsChannelClient);
                ((java.util.Map) this.LJLJJLL.LIZIZ).put(Integer.valueOf(iWsApp.LJJLI()), iWsChannelClient);
            }
        }
        try {
            if (iWsChannelClient.isConnected()) {
                SocketState socketState = (SocketState) ((java.util.Map) this.LJLJJLL.LIZJ).get(Integer.valueOf(iWsApp.LJJLI()));
                if (socketState != null) {
                    this.LJLJJL.LIZLLL(socketState);
                }
            } else {
                Logger.debug();
                iWsChannelClient.openConnection(LIZJ(iWsApp), iWsApp.LLLLZ());
            }
        } catch (Throwable unused) {
        }
    }

    @Override // com.bytedance.common.utility.collection.WeakHandler.IHandler
    public final void handleMsg(Message message) {
        this.LJLIL.post(new ARunnableS30S0200000_11(this, Message.obtain(message), 46));
    }

    public QMH(Context context, Looper looper, QMK qmk, QGL qgl, QMJ qmj, QML qml) {
        this.LJLILLLLZI = C16880lQ.LLLLL(context);
        WeakHandler weakHandler = new WeakHandler(looper, this);
        this.LJLIL = weakHandler;
        this.LJLJJI = qmk;
        this.LJLJJLL = qgl;
        this.LJLJJL = qmj;
        this.LJLJLJ = qml;
        qml.LIZ(this);
        weakHandler.post(new ARunnableS30S0200000_11(this, qml, 45));
    }
}
