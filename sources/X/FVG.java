package X;

import com.ss.android.ugc.aweme.common.MobClick;
import com.ss.android.ugc.aweme.network.spi.INetworkStateService;
import com.ss.android.ugc.aweme.services.NetworkStateServiceImpl;
import java.util.concurrent.Callable;
import org.json.JSONObject;

/* loaded from: classes7.dex */
public final class FVG<V> implements Callable {
    public final /* synthetic */ FVH LJLIL;
    public final /* synthetic */ String LJLILLLLZI;
    public final /* synthetic */ String LJLJI;
    public final /* synthetic */ String LJLJJI;
    public final /* synthetic */ String LJLJJL;

    public FVG(FVH fvh, String str, String str2, String str3, String str4) {
        this.LJLIL = fvh;
        this.LJLILLLLZI = str;
        this.LJLJI = str2;
        this.LJLJJI = str3;
        this.LJLJJL = str4;
    }

    @Override // java.util.concurrent.Callable
    public final Object call() {
        int i;
        JSONObject jSONObject;
        INetworkStateService createINetworkStateServicebyMonsterPlugin = NetworkStateServiceImpl.createINetworkStateServicebyMonsterPlugin(false);
        if (createINetworkStateServicebyMonsterPlugin != null) {
            i = createINetworkStateServicebyMonsterPlugin.getEffectiveConnectionType();
        } else {
            i = -2;
        }
        C76W c76w = new C76W();
        c76w.LIZ("is_first", String.valueOf(this.LJLIL.LIZJ ? 1 : 0));
        c76w.LIZ("feed_tab", this.LJLILLLLZI);
        c76w.LIZ("top_activity", this.LJLJI);
        c76w.LIZ("request_method", this.LJLJJI);
        c76w.LIZ("duration", this.LJLJJL);
        c76w.LIZ("network_status", String.valueOf(i));
        c76w.LIZ("access", C16880lQ.LLJJ(EF7.LIZIZ()));
        JSONObject LIZIZ = c76w.LIZIZ();
        MobClick LIZLLL = C1I1.LIZLLL("feed_request", "perf_monitor");
        this.LJLIL.getClass();
        try {
            jSONObject = new JSONObject(LIZIZ.toString());
        } catch (Exception unused) {
            jSONObject = new JSONObject();
        }
        LIZLLL.setJsonObject(jSONObject);
        FMX.onEvent(LIZLLL);
        FVJ.LIZIZ("feed_request", System.currentTimeMillis(), LIZIZ);
        FMX.LJIILLIIL("feed_request", LIZIZ);
        if (!C48236IwS.LJIIJ()) {
            FMX.LJIIL("no_data_refresh_page", C113554cx.LJJL(new OSZ("network_status", String.valueOf(i)), new OSZ("enter_from", "homepage_hot")));
            return null;
        }
        return null;
    }
}
