package X;

import kotlin.jvm.internal.o;
import org.json.JSONObject;

/* loaded from: classes7.dex */
public final class F0X implements InterfaceC37776Es8 {
    @Override // X.InterfaceC37776Es8
    public final InterfaceC78280Uns LIZ(JSONObject params) {
        o.LJIIJ(params, "params");
        return new C79850VVm(C38375F4h.LIZIZ(params));
    }

    @Override // X.InterfaceC37776Es8
    public final boolean LIZIZ(EnumC37847EtH platformType) {
        o.LJIIJ(platformType, "platformType");
        if (platformType == EnumC37847EtH.LYNX) {
            return true;
        }
        return false;
    }
}
