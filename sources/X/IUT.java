package X;

import com.bytedance.mt.protector.impl.collections.ListProtector;
import java.util.LinkedList;
import java.util.List;

/* loaded from: classes9.dex */
public final class IUT<T> {
    public final int LIZ;
    public final List<T> LIZIZ = new LinkedList();

    public final synchronized List<T> LIZ() {
        return this.LIZIZ;
    }

    public IUT(int i) {
        this.LIZ = i;
    }

    public final synchronized void LIZIZ(T t) {
        if (((LinkedList) this.LIZIZ).size() >= this.LIZ) {
            ListProtector.remove(this.LIZIZ, 0);
        }
        ((LinkedList) this.LIZIZ).add(t);
    }
}
