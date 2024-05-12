package X;

import android.text.TextUtils;
import android.view.View;
import kotlin.jvm.internal.o;

/* loaded from: classes9.dex */
public final class JUN implements InterfaceC32188CkC {
    public final /* synthetic */ JUK LJLIL;

    @Override // X.InterfaceC32188CkC
    public final boolean LIZ() {
        return false;
    }

    @Override // X.InterfaceC32188CkC
    public final boolean LIZLLL() {
        return false;
    }

    @Override // X.InterfaceC32188CkC
    public final void LJII(C28272B7s c28272B7s) {
    }

    @Override // X.InterfaceC32188CkC
    public final void LJIIIZ() {
        this.LJLIL.getStatusDelegate().LIZIZ();
    }

    @Override // X.InterfaceC32188CkC
    public final void LLLZL() {
        this.LJLIL.getStatusDelegate().LIZJ();
        this.LJLIL.LJ();
    }

    public JUN(JUK juk) {
        this.LJLIL = juk;
    }

    @Override // X.InterfaceC32188CkC
    public final void LJI(String s) {
        o.LJIIIZ(s, "s");
        this.LJLIL.getStatusDelegate().LIZJ();
    }

    @Override // X.InterfaceC32188CkC
    public final void LJIIIIZZ(String s) {
        o.LJIIIZ(s, "s");
        this.LJLIL.LJIIIZ();
    }

    @Override // X.InterfaceC32188CkC
    public final void LJIIJJI(String str) {
        this.LJLIL.LJI(str);
    }

    @Override // X.InterfaceC32188CkC
    public final void LJIIL(String s) {
        o.LJIIIZ(s, "s");
        if (!TextUtils.isEmpty(s)) {
            this.LJLIL.LIZLLL(s);
        }
    }

    @Override // X.InterfaceC32188CkC
    public final void LIZJ(EnumC79342VBy message, Object obj) {
        o.LJIIIZ(message, "message");
        if (message == EnumC79342VBy.COMPLETE_PLAY) {
            this.LJLIL.LJIIIZ();
        }
    }

    @Override // X.InterfaceC32188CkC
    public final void LJIIJ(int i, int i2, View view) {
        this.LJLIL.LJII(i, i2, view);
    }
}
