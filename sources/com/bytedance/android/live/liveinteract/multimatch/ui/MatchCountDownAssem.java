package com.bytedance.android.live.liveinteract.multimatch.ui;

import X.AnonymousClass064;
import X.C04270Et;
import X.C0NB;
import X.C15380j0;
import X.C15510jD;
import X.C16880lQ;
import X.C212428Vi;
import X.C214298b3;
import X.C259910h;
import X.C29306Beo;
import X.C2A4;
import X.C2K0;
import X.C47121t6;
import X.C47704Ins;
import X.C55096Ljo;
import X.C55230Lly;
import X.C55749LuL;
import X.C57396Mfo;
import X.C65352Pkq;
import X.C65776Prg;
import X.C74039T3z;
import X.C76265TwT;
import X.C76427Tz5;
import X.C76732zl;
import X.C78926UyI;
import X.C81705W4v;
import X.C86881Y7x;
import X.C9BE;
import X.CMV;
import X.InterfaceC55102Lju;
import X.InterfaceC55235Lm3;
import X.RunnableC76426Tz4;
import X.W5I;
import X.X1D;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.graphics.drawable.Drawable;
import android.text.TextPaint;
import android.util.Property;
import android.util.TypedValue;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.widget.ImageView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.fragment.app.Fragment;
import com.bytedance.android.live.liveinteract.match.business.event.BattleDrawTimeLeftChannel;
import com.bytedance.android.live.liveinteract.match.business.event.BattleStateChannel;
import com.bytedance.android.live.liveinteract.match.business.event.BattleTimeLeftChannel;
import com.bytedance.android.live.liveinteract.multihost.biz.viewmodel.InteractionTitleViewModel;
import com.bytedance.android.livesdkapi.depend.model.live.match.GiftModeMeta;
import com.bytedance.assem.arch.view.UIContentAssem;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.internal.AqS162S0100000_12;
import kotlin.jvm.internal.AqS179S0100000_13;
import kotlin.jvm.internal.o;

/* loaded from: classes14.dex */
public final class MatchCountDownAssem extends UIContentAssem implements IPKCountDownTitleAbility, InterfaceC55102Lju {
    public final C55749LuL LJLIL = new C55749LuL(C47704Ins.LIZJ(this, C74039T3z.class, null), checkSupervisorPrepared());
    public final C214298b3 LJLILLLLZI;
    public ImageView LJLJI;
    public C2A4 LJLJJI;
    public C47121t6 LJLJJL;
    public C47121t6 LJLJJLL;
    public CMV LJLJL;
    public ConstraintLayout LJLJLJ;
    public AnimatorSet LJLJLLL;
    public AnimatorSet LJLL;
    public long LJLLI;
    public C81705W4v LJLLILLLL;
    public DataChannel LJLLJ;
    public Drawable LJLLL;
    public Integer LJLLLL;
    public String LJLLLLLL;

    public MatchCountDownAssem() {
        C9BE c9be = C9BE.LIZ;
        C65776Prg LIZ = C65352Pkq.LIZ(InteractionTitleViewModel.class);
        this.LJLILLLLZI = C78926UyI.LJ(this, LIZ, c9be, new AqS162S0100000_12(LIZ, 62), C76427Tz5.INSTANCE, null);
    }

    @Override // X.InterfaceC55102Lju
    public final C2K0 provideAbility(String str) {
        if (str.hashCode() != 1915663792) {
            return null;
        }
        return this;
    }

