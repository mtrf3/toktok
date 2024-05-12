package X;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import com.bytedance.android.live.liveinteract.match.business.event.BattleReMatchEvent;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import kotlin.jvm.internal.o;

/* renamed from: X.U1a, reason: case insensitive filesystem */
/* loaded from: classes14.dex */
public final class C76510U1a extends AnimatorListenerAdapter {
    public final /* synthetic */ U1X LJLIL;

    public C76510U1a(U1X u1x) {
        this.LJLIL = u1x;
    }

    @Override // android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animation, boolean z) {
        o.LJIIIZ(animation, "animation");
        super.onAnimationEnd(animation, z);
        DataChannel dataChannel = this.LJLIL.LJLJJLL;
        if (dataChannel != null) {
            dataChannel.pv0(BattleReMatchEvent.class);
        }
    }
}
