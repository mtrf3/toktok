package X;

import com.byted.cast.common.api.IServerListener;
import com.byted.cast.common.sink.CastInfo;
import com.byted.cast.common.sink.ClientInfo;
import com.byted.cast.common.sink.ServerInfo;
import com.byted.cast.common.sink.Statistics;
import com.byted.cast.common.source.IMirrorListener;
import com.byted.cast.common.source.ServiceInfo;
import com.bytedance.android.livesdk.livesetting.publicscreen.LiveChatShowDelayForHotLiveSetting;
import com.bytedance.mt.protector.impl.collections.ListProtector;

/* renamed from: X.ZkS, reason: case insensitive filesystem */
/* loaded from: classes29.dex */
public final class C90808ZkS implements IServerListener {
    public final /* synthetic */ C90436ZeS LIZ;

    @Override // com.byted.cast.common.api.IServerListener
    public final /* synthetic */ void onAudioFrame(byte[] bArr, int i, int i2, int i3, int i4, long j) {
        C90135ZZb.LIZ(this, bArr, i, i2, i3, i4, j);
    }

    @Override // com.byted.cast.common.api.IServerListener
    public final /* synthetic */ void onAuthSDK(int i, int i2) {
        C90135ZZb.LIZIZ(this, i, i2);
    }

    @Override // com.byted.cast.common.api.IServerListener
    public final void onCast(int i, CastInfo castInfo) {
    }

    @Override // com.byted.cast.common.api.IServerListener
    public final /* synthetic */ void onSinkLatencyStat(int i, String str, String str2) {
        C90135ZZb.LJFF(this, i, str, str2);
    }

    @Override // com.byted.cast.common.api.IServerListener
    public final /* synthetic */ void onSinkStuckStat(int i, String str, String str2) {
        C90135ZZb.LJI(this, i, str, str2);
    }

    @Override // com.byted.cast.common.api.IServerListener
    public final /* synthetic */ void onStart(int i) {
        C90135ZZb.LJII(this, i);
    }

    @Override // com.byted.cast.common.api.IServerListener
    public final boolean onStartMirrorAuthorization() {
        IMirrorListener iMirrorListener = this.LIZ.LJIIIZ;
        if (iMirrorListener != null) {
            return iMirrorListener.onStartMirrorAuthorization();
        }
        return true;
    }

    public C90808ZkS(C90436ZeS c90436ZeS) {
        this.LIZ = c90436ZeS;
    }

    @Override // com.byted.cast.common.api.IServerListener
    public final void onStartRecorder(int i) {
        IMirrorListener iMirrorListener = this.LIZ.LJIIIZ;
        if (iMirrorListener != null) {
            iMirrorListener.onStart(7);
        }
    }

    @Override // com.byted.cast.common.api.IServerListener
    public final void onStatistics(Statistics statistics) {
        if (this.LIZ.LJIIIZ != null) {
            com.byted.cast.common.source.Statistics statistics2 = new com.byted.cast.common.source.Statistics();
            statistics2.nx.lossRate = ((Statistics.NetworkStatistics) ListProtector.get(statistics.nx, 0)).lossRate;
            statistics2.nx.rtt = ((Statistics.NetworkStatistics) ListProtector.get(statistics.nx, 0)).rtt;
            this.LIZ.LJIIIZ.onStatistics(statistics2);
        }
    }

    @Override // com.byted.cast.common.api.IServerListener
    public final void onStop(int i) {
        com.byted.cast.common.source.IServerListener iServerListener = this.LIZ.LJIIL;
        if (iServerListener != null) {
            iServerListener.onStop(i);
        }
    }

    @Override // com.byted.cast.common.api.IServerListener
    public final void onStopRecorder(int i) {
        IMirrorListener iMirrorListener = this.LIZ.LJIIIZ;
        if (iMirrorListener != null) {
            iMirrorListener.onStop(7);
        }
    }

    @Override // com.byted.cast.common.api.IServerListener
    public final void onConnect(int i, ClientInfo clientInfo) {
        if (this.LIZ.LJIIL != null) {
            ServiceInfo serviceInfo = new ServiceInfo();
            serviceInfo.name = clientInfo.name;
            serviceInfo.ip = clientInfo.ip;
            serviceInfo.port = clientInfo.port;
            serviceInfo.data = clientInfo.state;
            serviceInfo.protocols = "VastCast";
            this.LIZ.LJIIL.onConnect(7, serviceInfo, 200);
        }
    }

    @Override // com.byted.cast.common.api.IServerListener
    public final void onDisconnect(int i, ClientInfo clientInfo) {
        if (this.LIZ.LJIIL != null) {
            ServiceInfo serviceInfo = new ServiceInfo();
            serviceInfo.name = clientInfo.name;
            serviceInfo.ip = clientInfo.ip;
            serviceInfo.port = clientInfo.port;
            serviceInfo.data = clientInfo.state;
            serviceInfo.protocols = "VastCast";
            this.LIZ.LJIIL.onDisconnect(7, serviceInfo, 0, LiveChatShowDelayForHotLiveSetting.DEFAULT);
        }
    }

    @Override // com.byted.cast.common.api.IServerListener
    public final void onStart(int i, ServerInfo serverInfo) {
        com.byted.cast.common.source.IServerListener iServerListener = this.LIZ.LJIIL;
        if (iServerListener != null) {
            iServerListener.onStart(i, serverInfo);
        }
    }

    @Override // com.byted.cast.common.api.IServerListener
    public final void onError(int i, int i2, int i3) {
        IMirrorListener iMirrorListener = this.LIZ.LJIIIZ;
        if (iMirrorListener != null) {
            iMirrorListener.onError(7, i2, i3, "");
        }
    }
}
