package X;

import android.view.View;
import com.bytedance.assem.arch.core.UIAssem;
import com.ss.android.ugc.aweme.bnpl.biz.credit.landing.LandingAssem;
import com.ss.android.ugc.aweme.bnpl.biz.credit.landing.LandingAssemVM;
import com.zhiliaoapp.musically.R;

/* renamed from: X.a7v, reason: case insensitive filesystem */
/* loaded from: classes20.dex */
public final class C92263a7v implements InterfaceC91796a0O {
    public final /* synthetic */ boolean LIZ;
    public final /* synthetic */ LandingAssem LIZIZ;
    public final /* synthetic */ UIAssem LIZJ;

    @Override // X.InterfaceC91796a0O
    public final void LIZ(int i) {
        View view = null;
        if (this.LIZ && i >= O6R.LJJIIZ(C32151Nz.LJIIZILJ(24))) {
            this.LIZIZ.x3(false);
            ActivityC45651qj LJIIIIZZ = C55096Ljo.LJIIIIZZ(this.LIZJ);
            if (LJIIIIZZ != null) {
                View containerView = this.LIZJ.getContainerView();
                if (containerView != null) {
                    view = containerView.findViewById(R.id.es);
                }
                ((C252709vu) view).setNavBackground(AnonymousClass636.LJIIIIZZ(R.attr.d4, LJIIIIZZ));
            }
            LandingAssemVM v3 = this.LIZIZ.v3();
            v3.getClass();
            v3.withState(new C92926aIc(v3, false));
            return;
        }
        if (this.LIZ || i > O6R.LJJIIZ(C32151Nz.LJIIZILJ(24))) {
            return;
        }
        this.LIZIZ.x3(true);
        View containerView2 = this.LIZJ.getContainerView();
        if (containerView2 != null) {
            view = containerView2.findViewById(R.id.es);
        }
        ((C252709vu) view).setNavBackground(0);
        LandingAssemVM v32 = this.LIZIZ.v3();
        v32.getClass();
        v32.withState(new C92926aIc(v32, true));
    }

    public C92263a7v(boolean z, LandingAssem landingAssem, UIAssem uIAssem) {
        this.LIZ = z;
        this.LIZIZ = landingAssem;
        this.LIZJ = uIAssem;
    }
}
