package X;

import Y.ACListenerS33S0100000_13;
import Y.ALAdapterS10S0200000_13;
import Y.ARunnableS17S0101000_13;
import Y.ARunnableS32S0200000_13;
import Y.ARunnableS49S0100000_13;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.animation.ValueAnimator;
import android.content.Context;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.util.Property;
import android.view.View;
import android.view.animation.Interpolator;
import android.view.animation.PathInterpolator;
import android.widget.FrameLayout;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.bytedance.android.livesdk.model.message.battle.BattleTruthOrDareTriggerGuideV2;
import com.bytedance.mt.protector.impl.UriProtector;
import com.zhiliaoapp.musically.R;
import defpackage.a1;
import defpackage.b1;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Locale;
import java.util.Queue;
import kotlin.jvm.internal.o;
import o53.IDdS198S0200000_13;

/* loaded from: classes14.dex */
public final class U46 extends FrameLayout {
    public static final ArrayList<String> LLII = C47261Igj.LJII("gb", "de", "al", "ad", "at", "be", "bg", "hr", "cz", "dk", "ee", "fo", "fi", "fr", "gi", "gr", "gg", "va", "hu", "is", "ie", "im", "it", "je", "lv", "li", "lt", "lu", "mt", "mc", "nl", "mk", "no", "pl", "pt", "ro", "sm", "rs", "sk", "si", "es", "sj", "se", "ch", "ax");
    public AnimatorSet LJLIL;
    public Runnable LJLILLLLZI;
    public ARunnableS49S0100000_13 LJLJI;
    public ARunnableS49S0100000_13 LJLJJI;
    public Runnable LJLJJL;
    public ARunnableS49S0100000_13 LJLJJLL;
    public ARunnableS49S0100000_13 LJLJL;
    public ARunnableS17S0101000_13 LJLJLJ;
    public ARunnableS49S0100000_13 LJLJLLL;
    public ValueAnimator LJLL;
    public AnimatorSet LJLLI;
    public AnimatorSet LJLLILLLL;
    public AnimatorSet LJLLJ;
    public AnimatorSet LJLLL;
    public AnimatorSet LJLLLL;
    public AnimatorSet LJLLLLLL;
    public AnimatorSet LJLZ;
    public final Interpolator LJZ;
    public int LJZI;
    public String LJZL;
    public String LL;
    public String LLD;
    public C75838Tpa LLF;
    public Queue<BattleTruthOrDareTriggerGuideV2.TruthOrDareTip> LLFF;
    public boolean LLFFF;
    public boolean LLFII;
    public boolean LLFZ;
    public boolean LLI;
    public final java.util.Map<Integer, View> LLIFFJFJJ;

    public final View LIZ(int i) {
        java.util.Map<Integer, View> map = this.LLIFFJFJJ;
        View view = map.get(Integer.valueOf(i));
        if (view != null) {
            return view;
        }
        View findViewById = findViewById(i);
        if (findViewById == null) {
            return null;
        }
        map.put(Integer.valueOf(i), findViewById);
        return findViewById;
    }

