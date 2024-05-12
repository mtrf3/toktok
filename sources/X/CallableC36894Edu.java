package X;

import com.ss.android.common.lib.AppLogNewUtils;
import java.util.concurrent.Callable;
import org.json.JSONObject;

/* renamed from: X.Edu, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class CallableC36894Edu<V> implements Callable {
    public final /* synthetic */ long LJLIL;

    public CallableC36894Edu(long j) {
        this.LJLIL = j;
    }

    @Override // java.util.concurrent.Callable
    public final Object call() {
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("cost", this.LJLIL);
        AppLogNewUtils.onEventV3("search_page_launch_event", jSONObject);
        FUA.LIZJ("search_page_launch_event", jSONObject);
        return C76800UCe.LIZ;
    }
}
