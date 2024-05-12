package X;

import com.bytedance.sdk.xbridge.registry.core.model.idl.XBaseParamModel;
import com.bytedance.sdk.xbridge.registry.core.model.idl.XBaseResultModel;
import kotlin.jvm.internal.o;

/* renamed from: X.FZr, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C39191FZr extends AbstractC39193FZt {
    public final String LJLJJL = "XStopGyroscopeMethod";

    @Override // X.AbstractC37594EpC
    public final void LJI(XBaseParamModel xBaseParamModel, C37356ElM c37356ElM, EnumC37844EtE type) {
        o.LJIIJ(type, "type");
        C37990Eva c37990Eva = C37990Eva.LIZ;
        String jsbSecureDataflowId = ((InterfaceC39195FZv) xBaseParamModel).getJsbSecureDataflowId();
        String str = this.LJLILLLLZI;
        c37990Eva.getClass();
        OSJ LIZ = C37990Eva.LIZ(jsbSecureDataflowId, str);
        if (!((Boolean) LIZ.getFirst()).booleanValue() && LIZ.getSecond() == null) {
            C31626Cb8.LIZ(c37356ElM, 0, (String) LIZ.getThird(), 4);
            return;
        }
        InterfaceC38263Ezz interfaceC38263Ezz = this.LJLIL;
        if (interfaceC38263Ezz == null || interfaceC38263Ezz.LIZLLL() == null) {
            C37887Etv.LIZ(this.LJLJJL, "XStopGyroscopeMethod: obtaining context, but got a null.");
            C31626Cb8.LIZ(c37356ElM, 0, "context is null!!", 4);
        } else {
            C39189FZp.LJLJLJ.LIZ((Integer) LIZ.getSecond(), LJ(type));
            c37356ElM.onSuccess((XBaseResultModel) C17N.LJIILJJIL(C65352Pkq.LIZ(InterfaceC39197FZx.class)), "stop gyroscope execute success.");
        }
    }
}
