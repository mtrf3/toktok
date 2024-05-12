package X;

import com.bytedance.retrofit2.client.Request;
import java.util.concurrent.ConcurrentHashMap;
import kotlin.jvm.internal.o;

/* renamed from: X.PhJ, reason: case insensitive filesystem */
/* loaded from: classes12.dex */
public final class C65133PhJ {
    public static void LIZ(Request request, EnumC29608Bjg switchType, String settingKey) {
        o.LJIIIZ(switchType, "switchType");
        o.LJIIIZ(settingKey, "settingKey");
        ConcurrentHashMap concurrentHashMap = (ConcurrentHashMap) C65132PhI.LIZLLL;
        if (!concurrentHashMap.containsKey(request.getPath())) {
            String path = request.getPath();
            o.LJIIIIZZ(path, "request.path");
            String str = switchType.key;
            o.LJIIIIZZ(str, "switchType.key");
            concurrentHashMap.put(path, new C65134PhK(str, settingKey));
        }
    }
}
