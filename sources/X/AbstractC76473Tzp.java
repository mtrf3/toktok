package X;

import Y.ALAdapterS10S0100000_13;
import Y.ALAdapterS2S0000000_5;
import Y.ALAdapterS2S0101000_13;
import Y.ALAdapterS4S0110000_13;
import Y.ALAdapterS5S0000000_13;
import Y.ARunnableS14S1100000_13;
import Y.ARunnableS32S0200000_13;
import Y.AUListenerS100S0100000_13;
import Y.AUListenerS102S0200000_13;
import android.animation.Animator;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.animation.ValueAnimator;
import android.content.Context;
import android.net.Uri;
import android.os.Build;
import android.os.Message;
import android.util.Property;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.fragment.app.Fragment;
import com.bytedance.android.live.base.model.user.User;
import com.bytedance.android.live.browser.IHybridContainerService;
import com.bytedance.android.live.liveinteract.api.LinkCrossRoomStateChangeEvent;
import com.bytedance.android.live.liveinteract.api.dataholder.LinkCrossRoomDataHolder;
import com.bytedance.android.live.liveinteract.api.event.MatchGiftTrayDodgeEvent;
import com.bytedance.android.live.liveinteract.match.business.event.BattleDrawTimeLeftChannel;
import com.bytedance.android.live.liveinteract.match.business.event.BattleMvpAnimationStartEvent;
import com.bytedance.android.live.liveinteract.match.business.event.BattleMvpStarAnimationStartEvent;
import com.bytedance.android.live.liveinteract.match.business.event.BattlePunishTimeLeftChannel;
import com.bytedance.android.live.liveinteract.match.business.event.BattleSmokeDebuffChannel;
import com.bytedance.android.live.liveinteract.match.business.event.BattleTimeLeftChannel;
import com.bytedance.android.live.liveinteract.multimatch.ui.IPKCountDownTitleAbility;
import com.bytedance.android.live.liveinteract.multimatch.widget.MatchBaseWidget;
import com.bytedance.android.livesdk.IBarrageService;
import com.bytedance.android.livesdk.dataChannel.RoomChannel;
import com.bytedance.android.livesdk.dataChannel.UserIsAnchorChannel;
import com.bytedance.android.livesdk.like.LikeHelper;
import com.bytedance.android.livesdk.livesetting.linkmic.match.LiveMatchAnimationOptSettings;
import com.bytedance.android.livesdk.livesetting.linkmic.match.LiveMatchReDesignSingleResultSetting;
import com.bytedance.android.livesdk.model.message.TeamUsersInfo;
import com.bytedance.android.livesdkapi.depend.model.live.Room;
import com.bytedance.android.livesdkapi.depend.model.live.match.BattleComboInfo;
import com.bytedance.android.livesdkapi.depend.model.live.match.GiftModeMeta;
import com.bytedance.hybrid.spark.SparkContext;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import com.bytedance.ies.sdk.datachannel.DataChannelGlobal;
import com.bytedance.mt.protector.impl.UriProtector;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.ss.android.ugc.aweme.feed.model.CardStruct;
import com.zhiliaoapp.musically.R;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.AqS179S0100000_13;
import kotlin.jvm.internal.o;

/* renamed from: X.Tzp, reason: case insensitive filesystem */
/* loaded from: classes14.dex */
public abstract class AbstractC76473Tzp<WIDGET extends MatchBaseWidget> implements InterfaceC29986Bpm, InterfaceC28344BAm {
    public WIDGET LJLIL;
    public U0Z LJLILLLLZI;
    public InterfaceC76488U0e LJLJI;
    public C76485U0b<C76414Tys> LJLJJI;
    public U08 LJLJJL;
    public C47061t0 LJLJJLL;
    public C47061t0 LJLJL;
    public C47061t0 LJLJLJ;
    public C29701Eo LJLJLLL;
    public C29701Eo LJLL;
    public C29701Eo LJLLI;
    public C29701Eo LJLLILLLL;
    public C29701Eo LJLLJ;
    public C29701Eo LJLLL;
    public FrameLayout LJLLLL;
    public C47061t0 LJLLLLLL;
    public C47061t0 LJLZ;
    public View LJZ;
    public View LJZI;
    public U46 LJZL;
    public InterfaceC29980Bpg LL;
    public View LLD;
    public SparkContext LLF;
    public C29701Eo LLFF;
    public AnimatorSet LLFFF;
    public C76477Tzt LLFII;
    public FrameLayout LLFZ;

    public abstract boolean LJJJJLL();

    public abstract void LJJJJZI();

    public abstract void LJJJLIIL(boolean z);

    @Override // X.InterfaceC29986Bpm
    public final void g4(LikeHelper likeHelper, int i, int i2, float f, float f2, float f3, float f4) {
    }

    @Override // X.InterfaceC28344BAm
    public final void handleMsg(Message message) {
    }

    public final void LJJIIJ() {
        InterfaceC40159FpT LJIILL;
        SparkContext sparkContext = this.LLF;
        if (sparkContext != null && (LJIILL = sparkContext.LJIILL()) != null) {
            LJIILL.close();
        }
        this.LLF = null;
    }

    public final void LJJIIJZLJL() {
        InterfaceC40159FpT LJIILL;
        SparkContext sparkContext = this.LLF;
        if (sparkContext != null && (LJIILL = sparkContext.LJIILL()) != null) {
            LJIILL.close();
        }
        this.LLF = null;
    }

    public final U08 LJJIIZ() {
        U08 u08 = this.LJLJJL;
        if (u08 != null) {
            return u08;
        }
        o.LJIJI("battleMvpObserverView");
        throw null;
    }

    public final DataChannel LJJIIZI() {
        WIDGET widget = this.LJLIL;
        if (widget != null) {
            return widget.provideDataChannel();
        }
        return null;
    }

    public final InterfaceC76488U0e LJJIJ() {
        InterfaceC76488U0e interfaceC76488U0e = this.LJLJI;
        if (interfaceC76488U0e != null) {
            return interfaceC76488U0e;
        }
        o.LJIJI("healthBarObserverView");
        throw null;
    }

    public final C47061t0 LJJIJIIJI() {
        C47061t0 c47061t0 = this.LJLJJLL;
        if (c47061t0 != null) {
            return c47061t0;
        }
        o.LJIJI("ivCenterAnimation2");
        throw null;
    }

    public final C47061t0 LJJIJIIJIL() {
        C47061t0 c47061t0 = this.LJLJL;
        if (c47061t0 != null) {
            return c47061t0;
        }
        o.LJIJI("ivLeftAnimation");
        throw null;
    }

    public final C47061t0 LJJIJIL() {
        C47061t0 c47061t0 = this.LJLLLLLL;
        if (c47061t0 != null) {
            return c47061t0;
        }
        o.LJIJI("ivLeftResult");
        throw null;
    }

    public final C47061t0 LJJIJL() {
        C47061t0 c47061t0 = this.LJLJLJ;
        if (c47061t0 != null) {
            return c47061t0;
        }
        o.LJIJI("ivRightAnimation");
        throw null;
    }

