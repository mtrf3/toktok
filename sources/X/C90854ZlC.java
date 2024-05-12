package X;

import Y.IDRunnableS86S0100000_24;
import android.text.TextUtils;
import com.byted.cast.common.Dispatcher;
import com.byted.cast.common.Logger;
import com.byted.cast.common.Monitor;
import com.byted.cast.common.NetworkMonitor;
import com.byted.cast.common.api.IServerListener;
import com.byted.cast.common.async.ConcurrentSubject;
import com.byted.cast.common.sink.CallbackServerInfo;
import com.byted.cast.common.sink.CastInfo;
import com.byted.cast.common.sink.ClientInfo;
import com.byted.cast.common.sink.ServerInfo;
import com.byted.cast.common.sink.Statistics;
import java.util.HashMap;

/* renamed from: X.ZlC, reason: case insensitive filesystem */
/* loaded from: classes29.dex */
public final class C90854ZlC implements IServerListener {
    public final /* synthetic */ C90547ZgF LIZ;

    @Override // com.byted.cast.common.api.IServerListener
    public final /* synthetic */ void onAuthSDK(int i, int i2) {
        C90135ZZb.LIZIZ(this, i, i2);
    }

    @Override // com.byted.cast.common.api.IServerListener
    public final /* synthetic */ void onStart(int i) {
        C90135ZZb.LJII(this, i);
    }

    @Override // com.byted.cast.common.api.IServerListener
    public final /* synthetic */ boolean onStartMirrorAuthorization() {
        return C90135ZZb.LJIIIZ(this);
    }

    @Override // com.byted.cast.common.api.IServerListener
    public final /* synthetic */ void onStartRecorder(int i) {
        C90135ZZb.LJIIJ(this, i);
    }

    @Override // com.byted.cast.common.api.IServerListener
    public final /* synthetic */ void onStatistics(Statistics statistics) {
        C90135ZZb.LJIIJJI(this, statistics);
    }

    @Override // com.byted.cast.common.api.IServerListener
    public final /* synthetic */ void onStopRecorder(int i) {
        C90135ZZb.LJIIL(this, i);
    }

    public C90854ZlC(C90547ZgF c90547ZgF) {
        this.LIZ = c90547ZgF;
    }

    @Override // com.byted.cast.common.api.IServerListener
    public final void onStop(int i) {
        com.byted.cast.common.sink.IServerListener iServerListener = this.LIZ.LJIJJLI;
        if (iServerListener != null) {
            iServerListener.onStop(i);
        }
    }

    @Override // com.byted.cast.common.api.IServerListener
    public final void onCast(int i, CastInfo castInfo) {
        C90851Zl9 c90851Zl9 = this.LIZ.LJIL;
        if (c90851Zl9 != null) {
            c90851Zl9.onCast(i, castInfo);
        }
        if (castInfo != null) {
            int i2 = castInfo.infoType;
            if (i2 == 100) {
                ((HashMap) this.LIZ.LJIIJJI).put(castInfo.clientID, castInfo);
            } else if (i2 == 102) {
                this.LIZ.LJIIIZ(castInfo.clientID, "ByteCast_Stop", null);
                ((HashMap) this.LIZ.LJIIJJI).remove(castInfo.clientID);
            }
            Monitor.sendByteCastSinkEvent("bytecast_cast", "", castInfo.connectID, castInfo.toString());
        }
        C90547ZgF c90547ZgF = this.LIZ;
        c90547ZgF.getClass();
        if (castInfo == null) {
            return;
        }
        int i3 = castInfo.infoType;
        if (i3 == 102) {
            if (c90547ZgF.LJIIZILJ) {
                return;
            }
            Dispatcher.getInstance().shutdownScheduleService("net_statistic");
        } else {
            if (i3 != 101 || castInfo.castType != 2) {
                return;
            }
            StringBuilder LIZ = X1D.LIZ();
            LIZ.append("start mirror net statistic task period:");
            LIZ.append(c90547ZgF.LJIILLIIL);
            Logger.d("ByteCastSinkImpl", X1D.LIZIZ(LIZ));
            Dispatcher.getInstance().schedule("net_statistic", new IDRunnableS86S0100000_24(c90547ZgF, 42), c90547ZgF.LJIILLIIL);
        }
    }

