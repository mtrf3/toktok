package X;

import android.widget.FrameLayout;
import com.ss.android.ugc.effectmanager.effect.model.Effect;
import kotlin.jvm.internal.AqS164S0100000_14;
import kotlin.jvm.internal.AqS180S0100000_14;
import kotlin.jvm.internal.o;

/* renamed from: X.W1b, reason: case insensitive filesystem */
/* loaded from: classes15.dex */
public final class C81607W1b implements InterfaceC81592W0m, InterfaceC135635Tz {
    public final Effect LJLIL;
    public final C82622Wbi LJLILLLLZI;
    public final InterfaceC65784Pro<C76800UCe> LJLJI;
    public C81606W1a LJLJJI;
    public C81606W1a LJLJJL;

    @Override // X.InterfaceC81592W0m
    public final boolean isShowing() {
        C81606W1a c81606W1a;
        C81606W1a c81606W1a2 = this.LJLJJI;
        if ((c81606W1a2 == null || !c81606W1a2.LJLJLJ) && ((c81606W1a = this.LJLJJL) == null || !c81606W1a.LJLJLJ)) {
            return false;
        }
        return true;
    }

    @Override // X.InterfaceC135635Tz
    public final C82622Wbi getDiContainer() {
        return this.LJLILLLLZI;
    }

    @Override // X.InterfaceC81592W0m
    public final void LIZ(FrameLayout frameLayout) {
        C81606W1a c81606W1a;
        Effect effect = this.LJLIL;
        if (effect == null || frameLayout == null) {
            return;
        }
        if (this.LJLJJL == null && ID0.LJIILIIL(effect)) {
            if (V3N.LJIILLIIL(this.LJLIL)) {
                c81606W1a = new C81606W1a(this.LJLIL, this.LJLILLLLZI, 0, C81611W1f.LJLIL, new AqS180S0100000_14(this, 4));
            } else {
                c81606W1a = new C81606W1a(this.LJLIL, this.LJLILLLLZI, 0, new AqS164S0100000_14(this, 12), C81609W1d.LJLIL);
            }
            this.LJLJJL = c81606W1a;
        }
        if (this.LJLJJI == null && ID0.LJIJ(this.LJLIL)) {
            this.LJLJJI = new C81606W1a(this.LJLIL, this.LJLILLLLZI, 1, C81612W1g.LJLIL, new AqS180S0100000_14(this, 5));
        }
        C81606W1a c81606W1a2 = this.LJLJJI;
        if (c81606W1a2 == null) {
            return;
        }
        c81606W1a2.LIZ(frameLayout);
    }

    @Override // X.InterfaceC81592W0m
    public final void LJJLIIIJL(boolean z) {
        if (this.LJLIL == null) {
            return;
        }
        C81606W1a c81606W1a = this.LJLJJI;
        if (c81606W1a != null) {
            c81606W1a.LJJLIIIJL(z);
        }
        C81606W1a c81606W1a2 = this.LJLJJL;
        if (c81606W1a2 != null) {
            c81606W1a2.LJJLIIIJL(z);
        }
    }

    public C81607W1b(Effect effect, C82622Wbi diContainer, AqS164S0100000_14 aqS164S0100000_14) {
        o.LJIIIZ(diContainer, "diContainer");
        this.LJLIL = effect;
        this.LJLILLLLZI = diContainer;
        this.LJLJI = aqS164S0100000_14;
    }
}
