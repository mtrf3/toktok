package com.bytedance.android.live.liveinteract.multihost.biz.view;

import X.AnonymousClass064;
import X.C0NB;
import X.C15380j0;
import X.C15490jB;
import X.C212428Vi;
import X.C214298b3;
import X.C29306Beo;
import X.C2K0;
import X.C2L4;
import X.C34K;
import X.C47061t0;
import X.C47121t6;
import X.C47704Ins;
import X.C55096Ljo;
import X.C55230Lly;
import X.C55749LuL;
import X.C65352Pkq;
import X.C65776Prg;
import X.C73411SrX;
import X.C74039T3z;
import X.C75583TlT;
import X.C75630TmE;
import X.C75633TmH;
import X.C76402Tyg;
import X.C76409Tyn;
import X.C76421Tyz;
import X.C76965UIn;
import X.C78926UyI;
import X.C86881Y7x;
import X.C8VV;
import X.C8YN;
import X.C9BE;
import X.CMV;
import X.InterfaceC55102Lju;
import X.InterfaceC55235Lm3;
import X.InterfaceC76404Tyi;
import X.InterfaceC76416Tyu;
import X.InterpolatorC77120UOm;
import X.TBT;
import Y.ALAdapterS10S0100000_13;
import Y.ALAdapterS10S0200000_13;
import Y.AUListenerS100S0100000_13;
import Y.AUListenerS102S0200000_13;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.animation.ValueAnimator;
import android.text.TextPaint;
import android.util.Property;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.fragment.app.Fragment;
import com.bytedance.android.live.liveinteract.match.business.event.BattleAdjustTitleViewTopEvent;
import com.bytedance.android.live.liveinteract.multihost.biz.helper.InteractTitleScope;
import com.bytedance.android.live.liveinteract.multihost.biz.viewmodel.InteractionTitleViewModel;
import com.bytedance.android.live.liveinteract.multimatch.ui.IPKCountDownTitleAbility;
import com.bytedance.android.livesdk.chatroom.model.interact.CohostTopic;
import com.bytedance.assem.arch.view.UISlotAssem;
import com.bytedance.assem.arch.viewModel.AssemViewModel;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import com.google.gson.internal.b;
import com.zhiliaoapp.musically.R;
import java.util.List;
import kotlin.jvm.internal.AqS162S0100000_12;
import kotlin.jvm.internal.AqS178S0100000_12;
import kotlin.jvm.internal.AqS179S0100000_13;
import kotlin.jvm.internal.AqS32S0210000_13;
import kotlin.jvm.internal.IDqS437S0100000_13;
import kotlin.jvm.internal.o;

/* loaded from: classes14.dex */
public final class InteractionTitleLayout extends UISlotAssem implements IInteractTitleAbility, ICoHostTopicAbility, InterfaceC55102Lju, C2L4 {
    public final C214298b3 LJLJLLL;
    public final C55749LuL LJLL;
    public FrameLayout LJLLI;
    public LinearLayout LJLLILLLL;
    public ConstraintLayout LJLLJ;
    public C47121t6 LJLLL;
    public CMV LJLLLL;
    public C47121t6 LJLLLLLL;
    public ConstraintLayout LJLZ;
    public LinearLayout LJZ;
    public ConstraintLayout LJZI;
    public FrameLayout LJZL;
    public C47061t0 LL;
    public AnimatorSet LLD;
    public AnimatorSet LLF;
    public ValueAnimator LLFF;
    public InterfaceC76416Tyu LLFFF;
    public C73411SrX LLFII;

    public InteractionTitleLayout() {
        C9BE c9be = C9BE.LIZ;
        C65776Prg LIZ = C65352Pkq.LIZ(InteractionTitleViewModel.class);
        this.LJLJLLL = C78926UyI.LJ(this, LIZ, c9be, new AqS162S0100000_12(LIZ, 60), C76421Tyz.INSTANCE, null);
        this.LJLL = new C55749LuL(C47704Ins.LIZJ(this, C74039T3z.class, null), checkSupervisorPrepared());
    }

