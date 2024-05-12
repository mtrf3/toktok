package Y;

import X.C47121t6;
import android.animation.Animator;
import android.animation.ObjectAnimator;
import android.util.Property;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import com.bytedance.android.live.effect.api.ToShowSpecialIconEvent;
import com.bytedance.android.live.liveinteract.multiguestv3.main.media.guest.previewv2.golive.MultiGuestGoLivePreviewFragment;
import com.bytedance.android.live.liveinteract.multiguestv3.main.media.guest.previewv2.golive.MultiGuestGoLivePreviewViewModel;
import com.bytedance.android.live.liveinteract.multiguestv3.main.userinfo.common.MultiGuestUserInfoFragment;
import com.bytedance.android.livesdk.broadcast.interaction.widget.ShortCutPanelPalletWidget;
import com.bytedance.ies.sdk.datachannel.DataChannel;

/* loaded from: classes14.dex */
public class IDTListenerS121S0100000_13 implements View.OnTouchListener {
    public final int $t;
    public Object l0;

    @Override // android.view.View.OnTouchListener
    public final boolean onTouch(View view, MotionEvent motionEvent) {
        switch (this.$t) {
            case 0:
                return onTouch$0(this, view, motionEvent);
            case 1:
                return onTouch$1(this, view, motionEvent);
            case 2:
                return onTouch$2(this, view, motionEvent);
            default:
                return false;
        }
    }

    public IDTListenerS121S0100000_13(Object obj, int i) {
        this.$t = i;
        this.l0 = obj;
    }

    public static final boolean onTouch$0(IDTListenerS121S0100000_13 iDTListenerS121S0100000_13, View view, MotionEvent motionEvent) {
        MultiGuestGoLivePreviewViewModel multiGuestGoLivePreviewViewModel;
        if (((MultiGuestGoLivePreviewFragment) iDTListenerS121S0100000_13.l0).em(view) && (multiGuestGoLivePreviewViewModel = ((MultiGuestGoLivePreviewFragment) iDTListenerS121S0100000_13.l0).LLIILII) != null) {
            multiGuestGoLivePreviewViewModel.qv0();
            return false;
        }
        return false;
    }

    public static final boolean onTouch$1(IDTListenerS121S0100000_13 iDTListenerS121S0100000_13, View view, MotionEvent motionEvent) {
        if ((motionEvent.getAction() & 255) == 1) {
            DataChannel dataChannel = ((ShortCutPanelPalletWidget) iDTListenerS121S0100000_13.l0).dataChannel;
            if (dataChannel != null) {
                dataChannel.qv0(ToShowSpecialIconEvent.class, Boolean.TRUE);
            }
            ((ShortCutPanelPalletWidget) iDTListenerS121S0100000_13.l0).hide();
        }
        return true;
    }

    public static final boolean onTouch$2(IDTListenerS121S0100000_13 iDTListenerS121S0100000_13, View view, MotionEvent motionEvent) {
        int i;
        if (motionEvent.getAction() == 2) {
            MultiGuestUserInfoFragment multiGuestUserInfoFragment = (MultiGuestUserInfoFragment) iDTListenerS121S0100000_13.l0;
            if (!multiGuestUserInfoFragment.LJZI) {
                Animator animator = (Animator) multiGuestUserInfoFragment.LLILLJJLI.getValue();
                if (animator != null) {
                    animator.start();
                }
                Animator animator2 = (Animator) ((MultiGuestUserInfoFragment) iDTListenerS121S0100000_13.l0).LLILLJJLI.getValue();
                if (animator2 != null) {
                    animator2.addListener(new IDAListenerS43S0200000_13(view, (MultiGuestUserInfoFragment) iDTListenerS121S0100000_13.l0, 7));
                }
                ViewGroup viewGroup = ((MultiGuestUserInfoFragment) iDTListenerS121S0100000_13.l0).LJLLLL;
                if (viewGroup != null) {
                    i = viewGroup.getHeight();
                } else {
                    i = 0;
                }
                ObjectAnimator.ofFloat(view, (Property<View, Float>) View.TRANSLATION_Y, 0.0f, -i).setDuration(300L).start();
                C47121t6 c47121t6 = ((MultiGuestUserInfoFragment) iDTListenerS121S0100000_13.l0).LJLLI;
                if (c47121t6 != null) {
                    c47121t6.setVisibility(8);
                }
                MultiGuestUserInfoFragment multiGuestUserInfoFragment2 = (MultiGuestUserInfoFragment) iDTListenerS121S0100000_13.l0;
                multiGuestUserInfoFragment2.LJZI = true;
                ViewGroup viewGroup2 = multiGuestUserInfoFragment2.LLIILII;
                if (viewGroup2 != null) {
                    viewGroup2.setVisibility(0);
                }
                Animator animator3 = (Animator) ((MultiGuestUserInfoFragment) iDTListenerS121S0100000_13.l0).LLILLL.getValue();
                if (animator3 != null) {
                    animator3.start();
                }
            }
        }
        return false;
    }
}
