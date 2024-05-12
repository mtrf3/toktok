package X;

import com.ss.ugc.effectplatform.model.Effect;
import kotlin.jvm.internal.o;

/* renamed from: X.XCd, reason: case insensitive filesystem */
/* loaded from: classes16.dex */
public final class C84443XCd extends AbstractC65781Prl implements InterfaceC88474Ynu<String, String, java.util.Map<String, Effect>, InterfaceC84451XCl, C76800UCe> {
    public final /* synthetic */ XCU LJLIL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C84443XCd(XCU xcu) {
        super(4);
        this.LJLIL = xcu;
    }

    @Override // X.InterfaceC88474Ynu
    public final C76800UCe invoke(String str, String str2, java.util.Map<String, Effect> map, InterfaceC84451XCl interfaceC84451XCl) {
        String requestUrl = str;
        String scene = str2;
        java.util.Map<String, Effect> map2 = map;
        InterfaceC84451XCl listener = interfaceC84451XCl;
        o.LJIIJ(requestUrl, "requestUrl");
        o.LJIIJ(scene, "scene");
        o.LJIIJ(map2, "map");
        o.LJIIJ(listener, "listener");
        XCU xcu = this.LJLIL;
        xcu.getClass();
        xcu.LIZIZ(requestUrl, scene, ORZ.LLJI(map2.keySet()), new C84442XCc(listener, map2));
        return C76800UCe.LIZ;
    }
}
