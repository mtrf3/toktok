package X;

import com.bytedance.android.livesdk.container.type.HColor;
import java.util.concurrent.ConcurrentHashMap;
import kotlin.jvm.internal.o;
import org.json.JSONArray;

/* renamed from: X.COe, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C31248COe {
    public static final ConcurrentHashMap<Class<?>, InterfaceC31253COj<?>> LIZ;

    static {
        ConcurrentHashMap<Class<?>, InterfaceC31253COj<?>> concurrentHashMap = new ConcurrentHashMap<>();
        LIZ = concurrentHashMap;
        concurrentHashMap.put(Integer.TYPE, C31249COf.LIZ);
        concurrentHashMap.put(String.class, C31252COi.LIZ);
        concurrentHashMap.put(Boolean.TYPE, C31251COh.LIZ);
        concurrentHashMap.put(HColor.class, C31247COd.LIZ);
        concurrentHashMap.put(JSONArray.class, C31250COg.LIZ);
    }

    public static Object LIZ(android.net.Uri uri, String key, String str, Class cls) {
        o.LJIIIZ(uri, "uri");
        o.LJIIIZ(key, "key");
        InterfaceC31253COj<?> interfaceC31253COj = LIZ.get(cls);
        if (interfaceC31253COj != null) {
            Object LIZ2 = interfaceC31253COj.LIZ(uri, key, str);
            o.LJIIIIZZ(LIZ2, "parser.parseValue(uri, key, value)");
            return LIZ2;
        }
        throw new IllegalStateException("unsupported type parse");
    }
}