    public final C47061t0 LJJIJLIJ() {
        C47061t0 c47061t0 = this.LJLZ;
        if (c47061t0 != null) {
            return c47061t0;
        }
        o.LJIJI("ivRightResult");
        throw null;
    }

    public final View LJJIL() {
        View view = this.LJZ;
        if (view != null) {
            return view;
        }
        o.LJIJI("layoutBottomContent");
        throw null;
    }

    public final C29701Eo LJJIZ() {
        C29701Eo c29701Eo = this.LJLLILLLL;
        if (c29701Eo != null) {
            return c29701Eo;
        }
        o.LJIJI("matchResultAnimation");
        throw null;
    }

    public final View LJJJ() {
        View view = this.LJZI;
        if (view != null) {
            return view;
        }
        o.LJIJI("newLayoutBottomContent");
        throw null;
    }

    public final C29701Eo LJJJI() {
        C29701Eo c29701Eo = this.LJLLJ;
        if (c29701Eo != null) {
            return c29701Eo;
        }
        o.LJIJI("newMatchResultLeftAnimation");
        throw null;
    }

    public final C29701Eo LJJJIL() {
        C29701Eo c29701Eo = this.LJLLL;
        if (c29701Eo != null) {
            return c29701Eo;
        }
        o.LJIJI("newMatchResultRightAnimation");
        throw null;
    }

    public final U0Z LJJJJ() {
        U0Z u0z = this.LJLILLLLZI;
        if (u0z != null) {
            return u0z;
        }
        o.LJIJI("observerViewManager");
        throw null;
    }

    public final C29701Eo LJJJJIZL() {
        C29701Eo c29701Eo = this.LJLLI;
        if (c29701Eo != null) {
            return c29701Eo;
        }
        o.LJIJI("twoMatchStartAnimation");
        throw null;
    }

    public final void LJJJJJL() {
        ViewOnClickListenerC76430Tz8 LJLZ;
        C29701Eo c29701Eo = this.LLFF;
        if (c29701Eo != null) {
            c29701Eo.removeAllAnimatorListeners();
            C29701Eo c29701Eo2 = this.LLFF;
            if (c29701Eo2 != null) {
                c29701Eo2.cancelAnimation();
                C29701Eo c29701Eo3 = this.LLFF;
                if (c29701Eo3 != null) {
                    c29701Eo3.setVisibility(8);
                    AnimatorSet animatorSet = this.LLFFF;
                    if (animatorSet != null) {
                        C16880lQ.LJLJJL(animatorSet);
                    }
                    AnimatorSet animatorSet2 = this.LLFFF;
                    if (animatorSet2 != null) {
                        animatorSet2.cancel();
                    }
                    LJJJIL().removeAllAnimatorListeners();
                    LJJJIL().setVisibility(8);
                    LJJJIL().cancelAnimation();
                    LJJJI().removeAllAnimatorListeners();
                    LJJJI().setVisibility(8);
                    LJJJI().cancelAnimation();
                    LJJIZ().removeAllAnimatorListeners();
                    LJJIZ().cancelAnimation();
                    LJJIZ().setVisibility(8);
                    LJJIIZ().LIZ();
                    C76477Tzt c76477Tzt = this.LLFII;
                    if (c76477Tzt != null) {
                        AnimatorSet animatorSet3 = c76477Tzt.LJLJJI;
                        if (animatorSet3 != null) {
                            animatorSet3.cancel();
                        }
                        AnimatorSet animatorSet4 = c76477Tzt.LJLJJI;
                        if (animatorSet4 != null) {
                            C16880lQ.LJLJJL(animatorSet4);
                        }
                        C29701Eo c29701Eo4 = c76477Tzt.LJLIL;
                        if (c29701Eo4 != null) {
                            c29701Eo4.cancelAnimation();
                        }
                        C29701Eo c29701Eo5 = c76477Tzt.LJLILLLLZI;
                        if (c29701Eo5 != null) {
                            c29701Eo5.cancelAnimation();
                        }
                        C29701Eo c29701Eo6 = c76477Tzt.LJLJI;
                        if (c29701Eo6 != null) {
                            c29701Eo6.cancelAnimation();
                        }
                        C29701Eo c29701Eo7 = c76477Tzt.LJLIL;
                        if (c29701Eo7 != null) {
                            c29701Eo7.setVisibility(8);
                        }
                        C29701Eo c29701Eo8 = c76477Tzt.LJLILLLLZI;
                        if (c29701Eo8 != null) {
                            c29701Eo8.setVisibility(8);
                        }
                        C29701Eo c29701Eo9 = c76477Tzt.LJLJI;
                        if (c29701Eo9 != null) {
                            c29701Eo9.setVisibility(8);
                        }
                        c76477Tzt.setVisibility(8);
                    }
                    FrameLayout frameLayout = this.LLFZ;
                    if (frameLayout != null) {
                        frameLayout.setVisibility(8);
                    }
                    C76477Tzt c76477Tzt2 = this.LLFII;
                    if (c76477Tzt2 != null) {
                        c76477Tzt2.setVisibility(8);
                    }
                    Iterator LIZLLL = C08880Wm.LIZLLL();
                    while (LIZLLL.hasNext()) {
                        C75883TqJ c75883TqJ = (C75883TqJ) LIZLLL.next();
                        WIDGET widget = this.LJLIL;
                        if (widget != null && (LJLZ = widget.LJLZ(c75883TqJ.LIZ)) != null) {
                            LJLZ.LJL();
                        }
                    }
                    return;
                }
                o.LJIJI("mvpAnimation");
                throw null;
            }
            o.LJIJI("mvpAnimation");
            throw null;
        }
        o.LJIJI("mvpAnimation");
        throw null;
    }

