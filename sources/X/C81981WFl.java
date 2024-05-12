package X;

import android.view.View;
import com.ss.android.ugc.effectmanager.effect.model.Effect;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.internal.o;

/* renamed from: X.WFl, reason: case insensitive filesystem */
/* loaded from: classes15.dex */
public final class C81981WFl implements InterfaceC81972WFc {
    public final /* synthetic */ WID LIZ;

    @Override // X.InterfaceC81972WFc
    public final void LIZIZ(C81975WFf c81975WFf) {
    }

    @Override // X.InterfaceC81972WFc
    public final boolean LIZJ(C81975WFf c81975WFf) {
        return false;
    }

    public C81981WFl(WID wid) {
        this.LIZ = wid;
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
        Effect effect;
        TEZ LLLLL;
        o.LJIIIZ(view, "view");
        if (C76917UGr.LJLIL) {
            return;
        }
        I9W i9w = (I9W) this.LIZ.LJJIIZ.getValue();
        if (i9w != null && (LLLLL = i9w.LLLLL()) != null) {
            effect = LLLLL.LLJJIJIIJIL();
        } else {
            effect = null;
        }
        if (V3N.LJIL(effect)) {
            this.LIZ.LIZJ().qm0();
        } else {
            this.LIZ.LIZJ().Gm0(false);
            this.LIZ.LIZJ().z6(false, C83728WtY.LIZIZ.LIZIZ(EnumC83729WtZ.SWITCH_CAMERA_TOOL_BAR_DEFAULT, null), null);
        }
    }
}
