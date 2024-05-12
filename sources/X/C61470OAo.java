package X;

/* renamed from: X.OAo, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class C61470OAo implements InterfaceC73307Spr {
    public final /* synthetic */ C61469OAn LIZ;

    @Override // X.InterfaceC73307Spr
    public final void hide() {
        C223338pd c223338pd = this.LIZ.LJLIL;
        if (c223338pd != null) {
            c223338pd.LIZJ();
        }
        C223338pd c223338pd2 = this.LIZ.LJLIL;
        if (c223338pd2 == null) {
            return;
        }
        c223338pd2.setVisibility(8);
    }

    @Override // X.InterfaceC73307Spr
    public final void show() {
        C223338pd c223338pd = this.LIZ.LJLIL;
        if (c223338pd != null) {
            c223338pd.LIZIZ();
        }
        C223338pd c223338pd2 = this.LIZ.LJLIL;
        if (c223338pd2 == null) {
            return;
        }
        c223338pd2.setVisibility(0);
    }

    public C61470OAo(C61469OAn c61469OAn) {
        this.LIZ = c61469OAn;
    }
}
