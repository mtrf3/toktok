package X;

import com.bytedance.sdk.xbridge.registry.core.model.idl.XBaseParamModel;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import kotlin.jvm.internal.o;

/* renamed from: X.CCk, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C30942CCk extends AbstractC31177CLl {
    @Override // X.AbstractC37594EpC
    public final void LJI(XBaseParamModel xBaseParamModel, C37356ElM c37356ElM, EnumC37844EtE type) {
        String LIZIZ;
        o.LJIIIZ(type, "type");
        InterfaceC38263Ezz interfaceC38263Ezz = this.LJLIL;
        if (interfaceC38263Ezz != null && (LIZIZ = interfaceC38263Ezz.LIZIZ()) != null) {
            Iterator it = ((ArrayList) C12840eu.LIZ.LIZIZ).iterator();
            while (it.hasNext()) {
                InterfaceC32911Qx interfaceC32911Qx = (InterfaceC32911Qx) ((HashMap) ((C12830et) it.next()).LJFF).get(LIZIZ);
                if (interfaceC32911Qx != null) {
                    interfaceC32911Qx.Q9();
                    return;
                }
            }
        }
    }
}