    public void LJJJJL() {
        U08 u1j;
        WIDGET widget = this.LJLIL;
        if (widget != null) {
            View findViewById = widget.findViewById(R.id.ezv);
            o.LJIIIIZZ(findViewById, "findViewById(R.id.iv_center_animation_2)");
            this.LJLJJLL = (C47061t0) findViewById;
            View findViewById2 = widget.findViewById(R.id.gat);
            o.LJIIIIZZ(findViewById2, "findViewById(R.id.lv_battle_mvp)");
            this.LLFF = (C29701Eo) findViewById2;
            View findViewById3 = widget.findViewById(R.id.f5y);
            o.LJIIIIZZ(findViewById3, "findViewById(R.id.iv_left_animation)");
            this.LJLJL = (C47061t0) findViewById3;
            View findViewById4 = widget.findViewById(R.id.f_2);
            o.LJIIIIZZ(findViewById4, "findViewById(R.id.iv_right_animation)");
            this.LJLJLJ = (C47061t0) findViewById4;
            this.LLFZ = (FrameLayout) widget.findViewById(R.id.apa);
            View findViewById5 = widget.findViewById(R.id.ffz);
            o.LJIIIIZZ(findViewById5, "findViewById(R.id.lav_left_animation)");
            this.LJLJLLL = (C29701Eo) findViewById5;
            View findViewById6 = widget.findViewById(R.id.fg1);
            o.LJIIIIZZ(findViewById6, "findViewById(R.id.lav_right_animation)");
            this.LJLL = (C29701Eo) findViewById6;
            View findViewById7 = widget.findViewById(R.id.gfh);
            o.LJIIIIZZ(findViewById7, "findViewById(R.id.match_result_anim)");
            this.LJLLILLLL = (C29701Eo) findViewById7;
            View findViewById8 = widget.findViewById(R.id.gfi);
            o.LJIIIIZZ(findViewById8, "findViewById(R.id.match_result_anim_left)");
            this.LJLLJ = (C29701Eo) findViewById8;
            View findViewById9 = widget.findViewById(R.id.gfk);
            o.LJIIIIZZ(findViewById9, "findViewById(R.id.match_result_anim_right)");
            this.LJLLL = (C29701Eo) findViewById9;
            View findViewById10 = widget.findViewById(R.id.mra);
            o.LJIIIIZZ(findViewById10, "findViewById(R.id.two_match_start_anim)");
            this.LJLLI = (C29701Eo) findViewById10;
            this.LLFII = (C76477Tzt) widget.findViewById(R.id.ahp);
            View findViewById11 = widget.findViewById(R.id.f61);
            C47061t0 c47061t0 = (C47061t0) findViewById11;
            o.LJIIIIZZ(c47061t0, "this");
            LJJLIIIIJ(c47061t0);
            o.LJIIIIZZ(findViewById11, "findViewById<HSImageView…ayout(this)\n            }");
            this.LJLLLLLL = (C47061t0) findViewById11;
            View findViewById12 = widget.findViewById(R.id.f_7);
            C47061t0 c47061t02 = (C47061t0) findViewById12;
            o.LJIIIIZZ(c47061t02, "this");
            LJJLIIIIJ(c47061t02);
            o.LJIIIIZZ(findViewById12, "findViewById<HSImageView…ayout(this)\n            }");
            this.LJLZ = (C47061t0) findViewById12;
            View findViewById13 = widget.findViewById(R.id.fh3);
            o.LJIIIIZZ(findViewById13, "findViewById(R.id.layout_bottom_content)");
            this.LJZ = findViewById13;
            if (C76128TuG.LIZIZ(widget.dataChannel, false, 6)) {
                LJJIL().setVisibility(8);
            }
            View findViewById14 = widget.findViewById(R.id.fh4);
            o.LJIIIIZZ(findViewById14, "findViewById(R.id.layout_bottom_content_new)");
            this.LJZI = findViewById14;
            this.LJLLLL = (FrameLayout) widget.findViewById(R.id.fj9);
            DataChannel LJJIIZI = LJJIIZI();
            this.LJLILLLLZI = new U0Z(widget.getView(), LJJIIZI);
            this.LJLJI = new C76476Tzs();
            LJJIJ().LIZIZ(LJJJJ(), LJJIIZI, widget);
            if (!C76128TuG.LIZIZ(LJJIIZI(), false, 6)) {
                C76484U0a LIZ = LJJJJ().LIZ(R.id.fjb);
                LIZ.LJFF = U0Y.LJLIL;
                LIZ.LJ = widget;
                this.LJLJJI = LIZ.LIZIZ(BattleTimeLeftChannel.class, C76415Tyt.LIZ).LIZIZ(BattlePunishTimeLeftChannel.class, new C76475Tzr(this)).LIZIZ(BattleDrawTimeLeftChannel.class, C76419Tyx.LIZ).LIZ();
            }
            if (C76128TuG.LIZIZ(LJJIIZI, false, 6)) {
                u1j = new U1I();
            } else {
                u1j = new U1J();
            }
            this.LJLJJL = u1j;
            LJJIIZ().LIZJ(LJJJJ(), widget);
            LJJIIZ().start();
            LJJIIZ().LJ(new AqS179S0100000_13(this, 528));
            if (C76128TuG.LIZIZ(LJJIIZI(), false, 6)) {
                DataChannel LJJIIZI2 = LJJIIZI();
                if (LJJIIZI2 != null) {
                    LJJIIZI2.lv0(widget, BattleMvpAnimationStartEvent.class, new AqS179S0100000_13(this, 529));
                }
                DataChannel LJJIIZI3 = LJJIIZI();
                if (LJJIIZI3 != null) {
                    LJJIIZI3.lv0(widget, BattleMvpStarAnimationStartEvent.class, new AqS179S0100000_13(this, 530));
                }
            }
        }
    }

    public final void LJJJLL() {
        ViewOnClickListenerC76430Tz8 LJLZ;
        C0NB.LJIIIZ("match_redesign", "onNewMatchStartComponentHide");
        for (C75883TqJ c75883TqJ : C8E.LIZLLL().LJIL()) {
            WIDGET widget = this.LJLIL;
            if (widget != null && (LJLZ = widget.LJLZ(c75883TqJ.LIZ)) != null) {
                View findViewById = LJLZ.findViewById(R.id.dc6);
                o.LJIIIIZZ(findViewById, "window.findViewById(R.id.fl_anchor_info)");
                View findViewById2 = LJLZ.findViewById(R.id.f7k);
                o.LJIIIIZZ(findViewById2, "window.findViewById(R.id.iv_mute_status_new)");
                View findViewById3 = LJLZ.findViewById(R.id.fix);
                o.LJIIIIZZ(findViewById3, "window.findViewById(R.id…out_host_score_container)");
                findViewById.setAlpha(0.0f);
                findViewById2.setAlpha(0.0f);
                findViewById3.setAlpha(0.0f);
            }
        }
        DataChannel LJJIIZI = LJJIIZI();
        if (LJJIIZI != null) {
            LJJIIZI.rv0(MatchGiftTrayDodgeEvent.class, new LBL(130L, 1.0f, 0.3f));
        }
    }

