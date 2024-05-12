package X;

import com.bytedance.hybrid.spark.SparkContext;
import com.bytedance.sdk.xbridge.registry.core.model.idl.XBaseParamModel;
import kotlin.jvm.internal.o;

/* renamed from: X.CJm, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C31126CJm extends AbstractC31178CLm {
    @Override // X.AbstractC37594EpC
    public final void LJI(XBaseParamModel xBaseParamModel, C37356ElM c37356ElM, EnumC37844EtE type) {
        InterfaceC31125CJl interfaceC31125CJl;
        o.LJIIIZ(type, "type");
        C39359FcZ c39359FcZ = SparkContext.Companion;
        InterfaceC38263Ezz interfaceC38263Ezz = this.LJLIL;
        String str = null;
        if (interfaceC38263Ezz != null) {
            str = interfaceC38263Ezz.LIZIZ();
        }
        c39359FcZ.getClass();
        InterfaceC40159FpT LIZ = C39359FcZ.LIZ(str);
        if ((LIZ instanceof InterfaceC31125CJl) && (interfaceC31125CJl = (InterfaceC31125CJl) LIZ) != null) {
            interfaceC31125CJl.LLLLLIL();
        }
    }
}
