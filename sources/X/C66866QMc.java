package X;

import Y.ARunnableS30S0200000_11;
import Y.ARunnableS47S0100000_11;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.os.SystemClock;
import com.bytedance.common.utility.Logger;
import com.bytedance.common.wschannel.app.IWsApp;
import com.bytedance.common.wschannel.channel.IWsChannelClient;
import com.bytedance.common.wschannel.client.WsClientService;
import com.bytedance.common.wschannel.model.NewMsgTimeHolder;
import com.bytedance.common.wschannel.model.ServiceConnectEvent;
import com.bytedance.common.wschannel.model.SocketState;
import com.bytedance.common.wschannel.model.WsChannelMsg;
import com.bytedance.common.wschannel.server.WsChannelService;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Map;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Future;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.atomic.AtomicBoolean;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: X.QMc, reason: case insensitive filesystem */
/* loaded from: classes12.dex */
public final class C66866QMc implements QMJ {
    public static final AtomicBoolean LJIIIZ = new AtomicBoolean(true);
    public final Context LIZ;
    public final QGL LIZIZ;
    public final C66870QMg LIZJ;
    public QMH LJ;
    public Future<?> LJIIIIZZ;
    public final BlockingQueue<C66868QMe> LJFF = new LinkedBlockingQueue();
    public final ExecutorService LJI = C16880lQ.LLLLZLLIL();
    public ARunnableS47S0100000_11 LJII = new ARunnableS47S0100000_11(this, 20);
    public final boolean LIZLLL = true;

    @Override // X.QMJ
    public final void LIZ() {
        this.LIZJ.LIZ.LIZ();
    }

    @Override // X.QMJ
    public final void LJFF() {
        try {
            Intent intent = new Intent();
            intent.setAction("com.bytedance.article.wschannel.syncconnectstate");
            intent.setComponent(new ComponentName(this.LIZ, (Class<?>) WsClientService.class));
            intent.putParcelableArrayListExtra("connection", new ArrayList<>(((java.util.Map) this.LIZIZ.LIZJ).values()));
            this.LIZJ.LIZ.LIZIZ(intent);
        } catch (Throwable unused) {
        }
    }

    public final void LJIIIZ() {
        if (this.LJII == null) {
            this.LJII = new ARunnableS47S0100000_11(this, 20);
        }
        try {
            this.LJIIIIZZ = this.LJI.submit(this.LJII);
        } catch (Throwable unused) {
        }
    }

    @Override // X.QMJ
    public final void LIZLLL(SocketState socketState) {
        ((java.util.Map) this.LIZIZ.LIZJ).put(Integer.valueOf(socketState.channelId), socketState);
        try {
            Intent intent = new Intent();
            intent.setAction("com.bytedance.article.wschannel.receive.connection");
            intent.setComponent(new ComponentName(this.LIZ, (Class<?>) WsClientService.class));
            intent.putExtra("connection", socketState);
            this.LIZJ.LIZ.LIZIZ(intent);
        } catch (Throwable unused) {
        }
    }

    @Override // X.QMJ
    public final void LJ(ServiceConnectEvent serviceConnectEvent) {
        try {
            Intent intent = new Intent();
            intent.setAction("com.bytedance.article.wschannel.receive.service");
            intent.setComponent(new ComponentName(this.LIZ, (Class<?>) WsClientService.class));
            intent.putExtra("service", serviceConnectEvent);
            this.LIZJ.LIZ.LIZIZ(intent);
        } catch (Throwable unused) {
        }
    }