    public final void LJJJZ() {
        View view;
        boolean z;
        View view2;
        InterfaceC55235Lm3 LJFF;
        IPKCountDownTitleAbility iPKCountDownTitleAbility;
        InterfaceC55235Lm3 LJFF2;
        C76414Tys c76414Tys;
        GiftModeMeta giftModeMeta;
        boolean z2;
        int i;
        int i2;
        C76485U0b<C76414Tys> c76485U0b = this.LJLJJI;
        if (c76485U0b != null && (c76414Tys = c76485U0b.LIZIZ) != null && (giftModeMeta = C76265TwT.LIZ.LJIILLIIL) != null && giftModeMeta.giftId != 0 && c76414Tys.LJLJJLL > 30) {
            c76414Tys.LIZ(R.id.fgu).getLayoutParams().width = -2;
            c76414Tys.LIZ(R.id.fgu).setVisibility(0);
            c76414Tys.LIZ(R.id.fgu).setBackgroundResource(R.drawable.d9q);
            ((ImageView) c76414Tys.LIZ(R.id.f8n)).setVisibility(0);
            c76414Tys.LIZ(R.id.fgv).setVisibility(8);
            c76414Tys.LIZ(R.id.fjd).setVisibility(8);
            ImageView imageView = (ImageView) c76414Tys.LIZ(R.id.f8k);
            if (imageView != null) {
                imageView.setVisibility(8);
            }
            c76414Tys.LIZ(R.id.me0).setAlpha(1.0f);
            c76414Tys.LIZ(R.id.me0).setVisibility(0);
            c76414Tys.LIZ(R.id.mcp).setVisibility(0);
            c76414Tys.LIZ(R.id.mcp).setAlpha(0.0f);
            String tipContent = C15380j0.LJIILL(R.string.mxs, C86881Y7x.LIZIZ().LIZ(giftModeMeta.giftNameKey));
            float measureText = ((TextView) c76414Tys.LIZ(R.id.mcp)).getPaint().measureText(tipContent);
            if (measureText > C15380j0.LIZ(163.0f)) {
                z2 = true;
            } else {
                z2 = false;
            }
            int measuredWidth = c76414Tys.LIZ(R.id.mcp).getMeasuredWidth();
            if (z2) {
                i2 = C15380j0.LIZ(163.0f);
                i = C15380j0.LIZ(163.0f) - c76414Tys.LIZ(R.id.me0).getMeasuredWidth();
            } else {
                i = ((int) measureText) - measuredWidth;
                i2 = 0;
            }
            int measuredWidth2 = c76414Tys.LIZ(R.id.fgu).getMeasuredWidth() + i;
            o.LJIIIIZZ(tipContent, "tipContent");
            int measuredWidth3 = c76414Tys.LIZ(R.id.fgu).getMeasuredWidth();
            ((TextView) c76414Tys.LIZ(R.id.mcp)).setText(tipContent);
            ((CMV) c76414Tys.LIZ(R.id.mcp)).LJJIL();
            AnonymousClass064 anonymousClass064 = new AnonymousClass064();
            anonymousClass064.LJII((ConstraintLayout) c76414Tys.LIZ(R.id.fgu));
            anonymousClass064.LJIIL(R.id.mcp, i2);
            anonymousClass064.LIZIZ((ConstraintLayout) c76414Tys.LIZ(R.id.fgu));
            float f = measuredWidth3;
            float f2 = measuredWidth2;
            ValueAnimator ofFloat = ValueAnimator.ofFloat(f, f2);
            ofFloat.setDuration(300L);
            ofFloat.setInterpolator(C18950ol.LIZIZ(0.33f, 0.0f, 0.35f, 1.0f));
            ofFloat.addUpdateListener(new AUListenerS100S0100000_13(c76414Tys, 7));
            ofFloat.addListener(new ALAdapterS2S0000000_5(0));
            ObjectAnimator ofFloat2 = ObjectAnimator.ofFloat(c76414Tys.LIZ(R.id.me0), (Property<View, Float>) View.ALPHA, 1.0f, 0.0f);
            ofFloat2.setDuration(200L);
            ofFloat2.setInterpolator(C18950ol.LIZIZ(0.65f, 0.0f, 1.0f, 1.0f));
            ofFloat2.addUpdateListener(new AUListenerS100S0100000_13(c76414Tys, 6));
            ObjectAnimator ofFloat3 = ObjectAnimator.ofFloat(c76414Tys.LIZ(R.id.mcp), (Property<View, Float>) View.ALPHA, 0.0f, 1.0f);
            ofFloat3.setDuration(200L);
            ofFloat3.setInterpolator(C18950ol.LIZIZ(0.0f, 0.0f, 0.35f, 1.0f));
            ValueAnimator ofInt = ValueAnimator.ofInt(0, 5000);
            ofInt.setDuration(5000L);
            ofInt.addListener(new ALAdapterS5S0000000_13(0));
            ValueAnimator ofFloat4 = ValueAnimator.ofFloat(0.0f, 1.0f);
            ofFloat4.setDuration(1000L);
            ofFloat4.addListener(new ALAdapterS4S0110000_13(z2, c76414Tys, 0));
            ValueAnimator ofFloat5 = ValueAnimator.ofFloat(f2, f);
            ofFloat5.setDuration(300L);
            ofFloat5.setInterpolator(C18950ol.LIZIZ(0.64f, 0.0f, 0.67f, 1.0f));
            ofFloat5.addUpdateListener(new AUListenerS100S0100000_13(c76414Tys, 8));
            ofFloat5.addListener(new ALAdapterS10S0100000_13(c76414Tys, 3));
            ObjectAnimator ofFloat6 = ObjectAnimator.ofFloat(c76414Tys.LIZ(R.id.mcp), (Property<View, Float>) View.ALPHA, 1.0f, 0.0f);
            ofFloat6.setDuration(200L);
            ofFloat6.setInterpolator(C18950ol.LIZIZ(0.65f, 0.0f, 1.0f, 1.0f));
            ObjectAnimator ofFloat7 = ObjectAnimator.ofFloat(c76414Tys.LIZ(R.id.me0), (Property<View, Float>) View.ALPHA, 0.0f, 1.0f);
            ofFloat7.setDuration(200L);
            ofFloat7.setInterpolator(C18950ol.LIZIZ(0.0f, 0.0f, 0.35f, 1.0f));
            ofFloat7.addUpdateListener(new AUListenerS100S0100000_13(c76414Tys, 5));
            AnimatorSet animatorSet = new AnimatorSet();
            ValueAnimator ofFloat8 = ValueAnimator.ofFloat(0.0f, 1.0f);
            ofFloat8.setDuration(100L);
            ValueAnimator ofFloat9 = ValueAnimator.ofFloat(0.0f, 1.0f);
            ofFloat9.setDuration(100L);
            animatorSet.play(ofFloat).with(ofFloat2).with(ofFloat8).before(ofInt);
            animatorSet.play(ofFloat8).before(ofFloat3);
            animatorSet.play(ofInt).with(ofFloat4).before(ofFloat5);
            animatorSet.play(ofFloat6).with(ofFloat5).with(ofFloat9);
            animatorSet.play(ofFloat7).after(ofFloat9);
            animatorSet.addListener(new ALAdapterS2S0101000_13(c76414Tys, measuredWidth3, 0));
            animatorSet.start();
            c76414Tys.LJLJI = animatorSet;
        }
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("findFragment(getWidget()?.view)?.vScopeOrNull()?.pkCountDownAbility() == null = ");
        WIDGET widget = this.LJLIL;
        if (widget != null) {
            view = widget.getView();
        } else {
            view = null;
        }
        Fragment LJIIIZ = C79234V7u.LJIIIZ(view);
        if (LJIIIZ == null || (LJFF2 = C55230Lly.LJFF(LJIIIZ, null)) == null || C55096Ljo.LIZ(LJFF2, IPKCountDownTitleAbility.class, null) == null) {
            z = true;
        } else {
            z = false;
        }
        C19U.LIZJ(LIZ, z, LIZ, "TitleLayoutAbility");
        WIDGET widget2 = this.LJLIL;
        if (widget2 != null) {
            view2 = widget2.getView();
        } else {
            view2 = null;
        }
        Fragment LJIIIZ2 = C79234V7u.LJIIIZ(view2);
        if (LJIIIZ2 != null && (LJFF = C55230Lly.LJFF(LJIIIZ2, null)) != null && (iPKCountDownTitleAbility = (IPKCountDownTitleAbility) C55096Ljo.LIZ(LJFF, IPKCountDownTitleAbility.class, null)) != null) {
            iPKCountDownTitleAbility.Bo0();
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:80:0x0142  */
    /* JADX WARN: Removed duplicated region for block: B:83:0x015f A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:86:0x0034 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:87:0x0164  */
    /* JADX WARN: Removed duplicated region for block: B:88:0x0167  */
    /* JADX WARN: Removed duplicated region for block: B:89:0x016f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void LJJLIIIJILLIZJL() {
        /*
            Method dump skipped, instructions count: 514
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AbstractC76473Tzp.LJJLIIIJILLIZJL():void");
    }

    public final void LJJLIIIJLLLLLLLZ() {
        if (this.LJLIL == null || C8E.LIZLLL().LLII() != EnumC75620Tm4.Linked) {
            return;
        }
        LinkCrossRoomDataHolder LIZIZ = B5G.LIZIZ();
        boolean LJ = C76265TwT.LJ();
        int i = LIZIZ.LJIL + LIZIZ.LJJ;
        C32208CkW c32208CkW = new C32208CkW(0);
        c32208CkW.LIZJ = LJ;
        c32208CkW.LIZIZ = i;
        DataChannel LJJIIZI = LJJIIZI();
        if (LJJIIZI == null) {
            return;
        }
        LJJIIZI.rv0(LinkCrossRoomStateChangeEvent.class, c32208CkW);
    }

    static {
        C15380j0.LIZLLL().getResources().getDimensionPixelSize(R.dimen.adx);
    }

    public void LJJIII() {
        LJJIIJ();
        LJJIIJZLJL();
    }

    public final Room LJJJJI() {
        DataChannel LJJIIZI = LJJIIZI();
        if (LJJIIZI != null) {
            return (Room) LJJIIZI.kv0(RoomChannel.class);
        }
        return null;
    }

    public final boolean LJJJJLI() {
        DataChannel LJJIIZI = LJJIIZI();
        if (LJJIIZI != null) {
            return o.LJ(LJJIIZI.kv0(UserIsAnchorChannel.class), Boolean.TRUE);
        }
        return false;
    }

    public final void LJJL() {
        ViewOnClickListenerC76430Tz8 LJLZ;
        int i;
        Iterator LIZLLL = C08880Wm.LIZLLL();
        while (LIZLLL.hasNext()) {
            C75883TqJ c75883TqJ = (C75883TqJ) LIZLLL.next();
            WIDGET widget = this.LJLIL;
            if (widget != null && (LJLZ = widget.LJLZ(c75883TqJ.LIZ)) != null) {
                View findViewById = LJLZ.findViewById(R.id.air);
                o.LJIIIIZZ(findViewById, "window.findViewById(R.id…_teammate_container_view)");
                C76217Tvh c76217Tvh = (C76217Tvh) findViewById;
                int width = (int) (LJLZ.getWidth() * 0.43f);
                View findViewById2 = LJLZ.findViewById(R.id.bd5);
                o.LJIIIIZZ(findViewById2, "window.findViewById(R.id.cl_info_container)");
                View findViewById3 = LJLZ.findViewById(R.id.lzn);
                o.LJIIIIZZ(findViewById3, "window.findViewById(R.id.tv_anchor_display_id)");
                ViewGroup.LayoutParams layoutParams = findViewById3.getLayoutParams();
                if (!(layoutParams instanceof ViewGroup.MarginLayoutParams)) {
                    layoutParams = null;
                }
                ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams;
                if (marginLayoutParams != null) {
                    i = marginLayoutParams.leftMargin;
                } else {
                    i = 0;
                }
                int width2 = findViewById2.getWidth();
                if (LJLZ.getNameShowState()) {
                    if (width2 >= width) {
                        LJLZ.LJLJJI = false;
                    }
                    LJLZ.LJLJJL = false;
                }
                if (c76217Tvh.getVisibility() == 0) {
                    if (LJLZ.getWidthState()) {
                        C29306Beo.LJI(c76217Tvh);
                        c76217Tvh.LIZ();
                        C29306Beo.LJJJLIIL(i - C15380j0.LIZ(16.0f), findViewById3);
                        C78866UxK.LJJLJ(width2 - C15380j0.LIZ(16.0f), findViewById2);
                        LJLZ.LJLJJI = false;
                    } else {
                        C29306Beo.LJI(c76217Tvh);
                        c76217Tvh.LIZ();
                        C29306Beo.LJJJLIIL(i - C15380j0.LIZ(16.0f), findViewById3);
                    }
                }
            }
        }
    }

    public final void LJJLIIIJ() {
        long j;
        DataChannel LJJIIZI = LJJIIZI();
        if ((LJJIIZI != null && o.LJ(LJJIIZI.kv0(UserIsAnchorChannel.class), Boolean.TRUE)) || !C76265TwT.LIZ.LJJIIJ) {
            return;
        }
        if (this.LL == null) {
            IBarrageService iBarrageService = (IBarrageService) CN1.LIZ(IBarrageService.class);
            Room LJJJJI = LJJJJI();
            if (LJJJJI != null) {
                j = LJJJJI.getId();
            } else {
                j = 0;
            }
            this.LL = iBarrageService.hq0(j);
        }
        InterfaceC29980Bpg interfaceC29980Bpg = this.LL;
        if (interfaceC29980Bpg != null && interfaceC29980Bpg.isEnabled() && interfaceC29980Bpg.LIZIZ()) {
            interfaceC29980Bpg.LJ(this);
            interfaceC29980Bpg.LJIIJ();
            this.LLD = interfaceC29980Bpg.LJIJI();
            interfaceC29980Bpg.LIZ(LJJIJ().LIZ());
        }
    }

    public static void LJJLIIIIJ(C47061t0 c47061t0) {
        ViewGroup.LayoutParams layoutParams = c47061t0.getLayoutParams();
        o.LJII(layoutParams, "null cannot be cast to non-null type androidx.constraintlayout.widget.ConstraintLayout.LayoutParams");
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams;
        marginLayoutParams.width = C15380j0.LIZ(70.0f);
        marginLayoutParams.height = C15380j0.LIZ(76.0f);
        marginLayoutParams.bottomMargin = C15380j0.LIZ(28.0f);
        c47061t0.setLayoutParams(marginLayoutParams);
    }

    public final void LJJII(C47121t6 c47121t6) {
        boolean z;
        String LJIILL;
        long j;
        User owner;
        java.util.Map<Long, BattleComboInfo> map = C76265TwT.LIZ.LJIJJLI;
        long j2 = 0;
        if (map != null) {
            Room LJJJJI = LJJJJI();
            if (LJJJJI != null && (owner = LJJJJI.getOwner()) != null) {
                j = owner.getId();
            } else {
                j = 0;
            }
            BattleComboInfo battleComboInfo = map.get(Long.valueOf(j));
            if (battleComboInfo != null) {
                j2 = battleComboInfo.comboCount;
            }
        }
        long j3 = j2 + 1;
        DataChannel LJJIIZI = LJJIIZI();
        if (LJJIIZI != null) {
            z = o.LJ(LJJIIZI.kv0(UserIsAnchorChannel.class), Boolean.TRUE);
        } else {
            z = false;
        }
        if (z) {
            LJIILL = C15380j0.LJIILL(R.string.nnx, Integer.valueOf((int) j3));
            o.LJIIIIZZ(LJIILL, "{\n            ResUtil.ge… count.toInt())\n        }");
        } else {
            LJIILL = C15380j0.LJIILL(R.string.mhz, Integer.valueOf((int) j3));
            o.LJIIIIZZ(LJIILL, "{\n            ResUtil.ge… count.toInt())\n        }");
        }
        c47121t6.setText(LJIILL);
    }

    public void LJJJJZ(WIDGET widget) {
        o.LJIIIZ(widget, "widget");
        this.LJLIL = widget;
        LJJJJL();
    }

    public final void LJJJLZIJ(boolean z) {
        ViewOnClickListenerC76430Tz8 LJLZ;
        User owner;
        C0NB.LJIIIZ("match_redesign", "onNewMatchStartComponentOccur");
        ArrayList arrayList = new ArrayList();
        Iterator LIZLLL = C08880Wm.LIZLLL();
        while (LIZLLL.hasNext()) {
            C75883TqJ c75883TqJ = (C75883TqJ) LIZLLL.next();
            WIDGET widget = this.LJLIL;
            if (widget != null && (LJLZ = widget.LJLZ(c75883TqJ.LIZ)) != null) {
                Room LJJJJI = LJJJJI();
                if (LJJJJI != null && (owner = LJJJJI.getOwner()) != null && owner.getId() == c75883TqJ.LIZ) {
                    arrayList.add(LJJIFFI(LJLZ, true));
                } else {
                    arrayList.add(LJJIFFI(LJLZ, false));
                }
            }
        }
        if (!z) {
            ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
            ofFloat.addUpdateListener(new AUListenerS102S0200000_13(ofFloat, this, 11));
            ofFloat.setInterpolator(C18950ol.LIZIZ(0.33f, 0.0f, 0.67f, 1.0f));
            arrayList.add(ofFloat);
        }
        if (!arrayList.isEmpty()) {
            AnimatorSet animatorSet = new AnimatorSet();
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                Animator animator = (Animator) it.next();
                animator.setDuration(200L);
                animatorSet.play(animator);
            }
            animatorSet.addListener(new ALAdapterS4S0110000_13(z, this, 2));
            animatorSet.start();
        }
    }

    public final void LJJLI(boolean z) {
        InterfaceC29980Bpg interfaceC29980Bpg;
        if (!LJJJJLI() && (interfaceC29980Bpg = this.LL) != null) {
            if (z) {
                interfaceC29980Bpg.LJIILJJIL(this);
            }
            interfaceC29980Bpg.LIZJ();
            if (o.LJ(interfaceC29980Bpg.LJIJI(), LJJIJ().LIZ())) {
                interfaceC29980Bpg.LIZ(this.LLD);
            }
        }
    }

    public final void LJJLIIIJJI(String lynxUrl) {
        Context context;
        o.LJIIIZ(lynxUrl, "lynxUrl");
        WIDGET widget = this.LJLIL;
        if (widget != null && (context = widget.context) != null) {
            InterfaceC06390Mx LIZ = CN1.LIZ(IHybridContainerService.class);
            o.LJIIIIZZ(LIZ, "getService(IHybridContainerService::class.java)");
            this.LLF = ((IHybridContainerService) LIZ).Vs0(context, lynxUrl, null);
        }
    }

    public static Animator LJJIFFI(ViewOnClickListenerC76430Tz8 viewOnClickListenerC76430Tz8, final boolean z) {
        final View findViewById = viewOnClickListenerC76430Tz8.findViewById(R.id.dc6);
        o.LJIIIIZZ(findViewById, "window.findViewById(R.id.fl_anchor_info)");
        final View findViewById2 = viewOnClickListenerC76430Tz8.findViewById(R.id.f7k);
        o.LJIIIIZZ(findViewById2, "window.findViewById(R.id.iv_mute_status_new)");
        final View findViewById3 = viewOnClickListenerC76430Tz8.findViewById(R.id.fix);
        o.LJIIIIZZ(findViewById3, "window.findViewById(R.id…out_host_score_container)");
        final ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
        ofFloat.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: X.3Xt
            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public final void onAnimationUpdate(ValueAnimator it) {
                o.LJIIIZ(it, "it");
                Object animatedValue = ofFloat.getAnimatedValue();
                o.LJII(animatedValue, "null cannot be cast to non-null type kotlin.Float");
                float floatValue = ((Float) animatedValue).floatValue();
                if (!z) {
                    findViewById.setAlpha(floatValue);
                    if (findViewById2.getVisibility() == 0) {
                        findViewById2.setAlpha(floatValue);
                    }
                }
                if (findViewById3.getVisibility() == 0) {
                    findViewById3.setAlpha(floatValue);
                }
            }
        });
        ofFloat.setInterpolator(C18950ol.LIZIZ(0.33f, 0.0f, 0.67f, 1.0f));
        return ofFloat;
    }

    /* JADX WARN: Removed duplicated region for block: B:26:0x00f4  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x0122  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x0127  */
    /* JADX WARN: Removed duplicated region for block: B:62:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:64:0x00e4  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x011c  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void LJJI(int r9, boolean r10) {
        /*
            Method dump skipped, instructions count: 355
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AbstractC76473Tzp.LJJI(int, boolean):void");
    }

    public final void LJJLIIIJJIZ(InterfaceC65784Pro interfaceC65784Pro, boolean z) {
        C47061t0 LJJIJL;
        C29701Eo c29701Eo;
        if (LiveMatchAnimationOptSettings.INSTANCE.getPunishAnimUseLottie()) {
            if (z) {
                c29701Eo = this.LJLJLLL;
                if (c29701Eo == null) {
                    o.LJIJI("lavLeftAnimation");
                    throw null;
                }
            } else {
                c29701Eo = this.LJLL;
                if (c29701Eo == null) {
                    o.LJIJI("lavRightAnimation");
                    throw null;
                }
            }
            c29701Eo.setVisibility(0);
            CL6.LIZIZ("match_punish_prepare");
            ViewGroup.LayoutParams layoutParams = c29701Eo.getLayoutParams();
            o.LJII(layoutParams, "null cannot be cast to non-null type android.widget.FrameLayout.LayoutParams");
            FrameLayout.LayoutParams layoutParams2 = (FrameLayout.LayoutParams) layoutParams;
            layoutParams2.width = C15380j0.LIZ(147.0f);
            layoutParams2.height = C15380j0.LIZ(147.0f);
            layoutParams2.bottomMargin = C15380j0.LIZ(21.0f);
            c29701Eo.setLayoutParams(layoutParams2);
            ARunnableS32S0200000_13 aRunnableS32S0200000_13 = new ARunnableS32S0200000_13(c29701Eo, interfaceC65784Pro, 113);
            if (Build.VERSION.SDK_INT >= 26) {
                c29701Eo.useHardwareAcceleration(true);
            }
            C15490jB.LJIIL(c29701Eo, "tiktok_live_match_resource", "ttlive_match_punish_anim_lose.zip", "images", true, null, null, 64);
            c29701Eo.postDelayed(aRunnableS32S0200000_13, 3800L);
            return;
        }
        if (z) {
            LJJIJL = LJJIJIIJIL();
        } else {
            LJJIJL = LJJIJL();
        }
        LJJIJL.setVisibility(0);
        CL6.LIZIZ("match_punish_prepare");
        ViewGroup.LayoutParams layoutParams3 = LJJIJL.getLayoutParams();
        o.LJII(layoutParams3, "null cannot be cast to non-null type android.widget.FrameLayout.LayoutParams");
        FrameLayout.LayoutParams layoutParams4 = (FrameLayout.LayoutParams) layoutParams3;
        layoutParams4.width = C15380j0.LIZ(147.0f);
        layoutParams4.height = C15380j0.LIZ(147.0f);
        layoutParams4.bottomMargin = C15380j0.LIZ(21.0f);
        LJJIJL.setLayoutParams(layoutParams4);
        ARunnableS32S0200000_13 aRunnableS32S0200000_132 = new ARunnableS32S0200000_13(LJJIJL, interfaceC65784Pro, 112);
        C75622Tm6.LJIJI(EnumC76429Tz7.RESULT_ANIMATION, true, null);
        C15490jB.LJFF(LJJIJL, CFX.LIZ("tiktok_live_interaction_resource", "tiktok_live_interaction_normal_2"), "live_battle_lose_animation_2.webp", ImageView.ScaleType.CENTER_CROP, new U0U());
        LJJIJL.postDelayed(aRunnableS32S0200000_132, 3800L);
    }

    public final void LJJLIIIJL(InterfaceC65784Pro interfaceC65784Pro, boolean z) {
        C47061t0 LJJIJL;
        C29701Eo c29701Eo;
        if (LiveMatchAnimationOptSettings.INSTANCE.getPunishAnimUseLottie()) {
            if (z) {
                c29701Eo = this.LJLJLLL;
                if (c29701Eo == null) {
                    o.LJIJI("lavLeftAnimation");
                    throw null;
                }
            } else {
                c29701Eo = this.LJLL;
                if (c29701Eo == null) {
                    o.LJIJI("lavRightAnimation");
                    throw null;
                }
            }
            c29701Eo.setVisibility(0);
            CL6.LIZIZ("match_punish_prepare");
            ViewGroup.LayoutParams layoutParams = c29701Eo.getLayoutParams();
            o.LJII(layoutParams, "null cannot be cast to non-null type android.widget.FrameLayout.LayoutParams");
            FrameLayout.LayoutParams layoutParams2 = (FrameLayout.LayoutParams) layoutParams;
            layoutParams2.width = C15380j0.LIZ(159.5f);
            layoutParams2.height = C15380j0.LIZ(192.5f);
            layoutParams2.bottomMargin = C15380j0.LIZ(21.0f);
            c29701Eo.setLayoutParams(layoutParams2);
            ARunnableS32S0200000_13 aRunnableS32S0200000_13 = new ARunnableS32S0200000_13(c29701Eo, interfaceC65784Pro, 110);
            if (Build.VERSION.SDK_INT >= 26) {
                c29701Eo.useHardwareAcceleration(true);
            }
            C15490jB.LJIIL(c29701Eo, "tiktok_live_match_resource", "ttlive_match_punish_anim_win.zip", "images", true, null, null, 64);
            c29701Eo.postDelayed(aRunnableS32S0200000_13, 3800L);
            return;
        }
        if (z) {
            LJJIJL = LJJIJIIJIL();
        } else {
            LJJIJL = LJJIJL();
        }
        LJJIJL.setVisibility(0);
        CL6.LIZIZ("match_punish_prepare");
        ViewGroup.LayoutParams layoutParams3 = LJJIJL.getLayoutParams();
        o.LJII(layoutParams3, "null cannot be cast to non-null type android.widget.FrameLayout.LayoutParams");
        FrameLayout.LayoutParams layoutParams4 = (FrameLayout.LayoutParams) layoutParams3;
        layoutParams4.width = C15380j0.LIZ(159.5f);
        layoutParams4.height = C15380j0.LIZ(192.5f);
        layoutParams4.bottomMargin = C15380j0.LIZ(21.0f);
        LJJIJL.setLayoutParams(layoutParams4);
        ARunnableS32S0200000_13 aRunnableS32S0200000_132 = new ARunnableS32S0200000_13(LJJIJL, interfaceC65784Pro, 109);
        C75622Tm6.LJIJI(EnumC76429Tz7.RESULT_ANIMATION, true, null);
        C15490jB.LJFF(LJJIJL, CFX.LIZ("tiktok_live_interaction_resource", "tiktok_live_interaction_normal_3"), "live_battle_win_animation_2.webp", ImageView.ScaleType.CENTER_CROP, new U0T());
        LJJIJL.postDelayed(aRunnableS32S0200000_132, 3800L);
    }

    @Override // X.InterfaceC29986Bpm
    public final void dc(LikeHelper likeHelper, String str) {
        C15610jN.LIZIZ(new ARunnableS14S1100000_13(this, str, 11));
    }

    @Override // X.InterfaceC29986Bpm
    public final void t3(LikeHelper likeHelper, int i) {
        C76265TwT.LIZ.LJJIIJ = false;
        LJJLI(false);
    }

    public static String LJJJJJ(int i, int i2, int i3) {
        List LJJIJIIJI = C47261Igj.LJJIJIIJI(C47261Igj.LJJIJIIJI("image_85", "image_83", "image_92", "image_90"), C47261Igj.LJJIJIIJI("image_40", "image_38", "image_47", "image_45"), C47261Igj.LJJIJIIJI("image_33", "image_31", "image_45", "image_47"), C47261Igj.LJJIJIIJI("image_40", "image_38", "image_53", "image_51"), C47261Igj.LJJIJIIJI("image_8", "image_6", "image_15", "image_13"));
        if (i3 == 0) {
            if (i == 0) {
                return (String) ListProtector.get((List) ListProtector.get(LJJIJIIJI, i2), 1);
            }
            return (String) ListProtector.get((List) ListProtector.get(LJJIJIIJI, i2), 0);
        }
        if (i == 0) {
            return (String) ListProtector.get((List) ListProtector.get(LJJIJIIJI, i2), 3);
        }
        return (String) ListProtector.get((List) ListProtector.get(LJJIJIIJI, i2), 2);
    }

    public final Uri.Builder LJJ(boolean z, Long l, String scheme) {
        Room room;
        List<TeamUsersInfo> list;
        WIDGET widget;
        List<TeamUsersInfo> list2;
        TeamUsersInfo teamUsersInfo;
        List<Long> list3;
        Long l2;
        long longValue;
        long j;
        Object obj;
        int i;
        String str;
        List<TeamUsersInfo> list4;
        o.LJIIIZ(scheme, "scheme");
        DataChannel LJJIIZI = LJJIIZI();
        Object obj2 = null;
        if (LJJIIZI != null) {
            room = (Room) LJJIIZI.kv0(RoomChannel.class);
        } else {
            room = null;
        }
        if (z) {
            if (room != null) {
                longValue = room.getOwnerUserId();
            }
            longValue = 0;
        } else if (LJJJJLL()) {
            if (room != null && Long.valueOf(room.getOwnerUserId()) != null && (!C8E.LIZLLL().LJIL().isEmpty())) {
                Iterator LIZLLL = C08880Wm.LIZLLL();
                while (true) {
                    if (LIZLLL.hasNext()) {
                        obj = LIZLLL.next();
                        if (((C75883TqJ) obj).LIZ != room.getOwnerUserId()) {
                            break;
                        }
                    } else {
                        obj = null;
                        break;
                    }
                }
                C75883TqJ c75883TqJ = (C75883TqJ) obj;
                if (c75883TqJ != null) {
                    longValue = c75883TqJ.LIZ;
                }
            }
            longValue = 0;
        } else {
            WIDGET widget2 = this.LJLIL;
            if (widget2 != null && (list = ((C76244Tw8) widget2.LJZI(C76244Tw8.class)).LJIILL) != null && !list.isEmpty() && (widget = this.LJLIL) != null && (list2 = ((C76244Tw8) widget.LJZI(C76244Tw8.class)).LJIILL) != null) {
                Iterator<TeamUsersInfo> it = list2.iterator();
                while (true) {
                    if (it.hasNext()) {
                        teamUsersInfo = it.next();
                        TeamUsersInfo teamUsersInfo2 = teamUsersInfo;
                        if (C76265TwT.LIZ.LJJJJJ == 1) {
                            j = 2;
                        } else {
                            j = 1;
                        }
                        if (j == teamUsersInfo2.teamId) {
                            break;
                        }
                    } else {
                        teamUsersInfo = null;
                        break;
                    }
                }
                TeamUsersInfo teamUsersInfo3 = teamUsersInfo;
                if (teamUsersInfo3 != null && (list3 = teamUsersInfo3.userIds) != null && (l2 = (Long) ListProtector.get(list3, 0)) != null) {
                    longValue = l2.longValue();
                }
            }
            longValue = 0;
        }
        long currentUserId = ((C29374Bfu) B83.LIZ().LIZIZ()).getCurrentUserId();
        Uri.Builder buildUpon = UriProtector.parse(scheme).buildUpon();
        C76280Twi c76280Twi = C76265TwT.LIZ;
        buildUpon.appendQueryParameter("channel_id", String.valueOf(c76280Twi.LIZJ()));
        buildUpon.appendQueryParameter("anchor_id", String.valueOf(longValue));
        Long l3 = (Long) DataChannelGlobal.LJLJJI.mv0(C29025BaH.class);
        if (l3 != null) {
            i = (int) l3.longValue();
        } else {
            i = -1;
        }
        buildUpon.appendQueryParameter("audience_ranking_switch", String.valueOf(i));
        buildUpon.appendQueryParameter("is_anchor", String.valueOf(LJJJJLI() ? 1 : 0));
        buildUpon.appendQueryParameter("user_id", String.valueOf(currentUserId));
        if (l != null) {
            buildUpon.appendQueryParameter("target_uid", String.valueOf(l.longValue()));
        }
        buildUpon.appendQueryParameter("battle_id", String.valueOf(c76280Twi.LIZIZ()));
        boolean LJJJJLL = LJJJJLL();
        String str2 = CardStruct.IStatusCode.DEFAULT;
        if (!LJJJJLL) {
            if (z) {
                str = "1";
            } else {
                str = "2";
            }
            buildUpon.appendQueryParameter("team_id", str);
            WIDGET widget3 = this.LJLIL;
            if (widget3 != null && (list4 = ((C76244Tw8) widget3.LJZI(C76244Tw8.class)).LJIILL) != null) {
                for (TeamUsersInfo teamUsersInfo4 : list4) {
                    if (teamUsersInfo4.teamId == 1) {
                        List<Long> list5 = teamUsersInfo4.userIds;
                        o.LJIIIIZZ(list5, "it.userIds");
                        buildUpon.appendQueryParameter("red_team_uid_list", ORZ.LLD(list5, ",", null, null, null, 62));
                    } else {
                        List<Long> list6 = teamUsersInfo4.userIds;
                        o.LJIIIIZZ(list6, "it.userIds");
                        buildUpon.appendQueryParameter("blue_team_uid_list", ORZ.LLD(list6, ",", null, null, null, 62));
                    }
                }
            }
            buildUpon.appendQueryParameter("is_multi", "1");
        } else {
            buildUpon.appendQueryParameter("is_multi", CardStruct.IStatusCode.DEFAULT);
        }
        DataChannel LJJIIZI2 = LJJIIZI();
        if (LJJIIZI2 != null) {
            obj2 = LJJIIZI2.kv0(BattleSmokeDebuffChannel.class);
        }
        if (obj2 == EnumC76461Tzd.EFFECTING && !z) {
            str2 = "1";
        }
        buildUpon.appendQueryParameter("need_fuzzification", str2);
        buildUpon.appendQueryParameter("is_anchor_in_match_items_region", (String) DataChannelGlobal.LJLJJI.mv0(C29034BaQ.class));
        List<C75883TqJ> LJIILJJIL = C8E.LIZLLL().LJIILJJIL();
        buildUpon.appendQueryParameter("current_connection_cnts", String.valueOf(LJIILJJIL.size()));
        buildUpon.appendQueryParameter("uid_list", ORZ.LLD(LJIILJJIL, ",", null, null, C76498U0o.LJLIL, 30));
        return buildUpon;
    }

    public static void LJJLIIIJLJLI(AbstractC76473Tzp abstractC76473Tzp, C29701Eo c29701Eo, boolean z, boolean z2, int i) {
        float f;
        int LIZ;
        String str;
        if ((i & 4) != 0) {
            z2 = false;
        }
        abstractC76473Tzp.getClass();
        c29701Eo.setVisibility(0);
        c29701Eo.removeAllAnimatorListeners();
        c29701Eo.cancelAnimation();
        c29701Eo.setFrame(0);
        CL6.LIZIZ("match_punish_prepare");
        if (z2) {
            Object parent = c29701Eo.getParent();
            o.LJII(parent, "null cannot be cast to non-null type android.view.View");
            f = (C15380j0.LJIJ(((View) parent).getWidth()) / 2.0f) - 125.0f;
        } else {
            f = 38.0f;
        }
        ViewGroup.LayoutParams layoutParams = c29701Eo.getLayoutParams();
        o.LJII(layoutParams, "null cannot be cast to non-null type androidx.constraintlayout.widget.ConstraintLayout.LayoutParams");
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams;
        marginLayoutParams.width = C15380j0.LIZ(375.0f);
        if (LiveMatchReDesignSingleResultSetting.INSTANCE.isEnabled()) {
            LIZ = C15380j0.LIZ(220.0f);
        } else {
            LIZ = C15380j0.LIZ(200.0f);
        }
        marginLayoutParams.height = LIZ;
        marginLayoutParams.bottomMargin = C15380j0.LIZ(f);
        c29701Eo.setLayoutParams(marginLayoutParams);
        if (Build.VERSION.SDK_INT >= 26) {
            c29701Eo.useHardwareAcceleration(true);
        }
        if (z) {
            str = "ttlive_match_result_ani_win.zip";
        } else {
            str = "ttlive_match_result_ani_lose.zip";
        }
        C15490jB.LJIIL(c29701Eo, "tiktok_live_match_redesign_resource", str, "images", true, null, null, 64);
    }
}
