package X;

import com.bytedance.common.wschannel.model.WsChannelMsg;
import kotlin.jvm.internal.o;
import org.json.JSONObject;

/* renamed from: X.XxC, reason: case insensitive filesystem */
/* loaded from: classes16.dex */
public final class C86502XxC implements InterfaceC66944QPc, InterfaceC67147QWx, InterfaceC67145QWv, InterfaceC67148QWy {
    public static final C86502XxC LJLIL = new C86502XxC();
    public static final C62822Ol8 LJLILLLLZI = C221108m2.LIZIZ(C86541Xxp.LJLIL);
    public static final C62822Ol8 LJLJI = C221108m2.LIZIZ(C86540Xxo.LJLIL);

    public static M50 LIZIZ() {
        return (M50) LJLJI.getValue();
    }

    public static final M50 LIZJ() {
        return (M50) LJLILLLLZI.getValue();
    }

    /* JADX WARN: Code restructure failed: missing block: B:23:0x006e, code lost:
    
        if (r6 == null) goto L22;
     */
    @Override // X.InterfaceC67147QWx
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void LIZ(com.bytedance.common.wschannel.model.WsChannelMsg r9) {
        /*
            Method dump skipped, instructions count: 279
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C86502XxC.LIZ(com.bytedance.common.wschannel.model.WsChannelMsg):void");
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
        C86478Xwo.LIZ("FrontierNotifier", X1D.LIZIZ(LIZ));
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
