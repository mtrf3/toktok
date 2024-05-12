package X;

import com.bytedance.sdk.xbridge.registry.core.model.idl.XBaseParamModel;
import com.bytedance.sdk.xbridge.registry.core.model.idl.XBaseResultModel;
import kotlin.jvm.internal.o;
import org.json.JSONObject;

/* renamed from: X.Ui9, reason: case insensitive filesystem */
/* loaded from: classes14.dex */
public final class C77925Ui9 extends AbstractC77924Ui8 {
    @Override // X.AbstractC37594EpC
    public final void LJI(XBaseParamModel xBaseParamModel, C37356ElM c37356ElM, EnumC37844EtE type) {
        o.LJIIIZ(type, "type");
        for (InterfaceC77926UiA interfaceC77926UiA : ((InterfaceC77927UiB) xBaseParamModel).getConfig()) {
            String channel = interfaceC77926UiA.getChannel();
            String definition = interfaceC77926UiA.getDefinition();
            interfaceC77926UiA.getShrink();
            interfaceC77926UiA.getDefinitionPath();
            interfaceC77926UiA.getShrinkPath();
            if (definition != null) {
                C04550Fv.LIZIZ(channel, new JSONObject(definition));
            }
        }
        c37356ElM.onSuccess((XBaseResultModel) ED5.LIZJ(InterfaceC77928UiC.class, null), "");
    }
}
