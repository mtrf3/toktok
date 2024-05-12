package X;

import Y.AObserverS69S0200000_5;
import android.util.Pair;
import android.view.View;
import android.view.animation.Animation;
import com.bytedance.android.live.slot.FrameL2SlotWidget;
import com.bytedance.android.live.slot.IFrameSlot;
import com.bytedance.android.livesdk.slot.FrameL2SlotVisibilityChannel;
import com.bytedance.android.livesdk.slot.FullBottomContainerHeightChannel;
import com.bytedance.ies.sdk.datachannel.DataChannel;

/* renamed from: X.CcP, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class AnimationAnimationListenerC31705CcP implements Animation.AnimationListener {
    public final /* synthetic */ IFrameSlot LIZ;
    public final /* synthetic */ Pair LIZIZ;
    public final /* synthetic */ AObserverS69S0200000_5 LIZJ;

    @Override // android.view.animation.Animation.AnimationListener
    public final void onAnimationRepeat(Animation animation) {
    }

    @Override // android.view.animation.Animation.AnimationListener
    public final void onAnimationStart(Animation animation) {
    }

    @Override // android.view.animation.Animation.AnimationListener
    public final void onAnimationEnd(Animation animation) {
        View view = ((FrameL2SlotWidget) this.LIZJ.l1).getView();
        if (view != null) {
            view.post(new RunnableC32036Chk(this, view, this.LIZ, this.LIZIZ, (InterfaceC31710CcU) this.LIZJ.l0, 0));
        }
        DataChannel dataChannel = ((FrameL2SlotWidget) this.LIZJ.l1).dataChannel;
        if (dataChannel != null) {
            dataChannel.rv0(FullBottomContainerHeightChannel.class, 0);
            ((FrameL2SlotWidget) this.LIZJ.l1).dataChannel.rv0(FrameL2SlotVisibilityChannel.class, Boolean.FALSE);
        }
    }

    public AnimationAnimationListenerC31705CcP(AObserverS69S0200000_5 aObserverS69S0200000_5, IFrameSlot iFrameSlot, Pair pair) {
        this.LIZJ = aObserverS69S0200000_5;
        this.LIZ = iFrameSlot;
        this.LIZIZ = pair;
    }
}
