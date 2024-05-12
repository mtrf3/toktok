package X;

import android.content.Context;
import android.os.Handler;
import com.bytedance.common.utility.collection.WeakHandler;
import com.bytedance.common.wschannel.channel.IWsChannelClient;
import com.bytedance.common.wschannel.model.ServiceConnectEvent;
import com.bytedance.common.wschannel.model.WsChannelMsg;
import java.util.List;
import org.json.JSONObject;

/* loaded from: classes12.dex */
public final class QMI implements IWsChannelClient {
    public final int LJLIL;
    public final Handler LJLILLLLZI;
    public List<String> LJLJI;
    public IWsChannelClient LJLJJI;
    public final QMJ LJLJJL;

    @Override // com.bytedance.common.wschannel.channel.IWsChannelClient
    public final void destroy() {
        String str;
        synchronized (this) {
            IWsChannelClient iWsChannelClient = this.LJLJJI;
            if (iWsChannelClient != null) {
                iWsChannelClient.destroy();
                if (!(this.LJLJJI instanceof C64868Pd2)) {
                    JSONObject jSONObject = new JSONObject();
                    List<String> list = this.LJLJI;
                    if (list != null && list.size() >= 1) {
                        str = this.LJLJI.get(0);
                    } else {
                        str = "";
                    }
                    try {
                        jSONObject.put("type", 0);
                        jSONObject.put("state", 3);
                        jSONObject.put("url", str);
                        jSONObject.put("channel_type", 1);
                        QMJ qmj = this.LJLJJL;
                        if (qmj != null) {
                            qmj.LIZIZ(this, this.LJLIL, jSONObject);
                        }
                    } catch (Exception e) {
                        C16880lQ.LLLLIIL(e);
                    }
                }
            }
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:28:0x0011, code lost:
    
        if (r0 == null) goto L8;
     */
    /* JADX WARN: Code restructure failed: missing block: B:8:0x0019, code lost:
    
        if (r0 == null) goto L11;
     */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0031  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x002c  */
    /* JADX WARN: Removed duplicated region for block: B:23:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void LIZ() {
        /*
            r3 = this;
            com.bytedance.common.wschannel.channel.IWsChannelClient r0 = r3.LJLJJI
            if (r0 != 0) goto L30
            java.lang.String r2 = ""
            boolean r0 = X.C38354F3m.LJ(r2)
            r1 = 0
            if (r0 != 0) goto L13
            java.lang.Class r0 = java.lang.Class.forName(r2)     // Catch: java.lang.Throwable -> L13
            if (r0 != 0) goto L24
        L13:
            java.lang.String r0 = "org.chromium.wschannel.MySelfChannelImpl"
            java.lang.Class r0 = java.lang.Class.forName(r0)     // Catch: java.lang.Throwable -> L1b
            if (r0 != 0) goto L24
        L1b:
            java.lang.String r0 = "com.b.c.ws.MySelfChannelImpl"
            java.lang.Class r1 = java.lang.Class.forName(r0)     // Catch: java.lang.Throwable -> L21
        L21:
            r0 = r1
            if (r1 == 0) goto L31
        L24:
            java.lang.Object r1 = r0.newInstance()
            boolean r0 = r1 instanceof com.bytedance.common.wschannel.channel.IWsChannelClient
            if (r0 == 0) goto L30
            com.bytedance.common.wschannel.channel.IWsChannelClient r1 = (com.bytedance.common.wschannel.channel.IWsChannelClient) r1
            r3.LJLJJI = r1
        L30:
            return
        L31:
            java.lang.ClassNotFoundException r1 = new java.lang.ClassNotFoundException
            java.lang.String r0 = "plugin class not found"
            r1.<init>(r0)
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: X.QMI.LIZ():void");
    }

    @Override // com.bytedance.common.wschannel.channel.IWsChannelClient
    public final boolean isConnected() {
        IWsChannelClient iWsChannelClient = this.LJLJJI;
        if (iWsChannelClient != null) {
            return iWsChannelClient.isConnected();
        }
        return false;
    }

    @Override // com.bytedance.common.wschannel.channel.IWsChannelClient
    public final boolean privateProtocolEnabled() {
        IWsChannelClient iWsChannelClient = this.LJLJJI;
        if (iWsChannelClient != null) {
            return iWsChannelClient.privateProtocolEnabled();
        }
        return false;
    }

    @Override // com.bytedance.common.wschannel.channel.IWsChannelClient
    public final void stopConnection() {
        IWsChannelClient iWsChannelClient = this.LJLJJI;
        if (iWsChannelClient != null) {
            iWsChannelClient.stopConnection();
        }
    }

    @Override // com.bytedance.common.wschannel.channel.IWsChannelClient
    public final void onAppStateChanged(int i) {
        IWsChannelClient iWsChannelClient = this.LJLJJI;
        if (iWsChannelClient != null) {
            iWsChannelClient.onAppStateChanged(i);
        }
    }

    @Override // com.bytedance.common.wschannel.channel.IWsChannelClient
    public final void onConnection(JSONObject jSONObject) {
        synchronized (this) {
            QMJ qmj = this.LJLJJL;
            if (qmj != null) {
                qmj.LIZIZ(this, this.LJLIL, jSONObject);
            }
        }
    }

    @Override // com.bytedance.common.wschannel.channel.IWsChannelClient
    public final void onMessage(WsChannelMsg wsChannelMsg) {
        QMJ qmj = this.LJLJJL;
        if (qmj != null) {
            qmj.LJII(this.LJLIL, wsChannelMsg);
        }
    }

    @Override // com.bytedance.common.wschannel.channel.IWsChannelClient
    public final void onNetworkStateChanged(int i) {
        IWsChannelClient iWsChannelClient = this.LJLJJI;
        if (iWsChannelClient != null) {
            iWsChannelClient.onNetworkStateChanged(i);
        }
    }

    @Override // com.bytedance.common.wschannel.channel.IWsChannelClient
    public final void registerService(int i) {
        IWsChannelClient iWsChannelClient = this.LJLJJI;
        if (iWsChannelClient != null) {
            iWsChannelClient.registerService(i);
        }
    }

    @Override // com.bytedance.common.wschannel.channel.IWsChannelClient
    public final boolean sendMessage(WsChannelMsg wsChannelMsg) {
        IWsChannelClient iWsChannelClient = this.LJLJJI;
        if (iWsChannelClient != null) {
            return iWsChannelClient.sendMessage(wsChannelMsg);
        }
        return false;
    }

    @Override // com.bytedance.common.wschannel.channel.IWsChannelClient
    public final void unregisterService(int i) {
        IWsChannelClient iWsChannelClient = this.LJLJJI;
        if (iWsChannelClient != null) {
            iWsChannelClient.unregisterService(i);
        }
    }

    @Override // com.bytedance.common.wschannel.channel.IWsChannelClient
    public final void onMessage(byte[] bArr) {
        QMJ qmj = this.LJLJJL;
        if (qmj != null) {
            qmj.LJI(this.LJLIL, bArr);
        }
    }

    @Override // com.bytedance.common.wschannel.channel.IWsChannelClient
    public final boolean sendMessage(byte[] bArr) {
        IWsChannelClient iWsChannelClient = this.LJLJJI;
        if (iWsChannelClient != null) {
            return iWsChannelClient.sendMessage(bArr);
        }
        return false;
    }

    @Override // com.bytedance.common.wschannel.channel.IWsChannelClient
    public final void init(Context context, IWsChannelClient iWsChannelClient) {
        IWsChannelClient iWsChannelClient2 = this.LJLJJI;
        if (iWsChannelClient2 != null) {
            try {
                iWsChannelClient2.init(context, iWsChannelClient);
            } catch (Throwable th) {
                if (!(this.LJLJJI instanceof C64868Pd2)) {
                    C64868Pd2 c64868Pd2 = new C64868Pd2(this.LJLIL, this.LJLILLLLZI);
                    this.LJLJJI = c64868Pd2;
                    c64868Pd2.init(context, iWsChannelClient);
                    return;
                }
                throw th;
            }
        }
    }

    @Override // com.bytedance.common.wschannel.channel.IWsChannelClient
    public final void onParameterChange(java.util.Map<String, Object> map, List<String> list) {
        IWsChannelClient iWsChannelClient = this.LJLJJI;
        if (iWsChannelClient != null) {
            iWsChannelClient.onParameterChange(map, list);
        }
        this.LJLJI = list;
    }

    @Override // com.bytedance.common.wschannel.channel.IWsChannelClient
    public final void openConnection(java.util.Map<String, Object> map, List<String> list) {
        IWsChannelClient iWsChannelClient = this.LJLJJI;
        if (iWsChannelClient != null) {
            iWsChannelClient.openConnection(map, list);
        }
        this.LJLJI = list;
    }

    public QMI(int i, QMJ qmj, WeakHandler weakHandler) {
        this.LJLIL = i;
        this.LJLJJL = qmj;
        this.LJLILLLLZI = weakHandler;
        try {
            LIZ();
        } catch (Throwable unused) {
        }
        if (this.LJLJJI == null) {
            this.LJLJJI = new C64868Pd2(i, weakHandler);
        }
    }

    @Override // com.bytedance.common.wschannel.channel.IWsChannelClient
    public final void onServiceConnectEvent(int i, boolean z, String str) {
        QMJ qmj = this.LJLJJL;
        if (qmj != null) {
            qmj.LJ(new ServiceConnectEvent(this.LJLIL, i, str, z));
        }
    }
}
