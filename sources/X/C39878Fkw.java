package X;

import Y.ARunnableS42S0100000_6;
import com.bytedance.lynx.hybrid.param.HybridSchemaParam;
import com.bytedance.lynx.hybrid.ssp.base.SSPResponse;
import java.util.ArrayList;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.jvm.internal.o;
import org.json.JSONObject;

/* renamed from: X.Fkw, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C39878Fkw extends AbstractC60673NrZ {
    public static final /* synthetic */ int LJLLL = 0;
    public final C39879Fkx LJLIL;
    public final AtomicBoolean LJLILLLLZI;
    public final AtomicBoolean LJLJI;
    public final AtomicBoolean LJLJJI;
    public C39881Fkz LJLJJL;
    public SSPResponse.Data LJLJJLL;
    public C39882Fl0 LJLJL;
    public C39880Fky LJLJLJ;
    public String LJLJLLL;
    public volatile int LJLL;
    public volatile int LJLLI;
    public final C60737Nsb LJLLILLLL;
    public final HybridSchemaParam LJLLJ;

    @Override // X.AbstractC60673NrZ
    public final void onDestroy() {
        Integer num;
        SSPResponse.Prefetch[] prefetchArr;
        int length;
        SSPResponse.Data data = this.LJLJJLL;
        if (data != null && (prefetchArr = data.prefetchList) != null && (length = prefetchArr.length) > 0) {
            float f = length;
            this.LJLIL.LJIILIIL = Float.valueOf(this.LJLL / f);
            this.LJLIL.LJIILJJIL = Float.valueOf((this.LJLLI + this.LJLL) / f);
        }
        C39879Fkx c39879Fkx = this.LJLIL;
        c39879Fkx.getClass();
        try {
            if (C39927Flj.LIZLLL(c39879Fkx.LIZ)) {
                JSONObject jSONObject = new JSONObject();
                jSONObject.put("ssp_config", c39879Fkx.LIZIZ);
                jSONObject.put("ssp_feature_request_bid", c39879Fkx.LIZJ);
                EnumC39871Fkp enumC39871Fkp = c39879Fkx.LIZLLL;
                if (enumC39871Fkp != null) {
                    num = Integer.valueOf(enumC39871Fkp.getVa());
                } else {
                    num = null;
                }
                jSONObject.put("ssp_feature_cache_state", num);
                jSONObject.put("ssp_feature_response_state", c39879Fkx.LJ);
                jSONObject.put("ssp_feature_response_err", c39879Fkx.LJFF);
                jSONObject.put("ssp_response_parse_error", c39879Fkx.LJI);
                jSONObject.put("ssp_trigger_prefetch", c39879Fkx.LJII);
                jSONObject.put("ssp_trigger_preconnect", c39879Fkx.LJIIIIZZ);
                jSONObject.put("ssp_response_log_id", c39879Fkx.LJIIIZ);
                jSONObject.put("ssp_unKnow_error", c39879Fkx.LJIIJ);
                JSONObject jSONObject2 = new JSONObject();
                jSONObject2.put("ssp_feature_cache_query_duration", c39879Fkx.LJIIJJI);
                jSONObject2.put("ssp_feature_request_duration", c39879Fkx.LJIIL);
                Long l = c39879Fkx.LJIILL;
                if (l != null && c39879Fkx.LJIILLIIL != null) {
                    long longValue = l.longValue();
                    Long l2 = c39879Fkx.LJIILLIIL;
                    if (l2 != null) {
                        jSONObject2.put("ssp_load_optimize_duration", longValue - l2.longValue());
                    } else {
                        o.LJIIZILJ();
                        throw null;
                    }
                }
                jSONObject2.put("ssp_prefetch_finish_rate", c39879Fkx.LJIILIIL);
                jSONObject2.put("ssp_prefetch_hit_rate", c39879Fkx.LJIILJJIL);
                OFH ofh = OFH.LIZLLL;
                C79605VMb c79605VMb = new C79605VMb("spark_server_push_client");
                c79605VMb.LJIIJJI = EnumC40073Fo5.Tea;
                c79605VMb.LIZ = c39879Fkx.LIZ;
                c79605VMb.LIZLLL = jSONObject;
                c79605VMb.LJ = jSONObject2;
                C79604VMa LIZ = c79605VMb.LIZ();
                ofh.getClass();
                OFH.LIZLLL(LIZ);
            }
        } catch (Exception e) {
            C39048FUe c39048FUe = C39048FUe.LIZIZ;
            StringBuilder LIZ2 = X1D.LIZ();
            LIZ2.append("do report exception. error: ");
            LIZ2.append(e.getMessage());
            LIZ2.append(", url: ");
            LIZ2.append(c39879Fkx.LIZ);
            c39048FUe.LIZ(X1D.LIZIZ(LIZ2), EnumC39866Fkk.E, "SspLifeCycle");
        }
        C39880Fky c39880Fky = this.LJLJLJ;
        if (c39880Fky != null) {
            ((ArrayList) C39900FlI.LIZ).remove(c39880Fky);
        }
    }

    @Override // X.AbstractC60673NrZ
    public final void LJJJJJ(InterfaceC60761Nsz view) {
        o.LJIIJ(view, "view");
        C39048FUe c39048FUe = C39048FUe.LIZIZ;
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("load finish. url: ");
        LIZ.append(this.LJLJLLL);
        LIZ.append(", timestamp:");
        LIZ.append(System.currentTimeMillis());
        C39048FUe.LIZIZ(c39048FUe, X1D.LIZIZ(LIZ), null, "SspLifeCycle", 2);
        this.LJLJJI.compareAndSet(false, true);
        C37755Ern.LIZ(new ARunnableS42S0100000_6(this, 89));
    }

    public C39878Fkw(C60737Nsb hybridContext, HybridSchemaParam schemaParam) {
        o.LJIIJ(hybridContext, "hybridContext");
        o.LJIIJ(schemaParam, "schemaParam");
        this.LJLLILLLL = hybridContext;
        this.LJLLJ = schemaParam;
        this.LJLIL = new C39879Fkx(0);
        this.LJLILLLLZI = new AtomicBoolean(false);
        this.LJLJI = new AtomicBoolean(false);
        this.LJLJJI = new AtomicBoolean(false);
    }

    @Override // X.AbstractC60673NrZ
    public final void LJJJJ(InterfaceC60761Nsz view, String url) {
        o.LJIIJ(view, "view");
        o.LJIIJ(url, "url");
        super.LJJJJ(view, url);
        this.LJLJJI.compareAndSet(false, true);
    }

    @Override // X.AbstractC60673NrZ
    public final void LJJJJJL(InterfaceC60761Nsz view, String url) {
        o.LJIIJ(view, "view");
        o.LJIIJ(url, "url");
        C39048FUe c39048FUe = C39048FUe.LIZIZ;
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("load start. url: ");
        LIZ.append(this.LJLJLLL);
        LIZ.append(", timestamp:");
        LIZ.append(System.currentTimeMillis());
        C39048FUe.LIZIZ(c39048FUe, X1D.LIZIZ(LIZ), null, "SspLifeCycle", 2);
        this.LJLIL.LJIILL = Long.valueOf(System.currentTimeMillis());
    }

    @Override // X.AbstractC60673NrZ
    public final void LJJJJI(InterfaceC60761Nsz view, String url, String str) {
        o.LJIIJ(view, "view");
        o.LJIIJ(url, "url");
        super.LJJJJI(view, url, str);
        this.LJLJJI.compareAndSet(false, true);
    }

    @Override // X.AbstractC60673NrZ
    public final void LJJJJIZL(InterfaceC60761Nsz view, String url, C60704Ns4 c60704Ns4) {
        o.LJIIJ(view, "view");
        o.LJIIJ(url, "url");
        super.LJJJJIZL(view, url, c60704Ns4);
        this.LJLJJI.compareAndSet(false, true);
    }
}
