package X;

import com.bytedance.pitaya.log.PitayaLogger;
import java.lang.reflect.Field;
import java.util.HashMap;
import kotlin.jvm.internal.o;

/* renamed from: X.aPK, reason: case insensitive filesystem */
/* loaded from: classes30.dex */
public final class C93342aPK extends AbstractC65781Prl implements InterfaceC65784Pro<HashMap<String, String>> {
    public static final C93342aPK LJLIL = new C93342aPK();

    public C93342aPK() {
        super(0);
    }

    @Override // X.InterfaceC65784Pro
    public final HashMap<String, String> invoke() {
        Object obj;
        HashMap<String, String> hashMap = new HashMap<>();
        try {
            Class<?> cls = Class.forName("com.bytedance.pitaya.ptyapt.TypeMapping");
            Object newInstance = cls.newInstance();
            Field mapField = cls.getDeclaredField("mapping");
            o.LJFF(mapField, "mapField");
            mapField.setAccessible(true);
            obj = mapField.get(newInstance);
        } catch (Throwable th) {
            PitayaLogger.LJ(th, null, 6);
        }
        if (obj != null) {
            hashMap.putAll((java.util.Map) obj);
            return hashMap;
        }
        throw new C37692Eqm("null cannot be cast to non-null type kotlin.collections.Map<out kotlin.String, kotlin.String>");
    }
}
