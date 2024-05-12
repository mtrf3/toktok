package X;

import com.ss.android.common.lib.AppLogNewUtils;
import java.util.concurrent.Callable;
import org.json.JSONObject;

/* renamed from: X.Ycb, reason: case insensitive filesystem */
/* loaded from: classes17.dex */
public final class CallableC87773Ycb<V> implements Callable {
    public final /* synthetic */ C87776Yce LJLIL;
    public final /* synthetic */ String LJLILLLLZI;
    public final /* synthetic */ int LJLJI;
    public final /* synthetic */ Exception LJLJJI;
    public final /* synthetic */ long LJLJJL;

    public CallableC87773Ycb(C87776Yce c87776Yce, String str, int i, Exception exc, long j) {
        this.LJLIL = c87776Yce;
        this.LJLILLLLZI = str;
        this.LJLJI = i;
        this.LJLJJI = exc;
        this.LJLJJL = j;
    }

    @Override // java.util.concurrent.Callable
    public final Object call() {
        String str;
        String str2 = this.LJLIL.LIZIZ;
        JSONObject jSONObject = new JSONObject();
        C87776Yce c87776Yce = this.LJLIL;
        String str3 = this.LJLILLLLZI;
        int i = this.LJLJI;
        Exception exc = this.LJLJJI;
        long j = this.LJLJJL;
        jSONObject.put("async_mode", c87776Yce.LIZ);
        jSONObject.put("status", 2);
        jSONObject.put("card_type", str3);
        jSONObject.put("position", i);
        if (exc == null || (str = exc.toString()) == null) {
            str = "unknown";
        }
        jSONObject.put("error_message", str);
        jSONObject.put("wait_time", j);
        jSONObject.put("strategy", JWC.LIZ.strategyVersion);
        AppLogNewUtils.onEventV3(str2, jSONObject);
        return C76800UCe.LIZ;
    }
}