    @Override // X.InterfaceC55102Lju
    public final C2K0 provideAbility(String str) {
        int hashCode = str.hashCode();
        if (hashCode == -569553815 || hashCode == 474166000) {
            return this;
        }
        return null;
    }

    @Override // com.bytedance.assem.arch.view.UISlotAssem
    public final int v3() {
        return R.layout.dax;
    }

    public final void I3() {
        ConstraintLayout constraintLayout = this.LJLLJ;
        if (constraintLayout != null) {
            constraintLayout.setVisibility(8);
            ConstraintLayout constraintLayout2 = this.LJLLJ;
            if (constraintLayout2 != null) {
                constraintLayout2.setTranslationY(0.0f);
                ConstraintLayout constraintLayout3 = this.LJLLJ;
                if (constraintLayout3 != null) {
                    constraintLayout3.setScaleX(1.0f);
                    ConstraintLayout constraintLayout4 = this.LJLLJ;
                    if (constraintLayout4 != null) {
                        constraintLayout4.setScaleY(1.0f);
                        return;
                    } else {
                        o.LJIJI("topicPairGuideTitleLayout");
                        throw null;
                    }
                }
                o.LJIJI("topicPairGuideTitleLayout");
                throw null;
            }
            o.LJIJI("topicPairGuideTitleLayout");
            throw null;
        }
        o.LJIJI("topicPairGuideTitleLayout");
        throw null;
    }

    public final void K3() {
        if (this.LLFII != null) {
            C0NB.LIZIZ("InteractionTitleLayout", "dispose topic marquee textview count down");
            C73411SrX c73411SrX = this.LLFII;
            if (c73411SrX != null) {
                c73411SrX.dispose();
            }
        }
    }

    @Override // com.bytedance.android.live.liveinteract.multihost.biz.view.ICoHostTopicAbility
    public final void Ya() {
        AnimatorSet animatorSet;
        AnimatorSet animatorSet2;
        AnimatorSet animatorSet3 = this.LLD;
        if (animatorSet3 != null && animatorSet3.isRunning() && (animatorSet2 = this.LLD) != null) {
            animatorSet2.cancel();
        }
        AnimatorSet animatorSet4 = this.LLF;
        if (animatorSet4 != null && animatorSet4.isRunning() && (animatorSet = this.LLF) != null) {
            animatorSet.cancel();
        }
        LinearLayout linearLayout = this.LJLLILLLL;
        if (linearLayout != null) {
            linearLayout.setVisibility(8);
            ConstraintLayout constraintLayout = this.LJLLJ;
            if (constraintLayout != null) {
                constraintLayout.setVisibility(8);
                ConstraintLayout constraintLayout2 = this.LJZI;
                if (constraintLayout2 != null) {
                    L3(-2, constraintLayout2);
                    C47061t0 c47061t0 = this.LL;
                    if (c47061t0 != null) {
                        c47061t0.setAlpha(1.0f);
                    }
                    C47061t0 c47061t02 = this.LL;
                    if (c47061t02 != null) {
                        c47061t02.setVisibility(0);
                    }
                    K3();
                    return;
                }
                o.LJIJI("linkMicLayout");
                throw null;
            }
            o.LJIJI("topicPairGuideTitleLayout");
            throw null;
        }
        o.LJIJI("topicPairTitleLayout");
        throw null;
    }

