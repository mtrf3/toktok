package X;

/* renamed from: X.OjB, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class C62701OjB extends C8BR<OQG, InterfaceC62702OjC> {
    @Override // X.C8BR, X.C8BT
    public final void onSuccess() {
        T t;
        K k = this.LJLILLLLZI;
        if (k != 0 && (t = this.LJLIL) != 0) {
            t.getData();
            ((InterfaceC62702OjC) k).Cj0();
        }
    }

    @Override // X.C8BR, X.C8BT
    public final void onFailed(Exception exc) {
        K k = this.LJLILLLLZI;
        if (k != 0) {
            ((InterfaceC62702OjC) k).T60(exc);
        }
    }
}
