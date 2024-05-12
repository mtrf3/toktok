package X;

import android.os.Build;
import java.util.HashMap;
import kotlin.jvm.internal.o;

/* renamed from: X.PRh, reason: case insensitive filesystem */
/* loaded from: classes12.dex */
public final class C64453PRh {
    public static AbstractC64456PRk LIZ(String type) {
        AbstractC64456PRk c64460PRo;
        o.LJIIIZ(type, "type");
        HashMap<String, AbstractC64456PRk> hashMap = C58225MtB.LIZ;
        AbstractC64456PRk abstractC64456PRk = hashMap.get(type);
        if (abstractC64456PRk != null) {
            return abstractC64456PRk;
        }
        if (Build.VERSION.SDK_INT < 24) {
            c64460PRo = new C64458PRm();
        } else {
            c64460PRo = new C64460PRo();
        }
        C64454PRi.LJLILLLLZI.getClass();
        C64454PRi.LJLJI.add(c64460PRo);
        hashMap.put(type, c64460PRo);
        return c64460PRo;
    }
}
