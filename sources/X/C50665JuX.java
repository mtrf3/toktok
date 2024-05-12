package X;

/* renamed from: X.JuX, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C50665JuX extends C8BR<C50664JuW, InterfaceC50666JuY> {
    @Override // X.C8BR, X.C8BT
    public final void onSuccess() {
        T t;
        if (this.LJLILLLLZI != 0 && (t = this.LJLIL) != 0 && t.getData() != null) {
            ((InterfaceC50666JuY) this.LJLILLLLZI).s00(((C50663JuV) this.LJLIL.getData()).LIZ);
        }
    }

    @Override // X.C8BR, X.C8BT
    public final void onFailed(Exception exc) {
        InterfaceC50666JuY interfaceC50666JuY = (InterfaceC50666JuY) this.LJLILLLLZI;
        if (interfaceC50666JuY != null) {
            interfaceC50666JuY.Yv(exc);
        }
    }
}