    private final void getLanguageResource() {
        String str;
        String str2 = C76265TwT.LIZ.LJJJJZI;
        if (str2 != null) {
            str = str2.toLowerCase(Locale.ROOT);
            o.LJIIIIZZ(str, "this as java.lang.String).toLowerCase(Locale.ROOT)");
            if (str != null) {
                this.LLI = LLII.contains(str);
            }
        } else {
            str = null;
        }
        StringBuilder LIZIZ = C25620zW.LIZIZ("current re is ", str, ", is in eu ");
        FT5.LJ(LIZIZ, this.LLI, LIZIZ, "BattleVictoryLapActivityLayout");
        if (str != null) {
            int hashCode = str.hashCode();
            if (hashCode != 3201) {
                if (hashCode != 3291) {
                    if (hashCode != 3355) {
                        if (hashCode != 3500) {
                            if (hashCode != 3710) {
                                if (hashCode != 3742) {
                                    if (hashCode == 3768 && str.equals("vn")) {
                                        this.LJZL = "ttlive_truth_or_dare_appear_vn.zip";
                                        this.LL = "ttlive_truth_or_dare/ttlive_truth_or_dare_text_vn.png";
                                        this.LLD = "ttlive_truth_or_dare/ttlive_truth_or_dare_icon_vn.png";
                                        return;
                                    }
                                } else if (str.equals("us")) {
                                    this.LJZL = "ttlive_truth_or_dare_appear_us.zip";
                                    this.LL = "ttlive_truth_or_dare/ttlive_truth_or_dare_text_us.png";
                                    this.LLD = "ttlive_truth_or_dare/ttlive_truth_or_dare_icon_us.png";
                                    return;
                                }
                            } else if (str.equals("tr")) {
                                this.LJZL = "ttlive_truth_or_dare_appear_tr.zip";
                                this.LL = "ttlive_truth_or_dare/ttlive_truth_or_dare_text_tr.png";
                                this.LLD = "ttlive_truth_or_dare/ttlive_truth_or_dare_icon_tr.png";
                                return;
                            }
                        } else if (str.equals("my")) {
                            this.LJZL = "ttlive_truth_or_dare_appear_default.zip";
                            this.LL = "ttlive_truth_or_dare/ttlive_truth_or_dare_text_gb.png";
                            this.LLD = "ttlive_truth_or_dare/ttlive_truth_or_dare_icon_gb.png";
                            return;
                        }
                    } else if (str.equals("id")) {
                        this.LJZL = "ttlive_truth_or_dare_appear_id.zip";
                        this.LL = "ttlive_truth_or_dare/ttlive_truth_or_dare_text_id.png";
                        this.LLD = "ttlive_truth_or_dare/ttlive_truth_or_dare_icon_id.png";
                        return;
                    }
                } else if (str.equals("gb")) {
                    this.LJZL = "ttlive_truth_or_dare_appear_default_eu.zip";
                    this.LL = "ttlive_truth_or_dare/ttlive_truth_or_dare_text_gb_eu.png";
                    this.LLD = "ttlive_truth_or_dare/ttlive_truth_or_dare_icon_gb_eu.png";
                    return;
                }
            } else if (str.equals("de")) {
                this.LJZL = "ttlive_truth_or_dare_appear_de.zip";
                this.LL = "ttlive_truth_or_dare/ttlive_truth_or_dare_text_de.png";
                this.LLD = "ttlive_truth_or_dare/ttlive_truth_or_dare_icon_de.png";
                return;
            }
        }
        this.LJZL = a1.LJ("ttlive_truth_or_dare_appear_", str, ".zip");
        this.LL = a1.LJ("ttlive_truth_or_dare/ttlive_truth_or_dare_text_", str, ".png");
        this.LLD = a1.LJ("ttlive_truth_or_dare/ttlive_truth_or_dare_icon_", str, ".png");
        this.LLFZ = true;
        String LIZLLL = C15510jD.LIZLLL(CFX.LIZ("tiktok_live_watch_resource", "tiktok_live_interaction_demand_1"), this.LL);
        if (C15380j0.LIZLLL() == null || TextUtils.isEmpty(LIZLLL)) {
            return;
        }
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("preload gecko image path is ");
        LIZ.append(LIZLLL);
        C0NB.LJIIIZ("BattleVictoryLapActivityLayout", X1D.LIZIZ(LIZ));
        W5P LIZLLL2 = W5P.LIZLLL(UriProtector.parse(LIZLLL));
        LIZLLL2.LJIILJJIL = new U47(this);
        W5I.LIZ().LJIIL(LIZLLL2.LIZ(), C15380j0.LIZLLL());
    }

    public final void LIZIZ() {
        AnimatorSet animatorSet = this.LJLIL;
        if (animatorSet != null) {
            C16880lQ.LJLJJL(animatorSet);
        }
        AnimatorSet animatorSet2 = this.LJLIL;
        if (animatorSet2 != null) {
            animatorSet2.cancel();
        }
        this.LJLIL = null;
    }

