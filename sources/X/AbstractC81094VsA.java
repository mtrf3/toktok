package X;

import java.util.LinkedList;
import java.util.NoSuchElementException;
import java.util.Queue;

/* renamed from: X.VsA, reason: case insensitive filesystem */
/* loaded from: classes15.dex */
public abstract class AbstractC81094VsA<T> {
    public final int LIZ = 16;
    public final Queue<T> LIZIZ = new LinkedList();

    public abstract T LIZ();

    public abstract T LIZIZ(T t);

    /* JADX WARN: Multi-variable type inference failed */
    public final T LIZJ() {
        if (((LinkedList) this.LIZIZ).size() == 0) {
            return (T) LIZ();
        }
        try {
            return (T) LIZIZ(((LinkedList) this.LIZIZ).poll());
        } catch (NoSuchElementException unused) {
            return (T) LIZ();
        }
    }
}
