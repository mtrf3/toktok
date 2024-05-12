package X;

import android.app.Dialog;
import android.view.ViewGroup;
import kotlin.jvm.internal.AqS111S0300000_7;
import kotlin.jvm.internal.AqS173S0100000_7;
import kotlin.jvm.internal.o;

/* loaded from: classes8.dex */
public final class HS1 extends HSS {
    public final String LJLJLJ = AnonymousClass629.LIZ("randomUUID().toString()");

    @Override // X.HSS
    public final boolean LJJIJ() {
        return true;
    }

    @Override // X.HSS
    public final String LJJIJIL() {
        return "app_page";
    }

    @Override // X.S1E
    public final S1E clone() {
        return new HS1();
    }

    @Override // X.HSS, X.S1E
    public final int type() {
        return EnumC42934Gt8.PHOTO_MV_ANCHOR.getTYPE();
    }

    @Override // X.S1E
    public final void LJIIIIZZ(C188727au eventMapBuilder) {
        o.LJIIIZ(eventMapBuilder, "eventMapBuilder");
        LJJJJJ(eventMapBuilder);
    }

    public final void LJJJJJ(C188727au c188727au) {
        HSS.LJJIZ(this, c188727au, 4);
        I3W i3w = new I3W();
        i3w.LIZLLL = "anchor_combine_page";
        i3w.LJIILJJIL = "anchor_combine_mv";
        i3w.LJIILL = LJJII().getAid();
        i3w.LJII = this.LJLJLJ;
        i3w.LJIIZILJ = "upload";
        i3w.LJIILLIIL = "video";
        i3w.LJIILIIL();
        LJJJJIZL(new AqS173S0100000_7(this, 247));
    }

    @Override // X.HSS, X.S1E
    public final void LJIIJ(ViewGroup viewGroup, Dialog dialog, C188727au c188727au, int i) {
        o.LJIIIZ(dialog, "dialog");
        LJJJJIZL(new AqS111S0300000_7(viewGroup, this, c188727au, 20));
    }
}
