package X;

import kotlin.jvm.internal.o;

/* renamed from: X.AeM, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C26730AeM {
    public static final /* synthetic */ int LIZ = 0;

    public static void LIZ(StringBuilder sb, String key, String str) {
        int indexOf;
        o.LJIIIZ(key, "key");
        if (sb.indexOf(key) == -1) {
            StringBuilder LIZ2 = X1D.LIZ();
            LIZ2.append("[tiktokec_template_key_not_found] template = ");
            LIZ2.append((Object) sb);
            LIZ2.append(", key = ");
            LIZ2.append(key);
            C78983UzD.LJIILL(X1D.LIZIZ(LIZ2));
        }
        if (key.length() == 0 || str.length() == 0 || (indexOf = sb.indexOf(key)) <= -1 || o.LJ(key, str)) {
            return;
        }
        do {
            sb.replace(indexOf, key.length() + indexOf, str);
            indexOf = sb.indexOf(key, str.length() + indexOf);
        } while (indexOf > -1);
    }
}
