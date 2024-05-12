package X;

/* renamed from: X.Sw7, reason: case insensitive filesystem */
/* loaded from: classes13.dex */
public final class C73695Sw7<T> extends AbstractC73556Sts<T> {
    public final InterfaceC116954iR<? super T> LJLIL;
    public final T[] LJLILLLLZI;
    public int LJLJI;
    public boolean LJLJJI;
    public volatile boolean LJLJJL;

    @Override // X.InterfaceC92693kP
    public final void dispose() {
        this.LJLJJL = true;
    }

    @Override // X.InterfaceC73570Su6
    public final void clear() {
        this.LJLJI = this.LJLILLLLZI.length;
    }

    @Override // X.InterfaceC73570Su6
    public final boolean isEmpty() {
        if (this.LJLJI == this.LJLILLLLZI.length) {
            return true;
        }
        return false;
    }

    @Override // X.InterfaceC73570Su6
    public final T poll() {
        int i = this.LJLJI;
        T[] tArr = this.LJLILLLLZI;
        if (i != tArr.length) {
            this.LJLJI = i + 1;
            T t = tArr[i];
            C73320Sq4.LIZ(t, "The array element is null");
            return t;
        }
        return null;
    }

    @Override // X.InterfaceC92693kP
    public final boolean isDisposed() {
        return this.LJLJJL;
    }

    @Override // X.InterfaceC73571Su7
    public final int requestFusion(int i) {
        if ((i & 1) != 0) {
            this.LJLJJI = true;
            return 1;
        }
        return 0;
    }

    public C73695Sw7(InterfaceC116954iR<? super T> interfaceC116954iR, T[] tArr) {
        this.LJLIL = interfaceC116954iR;
        this.LJLILLLLZI = tArr;
    }
}
