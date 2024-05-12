package X;

import com.byted.cast.common.CastLogger;
import com.byted.cast.common.api.IConnectListener;
import com.byted.cast.common.async.Observer;
import com.byted.cast.common.source.IServerListener;
import java.util.HashMap;

/* renamed from: X.ZkP, reason: case insensitive filesystem */
/* loaded from: classes29.dex */
public final class C90805ZkP implements Observer<C90429ZeL> {
    public final /* synthetic */ C90801ZkL LIZ;

    public C90805ZkP(C90801ZkL c90801ZkL) {
        this.LIZ = c90801ZkL;
    }

    @Override // com.byted.cast.common.async.Observer
    public final void call(C90429ZeL c90429ZeL) {
        C90429ZeL c90429ZeL2 = c90429ZeL;
        if (c90429ZeL2 != null && c90429ZeL2.LIZ == 2) {
            C90801ZkL c90801ZkL = this.LIZ;
            CastLogger castLogger = c90801ZkL.LIZIZ;
            StringBuilder LIZ = X1D.LIZ();
            LIZ.append("handleDisconnectEvent:");
            LIZ.append(c90429ZeL2.LIZIZ);
            LIZ.append(",what:");
            LIZ.append(c90429ZeL2.LIZJ);
            LIZ.append(", extra:");
            LIZ.append(c90429ZeL2.LIZLLL);
            castLogger.d("ByteCastSourceImpl", X1D.LIZIZ(LIZ));
            c90801ZkL.LJJIJIIJIL = EnumC90460Zeq.STATE_DISCONNECTED;
            ((HashMap) c90801ZkL.LJJIJL).clear();
            IConnectListener iConnectListener = c90801ZkL.LJJIJLIJ;
            if (iConnectListener != null) {
                iConnectListener.onDisconnect(c90429ZeL2.LIZIZ, c90429ZeL2.LIZJ, c90429ZeL2.LIZLLL);
            } else {
                c90801ZkL.LIZIZ.d("ByteCastSourceImpl", "handleDisconnectEvent mConnectListener is null");
            }
            IServerListener iServerListener = c90801ZkL.LJJJJIZL;
            if (iServerListener != null) {
                iServerListener.onDisconnect(0, c90429ZeL2.LIZIZ, c90429ZeL2.LIZJ, c90429ZeL2.LIZLLL);
            }
        }
    }

    @Override // com.byted.cast.common.async.Observer
    public final void exception(Exception exc) {
        CastLogger castLogger = this.LIZ.LIZIZ;
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("disconnect, onError:");
        LIZ.append(exc);
        castLogger.d("ByteCastSourceImpl", X1D.LIZIZ(LIZ));
    }
}
