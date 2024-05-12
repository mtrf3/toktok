package X;

import java.util.ArrayDeque;
import java.util.List;
import java.util.NoSuchElementException;

/* renamed from: X.Iu7, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C48091Iu7 {
    public final List<String> LIZ;
    public final ArrayDeque<C48090Iu6> LIZIZ;
    public final ArrayDeque<C48090Iu6> LIZJ;

    public final boolean LIZ() {
        if (!this.LIZIZ.isEmpty() || !this.LIZJ.isEmpty()) {
            return true;
        }
        return false;
    }

    public final C48090Iu6 LIZIZ() {
        if (!this.LIZIZ.isEmpty()) {
            return this.LIZIZ.removeFirst();
        }
        if (!this.LIZJ.isEmpty()) {
            return this.LIZJ.removeFirst();
        }
        throw new NoSuchElementException();
    }

    public C48091Iu7(List<String> list) {
        if (list != null && !list.isEmpty()) {
            int size = list.size();
            this.LIZ = list;
            this.LIZIZ = new ArrayDeque<>(size);
            this.LIZJ = new ArrayDeque<>(size);
            for (String str : list) {
                if (C48100IuG.LJIIIZ(str)) {
                    this.LIZIZ.add(new C48090Iu6(this, str));
                }
            }
            return;
        }
        throw new IllegalArgumentException("urls is empty");
    }
}
