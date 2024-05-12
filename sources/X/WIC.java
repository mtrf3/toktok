package X;

import android.view.View;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.internal.o;

/* loaded from: classes15.dex */
public final class WIC implements InterfaceC81972WFc {
    public boolean LIZ;
    public final /* synthetic */ WI6 LIZIZ;

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

    public WIC(boolean z, WI6 wi6) {
        this.LIZIZ = wi6;
        this.LIZ = z;
    }

    @Override // X.InterfaceC81972WFc
    public final void LIZLLL(View view, C81975WFf c81975WFf) {
        o.LJIIIZ(view, "view");
        boolean z = true;
        this.LIZ = !this.LIZ;
        I37 i37 = (I37) this.LIZIZ.LIZ.LJ(I37.class, null);
        boolean z2 = this.LIZ;
        if (C86798Y4s.LIZJ() != R.string.rtw) {
            z = false;
        }
        i37.tk0(z2, z);
        c81975WFf.LJLJLLL = this.LIZ;
        ((InterfaceC82053WIf) this.LIZIZ.LIZ.LJ(InterfaceC82053WIf.class, null)).LL(c81975WFf);
    }
}