    @Override // com.bytedance.android.live.liveinteract.multimatch.ui.IPKCountDownTitleAbility
    public final void Bo0() {
        boolean z;
        int i;
        int i2;
        GiftModeMeta giftModeMeta = C76265TwT.LIZ.LJIILLIIL;
        if (giftModeMeta == null || giftModeMeta.giftId == 0 || this.LJLLI <= 30) {
            return;
        }
        C0NB.LJ("MatchCountDownAssem", "onVsAnimation End");
        ConstraintLayout constraintLayout = this.LJLJLJ;
        if (constraintLayout != null) {
            ViewGroup.LayoutParams layoutParams = constraintLayout.getLayoutParams();
            if (layoutParams != null) {
                layoutParams.width = -2;
            }
            ConstraintLayout constraintLayout2 = this.LJLJLJ;
            if (constraintLayout2 != null) {
                constraintLayout2.setVisibility(0);
                ImageView imageView = this.LJLJI;
                if (imageView != null) {
                    imageView.setVisibility(0);
                    C2A4 c2a4 = this.LJLJJI;
                    if (c2a4 != null) {
                        c2a4.setVisibility(8);
                        C47121t6 c47121t6 = this.LJLJJLL;
                        if (c47121t6 != null) {
                            c47121t6.setAlpha(1.0f);
                            C47121t6 c47121t62 = this.LJLJJLL;
                            if (c47121t62 != null) {
                                c47121t62.setVisibility(0);
                                CMV cmv = this.LJLJL;
                                if (cmv != null) {
                                    cmv.setVisibility(8);
                                    CMV cmv2 = this.LJLJL;
                                    if (cmv2 != null) {
                                        float f = 0.0f;
                                        cmv2.setAlpha(0.0f);
                                        String LJIILL = C15380j0.LJIILL(R.string.mxs, C86881Y7x.LIZIZ().LIZ(giftModeMeta.giftNameKey));
                                        CMV cmv3 = this.LJLJL;
                                        if (cmv3 != null) {
                                            TextPaint paint = cmv3.getPaint();
                                            if (paint != null) {
                                                f = paint.measureText(LJIILL);
                                            }
                                            if (f > C15380j0.LIZ(247.0f)) {
                                                z = true;
                                            } else {
                                                z = false;
                                            }
                                            C47121t6 c47121t63 = this.LJLJJL;
                                            if (c47121t63 != null) {
                                                int measuredWidth = c47121t63.getMeasuredWidth();
                                                C47121t6 c47121t64 = this.LJLJJLL;
                                                if (c47121t64 != null) {
                                                    int measuredWidth2 = c47121t64.getMeasuredWidth() + measuredWidth;
                                                    C76732zl c76732zl = new C76732zl();
                                                    StringBuilder LIZ = X1D.LIZ();
                                                    LIZ.append("need Marquee = ");
                                                    LIZ.append(z);
                                                    LIZ.append(" and curWidth = ");
                                                    LIZ.append(measuredWidth2);
                                                    C0NB.LIZIZ("MatchCountDownAssem", X1D.LIZIZ(LIZ));
                                                    if (z) {
                                                        i = C15380j0.LIZ(247.0f);
                                                    } else {
                                                        i = 0;
                                                    }
                                                    c76732zl.element = i;
                                                    if (z) {
                                                        c76732zl.element = C15380j0.LIZ(247.0f);
                                                        i2 = C15380j0.LIZ(247.0f);
                                                    } else {
                                                        c76732zl.element = 0;
                                                        i2 = (int) f;
                                                    }
                                                    int i3 = i2 - measuredWidth2;
                                                    StringBuilder LIZ2 = X1D.LIZ();
                                                    LIZ2.append("tipWidth = ");
                                                    LIZ2.append(f);
                                                    LIZ2.append(" and layoutTotalWidth = ");
                                                    ConstraintLayout constraintLayout3 = this.LJLJLJ;
                                                    if (constraintLayout3 != null) {
                                                        LIZ2.append(constraintLayout3.getMeasuredWidth());
                                                        LIZ2.append(" and extra = ");
                                                        LIZ2.append(i3);
                                                        C0NB.LIZIZ("MatchCountDownAssem", X1D.LIZIZ(LIZ2));
                                                        ConstraintLayout constraintLayout4 = this.LJLJLJ;
                                                        if (constraintLayout4 != null) {
                                                            constraintLayout4.postDelayed(new RunnableC76426Tz4(this, i3, z, c76732zl, LJIILL), 500L);
                                                            return;
                                                        } else {
                                                            o.LJIJI("layoutPKCountDown");
                                                            throw null;
                                                        }
                                                    }
                                                    o.LJIJI("layoutPKCountDown");
                                                    throw null;
                                                }
                                                o.LJIJI("tvPKCountDownValue");
                                                throw null;
                                            }
                                            o.LJIJI("tvPKOnlyGift");
                                            throw null;
                                        }
                                        o.LJIJI("tvPKOnlyGiftTip");
                                        throw null;
                                    }
                                    o.LJIJI("tvPKOnlyGiftTip");
                                    throw null;
                                }
                                o.LJIJI("tvPKOnlyGiftTip");
                                throw null;
                            }
                            o.LJIJI("tvPKCountDownValue");
                            throw null;
                        }
                        o.LJIJI("tvPKCountDownValue");
                        throw null;
                    }
                    o.LJIJI("ivPKCalculateClock");
                    throw null;
                }
                o.LJIJI("ivPKFist");
                throw null;
            }
            o.LJIJI("layoutPKCountDown");
            throw null;
        }
        o.LJIJI("layoutPKCountDown");
        throw null;
    }

