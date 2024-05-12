package X;

import android.content.Intent;
import android.view.KeyEvent;

/* renamed from: X.Zk7, reason: case insensitive filesystem */
/* loaded from: classes29.dex */
public final class C90787Zk7 extends AbstractC007001a {
    public final /* synthetic */ C90788Zk8 LJFF;

    @Override // X.AbstractC007001a
    public final void LIZJ() {
        this.LJFF.LJIIIIZZ.LJIJJ();
    }

    @Override // X.AbstractC007001a
    public final void LIZLLL() {
        this.LJFF.LJIIIIZZ.LJIJJ();
    }

    public C90787Zk7(C90788Zk8 c90788Zk8) {
        this.LJFF = c90788Zk8;
    }

    @Override // X.AbstractC007001a
    public final boolean LIZIZ(Intent intent) {
        KeyEvent keyEvent = (KeyEvent) intent.getParcelableExtra("android.intent.extra.KEY_EVENT");
        if (keyEvent != null) {
            if (keyEvent.getKeyCode() == 127 || keyEvent.getKeyCode() == 126) {
                this.LJFF.LJIIIIZZ.LJIJJ();
                return true;
            }
            return true;
        }
        return true;
    }

    @Override // X.AbstractC007001a
    public final void LJ(long j) {
        ZWW zww = new ZWW();
        ZWY zwy = new ZWY(j, zww.LIZ, zww.LIZIZ);
        C90639Zhj c90639Zhj = this.LJFF.LJIIIIZZ;
        c90639Zhj.getClass();
        QH7.LJ("Must be called from the main thread.");
        if (!c90639Zhj.LJJIII()) {
            C90639Zhj.LJIJJLI();
        } else {
            C90639Zhj.LJJIIJ(new C90931ZmR(c90639Zhj, zwy));
        }
    }
}
