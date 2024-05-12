package X;

import com.byted.cast.common.api.IServerListener;
import com.byted.cast.common.sink.CastInfo;
import com.byted.cast.common.sink.ClientInfo;
import com.byted.cast.common.sink.ServerInfo;
import com.byted.cast.common.sink.Statistics;
import com.byted.cast.common.source.IMirrorListener;
import com.byted.cast.common.source.ServiceInfo;
import com.bytedance.android.livesdk.livesetting.publicscreen.LiveChatShowDelayForHotLiveSetting;

/* renamed from: X.ZkR, reason: case insensitive filesystem */
/* loaded from: classes29.dex */
public final class C90807ZkR implements IServerListener {
    public final /* synthetic */ IServerListener LIZ;
    public final /* synthetic */ C90436ZeS LIZIZ;

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
    public final /* synthetic */ void onStatistics(Statistics statistics) {
        C90135ZZb.LJIIJJI(this, statistics);
    }

    @Override // com.byted.cast.common.api.IServerListener
    public final boolean onStartMirrorAuthorization() {
        IMirrorListener iMirrorListener = this.LIZIZ.LJIIIZ;
        if (iMirrorListener != null) {
            return iMirrorListener.onStartMirrorAuthorization();
        }
        return this.LIZ.onStartMirrorAuthorization();
    }

    @Override // com.byted.cast.common.api.IServerListener
    public final void onStartRecorder(int i) {
        this.LIZ.onStartRecorder(i);
        IMirrorListener iMirrorListener = this.LIZIZ.LJIIIZ;
        if (iMirrorListener != null) {
            iMirrorListener.onStart(7);
        }
    }

    @Override // com.byted.cast.common.api.IServerListener
    public final void onStop(int i) {
        this.LIZ.onStop(i);
        com.byted.cast.common.source.IServerListener iServerListener = this.LIZIZ.LJIIL;
        if (iServerListener != null) {
            iServerListener.onStop(i);
        }
    }

    @Override // com.byted.cast.common.api.IServerListener
    public final void onStopRecorder(int i) {
        this.LIZ.onStopRecorder(i);
        IMirrorListener iMirrorListener = this.LIZIZ.LJIIIZ;
        if (iMirrorListener != null) {
            iMirrorListener.onStop(7);
        }
    }

    public C90807ZkR(C90436ZeS c90436ZeS, IServerListener iServerListener) {
        this.LIZIZ = c90436ZeS;
        this.LIZ = iServerListener;
    }

    @Override // com.byted.cast.common.api.IServerListener
    public final void onConnect(int i, ClientInfo clientInfo) {
        this.LIZ.onConnect(i, clientInfo);
        if (this.LIZIZ.LJIIL != null) {
            ServiceInfo serviceInfo = new ServiceInfo();
            serviceInfo.name = clientInfo.name;
            serviceInfo.ip = clientInfo.ip;
            serviceInfo.port = clientInfo.port;
            serviceInfo.data = clientInfo.state;
            serviceInfo.protocols = "VastCast";
            this.LIZIZ.LJIIL.onConnect(7, serviceInfo, 200);
        }
    }

    @Override // com.byted.cast.common.api.IServerListener
    public final void onDisconnect(int i, ClientInfo clientInfo) {
        this.LIZ.onDisconnect(i, clientInfo);
        if (this.LIZIZ.LJIIL != null) {
            ServiceInfo serviceInfo = new ServiceInfo();
            serviceInfo.name = clientInfo.name;
            serviceInfo.ip = clientInfo.ip;
            serviceInfo.port = clientInfo.port;
            serviceInfo.data = clientInfo.state;
            serviceInfo.protocols = "VastCast";
            this.LIZIZ.LJIIL.onDisconnect(7, serviceInfo, 0, LiveChatShowDelayForHotLiveSetting.DEFAULT);
        }
    }

    @Override // com.byted.cast.common.api.IServerListener
    public final void onStart(int i, ServerInfo serverInfo) {
        this.LIZ.onStart(i, serverInfo);
        com.byted.cast.common.source.IServerListener iServerListener = this.LIZIZ.LJIIL;
        if (iServerListener != null) {
            iServerListener.onStart(i, serverInfo);
        }
    }

    @Override // com.byted.cast.common.api.IServerListener
    public final void onError(int i, int i2, int i3) {
        this.LIZ.onError(7, i2, i3);
        IMirrorListener iMirrorListener = this.LIZIZ.LJIIIZ;
        if (iMirrorListener != null) {
            iMirrorListener.onError(7, i2, i3, "");
        }
    }
}
