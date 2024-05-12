package X;

import com.bytedance.android.live.effect.api.IEffectService;
import com.bytedance.sdk.xbridge.registry.core.model.idl.XBaseModel;
import com.bytedance.sdk.xbridge.registry.core.model.idl.XBaseParamModel;
import com.bytedance.sdk.xbridge.registry.core.model.idl.XBaseResultModel;
import kotlin.jvm.internal.o;

/* renamed from: X.N9l, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class C58893N9l extends AbstractC58891N9j {
    @Override // X.AbstractC37594EpC
    public final void LJI(XBaseParamModel xBaseParamModel, C37356ElM c37356ElM, EnumC37844EtE type) {
        InterfaceC58892N9k interfaceC58892N9k = (InterfaceC58892N9k) xBaseParamModel;
        o.LJIIIZ(type, "type");
        if (((IEffectService) CN1.LIZ(IEffectService.class)).getLiveEffectController().LIZIZ(interfaceC58892N9k.getResourceId(), interfaceC58892N9k.getPanelName())) {
            XBaseModel LIZJ = ED5.LIZJ(InterfaceC58894N9m.class, null);
            InterfaceC58894N9m interfaceC58894N9m = (InterfaceC58894N9m) LIZJ;
            interfaceC58894N9m.setCode(1);
            interfaceC58894N9m.setMsg("");
            c37356ElM.onSuccess((XBaseResultModel) LIZJ, "");
            return;
        }
        C31626Cb8.LIZ(c37356ElM, 0, "is not using", 4);
    }
}
