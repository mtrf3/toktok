package X;

import java.util.concurrent.Executor;

/* renamed from: X.1nD, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC43471nD<Key, Value> extends AbstractC34531Xd<Key, Value> {
    public abstract Key LJIIJ(Value value);

    public abstract void LJIIJJI(C19040ou c19040ou, C34561Xg c34561Xg);

    public abstract void LJIIL(C19040ou c19040ou, C34561Xg c34561Xg);

    public abstract void LJIILIIL(C19030ot<Key> c19030ot, AbstractC34571Xh<Value> abstractC34571Xh);

    @Override // X.AbstractC34531Xd
    public final Key LJIIIZ(int i, Value value) {
        if (value == null) {
            return null;
        }
        return LJIIJ(value);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // X.AbstractC34531Xd
    public final void LJI(int i, Object obj, int i2, Executor executor, C34541Xe c34541Xe) {
        LJIIJJI(new C19040ou(LJIIJ(obj)), new C34561Xg(this, 1, executor, c34541Xe));
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // X.AbstractC34531Xd
    public final void LJII(int i, Object obj, int i2, Executor executor, C34541Xe c34541Xe) {
        LJIIL(new C19040ou(LJIIJ(obj)), new C34561Xg(this, 2, executor, c34541Xe));
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // X.AbstractC34531Xd
    public final void LJIIIIZZ(final Object obj, int i, int i2, boolean z, Executor executor, C34541Xe c34541Xe) {
        C43461nC c43461nC = new C43461nC(this, z, c34541Xe);
        LJIILIIL(new Object(obj) { // from class: X.0ot
            public final Key LIZ;

            /* JADX WARN: Multi-variable type inference failed */
            {
                this.LIZ = obj;
            }
        }, c43461nC);
        C19000oq<Value> c19000oq = c43461nC.LIZ;
        synchronized (c19000oq.LIZLLL) {
            c19000oq.LJ = executor;
        }
    }
}
