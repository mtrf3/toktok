package X;

/* renamed from: X.1UB, reason: invalid class name */
/* loaded from: classes.dex */
public class C1UB<T> implements InterfaceC15090iX<T> {
    public final Object[] LIZ;
    public int LIZIZ;

    @Override // X.InterfaceC15090iX
    public T LIZIZ() {
        int i = this.LIZIZ;
        if (i <= 0) {
            return null;
        }
        int i2 = i - 1;
        Object[] objArr = this.LIZ;
        T t = (T) objArr[i2];
        objArr[i2] = null;
        this.LIZIZ = i - 1;
        return t;
    }

    public C1UB(int i) {
        if (i > 0) {
            this.LIZ = new Object[i];
            return;
        }
        throw new IllegalArgumentException("The max pool size must be > 0");
    }

    @Override // X.InterfaceC15090iX
    public boolean LIZ(T t) {
        int i = 0;
        while (true) {
            int i2 = this.LIZIZ;
            if (i < i2) {
                if (this.LIZ[i] == t) {
                    throw new IllegalStateException("Already in the pool!");
                }
                i++;
            } else {
                Object[] objArr = this.LIZ;
                if (i2 >= objArr.length) {
                    return false;
                }
                objArr[i2] = t;
                this.LIZIZ = i2 + 1;
                return true;
            }
        }
    }
}