    @Override // com.bytedance.android.live.liveinteract.multihost.biz.view.IInteractTitleAbility
    public final void b6() {
        IPKCountDownTitleAbility iPKCountDownTitleAbility;
        ConstraintLayout constraintLayout = this.LJLZ;
        if (constraintLayout != null) {
            constraintLayout.setVisibility(8);
            LinearLayout linearLayout = this.LJZ;
            if (linearLayout != null) {
                linearLayout.setVisibility(8);
                FrameLayout frameLayout = this.LJZL;
                if (frameLayout != null) {
                    frameLayout.setVisibility(8);
                    InteractionTitleViewModel interactionTitleViewModel = (InteractionTitleViewModel) this.LJLJLLL.getValue();
                    C76409Tyn c76409Tyn = C76409Tyn.LIZ;
                    new C76402Tyg(0.6f, C15380j0.LIZ(40.0f), C15380j0.LIZIZ(R.color.a02));
                    interactionTitleViewModel.withState(new AqS32S0210000_13((InterfaceC76404Tyi) c76409Tyn, false, interactionTitleViewModel, 0));
                    Fragment LIZLLL = C212428Vi.LIZLLL(this);
                    if (LIZLLL != null) {
                        C55230Lly.LIZJ(LIZLLL, null);
                        return;
                    }
                    InterfaceC55235Lm3 LJIIZILJ = C55096Ljo.LJIIZILJ(this);
                    if (LJIIZILJ == null || (iPKCountDownTitleAbility = (IPKCountDownTitleAbility) C55096Ljo.LIZ(LJIIZILJ, IPKCountDownTitleAbility.class, null)) == null) {
                        return;
                    }
                    iPKCountDownTitleAbility.b6();
                    return;
                }
                o.LJIJI("speedChallengeLayout");
                throw null;
            }
            o.LJIJI("battlePunishCountDownLayout");
            throw null;
        }
        o.LJIJI("battleCountDownLayout");
        throw null;
    }

    @Override // X.C2L4
    public final List<Class<Object>> getScopeDefine() {
        return C76965UIn.LIZ(InteractTitleScope.class);
    }

    public final void H3() {
        InterfaceC55235Lm3 LJIIZILJ;
        InterfaceC55235Lm3 LJIIZILJ2;
        Fragment LIZLLL = C212428Vi.LIZLLL(this);
        if (LIZLLL != null) {
            LJIIZILJ = C55230Lly.LIZJ(LIZLLL, null);
        } else {
            LJIIZILJ = C55096Ljo.LJIIZILJ(this);
        }
        C55096Ljo.LJIIL(LJIIZILJ, this, IInteractTitleAbility.class, null, this);
        Fragment LIZLLL2 = C212428Vi.LIZLLL(this);
        if (LIZLLL2 != null) {
            LJIIZILJ2 = C55230Lly.LIZJ(LIZLLL2, null);
        } else {
            LJIIZILJ2 = C55096Ljo.LJIIZILJ(this);
        }
        C55096Ljo.LJIIL(LJIIZILJ2, this, ICoHostTopicAbility.class, null, this);
    }

    @Override // com.bytedance.assem.arch.core.UIAssem, X.C8W0
    public final void onCreate() {
        super.onCreate();
        H3();
    }

    @Override // X.C8W0
    public final void onParentSet() {
        super.onParentSet();
        H3();
    }

    @Override // com.bytedance.assem.arch.core.UIAssem, X.C8W0
    public final void onDestroy() {
        super.onDestroy();
    }

    @Override // com.bytedance.android.live.liveinteract.multihost.biz.view.ICoHostTopicAbility
    public final void X70(C75583TlT c75583TlT) {
        this.LLFFF = c75583TlT;
    }

