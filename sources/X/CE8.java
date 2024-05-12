package X;

import android.graphics.drawable.Animatable;
import kotlin.jvm.internal.o;

/* loaded from: classes6.dex */
public final class CE8 extends C31073CHl {
    public final /* synthetic */ C31563Ca7 LJLJL;

    @Override // X.C31073CHl
    public final void LJFF() {
        this.LJLJL.LJZ.setVisibility(0);
    }

    public CE8(C31563Ca7 c31563Ca7) {
        this.LJLJL = c31563Ca7;
    }

    @Override // X.C31073CHl
    public final void LJII(Animatable anim) {
        o.LJIIIZ(anim, "anim");
        this.LJLJL.LJZ.setVisibility(8);
    }
}
