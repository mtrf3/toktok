package X;

import android.os.SystemClock;
import android.view.View;
import com.bytedance.sdk.xbridge.registry.core.model.idl.XBaseModel;
import com.bytedance.sdk.xbridge.registry.core.model.idl.XBaseParamModel;
import com.bytedance.sdk.xbridge.registry.core.model.idl.XBaseResultModel;
import com.ss.android.ugc.aweme.ecommerce.base.pdp.jsb.service.PdpCardBridgeServiceImpl;
import kotlin.jvm.internal.o;

/* loaded from: classes11.dex */
public final class O9W extends O9X {
    @Override // X.AbstractC37594EpC
    public final void LJI(XBaseParamModel xBaseParamModel, C37356ElM c37356ElM, EnumC37844EtE type) {
        View view;
        o.LJIIIZ(type, "type");
        SystemClock.elapsedRealtime();
        InterfaceC38263Ezz interfaceC38263Ezz = this.LJLIL;
        if (interfaceC38263Ezz != null) {
            view = interfaceC38263Ezz.getView();
        } else {
            view = null;
        }
        C61430O9a LJ = PdpCardBridgeServiceImpl.LJI().LJ(view);
        XBaseModel LIZJ = ED5.LIZJ(O9Y.class, null);
        O9Y o9y = (O9Y) LIZJ;
        o9y.set_bottom(Boolean.valueOf(LJ.LJLIL));
        o9y.setDistance(Integer.valueOf(LJ.LJLILLLLZI));
        c37356ElM.onSuccess((XBaseResultModel) LIZJ, "");
    }
}
