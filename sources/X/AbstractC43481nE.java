package X;

import java.util.concurrent.Executor;

/* renamed from: X.1nE, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC43481nE<Key, Value> extends AbstractC34531Xd<Key, Value> {
    public final Object LIZJ = new Object();
    public Key LIZLLL = null;
    public Key LJ = null;

    @Override // X.AbstractC34531Xd
    public final Key LJIIIZ(int i, Value value) {
        return null;
    }

    public abstract void LJIIJ(C19090oz<Key> c19090oz, AbstractC19060ow<Key, Value> abstractC19060ow);

    public abstract void LJIIJJI(C19080oy<Key> c19080oy, AbstractC19070ox<Key, Value> abstractC19070ox);

    public final void LJIIL(Key key) {
        synchronized (this.LIZJ) {
            this.LIZLLL = key;
        }
    }

    @Override // X.AbstractC34531Xd
    public final void LJI(int i, Object obj, int i2, Executor executor, C34541Xe c34541Xe) {
        Key key;
        synchronized (this.LIZJ) {
            key = this.LIZLLL;
        }
        if (key != null) {
            LJIIJ(new C19090oz<>(i2, key), new C34601Xk(this, 1, executor, c34541Xe));
        } else {
            c34541Xe.LIZ(1, C19110p1.LJ);
        }
    }

    @Override // X.AbstractC34531Xd
    public final void LJII(int i, Object obj, int i2, Executor executor, C34541Xe c34541Xe) {
        Key key;
        synchronized (this.LIZJ) {
            key = this.LJ;
        }
        if (key != null) {
            new C34601Xk(this, 2, executor, c34541Xe);
        } else {
            c34541Xe.LIZ(2, C19110p1.LJ);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // X.AbstractC34531Xd
    public final void LJIIIIZZ(Object obj, final int i, int i2, boolean z, Executor executor, C34541Xe c34541Xe) {
        C34611Xl c34611Xl = new C34611Xl(this, c34541Xe);
        LJIIJJI(new Object(i) { // from class: X.0oy
            public final int LIZ;

            {
                this.LIZ = i;
            }
        }, c34611Xl);
        C19000oq<Value> c19000oq = c34611Xl.LIZ;
        synchronized (c19000oq.LIZLLL) {
            c19000oq.LJ = executor;
        }
    }
}