    public final void LJIIIIZZ(C66868QMe c66868QMe) {
        boolean z;
        long j;
        WsChannelMsg LIZ;
        if (c66868QMe == null) {
            return;
        }
        if (c66868QMe.LIZIZ == null && c66868QMe.LIZLLL == null) {
            return;
        }
        if (c66868QMe.LIZLLL != null) {
            z = true;
        } else {
            z = false;
        }
        try {
            long j2 = 0;
            if (this.LIZLLL) {
                j = SystemClock.elapsedRealtimeNanos();
            } else {
                j = 0;
            }
            if (!z) {
                byte[] bArr = c66868QMe.LIZIZ;
                Logger.debug();
                LIZ = C66509Q8j.LIZ(bArr);
            } else {
                LIZ = c66868QMe.LIZLLL;
            }
            if (this.LIZLLL) {
                j2 = SystemClock.elapsedRealtimeNanos();
            }
            if (LIZ != WsChannelMsg.EMPTY) {
                LIZ.newMsgTimeHolder = new NewMsgTimeHolder(c66868QMe.LIZJ, j, j2);
                LIZ.channelId = c66868QMe.LIZ;
                LIZ.replayToComponentName = new ComponentName(this.LIZ, (Class<?>) WsChannelService.class);
                Logger.debug();
                Object obj = this.LIZIZ.LIZ;
                if (((java.util.Map) obj) != null && ((java.util.Map) obj).size() > 0) {
                    Iterator it = ((java.util.Map) this.LIZIZ.LIZ).entrySet().iterator();
                    while (it.hasNext()) {
                        IWsApp iWsApp = (IWsApp) ((Map.Entry) it.next()).getValue();
                        if (iWsApp != null && iWsApp.LJJLI() == LIZ.channelId) {
                            try {
                                Intent intent = new Intent();
                                intent.setAction("com.bytedance.article.wschannel.receive.payload");
                                intent.setComponent(new ComponentName(this.LIZ, (Class<?>) WsClientService.class));
                                intent.putExtra("payload", LIZ);
                                this.LIZJ.LIZ.LIZIZ(intent);
                            } catch (Throwable unused) {
                            }
                        }
                    }
                }
            }
        } catch (Throwable unused2) {
        }
    }

    public C66866QMc(Context context, QGL qgl) {
        this.LIZ = context;
        this.LIZIZ = qgl;
        this.LIZJ = new C66870QMg(context, WsClientService.class);
        LJIIIZ();
    }

    @Override // X.QMJ
    public final void LIZJ(WsChannelMsg wsChannelMsg, boolean z) {
        ComponentName componentName = wsChannelMsg.replayToComponentName;
        if (componentName != null) {
            try {
                byte[] LIZ = wsChannelMsg.LIZ();
                if (LIZ == null) {
                    LIZ = new byte[1];
                }
                Intent intent = new Intent();
                intent.setAction("com.bytedance.article.wschannel.send.payload");
                intent.setComponent(componentName);
                intent.putExtra("send_result", z);
                intent.putExtra("payload_md5", C38352F3k.LIZLLL(LIZ));
                Logger.debug();
                C16880lQ.LLLL(this.LIZ, intent);
            } catch (Throwable unused) {
            }
        }
    }

    @Override // X.QMJ
    public final void LJI(int i, byte[] bArr) {
        long j;
        if (bArr == null) {
            return;
        }
        try {
            if (this.LIZLLL) {
                j = SystemClock.elapsedRealtimeNanos();
            } else {
                j = 0;
            }
            ((LinkedBlockingQueue) this.LJFF).offer(new C66868QMe(i, bArr, j));
            LJIIIZ.getAndSet(true);
            LJIIIZ();
        } catch (Throwable unused) {
        }
    }

    @Override // X.QMJ
    public final void LJII(int i, WsChannelMsg wsChannelMsg) {
        long j;
        if (wsChannelMsg == null) {
            return;
        }
        try {
            if (this.LIZLLL) {
                j = SystemClock.elapsedRealtimeNanos();
            } else {
                j = 0;
            }
            ((LinkedBlockingQueue) this.LJFF).offer(new C66868QMe(i, wsChannelMsg, j));
            LJIIIZ.getAndSet(true);
            LJIIIZ();
        } catch (Throwable unused) {
        }
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
        if (C66455Q6h.LIZIZ(this.LIZ).LIZ.LIZIZ("enableAppStateChangeReport", false)) {
            QMH qmh = this.LJ;
            qmh.getClass();
            if (iWsChannelClient.isConnected()) {
                qmh.LJLIL.post(new ARunnableS30S0200000_11(qmh, iWsChannelClient, 47));
            }
        }
        Logger.debug();
    }
}