    public final void LJ() {
        List<BattleTruthOrDareTriggerGuideV2.TruthOrDareTip> list;
        BattleTruthOrDareTriggerGuideV2 battleTruthOrDareTriggerGuideV2 = C76265TwT.LIZ.LJJJLIIL;
        if (battleTruthOrDareTriggerGuideV2 != null) {
            list = battleTruthOrDareTriggerGuideV2.tips;
        } else {
            list = null;
        }
        setTruthOrDareTips(list);
        C29306Beo.LJI(LIZ(R.id.mq7));
        C29306Beo.LJI(LIZ(R.id.exa));
        C29306Beo.LJJLJLI(LIZ(R.id.jcw));
        LIZ(R.id.jcw).setAlpha(0.0f);
        if (this.LLFFF) {
            if (C15380j0.LJIIZILJ()) {
                C29306Beo.LJJJJZ(C15380j0.LIZ(14.0f), C15380j0.LIZ(60.0f), LIZ(R.id.jcw));
            } else {
                C29306Beo.LJJJJZ(C15380j0.LIZ(60.0f), C15380j0.LIZ(14.0f), LIZ(R.id.jcw));
            }
        } else if (C15380j0.LJIIZILJ()) {
            C29306Beo.LJJJJZ(C15380j0.LIZ(14.0f), C15380j0.LIZ(51.0f), LIZ(R.id.jcw));
        } else {
            C29306Beo.LJJJJZ(C15380j0.LIZ(51.0f), C15380j0.LIZ(14.0f), LIZ(R.id.jcw));
        }
        post(new ARunnableS49S0100000_13(this, 31));
    }

    public final void LJIIIZ() {
        AnimatorSet animatorSet = this.LJLLI;
        if (animatorSet != null) {
            C16880lQ.LJLJJL(animatorSet);
        }
        AnimatorSet animatorSet2 = this.LJLLI;
        if (animatorSet2 != null) {
            animatorSet2.cancel();
        }
        AnimatorSet animatorSet3 = this.LJLLILLLL;
        if (animatorSet3 != null) {
            C16880lQ.LJLJJL(animatorSet3);
        }
        AnimatorSet animatorSet4 = this.LJLLILLLL;
        if (animatorSet4 != null) {
            animatorSet4.cancel();
        }
        AnimatorSet animatorSet5 = this.LJLLJ;
        if (animatorSet5 != null) {
            C16880lQ.LJLJJL(animatorSet5);
        }
        AnimatorSet animatorSet6 = this.LJLLJ;
        if (animatorSet6 != null) {
            animatorSet6.cancel();
        }
        AnimatorSet animatorSet7 = this.LJLLL;
        if (animatorSet7 != null) {
            C16880lQ.LJLJJL(animatorSet7);
        }
        AnimatorSet animatorSet8 = this.LJLLL;
        if (animatorSet8 != null) {
            animatorSet8.cancel();
        }
        AnimatorSet animatorSet9 = this.LJLLLL;
        if (animatorSet9 != null) {
            C16880lQ.LJLJJL(animatorSet9);
        }
        AnimatorSet animatorSet10 = this.LJLLLL;
        if (animatorSet10 != null) {
            animatorSet10.cancel();
        }
        AnimatorSet animatorSet11 = this.LJLLLLLL;
        if (animatorSet11 != null) {
            C16880lQ.LJLJJL(animatorSet11);
        }
        AnimatorSet animatorSet12 = this.LJLLLLLL;
        if (animatorSet12 != null) {
            animatorSet12.cancel();
        }
        AnimatorSet animatorSet13 = this.LJLZ;
        if (animatorSet13 != null) {
            C16880lQ.LJLJJL(animatorSet13);
        }
        AnimatorSet animatorSet14 = this.LJLZ;
        if (animatorSet14 != null) {
            animatorSet14.cancel();
        }
        removeCallbacks(this.LJLILLLLZI);
        removeCallbacks(this.LJLJI);
        removeCallbacks(this.LJLJJI);
        removeCallbacks(this.LJLJJL);
        removeCallbacks(this.LJLJLJ);
        removeCallbacks(this.LJLJLLL);
        removeCallbacks(this.LJLJJLL);
        removeCallbacks(this.LJLJL);
        ValueAnimator valueAnimator = this.LJLL;
        if (valueAnimator != null) {
            valueAnimator.removeAllUpdateListeners();
        }
    }

