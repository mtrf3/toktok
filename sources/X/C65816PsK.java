package X;

import com.bytedance.mt.protector.impl.collections.ListProtector;
import java.util.List;

/* renamed from: X.PsK, reason: case insensitive filesystem */
/* loaded from: classes12.dex */
public final class C65816PsK<E> {
    public final int LIZ;
    public final List<E> LIZIZ;

    public final void LIZ(E e) {
        List<E> list = this.LIZIZ;
        if (list == null) {
            return;
        }
        list.add(e);
        while (this.LIZIZ.size() > this.LIZ) {
            ListProtector.remove(this.LIZIZ, 0);
        }
    }

    public C65816PsK(Integer num, List<E> list) {
        int i;
        if (num.intValue() > 0) {
            i = num.intValue();
        } else {
            i = 0;
        }
        this.LIZ = i;
        this.LIZIZ = list;
    }
}
