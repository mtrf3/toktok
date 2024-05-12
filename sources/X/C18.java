package X;

import Y.ARunnableS41S0100000_5;
import android.graphics.drawable.Animatable;
import kotlin.jvm.internal.o;

/* loaded from: classes6.dex */
public final class C18 extends C31073CHl {
    public final /* synthetic */ C16 LJLJL;

    @Override // X.C31073CHl
    public final void LJFF() {
        this.LJLJL.LJ = true;
    }

    public C18(C16 c16) {
        this.LJLJL = c16;
    }

    @Override // X.C31073CHl
    public final void LJI(Animatable anim) {
        o.LJIIIZ(anim, "anim");
        C47061t0 LJI = this.LJLJL.LJI();
        if (LJI == null) {
            return;
        }
        LJI.setVisibility(0);
    }

    @Override // X.C31073CHl
    public final void LJII(Animatable anim) {
        o.LJIIIZ(anim, "anim");
        C47061t0 LJI = this.LJLJL.LJI();
        if (LJI != null) {
            LJI.postDelayed(new ARunnableS41S0100000_5(this.LJLJL, 15), 200L);
        }
    }
}
