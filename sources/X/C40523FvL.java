package X;

import Y.ARunnableS7S1100000_6;
import com.bytedance.forest.model.RequestParams;
import com.bytedance.lynx.hybrid.service.IResourceService;
import kotlin.jvm.internal.AqS137S0200000_6;
import kotlin.jvm.internal.o;

/* renamed from: X.FvL, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C40523FvL extends AbstractC40526FvO {
    public static void LIZIZ(InterfaceC40525FvN interfaceC40525FvN, String str) {
        if (interfaceC40525FvN != null) {
            C61325O4z.LJFF(new ARunnableS7S1100000_6(interfaceC40525FvN, str, 20));
        }
    }

    @Override // X.AbstractC40526FvO
    public final void LIZ(InterfaceC40525FvN interfaceC40525FvN, String url) {
        o.LJIIJ(url, "url");
        InterfaceC61488OBg LIZIZ = C60905NvJ.LIZIZ(null, null);
        if (!(LIZIZ instanceof IResourceService)) {
            if (LIZIZ instanceof C39902FlK) {
                RequestParams requestParams = new RequestParams(EnumC61028NxI.LYNX_TEMPLATE);
                requestParams.setLoadToMemory(true);
                requestParams.setNeedLocalFile(Boolean.FALSE);
                String LIZLLL = C60905NvJ.LIZLLL(url, requestParams, null);
                if (true ^ o.LJ(LIZLLL, url)) {
                    requestParams.getCustomParams().put("resource_url", url);
                }
                ((C39902FlK) LIZIZ).LIZLLL(LIZLLL, requestParams, new AqS137S0200000_6(this, interfaceC40525FvN, 39));
                return;
            }
            LIZIZ(interfaceC40525FvN, "ResourceLoader Not Found!");
            return;
        }
        ((IResourceService) LIZIZ).loadAsync(url, new O1M(0), new AqS137S0200000_6(this, interfaceC40525FvN, 37), new AqS137S0200000_6(this, interfaceC40525FvN, 38));
    }
}