    public final void LJIIJ() {
        C0NB.LJIIIZ("BattleVictoryLapActivityLayout", " start reset all Animator ");
        LIZIZ();
        LJIIIZ();
        LJIIJJI(LIZ(R.id.ga8));
        LJIIJJI(LIZ(R.id.g71));
        LJIIJJI(LIZ(R.id.dhk));
        LJIIJJI(LIZ(R.id.ga9));
        LJIIJJI(LIZ(R.id.dh9));
        LJIIJJI(LIZ(R.id.fbu));
        LJIIJJI(LIZ(R.id.ajp));
        LJIIJJI(LIZ(R.id.ajq));
        C5GE c5ge = (C5GE) LIZ(R.id.dhk);
        c5ge.LJLILLLLZI.set(0.0f, 0.0f, c5ge.getWidth(), c5ge.getHeight());
        c5ge.LJLJI = c5ge.LJLJJI;
        c5ge.LJLJJL = true;
        C29306Beo.LJI(LIZ(R.id.dhk));
        C5GE c5ge2 = (C5GE) LIZ(R.id.dhl);
        c5ge2.LJLILLLLZI.set(0.0f, 0.0f, c5ge2.getWidth(), c5ge2.getHeight());
        c5ge2.LJLJI = c5ge2.LJLJJI;
        c5ge2.LJLJJL = true;
        C29306Beo.LJI(LIZ(R.id.dhl));
        this.LJZI = 0;
        LIZ(R.id.jcw).setScrollX(0);
        C75838Tpa c75838Tpa = this.LLF;
        if (c75838Tpa != null) {
            c75838Tpa.LIZJ(0, false);
        }
    }

    public final void LJIIL() {
        C0NB.LJIIIZ("BattleVictoryLapActivityLayout", " don't have region resource, reset to default");
        if (this.LLI) {
            this.LJZL = "ttlive_truth_or_dare_appear_default_eu.zip";
            this.LL = "ttlive_truth_or_dare/ttlive_truth_or_dare_text_gb_eu.png";
            this.LLD = "ttlive_truth_or_dare/ttlive_truth_or_dare_icon_gb_eu.png";
        } else {
            this.LJZL = "ttlive_truth_or_dare_appear_default.zip";
            this.LL = "ttlive_truth_or_dare/ttlive_truth_or_dare_text_gb.png";
            this.LLD = "ttlive_truth_or_dare/ttlive_truth_or_dare_icon_gb.png";
        }
    }

    public final void LJIILJJIL() {
        BattleTruthOrDareTriggerGuideV2.TruthOrDareTip poll = this.LLFF.poll();
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append(" current tip is ");
        LIZ.append(poll);
        LIZ.append(", left tips is ");
        LIZ.append(this.LLFF);
        LIZ.append(", show tips Count is ");
        b1.LJ(LIZ, this.LJZI, LIZ, "BattleVictoryLapActivityLayout");
        if (poll != null && this.LJZI < 2) {
            TextView textView = (TextView) LIZ(R.id.mpf);
            String LIZ2 = C86881Y7x.LIZIZ().LIZ(poll.tipContentKey);
            String str = "";
            if (LIZ2 == null) {
                LIZ2 = "";
            }
            textView.setText(LIZ2);
            TextView textView2 = (TextView) LIZ(R.id.mpg);
            String LIZ3 = C86881Y7x.LIZIZ().LIZ(poll.tipTypeKey);
            if (LIZ3 != null) {
                str = LIZ3;
            }
            textView2.setText(str);
            post(new ARunnableS49S0100000_13(this, 37));
            this.LJZI++;
        }
    }

    public final void LIZLLL() {
        C29306Beo.LJJLJLI(LIZ(R.id.bdy));
        C15490jB.LJIILLIIL(LIZ(R.id.bdy), CFX.LIZ("tiktok_live_watch_resource", "tiktok_live_interaction_demand_1"), "ttlive_truth_or_dare/ttlive_truth_or_dare_bg1.png", new ARunnableS49S0100000_13(this, 29));
        C29306Beo.LJJLJLI(LIZ(R.id.fbv));
        C15490jB.LJ(LIZ(R.id.fbv), CFX.LIZ("tiktok_live_watch_resource", "tiktok_live_interaction_demand_1"), this.LLD);
        LIZ(R.id.bdy).setAlpha(0.0f);
        LIZ(R.id.fbv).setAlpha(0.0f);
        post(new ARunnableS49S0100000_13(this, 30));
    }

