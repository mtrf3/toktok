package X;

import com.bytedance.mt.protector.impl.collections.ListProtector;
import java.util.List;
import java.util.ListIterator;
import kotlin.jvm.internal.o;

/* renamed from: X.Zz0, reason: case insensitive filesystem */
/* loaded from: classes20.dex */
public final class C91710Zz0 implements Comparable<C91710Zz0> {
    public final String LJLIL;
    public final String LJLILLLLZI;

    public C91710Zz0(String mimeType) {
        List list;
        o.LJIIIZ(mimeType, "mimeType");
        List<String> split = new OJD("/").split(mimeType, 0);
        if (!split.isEmpty()) {
            ListIterator<String> listIterator = split.listIterator(split.size());
            while (listIterator.hasPrevious()) {
                if (listIterator.previous().length() != 0) {
                    list = ORZ.LLILLL(split, listIterator.nextIndex() + 1);
                    break;
                }
            }
        }
        list = C61878OQg.INSTANCE;
        this.LJLIL = (String) ListProtector.get(list, 0);
        this.LJLILLLLZI = (String) ListProtector.get(list, 1);
    }

    @Override // java.lang.Comparable
    /* renamed from: LIZJ, reason: merged with bridge method [inline-methods] */
    public final int compareTo(C91710Zz0 other) {
        int i;
        o.LJIIIZ(other, "other");
        if (o.LJ(this.LJLIL, other.LJLIL)) {
            i = 2;
        } else {
            i = 0;
        }
        if (o.LJ(this.LJLILLLLZI, other.LJLILLLLZI)) {
            return i + 1;
        }
        return i;
    }
}
