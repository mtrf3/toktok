package X;

import android.animation.Animator;
import android.widget.FrameLayout;
import com.bytedance.android.live.liveinteract.api.LinkAnchorPocChangedEvent;
import com.bytedance.android.live.liveinteract.multihost.biz.link.view.MultiCoHostWindowManager;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import java.util.List;
import kotlin.jvm.internal.o;

/* renamed from: X.Tnv, reason: case insensitive filesystem */
/* loaded from: classes14.dex */
public final class C75735Tnv extends C75742To2 {
    public final /* synthetic */ MultiCoHostWindowManager LJLIL;
    public final /* synthetic */ List<C75736Tnw> LJLILLLLZI;

    @Override // android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animation) {
        o.LJIIIZ(animation, "animation");
        FrameLayout frameLayout = this.LJLIL.LJFF;
        if (frameLayout != null) {
            frameLayout.removeAllViews();
        }
        DataChannel dataChannel = this.LJLIL.LIZJ;
        if (dataChannel != null) {
            dataChannel.qv0(LinkAnchorPocChangedEvent.class, Boolean.TRUE);
        }
        C0NB.LJIIIZ(this.LJLIL.LIZ, "doAnchorPocChangeAnim end");
    }

    @Override // X.C75742To2, android.animation.Animator.AnimatorListener
    public final void onAnimationStart(Animator animation) {
        o.LJIIIZ(animation, "animation");
        C0NB.LJIIIZ(this.LJLIL.LIZ, "doAnchorPocChangeAnim start");
    }

    public C75735Tnv(MultiCoHostWindowManager multiCoHostWindowManager, List<C75736Tnw> list) {
        this.LJLIL = multiCoHostWindowManager;
        this.LJLILLLLZI = list;
    }
}
