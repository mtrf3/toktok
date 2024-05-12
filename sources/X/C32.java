package X;

import android.graphics.drawable.Animatable;
import android.widget.FrameLayout;
import kotlin.jvm.internal.o;

/* loaded from: classes6.dex */
public final class C32 extends C31073CHl {
    public final /* synthetic */ C30695C2x LJLJL;

    public C32(C30695C2x c30695C2x) {
        this.LJLJL = c30695C2x;
    }

    @Override // X.C31073CHl
    public final void LJII(Animatable anim) {
        o.LJIIIZ(anim, "anim");
        FrameLayout frameLayout = this.LJLJL.LIZJ;
        if (frameLayout == null) {
            return;
        }
        frameLayout.setClickable(false);
    }
}
