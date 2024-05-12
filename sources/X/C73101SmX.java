package X;

import android.animation.Animator;
import android.view.View;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.internal.o;

/* renamed from: X.SmX, reason: case insensitive filesystem */
/* loaded from: classes13.dex */
public final class C73101SmX extends C73102SmY {
    public final /* synthetic */ C73099SmV LJLIL;
    public final /* synthetic */ long LJLILLLLZI;

    @Override // android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animation) {
        o.LJIIIZ(animation, "animation");
        this.LJLIL.LJFF(this.LJLILLLLZI);
        this.LJLIL.LJ(this.LJLILLLLZI);
    }

    @Override // X.C73102SmY, android.animation.Animator.AnimatorListener
    public final void onAnimationStart(Animator animation) {
        o.LJIIIZ(animation, "animation");
        View LIZ = this.LJLIL.LIZ(R.id.bj_);
        if (LIZ == null) {
            return;
        }
        LIZ.setVisibility(0);
    }

    public C73101SmX(C73099SmV c73099SmV, long j) {
        this.LJLIL = c73099SmV;
        this.LJLILLLLZI = j;
    }
}
