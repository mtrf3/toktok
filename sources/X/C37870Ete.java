package X;

import com.bytedance.ies.bullet.kit.lynx.bridge.LynxBridgeModule;
import com.lynx.react.bridge.ReadableMap;
import kotlin.jvm.internal.o;

/* renamed from: X.Ete, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C37870Ete implements InterfaceC37862EtW {
    public final /* synthetic */ LynxBridgeModule LJLIL;

    public C37870Ete(LynxBridgeModule lynxBridgeModule) {
        this.LJLIL = lynxBridgeModule;
    }

    @Override // X.InterfaceC37862EtW
    public final void LIZIZ(C37955Ev1 call, C37863EtX c37863EtX) {
        o.LJIIJ(call, "call");
        LynxBridgeModule lynxBridgeModule = this.LJLIL;
        String str = call.LIZLLL;
        Object obj = call.LJI;
        if (obj != null) {
            lynxBridgeModule.originCall(str, (ReadableMap) obj, new C37869Etd(c37863EtX));
            return;
        }
        throw new C37692Eqm("null cannot be cast to non-null type com.lynx.react.bridge.ReadableMap");
    }
}