    @Override // com.byted.cast.common.api.IServerListener
    public final void onConnect(int i, ClientInfo clientInfo) {
        if (!TextUtils.isEmpty(clientInfo.ip)) {
            NetworkMonitor.setConnectionIpAdd(clientInfo.ip);
        }
        com.byted.cast.common.sink.IServerListener iServerListener = this.LIZ.LJIJJLI;
        if (iServerListener != null) {
            iServerListener.onConnect(i, clientInfo);
        }
    }

    @Override // com.byted.cast.common.api.IServerListener
    public final void onDisconnect(int i, ClientInfo clientInfo) {
        com.byted.cast.common.sink.IServerListener iServerListener = this.LIZ.LJIJJLI;
        if (iServerListener != null) {
            iServerListener.onDisconnect(i, clientInfo);
        }
    }

    @Override // com.byted.cast.common.api.IServerListener
    public final void onStart(int i, ServerInfo serverInfo) {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("onStart serviceId:");
        LIZ.append(i);
        LIZ.append(", serverInfo:");
        LIZ.append(serverInfo);
        Logger.i("ByteCastSinkImpl", X1D.LIZIZ(LIZ));
        CallbackServerInfo callbackServerInfo = new CallbackServerInfo(serverInfo, i);
        synchronized (this.LIZ.LJJIII) {
            ((HashMap) this.LIZ.LJJIFFI).put(serverInfo.aliasName, callbackServerInfo);
            ConcurrentSubject<CallbackServerInfo> concurrentSubject = this.LIZ.LJJII;
            if (concurrentSubject != null) {
                concurrentSubject.notifyObserver(new CallbackServerInfo(serverInfo, i));
            }
        }
    }

    @Override // com.byted.cast.common.api.IServerListener
    public final void onError(int i, int i2, int i3) {
        com.byted.cast.common.sink.IServerListener iServerListener = this.LIZ.LJIJJLI;
        if (iServerListener != null) {
            StringBuilder LIZ = X1D.LIZ();
            LIZ.append(i3);
            LIZ.append("");
            iServerListener.onError(i, i2, X1D.LIZIZ(LIZ));
        }
        StringBuilder LIZ2 = X1D.LIZ();
        LIZ2.append("id:");
        LIZ2.append(i);
        LIZ2.append(",what:");
        LIZ2.append(i2);
        LIZ2.append(",extra:");
        LIZ2.append(i3);
        Monitor.sendByteCastSinkEvent("bytecast_start_server_failure", X1D.LIZIZ(LIZ2), "", "");
    }

    @Override // com.byted.cast.common.api.IServerListener
    public final void onSinkLatencyStat(int i, String str, String str2) {
        C90851Zl9 c90851Zl9 = this.LIZ.LJIL;
        if (c90851Zl9 != null) {
            c90851Zl9.onSinkLatencyStat(i, str, str2);
        }
    }

    @Override // com.byted.cast.common.api.IServerListener
    public final void onSinkStuckStat(int i, String str, String str2) {
        C90851Zl9 c90851Zl9 = this.LIZ.LJIL;
        if (c90851Zl9 != null) {
            c90851Zl9.onSinkStuckStat(i, str, str2);
        }
    }

    @Override // com.byted.cast.common.api.IServerListener
    public final void onAudioFrame(byte[] bArr, int i, int i2, int i3, int i4, long j) {
        C90851Zl9 c90851Zl9 = this.LIZ.LJIL;
        if (c90851Zl9 != null) {
            c90851Zl9.onAudioOutput(null, null, bArr, i, i2, i3, i4, j);
        }
    }
}
