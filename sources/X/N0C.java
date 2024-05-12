package X;

import Y.ACallableS37S1100000_10;
import com.bytedance.ies.android.base.runtime.depend.IAppLogDepend;
import java.util.concurrent.ExecutorService;
import org.json.JSONObject;

/* loaded from: classes11.dex */
public final class N0C implements InterfaceC04440Fk {
    @Override // X.InterfaceC04440Fk
    public final void onEventV3(String str, JSONObject jSONObject) {
        ExecutorService executorService;
        ACallableS37S1100000_10 aCallableS37S1100000_10 = new ACallableS37S1100000_10(jSONObject, str, 5);
        IAppLogDepend LIZ = C59835Ne3.LIZ();
        if (LIZ != null) {
            executorService = LIZ.getLogThreadPool();
        } else {
            executorService = null;
        }
        C10K.LIZIZ(aCallableS37S1100000_10, executorService, null);
    }
}
