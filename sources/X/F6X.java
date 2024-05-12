package X;

/* loaded from: classes7.dex */
public final class F6X implements InterfaceC37126Ehe {
    public final /* synthetic */ F6Y LJLIL;

    public F6X(QBW qbw) {
        this.LJLIL = qbw;
    }

    @Override // X.InterfaceC37126Ehe
    public final void onSuccess(String str, boolean z) {
        F6Y f6y = this.LJLIL;
        if (f6y != null) {
            f6y.onSuccess(str, z);
        }
    }

    @Override // X.InterfaceC37126Ehe
    public final void onFailed(String str, boolean z, int i) {
        F6Y f6y;
        if (i != 7 && (f6y = this.LJLIL) != null) {
            f6y.onFailed(str, z, i);
        }
    }
}
