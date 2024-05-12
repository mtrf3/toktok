package X;

import Y.ARunnableS30S0200000_11;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import com.bytedance.common.utility.Logger;
import com.bytedance.common.wschannel.app.IWsApp;
import com.bytedance.common.wschannel.channel.IWsChannelClient;
import com.bytedance.common.wschannel.model.NewMsgTimeHolder;
import com.bytedance.common.wschannel.model.ServiceConnectEvent;
import com.bytedance.common.wschannel.model.SocketState;
import com.bytedance.common.wschannel.model.WsChannelMsg;
import com.bytedance.common.wschannel.server.WsChannelService;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Map;
import java.util.concurrent.atomic.AtomicInteger;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: X.QMd, reason: case insensitive filesystem */
/* loaded from: classes12.dex */
public final class C66867QMd implements QMJ {
    public final Context LIZ;
    public final QGL LIZIZ;
    public final QOK LIZJ;
    public final C66925QOj LIZLLL;
    public QMH LJ;
    public final AtomicInteger LJFF;

    @Override // X.QMJ
    public final void LIZ() {
    }

    @Override // X.QMJ
    public final void LJFF() {
        Intent intent = new Intent();
        intent.setAction("com.bytedance.article.wschannel.syncconnectstate");
        intent.putParcelableArrayListExtra("connection", new ArrayList<>(((java.util.Map) this.LIZIZ.LIZJ).values()));
        this.LIZLLL.LIZ(intent, null);
    }

    @Override // X.QMJ
    public final void LIZLLL(SocketState socketState) {
        ((java.util.Map) this.LIZIZ.LIZJ).put(Integer.valueOf(socketState.channelId), socketState);
        try {
            Intent intent = new Intent();
            intent.setAction("com.bytedance.article.wschannel.receive.connection");
            intent.putExtra("connection", socketState);
            this.LIZLLL.LIZ(intent, null);
        } catch (Throwable unused) {
        }
    }

    @Override // X.QMJ
    public final void LJ(ServiceConnectEvent serviceConnectEvent) {
        try {
            Intent intent = new Intent();
            intent.setAction("com.bytedance.article.wschannel.receive.service");
            intent.putExtra("service", serviceConnectEvent);
            this.LIZLLL.LIZ(intent, null);
        } catch (Throwable unused) {
        }
    }

    public final void LJIIIIZZ(C66868QMe c66868QMe) {
        boolean z;
        byte[] bArr = c66868QMe.LIZIZ;
        if (bArr == null && c66868QMe.LIZLLL == null) {
            return;
        }
        WsChannelMsg wsChannelMsg = c66868QMe.LIZLLL;
        if (wsChannelMsg != null) {
            z = true;
        } else {
            z = false;
        }
        if (!z) {
            try {
                Logger.debug();
                wsChannelMsg = C66509Q8j.LIZ(bArr);
            } catch (Throwable unused) {
                return;
            }
        }
        if (wsChannelMsg != WsChannelMsg.EMPTY) {
            wsChannelMsg.newMsgTimeHolder = new NewMsgTimeHolder(c66868QMe.LIZJ, 0L, 0L);
            wsChannelMsg.channelId = c66868QMe.LIZ;
            wsChannelMsg.replayToComponentName = new ComponentName(this.LIZ, (Class<?>) WsChannelService.class);
            Logger.debug();
            Object obj = this.LIZIZ.LIZ;
            if (((java.util.Map) obj) != null && ((java.util.Map) obj).size() > 0) {
                Iterator it = ((java.util.Map) this.LIZIZ.LIZ).entrySet().iterator();
                while (it.hasNext()) {
                    IWsApp iWsApp = (IWsApp) ((Map.Entry) it.next()).getValue();
                    if (iWsApp != null && iWsApp.LJJLI() == wsChannelMsg.channelId) {
                        Intent intent = new Intent();
                        intent.setAction("com.bytedance.article.wschannel.receive.payload");
                        intent.putExtra("payload", wsChannelMsg);
                        if (Logger.debug()) {
                            intent.putExtra("msg_count", this.LJFF.addAndGet(1));
                        }
                        this.LIZLLL.LIZ(intent, null);
                    }
                }
            }
        }
    }

    public C66867QMd(Context context, QGL qgl) {
        QOK qok = new QOK();
        this.LIZJ = qok;
        this.LIZLLL = new C66925QOj(qok);
        this.LJFF = new AtomicInteger(0);
        this.LIZ = context;
        this.LIZIZ = qgl;
    }

    @Override // X.QMJ
    public final void LIZJ(WsChannelMsg wsChannelMsg, boolean z) {
        QOK.LIZ(wsChannelMsg, z);
    }

    @Override // X.QMJ
    public final void LJI(int i, byte[] bArr) {
        if (bArr == null) {
            return;
        }
        LJIIIIZZ(new C66868QMe(i, bArr, 0L));
    }

    @Override // X.QMJ
    public final void LJII(int i, WsChannelMsg wsChannelMsg) {
        if (wsChannelMsg == null) {
            return;
        }
        LJIIIIZZ(new C66868QMe(i, wsChannelMsg, 0L));
    }

    @Override // X.QMJ
    public final void LIZIZ(IWsChannelClient iWsChannelClient, int i, JSONObject jSONObject) {
        if (jSONObject == null) {
            return;
        }
        try {
            jSONObject.put("channel_id", i);
        } catch (JSONException e) {
            C16880lQ.LLLLIIL(e);
        }
        LIZLLL(SocketState.LIZ(jSONObject));
        if (!C66455Q6h.LIZIZ(this.LIZ).LIZ.LIZIZ("enableAppStateChangeReport", false)) {
            return;
        }
        QMH qmh = this.LJ;
        qmh.getClass();
        if (!iWsChannelClient.isConnected()) {
            return;
        }
        qmh.LJLIL.post(new ARunnableS30S0200000_11(qmh, iWsChannelClient, 47));
    }
}