    public final void LJI() {
        LIZIZ();
        C29306Beo.LJJLJLI(LIZ(R.id.dhk));
        C29306Beo.LJJLJLI(LIZ(R.id.dhl));
        C29306Beo.LJJLJLI(LIZ(R.id.fbu));
        LIZ(R.id.dhk).setAlpha(0.0f);
        if (this.LLFZ && !this.LLFII) {
            LJIIL();
        }
        String LIZ = CFX.LIZ("tiktok_live_watch_resource", "tiktok_live_interaction_demand_1");
        String str = this.LL;
        C47061t0 iv_true_or_dare_head = (C47061t0) LIZ(R.id.fbu);
        o.LJIIIIZZ(iv_true_or_dare_head, "iv_true_or_dare_head");
        String LIZIZ = C15510jD.LIZIZ(LIZ, str);
        if (!TextUtils.isEmpty(LIZIZ)) {
            StringBuilder LIZ2 = X1D.LIZ();
            LIZ2.append("asset load gecko image path is ");
            LIZ2.append(LIZIZ);
            C0NB.LJIIIZ("BattleVictoryLapActivityLayout", X1D.LIZIZ(LIZ2));
            C81705W4v LIZJ = W5I.LIZJ();
            LIZJ.LJII(LIZIZ);
            LIZJ.LJII = new IDdS198S0200000_13(this, iv_true_or_dare_head, 3);
            iv_true_or_dare_head.setController(LIZJ.LIZ());
        } else {
            String LIZLLL = C15510jD.LIZLLL(LIZ, str);
            if (!TextUtils.isEmpty(LIZLLL)) {
                StringBuilder LIZ3 = X1D.LIZ();
                LIZ3.append("network load gecko image path is ");
                LIZ3.append(LIZLLL);
                C0NB.LJIIIZ("BattleVictoryLapActivityLayout", X1D.LIZIZ(LIZ3));
                C81705W4v LIZJ2 = W5I.LIZJ();
                LIZJ2.LJII(LIZLLL);
                LIZJ2.LJII = new IDdS198S0200000_13(this, iv_true_or_dare_head, 3);
                iv_true_or_dare_head.setController(LIZJ2.LIZ());
            }
        }
        post(new ARunnableS49S0100000_13(this, 33));
    }

    public final void LJIILIIL() {
        String LIZIZ;
        C29306Beo.LJJLJLI(LIZ(R.id.dh9));
        C15490jB.LJIILLIIL(LIZ(R.id.dh9), CFX.LIZ("tiktok_live_watch_resource", "tiktok_live_interaction_demand_1"), "ttlive_truth_or_dare/ttlive_truth_or_dare_time.png", new ARunnableS49S0100000_13(this, 36));
        String LJIIIIZZ = C31012CFc.LJIIIIZZ(50L);
        if (this.LLI) {
            StringBuilder LIZ = X1D.LIZ();
            LIZ.append(C15380j0.LJIILJJIL(R.string.omi));
            LIZ.append(' ');
            LIZ.append(LJIIIIZZ);
            LIZIZ = X1D.LIZIZ(LIZ);
        } else {
            StringBuilder LIZ2 = X1D.LIZ();
            LIZ2.append(C15380j0.LJIILJJIL(R.string.omf));
            LIZ2.append(' ');
            LIZ2.append(LJIIIIZZ);
            LIZIZ = X1D.LIZIZ(LIZ2);
        }
        LIZ(R.id.mnj).getLayoutParams().width = (int) (((TextView) LIZ(R.id.mnj)).getPaint().measureText(LIZIZ) + C15380j0.LIZ(5.0f));
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        LIZIZ();
        LJIIIZ();
        this.LJLLI = null;
        this.LJLL = null;
        this.LJLLILLLL = null;
        this.LJLLJ = null;
        this.LJLLL = null;
        this.LJLLLL = null;
        this.LJLLLLLL = null;
        this.LJLILLLLZI = null;
        this.LJLJI = null;
        this.LJLJJI = null;
        this.LJLJJL = null;
        this.LJLJJLL = null;
        this.LJLJLJ = null;
        this.LJLJLLL = null;
        this.LJLJL = null;
        this.LLF = null;
    }

    public final Queue<BattleTruthOrDareTriggerGuideV2.TruthOrDareTip> getTruthOrDareTips() {
        return this.LLFF;
    }

    public final C75838Tpa getVictoryLapActivityListener() {
        return this.LLF;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
    }

