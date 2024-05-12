package Y;

import X.ActivityC45651qj;
import X.B35;
import X.B5A;
import X.C0NB;
import X.C28212B5k;
import X.C30184Bsy;
import X.C31319CQx;
import X.C76800UCe;
import X.CVR;
import X.EnumC74991Tbv;
import X.InterfaceC88472Yns;
import X.KL2;
import X.X1D;
import android.animation.ValueAnimator;
import android.view.View;
import android.widget.FrameLayout;
import com.bytedance.android.live.liveinteract.multiguestv3.MultiGuestV3AnchorContainerIsVisibleChannel;
import com.bytedance.android.live.publicscreen.impl.widget.PublicScreenWidget;
import com.bytedance.android.livesdk.chatroom.ui.LandscapeAudienceInteractionFragment;
import com.bytedance.android.livesdk.chatroom.ui.LivePlayFragment;
import com.bytedance.android.livesdk.chatroom.viewmodule.CommentWidget;
import com.bytedance.android.livesdk.dataChannel.IsVideoViewChangeForHostChannel;
import com.bytedance.android.livesdk.livesetting.linkmic.MultiGuestV3RoomLoadingOptSetting;
import com.bytedance.android.livesdk.livesetting.linkmic.cohost.MultiCohostRoomLoadingOptSetting;
import com.bytedance.android.livesdk.livesetting.linkmic.cohost.MultiHostUpdatePlayerSetting;
import com.bytedance.android.livesdk.livesetting.pullstream.SurfaceViewUnExpectedWHSetting;

/* loaded from: classes6.dex */
public class AObjectS144S0100000_5 implements InterfaceC88472Yns {
    public final int $t;
    public Object l0;

    @Override // X.InterfaceC88472Yns
    public final Object invoke(Object obj) {
        switch (this.$t) {
            case 0:
                return invoke$0(this, obj);
            case 1:
                return invoke$1(this, obj);
            case 2:
                return invoke$2(this, obj);
            case 3:
                return invoke$3(this, obj);
            case 4:
                return invoke$4(this, obj);
            case 5:
                return invoke$5(this, obj);
            default:
                return null;
        }
    }

    public AObjectS144S0100000_5(Object obj, int i) {
        this.$t = i;
        this.l0 = obj;
    }

