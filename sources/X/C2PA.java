package X;

import com.bytedance.keva.Keva;
import java.util.HashSet;
import java.util.Iterator;
import kotlin.jvm.internal.o;
import ujb.s;

/* renamed from: X.2PA, reason: invalid class name */
/* loaded from: classes2.dex */
public final class C2PA {
    public static final C62822Ol8 LIZ = C221108m2.LIZIZ(C2NQ.LJLIL);
    public static String LIZIZ;

    public static void LIZ(java.util.Set discardCidSet) {
        o.LJIIIZ(discardCidSet, "discardCidSet");
        HashSet hashSet = new HashSet(discardCidSet);
        StringBuilder sb = new StringBuilder();
        Iterator it = hashSet.iterator();
        while (it.hasNext()) {
            Long it2 = (Long) it.next();
            o.LJIIIIZZ(it2, "it");
            sb.append(it2.longValue());
            sb.append(",");
        }
        if (sb.length() > 0) {
            sb.deleteCharAt(s.LJJLIIIJ(sb));
        }
        LIZIZ = sb.toString();
        Object value = LIZ.getValue();
        o.LJIIIIZZ(value, "<get-KEVA>(...)");
        ((Keva) value).storeString("discard_cid_list_key", LIZIZ);
    }
}
