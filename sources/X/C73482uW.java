package X;

import java.io.File;
import java.util.NoSuchElementException;
import kotlin.jvm.internal.o;
import ujb.s;

/* renamed from: X.2uW, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C73482uW extends AbstractC65781Prl implements InterfaceC88471Ynr<java.util.Map<?, ?>, String, String> {
    public static final C73482uW LJLIL = new C73482uW();

    public C73482uW() {
        super(2);
    }

    @Override // X.InterfaceC88471Ynr
    public final String invoke(java.util.Map<?, ?> map, String str) {
        java.util.Map<?, ?> map2 = map;
        o.LJIIJ(map2, "map");
        o.LJIIJ(str, "<anonymous parameter 1>");
        Object obj = map2.get("__PATH__");
        r1 = null;
        if (obj != null) {
            if (!(obj instanceof String)) {
                obj = null;
            }
            String str2 = (String) obj;
            if (str2 != null) {
                String str3 = File.separator;
                o.LJFF(str3, "File.separator");
                for (String str4 : s.LJLJJL(str2, new String[]{str3}, 0, 6)) {
                    if (!ujb.o.LJJJJJL(str4)) {
                    }
                }
                throw new NoSuchElementException("Collection contains no element matching the predicate.");
            }
        }
        return str4;
    }
}
