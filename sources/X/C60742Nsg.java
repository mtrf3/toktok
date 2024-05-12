package X;

import android.text.TextUtils;
import com.bytedance.forest.model.RequestParams;
import com.bytedance.lynx.hybrid.param.HybridSchemaParam;
import com.bytedance.lynx.hybrid.service.IResourceService;
import com.bytedance.mt.protector.impl.UriProtector;
import com.bytedance.mt.protector.impl.string2number.CastIntegerProtector;
import java.util.LinkedHashMap;
import kotlin.jvm.internal.AqS176S0100000_10;
import kotlin.jvm.internal.AqS52S1200000_10;
import kotlin.jvm.internal.o;

/* renamed from: X.Nsg, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class C60742Nsg extends AbstractC61008Nwy<Object, byte[]> {
    public final InterfaceC61488OBg LIZ;
    public final C60737Nsb LIZIZ;

    public C60742Nsg(InterfaceC61488OBg interfaceC61488OBg, C60737Nsb c60737Nsb) {
        this.LIZ = interfaceC61488OBg;
        this.LIZIZ = c60737Nsb;
    }

    @Override // X.AbstractC61008Nwy
    public final void LIZ(C08200Tw c08200Tw, QXX qxx) {
        HybridSchemaParam hybridSchemaParam;
        C60735NsZ c60735NsZ;
        InterfaceC60710NsA interfaceC60710NsA;
        C60735NsZ c60735NsZ2;
        InterfaceC60710NsA interfaceC60710NsA2 = null;
        if (this.LIZ == null) {
            C39048FUe c39048FUe = C39048FUe.LIZIZ;
            StringBuilder LIZ = X1D.LIZ();
            LIZ.append("ExternalJSProvider request ");
            C39048FUe.LIZIZ(c39048FUe, JBR.LJFF(LIZ, (String) c08200Tw.LIZ, ", but resourceService is null", LIZ), EnumC39866Fkk.E, null, 4);
            return;
        }
        String str = (String) c08200Tw.LIZ;
        if ((!TextUtils.isEmpty(str)) && str != null) {
            InterfaceC61488OBg interfaceC61488OBg = this.LIZ;
            if (interfaceC61488OBg instanceof IResourceService) {
                IResourceService iResourceService = (IResourceService) interfaceC61488OBg;
                C60737Nsb c60737Nsb = this.LIZIZ;
                if (c60737Nsb != null) {
                    interfaceC60710NsA2 = c60737Nsb.hybridParams;
                }
                C60606NqU c60606NqU = (C60606NqU) interfaceC60710NsA2;
                if (c60606NqU != null && (c60735NsZ2 = c60606NqU.LJII) != null) {
                    c60735NsZ2.LIZLLL(str, new LinkedHashMap(), false);
                }
                O1M o1m = new O1M(0);
                o1m.LJIIL = "external_js";
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
                    C39048FUe.LIZJ(C39048FUe.LIZIZ, th, "ExternalJSProvider parse url error", 4);
                }
                iResourceService.loadAsync(str, o1m, new AqS52S1200000_10(c60606NqU, str, qxx, 12), new AqS176S0100000_10(qxx, 213));
                return;
            }
            if (interfaceC61488OBg instanceof C39902FlK) {
                C39902FlK c39902FlK = (C39902FlK) interfaceC61488OBg;
                RequestParams requestParams = new RequestParams(EnumC61028NxI.LYNX_EXTERNAL_JS);
                C60737Nsb c60737Nsb2 = this.LIZIZ;
                if (c60737Nsb2 != null && (interfaceC60710NsA = c60737Nsb2.hybridParams) != null) {
                    hybridSchemaParam = interfaceC60710NsA.LIZLLL();
                } else {
                    hybridSchemaParam = null;
                }
                C60905NvJ.LJIIIIZZ(requestParams, hybridSchemaParam);
                requestParams.setWaitGeckoUpdate(true);
                requestParams.setLoadToMemory(true);
                requestParams.setNeedLocalFile(Boolean.FALSE);
                C60737Nsb c60737Nsb3 = this.LIZIZ;
                if (c60737Nsb3 != null) {
                    requestParams.getCustomParams().put("rl_container_uuid", c60737Nsb3.containerId);
                    C60905NvJ.LJ(requestParams, c60737Nsb3);
                }
                String LIZLLL = C60905NvJ.LIZLLL(str, requestParams, null);
                if (!o.LJ(LIZLLL, str)) {
                    requestParams.getCustomParams().put("resource_url", str);
                }
                C60737Nsb c60737Nsb4 = this.LIZIZ;
                if (c60737Nsb4 != null) {
                    interfaceC60710NsA2 = c60737Nsb4.hybridParams;
                }
                C60606NqU c60606NqU2 = (C60606NqU) interfaceC60710NsA2;
                if (c60606NqU2 != null && (c60735NsZ = c60606NqU2.LJII) != null) {
                    c60735NsZ.LIZLLL(LIZLLL, new LinkedHashMap(), true);
                }
                c39902FlK.LIZLLL(LIZLLL, requestParams, new AqS52S1200000_10(c60606NqU2, LIZLLL, qxx, 11));
            }
        }
    }
}
