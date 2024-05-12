package X;

/* loaded from: classes10.dex */
public final class LXH<T> implements C5H3<T> {
    public final InterfaceC65784Pro<T> LJLIL;
    public T LJLILLLLZI;

    @Override // X.C5H3
    public final T getValue() {
        T t = this.LJLILLLLZI;
        if (t == null) {
            T invoke = this.LJLIL.invoke();
            this.LJLILLLLZI = invoke;
            return invoke;
        }
        return t;
    }

    @Override // X.C5H3
    public final boolean isInitialized() {
        if (this.LJLILLLLZI != null) {
            return true;
        }
        return false;
    }

    public LXH(LXI lxi, boolean z) {
        this.LJLIL = lxi;
        if (!z) {
            this.LJLILLLLZI = (T) lxi.invoke();
        }
    }
}
