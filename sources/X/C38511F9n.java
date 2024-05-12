package X;

import android.webkit.WebResourceResponse;
import com.bytedance.forest.model.RequestParams;
import com.bytedance.lynx.hybrid.param.HybridSchemaParam;
import com.bytedance.lynx.hybrid.service.IResourceService;
import java.util.List;
import kotlin.jvm.internal.AqS110S0300000_6;
import kotlin.jvm.internal.AqS137S0200000_6;
import kotlin.jvm.internal.o;
import ujb.s;

/* renamed from: X.F9n, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C38511F9n implements InterfaceC37599EpH {
    public final InterfaceC61488OBg LIZ;
    public final C37531EoB LIZIZ;

    public static O1M LIZJ() {
        O1M o1m = new O1M(0);
        o1m.LJ = true;
        C61091NyJ c61091NyJ = o1m.LIZ;
        List<EnumC61089NyH> LJJIJIL = C47261Igj.LJJIJIL(EnumC61089NyH.GECKO);
        c61091NyJ.getClass();
        c61091NyJ.LIZ = LJJIJIL;
        o1m.LJIIL = "web";
        return o1m;
    }

    public static C37648Eq4 LIZLLL(O26 o26) {
        EnumC37644Eq0 enumC37644Eq0;
        WebResourceResponse webResourceResponse = o26.LIZIZ;
        if (webResourceResponse != null || (o26.LJIIIIZZ == EnumC60881Nuv.DISK && (webResourceResponse = O42.LIZIZ(o26.LJII)) != null)) {
            if (o26.LJIIIZ == O29.CDN) {
                enumC37644Eq0 = EnumC37644Eq0.Online;
            } else {
                enumC37644Eq0 = EnumC37644Eq0.Offline;
            }
            return new C37648Eq4(webResourceResponse, enumC37644Eq0, "");
        }
        return null;
    }

    public C38511F9n(InterfaceC61488OBg interfaceC61488OBg, C37531EoB customCtx) {
        o.LJIIJ(customCtx, "customCtx");
        this.LIZ = interfaceC61488OBg;
        this.LIZIZ = customCtx;
    }

    @Override // X.InterfaceC37599EpH
    public final InterfaceC37464En6 LIZIZ(InterfaceC37454Emw interfaceC37454Emw, EnumC37644Eq0 loadFrom) {
        C61295O3v LIZ;
        EnumC37644Eq0 enumC37644Eq0;
        o.LJIIJ(loadFrom, "loadFrom");
        InterfaceC61488OBg interfaceC61488OBg = this.LIZ;
        if (interfaceC61488OBg instanceof IResourceService) {
            String uri = interfaceC37454Emw.getUrl().toString();
            o.LJFF(uri, "request.url.toString()");
            O26 loadSync = ((IResourceService) interfaceC61488OBg).loadSync(uri, LIZJ());
            if (loadSync == null) {
                return null;
            }
            return LIZLLL(loadSync);
        }
        if (!(interfaceC61488OBg instanceof C39902FlK)) {
            return null;
        }
        OSZ<String, RequestParams> LJ = LJ(interfaceC37454Emw, loadFrom);
        C38515F9r LIZJ = ((C39902FlK) this.LIZ).LIZJ(LJ.getFirst(), LJ.getSecond());
        if (LIZJ == null || (LIZ = LIZJ.LIZ()) == null || !LIZ.LJZL) {
            return null;
        }
        if (LIZ.LLFF) {
            enumC37644Eq0 = EnumC37644Eq0.Offline;
        } else {
            enumC37644Eq0 = EnumC37644Eq0.Online;
        }
        WebResourceResponse V = LIZ.V();
        if (V == null) {
            return null;
        }
        return new C37648Eq4(V, enumC37644Eq0, LIZ.LLD);
    }

    public final OSZ<String, RequestParams> LJ(InterfaceC37454Emw interfaceC37454Emw, EnumC37644Eq0 enumC37644Eq0) {
        HybridSchemaParam hybridSchemaParam;
        String LIZLLL;
        String uri = interfaceC37454Emw.getUrl().toString();
        o.LJFF(uri, "url.toString()");
        C60607NqV c60607NqV = this.LIZIZ.LIZIZ;
        if (c60607NqV != null) {
            hybridSchemaParam = c60607NqV.LJIIJJI;
        } else {
            hybridSchemaParam = null;
        }
        RequestParams requestParams = new RequestParams(EnumC61028NxI.WEB_CHILD_RESOURCE);
        int i = C37645Eq1.LIZ[enumC37644Eq0.ordinal()];
        if (i != 1) {
            if (i == 2) {
                requestParams.setDisableOffline(true);
            }
        } else {
            requestParams.setDisableCdn(true);
        }
        requestParams.setNeedLocalFile(Boolean.FALSE);
        if (hybridSchemaParam != null && (!ujb.o.LJJJJJL(hybridSchemaParam.getChannel())) && (!ujb.o.LJJJJJL(hybridSchemaParam.getBundle())) && s.LJJJLZIJ(uri, hybridSchemaParam.getChannel(), false) && s.LJJJLZIJ(uri, hybridSchemaParam.getBundle(), false)) {
            C60905NvJ.LJII(requestParams, hybridSchemaParam);
            LIZLLL = C60905NvJ.LIZJ(hybridSchemaParam, uri, false);
        } else {
            LIZLLL = C60905NvJ.LIZLLL(uri, requestParams, null);
        }
        if (!o.LJ(LIZLLL, uri)) {
            requestParams.getCustomParams().put("resource_url", uri);
        }
        requestParams.setNetWorker(EnumC39910FlS.TTNet);
        return new OSZ<>(LIZLLL, requestParams);
    }

    @Override // X.InterfaceC37599EpH
    public final InterfaceC37489EnV LIZ(EnumC37644Eq0 loadFrom, InterfaceC37454Emw interfaceC37454Emw, BQ6<InterfaceC37464En6> bq6, BQ6<Throwable> bq62) {
        Object LIZ;
        o.LJIIJ(loadFrom, "loadFrom");
        Object obj = null;
        try {
            InterfaceC61488OBg interfaceC61488OBg = this.LIZ;
            if (interfaceC61488OBg instanceof IResourceService) {
                String uri = interfaceC37454Emw.getUrl().toString();
                o.LJFF(uri, "request.url.toString()");
                LIZ = new C38512F9o(((IResourceService) interfaceC61488OBg).loadAsync(uri, LIZJ(), new AqS110S0300000_6(this, interfaceC37454Emw, bq6, bq62, 10), new AqS137S0200000_6(interfaceC37454Emw, bq6, bq62, 42)), this, interfaceC37454Emw, bq6, bq62);
            } else if (interfaceC61488OBg instanceof C39902FlK) {
                OSZ<String, RequestParams> LJ = LJ(interfaceC37454Emw, loadFrom);
                LIZ = new C38513F9p(((C39902FlK) this.LIZ).LIZLLL(LJ.getFirst(), LJ.getSecond(), new AqS110S0300000_6(this, interfaceC37454Emw, bq6, bq62, 11)));
            } else {
                LIZ = null;
            }
            C3C5.m7constructorimpl(LIZ);
        } catch (Throwable th) {
            LIZ = C141335gf.LIZ(th);
            C3C5.m7constructorimpl(LIZ);
        }
        Throwable m10exceptionOrNullimpl = C3C5.m10exceptionOrNullimpl(LIZ);
        if (m10exceptionOrNullimpl != null) {
            bq62.accept(m10exceptionOrNullimpl);
        }
        if (!C3C5.m12isFailureimpl(LIZ)) {
            obj = LIZ;
        }
        return (InterfaceC37489EnV) obj;
    }
}
