package X;

import com.byted.cast.common.source.IMirrorListener;
import com.byted.cast.common.source.ServiceInfo;
import com.byted.cast.common.source.Statistics;

/* renamed from: X.Zly, reason: case insensitive filesystem */
/* loaded from: classes29.dex */
public final class C90902Zly implements IMirrorListener {
    public final /* synthetic */ C90436ZeS LIZ;

    @Override // com.byted.cast.common.source.IMirrorListener
    public final boolean onStartMirrorAuthorization() {
        return false;
    }

    public C90902Zly(C90436ZeS c90436ZeS) {
        this.LIZ = c90436ZeS;
    }

    @Override // com.byted.cast.common.source.IMirrorListener
    public final void onMirrorModeChange(int i) {
        IMirrorListener iMirrorListener = this.LIZ.LJIIIZ;
        if (iMirrorListener != null) {
            iMirrorListener.onMirrorModeChange(i);
        }
    }

    @Override // com.byted.cast.common.source.IMirrorListener
    public final void onStart(int i) {
        IMirrorListener iMirrorListener = this.LIZ.LJIIIZ;
        if (iMirrorListener != null) {
            iMirrorListener.onStart(3);
        }
    }

    @Override // com.byted.cast.common.source.IMirrorListener
    public final void onStatistics(Statistics statistics) {
        IMirrorListener iMirrorListener = this.LIZ.LJIIIZ;
        if (iMirrorListener != null) {
            iMirrorListener.onStatistics(statistics);
        }
    }

    @Override // com.byted.cast.common.source.IMirrorListener
    public final void onStop(int i) {
        IMirrorListener iMirrorListener = this.LIZ.LJIIIZ;
        if (iMirrorListener != null) {
            iMirrorListener.onStop(3);
        }
    }

    @Override // com.byted.cast.common.api.IConnectListener
    public final void onConnect(ServiceInfo serviceInfo, int i) {
        C90800ZkK c90800ZkK = this.LIZ.LJIIJ;
        if (c90800ZkK != null) {
            c90800ZkK.onConnect(serviceInfo, i);
        }
        IMirrorListener iMirrorListener = this.LIZ.LJIIIZ;
        if (iMirrorListener != null) {
            iMirrorListener.onConnect(serviceInfo, i);
        }
    }

    @Override // com.byted.cast.common.source.IMirrorListener
    public final boolean onInvite(String str, int i) {
        IMirrorListener iMirrorListener = this.LIZ.LJIIIZ;
        if (iMirrorListener != null) {
            return iMirrorListener.onInvite(str, i);
        }
        return false;
    }

    @Override // com.byted.cast.common.api.IConnectListener
    public final void onDisconnect(ServiceInfo serviceInfo, int i, int i2) {
        C90800ZkK c90800ZkK = this.LIZ.LJIIJ;
        if (c90800ZkK != null) {
            c90800ZkK.onDisconnect(serviceInfo, i, i2);
        }
        IMirrorListener iMirrorListener = this.LIZ.LJIIIZ;
        if (iMirrorListener != null) {
            iMirrorListener.onDisconnect(serviceInfo, i, i2);
        }
    }

    @Override // com.byted.cast.common.source.IMirrorListener
    public final void onError(int i, int i2, int i3, String str) {
        IMirrorListener iMirrorListener = this.LIZ.LJIIIZ;
        if (iMirrorListener != null) {
            iMirrorListener.onError(3, i2, i3, str);
        }
    }

    @Override // com.byted.cast.common.source.IMirrorListener
    public final void onInfo(int i, int i2, int i3, String str) {
        IMirrorListener iMirrorListener = this.LIZ.LJIIIZ;
        if (iMirrorListener != null) {
            iMirrorListener.onInfo(3, i2, i3, str);
        }
    }
}
