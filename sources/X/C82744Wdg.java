package X;

/* renamed from: X.Wdg, reason: case insensitive filesystem */
/* loaded from: classes15.dex */
public final class C82744Wdg implements GHB {
    public final /* synthetic */ C82742Wde LJLIL;

    public C82744Wdg(C82742Wde c82742Wde) {
        this.LJLIL = c82742Wde;
    }

    @Override // X.GHB
    public final boolean onBackPressed() {
        this.LJLIL.getUiActions().LIZLLL.invoke();
        return true;
    }
}