    public static void LJIIJJI(View view) {
        if (view != null) {
            C29306Beo.LJI(view);
            view.setAlpha(1.0f);
            view.setTranslationX(0.0f);
            view.setTranslationY(0.0f);
            view.setScaleX(1.0f);
            view.setScaleY(1.0f);
        }
    }

    private final void setGuideResource(String str) {
        String LIZ = C86881Y7x.LIZIZ().LIZ(str);
        if (LIZ == null) {
            LIZ = getResources().getString(R.string.omb);
            o.LJIIIIZZ(LIZ, "resources.getString(R.string.pm_tod_anima_instr)");
        }
        float measureText = ((TextView) LIZ(R.id.mq7)).getPaint().measureText(LIZ);
        StringBuilder LIZ2 = X1D.LIZ();
        LIZ2.append(" guide length is ");
        LIZ2.append(measureText);
        C0NB.LJIIIZ("BattleVictoryLapActivityLayout", X1D.LIZIZ(LIZ2));
        if (measureText > C15380j0.LIZ(267.0f) * 2) {
            this.LLFFF = true;
            StringBuilder LIZ3 = X1D.LIZ();
            LIZ3.append(" isSpaceLarge is ");
            LIZ3.append(this.LLFFF);
            C0NB.LJIIIZ("BattleVictoryLapActivityLayout", X1D.LIZIZ(LIZ3));
            C15490jB.LJIILLIIL(LIZ(R.id.g71), CFX.LIZ("tiktok_live_watch_resource", "tiktok_live_interaction_demand_1"), "ttlive_truth_or_dare/ttlive_truth_or_dare_bg3.png", new ARunnableS49S0100000_13(this, 34));
            if (C15380j0.LJIIZILJ()) {
                C29306Beo.LJJLIIIIJ(C15380j0.LIZ(62.0f), LIZ(R.id.mq7));
            } else {
                C29306Beo.LJJJLIIL(C15380j0.LIZ(62.0f), LIZ(R.id.mq7));
            }
        } else {
            this.LLFFF = false;
            StringBuilder LIZ4 = X1D.LIZ();
            LIZ4.append(" isSpaceLarge is ");
            LIZ4.append(this.LLFFF);
            C0NB.LJIIIZ("BattleVictoryLapActivityLayout", X1D.LIZIZ(LIZ4));
            C15490jB.LJIILLIIL(LIZ(R.id.g71), CFX.LIZ("tiktok_live_watch_resource", "tiktok_live_interaction_demand_1"), "ttlive_truth_or_dare/ttlive_truth_or_dare_bg2.png", new ARunnableS49S0100000_13(this, 35));
            if (C15380j0.LJIIZILJ()) {
                C29306Beo.LJJLIIIIJ(C15380j0.LIZ(52.0f), LIZ(R.id.mq7));
            } else {
                C29306Beo.LJJJLIIL(C15380j0.LIZ(52.0f), LIZ(R.id.mq7));
            }
        }
        ((TextView) LIZ(R.id.mq7)).setText(LIZ);
    }

    private final void setTruthOrDareTips(List<BattleTruthOrDareTriggerGuideV2.TruthOrDareTip> list) {
        this.LLFF.clear();
        if (list != null) {
            Iterator<BattleTruthOrDareTriggerGuideV2.TruthOrDareTip> it = list.iterator();
            while (it.hasNext()) {
                this.LLFF.add(it.next());
            }
        }
    }

