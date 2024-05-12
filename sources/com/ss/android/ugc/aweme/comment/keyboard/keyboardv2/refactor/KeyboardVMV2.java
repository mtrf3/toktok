package com.ss.android.ugc.aweme.comment.keyboard.keyboardv2.refactor;

import X.AbstractC177926ya;
import X.C177616y5;
import X.C177836yR;
import X.C177866yU;
import X.C177876yV;
import X.C177916yZ;
import X.C71Y;
import X.X1D;
import com.bytedance.assem.arch.viewModel.AssemViewModel;
import kotlin.jvm.internal.AqS27S0210000_3;
import kotlin.jvm.internal.AqS46S0110000_3;
import kotlin.jvm.internal.AqS8S0010000_3;
import kotlin.jvm.internal.o;

/* loaded from: classes4.dex */
public final class KeyboardVMV2 extends AssemViewModel<C177616y5> {
    public static final C177866yU LJLIL = new Object() { // from class: X.6yU
    };

    @Override // com.bytedance.assem.arch.viewModel.AssemViewModel
    public final C177616y5 defaultState() {
        return new C177616y5(0);
    }

    public final AbstractC177926ya gv0() {
        return getState().LJLJJI;
    }

    public final void jv0(boolean z) {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("updateGiftStatus = ");
        LIZ.append(z);
        C71Y.LIZ("PhotoComment", X1D.LIZIZ(LIZ));
        setState(new AqS8S0010000_3(z, 12));
    }

    public final void kv0(boolean z) {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("set hasPhoto: ");
        LIZ.append(z);
        C71Y.LIZ("PhotoComment", X1D.LIZIZ(LIZ));
        setState(new AqS8S0010000_3(z, 13));
    }

    public final void hv0(boolean z, C177616y5 c177616y5) {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("notifyOffScreen ");
        LIZ.append(z);
        LIZ.append(' ');
        LIZ.append(c177616y5.LJLJJI);
        C71Y.LIZLLL("KeyboardVM", X1D.LIZIZ(LIZ));
        if (o.LJ(c177616y5.LJLJJI, C177916yZ.LIZ)) {
            return;
        }
        if (z) {
            AbstractC177926ya abstractC177926ya = c177616y5.LJLJJI;
            C177876yV c177876yV = C177876yV.LIZ;
            if (o.LJ(abstractC177926ya, c177876yV)) {
                return;
            }
            c177876yV.getClass();
            C177876yV.LIZIZ = abstractC177926ya;
            iv0(c177876yV, true);
            return;
        }
        AbstractC177926ya abstractC177926ya2 = c177616y5.LJLJJI;
        if (!(abstractC177926ya2 instanceof C177876yV)) {
            return;
        }
        abstractC177926ya2.getClass();
        AbstractC177926ya abstractC177926ya3 = C177876yV.LIZIZ;
        if (abstractC177926ya3 == null) {
            return;
        }
        iv0(abstractC177926ya3, false);
    }

    public final void iv0(AbstractC177926ya panel, boolean z) {
        o.LJIIIZ(panel, "panel");
        withState(new AqS27S0210000_3(panel, this, z, 1));
    }

    public final void lv0(int i, boolean z) {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("updateSoftKeyboardState ");
        LIZ.append(z);
        LIZ.append("  ");
        LIZ.append(i);
        LIZ.append(' ');
        C71Y.LIZLLL("xjccccc", X1D.LIZIZ(LIZ));
        if (!z) {
            withState(new AqS46S0110000_3(this, z, 9));
        } else {
            withState(new C177836yR(this, z, i));
        }
    }
}
