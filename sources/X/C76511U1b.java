package X;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.internal.o;

/* renamed from: X.U1b, reason: case insensitive filesystem */
/* loaded from: classes14.dex */
public final class C76511U1b extends AnimatorListenerAdapter {
    public final /* synthetic */ U46 LJLIL;

    public C76511U1b(U46 u46) {
        this.LJLIL = u46;
    }

    @Override // android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animation, boolean z) {
        o.LJIIIZ(animation, "animation");
        super.onAnimationEnd(animation, z);
        C29306Beo.LJI(this.LJLIL.LIZ(R.id.ga8));
        C29306Beo.LJI(this.LJLIL.LIZ(R.id.g71));
    }
}
