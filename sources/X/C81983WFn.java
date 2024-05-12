package X;

import android.view.View;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.internal.o;

/* renamed from: X.WFn, reason: case insensitive filesystem */
/* loaded from: classes15.dex */
public final class C81983WFn implements InterfaceC81972WFc {
    public final /* synthetic */ WI6 LIZ;

    @Override // X.InterfaceC81972WFc
    public final void LIZIZ(C81975WFf c81975WFf) {
    }

    @Override // X.InterfaceC81972WFc
    public final boolean LIZJ(C81975WFf c81975WFf) {
        return false;
    }

    public C81983WFn(WI6 wi6) {
        this.LIZ = wi6;
    }

    @Override // X.InterfaceC81972WFc
    public final void LIZ(C81975WFf c81975WFf) {
        if (c81975WFf.LJZ) {
            C5S1 c5s1 = new C5S1(this.LIZ.LIZ());
            c5s1.LIZLLL(this.LIZ.LIZ().getResources().getString(R.string.pvm));
            c5s1.LJ();
        }
    }

    @Override // X.InterfaceC81972WFc
    public final void LIZLLL(View view, C81975WFf c81975WFf) {
        o.LJIIIZ(view, "view");
        if (C76917UGr.LJLIL) {
            return;
        }
        this.LIZ.LIZIZ().Gm0(false);
        this.LIZ.LIZIZ().z6(false, C83728WtY.LIZIZ.LIZIZ(EnumC83729WtZ.FTC_SWITCH_CAMERA_TOOL_BAR, null), null);
    }
}
