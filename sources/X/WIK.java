package X;

import android.view.View;
import androidx.lifecycle.LiveData;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.internal.o;

/* loaded from: classes15.dex */
public final class WIK implements InterfaceC81972WFc {
    public final /* synthetic */ WID LIZ;

    @Override // X.InterfaceC81972WFc
    public final void LIZ(C81975WFf c81975WFf) {
    }

    @Override // X.InterfaceC81972WFc
    public final void LIZIZ(C81975WFf c81975WFf) {
    }

    @Override // X.InterfaceC81972WFc
    public final boolean LIZJ(C81975WFf c81975WFf) {
        return false;
    }

    public WIK(WID wid) {
        this.LIZ = wid;
    }

    @Override // X.InterfaceC81972WFc
    public final void LIZLLL(View view, C81975WFf c81975WFf) {
        Boolean bool;
        int i;
        LiveData<EnumC82072WIy> state;
        o.LJIIIZ(view, "view");
        WIL LJIIIZ = this.LIZ.LJIIIZ();
        EnumC82072WIy enumC82072WIy = null;
        if (LJIIIZ != null) {
            bool = Boolean.valueOf(LJIIIZ.Yb0());
        } else {
            bool = null;
        }
        WIL LJIIIZ2 = this.LIZ.LJIIIZ();
        if (LJIIIZ2 != null) {
            LJIIIZ2.BK(o.LJ(bool, Boolean.TRUE));
        }
        if (this.LIZ.LJIIZILJ()) {
            c81975WFf.LJLJLLL = o.LJ(bool, Boolean.TRUE);
        } else {
            if (o.LJ(bool, Boolean.TRUE)) {
                i = R.drawable.b74;
            } else {
                i = R.drawable.b73;
            }
            c81975WFf.LJLILLLLZI = i;
        }
        boolean z = true;
        c81975WFf.LJLLLL = true;
        WIL LJIIIZ3 = this.LIZ.LJIIIZ();
        if (LJIIIZ3 != null) {
            WIL LJIIIZ4 = this.LIZ.LJIIIZ();
            if (LJIIIZ4 != null && (state = LJIIIZ4.getState()) != null) {
                enumC82072WIy = state.getValue();
            }
            if (enumC82072WIy != EnumC82072WIy.ON) {
                z = false;
            }
            LJIIIZ3.yt(z);
        }
    }
}
