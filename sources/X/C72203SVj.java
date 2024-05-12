package X;

import android.app.Activity;
import android.app.Dialog;
import android.view.ViewGroup;
import kotlin.jvm.internal.AqS116S0300000_12;
import kotlin.jvm.internal.AqS143S0200000_12;
import kotlin.jvm.internal.o;

/* renamed from: X.SVj, reason: case insensitive filesystem */
/* loaded from: classes13.dex */
public final class C72203SVj extends C72201SVh<C8V0, C72207SVn> {
    public C72205SVl LJLL;

    @Override // X.S1E
    public final S1E clone() {
        return new C72203SVj();
    }

    @Override // X.HSS, X.S1E
    public final int type() {
        return EnumC42934Gt8.ANCHOR_MOVIETOK.getTYPE();
    }

    @Override // X.C72201SVh
    public final void LJJJJJ(C72207SVn c72207SVn) {
        Boolean valueOf;
        LJJJJIZL(new AqS143S0200000_12(c72207SVn, (C72207SVn) this, (C72201SVh<InterfaceC72202SVi, C72207SVn>) 85));
        LJJJJL().LJII(this.LJLL);
        String LJIIIIZZ = LJJJJL().LJIIIIZZ(this.LJLJJL);
        boolean LIZIZ = LJJJJL().LIZIZ(this.LJLJJL);
        c72207SVn.setId(LJIIIIZZ);
        if (LJJJJL().LJIIJ(LJIIIIZZ) != null) {
            valueOf = LJJJJL().LJIIJ(LJIIIIZZ);
        } else {
            valueOf = Boolean.valueOf(LIZIZ);
        }
        if (valueOf != null) {
            c72207SVn.LJ(valueOf.booleanValue());
        }
        this.LJLL = new C72205SVl(c72207SVn);
        LJJJJL().LJIIL(this.LJLL);
    }

    @Override // X.C72201SVh, X.HSW, X.S1E
    public final void LJIJ(Activity activity, Dialog dialog) {
        o.LJIIIZ(activity, "activity");
        o.LJIIIZ(dialog, "dialog");
        super.LJIJ(activity, dialog);
        if (!dialog.isShowing()) {
            LJJJJL().LJII(this.LJLL);
        }
    }

    @Override // X.C72201SVh, X.HSS, X.S1E
    public final void LJIIJ(ViewGroup viewGroup, Dialog dialog, C188727au c188727au, int i) {
        o.LJIIIZ(dialog, "dialog");
        LJJJJIZL(new AqS116S0300000_12(this, viewGroup, c188727au, 27));
    }
}
