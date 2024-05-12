package X;

/* renamed from: X.HMy, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public class C43956HMy<V> extends AbstractC84776XOy<V> {
    public static final C43956HMy<Object> LJLJI = new C43956HMy<>(null);
    public final V LJLILLLLZI;

    public final String toString() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append(super.toString());
        LIZ.append("[status=SUCCESS, result=[");
        LIZ.append(this.LJLILLLLZI);
        LIZ.append("]]");
        return X1D.LIZIZ(LIZ);
    }

    @Override // X.AbstractC84776XOy, java.util.concurrent.Future
    public final V get() {
        return this.LJLILLLLZI;
    }

    public C43956HMy(V v) {
        this.LJLILLLLZI = v;
    }
}