    @Override // com.bytedance.assem.arch.core.UIAssem
    public final void onViewCreated(View view) {
        o.LJIIIZ(view, "view");
        super.onViewCreated(view);
        this.LJLLI = (FrameLayout) view;
        this.LL = (C47061t0) view.findViewById(R.id.f5b);
        View findViewById = view.findViewById(R.id.fjd);
        o.LJIIIIZZ(findViewById, "view.findViewById(R.id.layout_linkmic_set)");
        this.LJZI = (ConstraintLayout) findViewById;
        View findViewById2 = view.findViewById(R.id.fna);
        o.LJIIIIZZ(findViewById2, "view.findViewById(R.id.layout_topic_info)");
        this.LJLLILLLL = (LinearLayout) findViewById2;
        View findViewById3 = view.findViewById(R.id.fn8);
        o.LJIIIIZZ(findViewById3, "view.findViewById(R.id.layout_topic_guide_bubble)");
        this.LJLLJ = (ConstraintLayout) findViewById3;
        View findViewById4 = view.findViewById(R.id.fgu);
        o.LJIIIIZZ(findViewById4, "view.findViewById(R.id.layout_battle_countdown)");
        this.LJLZ = (ConstraintLayout) findViewById4;
        View findViewById5 = view.findViewById(R.id.fgv);
        o.LJIIIIZZ(findViewById5, "view.findViewById(R.id.l…_battle_punish_countdown)");
        this.LJZ = (LinearLayout) findViewById5;
        View findViewById6 = view.findViewById(R.id.flq);
        o.LJIIIIZZ(findViewById6, "view.findViewById(R.id.layout_speed_challenge)");
        this.LJZL = (FrameLayout) findViewById6;
        View findViewById7 = view.findViewById(R.id.mop);
        o.LJIIIIZZ(findViewById7, "view.findViewById(R.id.tv_topic_guide_info)");
        this.LJLLL = (C47121t6) findViewById7;
        View findViewById8 = view.findViewById(R.id.moo);
        o.LJIIIIZZ(findViewById8, "view.findViewById(R.id.tv_topic_guide_bubble_info)");
        this.LJLLLL = (CMV) findViewById8;
        View findViewById9 = view.findViewById(R.id.mon);
        o.LJIIIIZZ(findViewById9, "view.findViewById(R.id.t…_guide_bubble_heat_point)");
        this.LJLLLLLL = (C47121t6) findViewById9;
        DataChannel dataChannel = ((C74039T3z) this.LJLL.getValue()).LJLILLLLZI;
        if (dataChannel != null) {
            dataChannel.mv0(BattleAdjustTitleViewTopEvent.class, this, new AqS179S0100000_13(this, 199));
        }
        C8VV.LIZJ(this, new AqS178S0100000_12(this, 80));
        C15490jB.LJFF(this.LL, "tiktok_live_interaction_normal_1", "ttlive_icon_in_multi_co_host.webp", ImageView.ScaleType.CENTER_CROP, new C75630TmE());
        FrameLayout frameLayout = this.LJLLI;
        if (frameLayout != null) {
            frameLayout.setVisibility(0);
            C47061t0 c47061t0 = this.LL;
            if (c47061t0 != null) {
                c47061t0.setVisibility(0);
            }
            ConstraintLayout constraintLayout = this.LJLZ;
            if (constraintLayout != null) {
                constraintLayout.setVisibility(8);
                LinearLayout linearLayout = this.LJZ;
                if (linearLayout != null) {
                    linearLayout.setVisibility(8);
                    FrameLayout frameLayout2 = this.LJZL;
                    if (frameLayout2 != null) {
                        frameLayout2.setVisibility(8);
                        C8YN.LJIIJ(this, (AssemViewModel) this.LJLJLLL.getValue(), new TBT() { // from class: X.Tz0
                            @Override // X.TBT, X.TBZ, X.TBW
                            public final Object get(Object obj) {
                                return ((C76401Tyf) obj).LJLILLLLZI;
                            }
                        }, new TBT() { // from class: X.Tyj
                            @Override // X.TBT, X.TBZ, X.TBW
                            public final Object get(Object obj) {
                                return ((C76401Tyf) obj).LJLJI;
                            }
                        }, null, new IDqS437S0100000_13(this, 0), 12);
                        return;
                    } else {
                        o.LJIJI("speedChallengeLayout");
                        throw null;
                    }
                }
                o.LJIJI("battlePunishCountDownLayout");
                throw null;
            }
            o.LJIJI("battleCountDownLayout");
            throw null;
        }
        o.LJIJI("layoutContainer");
        throw null;
    }

