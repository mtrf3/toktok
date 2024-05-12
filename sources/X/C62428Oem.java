package X;

import com.bytedance.mt.protector.impl.GsonProtectorUtils;
import java.util.List;
import kotlin.jvm.internal.o;

/* renamed from: X.Oem, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class C62428Oem {
    public static final C45322HqY LIZ = new C45322HqY("", (List) C61878OQg.INSTANCE);

    public static final C62427Oel LIZ(InterfaceC88472Yns<? super C62427Oel, C76800UCe> initializer) {
        o.LJIIIZ(initializer, "initializer");
        C62427Oel c62427Oel = new C62427Oel();
        initializer.invoke(c62427Oel);
        return c62427Oel;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final void LIZIZ(java.util.Map<String, String> map, C45322HqY c45322HqY, String str, String str2) {
        c45322HqY.getClass();
        if (o.LJ(c45322HqY, LIZ) || ((String) c45322HqY.LJLJI).length() == 0) {
            return;
        }
        if (((String) c45322HqY.LJLJI).length() > 0) {
            map.put(str, c45322HqY.LJLJI);
        }
        if (!c45322HqY.LJLILLLLZI.isEmpty()) {
            String json = GsonProtectorUtils.toJson(C63682Oz0.LIZ, c45322HqY.LJLILLLLZI);
            o.LJIIIIZZ(json, "GSON.toJson(translationInfo.arguments)");
            map.put(str2, json);
        }
    }
}
