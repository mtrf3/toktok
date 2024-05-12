package X;

import android.view.View;

/* loaded from: classes9.dex */
public final class JK2 implements JGS {
    public final /* synthetic */ ViewOnAttachStateChangeListenerC48975JJz LIZ;

    @Override // X.JGS
    public final void LIZJ() {
    }

    @Override // X.JGS
    public final Boolean LIZ() {
        JK3 jk3 = this.LIZ.LJLLI;
        if (jk3 != null) {
            return Boolean.valueOf(jk3.LIZ());
        }
        return null;
    }

    @Override // X.JGS
    public final void LIZIZ() {
        JK3 jk3;
        ViewOnAttachStateChangeListenerC48975JJz viewOnAttachStateChangeListenerC48975JJz = this.LIZ;
        if (viewOnAttachStateChangeListenerC48975JJz.LJLLILLLL != 1 && (jk3 = viewOnAttachStateChangeListenerC48975JJz.LJLLI) != null) {
            jk3.LJIIZILJ();
        }
    }

    @Override // X.JGS
    public final void LIZLLL() {
        JK3 jk3 = this.LIZ.LJLLI;
        if (jk3 != null) {
            jk3.LJJIIJZLJL();
        }
        this.LIZ.LJZ.setVisibility(8);
    }

    @Override // X.JGS
    public final View LJ() {
        return this.LIZ.LJLJLJ;
    }

    @Override // X.JGS
    public final void LJFF() {
        JK3 jk3 = this.LIZ.LJLLI;
        if (jk3 != null) {
            jk3.LJIIIIZZ();
        }
        this.LIZ.LJZ.setVisibility(0);
    }

    @Override // X.JGS
    public final void LJLLJ() {
        JK3 jk3 = this.LIZ.LJLLI;
        if (jk3 != null) {
            jk3.LJI();
        }
    }

    public JK2(ViewOnAttachStateChangeListenerC48975JJz viewOnAttachStateChangeListenerC48975JJz) {
        this.LIZ = viewOnAttachStateChangeListenerC48975JJz;
    }
}
