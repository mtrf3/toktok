package X;

import com.bytedance.android.live.wallet.service.IFeedbackService;
import com.bytedance.sdk.xbridge.registry.core.model.idl.XBaseParamModel;
import kotlin.jvm.internal.o;

/* renamed from: X.N8e, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class C58860N8e extends AbstractC58859N8d {
    @Override // X.AbstractC37594EpC
    public final void LJI(XBaseParamModel xBaseParamModel, C37356ElM c37356ElM, EnumC37844EtE type) {
        o.LJIIIZ(type, "type");
        boolean status = ((InterfaceC58861N8f) xBaseParamModel).getStatus();
        InterfaceC58858N8c interfaceC58858N8c = (InterfaceC58858N8c) ED5.LIZJ(InterfaceC58858N8c.class, null);
        interfaceC58858N8c.setCode(1);
        InterfaceC38263Ezz interfaceC38263Ezz = this.LJLIL;
        if (interfaceC38263Ezz != null) {
            interfaceC38263Ezz.getContext();
        }
        if (status) {
            ((IFeedbackService) CN1.LIZ(IFeedbackService.class)).setFeedBackListCompleted();
        } else {
            ((IFeedbackService) CN1.LIZ(IFeedbackService.class)).setFeedBackCancelCount();
        }
        c37356ElM.onSuccess(interfaceC58858N8c, "");
    }
}
