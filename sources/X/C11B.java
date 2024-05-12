package X;

import com.bytedance.mt.protector.impl.collections.ListProtector;
import java.util.List;

/* renamed from: X.11B, reason: invalid class name */
/* loaded from: classes.dex */
public final class C11B {
    public final java.util.Map<C11O, C11P> LIZ;
    public final C11S LIZIZ;
    public boolean LIZJ;

    public final boolean LIZ(long j) {
        Object obj;
        List list = (List) this.LIZIZ.LIZIZ;
        int size = list.size();
        int i = 0;
        while (true) {
            if (i < size) {
                obj = ListProtector.get(list, i);
                if (C11O.LIZ(((C11T) obj).LIZ, j)) {
                    break;
                }
                i++;
            } else {
                obj = null;
                break;
            }
        }
        C11T c11t = (C11T) obj;
        if (c11t == null) {
            return false;
        }
        return c11t.LJII;
    }

    public C11B(java.util.Map<C11O, C11P> map, C11S c11s) {
        this.LIZ = map;
        this.LIZIZ = c11s;
    }
}
