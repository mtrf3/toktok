package X;

import android.view.View;
import com.ss.android.ugc.effectmanager.effect.model.Effect;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.internal.o;

/* renamed from: X.I8m, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C46128I8m extends AbstractViewOnClickListenerC81978WFi {
    public final /* synthetic */ C46127I8l LJLJJLL;
    public final /* synthetic */ C29S LJLJL;

    @Override // X.AbstractViewOnClickListenerC81978WFi
    public final void LIZ(View v) {
        C46127I8l c46127I8l;
        Effect effect;
        I0N i0n;
        TEZ LLLLL;
        o.LJIIIZ(v, "v");
        C46127I8l c46127I8l2 = this.LJLJJLL;
        if (c46127I8l2.LJLLILLLL) {
            TMB tmb = C82890Wg2.LJFF;
            C29S c29s = this.LJLJL;
            tmb.getClass();
            TMB.LIZJ(R.string.e0_, 0, c29s).LIZ();
            return;
        }
        I0N i0n2 = c46127I8l2.LJLIL;
        if (i0n2 != null && (LLLLL = i0n2.LLLLL()) != null) {
            LLLLL.LJJIJIIJI(System.currentTimeMillis());
        }
        C60903NvH.LJIIJJI().LJJI().sceneReport("click_prop_panel");
        if ((!C53558L0g.LIZ() || !C53558L0g.LIZIZ().supportHoldEffectOnExit) && (effect = (c46127I8l = this.LJLJJLL).LJLJJLL) != null) {
            I0N i0n3 = c46127I8l.LJLIL;
            if ((i0n3 == null || C82398WVm.LIZJ(i0n3) == null) && (i0n = c46127I8l.LJLIL) != null) {
                C82398WVm.LJII(i0n, effect, null);
            }
            c46127I8l.LJLJJLL = null;
        }
        if (C53558L0g.LIZ()) {
            ((InterfaceC45925I0r) this.LJLJJLL.LJLJJI.LJ(InterfaceC45925I0r.class, null)).l10(true, false);
        } else {
            ((I9W) this.LJLJJLL.LJLJJI.LJ(I0N.class, null)).W90(true, "click_effect");
        }
        I3Q.LIZ(I3P.STICKER_ENTRANCE);
        this.LJLJJLL.LJLJJL.invoke();
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C46128I8m(C46127I8l c46127I8l, C29S c29s) {
        super(0, 3);
        this.LJLJJLL = c46127I8l;
        this.LJLJL = c29s;
    }
}
