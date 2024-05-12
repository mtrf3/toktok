package X;

/* loaded from: classes6.dex */
public final class BXV extends BY9<BXW> {
    public C73495Sst LJLIL;

    @Override // X.BY9
    public final void detachView() {
        super.detachView();
        C73495Sst c73495Sst = this.LJLIL;
        if (c73495Sst != null) {
            c73495Sst.dispose();
        }
    }
}
