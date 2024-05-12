package X;

import com.ss.android.common.lib.AppLogNewUtils;
import java.util.concurrent.Callable;
import org.json.JSONObject;

/* renamed from: X.Ycd, reason: case insensitive filesystem */
/* loaded from: classes17.dex */
public final class CallableC87775Ycd<V> implements Callable {
    public final /* synthetic */ C87776Yce LJLIL;
    public final /* synthetic */ String LJLILLLLZI;
    public final /* synthetic */ int LJLJI;

    public CallableC87775Ycd(C87776Yce c87776Yce, String str, int i) {
        this.LJLIL = c87776Yce;
        this.LJLILLLLZI = str;
        this.LJLJI = i;
    }

    @Override // java.util.concurrent.Callable
    public final Object call() {
        String str = this.LJLIL.LIZIZ;
        JSONObject jSONObject = new JSONObject();
        C87776Yce c87776Yce = this.LJLIL;
        String str2 = this.LJLILLLLZI;
        int i = this.LJLJI;
        jSONObject.put("async_mode", c87776Yce.LIZ);
        jSONObject.put("status", 1);
        jSONObject.put("card_type", str2);
        jSONObject.put("position", i);
        jSONObject.put("strategy", JWC.LIZ.strategyVersion);
        AppLogNewUtils.onEventV3(str, jSONObject);
        return C76800UCe.LIZ;
    }
}
