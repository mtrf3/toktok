package X;

import android.widget.FrameLayout;
import com.ss.android.ugc.effectmanager.effect.model.Effect;
import kotlin.jvm.internal.o;

/* renamed from: X.W0j, reason: case insensitive filesystem */
/* loaded from: classes15.dex */
public final class C81589W0j {
    public final FrameLayout LIZ;
    public final InterfaceC81587W0h LIZIZ;
    public InterfaceC81592W0m LIZJ;
    public Effect LIZLLL;

    public C81589W0j(FrameLayout frameLayout) {
        C81586W0g c81586W0g = new C81586W0g();
        this.LIZ = frameLayout;
        this.LIZIZ = c81586W0g;
    }

    public final void LIZ(Effect effect) {
        InterfaceC81592W0m interfaceC81592W0m = this.LIZJ;
        if (interfaceC81592W0m != null) {
            interfaceC81592W0m.LJJLIIIJL(false);
        }
        if (effect == null || o.LJ(effect, this.LIZLLL)) {
            return;
        }
        this.LIZLLL = effect;
        InterfaceC81592W0m LIZ = this.LIZIZ.LIZ(effect);
        this.LIZJ = LIZ;
        if (LIZ != null) {
            LIZ.LIZ(this.LIZ);
        }
    }
}
