package Y;

import X.AbstractC73672Svk;
import X.AbstractC77394UZa;
import X.BQO;
import X.C0NB;
import X.C131915Fr;
import X.C15380j0;
import X.C15650jR;
import X.C16880lQ;
import X.C265112h;
import X.C29306Beo;
import X.C31597Caf;
import X.C34K;
import X.C47061t0;
import X.C47121t6;
import X.C56414MCc;
import X.C73411SrX;
import X.C75633TmH;
import X.C75838Tpa;
import X.C76414Tys;
import X.C78072UkW;
import X.C78720Uuy;
import X.C86881Y7x;
import X.C87277YNd;
import X.InterfaceC65784Pro;
import X.InterfaceC76416Tyu;
import X.RunnableC76420Tyy;
import X.TBF;
import X.TMC;
import X.U1X;
import X.U1Y;
import X.U21;
import X.U26;
import X.U46;
import X.UC8;
import X.UCA;
import X.UL8;
import X.X1D;
import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.ObjectAnimator;
import android.graphics.drawable.ColorDrawable;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.HorizontalScrollView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.bytedance.android.live.base.model.ImageModel;
import com.bytedance.android.live.liveinteract.match.business.event.BattleItemCardAwardChannel;
import com.bytedance.android.live.liveinteract.multiguestv3.main.userinfo.common.MultiGuestUserInfoFragment;
import com.bytedance.android.live.liveinteract.multihost.biz.view.InteractionTitleLayout;
import com.bytedance.android.live.liveinteract.voicechat.main.userinfo.common.VoiceChatUserInfoFragment;
import com.bytedance.android.livesdk.broadcast.interaction.widget.ShortCutPanelPalletWidget;
import com.bytedance.android.livesdk.chatroom.model.interact.CohostTopic;
import com.bytedance.android.livesdk.comp.impl.game.linkmic.fragment.GameLinkUserInfoFragment;
import com.bytedance.android.livesdk.livesetting.linkmic.LiveAudienceLinkmicLowestAgeSetting;
import com.bytedance.android.livesdk.model.message.battle.BattleUserArmy;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import com.bytedance.ies.sdk.widgets.ConstraintProperty;
import com.bytedance.ies.sdk.widgets.LayeredElementContext;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.bytedance.vcloud.abrmodule.ABRConfig;
import com.zhiliaoapp.musically.R;
import java.util.LinkedHashMap;
import java.util.concurrent.TimeUnit;
import kotlin.jvm.internal.o;

