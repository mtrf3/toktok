package X;

import com.ss.android.ugc.aweme.services.performance.LagDataCallback;
import kotlin.jvm.internal.o;
import org.json.JSONObject;

/* renamed from: X.Gj8, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C42314Gj8 implements LagDataCallback {
    @Override // com.ss.android.ugc.aweme.services.performance.LagDataCallback
    public final void onDataAvailable(JSONObject data) {
        o.LJIIIZ(data, "data");
        FMX.LJIILJJIL("tool_performance_block_info", data);
    }
}
