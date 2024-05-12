package X;

import Y.ALAdapterS4S0200000_5;
import android.graphics.PointF;
import java.util.HashSet;
import kotlin.jvm.internal.o;

/* renamed from: X.BmR, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C29779BmR extends AbstractC29781BmT {
    public final HashSet<C29701Eo> LIZ = new HashSet<>();
    public final /* synthetic */ C29778BmQ LIZIZ;

    public C29779BmR(C29778BmQ c29778BmQ) {
        this.LIZIZ = c29778BmQ;
    }

    public final void LIZ(C29701Eo c29701Eo, PointF pointF) {
        c29701Eo.setVisibility(0);
        c29701Eo.setX(pointF.x);
        c29701Eo.setY(pointF.y);
        ALAdapterS4S0200000_5 aLAdapterS4S0200000_5 = new ALAdapterS4S0200000_5(this, c29701Eo, 24);
        InterfaceC92693kP LJJI = AbstractC73638SvC.LJI(new C29780BmS(c29701Eo, aLAdapterS4S0200000_5)).LJIIIZ(new C29777BmP(c29701Eo, aLAdapterS4S0200000_5, this)).LJJI();
        C73318Sq2 cb = this.LIZIZ.LJIIL;
        o.LJIIIZ(cb, "cb");
        cb.LIZ(LJJI);
    }
}
