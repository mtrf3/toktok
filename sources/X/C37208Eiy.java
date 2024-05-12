package X;

import java.util.Iterator;
import java.util.List;
import ujb.s;

/* renamed from: X.Eiy, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C37208Eiy {
    public static final List<String> LIZ = C47261Igj.LJJIJIIJI("v16.tiktokv.com", "v.tiktok.com", "vt.tiktok.com", "vm.tiktok.com");
    public static final List<String> LIZIZ = C47261Igj.LJJIJIIJI("tiktok.com", "tiktokv.com");

    public static final boolean LIZ(String str) {
        if (str == null) {
            return false;
        }
        Iterator<String> it = LIZIZ.iterator();
        while (it.hasNext()) {
            if (s.LJJJLZIJ(str, it.next(), false)) {
                return true;
            }
        }
        return false;
    }
}
