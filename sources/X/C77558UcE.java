package X;

import android.animation.Animator;
import com.bytedance.android.livesdk.api.revenue.level.IUserLevelService;
import kotlin.jvm.internal.o;

/* renamed from: X.UcE, reason: case insensitive filesystem */
/* loaded from: classes14.dex */
public final class C77558UcE extends C73102SmY {
    public final /* synthetic */ C77557UcD LJLIL;
    public final /* synthetic */ Runnable LJLILLLLZI;

    @Override // android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animation) {
        o.LJIIIZ(animation, "animation");
        this.LJLIL.LJLJJI = 0;
        Runnable runnable = this.LJLILLLLZI;
        if (runnable != null) {
            runnable.run();
        }
        ((IUserLevelService) CN1.LIZ(IUserLevelService.class)).I10(this.LJLIL.getComboCount());
        C77557UcD c77557UcD = this.LJLIL;
        c77557UcD.LJLJJL = 0;
        C76836UDo c76836UDo = c77557UcD.LJLJLJ;
        if (c76836UDo != null) {
            c76836UDo.LIZ(c77557UcD.getComboCount());
        }
    }

    public C77558UcE(C77557UcD c77557UcD, Runnable runnable) {
        this.LJLIL = c77557UcD;
        this.LJLILLLLZI = runnable;
    }
}
