package X;

import com.bytedance.forest.model.RequestParams;
import com.bytedance.lynx.hybrid.service.IResourceService;
import kotlin.jvm.internal.AqS110S0300000_6;
import kotlin.jvm.internal.o;

/* renamed from: X.FnN, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C40029FnN implements InterfaceC39980Fma {
    @Override // X.InterfaceC39980Fma
    public final void LIZ(C39984Fme requestParams, InterfaceC39983Fmd interfaceC39983Fmd) {
        o.LJIIJ(requestParams, "requestParams");
        InterfaceC61488OBg LIZIZ = C60905NvJ.LIZIZ(null, null);
        C39982Fmc c39982Fmc = new C39982Fmc();
        if (LIZIZ instanceof IResourceService) {
            String str = requestParams.LIZ;
            o.LJFF(str, "requestParams.url");
            ((IResourceService) LIZIZ).loadAsync(str, new O1M(0), new AqS110S0300000_6(interfaceC39983Fmd, requestParams, c39982Fmc, 6), new AqS110S0300000_6(interfaceC39983Fmd, requestParams, c39982Fmc, 7));
            return;
        }
        if (LIZIZ instanceof C39902FlK) {
            RequestParams requestParams2 = new RequestParams(null, 1, null);
            requestParams2.setNeedLocalFile(Boolean.FALSE);
            String str2 = requestParams.LIZ;
            o.LJFF(str2, "requestParams.url");
            String LIZLLL = C60905NvJ.LIZLLL(str2, requestParams2, null);
            if (true ^ o.LJ(LIZLLL, requestParams.LIZ)) {
                java.util.Map<String, Object> customParams = requestParams2.getCustomParams();
                String str3 = requestParams.LIZ;
                o.LJFF(str3, "requestParams.url");
                customParams.put("resource_url", str3);
            }
            ((C39902FlK) LIZIZ).LIZLLL(LIZLLL, requestParams2, new AqS110S0300000_6(interfaceC39983Fmd, requestParams, c39982Fmc, 8));
            return;
        }
        c39982Fmc.LIZ = -100;
        if (interfaceC39983Fmd != null) {
            interfaceC39983Fmd.LIZIZ(c39982Fmc);
        }
        C39048FUe c39048FUe = C39048FUe.LIZIZ;
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("request ");
        c39048FUe.LIZ(JBR.LJFF(LIZ, requestParams.LIZ, " failed, for no resourceLoader found", LIZ), EnumC39866Fkk.E, "DefaultLynxRequestProvider");
    }
}
