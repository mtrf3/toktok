package X;

import android.animation.Animator;
import com.bytedance.android.live.liveinteract.match.business.event.BattleMvpAnimationStartEvent;
import com.bytedance.android.live.liveinteract.match.business.event.BattleReMatchEvent;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import com.zhiliaoapp.musically.R;
import java.util.ArrayList;
import kotlin.jvm.internal.o;

/* loaded from: classes14.dex */
public final class U1V implements Animator.AnimatorListener {
    public final /* synthetic */ U1X LJLIL;
    public final /* synthetic */ U1Y LJLILLLLZI;
    public final /* synthetic */ float LJLJI;
    public final /* synthetic */ float LJLJJI;

    @Override // android.animation.Animator.AnimatorListener
    public final void onAnimationRepeat(Animator animation) {
        o.LJIIIZ(animation, "animation");
    }

    @Override // android.animation.Animator.AnimatorListener
    public final void onAnimationCancel(Animator animation) {
        o.LJIIIZ(animation, "animation");
        float LJIJ = C15380j0.LJIJ(this.LJLILLLLZI.getWidth()) / 28.0f;
        this.LJLILLLLZI.setPivotX(this.LJLJI);
        this.LJLILLLLZI.setPivotY(this.LJLJJI);
        this.LJLILLLLZI.setScaleX(LJIJ);
        this.LJLILLLLZI.setScaleY(LJIJ);
    }

    @Override // android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animation) {
        DataChannel dataChannel;
        o.LJIIIZ(animation, "animation");
        if (o.LJ(this.LJLIL.LJLJJL, Boolean.FALSE) && (dataChannel = this.LJLIL.LJLJJLL) != null) {
            dataChannel.pv0(BattleReMatchEvent.class);
        }
    }

    @Override // android.animation.Animator.AnimatorListener
    public final void onAnimationStart(Animator animation) {
        boolean z;
        float LIZ;
        DataChannel dataChannel;
        o.LJIIIZ(animation, "animation");
        U1X u1x = this.LJLIL;
        U1Y u1y = this.LJLILLLLZI;
        u1x.getClass();
        int LJIIL = C15380j0.LJIIL();
        int[] iArr = new int[2];
        u1y.getLocationOnScreen(iArr);
        float f = iArr[0];
        float f2 = LJIIL / 2.0f;
        if (f < f2) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            LIZ = -(f2 - ((C15380j0.LJFF(R.dimen.a5x) / 2.0f) + f));
        } else {
            LIZ = f2 - (((LJIIL - r9) + C15380j0.LIZ(8.0f)) - (C15380j0.LJFF(R.dimen.a5x) / 2.0f));
        }
        ArrayList LJII = C47261Igj.LJII(Float.valueOf(LIZ), Float.valueOf((u1y.getBottom() - (u1x.getHeight() / 2.0f)) - C15380j0.LIZ(3.0f)));
        if ((!LJII.isEmpty()) && (dataChannel = this.LJLIL.LJLJJLL) != null) {
            dataChannel.qv0(BattleMvpAnimationStartEvent.class, LJII);
        }
    }

    public U1V(U1X u1x, U1Y u1y, float f, float f2) {
        this.LJLIL = u1x;
        this.LJLILLLLZI = u1y;
        this.LJLJI = f;
        this.LJLJJI = f2;
    }
}
