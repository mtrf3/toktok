package X;

import java.io.File;
import java.util.List;
import java.util.ListIterator;
import java.util.NoSuchElementException;
import kotlin.jvm.internal.o;
import ujb.s;

/* renamed from: X.2uV, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C73472uV extends AbstractC65781Prl implements InterfaceC88471Ynr<java.util.Map<?, ?>, String, String> {
    public static final C73472uV LJLIL = new C73472uV();

    public C73472uV() {
        super(2);
    }

    @Override // X.InterfaceC88471Ynr
    public final String invoke(java.util.Map<?, ?> map, String str) {
        java.util.Map<?, ?> map2 = map;
        o.LJIIJ(map2, "map");
        o.LJIIJ(str, "<anonymous parameter 1>");
        Object obj = map2.get("__PATH__");
        String str2 = null;
        if (obj != null) {
            if (!(obj instanceof String)) {
                obj = null;
            }
            String str3 = (String) obj;
            if (str3 != null) {
                String str4 = File.separator;
                o.LJFF(str4, "File.separator");
                List LJLJJL = s.LJLJJL(str3, new String[]{str4}, 0, 6);
                ListIterator listIterator = LJLJJL.listIterator(LJLJJL.size());
                while (listIterator.hasPrevious()) {
                    str2 = (String) listIterator.previous();
                    if (!ujb.o.LJJJJJL(str2)) {
                    }
                }
                throw new NoSuchElementException("List contains no element matching the predicate.");
            }
        }
        return str2;
    }
}
