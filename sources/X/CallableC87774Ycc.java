package X;

import com.ss.android.common.lib.AppLogNewUtils;
import java.util.concurrent.Callable;
import org.json.JSONObject;

/* renamed from: X.Ycc, reason: case insensitive filesystem */
/* loaded from: classes17.dex */
public final class CallableC87774Ycc<V> implements Callable {
    public final /* synthetic */ C87776Yce LJLIL;
    public final /* synthetic */ String LJLILLLLZI;
    public final /* synthetic */ int LJLJI;
    public final /* synthetic */ long LJLJJI;
    public final /* synthetic */ long LJLJJL;

    public CallableC87774Ycc(C87776Yce c87776Yce, String str, int i, long j, long j2) {
        this.LJLIL = c87776Yce;
        this.LJLILLLLZI = str;
        this.LJLJI = i;
        this.LJLJJI = j;
        this.LJLJJL = j2;
    }

    @Override // java.util.concurrent.Callable
    public final Object call() {
        String str = this.LJLIL.LIZIZ;
        JSONObject jSONObject = new JSONObject();
        C87776Yce c87776Yce = this.LJLIL;
        String str2 = this.LJLILLLLZI;
        int i = this.LJLJI;
        long j = this.LJLJJI;
        long j2 = this.LJLJJL;
        jSONObject.put("async_mode", c87776Yce.LIZ);
        jSONObject.put("status", 0);
        jSONObject.put("card_type", str2);
        jSONObject.put("position", i);
        jSONObject.put("wait_time", j);
        jSONObject.put("cost_time", j2);
        jSONObject.put("strategy", JWC.LIZ.strategyVersion);
        AppLogNewUtils.onEventV3(str, jSONObject);
        return C76800UCe.LIZ;
    }
}
