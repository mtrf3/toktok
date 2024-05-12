package X;

/* loaded from: classes8.dex */
public final class G5R implements InterfaceC46109I7t {
    public final /* synthetic */ C40984G6q LJLIL;

    @Override // X.InterfaceC46109I7t
    public final boolean LJIIIZ() {
        AEY aey;
        C40984G6q c40984G6q = this.LJLIL;
        if (c40984G6q == null) {
            return false;
        }
        AI8 ai8 = c40984G6q.LJIILJJIL;
        AI9 ai9 = null;
        if (ai8 != null) {
            ai9 = ai8.getAccessory();
        }
        if (!(ai9 instanceof AI2) || (aey = (AEY) ai9) == null || !aey.LJIIL()) {
            return false;
        }
        return true;
    }

    @Override // X.InterfaceC46109I7t
    public final boolean isEnabled() {
        C40984G6q c40984G6q = this.LJLIL;
        if (c40984G6q == null || !c40984G6q.LJIILL) {
            return false;
        }
        return true;
    }

    public G5R(C40984G6q c40984G6q) {
        this.LJLIL = c40984G6q;
    }
}
