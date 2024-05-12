package X;

import com.bytedance.common.wschannel.model.WsChannelMsg;
import kotlin.jvm.internal.o;
import org.json.JSONObject;

/* renamed from: X.M4y, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public final class C56228M4y implements InterfaceC66944QPc, InterfaceC67147QWx, InterfaceC67148QWy, InterfaceC67145QWv {
    public static final C56228M4y LJLIL = new C56228M4y();
    public static final C62822Ol8 LJLILLLLZI = C221108m2.LIZIZ(C56229M4z.LJLIL);
    public static final C62822Ol8 LJLJI = C221108m2.LIZIZ(M51.LJLIL);
    public static boolean LJLJJI;
    public static InterfaceC88472Yns<? super String, C76800UCe> LJLJJL;

    public static M50 LIZIZ() {
        return (M50) LJLILLLLZI.getValue();
    }

    public static M50 LIZJ() {
        return (M50) LJLJI.getValue();
    }

    @Override // X.InterfaceC67147QWx
    public final void LIZ(WsChannelMsg wsChannelMsg) {
        InterfaceC88472Yns<? super String, C76800UCe> interfaceC88472Yns;
        if (wsChannelMsg != null) {
            if (((wsChannelMsg.service != LIZIZ().LJLIL || wsChannelMsg.method != LIZIZ().LJLILLLLZI) && (wsChannelMsg.service != LIZJ().LJLIL || wsChannelMsg.method != LIZJ().LJLILLLLZI)) || wsChannelMsg.LIZ() == null || (interfaceC88472Yns = LJLJJL) == null) {
                return;
            }
            byte[] LIZ = wsChannelMsg.LIZ();
            o.LJIIIIZZ(LIZ, "data.payload");
            interfaceC88472Yns.invoke(new String(LIZ, PVC.LIZ));
        }
    }

    @Override // X.InterfaceC66944QPc
    public final void LIZLLL(LZK lzk) {
        EnumC66933QOr enumC66933QOr;
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("onReceiveConnectEvent:");
        C66930QOo c66930QOo = lzk.LIZ;
        if (c66930QOo != null) {
            enumC66933QOr = c66930QOo.LIZIZ;
        } else {
            enumC66933QOr = null;
        }
        LIZ.append(enumC66933QOr);
        LIZ.append("; json: ");
        LIZ.append(lzk.LIZIZ);
        X1D.LIZIZ(LIZ);
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