    public final AnimatorSet LIZJ(C5GE c5ge) {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("borderView width is ");
        LIZ.append(c5ge.getWidth());
        LIZ.append(", height is ");
        LIZ.append(c5ge.getHeight());
        C0NB.LIZIZ("BattleVictoryLapActivityLayout", X1D.LIZIZ(LIZ));
        if (c5ge.getWidth() == 0 || c5ge.getHeight() == 0) {
            return new AnimatorSet();
        }
        AnimatorSet animatorSet = new AnimatorSet();
        float f = 1;
        float width = (10.0f / c5ge.getWidth()) + f;
        float height = (10.0f / c5ge.getHeight()) + f;
        ObjectAnimator ofFloat = ObjectAnimator.ofFloat(c5ge, (Property<C5GE, Float>) View.SCALE_X, 1.0f, width);
        o.LJIIIIZZ(ofFloat, "ofFloat(borderView, View.SCALE_X, 1f, outScaleX)");
        ofFloat.setInterpolator(this.LJZ);
        ObjectAnimator ofFloat2 = ObjectAnimator.ofFloat(c5ge, (Property<C5GE, Float>) View.SCALE_Y, 1.0f, height);
        o.LJIIIIZZ(ofFloat2, "ofFloat(borderView, View.SCALE_Y, 1f, outScaleY)");
        ofFloat2.setInterpolator(this.LJZ);
        ObjectAnimator ofFloat3 = ObjectAnimator.ofFloat(c5ge, (Property<C5GE, Float>) View.ALPHA, 0.0f, 1.0f);
        o.LJIIIIZZ(ofFloat3, "ofFloat(borderView, View.ALPHA, 0f, 1f)");
        animatorSet.setDuration(200L);
        animatorSet.playTogether(ofFloat, ofFloat2, ofFloat3);
        AnimatorSet animatorSet2 = new AnimatorSet();
        ObjectAnimator ofFloat4 = ObjectAnimator.ofFloat(c5ge, (Property<C5GE, Float>) View.SCALE_X, width, 1.0f);
        o.LJIIIIZZ(ofFloat4, "ofFloat(borderView, View.SCALE_X, outScaleX, 1f)");
        ofFloat4.setInterpolator(this.LJZ);
        ObjectAnimator ofFloat5 = ObjectAnimator.ofFloat(c5ge, (Property<C5GE, Float>) View.SCALE_Y, height, 1.0f);
        o.LJIIIIZZ(ofFloat5, "ofFloat(borderView, View.SCALE_Y, outScaleY, 1f)");
        ofFloat5.setInterpolator(this.LJZ);
        animatorSet2.setDuration(100L);
        animatorSet2.playTogether(ofFloat4, ofFloat5);
        AnimatorSet animatorSet3 = new AnimatorSet();
        animatorSet3.playSequentially(animatorSet, animatorSet2);
        return animatorSet3;
    }

    public final void LJFF(AnimatorSet animatorSet) {
        C0NB.LJIIIZ("BattleVictoryLapActivityLayout", "doTimerBannerAnimator, info = method_into");
        LIZIZ();
        LJIILIIL();
        LIZ(R.id.dh9).setAlpha(0.0f);
        post(new ARunnableS32S0200000_13(animatorSet, this, 15));
    }

    public final void LJIIIIZZ(int i) {
        View LIZ;
        C131915Fr c131915Fr;
        View LIZ2;
        C0NB.LJIIIZ("BattleVictoryLapActivityLayout", "doTruthOrDareTipsPopAnimator, info = method_into");
        if (i != 0) {
            if (i != 1) {
                return;
            }
            if (C15380j0.LJIIZILJ()) {
                LIZ2 = LIZ(R.id.ajq);
            } else {
                LIZ2 = LIZ(R.id.ajp);
            }
            c131915Fr = (C131915Fr) LIZ2;
            o.LJIIIIZZ(c131915Fr, "{\n            if (ResUti…r_dare_pop_left\n        }");
        } else {
            if (C15380j0.LJIIZILJ()) {
                LIZ = LIZ(R.id.ajp);
            } else {
                LIZ = LIZ(R.id.ajq);
            }
            c131915Fr = (C131915Fr) LIZ;
            o.LJIIIIZZ(c131915Fr, "{\n            if (ResUti…_dare_pop_right\n        }");
        }
        if (this.LLI) {
            ((TextView) LIZ(R.id.mpc)).setText(C15380j0.LJIILJJIL(R.string.omi));
            ((TextView) LIZ(R.id.mpd)).setText(C15380j0.LJIILJJIL(R.string.omi));
        }
        C29306Beo.LJJLJLI(c131915Fr);
        C75838Tpa c75838Tpa = this.LLF;
        if (c75838Tpa != null) {
            C29306Beo.LJI(c75838Tpa.LIZJ);
        }
        ObjectAnimator ofFloat = ObjectAnimator.ofFloat(c131915Fr, (Property<C131915Fr, Float>) View.ALPHA, 0.0f, 1.0f);
        ofFloat.setDuration(200L);
        ofFloat.setStartDelay(200L);
        ObjectAnimator ofFloat2 = ObjectAnimator.ofFloat(c131915Fr, (Property<C131915Fr, Float>) View.ALPHA, 1.0f, 0.0f);
        ofFloat2.setDuration(200L);
        ofFloat2.setStartDelay(3520L);
        AnimatorSet animatorSet = this.LJLLI;
        if (animatorSet != null) {
            C16880lQ.LJLJJL(animatorSet);
        }
        AnimatorSet animatorSet2 = this.LJLLI;
        if (animatorSet2 != null) {
            animatorSet2.cancel();
        }
        AnimatorSet animatorSet3 = new AnimatorSet();
        this.LJLLI = animatorSet3;
        animatorSet3.playSequentially(ofFloat, ofFloat2);
        AnimatorSet animatorSet4 = this.LJLLI;
        if (animatorSet4 != null) {
            animatorSet4.addListener(new ALAdapterS10S0200000_13(this, c131915Fr, 1));
        }
        AnimatorSet animatorSet5 = this.LJLLI;
        if (animatorSet5 != null) {
            animatorSet5.start();
        }
    }

