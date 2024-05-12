package X;

import com.bytedance.common.wschannel.model.WsChannelMsg;
import com.ss.android.ugc.aweme.IAccountService;
import kotlin.jvm.internal.o;
import org.json.JSONObject;

/* loaded from: classes10.dex */
public final class M5B implements InterfaceC66944QPc, InterfaceC67147QWx, InterfaceC67148QWy, InterfaceC67145QWv {
    public static boolean LJLJJI;
    public static C73411SrX LJLJJL;
    public static final M5B LJLIL = new M5B();
    public static final C62822Ol8 LJLILLLLZI = C221108m2.LIZIZ(M5E.LJLIL);
    public static final C62822Ol8 LJLJI = C221108m2.LIZIZ(M5F.LJLIL);
    public static final C62822Ol8 LJLJJLL = C221108m2.LIZIZ(M5C.LJLIL);
    public static final C62822Ol8 LJLJL = C221108m2.LIZIZ(M5D.LJLIL);

    public static M50 LIZIZ() {
        return (M50) LJLILLLLZI.getValue();
    }

    public static M50 LIZJ() {
        return (M50) LJLJI.getValue();
    }

    @Override // X.InterfaceC67147QWx
    public final void LIZ(WsChannelMsg wsChannelMsg) {
        if (((IAccountService) LJLJJLL.getValue()).LJFF().isLogin() && wsChannelMsg != null) {
            if (((wsChannelMsg.service != LIZIZ().LJLIL || wsChannelMsg.method != LIZIZ().LJLILLLLZI) && (wsChannelMsg.service != LIZJ().LJLIL || wsChannelMsg.method != LIZJ().LJLILLLLZI)) || wsChannelMsg.LIZ() == null) {
                return;
            }
            byte[] LIZ = wsChannelMsg.LIZ();
            o.LJIIIIZZ(LIZ, "data.payload");
            String str = new String(LIZ, PVC.LIZ);
            C73411SrX c73411SrX = LJLJJL;
            if (c73411SrX != null) {
                c73411SrX.dispose();
            }
            LJLJJL = (C73411SrX) AbstractC73672Svk.LJIIJ(new C43331GzX(str)).LJJL(T16.LIZ()).LJJJ(C73969T1h.LIZIZ()).LJJJJZI(C43333GzZ.LJLIL);
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
