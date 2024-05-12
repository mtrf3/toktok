package X;

import com.bytedance.common.wschannel.model.WsChannelMsg;
import com.google.gson.internal.b;
import com.ss.android.ugc.aweme.anchor.service.AnchorListServiceImpl;
import kotlin.jvm.internal.o;
import org.json.JSONObject;

/* renamed from: X.M6s, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public final class C56274M6s implements InterfaceC67148QWy, InterfaceC67147QWx, InterfaceC67145QWv, InterfaceC66944QPc {
    public static final C56274M6s LJLIL = new C56274M6s();
    public static final C62822Ol8 LJLILLLLZI = C221108m2.LIZIZ(C56275M6t.LJLIL);

    @Override // X.InterfaceC66944QPc
    public final void LIZLLL(LZK lzk) {
    }

    public static final M50 LIZIZ() {
        return (M50) LJLILLLLZI.getValue();
    }

    @Override // X.InterfaceC67147QWx
    public final void LIZ(WsChannelMsg wsChannelMsg) {
        if (wsChannelMsg == null || wsChannelMsg.service != LIZIZ().LJLIL || wsChannelMsg.method != LIZIZ().LJLILLLLZI) {
            return;
        }
        b.LJJIJIIJIL("rd_anchor_premission_validation", new OSZ("validation_time", Long.valueOf(System.currentTimeMillis())), new OSZ("extra", wsChannelMsg.toString()));
        AnchorListServiceImpl.LIZLLL().LIZ();
    }

    @Override // X.InterfaceC67148QWy
    public final void LJIJJLI(WsChannelMsg msg) {
        o.LJIIIZ(msg, "msg");
        LIZ(msg);
    }

    @Override // X.InterfaceC67145QWv
    public final void LJII(C66930QOo connectEvent, JSONObject jSONObject) {
        o.LJIIIZ(connectEvent, "connectEvent");
    }
}
