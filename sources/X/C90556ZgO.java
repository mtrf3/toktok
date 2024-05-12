package X;

import android.text.TextUtils;
import com.byted.cast.common.Logger;
import com.byted.cast.common.api.ICastSink;
import com.byted.cast.common.api.IServerListener;
import com.byted.cast.common.discovery.NsdListener;
import com.byted.cast.common.discovery.NsdService;

/* renamed from: X.ZgO, reason: case insensitive filesystem */
/* loaded from: classes29.dex */
public class C90556ZgO implements NsdListener {
    public final /* synthetic */ ZWQ LIZ;

    @Override // com.byted.cast.common.discovery.NsdListener
    public final void onNsdDiscoveryFinished() {
    }

    @Override // com.byted.cast.common.discovery.NsdListener
    public final void onNsdServiceFound(NsdService nsdService) {
    }

    @Override // com.byted.cast.common.discovery.NsdListener
    public final void onNsdServiceLost(NsdService nsdService) {
    }

    @Override // com.byted.cast.common.discovery.NsdListener
    public final void onNsdServiceResolved(NsdService nsdService) {
    }

    public C90556ZgO(ZWQ zwq) {
        this.LIZ = zwq;
    }

    @Override // com.byted.cast.common.discovery.NsdListener
    public final void onNsdRegistered(NsdService nsdService) {
        String name;
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("onNsdRegistered: ");
        LIZ.append(nsdService);
        Logger.i("NsdServer", X1D.LIZIZ(LIZ));
        if (nsdService == null) {
            name = "";
        } else {
            name = nsdService.getName();
        }
        StringBuilder LIZ2 = X1D.LIZ();
        LIZ2.append("mServiceName is ");
        LIZ2.append(this.LIZ.LIZLLL);
        LIZ2.append(", registerName is ");
        LIZ2.append(name);
        Logger.i("NsdServer", X1D.LIZIZ(LIZ2));
        if (!TextUtils.isEmpty(this.LIZ.LIZLLL) && !TextUtils.isEmpty(name) && !TextUtils.equals(this.LIZ.LIZLLL, name) && name.startsWith(this.LIZ.LIZLLL)) {
            ZWQ zwq = this.LIZ;
            zwq.LIZLLL = name;
            ICastSink iCastSink = zwq.LJIIIZ;
            if (iCastSink != null) {
                iCastSink.upDateServerName(name);
            }
        }
    }

    @Override // com.byted.cast.common.discovery.NsdListener
    public final void onNsdUnRegistered(NsdService nsdService) {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("onNsdUnRegistered: ");
        LIZ.append(nsdService);
        Logger.i("NsdServer", X1D.LIZIZ(LIZ));
    }

    @Override // com.byted.cast.common.discovery.NsdListener
    public final void onNsdError(String str, int i, String str2) {
        IServerListener iServerListener = this.LIZ.LJFF;
        if (iServerListener != null) {
            iServerListener.onError(5, 10009, i);
        }
    }
}