    @Override // com.bytedance.android.live.liveinteract.multihost.biz.view.ICoHostTopicAbility
    public final void ws0(CohostTopic cohostTopic) {
        AnimatorSet animatorSet = this.LLF;
        if (animatorSet != null && animatorSet.isRunning()) {
            return;
        }
        AnimatorSet animatorSet2 = this.LLD;
        if (animatorSet2 != null && animatorSet2.isRunning()) {
            return;
        }
        K3();
        C0NB.LIZIZ("InteractionTitleLayout", "start cohost topic change animation");
        ValueAnimator ofFloat = ValueAnimator.ofFloat(1.0f, 0.0f);
        ofFloat.setDuration(100L);
        ofFloat.addUpdateListener(new AUListenerS100S0100000_13(this, 32));
        ObjectAnimator ofFloat2 = ObjectAnimator.ofFloat(this.LL, (Property<C47061t0, Float>) View.ALPHA, 0.0f, 1.0f);
        ofFloat2.setDuration(100L);
        ofFloat2.addListener(new ALAdapterS10S0100000_13(this, 12));
        if (this.LJZI != null) {
            ValueAnimator ofFloat3 = ValueAnimator.ofFloat(r0.getMeasuredWidth(), C15380j0.LIZ(40.0f));
            ofFloat3.setDuration(300L);
            ofFloat3.addUpdateListener(new AUListenerS100S0100000_13(this, 33));
            ofFloat3.addListener(new ALAdapterS10S0200000_13(this, cohostTopic, 6));
            AnimatorSet animatorSet3 = new AnimatorSet();
            animatorSet3.play(ofFloat).before(ofFloat2);
            animatorSet3.play(ofFloat2).with(ofFloat3);
            animatorSet3.start();
            this.LLF = animatorSet3;
            return;
        }
        o.LJIJI("linkMicLayout");
        throw null;
    }

    public static void L3(int i, ConstraintLayout constraintLayout) {
        ViewParent parent = constraintLayout.getParent();
        if (parent instanceof FrameLayout) {
            ViewGroup.LayoutParams layoutParams = constraintLayout.getLayoutParams();
            layoutParams.width = i;
            constraintLayout.setLayoutParams(layoutParams);
        } else {
            if (!(parent instanceof ConstraintLayout)) {
                return;
            }
            AnonymousClass064 anonymousClass064 = new AnonymousClass064();
            ConstraintLayout constraintLayout2 = (ConstraintLayout) parent;
            anonymousClass064.LJII(constraintLayout2);
            anonymousClass064.LJIIL(constraintLayout.getId(), i);
            anonymousClass064.LIZIZ(constraintLayout2);
        }
    }

