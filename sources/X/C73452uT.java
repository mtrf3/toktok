package X;

import java.io.File;
import kotlin.jvm.internal.o;
import ujb.s;

/* renamed from: X.2uT, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C73452uT extends AbstractC65781Prl implements InterfaceC88473Ynt<java.util.Map<?, ?>, String, String, java.util.Map<Object, Object>> {
    public static final C73452uT LJLIL = new C73452uT();

    public C73452uT() {
        super(3);
    }

    @Override // X.InterfaceC88473Ynt
    public final java.util.Map<Object, Object> invoke(java.util.Map<?, ?> map, String str, String str2) {
        java.util.Map<?, ?> builder = map;
        String value = str2;
        o.LJIIJ(builder, "builder");
        o.LJIIJ(str, "<anonymous parameter 1>");
        o.LJIIJ(value, "value");
        java.util.Map<Object, Object> LIZJ = C65777Prh.LIZJ(builder);
        StringBuilder sb = new StringBuilder();
        if ((!ujb.o.LJJJJJL(value)) && value != null) {
            sb.append(File.separator);
            sb.append(s.LJZI(value).toString());
        }
        Object obj = builder.get("__PATH__");
        if (obj != null) {
            if (!(obj instanceof String)) {
                obj = null;
            }
            String str3 = (String) obj;
            if (str3 != null) {
                String str4 = File.separator;
                o.LJFF(str4, "File.separator");
                if (!ujb.o.LJJJLIIL(str3, str4, false)) {
                    sb.append(str4);
                }
                sb.append(str3);
            }
        }
        LIZJ.put("__PATH__", String.valueOf(sb));
        return LIZJ;
    }
}