/* loaded from: classes14.dex */
public class ALAdapterS10S0200000_13 extends AnimatorListenerAdapter {
    public final int $t;
    public Object l0;
    public Object l1;

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationCancel(Animator animator) {
        switch (this.$t) {
            case 0:
                onAnimationCancel$0(this, animator);
                return;
            case 22:
                onAnimationCancel$1(this, animator);
                return;
            case 23:
                onAnimationCancel$2(this, animator);
                return;
            default:
                super.onAnimationCancel(animator);
                return;
        }
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        switch (this.$t) {
            case 0:
                onAnimationEnd$0(this, animator);
                return;
            case 1:
                onAnimationEnd$1(this, animator);
                return;
            case 2:
                onAnimationEnd$2(this, animator);
                return;
            case 3:
                onAnimationEnd$3(this, animator);
                return;
            case 4:
                onAnimationEnd$4(this, animator);
                return;
            case 5:
                onAnimationEnd$5(this, animator);
                return;
            case 6:
                onAnimationEnd$6(this, animator);
                return;
            case 7:
            case 12:
            default:
                super.onAnimationEnd(animator);
                return;
            case 8:
                onAnimationEnd$7(this, animator);
                return;
            case 9:
                onAnimationEnd$8(this, animator);
                return;
            case 10:
                onAnimationEnd$9(this, animator);
                return;
            case ABRConfig.ABR_BANDWIDTH_PARAMETER_KEY /* 11 */:
                onAnimationEnd$10(this, animator);
                return;
            case ABRConfig.ABR_STARTUP_MAX_BITRATE /* 13 */:
                onAnimationEnd$11(this, animator);
                return;
            case 14:
                onAnimationEnd$12(this, animator);
                return;
            case 15:
                onAnimationEnd$13(this, animator);
                return;
            case LiveAudienceLinkmicLowestAgeSetting.DEFAULT /* 16 */:
                onAnimationEnd$14(this, animator);
                return;
            case 17:
                onAnimationEnd$15(this, animator);
                return;
            case 18:
                onAnimationEnd$16(this, animator);
                return;
            case 19:
                onAnimationEnd$17(this, animator);
                return;
            case 20:
                onAnimationEnd$18(this, animator);
                return;
            case 21:
                onAnimationEnd$19(this, animator);
                return;
            case 22:
                onAnimationEnd$20(this, animator);
                return;
            case 23:
                onAnimationEnd$21(this, animator);
                return;
            case 24:
                onAnimationEnd$22(this, animator);
                return;
            case 25:
                onAnimationEnd$23(this, animator);
                return;
        }
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationStart(Animator animator) {
        switch (this.$t) {
            case 3:
                onAnimationStart$0(this, animator);
                return;
            case 4:
            case 6:
            case 9:
            case ABRConfig.ABR_BANDWIDTH_PARAMETER_KEY /* 11 */:
            case ABRConfig.ABR_STARTUP_MAX_BITRATE /* 13 */:
            case 15:
            case LiveAudienceLinkmicLowestAgeSetting.DEFAULT /* 16 */:
            case 17:
            case 18:
            case 19:
            default:
                super.onAnimationStart(animator);
                return;
            case 5:
                onAnimationStart$1(this, animator);
                return;
            case 7:
                onAnimationStart$2(this, animator);
                return;
            case 8:
                onAnimationStart$3(this, animator);
                return;
            case 10:
                onAnimationStart$4(this, animator);
                return;
            case 12:
                onAnimationStart$5(this, animator);
                return;
            case 14:
                onAnimationStart$6(this, animator);
                return;
            case 20:
                onAnimationStart$7(this, animator);
                return;
            case 21:
                onAnimationStart$8(this, animator);
                return;
            case 22:
                onAnimationStart$9(this, animator);
                return;
            case 23:
                onAnimationStart$10(this, animator);
                return;
            case 24:
                onAnimationStart$11(this, animator);
                return;
        }
    }

    @Override // android.animation.Animator.AnimatorListener
    public final void onAnimationStart(Animator animator, boolean z) {
        switch (this.$t) {
            case 0:
                onAnimationStart$0(this, animator, z);
                return;
            default:
                super.onAnimationStart(animator, z);
                return;
        }
    }

    public static final void onAnimationCancel$0(ALAdapterS10S0200000_13 aLAdapterS10S0200000_13, Animator animation) {
        o.LJIIIZ(animation, "animation");
        super.onAnimationCancel(animation);
        UC8.LJZI = null;
        ((UC8) aLAdapterS10S0200000_13.l0).LJLLI = UCA.HIDE;
        ((View) aLAdapterS10S0200000_13.l1).setVisibility(8);
        ((View) aLAdapterS10S0200000_13.l1).setAlpha(1.0f);
        C78072UkW poll = ((UC8) aLAdapterS10S0200000_13.l0).LJLLL.poll();
        if (poll != null) {
            ((UC8) aLAdapterS10S0200000_13.l0).LJJIII(poll);
        }
    }

    public static final void onAnimationCancel$1(ALAdapterS10S0200000_13 aLAdapterS10S0200000_13, Animator animation) {
        o.LJIIIZ(animation, "animation");
        super.onAnimationCancel(animation);
        ((C56414MCc) aLAdapterS10S0200000_13.l0).LIZJ();
        ((C56414MCc) aLAdapterS10S0200000_13.l0).setVisibility(8);
        ((U21) aLAdapterS10S0200000_13.l1).LJLIL.setVisibility(0);
    }

    public static final void onAnimationCancel$2(ALAdapterS10S0200000_13 aLAdapterS10S0200000_13, Animator animation) {
        o.LJIIIZ(animation, "animation");
        super.onAnimationCancel(animation);
        ((C56414MCc) aLAdapterS10S0200000_13.l0).LIZJ();
        ((C56414MCc) aLAdapterS10S0200000_13.l0).setVisibility(8);
        ((U21) aLAdapterS10S0200000_13.l1).LJLIL.setVisibility(0);
    }

    public static final void onAnimationEnd$0(ALAdapterS10S0200000_13 aLAdapterS10S0200000_13, Animator animation) {
        o.LJIIIZ(animation, "animation");
        super.onAnimationEnd(animation);
        UC8.LJZI = null;
        ((UC8) aLAdapterS10S0200000_13.l0).LJLLI = UCA.HIDE;
        ((View) aLAdapterS10S0200000_13.l1).setVisibility(8);
        ((View) aLAdapterS10S0200000_13.l1).setAlpha(1.0f);
        C78072UkW poll = ((UC8) aLAdapterS10S0200000_13.l0).LJLLL.poll();
        if (poll != null) {
            ((UC8) aLAdapterS10S0200000_13.l0).LJJIII(poll);
        }
    }

    public static final void onAnimationEnd$1(ALAdapterS10S0200000_13 aLAdapterS10S0200000_13, Animator animation) {
        o.LJIIIZ(animation, "animation");
        C75838Tpa victoryLapActivityListener = ((U46) aLAdapterS10S0200000_13.l0).getVictoryLapActivityListener();
        if (victoryLapActivityListener != null) {
            C29306Beo.LJJLJLI(victoryLapActivityListener.LIZJ);
        }
        C29306Beo.LJI((C131915Fr) aLAdapterS10S0200000_13.l1);
    }

    public static final void onAnimationEnd$10(ALAdapterS10S0200000_13 aLAdapterS10S0200000_13, Animator animation) {
        o.LJIIIZ(animation, "animation");
        super.onAnimationEnd(animation);
        ((C76414Tys) aLAdapterS10S0200000_13.l0).LJFF();
        ((C76414Tys) aLAdapterS10S0200000_13.l0).LIZIZ((CohostTopic) aLAdapterS10S0200000_13.l1, 0L);
    }

    public static final void onAnimationEnd$11(ALAdapterS10S0200000_13 aLAdapterS10S0200000_13, Animator animation) {
        o.LJIIIZ(animation, "animation");
        ((InterfaceC65784Pro) aLAdapterS10S0200000_13.l0).invoke();
        View view = ((ShortCutPanelPalletWidget) aLAdapterS10S0200000_13.l1).getView();
        if (view == null) {
            return;
        }
        view.setAlpha(1.0f);
    }

    public static final void onAnimationEnd$12(ALAdapterS10S0200000_13 aLAdapterS10S0200000_13, Animator animation) {
        CharSequence charSequence;
        String str;
        CharSequence charSequence2;
        ViewGroup.LayoutParams layoutParams;
        BattleUserArmy battleUserArmy;
        o.LJIIIZ(animation, "animation");
        super.onAnimationEnd(animation);
        Boolean bool = ((U1X) aLAdapterS10S0200000_13.l1).LJLJJL;
        Boolean bool2 = Boolean.TRUE;
        if (o.LJ(bool, bool2)) {
            DataChannel dataChannel = ((U1X) aLAdapterS10S0200000_13.l1).LJLJJLL;
            ImageModel imageModel = null;
            if (dataChannel != null) {
                charSequence = (CharSequence) dataChannel.kv0(BattleItemCardAwardChannel.class);
            } else {
                charSequence = null;
            }
            if ((charSequence == null || ujb.o.LJJJJJL(charSequence)) && ((U1X) aLAdapterS10S0200000_13.l1).LJLJJI) {
                return;
            }
            U1X u1x = (U1X) aLAdapterS10S0200000_13.l1;
            BattleUserArmy userInfo = ((U1Y) aLAdapterS10S0200000_13.l0).getUserInfo();
            if (userInfo != null) {
                str = userInfo.nickname;
            } else {
                str = null;
            }
            DataChannel dataChannel2 = ((U1X) aLAdapterS10S0200000_13.l1).LJLJJLL;
            if (dataChannel2 != null) {
                charSequence2 = (CharSequence) dataChannel2.kv0(BattleItemCardAwardChannel.class);
            } else {
                charSequence2 = null;
            }
            u1x.getClass();
            StringBuilder LIZ = X1D.LIZ();
            LIZ.append("innit mvp guide text = ");
            LIZ.append((Object) charSequence2);
            C0NB.LIZIZ("NewMvpContainer", X1D.LIZIZ(LIZ));
            ConstraintLayout constraintLayout = u1x.LJLZ;
            if (constraintLayout != null) {
                layoutParams = constraintLayout.getLayoutParams();
            } else {
                layoutParams = null;
            }
            o.LJII(layoutParams, "null cannot be cast to non-null type android.view.ViewGroup.MarginLayoutParams");
            ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams;
            if (u1x.LJLJI) {
                ConstraintLayout constraintLayout2 = u1x.LJLZ;
                if (constraintLayout2 != null) {
                    constraintLayout2.setBackground(new ColorDrawable(C15380j0.LIZIZ(R.color.a8y)));
                }
                marginLayoutParams.setMargins(0, 0, 0, C15380j0.LIZ(40.0f));
                View view = u1x.LJLLI;
                if (view != null) {
                    view.setVisibility(0);
                }
            } else {
                ConstraintLayout constraintLayout3 = u1x.LJLZ;
                if (constraintLayout3 != null) {
                    constraintLayout3.setBackground(new ColorDrawable(C15380j0.LIZIZ(R.color.a8x)));
                }
                marginLayoutParams.setMargins(0, C15380j0.LIZ(40.0f), 0, 0);
                View view2 = u1x.LJLLI;
                if (view2 != null) {
                    view2.setVisibility(8);
                }
            }
            ConstraintLayout constraintLayout4 = u1x.LJLZ;
            if (constraintLayout4 != null) {
                constraintLayout4.setLayoutParams(marginLayoutParams);
            }
            ConstraintLayout constraintLayout5 = u1x.LJLZ;
            if (constraintLayout5 != null) {
                constraintLayout5.getWidth();
            }
            if (!C15380j0.LJIIZILJ()) {
                C47061t0 c47061t0 = u1x.LJZL;
                if (c47061t0 != null) {
                    C29306Beo.LJJJLIIL(0, c47061t0);
                }
                C47061t0 c47061t02 = u1x.LL;
                if (c47061t02 != null) {
                    C29306Beo.LJJJLIIL(0, c47061t02);
                }
                C47061t0 c47061t03 = u1x.LLD;
                if (c47061t03 != null) {
                    C29306Beo.LJJJLIIL(0, c47061t03);
                }
            } else {
                C47061t0 c47061t04 = u1x.LLF;
                if (c47061t04 != null) {
                    C29306Beo.LJJLIIIIJ(0, c47061t04);
                }
                C47061t0 c47061t05 = u1x.LLFF;
                if (c47061t05 != null) {
                    C29306Beo.LJJLIIIIJ(0, c47061t05);
                }
                C47061t0 c47061t06 = u1x.LLFFF;
                if (c47061t06 != null) {
                    C29306Beo.LJJLIIIIJ(0, c47061t06);
                }
            }
            C47121t6 c47121t6 = u1x.LJZI;
            if (c47121t6 != null) {
                ViewGroup.LayoutParams layoutParams2 = c47121t6.getLayoutParams();
                if (layoutParams2 != null) {
                    layoutParams2.width = -2;
                }
                c47121t6.setLayoutParams(layoutParams2);
                if (charSequence2 == null || ujb.o.LJJJJJL(charSequence2)) {
                    charSequence2 = C15380j0.LJIILL(R.string.nfp, str);
                }
                c47121t6.setText(charSequence2);
                c47121t6.post(new ARunnableS24S0300000_13(u1x, layoutParams2, c47121t6, 10));
            }
            HorizontalScrollView horizontalScrollView = u1x.LJLLILLLL;
            if (horizontalScrollView != null) {
                horizontalScrollView.setVisibility(0);
            }
            ConstraintLayout constraintLayout6 = u1x.LJLZ;
            if (constraintLayout6 != null) {
                constraintLayout6.setVisibility(0);
            }
            ConstraintLayout constraintLayout7 = u1x.LJLZ;
            if (constraintLayout7 != null) {
                constraintLayout7.setAlpha(0.0f);
            }
            if (o.LJ(u1x.LJLJJL, bool2) && ListProtector.get(u1x.LLIIIJ, 0) != null) {
                U1Y u1y = (U1Y) ListProtector.get(u1x.LLIIIJ, 0);
                if (u1y != null) {
                    battleUserArmy = u1y.getUserInfo();
                } else {
                    battleUserArmy = null;
                }
                C31597Caf c31597Caf = u1x.LLIIII;
                if (c31597Caf != null) {
                    BQO LIZ2 = C15650jR.LIZ();
                    if (battleUserArmy != null) {
                        imageModel = battleUserArmy.avatarThumb;
                    }
                    C78720Uuy LJIIIZ = LIZ2.LJIIIZ(imageModel);
                    LJIIIZ.LJIIIIZZ = R.drawable.cuk;
                    int width = c31597Caf.getWidth();
                    int height = c31597Caf.getHeight();
                    LJIIIZ.LJ = width;
                    LJIIIZ.LJFF = height;
                    LJIIIZ.LJIIL = bool2;
                    LJIIIZ.LJIIJJI(c31597Caf);
                }
            }
            TBF tbf = u1x.LLIIIILZ;
            if (tbf != null) {
                tbf.setGradientColors(new int[]{C15380j0.LIZIZ(R.color.a91), C15380j0.LIZIZ(R.color.a90)});
            }
            U1X u1x2 = (U1X) aLAdapterS10S0200000_13.l1;
            u1x2.removeCallbacks(u1x2.LLI);
            U1X u1x3 = (U1X) aLAdapterS10S0200000_13.l1;
            ARunnableS49S0100000_13 aRunnableS49S0100000_13 = new ARunnableS49S0100000_13(u1x3, 118);
            u1x3.LLI = aRunnableS49S0100000_13;
            u1x3.postDelayed(aRunnableS49S0100000_13, 1500L);
        }
    }

    public static final void onAnimationEnd$13(ALAdapterS10S0200000_13 aLAdapterS10S0200000_13, Animator animation) {
        o.LJIIIZ(animation, "animation");
        C16880lQ.LJLL((ObjectAnimator) aLAdapterS10S0200000_13.l0, aLAdapterS10S0200000_13);
        ((VoiceChatUserInfoFragment) aLAdapterS10S0200000_13.l1).getClass();
    }

    public static final void onAnimationEnd$14(ALAdapterS10S0200000_13 aLAdapterS10S0200000_13, Animator animation) {
        o.LJIIIZ(animation, "animation");
        super.onAnimationEnd(animation);
        ((C47061t0) aLAdapterS10S0200000_13.l0).setImageDrawable(null);
        C87277YNd.LJJIIZI((C47061t0) aLAdapterS10S0200000_13.l0);
        C87277YNd.LJJIIZI((C47061t0) aLAdapterS10S0200000_13.l1);
    }

    public static final void onAnimationEnd$15(ALAdapterS10S0200000_13 aLAdapterS10S0200000_13, Animator animation) {
        o.LJIIIZ(animation, "animation");
        super.onAnimationEnd(animation);
        ((C47061t0) aLAdapterS10S0200000_13.l0).setImageDrawable(null);
        C87277YNd.LJJIIZI((C47061t0) aLAdapterS10S0200000_13.l0);
        C87277YNd.LJJIIZI((C47061t0) aLAdapterS10S0200000_13.l1);
    }

    public static final void onAnimationEnd$16(ALAdapterS10S0200000_13 aLAdapterS10S0200000_13, Animator animation) {
        o.LJIIIZ(animation, "animation");
        C16880lQ.LJLL((ObjectAnimator) aLAdapterS10S0200000_13.l0, aLAdapterS10S0200000_13);
        ((GameLinkUserInfoFragment) aLAdapterS10S0200000_13.l1).getClass();
    }

    public static final void onAnimationEnd$17(ALAdapterS10S0200000_13 aLAdapterS10S0200000_13, Animator animation) {
        o.LJIIIZ(animation, "animation");
        super.onAnimationEnd(animation);
        ConstraintProperty constraintProperty = (ConstraintProperty) aLAdapterS10S0200000_13.l0;
        constraintProperty.margin(7, ((UL8) ((LayeredElementContext) aLAdapterS10S0200000_13.l1)).LJIILL);
        constraintProperty.apply();
    }

    public static final void onAnimationEnd$18(ALAdapterS10S0200000_13 aLAdapterS10S0200000_13, Animator animation) {
        o.LJIIIZ(animation, "animation");
        super.onAnimationEnd(animation);
        ((ConstraintProperty) aLAdapterS10S0200000_13.l0).alpha(0.0f);
        ((ConstraintProperty) aLAdapterS10S0200000_13.l0).translationY(((LayeredElementContext) aLAdapterS10S0200000_13.l1).getContainer().getHeight());
    }

    public static final void onAnimationEnd$19(ALAdapterS10S0200000_13 aLAdapterS10S0200000_13, Animator animation) {
        o.LJIIIZ(animation, "animation");
        super.onAnimationEnd(animation);
        ((ConstraintProperty) aLAdapterS10S0200000_13.l0).alpha(0.0f);
        ((ConstraintProperty) aLAdapterS10S0200000_13.l0).translationY(((LayeredElementContext) aLAdapterS10S0200000_13.l1).getContainer().getHeight());
    }

    public static final void onAnimationEnd$2(ALAdapterS10S0200000_13 aLAdapterS10S0200000_13, Animator animation) {
        o.LJIIIZ(animation, "animation");
        C16880lQ.LJLL((ObjectAnimator) aLAdapterS10S0200000_13.l0, aLAdapterS10S0200000_13);
        ((MultiGuestUserInfoFragment) aLAdapterS10S0200000_13.l1).getClass();
    }

    public static final void onAnimationEnd$20(ALAdapterS10S0200000_13 aLAdapterS10S0200000_13, Animator animation) {
        o.LJIIIZ(animation, "animation");
        super.onAnimationEnd(animation);
        ((C56414MCc) aLAdapterS10S0200000_13.l0).LIZJ();
        ((C56414MCc) aLAdapterS10S0200000_13.l0).setVisibility(8);
        ((U21) aLAdapterS10S0200000_13.l1).LJLIL.setVisibility(0);
    }

    public static final void onAnimationEnd$21(ALAdapterS10S0200000_13 aLAdapterS10S0200000_13, Animator animation) {
        o.LJIIIZ(animation, "animation");
        super.onAnimationEnd(animation);
        ((C56414MCc) aLAdapterS10S0200000_13.l0).LIZJ();
        ((C56414MCc) aLAdapterS10S0200000_13.l0).setVisibility(8);
        ((U21) aLAdapterS10S0200000_13.l1).LJLIL.setVisibility(0);
    }

    public static final void onAnimationEnd$22(ALAdapterS10S0200000_13 aLAdapterS10S0200000_13, Animator animation) {
        o.LJIIIZ(animation, "animation");
        super.onAnimationEnd(animation);
        ((AbstractC77394UZa) aLAdapterS10S0200000_13.l0).getClass();
        InterfaceC65784Pro interfaceC65784Pro = (InterfaceC65784Pro) aLAdapterS10S0200000_13.l1;
        if (interfaceC65784Pro != null) {
            interfaceC65784Pro.invoke();
        }
    }

    public static final void onAnimationEnd$23(ALAdapterS10S0200000_13 aLAdapterS10S0200000_13, Animator animation) {
        o.LJIIIZ(animation, "animation");
        super.onAnimationEnd(animation);
        ((C47061t0) aLAdapterS10S0200000_13.l0).setImageDrawable(null);
        C87277YNd.LJJIIZI((C47061t0) aLAdapterS10S0200000_13.l0);
        C87277YNd.LJJIIZI((C47061t0) aLAdapterS10S0200000_13.l1);
    }

    public static final void onAnimationEnd$3(ALAdapterS10S0200000_13 aLAdapterS10S0200000_13, Animator animation) {
        o.LJIIIZ(animation, "animation");
        super.onAnimationEnd(animation);
        C0NB.LIZ("guide bubble end");
    }

    public static final void onAnimationEnd$4(ALAdapterS10S0200000_13 aLAdapterS10S0200000_13, Animator animation) {
        o.LJIIIZ(animation, "animation");
        super.onAnimationEnd(animation);
        InterfaceC76416Tyu interfaceC76416Tyu = ((InteractionTitleLayout) aLAdapterS10S0200000_13.l0).LLFFF;
        if (interfaceC76416Tyu != null) {
            interfaceC76416Tyu.LIZ();
        }
        if (((C34K) aLAdapterS10S0200000_13.l1).element) {
            AbstractC73672Svk LIZ = C265112h.LIZ(TMC.LJIL(0L, 30L, TimeUnit.SECONDS));
            InteractionTitleLayout interactionTitleLayout = (InteractionTitleLayout) aLAdapterS10S0200000_13.l0;
            ((InteractionTitleLayout) aLAdapterS10S0200000_13.l0).LLFII = (C73411SrX) LIZ.LJJJLIIL(new AfS65S0100000_13(interactionTitleLayout, 53), new AfS65S0100000_13(interactionTitleLayout, 54));
        }
    }

    public static final void onAnimationEnd$5(ALAdapterS10S0200000_13 aLAdapterS10S0200000_13, Animator animation) {
        o.LJIIIZ(animation, "animation");
        super.onAnimationEnd(animation);
        C75633TmH.LJIIJ = false;
        CohostTopic cohostTopic = (CohostTopic) ((LinkedHashMap) C75633TmH.LIZ).get(U26.LIZ());
        if (cohostTopic != null) {
            CohostTopic cohostTopic2 = (CohostTopic) aLAdapterS10S0200000_13.l1;
            InteractionTitleLayout interactionTitleLayout = (InteractionTitleLayout) aLAdapterS10S0200000_13.l0;
            if (cohostTopic2.id != cohostTopic.id) {
                interactionTitleLayout.K3();
                FrameLayout frameLayout = interactionTitleLayout.LJLLI;
                if (frameLayout != null) {
                    frameLayout.postDelayed(RunnableC76420Tyy.LJLIL, 500L);
                } else {
                    o.LJIJI("layoutContainer");
                    throw null;
                }
            }
        }
    }

    public static final void onAnimationEnd$6(ALAdapterS10S0200000_13 aLAdapterS10S0200000_13, Animator animation) {
        o.LJIIIZ(animation, "animation");
        super.onAnimationEnd(animation);
        ((InteractionTitleLayout) aLAdapterS10S0200000_13.l0).I3();
        ((InteractionTitleLayout) aLAdapterS10S0200000_13.l0).OX((CohostTopic) aLAdapterS10S0200000_13.l1, 0L);
    }

    public static final void onAnimationEnd$7(ALAdapterS10S0200000_13 aLAdapterS10S0200000_13, Animator animation) {
        o.LJIIIZ(animation, "animation");
        super.onAnimationEnd(animation);
        C0NB.LIZ("guide bubble end");
    }

    public static final void onAnimationEnd$8(ALAdapterS10S0200000_13 aLAdapterS10S0200000_13, Animator animation) {
        o.LJIIIZ(animation, "animation");
        super.onAnimationEnd(animation);
        InterfaceC76416Tyu topicSetAnimationEndListener = ((C76414Tys) aLAdapterS10S0200000_13.l0).getTopicSetAnimationEndListener();
        if (topicSetAnimationEndListener != null) {
            topicSetAnimationEndListener.LIZ();
        }
        if (((C34K) aLAdapterS10S0200000_13.l1).element) {
            AbstractC73672Svk LIZ = C265112h.LIZ(TMC.LJIL(0L, 30L, TimeUnit.SECONDS));
            C76414Tys c76414Tys = (C76414Tys) aLAdapterS10S0200000_13.l0;
            ((C76414Tys) aLAdapterS10S0200000_13.l0).LJLJLJ = (C73411SrX) LIZ.LJJJLIIL(new AfS65S0100000_13(c76414Tys, 55), new AfS65S0100000_13(c76414Tys, 56));
        }
    }

    public static final void onAnimationEnd$9(ALAdapterS10S0200000_13 aLAdapterS10S0200000_13, Animator animation) {
        o.LJIIIZ(animation, "animation");
        super.onAnimationEnd(animation);
        C75633TmH.LJIIJ = false;
        CohostTopic cohostTopic = (CohostTopic) ((LinkedHashMap) C75633TmH.LIZ).get(U26.LIZ());
        if (cohostTopic != null) {
            CohostTopic cohostTopic2 = (CohostTopic) aLAdapterS10S0200000_13.l1;
            C76414Tys c76414Tys = (C76414Tys) aLAdapterS10S0200000_13.l0;
            if (cohostTopic2.id != cohostTopic.id) {
                c76414Tys.LJIIJ();
                c76414Tys.getHandler().postDelayed(new ARunnableS32S0200000_13(c76414Tys, cohostTopic, 26), 500L);
            }
        }
    }

    public static final void onAnimationStart$0(ALAdapterS10S0200000_13 aLAdapterS10S0200000_13, Animator animation) {
        o.LJIIIZ(animation, "animation");
        ConstraintLayout constraintLayout = ((InteractionTitleLayout) aLAdapterS10S0200000_13.l0).LJLLJ;
        if (constraintLayout != null) {
            constraintLayout.setVisibility(0);
            C47121t6 c47121t6 = ((InteractionTitleLayout) aLAdapterS10S0200000_13.l0).LJLLL;
            if (c47121t6 != null) {
                c47121t6.setText(C86881Y7x.LIZIZ().LIZ(((CohostTopic) aLAdapterS10S0200000_13.l1).titleKey));
                super.onAnimationStart(animation);
                C0NB.LIZ("Start with guide bubble");
                return;
            }
            o.LJIJI("tvTopicGuideInfo");
            throw null;
        }
        o.LJIJI("topicPairGuideTitleLayout");
        throw null;
    }

    public static final void onAnimationStart$1(ALAdapterS10S0200000_13 aLAdapterS10S0200000_13, Animator animation) {
        o.LJIIIZ(animation, "animation");
        super.onAnimationStart(animation);
        LinearLayout linearLayout = ((InteractionTitleLayout) aLAdapterS10S0200000_13.l0).LJLLILLLL;
        if (linearLayout != null) {
            linearLayout.setVisibility(0);
            LinearLayout linearLayout2 = ((InteractionTitleLayout) aLAdapterS10S0200000_13.l0).LJLLILLLL;
            if (linearLayout2 != null) {
                linearLayout2.setAlpha(0.0f);
                return;
            } else {
                o.LJIJI("topicPairTitleLayout");
                throw null;
            }
        }
        o.LJIJI("topicPairTitleLayout");
        throw null;
    }

    public static final void onAnimationStart$10(ALAdapterS10S0200000_13 aLAdapterS10S0200000_13, Animator animation) {
        o.LJIIIZ(animation, "animation");
        super.onAnimationStart(animation);
        if (((C56414MCc) aLAdapterS10S0200000_13.l0).LIZ(((U21) aLAdapterS10S0200000_13.l1).LJLIL) != null) {
            ((C56414MCc) aLAdapterS10S0200000_13.l0).setVisibility(0);
            ((U21) aLAdapterS10S0200000_13.l1).LJLIL.setVisibility(4);
            ((C56414MCc) aLAdapterS10S0200000_13.l0).LIZIZ(true);
        }
    }

    public static final void onAnimationStart$11(ALAdapterS10S0200000_13 aLAdapterS10S0200000_13, Animator animation) {
        o.LJIIIZ(animation, "animation");
        super.onAnimationStart(animation);
        ((AbstractC77394UZa) aLAdapterS10S0200000_13.l0).getClass();
    }

    public static final void onAnimationStart$2(ALAdapterS10S0200000_13 aLAdapterS10S0200000_13, Animator animation) {
        o.LJIIIZ(animation, "animation");
        super.onAnimationStart(animation);
        InteractionTitleLayout interactionTitleLayout = (InteractionTitleLayout) aLAdapterS10S0200000_13.l0;
        int intValue = ((Number) aLAdapterS10S0200000_13.l1).intValue();
        ConstraintLayout constraintLayout = ((InteractionTitleLayout) aLAdapterS10S0200000_13.l0).LJZI;
        if (constraintLayout != null) {
            interactionTitleLayout.getClass();
            InteractionTitleLayout.L3(intValue, constraintLayout);
        } else {
            o.LJIJI("linkMicLayout");
            throw null;
        }
    }

    public static final void onAnimationStart$3(ALAdapterS10S0200000_13 aLAdapterS10S0200000_13, Animator animation) {
        o.LJIIIZ(animation, "animation");
        ((C76414Tys) aLAdapterS10S0200000_13.l0).LIZ(R.id.fn8).setVisibility(0);
        ((TextView) ((C76414Tys) aLAdapterS10S0200000_13.l0).LIZ(R.id.mop)).setText(C86881Y7x.LIZIZ().LIZ(((CohostTopic) aLAdapterS10S0200000_13.l1).titleKey));
        super.onAnimationStart(animation);
        C0NB.LIZ("Start with guide bubble");
    }

    public static final void onAnimationStart$4(ALAdapterS10S0200000_13 aLAdapterS10S0200000_13, Animator animation) {
        o.LJIIIZ(animation, "animation");
        super.onAnimationStart(animation);
        ((C76414Tys) aLAdapterS10S0200000_13.l0).LIZ(R.id.fna).setVisibility(0);
        ((C76414Tys) aLAdapterS10S0200000_13.l0).LIZ(R.id.fna).setAlpha(0.0f);
    }

    public static final void onAnimationStart$5(ALAdapterS10S0200000_13 aLAdapterS10S0200000_13, Animator animation) {
        o.LJIIIZ(animation, "animation");
        super.onAnimationStart(animation);
        C76414Tys c76414Tys = (C76414Tys) aLAdapterS10S0200000_13.l0;
        int intValue = ((Number) aLAdapterS10S0200000_13.l1).intValue();
        ConstraintLayout layout_linkmic_set = (ConstraintLayout) ((C76414Tys) aLAdapterS10S0200000_13.l0).LIZ(R.id.fjd);
        o.LJIIIIZZ(layout_linkmic_set, "layout_linkmic_set");
        c76414Tys.getClass();
        C76414Tys.LJIILIIL(intValue, layout_linkmic_set);
    }

    public static final void onAnimationStart$6(ALAdapterS10S0200000_13 aLAdapterS10S0200000_13, Animator animation) {
        o.LJIIIZ(animation, "animation");
        super.onAnimationStart(animation);
        ((TBF) ((U1Y) aLAdapterS10S0200000_13.l0).findViewById(R.id.n0v)).setGradientColors(new int[]{C15380j0.LIZIZ(R.color.a91), C15380j0.LIZIZ(R.color.a90)});
    }

    public static final void onAnimationStart$7(ALAdapterS10S0200000_13 aLAdapterS10S0200000_13, Animator animation) {
        o.LJIIIZ(animation, "animation");
        super.onAnimationStart(animation);
        ((ConstraintProperty) aLAdapterS10S0200000_13.l0).translationY(0.0f);
    }

    public static final void onAnimationStart$8(ALAdapterS10S0200000_13 aLAdapterS10S0200000_13, Animator animation) {
        o.LJIIIZ(animation, "animation");
        super.onAnimationStart(animation);
        ((ConstraintProperty) aLAdapterS10S0200000_13.l0).translationY(0.0f);
    }

    public static final void onAnimationStart$9(ALAdapterS10S0200000_13 aLAdapterS10S0200000_13, Animator animation) {
        o.LJIIIZ(animation, "animation");
        super.onAnimationStart(animation);
    }

    public ALAdapterS10S0200000_13(Object obj, Object obj2, int i) {
        this.$t = i;
        this.l0 = obj;
        this.l1 = obj2;
    }

    public static final void onAnimationStart$0(ALAdapterS10S0200000_13 aLAdapterS10S0200000_13, Animator animation, boolean z) {
        o.LJIIIZ(animation, "animation");
        ((UC8) aLAdapterS10S0200000_13.l0).LJLLI = UCA.HIDING;
    }
}
