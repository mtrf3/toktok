package X;

/* loaded from: classes9.dex */
public class KQB extends C8BR<C3IB, InterfaceC224378rJ> {
    @Override // X.C8BR, X.C8BT
    public void onSuccess() {
        T t;
        K k = this.LJLILLLLZI;
        if (k != 0 && (t = this.LJLIL) != 0) {
            ((InterfaceC224378rJ) k).ZF((OSZ) t.getData());
        }
    }

    @Override // X.C8BR, X.C8BT
    public void onFailed(Exception exc) {
        K k = this.LJLILLLLZI;
        if (k != 0) {
            ((InterfaceC224378rJ) k).fC(exc);
        }
    }
}
