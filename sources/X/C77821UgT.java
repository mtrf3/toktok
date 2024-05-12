package X;

import android.content.Context;
import com.bytedance.android.livesdk.comp.api.game.service.IGamePartnershipService;
import com.bytedance.sdk.xbridge.registry.core.model.idl.XBaseParamModel;
import com.bytedance.sdk.xbridge.registry.core.model.idl.XBaseResultModel;
import kotlin.jvm.internal.o;

/* renamed from: X.UgT, reason: case insensitive filesystem */
/* loaded from: classes14.dex */
public final class C77821UgT extends AbstractC77822UgU {
    @Override // X.AbstractC37594EpC
    public final void LJI(XBaseParamModel xBaseParamModel, C37356ElM c37356ElM, EnumC37844EtE type) {
        Context context;
        InterfaceC77823UgV interfaceC77823UgV = (InterfaceC77823UgV) xBaseParamModel;
        o.LJIIIZ(type, "type");
        XBaseResultModel xBaseResultModel = (XBaseResultModel) ED5.LIZJ(InterfaceC77824UgW.class, null);
        InterfaceC38263Ezz interfaceC38263Ezz = this.LJLIL;
        if (interfaceC38263Ezz != null && (context = interfaceC38263Ezz.getContext()) != null) {
            ((IGamePartnershipService) CN1.LIZ(IGamePartnershipService.class)).ri0(context, interfaceC77823UgV.getSchema(), C113554cx.LJJJLIIL());
        }
        c37356ElM.onSuccess(xBaseResultModel, "");
    }
}
