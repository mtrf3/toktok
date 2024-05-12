package X;

import com.bytedance.android.live.gift.IGiftService;
import com.bytedance.sdk.xbridge.registry.core.model.idl.XBaseParamModel;
import kotlin.jvm.internal.o;

/* renamed from: X.Uga, reason: case insensitive filesystem */
/* loaded from: classes14.dex */
public final class C77828Uga extends AbstractC77829Ugb {
    @Override // X.AbstractC37594EpC
    public final void LJI(XBaseParamModel xBaseParamModel, C37356ElM c37356ElM, EnumC37844EtE type) {
        o.LJIIIZ(type, "type");
        InterfaceC77830Ugc interfaceC77830Ugc = (InterfaceC77830Ugc) ED5.LIZJ(InterfaceC77830Ugc.class, null);
        interfaceC77830Ugc.setIfNeedShowCpcPrompt(Boolean.valueOf(((IGiftService) CN1.LIZ(IGiftService.class)).shouldShowCPCMessageFromService()));
        c37356ElM.onSuccess(interfaceC77830Ugc, "");
    }
}
