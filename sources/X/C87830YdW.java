package X;

import android.animation.Animator;
import android.widget.TextView;
import com.bytedance.android.livesdk.model.message.RankAnimationInfo;
import kotlin.jvm.internal.o;

/* renamed from: X.YdW, reason: case insensitive filesystem */
/* loaded from: classes17.dex */
public final class C87830YdW extends C87797Ycz {
    public final /* synthetic */ C87823YdP LJLIL;
    public final /* synthetic */ C31521CYr LJLILLLLZI;
    public final /* synthetic */ long LJLJI;

    @Override // X.C87797Ycz, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animation) {
        String str;
        o.LJIIIZ(animation, "animation");
        C87823YdP c87823YdP = this.LJLIL;
        YZJ yzj = YZJ.ONCE;
        TextView textView = c87823YdP.LJIIJ;
        RankAnimationInfo rankAnimationInfo = this.LJLILLLLZI.LJFF;
        if (rankAnimationInfo == null || (str = rankAnimationInfo.getContent()) == null) {
            str = "";
        }
        c87823YdP.LJIIJ(yzj, textView, str, (this.LJLJI + 300) - 300, null);
    }

    public C87830YdW(C87823YdP c87823YdP, C31521CYr c31521CYr, long j) {
        this.LJLIL = c87823YdP;
        this.LJLILLLLZI = c31521CYr;
        this.LJLJI = j;
    }
}