    public final void setLongText(boolean z) {
        this.LLFFF = z;
    }

    public final void setVictoryLapActivityListener(C75838Tpa c75838Tpa) {
        this.LLF = c75838Tpa;
    }

    public final void setTruthOrDareTips(Queue<BattleTruthOrDareTriggerGuideV2.TruthOrDareTip> queue) {
        o.LJIIIZ(queue, "<set-?>");
        this.LLFF = queue;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public U46(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, 0);
        this.LLIFFJFJJ = C62850Ola.LJFF(context, "context");
        PathInterpolator LIZIZ = C18950ol.LIZIZ(0.42f, 0.0f, 0.58f, 1.0f);
        o.LJIIIIZZ(LIZIZ, "create(0.42f, 0f, 0.58f, 1f)");
        this.LJZ = LIZIZ;
        this.LJZL = "ttlive_truth_or_dare_appear_default.zip";
        this.LL = "ttlive_truth_or_dare/ttlive_truth_or_dare_text_gb.png";
        this.LLD = "ttlive_truth_or_dare/ttlive_truth_or_dare_icon_gb.png";
        this.LLFF = new LinkedList();
        C16880lQ.LLLLIILL(C16880lQ.LLZIL(context), R.layout.d_s, this, true);
        LIZ(R.id.dhk).setOnClickListener(new ViewOnClickListenerC13880ga(new ACListenerS33S0100000_13(this, 111)));
        C16880lQ.LJIL((ConstraintLayout) LIZ(R.id.g71), new ACListenerS33S0100000_13(this, 112));
        C16880lQ.LJIILJJIL((FrameLayout) LIZ(R.id.dh9), new ACListenerS33S0100000_13(this, 113));
        getLanguageResource();
    }

    public static void LJIILL(InterfaceC81599W0t interfaceC81599W0t, W5G w5g) {
        if (interfaceC81599W0t != null) {
            w5g.getLayoutParams().width = interfaceC81599W0t.getWidth();
            w5g.getLayoutParams().height = -2;
            w5g.setAspectRatio(interfaceC81599W0t.getWidth() / interfaceC81599W0t.getHeight());
        }
    }

    public final void LJII(int i, String str) {
        C29306Beo.LJI(LIZ(R.id.fbv));
        C29306Beo.LJI(LIZ(R.id.bdy));
        C29306Beo.LJJLJLI(LIZ(R.id.ga8));
        ((C29701Eo) LIZ(R.id.ga8)).setFrame(0);
        if (this.LLFZ && !this.LLFII) {
            LJIIL();
        }
        C15490jB.LJIIJ((C29701Eo) LIZ(R.id.ga8), CFX.LIZ("tiktok_live_lottie_resource", "tiktok_live_interaction_demand_1"), this.LJZL, true);
        C75838Tpa c75838Tpa = this.LLF;
        if (c75838Tpa != null) {
            c75838Tpa.LIZ("animation");
        }
        removeCallbacks(this.LJLJLJ);
        this.LJLJLJ = new ARunnableS17S0101000_13(i, this, 10);
        setGuideResource(str);
        postDelayed(this.LJLJLJ, 2500L);
    }
}