    public static final Object invoke$0(AObjectS144S0100000_5 aObjectS144S0100000_5, Object obj) {
        C28212B5k c28212B5k = (C28212B5k) obj;
        MultiGuestV3RoomLoadingOptSetting multiGuestV3RoomLoadingOptSetting = MultiGuestV3RoomLoadingOptSetting.INSTANCE;
        if (multiGuestV3RoomLoadingOptSetting.isEnable()) {
            final LivePlayFragment livePlayFragment = (LivePlayFragment) aObjectS144S0100000_5.l0;
            ActivityC45651qj mo49getActivity = livePlayFragment.mo49getActivity();
            if (livePlayFragment.LLILL == null || C30184Bsy.LIZIZ(mo49getActivity)) {
                C0NB.LIZIZ("1VNExperienceV1", "LivePlayFragment_onAudienceVideoViewParamsV1 return as mVideoView is null or not support pip");
            } else {
                FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) livePlayFragment.LLILL.LIZIZ();
                FrameLayout.LayoutParams LIZ = c28212B5k.LIZ();
                if (layoutParams.width == LIZ.width && layoutParams.height == LIZ.height && layoutParams.gravity == LIZ.gravity && layoutParams.leftMargin == LIZ.leftMargin && layoutParams.topMargin == LIZ.topMargin && layoutParams.rightMargin == LIZ.rightMargin && layoutParams.bottomMargin == LIZ.bottomMargin) {
                    C0NB.LIZIZ("1VNExperienceV1", "LivePlayFragment_onAudienceVideoViewParamsV1 return as params is the same as old");
                } else if (c28212B5k.LJFF) {
                    livePlayFragment.LLILL.LIZLLL(LIZ, "onAudienceVideoViewParams1");
                } else {
                    ValueAnimator valueAnimator = livePlayFragment.b;
                    if (valueAnimator != null) {
                        valueAnimator.end();
                        livePlayFragment.b = null;
                    }
                    if (multiGuestV3RoomLoadingOptSetting.isEnable() && livePlayFragment.LLZZLLIL != null && livePlayFragment.m && (c28212B5k.LJI == EnumC74991Tbv.FLOAT || (livePlayFragment.LLILL.LIZ instanceof CVR))) {
                        C0NB.LIZIZ("1VNExperienceV1", "LivePlayFragment_onAudienceVideoViewParamsV1 show animation");
                        livePlayFragment.m = false;
                        final int width = livePlayFragment.LLILL.LIZ.getWidth();
                        final int height = livePlayFragment.LLILL.LIZ.getHeight();
                        final int i = layoutParams.leftMargin;
                        final int i2 = layoutParams.topMargin;
                        final int i3 = c28212B5k.LIZ;
                        final int i4 = c28212B5k.LIZIZ;
                        final int i5 = c28212B5k.LIZLLL;
                        final int i6 = c28212B5k.LIZJ;
                        ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
                        livePlayFragment.b = ofFloat;
                        ofFloat.setDuration(800L);
                        livePlayFragment.b.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: X.B4o
                            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
                            public final void onAnimationUpdate(ValueAnimator valueAnimator2) {
                                LivePlayFragment livePlayFragment2 = LivePlayFragment.this;
                                int i7 = width;
                                int i8 = i3;
                                int i9 = height;
                                int i10 = i4;
                                int i11 = i;
                                int i12 = i5;
                                int i13 = i2;
                                int i14 = i6;
                                FrameLayout.LayoutParams layoutParams2 = (FrameLayout.LayoutParams) livePlayFragment2.LLILL.LIZIZ();
                                float floatValue = ((Float) valueAnimator2.getAnimatedValue()).floatValue();
                                layoutParams2.width = (int) (((i8 - i7) * floatValue) + i7);
                                layoutParams2.height = (int) (((i10 - i9) * floatValue) + i9);
                                layoutParams2.leftMargin = (int) (((i12 - i11) * floatValue) + i11);
                                layoutParams2.topMargin = (int) (((i14 - i13) * floatValue) + i13);
                                layoutParams2.gravity = 51;
                                B4V b4v = livePlayFragment2.LLILL;
                                StringBuilder LIZ2 = X1D.LIZ();
                                LIZ2.append("onAudienceVideoViewParams3 animatedValue ");
                                LIZ2.append(floatValue);
                                b4v.LIZLLL(layoutParams2, X1D.LIZIZ(LIZ2));
                            }
                        });
                        livePlayFragment.b.addListener(new IDAListenerS74S0100000_5(livePlayFragment, 2));
                        livePlayFragment.b.start();
                        livePlayFragment.LLLIIL.rv0(MultiGuestV3AnchorContainerIsVisibleChannel.class, Boolean.FALSE);
                    } else {
                        layoutParams.width = c28212B5k.LIZ;
                        layoutParams.height = c28212B5k.LIZIZ;
                        layoutParams.gravity = 51;
                        layoutParams.leftMargin = c28212B5k.LIZLLL;
                        layoutParams.rightMargin = c28212B5k.LJ;
                        layoutParams.topMargin = c28212B5k.LIZJ;
                        livePlayFragment.LLILL.LIZLLL(layoutParams, "onAudienceVideoViewParams2");
                    }
                }
            }
        } else {
            LivePlayFragment livePlayFragment2 = (LivePlayFragment) aObjectS144S0100000_5.l0;
            livePlayFragment2.getClass();
            StringBuilder LIZ2 = X1D.LIZ();
            LIZ2.append("onAudienceVideoViewParams: ");
            LIZ2.append(c28212B5k.toString());
            LIZ2.append(" videoView = ");
            LIZ2.append(livePlayFragment2.LLILL.hashCode());
            C0NB.LIZIZ("LivePlayFragment", X1D.LIZIZ(LIZ2));
            ActivityC45651qj mo49getActivity2 = livePlayFragment2.mo49getActivity();
            if (livePlayFragment2.LLILL != null && !C30184Bsy.LIZIZ(mo49getActivity2)) {
                FrameLayout.LayoutParams layoutParams2 = (FrameLayout.LayoutParams) livePlayFragment2.LLILL.LIZIZ();
                FrameLayout.LayoutParams LIZ3 = c28212B5k.LIZ();
                if (layoutParams2.width == LIZ3.width && layoutParams2.height == LIZ3.height && layoutParams2.gravity == LIZ3.gravity && layoutParams2.leftMargin == LIZ3.leftMargin && layoutParams2.topMargin == LIZ3.topMargin && layoutParams2.rightMargin == LIZ3.rightMargin && layoutParams2.bottomMargin == LIZ3.bottomMargin) {
                    C0NB.LIZIZ("LivePlayFragment", "onAudienceVideoViewParams return as params is the same as old");
                } else {
                    livePlayFragment2.vl();
                    FrameLayout.LayoutParams layoutParams3 = (FrameLayout.LayoutParams) livePlayFragment2.LLILL.LIZIZ();
                    if (c28212B5k.LJFF) {
                        livePlayFragment2.LLILL.LIZLLL(LIZ3, "onAudienceVideoViewParams1");
                    } else {
                        layoutParams3.width = c28212B5k.LIZ;
                        layoutParams3.height = c28212B5k.LIZIZ;
                        layoutParams3.gravity = 51;
                        layoutParams3.leftMargin = c28212B5k.LIZLLL;
                        layoutParams3.rightMargin = c28212B5k.LJ;
                        layoutParams3.topMargin = c28212B5k.LIZJ;
                        livePlayFragment2.LLILL.LIZLLL(layoutParams3, "onAudienceVideoViewParams2");
                    }
                }
            }
        }
        ((LivePlayFragment) aObjectS144S0100000_5.l0).LLILL.LIZ.post(new ARunnableS24S0200000_5(aObjectS144S0100000_5, c28212B5k, 22));
        return C76800UCe.LIZ;
    }

    public static final Object invoke$1(AObjectS144S0100000_5 aObjectS144S0100000_5, Object obj) {
        int i;
        int i2;
        B5A b5a = (B5A) obj;
        LivePlayFragment livePlayFragment = (LivePlayFragment) aObjectS144S0100000_5.l0;
        ActivityC45651qj mo49getActivity = livePlayFragment.mo49getActivity();
        if (livePlayFragment.LLILL == null || C30184Bsy.LIZIZ(mo49getActivity)) {
            C0NB.LIZIZ("LivePlayFragment", "onVideoViewChangeParams return as in pip mode");
        } else {
            if (!MultiCohostRoomLoadingOptSetting.INSTANCE.isEnable() || livePlayFragment.om()) {
                livePlayFragment.Vm();
            }
            if (b5a.LJFF) {
                livePlayFragment.LLLLILI = false;
                livePlayFragment.LLLIIL.rv0(IsVideoViewChangeForHostChannel.class, Boolean.FALSE);
                FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) livePlayFragment.LLILL.LIZIZ();
                layoutParams.width = -1;
                layoutParams.height = -1;
                layoutParams.gravity = 17;
                layoutParams.leftMargin = 0;
                layoutParams.rightMargin = 0;
                layoutParams.bottomMargin = 0;
                layoutParams.topMargin = 0;
                livePlayFragment.LLILL.LIZLLL(layoutParams, "videoViewChange");
                if (livePlayFragment.LLFF) {
                    int[] iArr = new int[2];
                    B35 b35 = livePlayFragment.LLIIIJ;
                    if (b35 != null) {
                        b35.getVideoSize(iArr);
                    }
                    livePlayFragment.Ym(iArr[0], iArr[1], KL2.LJIIJJI(livePlayFragment.getContext()), "cohost_close");
                }
            } else {
                livePlayFragment.LLLLILI = true;
                livePlayFragment.LLLIIL.rv0(IsVideoViewChangeForHostChannel.class, Boolean.TRUE);
                FrameLayout.LayoutParams layoutParams2 = (FrameLayout.LayoutParams) livePlayFragment.LLILL.LIZIZ();
                if (SurfaceViewUnExpectedWHSetting.INSTANCE.getValue()) {
                    if (layoutParams2.width == 0 || layoutParams2.height == 0 || (i = b5a.LIZ) == 0 || (i2 = b5a.LIZIZ) == 0) {
                        StringBuilder LIZ = X1D.LIZ();
                        LIZ.append("onVideoViewChangeParams return as lp.width = ");
                        LIZ.append(layoutParams2.width);
                        LIZ.append("  lp.height = ");
                        LIZ.append(layoutParams2.height);
                        C0NB.LJ("ttlive_enter_room_log_RenderView", X1D.LIZIZ(LIZ));
                    } else {
                        layoutParams2.width = i;
                        layoutParams2.height = i2;
                        layoutParams2.leftMargin = b5a.LIZLLL;
                        layoutParams2.topMargin = b5a.LIZJ;
                        layoutParams2.rightMargin = b5a.LJ;
                        layoutParams2.gravity = 48;
                        livePlayFragment.LLILL.LIZLLL(layoutParams2, "videoViewChange");
                    }
                } else {
                    int i3 = b5a.LIZ;
                    layoutParams2.width = i3;
                    int i4 = b5a.LIZIZ;
                    layoutParams2.height = i4;
                    if ((i3 == 0 || i4 == 0) && MultiHostUpdatePlayerSetting.INSTANCE.isEnable()) {
                        StringBuilder LIZ2 = X1D.LIZ();
                        LIZ2.append("onVideoViewChangeParams return as lp.width = ");
                        LIZ2.append(layoutParams2.width);
                        LIZ2.append("  lp.height = ");
                        LIZ2.append(layoutParams2.height);
                        C0NB.LJ("LivePlayFragment", X1D.LIZIZ(LIZ2));
                    }
                    layoutParams2.leftMargin = b5a.LIZLLL;
                    layoutParams2.topMargin = b5a.LIZJ;
                    layoutParams2.rightMargin = b5a.LJ;
                    layoutParams2.gravity = 48;
                    livePlayFragment.LLILL.LIZLLL(layoutParams2, "videoViewChange");
                }
            }
            livePlayFragment.LLILL.LIZ.post(new ARunnableS8S0201000_5(0, livePlayFragment, b5a, 5));
        }
        return C76800UCe.LIZ;
    }

    public static final Object invoke$2(AObjectS144S0100000_5 aObjectS144S0100000_5, Object obj) {
        LandscapeAudienceInteractionFragment landscapeAudienceInteractionFragment = (LandscapeAudienceInteractionFragment) aObjectS144S0100000_5.l0;
        landscapeAudienceInteractionFragment.getClass();
        boolean booleanValue = ((Boolean) obj).booleanValue();
        if (!landscapeAudienceInteractionFragment.LJLJJL && booleanValue) {
            landscapeAudienceInteractionFragment.LJLJJL = true;
            landscapeAudienceInteractionFragment.tn();
            landscapeAudienceInteractionFragment.qn(0);
        }
        return C76800UCe.LIZ;
    }

    public static final Object invoke$3(AObjectS144S0100000_5 aObjectS144S0100000_5, Object obj) {
        CommentWidget commentWidget = (CommentWidget) aObjectS144S0100000_5.l0;
        commentWidget.getClass();
        if (((Boolean) obj).booleanValue()) {
            commentWidget.hide();
        } else {
            commentWidget.show();
        }
        return C76800UCe.LIZ;
    }

    public static final Object invoke$4(AObjectS144S0100000_5 aObjectS144S0100000_5, Object obj) {
        C31319CQx c31319CQx = (C31319CQx) aObjectS144S0100000_5.l0;
        if (c31319CQx.LJLIL == null || c31319CQx.LLIILZL == null) {
            return C76800UCe.LIZ;
        }
        if (obj == c31319CQx.LJL()) {
            c31319CQx.LJLIL.LJIIL();
            c31319CQx.LLIILZL.LJIILJJIL = true;
        } else {
            c31319CQx.LJLIL.LJIIJJI();
            c31319CQx.LLIILZL.LJIILJJIL = false;
        }
        return C76800UCe.LIZ;
    }

    public static final Object invoke$5(AObjectS144S0100000_5 aObjectS144S0100000_5, Object obj) {
        PublicScreenWidget publicScreenWidget = (PublicScreenWidget) aObjectS144S0100000_5.l0;
        publicScreenWidget.getClass();
        if (((View) obj).getTranslationY() != 0.0f) {
            publicScreenWidget.LJZL();
        }
        return C76800UCe.LIZ;
    }
}
