package X;

import com.bytedance.pia.core.bridge.methods.BootGet;
import com.bytedance.pia.core.bridge.methods.CacheGetContentMethod;
import com.bytedance.pia.core.bridge.methods.CacheGetHeadersMethod;
import com.bytedance.pia.core.bridge.methods.CacheRemoveMethod;
import com.bytedance.pia.core.bridge.methods.CacheSaveMethod;
import com.bytedance.pia.core.bridge.methods.CacheUpdateManifestMethod;
import com.bytedance.pia.core.bridge.methods.SettingGet;
import com.bytedance.pia.core.bridge.methods.TracingGet;
import com.bytedance.pia.core.bridge.methods.WorkerCreate;
import com.bytedance.pia.core.bridge.methods.WorkerPostMessage;
import com.bytedance.pia.core.bridge.methods.WorkerRunTask;
import com.bytedance.pia.core.bridge.methods.WorkerTerminate;
import java.util.HashMap;

/* renamed from: X.Elw, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C37392Elw {
    public static final java.util.Map<String, C37403Em7<?, ?>> LIZIZ;
    public final java.util.Map<String, C37403Em7<?, ?>> LIZ = new HashMap();

    static {
        HashMap hashMap = new HashMap();
        LIZIZ = hashMap;
        hashMap.put("pia.internal.setting.get", SettingGet.LIZ);
        hashMap.put("pia.internal.worker.create", WorkerCreate.LIZ);
        hashMap.put("pia.internal.worker.postMessage", WorkerPostMessage.LIZ);
        hashMap.put("pia.internal.worker.terminate", WorkerTerminate.LIZ);
        hashMap.put("pia.internal.worker.runTask", WorkerRunTask.LIZ);
        hashMap.put("pia.internal.boot.get", BootGet.LIZ);
        hashMap.put("pia.internal.cache.save", CacheSaveMethod.LIZ);
        hashMap.put("pia.internal.cache.getContent", CacheGetContentMethod.LIZ);
        hashMap.put("pia.internal.cache.remove", CacheRemoveMethod.LIZ);
        hashMap.put("pia.internal.cache.getHeaders", CacheGetHeadersMethod.LIZ);
        hashMap.put("pia.internal.cache.updateManifest", CacheUpdateManifestMethod.LIZ);
        hashMap.put("pia.internal.tracing.get", TracingGet.LIZ);
    }
}
