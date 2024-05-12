package X;

import Y.AfS7S0100100_12;
import android.os.SystemClock;
import com.ss.android.ugc.aweme.aigc.AIGCApi;
import kotlin.jvm.internal.o;
import org.json.JSONArray;

/* renamed from: X.STl, reason: case insensitive filesystem */
/* loaded from: classes13.dex */
public final class C72153STl extends STQ {
    public final AIGCApi LJLILLLLZI;
    public final JSONArray LJLJI;

    @Override // X.STQ, X.InterfaceC72136SSu
    public void start() {
        long elapsedRealtime = SystemClock.elapsedRealtime();
        C72164STw.LIZ(EnumC72154STm.AIGC_NET_FAST_GEN, EnumC72156STo.START, null, null, null, null, 60);
        AIGCApi aIGCApi = this.LJLILLLLZI;
        JSONArray params = this.LJLJI;
        aIGCApi.getClass();
        o.LJIIIZ(params, "params");
        C72160STs.LIZ().quickGenerate(params).LJJL(T16.LIZ()).LJJJ(C73969T1h.LIZIZ()).LJJJLIIL(new AfS7S0100100_12(elapsedRealtime, this, 5), new AfS7S0100100_12(elapsedRealtime, this, 6));
        ((InterfaceC79150V4o) this.LJLIL.getValue()).LJIILL();
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C72153STl(AIGCApi api, JSONArray requestParams) {
        super(api);
        o.LJIIIZ(api, "api");
        o.LJIIIZ(requestParams, "requestParams");
        this.LJLILLLLZI = api;
        this.LJLJI = requestParams;
    }
}
