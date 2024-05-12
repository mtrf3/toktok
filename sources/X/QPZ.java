package X;

import com.bytedance.common.wschannel.model.WsChannelMsg;
import kotlin.jvm.internal.AqS161S0100000_11;
import kotlin.jvm.internal.o;
import org.json.JSONObject;

/* loaded from: classes12.dex */
public final class QPZ implements InterfaceC67043QSx, InterfaceC66944QPc, InterfaceC67147QWx, InterfaceC67145QWv, InterfaceC67148QWy {
    public final C62822Ol8 LJLIL;
    public volatile InterfaceC66942QPa LJLILLLLZI;

    @Override // X.InterfaceC67043QSx
    public final void LJ() {
        if (C35154Dqw.LIZ()) {
            C67128QWe c67128QWe = C67128QWe.LIZIZ;
            c67128QWe.LJIIIIZZ(this);
            c67128QWe.LIZJ(((M50) this.LJLIL.getValue()).LJLIL, ((M50) this.LJLIL.getValue()).LJLILLLLZI, this);
        } else {
            C67143QWt c67143QWt = QWY.LJIIIZ;
            c67143QWt.LIZ().LIZJ(this);
            c67143QWt.LIZ().LIZLLL((M50) this.LJLIL.getValue(), this);
        }
    }

    @Override // X.InterfaceC67043QSx
    public final int LJJLI() {
        C35154Dqw.LIZ();
        return 1239108;
    }

    @Override // X.InterfaceC67043QSx
    public final boolean isConnected() {
        if (C35154Dqw.LIZ()) {
            return C67128QWe.LIZIZ.isConnected();
        }
        if (QWY.LJIIIZ.LIZ().LIZLLL == EnumC66933QOr.CONNECTED) {
            return true;
        }
        return false;
    }

    public QPZ(C66947QPf c66947QPf) {
        this.LJLIL = C221108m2.LIZIZ(new AqS161S0100000_11(c66947QPf, 66));
    }

    @Override // X.InterfaceC67147QWx
    public final void LIZ(WsChannelMsg wsChannelMsg) {
        Integer num;
        InterfaceC66942QPa interfaceC66942QPa;
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("common ws received msg, serverId: ");
        if (wsChannelMsg != null) {
            num = Integer.valueOf(wsChannelMsg.service);
        } else {
            num = null;
        }
        LIZ.append(num);
        X1D.LIZIZ(LIZ);
        if (wsChannelMsg == null || wsChannelMsg.service != ((M50) this.LJLIL.getValue()).LJLIL || (interfaceC66942QPa = this.LJLILLLLZI) == null) {
            return;
        }
        interfaceC66942QPa.LIZ(wsChannelMsg);
    }

    @Override // X.InterfaceC67043QSx
    public final void LIZIZ(WsChannelMsg wsChannelMsg) {
        if (C35154Dqw.LIZ()) {
            C67128QWe.LIZIZ.LIZLLL(wsChannelMsg);
        } else {
            QWY.LJIIIZ.LIZ();
            QOW.LJFF(wsChannelMsg);
        }
    }

    @Override // X.InterfaceC67043QSx
    public final void LIZJ(C67036QSq c67036QSq) {
        this.LJLILLLLZI = c67036QSq;
    }

    @Override // X.InterfaceC66944QPc
    public final void LIZLLL(LZK lzk) {
        InterfaceC66942QPa interfaceC66942QPa = this.LJLILLLLZI;
        if (interfaceC66942QPa != null) {
            interfaceC66942QPa.LIZLLL(lzk.LIZ);
        }
    }

    @Override // X.InterfaceC67148QWy
    public final void LJIJJLI(WsChannelMsg msg) {
        o.LJIIIZ(msg, "msg");
        LIZ(msg);
    }

    @Override // X.InterfaceC67145QWv
    public final void LJII(C66930QOo connectEvent, JSONObject jSONObject) {
        o.LJIIIZ(connectEvent, "connectEvent");
        LIZLLL(new LZK(connectEvent, jSONObject));
    }
}