    @Override // com.bytedance.android.live.liveinteract.multimatch.ui.IPKCountDownTitleAbility
    public final void b6() {
        Boolean bool;
        AnimatorSet animatorSet = this.LJLL;
        if (animatorSet != null) {
            bool = Boolean.valueOf(animatorSet.isRunning());
        } else {
            bool = null;
        }
        if (C29306Beo.LJJIFFI(bool)) {
            AnimatorSet animatorSet2 = this.LJLL;
            if (animatorSet2 != null) {
                animatorSet2.cancel();
            }
            this.LJLL = null;
        }
    }

    @Override // com.bytedance.assem.arch.core.UIAssem, X.C8W0
    public final void onDestroy() {
        DataChannel dataChannel = this.LJLLJ;
        if (dataChannel != null) {
            dataChannel.jv0(this);
        }
        super.onDestroy();
    }

    public final void v3() {
        AnimatorSet animatorSet = this.LJLJLLL;
        if (animatorSet != null && animatorSet.isRunning()) {
            AnimatorSet animatorSet2 = this.LJLJLLL;
            if (animatorSet2 != null) {
                C16880lQ.LJLJJL(animatorSet2);
            }
            AnimatorSet animatorSet3 = this.LJLJLLL;
            if (animatorSet3 != null) {
                animatorSet3.end();
            }
            this.LJLJLLL = null;
        }
    }

    @Override // com.bytedance.assem.arch.core.UIAssem, X.C8W0
    public final void onCreate() {
        InterfaceC55235Lm3 LJIIZILJ;
        super.onCreate();
        C0NB.LIZIZ("MatchCountDownAssem", "onCreate CountDown");
        C0NB.LJ("MatchCountDownAssem", "bind Ability---");
        Fragment LIZLLL = C212428Vi.LIZLLL(this);
        if (LIZLLL != null) {
            LJIIZILJ = C55230Lly.LIZJ(LIZLLL, null);
        } else {
            LJIIZILJ = C55096Ljo.LJIIZILJ(this);
        }
        C55096Ljo.LJIIL(LJIIZILJ, this, IPKCountDownTitleAbility.class, null, this);
    }

    @Override // X.C8W0
    public final void onParentSet() {
        super.onParentSet();
        C0NB.LIZIZ("MatchCountDownAssem", "onParentSet  CountDown");
    }

    public final void E3(int i) {
        ConstraintLayout constraintLayout = this.LJLJLJ;
        if (constraintLayout != null) {
            if (constraintLayout.getParent() instanceof ConstraintLayout) {
                ConstraintLayout constraintLayout2 = this.LJLJLJ;
                if (constraintLayout2 != null) {
                    ViewParent parent = constraintLayout2.getParent();
                    o.LJII(parent, "null cannot be cast to non-null type androidx.constraintlayout.widget.ConstraintLayout");
                    ConstraintLayout constraintLayout3 = (ConstraintLayout) parent;
                    AnonymousClass064 LIZ = C57396Mfo.LIZ(constraintLayout3);
                    ConstraintLayout constraintLayout4 = this.LJLJLJ;
                    if (constraintLayout4 != null) {
                        LIZ.LJIIL(constraintLayout4.getId(), i);
                        LIZ.LIZIZ(constraintLayout3);
                        return;
                    } else {
                        o.LJIJI("layoutPKCountDown");
                        throw null;
                    }
                }
                o.LJIJI("layoutPKCountDown");
                throw null;
            }
            ConstraintLayout constraintLayout5 = this.LJLJLJ;
            if (constraintLayout5 != null) {
                ViewGroup.LayoutParams layoutParams = constraintLayout5.getLayoutParams();
                if (layoutParams != null) {
                    layoutParams.width = i;
                }
                ConstraintLayout constraintLayout6 = this.LJLJLJ;
                if (constraintLayout6 != null) {
                    constraintLayout6.setLayoutParams(layoutParams);
                    return;
                } else {
                    o.LJIJI("layoutPKCountDown");
                    throw null;
                }
            }
            o.LJIJI("layoutPKCountDown");
            throw null;
        }
        o.LJIJI("layoutPKCountDown");
        throw null;
    }

