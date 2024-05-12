package X;

/* renamed from: X.VtB, reason: case insensitive filesystem */
/* loaded from: classes15.dex */
public class C81157VtB implements InterfaceC57255MdX {
    public final /* synthetic */ C81155Vt9 LJLIL;

    @Override // X.InterfaceC57255MdX
    public final int LIZ() {
        return 2;
    }

    public C81157VtB(C81155Vt9 c81155Vt9) {
        this.LJLIL = c81155Vt9;
    }

    @Override // X.InterfaceC57255MdX
    public final void LIZIZ(int i) {
        C81155Vt9 c81155Vt9 = this.LJLIL;
        if (c81155Vt9.LJLJLLL == 0) {
            if (i == 0) {
                c81155Vt9.invalidate();
            } else {
                c81155Vt9.postInvalidateDelayed(i);
            }
        }
    }
}
