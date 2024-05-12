package X;

import com.ss.android.ugc.aweme.services.performance.LagDataCallback;
import kotlin.jvm.internal.o;
import org.json.JSONObject;

/* renamed from: X.Gj7, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C42313Gj7 implements LagDataCallback {
    public final /* synthetic */ String LJLIL;

    public C42313Gj7(String str) {
        this.LJLIL = str;
    }

    @Override // com.ss.android.ugc.aweme.services.performance.LagDataCallback
    public final void onDataAvailable(JSONObject data) {
        o.LJIIIZ(data, "data");
        if (o.LJ(this.LJLIL, "tool_publish_enter") || o.LJ(this.LJLIL, "tool_edit_enter")) {
            data.put("creation_duration", C42315Gj9.LIZ);
        }
        FMX.LJIILJJIL("tool_performance_fps_info", data);
    }
}
