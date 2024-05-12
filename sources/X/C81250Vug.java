package X;

import X.InterfaceC81253Vuj;
import android.graphics.drawable.Drawable;
import android.view.MotionEvent;

/* renamed from: X.Vug, reason: case insensitive filesystem */
/* loaded from: classes15.dex */
public class C81250Vug<DH extends InterfaceC81253Vuj> implements InterfaceC81035VrD {
    public boolean LIZ;
    public boolean LIZIZ;
    public boolean LIZJ = true;
    public DH LIZLLL;
    public InterfaceC81252Vui LJ;
    public final C81249Vuf LJFF;

    public final void LIZ() {
        if (this.LIZ) {
            return;
        }
        this.LJFF.LIZ(EnumC81251Vuh.ON_ATTACH_CONTROLLER);
        this.LIZ = true;
        InterfaceC81252Vui interfaceC81252Vui = this.LJ;
        if (interfaceC81252Vui != null && interfaceC81252Vui.LIZJ() != null) {
            this.LJ.onAttach();
        }
    }

    public final void LIZIZ() {
        if (this.LIZIZ && this.LIZJ) {
            LIZ();
            return;
        }
        if (!this.LIZ) {
            return;
        }
        this.LJFF.LIZ(EnumC81251Vuh.ON_DETACH_CONTROLLER);
        this.LIZ = false;
        if (!LIZLLL()) {
            return;
        }
        this.LJ.onDetach();
    }

    public Drawable LIZJ() {
        DH dh = this.LIZLLL;
        if (dh == null) {
            return null;
        }
        return dh.LIZ();
    }

    public final boolean LIZLLL() {
        InterfaceC81252Vui interfaceC81252Vui = this.LJ;
        if (interfaceC81252Vui != null && interfaceC81252Vui.LIZJ() == this.LIZLLL) {
            return true;
        }
        return false;
    }

    public void LJ() {
        this.LJFF.LIZ(EnumC81251Vuh.ON_HOLDER_ATTACH);
        this.LIZIZ = true;
        LIZIZ();
    }

    public void LJFF() {
        this.LJFF.LIZ(EnumC81251Vuh.ON_HOLDER_DETACH);
        this.LIZIZ = false;
        LIZIZ();
    }

    public final String toString() {
        C81254Vuk LIZIZ = C81256Vum.LIZIZ(this);
        LIZIZ.LIZ("controllerAttached", this.LIZ);
        LIZIZ.LIZ("holderAttached", this.LIZIZ);
        LIZIZ.LIZ("drawableVisible", this.LIZJ);
        LIZIZ.LIZIZ(this.LJFF.toString(), "events");
        return LIZIZ.toString();
    }

    public C81250Vug(V92 v92) {
        C81249Vuf c81249Vuf;
        if (C81249Vuf.LIZJ) {
            c81249Vuf = new C81249Vuf();
        } else {
            c81249Vuf = C81249Vuf.LIZIZ;
        }
        this.LJFF = c81249Vuf;
        if (v92 != null) {
            LJIIIIZZ(v92);
        }
    }

    public final boolean LJI(MotionEvent motionEvent) {
        if (!LIZLLL()) {
            return false;
        }
        return this.LJ.LJIIIIZZ(motionEvent);
    }

    public final void LJII(InterfaceC81252Vui interfaceC81252Vui) {
        boolean z = this.LIZ;
        if (z) {
            this.LJFF.LIZ(EnumC81251Vuh.ON_DETACH_CONTROLLER);
            this.LIZ = false;
            if (LIZLLL()) {
                this.LJ.onDetach();
            }
        }
        if (LIZLLL()) {
            this.LJFF.LIZ(EnumC81251Vuh.ON_CLEAR_OLD_CONTROLLER);
            this.LJ.LIZIZ(null);
        }
        this.LJ = interfaceC81252Vui;
        if (interfaceC81252Vui != null) {
            this.LJFF.LIZ(EnumC81251Vuh.ON_SET_CONTROLLER);
            this.LJ.LIZIZ(this.LIZLLL);
        } else {
            this.LJFF.LIZ(EnumC81251Vuh.ON_CLEAR_CONTROLLER);
        }
        if (z) {
            LIZ();
        }
    }

    public final void LJIIIIZZ(DH dh) {
        boolean z;
        EnumC81251Vuh enumC81251Vuh;
        this.LJFF.LIZ(EnumC81251Vuh.ON_SET_HIERARCHY);
        boolean LIZLLL = LIZLLL();
        Object LIZJ = LIZJ();
        if (LIZJ instanceof InterfaceC81034VrC) {
            ((InterfaceC81034VrC) LIZJ).LJI(null);
        }
        dh.getClass();
        this.LIZLLL = dh;
        C81033VrB LIZ = dh.LIZ();
        if (LIZ == null || LIZ.isVisible()) {
            z = true;
        } else {
            z = false;
        }
        if (this.LIZJ != z) {
            C81249Vuf c81249Vuf = this.LJFF;
            if (z) {
                enumC81251Vuh = EnumC81251Vuh.ON_DRAWABLE_SHOW;
            } else {
                enumC81251Vuh = EnumC81251Vuh.ON_DRAWABLE_HIDE;
            }
            c81249Vuf.LIZ(enumC81251Vuh);
            this.LIZJ = z;
            LIZIZ();
        }
        Object LIZJ2 = LIZJ();
        if (LIZJ2 instanceof InterfaceC81034VrC) {
            ((InterfaceC81034VrC) LIZJ2).LJI(this);
        }
        if (LIZLLL) {
            this.LJ.LIZIZ(dh);
        }
    }
}
