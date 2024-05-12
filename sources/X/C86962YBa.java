package X;

import com.bytedance.sdk.xbridge.registry.core.model.idl.XBaseParamModel;
import com.ss.android.ugc.aweme.poi.service.PoiServiceImpl;
import com.ss.android.ugc.aweme.poi_api.service.IPoiService;
import kotlin.jvm.internal.o;

/* renamed from: X.YBa, reason: case insensitive filesystem */
/* loaded from: classes16.dex */
public final class C86962YBa extends AbstractC86964YBc {
    @Override // X.AbstractC37594EpC
    public final void LJI(XBaseParamModel xBaseParamModel, C37356ElM c37356ElM, EnumC37844EtE type) {
        InterfaceC86963YBb interfaceC86963YBb = (InterfaceC86963YBb) xBaseParamModel;
        o.LJIIIZ(type, "type");
        String center = interfaceC86963YBb.getCenter();
        Number imageWidth = interfaceC86963YBb.getImageWidth();
        Number imageHeight = interfaceC86963YBb.getImageHeight();
        String markers = interfaceC86963YBb.getMarkers();
        String scale = interfaceC86963YBb.getScale();
        String style = interfaceC86963YBb.getStyle();
        String maptype = interfaceC86963YBb.getMaptype();
        InterfaceC86965YBd interfaceC86965YBd = (InterfaceC86965YBd) ED5.LIZJ(InterfaceC86965YBd.class, null);
        IPoiService LIZIZ = PoiServiceImpl.LIZIZ();
        o.LJII(imageWidth, "null cannot be cast to non-null type kotlin.Int");
        int intValue = ((Integer) imageWidth).intValue();
        o.LJII(imageHeight, "null cannot be cast to non-null type kotlin.Int");
        interfaceC86965YBd.setStaticMapURL(LIZIZ.LJJIJIL(center, intValue, ((Integer) imageHeight).intValue(), markers, scale, maptype, style));
        c37356ElM.onSuccess(interfaceC86965YBd, "");
    }
}
