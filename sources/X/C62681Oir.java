package X;

import Y.ACListenerS45S0200000_10;
import android.app.Dialog;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.internal.o;
import o3.IDaS469S0100000_10;
import o3.h0;

/* renamed from: X.Oir, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class C62681Oir implements InterfaceC62517OgD {
    public boolean LJLIL = true;
    public boolean LJLILLLLZI = true;

    @Override // X.InterfaceC62517OgD
    public final void LIZLLL(Dialog dialog) {
        o.LJIIIZ(dialog, "dialog");
    }

    @Override // X.InterfaceC62517OgD
    public final void LIZ(boolean z) {
        if (this.LJLIL != z) {
            this.LJLIL = z;
        }
    }

    @Override // X.InterfaceC62517OgD
    public final void LJ(boolean z) {
        if (z && !this.LJLIL) {
            this.LJLIL = true;
        }
        this.LJLILLLLZI = z;
    }

    @Override // X.InterfaceC62517OgD
    public final View LIZJ(Dialog dialog, int i, View view, ViewGroup.LayoutParams layoutParams, C25600zU c25600zU) {
        o.LJIIIZ(dialog, "dialog");
        LayoutInflater layoutInflater = dialog.getLayoutInflater();
        o.LJIIIIZZ(layoutInflater, "dialog.layoutInflater");
        if (c25600zU != null) {
            layoutInflater = C16880lQ.LLZIL(c25600zU);
        }
        View LLLZIIL = C16880lQ.LLLZIIL(i, layoutInflater, null);
        C16880lQ.LJIIJ(new ACListenerS45S0200000_10(this, dialog, 21), LLLZIIL.findViewById(R.id.dmv));
        View findViewById = LLLZIIL.findViewById(R.id.g69);
        if (findViewById != null) {
            h0.LJIJI(findViewById, new IDaS469S0100000_10(this, 4));
        }
        return LLLZIIL;
    }
}
