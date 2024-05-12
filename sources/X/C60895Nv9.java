package X;

import com.bytedance.sdk.xbridge.registry.core.model.idl.XBaseParamModel;
import com.bytedance.sdk.xbridge.registry.core.model.idl.XBaseResultModel;
import kotlin.jvm.internal.o;

/* renamed from: X.Nv9, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class C60895Nv9 extends AbstractC60896NvA {
    @Override // X.AbstractC37594EpC
    public final void LJI(XBaseParamModel xBaseParamModel, C37356ElM c37356ElM, EnumC37844EtE type) {
        InterfaceC60761Nsz interfaceC60761Nsz;
        C60737Nsb hybridContext;
        InterfaceC60897NvB interfaceC60897NvB = (InterfaceC60897NvB) xBaseParamModel;
        o.LJIIJ(type, "type");
        InterfaceC38263Ezz interfaceC38263Ezz = this.LJLIL;
        if (interfaceC38263Ezz != null && (interfaceC60761Nsz = (InterfaceC60761Nsz) interfaceC38263Ezz.LJ(InterfaceC60761Nsz.class)) != null && (hybridContext = interfaceC60761Nsz.getHybridContext()) != null) {
            hybridContext.LIZ(interfaceC60897NvB.getSubBidToAdd());
            hybridContext.LJIIIIZZ(interfaceC60897NvB.getSubBidToDelete());
            c37356ElM.onSuccess((XBaseResultModel) ED5.LIZJ(InterfaceC60898NvC.class, null), "");
            return;
        }
        C31626Cb8.LIZ(c37356ElM, 0, "Fail to get hybrid context.", 4);
    }
}
