package X;

import android.content.Context;
import com.bytedance.sdk.xbridge.registry.core.model.idl.XBaseParamModel;
import com.bytedance.sdk.xbridge.registry.core.model.idl.XBaseResultModel;
import com.ss.android.ugc.aweme.poi.service.PoiServiceImpl;
import com.ss.android.ugc.aweme.poi_api.service.IPoiService;
import kotlin.jvm.internal.o;

/* renamed from: X.Nzh, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class C61177Nzh extends AbstractC61179Nzj {
    @Override // X.AbstractC37594EpC
    public final void LJI(XBaseParamModel xBaseParamModel, C37356ElM c37356ElM, EnumC37844EtE type) {
        Context context;
        InterfaceC61180Nzk interfaceC61180Nzk = (InterfaceC61180Nzk) xBaseParamModel;
        o.LJIIIZ(type, "type");
        String formattedAddress = interfaceC61180Nzk.getFormattedAddress();
        IPoiService LIZIZ = PoiServiceImpl.LIZIZ();
        o.LJIIIIZZ(LIZIZ, "get().getService(IPoiService::class.java)");
        InterfaceC38263Ezz interfaceC38263Ezz = this.LJLIL;
        if (interfaceC38263Ezz != null) {
            context = interfaceC38263Ezz.getContext();
        } else {
            context = null;
        }
        LIZIZ.LJJJLZIJ(context, null, null, interfaceC61180Nzk.getPoiName(), formattedAddress, null);
        c37356ElM.onSuccess((XBaseResultModel) ED5.LIZJ(InterfaceC61178Nzi.class, null), "");
    }
}
