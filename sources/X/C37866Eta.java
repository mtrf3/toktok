package X;

import java.util.Map;
import kotlin.jvm.internal.o;

/* renamed from: X.Eta, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C37866Eta {
    public static final /* synthetic */ int LIZ = 0;

    public static final void LIZ(C37922EuU c37922EuU, C38150EyA dmtJsBridge, String str) {
        o.LJIIIZ(dmtJsBridge, "dmtJsBridge");
        java.util.Map<String, Class<? extends InterfaceC37666EqM>> LIZ2 = C37831Et1.LIZ(EnumC37844EtE.WEB, str);
        if (LIZ2 != null) {
            for (Map.Entry<String, Class<? extends InterfaceC37666EqM>> entry : LIZ2.entrySet()) {
                String key = entry.getKey();
                InterfaceC37666EqM newInstance = entry.getValue().newInstance();
                newInstance.LIZJ(c37922EuU);
                dmtJsBridge.LIZ(key, new C37864EtY(newInstance, dmtJsBridge));
            }
        }
    }
}