    @Override // com.bytedance.assem.arch.core.UIAssem
    public final void onViewCreated(View view) {
        o.LJIIIZ(view, "view");
        super.onViewCreated(view);
        ConstraintLayout constraintLayout = (ConstraintLayout) view;
        this.LJLJLJ = constraintLayout;
        this.LJLLJ = ((C74039T3z) this.LJLIL.getValue()).LJLILLLLZI;
        View findViewById = view.findViewById(R.id.f8n);
        o.LJIIIIZZ(findViewById, "view.findViewById(R.id.iv_pk_fist)");
        this.LJLJI = (ImageView) findViewById;
        View findViewById2 = view.findViewById(R.id.f8k);
        o.LJIIIIZZ(findViewById2, "view.findViewById(R.id.iv_pk_calculate_clock)");
        this.LJLJJI = (C2A4) findViewById2;
        View findViewById3 = view.findViewById(R.id.me1);
        o.LJIIIIZZ(findViewById3, "view.findViewById(R.id.tv_pk_only_gift)");
        this.LJLJJL = (C47121t6) findViewById3;
        View findViewById4 = view.findViewById(R.id.me0);
        o.LJIIIIZZ(findViewById4, "view.findViewById(R.id.tv_pk_countdown_value)");
        this.LJLJJLL = (C47121t6) findViewById4;
        View findViewById5 = view.findViewById(R.id.mcp);
        o.LJIIIIZZ(findViewById5, "view.findViewById(R.id.tv_only_gift_tip)");
        this.LJLJL = (CMV) findViewById5;
        this.LJLLL = C04270Et.LIZIZ(constraintLayout.getContext(), R.drawable.cfo);
        C259910h.LIZIZ(R.attr.ar7, getContext());
        this.LJLLLL = Integer.valueOf(C259910h.LIZIZ(R.attr.ape, getContext()));
        C81705W4v LIZJ = W5I.LIZJ();
        LIZJ.LJII(C15510jD.LJIIIZ("tiktok_live_match_resource", "ttlive_match_calculating_clock.webp"));
        this.LJLLILLLL = LIZJ;
        this.LJLLLLLL = "";
        DataChannel dataChannel = this.LJLLJ;
        if (dataChannel != null) {
            dataChannel.mv0(BattleTimeLeftChannel.class, this, new AqS179S0100000_13(this, 225));
            dataChannel.mv0(BattleDrawTimeLeftChannel.class, this, new AqS179S0100000_13(this, 226));
            dataChannel.mv0(BattleStateChannel.class, this, new AqS179S0100000_13(this, 227));
        }
    }

    public final float x3(float f) {
        ConstraintLayout constraintLayout = this.LJLJLJ;
        if (constraintLayout != null) {
            return TypedValue.applyDimension(1, f, constraintLayout.getContext().getResources().getDisplayMetrics());
        }
        o.LJIJI("layoutPKCountDown");
        throw null;
    }

    public final AnimatorSet A3(long j, float f) {
        AnimatorSet animatorSet = new AnimatorSet();
        C47121t6 c47121t6 = this.LJLJJLL;
        if (c47121t6 != null) {
            animatorSet.playTogether(ObjectAnimator.ofFloat(c47121t6, (Property<C47121t6, Float>) View.ALPHA, f, 1.0f));
            animatorSet.setDuration(j);
            return animatorSet;
        }
        o.LJIJI("tvPKCountDownValue");
        throw null;
    }

    public final AnimatorSet C3(long j, float f, float f2) {
        AnimatorSet animatorSet = new AnimatorSet();
        C47121t6 c47121t6 = this.LJLJJLL;
        if (c47121t6 != null) {
            ObjectAnimator ofFloat = ObjectAnimator.ofFloat(c47121t6, (Property<C47121t6, Float>) View.SCALE_X, f, f2);
            C47121t6 c47121t62 = this.LJLJJLL;
            if (c47121t62 != null) {
                animatorSet.playTogether(ofFloat, ObjectAnimator.ofFloat(c47121t62, (Property<C47121t6, Float>) View.SCALE_Y, f, f2));
                animatorSet.setDuration(j);
                return animatorSet;
            }
            o.LJIJI("tvPKCountDownValue");
            throw null;
        }
        o.LJIJI("tvPKCountDownValue");
        throw null;
    }
}
