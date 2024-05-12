package X;

import com.bytedance.sdk.xbridge.registry.core.model.idl.XBaseModel;
import com.bytedance.sdk.xbridge.registry.core.model.idl.XBaseParamModel;
import kotlin.jvm.internal.o;

/* renamed from: X.FAk, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C38534FAk extends AbstractC38535FAl {
    @Override // X.AbstractC37594EpC
    public final void LJI(XBaseParamModel xBaseParamModel, C37356ElM c37356ElM, EnumC37844EtE type) {
        boolean z;
        String str = "";
        InterfaceC38536FAm interfaceC38536FAm = (InterfaceC38536FAm) xBaseParamModel;
        o.LJIIIZ(type, "type");
        try {
            String key = interfaceC38536FAm.getKey();
            if (o.LJ(interfaceC38536FAm.getAction(), "get")) {
                if (key == null || key.length() == 0) {
                    z = true;
                } else {
                    z = false;
                }
                String str2 = null;
                if (z) {
                    String LIZ = C36033ECf.LIZ();
                    InterfaceC38263Ezz interfaceC38263Ezz = this.LJLIL;
                    if (interfaceC38263Ezz != null) {
                        str2 = interfaceC38263Ezz.LIZIZ();
                    }
                    XBaseModel LIZJ = ED5.LIZJ(InterfaceC38537FAn.class, str2);
                    ((InterfaceC38537FAn) LIZJ).setUserActData(LIZ);
                    c37356ElM.onSuccess((InterfaceC38537FAn) LIZJ, "");
                    return;
                }
                String LIZJ2 = C36033ECf.LIZJ(key);
                InterfaceC38263Ezz interfaceC38263Ezz2 = this.LJLIL;
                if (interfaceC38263Ezz2 != null) {
                    str2 = interfaceC38263Ezz2.LIZIZ();
                }
                XBaseModel LIZJ3 = ED5.LIZJ(InterfaceC38537FAn.class, str2);
                ((InterfaceC38537FAn) LIZJ3).setUserActData(LIZJ2);
                c37356ElM.onSuccess((InterfaceC38537FAn) LIZJ3, "");
                return;
            }
            C31626Cb8.LIZ(c37356ElM, 0, "something error", 4);
        } catch (Exception e) {
            String message = e.getMessage();
            if (message != null) {
                str = message;
            }
            C31626Cb8.LIZ(c37356ElM, 0, str, 4);
        }
    }
}
