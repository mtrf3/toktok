package X;

/* renamed from: X.Wqe, reason: case insensitive filesystem */
/* loaded from: classes15.dex */
public class C83548Wqe implements InterfaceC83564Wqu {
    public final /* synthetic */ C83546Wqc LJLIL;

    @Override // X.InterfaceC83564Wqu
    public final void keyBoardModify(int i) {
    }

    public C83548Wqe(C83546Wqc c83546Wqc) {
        this.LJLIL = c83546Wqc;
    }

    @Override // X.InterfaceC83564Wqu
    public final void keyBoardHide(int i) {
        C83546Wqc c83546Wqc = this.LJLIL;
        if (c83546Wqc.LJI) {
            c83546Wqc.LJI = false;
            C83551Wqh c83551Wqh = c83546Wqc.LIZ;
            if (c83551Wqh != null) {
                this.LJLIL.LJ(c83551Wqh.getText());
                this.LJLIL.LIZ.setVisibility(8);
                this.LJLIL.LIZ.setText("");
                this.LJLIL.LIZ();
            }
            InterfaceC83561Wqr interfaceC83561Wqr = this.LJLIL.LIZJ;
            if (interfaceC83561Wqr != null) {
                interfaceC83561Wqr.LLIIIILZ();
            }
            InterfaceC83566Wqw interfaceC83566Wqw = this.LJLIL.LJ;
            if (interfaceC83566Wqw != null) {
                interfaceC83566Wqw.LIZ(false);
            }
        }
    }

    @Override // X.InterfaceC83564Wqu
    public final void keyBoardShow(int i) {
        C83546Wqc c83546Wqc = this.LJLIL;
        if (c83546Wqc.LJI) {
            C83551Wqh c83551Wqh = c83546Wqc.LIZ;
            if (c83551Wqh != null) {
                c83551Wqh.LIZLLL();
                this.LJLIL.LIZ.LJ(i);
            }
            InterfaceC83566Wqw interfaceC83566Wqw = this.LJLIL.LJ;
            if (interfaceC83566Wqw != null) {
                interfaceC83566Wqw.LIZ(true);
            }
        }
    }
}