    @Override // com.bytedance.android.live.liveinteract.multihost.biz.view.ICoHostTopicAbility
    public final void OX(CohostTopic topic, long j) {
        Number valueOf;
        o.LJIIIZ(topic, "topic");
        AnimatorSet animatorSet = this.LLD;
        if ((animatorSet != null && animatorSet.isRunning()) || topic.titleKey.length() == 0) {
            return;
        }
        C75633TmH.LIZLLL = System.currentTimeMillis();
        ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.1f);
        ofFloat.setDuration(300L);
        ofFloat.setInterpolator(new InterpolatorC77120UOm(0.63f, 0.0f, 0.43f, 1.01f));
        ofFloat.addUpdateListener(new AUListenerS100S0100000_13(this, 23));
        ofFloat.addListener(new ALAdapterS10S0200000_13(this, topic, 3));
        ValueAnimator ofFloat2 = ValueAnimator.ofFloat(1.1f, 1.0f);
        ofFloat2.setDuration(200L);
        ofFloat2.setInterpolator(new InterpolatorC77120UOm(0.69f, 0.0f, 0.47f, 0.95f));
        ofFloat2.addUpdateListener(new AUListenerS100S0100000_13(this, 24));
        ValueAnimator ofFloat3 = ValueAnimator.ofFloat(1.0f, 0.5f);
        ofFloat3.setDuration(200L);
        ofFloat3.setInterpolator(new InterpolatorC77120UOm(0.63f, 0.0f, 0.43f, 1.01f));
        ofFloat3.addUpdateListener(new AUListenerS100S0100000_13(this, 25));
        ConstraintLayout constraintLayout = this.LJLLJ;
        if (constraintLayout != null) {
            ObjectAnimator ofFloat4 = ObjectAnimator.ofFloat(constraintLayout, (Property<ConstraintLayout, Float>) View.ALPHA, 0.0f, 1.0f);
            ofFloat4.setDuration(200L);
            ConstraintLayout constraintLayout2 = this.LJLLJ;
            if (constraintLayout2 != null) {
                ObjectAnimator ofFloat5 = ObjectAnimator.ofFloat(constraintLayout2, (Property<ConstraintLayout, Float>) View.ALPHA, 1.0f, 0.0f);
                ofFloat5.setDuration(200L);
                ValueAnimator ofFloat6 = ValueAnimator.ofFloat(0.0f, -C15380j0.LIZ(34.0f));
                ofFloat6.setDuration(300L);
                ofFloat6.addUpdateListener(new AUListenerS100S0100000_13(this, 26));
                ofFloat6.addListener(new ALAdapterS10S0100000_13(this, 11));
                ValueAnimator ofFloat7 = ValueAnimator.ofFloat(0.0f, 1.0f);
                ofFloat7.setDuration(3500L);
                ValueAnimator ofFloat8 = ValueAnimator.ofFloat(1.0f, 1.25f);
                ofFloat8.setDuration(260L);
                ofFloat8.setInterpolator(new InterpolatorC77120UOm(0.33f, 0.0f, 0.67f, 1.0f));
                ofFloat8.addUpdateListener(new AUListenerS102S0200000_13(this, ofFloat8, 1));
                ValueAnimator ofFloat9 = ValueAnimator.ofFloat(1.25f, 1.0f);
                ofFloat9.setDuration(240L);
                ofFloat9.setInterpolator(new InterpolatorC77120UOm(0.33f, 0.0f, 0.67f, 1.0f));
                ofFloat9.addUpdateListener(new AUListenerS102S0200000_13(this, ofFloat9, 2));
                ObjectAnimator ofFloat10 = ObjectAnimator.ofFloat(this.LL, (Property<C47061t0, Float>) View.ALPHA, 1.0f, 0.0f);
                ofFloat10.setDuration(100L);
                C34K c34k = new C34K();
                int LIZ = C15380j0.LIZ(40.0f);
                CMV cmv = this.LJLLLL;
                if (cmv != null) {
                    cmv.LJJIJIL(R.style.oy);
                    C47121t6 c47121t6 = this.LJLLLLLL;
                    if (c47121t6 != null) {
                        c47121t6.LJJIJIL(R.style.oy);
                        String LIZ2 = C86881Y7x.LIZIZ().LIZ(topic.titleKey);
                        if (LIZ2 == null) {
                            LIZ2 = "";
                        }
                        CMV cmv2 = this.LJLLLL;
                        if (cmv2 != null) {
                            float measureText = cmv2.getPaint().measureText(LIZ2);
                            if (j == 0) {
                                j = C75633TmH.LJFF;
                            }
                            String LJIIL = b.LJIIL(j);
                            CMV cmv3 = this.LJLLLL;
                            if (cmv3 != null) {
                                cmv3.setText(LIZ2);
                                C47121t6 c47121t62 = this.LJLLLLLL;
                                if (c47121t62 != null) {
                                    c47121t62.setText(LJIIL);
                                    C47121t6 c47121t63 = this.LJLLLLLL;
                                    if (c47121t63 != null) {
                                        TextPaint paint = c47121t63.getPaint();
                                        LJIIL.toString();
                                        float measureText2 = paint.measureText(LJIIL) + measureText;
                                        if (measureText2 > C15380j0.LIZ(210.0f)) {
                                            c34k.element = true;
                                            valueOf = Integer.valueOf(C15380j0.LIZ(268.0f));
                                        } else {
                                            valueOf = Float.valueOf(measureText2 + C15380j0.LIZ(58.0f));
                                        }
                                        ValueAnimator ofFloat11 = ValueAnimator.ofFloat(LIZ, valueOf.floatValue() * 1.06f);
                                        ofFloat11.setDuration(340L);
                                        ofFloat11.setInterpolator(new InterpolatorC77120UOm(0.14f, 0.0f, 0.52f, 0.99f));
                                        ofFloat11.addUpdateListener(new AUListenerS100S0100000_13(this, 30));
                                        ValueAnimator ofFloat12 = ValueAnimator.ofFloat(valueOf.floatValue() * 1.06f, valueOf.floatValue());
                                        ofFloat12.setDuration(300L);
                                        ofFloat12.setInterpolator(new InterpolatorC77120UOm(0.46f, -0.03f, 0.93f, 0.99f));
                                        ofFloat12.addUpdateListener(new AUListenerS100S0100000_13(this, 31));
                                        ValueAnimator ofFloat13 = ValueAnimator.ofFloat(1.0f, 1.06f);
                                        ofFloat13.setDuration(340L);
                                        ofFloat13.setInterpolator(new InterpolatorC77120UOm(0.14f, 0.0f, 0.52f, 0.99f));
                                        ofFloat13.addUpdateListener(new AUListenerS100S0100000_13(this, 27));
                                        ValueAnimator ofFloat14 = ValueAnimator.ofFloat(1.06f, 1.0f);
                                        ofFloat14.setDuration(300L);
                                        ofFloat14.setInterpolator(new InterpolatorC77120UOm(0.46f, -0.03f, 0.93f, 0.99f));
                                        ofFloat14.addUpdateListener(new AUListenerS100S0100000_13(this, 28));
                                        ofFloat14.addListener(new ALAdapterS10S0200000_13(this, c34k, 4));
                                        ValueAnimator ofFloat15 = ValueAnimator.ofFloat(0.0f, 1.0f);
                                        ofFloat15.setDuration(120L);
                                        ofFloat15.addUpdateListener(new AUListenerS100S0100000_13(this, 29));
                                        ofFloat15.addListener(new ALAdapterS10S0200000_13(this, topic, 5));
                                        AnimatorSet animatorSet2 = new AnimatorSet();
                                        ValueAnimator ofFloat16 = ValueAnimator.ofFloat(0.0f, 1.0f);
                                        ofFloat16.setDuration(560L);
                                        animatorSet2.play(ofFloat).with(ofFloat4).with(ofFloat7).before(ofFloat2);
                                        animatorSet2.play(ofFloat3).with(ofFloat5).with(ofFloat6).after(ofFloat7);
                                        animatorSet2.play(ofFloat8).with(ofFloat16).after(ofFloat7);
                                        animatorSet2.play(ofFloat9).after(ofFloat8);
                                        animatorSet2.play(ofFloat10).after(ofFloat16);
                                        animatorSet2.play(ofFloat11).with(ofFloat13).after(ofFloat9);
                                        animatorSet2.play(ofFloat12).with(ofFloat14).after(ofFloat11);
                                        animatorSet2.play(ofFloat15).after(ofFloat10);
                                        animatorSet2.start();
                                        this.LLD = animatorSet2;
                                        return;
                                    }
                                    o.LJIJI("tvTopicGuideBubbleHeatPoint");
                                    throw null;
                                }
                                o.LJIJI("tvTopicGuideBubbleHeatPoint");
                                throw null;
                            }
                            o.LJIJI("tvTopicGuideBubbleInfo");
                            throw null;
                        }
                        o.LJIJI("tvTopicGuideBubbleInfo");
                        throw null;
                    }
                    o.LJIJI("tvTopicGuideBubbleHeatPoint");
                    throw null;
                }
                o.LJIJI("tvTopicGuideBubbleInfo");
                throw null;
            }
            o.LJIJI("topicPairGuideTitleLayout");
            throw null;
        }
        o.LJIJI("topicPairGuideTitleLayout");
        throw null;
    }

    @Override // com.bytedance.android.live.liveinteract.multihost.biz.view.ICoHostTopicAbility
    public final void Og0(long j, String str) {
        Object valueOf;
        String LJIIJJI = b.LJIIJJI(j);
        o.LJIIIIZZ(LJIIJJI, "getCoHostTopicHeatCount(heatScore)");
        C47121t6 c47121t6 = this.LJLLLLLL;
        if (c47121t6 != null) {
            c47121t6.setText(LJIIJJI);
            if (C29306Beo.LJIJJLI(str)) {
                CMV cmv = this.LJLLLL;
                if (cmv != null) {
                    cmv.setText(str);
                } else {
                    o.LJIJI("tvTopicGuideBubbleInfo");
                    throw null;
                }
            }
            ValueAnimator valueAnimator = this.LLFF;
            if (valueAnimator != null && valueAnimator.isRunning()) {
                return;
            }
            C47121t6 c47121t62 = this.LJLLLLLL;
            if (c47121t62 != null) {
                if (c47121t62.getVisibility() == 8) {
                    return;
                }
                C47061t0 c47061t0 = this.LL;
                if (c47061t0 != null) {
                    c47061t0.setVisibility(8);
                }
                CMV cmv2 = this.LJLLLL;
                if (cmv2 != null) {
                    String charSequence = cmv2.getText().toString();
                    CMV cmv3 = this.LJLLLL;
                    if (cmv3 != null) {
                        float measureText = cmv3.getPaint().measureText(charSequence);
                        C47121t6 c47121t63 = this.LJLLLLLL;
                        if (c47121t63 != null) {
                            float measureText2 = c47121t63.getPaint().measureText(LJIIJJI) + measureText;
                            if (measureText2 > C15380j0.LIZ(210.0f)) {
                                valueOf = Integer.valueOf(C15380j0.LIZ(268.0f));
                            } else {
                                valueOf = Float.valueOf(measureText2 + C15380j0.LIZ(58.0f));
                            }
                            ValueAnimator ofFloat = ValueAnimator.ofFloat(1.0f, 1.3f);
                            ofFloat.setDuration(200L);
                            ofFloat.setRepeatCount(1);
                            ofFloat.setRepeatMode(2);
                            ofFloat.addUpdateListener(new AUListenerS100S0100000_13(this, 34));
                            ofFloat.addListener(new ALAdapterS10S0200000_13(this, valueOf, 7));
                            ofFloat.start();
                            this.LLFF = ofFloat;
                            return;
                        }
                        o.LJIJI("tvTopicGuideBubbleHeatPoint");
                        throw null;
                    }
                    o.LJIJI("tvTopicGuideBubbleInfo");
                    throw null;
                }
                o.LJIJI("tvTopicGuideBubbleInfo");
                throw null;
            }
            o.LJIJI("tvTopicGuideBubbleHeatPoint");
            throw null;
        }
        o.LJIJI("tvTopicGuideBubbleHeatPoint");
        throw null;
    }

    @Override // com.bytedance.android.live.liveinteract.multihost.biz.view.IInteractTitleAbility
    public final void jQ(int i, boolean z) {
        FrameLayout frameLayout = this.LJLLI;
        if (frameLayout != null) {
            ViewGroup.LayoutParams layoutParams = frameLayout.getLayoutParams();
            o.LJII(layoutParams, "null cannot be cast to non-null type android.widget.FrameLayout.LayoutParams");
            FrameLayout.LayoutParams layoutParams2 = (FrameLayout.LayoutParams) layoutParams;
            int i2 = 0;
            if (i == 2) {
                if (z) {
                    i2 = C15380j0.LIZ(16.0f);
                }
                layoutParams2.topMargin = i2;
                return;
            }
            layoutParams2.topMargin = 0;
            return;
        }
        o.LJIJI("layoutContainer");
        throw null;
    }
}
