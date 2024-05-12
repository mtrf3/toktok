package X;

import android.content.Intent;
import android.os.Bundle;
import android.util.LruCache;
import com.bytedance.ies.powerpreload.task.TaskTraceMetric;
import kotlin.jvm.internal.o;

/* renamed from: X.HWo, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C44206HWo {
    public static final LruCache<String, TaskTraceMetric> LIZ = new LruCache<>(16);

    public static final String LIZ(Intent intent) {
        o.LJIIJ(intent, "intent");
        return C16880lQ.LLJJIJIIJIL(intent, "PRELOAD_TRACE_INFO_LIFECYCLE_KEY");
    }

    public static final String LIZIZ(Bundle bundle) {
        o.LJIIJ(bundle, "bundle");
        return bundle.getString("PRELOAD_TRACE_INFO_LIFECYCLE_KEY");
    }
}
