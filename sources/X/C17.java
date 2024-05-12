package X;

import Y.ARunnableS41S0100000_5;
import android.graphics.drawable.Animatable;
import android.view.View;
import kotlin.jvm.internal.o;

/* loaded from: classes6.dex */
public final class C17 extends C31073CHl {
    public final /* synthetic */ C16 LJLJL;

    @Override // X.C31073CHl
    public final void LJFF() {
        this.LJLJL.LIZLLL = true;
    }

    public C17(C16 c16) {
        this.LJLJL = c16;
    }

    @Override // X.C31073CHl
    public final void LJI(Animatable anim) {
        o.LJIIIZ(anim, "anim");
        C29306Beo.LJI((View) this.LJLJL.LJFF.getValue());
    }

    @Override // X.C31073CHl
    public final void LJII(Animatable anim) {
        o.LJIIIZ(anim, "anim");
        C47061t0 LJII = this.LJLJL.LJII();
        if (LJII != null) {
            LJII.postDelayed(new ARunnableS41S0100000_5(this.LJLJL, 14), 200L);
        }
    }
}
