package X;

import android.app.Activity;
import android.app.Dialog;
import kotlin.jvm.internal.AqS143S0200000_12;
import kotlin.jvm.internal.o;

/* renamed from: X.SVk, reason: case insensitive filesystem */
/* loaded from: classes13.dex */
public final class C72204SVk extends C72201SVh<InterfaceC212338Uz, C72207SVn> {
    public C72206SVm LJLL;

    @Override // X.S1E
    public final S1E clone() {
        return new C72204SVk();
    }

    @Override // X.HSS, X.S1E
    public final int type() {
        return EnumC42934Gt8.ANCHOR_BOOKTOK.getTYPE();
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
        this.LJLL = new C72206SVm(c72207SVn);
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
}
