package X;

/* loaded from: classes15.dex */
public final class WOH implements InterfaceC82205WOb {
    public final /* synthetic */ WOD LIZ;

    @Override // X.InterfaceC82205WOb
    public final void close() {
        this.LIZ.LJLIL.close();
        onDismiss();
    }

    @Override // X.InterfaceC82205WOb
    public final void onDismiss() {
        WOF wof;
        WOD wod = this.LIZ;
        if (wod.mActivity != null && (wof = wod.LJLJI) != null && !wof.LJLJJLL) {
            wod.LJLIL.LIZLLL(false);
        }
    }

    public WOH(WOD wod) {
        this.LIZ = wod;
    }
}
