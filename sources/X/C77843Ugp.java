package X;

import android.content.Context;
import android.text.TextUtils;
import com.bytedance.android.live.wallet.api.ILocationPickerService;
import com.bytedance.sdk.xbridge.registry.core.model.idl.XBaseParamModel;
import kotlin.jvm.internal.o;

/* renamed from: X.Ugp, reason: case insensitive filesystem */
/* loaded from: classes14.dex */
public final class C77843Ugp extends AbstractC77848Ugu {
    @Override // X.AbstractC37594EpC
    public final void LJI(XBaseParamModel xBaseParamModel, C37356ElM c37356ElM, EnumC37844EtE type) {
        Context context;
        InterfaceC77844Ugq interfaceC77844Ugq = (InterfaceC77844Ugq) xBaseParamModel;
        o.LJIIIZ(type, "type");
        String defaultLocation = interfaceC77844Ugq.getDefaultLocation();
        String region = interfaceC77844Ugq.getRegion();
        int intValue = interfaceC77844Ugq.getLevel().intValue();
        InterfaceC77845Ugr traceData = interfaceC77844Ugq.getTraceData();
        if (TextUtils.isEmpty(region)) {
            c37356ElM.onFailure(0, "Empty Region", null);
            return;
        }
        InterfaceC38263Ezz interfaceC38263Ezz = this.LJLIL;
        if (interfaceC38263Ezz == null || (context = interfaceC38263Ezz.getContext()) == null) {
            return;
        }
        ((ILocationPickerService) CN1.LIZ(ILocationPickerService.class)).Hd(context, region, defaultLocation, intValue, new C77847Ugt(this, c37356ElM), new C77846Ugs(traceData));
    }
}
