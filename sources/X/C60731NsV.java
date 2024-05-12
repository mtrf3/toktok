package X;

import com.bytedance.forest.model.RequestParams;
import com.bytedance.lynx.hybrid.param.HybridSchemaParam;
import com.bytedance.lynx.hybrid.service.IResourceService;
import com.bytedance.mt.protector.impl.UriProtector;
import com.bytedance.mt.protector.impl.string2number.CastIntegerProtector;
import defpackage.a1;
import java.util.LinkedHashMap;
import kotlin.jvm.internal.AqS176S0100000_10;
import kotlin.jvm.internal.AqS52S1200000_10;
import kotlin.jvm.internal.o;

/* renamed from: X.NsV, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class C60731NsV implements InterfaceC61096NyO {
    public final InterfaceC61488OBg LIZ;
    public final C60737Nsb LIZIZ;

    public C60731NsV(C60737Nsb hybridContext) {
        o.LJIIJ(hybridContext, "hybridContext");
        this.LIZIZ = hybridContext;
        this.LIZ = C60905NvJ.LIZIZ(hybridContext, null);
    }

    @Override // X.InterfaceC61096NyO
    public final void LIZ(String str, InterfaceC60597NqL interfaceC60597NqL) {
        HybridSchemaParam hybridSchemaParam;
        C60735NsZ c60735NsZ;
        C60735NsZ c60735NsZ2;
        if (str == null) {
            interfaceC60597NqL.LIZ(null, new Throwable("url is null"));
            return;
        }
        InterfaceC61488OBg interfaceC61488OBg = this.LIZ;
        if (interfaceC61488OBg == null) {
            C39048FUe.LIZIZ(C39048FUe.LIZIZ, a1.LJ("DefaultDynamicComponentFetcher request ", str, ", but resourceService is null"), EnumC39866Fkk.E, null, 4);
            return;
        }
        C60606NqU c60606NqU = (C60606NqU) this.LIZIZ.hybridParams;
        if (interfaceC61488OBg instanceof IResourceService) {
            O1M o1m = new O1M(0);
            o1m.LJIIL = "component";
            try {
                android.net.Uri parse = UriProtector.parse(str);
                String queryParameter = UriProtector.getQueryParameter(parse, "surl");
                if (queryParameter != null) {
                    o1m.LJIIIIZZ = queryParameter;
                }
                String queryParameter2 = UriProtector.getQueryParameter(parse, "channel");
                if (queryParameter2 != null) {
                    o1m.LJFF = queryParameter2;
                }
                String queryParameter3 = UriProtector.getQueryParameter(parse, "bundle");
                if (queryParameter3 != null) {
                    o1m.LJI = queryParameter3;
                }
                o1m.LIZLLL = 1;
                String queryParameter4 = UriProtector.getQueryParameter(parse, "dynamic");
                if (queryParameter4 != null) {
                    o1m.LIZLLL = Integer.valueOf(CastIntegerProtector.parseInt(queryParameter4));
                }
            } catch (Throwable th) {
                C39048FUe.LIZJ(C39048FUe.LIZIZ, th, "DefaultDynamicComponentFetcher parse url error", 4);
            }
            if (c60606NqU != null && (c60735NsZ2 = c60606NqU.LJII) != null) {
                c60735NsZ2.LIZJ(str, new LinkedHashMap(), false);
            }
            ((IResourceService) this.LIZ).loadAsync(str, o1m, new AqS52S1200000_10(c60606NqU, str, interfaceC60597NqL, 9), new AqS176S0100000_10(interfaceC60597NqL, 212));
            return;
        }
        if (interfaceC61488OBg instanceof C39902FlK) {
            RequestParams requestParams = new RequestParams(EnumC61028NxI.LYNX_COMPONENT);
            InterfaceC60710NsA interfaceC60710NsA = this.LIZIZ.hybridParams;
            if (interfaceC60710NsA != null) {
                hybridSchemaParam = interfaceC60710NsA.LIZLLL();
            } else {
                hybridSchemaParam = null;
            }
            C60905NvJ.LJIIIIZZ(requestParams, hybridSchemaParam);
            requestParams.setWaitGeckoUpdate(true);
            requestParams.setNeedLocalFile(Boolean.FALSE);
            requestParams.setLoadToMemory(true);
            requestParams.getCustomParams().put("rl_container_uuid", this.LIZIZ.containerId);
            C60905NvJ.LJ(requestParams, this.LIZIZ);
            String LIZLLL = C60905NvJ.LIZLLL(str, requestParams, null);
            if (!o.LJ(LIZLLL, str)) {
                requestParams.getCustomParams().put("resource_url", str);
            }
            if (c60606NqU != null && (c60735NsZ = c60606NqU.LJII) != null) {
                c60735NsZ.LIZJ(LIZLLL, new LinkedHashMap(), true);
            }
            ((C39902FlK) this.LIZ).LIZLLL(LIZLLL, requestParams, new AqS52S1200000_10(c60606NqU, LIZLLL, interfaceC60597NqL, 10));
        }
    }
}
