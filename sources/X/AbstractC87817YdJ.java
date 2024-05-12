package X;

import Y.ARunnableS35S0200000_16;
import android.graphics.Color;
import android.os.Handler;
import android.text.SpannableStringBuilder;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.cardview.widget.CardView;
import com.bytedance.android.livesdk.livesetting.performance.RankOptimizeSetting;
import com.bytedance.android.livesdk.livesetting.rank.RankEntranceLoopInterval;
import com.bytedance.android.livesdk.livesetting.rank.RankEntranceMarqueeInterval;
import com.bytedance.android.livesdk.model.message.RankAnimationInfo;
import com.bytedance.android.livesdk.rank.api.RankTypeV2;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.internal.o;

/* renamed from: X.YdJ, reason: case insensitive filesystem */
/* loaded from: classes17.dex */
public abstract class AbstractC87817YdJ {
    public final CardView LIZ;
    public final C87818YdK LIZIZ;
    public final CardView LIZJ;
    public final View LIZLLL;
    public final LinearLayout LJ;
    public final ImageView LJFF;
    public final TextView LJI;
    public final CardView LJII;
    public final LinearLayout LJIIIIZZ;
    public final ImageView LJIIIZ;
    public final TextView LJIIJ;
    public final ViewGroup LJIIJJI;
    public final View LJIIL;
    public boolean LJIILIIL;

    public abstract void LJ(C31521CYr c31521CYr);

    public final void LIZ() {
        C80955Vpv c80955Vpv;
        if (this.LIZ.getParent() instanceof C80955Vpv) {
            ViewParent parent = this.LIZ.getParent();
            if ((parent instanceof C80955Vpv) && (c80955Vpv = (C80955Vpv) parent) != null && c80955Vpv.getEnableFixedSize()) {
                c80955Vpv.LJLJL.run();
            }
        }
    }

    public static boolean LIZJ(C31521CYr c31521CYr) {
        RankAnimationInfo rankAnimationInfo = c31521CYr.LJFF;
        if (rankAnimationInfo != null && rankAnimationInfo.type == EnumC31519CYp.BEFORE_SETTLE.getType()) {
            return false;
        }
        RankAnimationInfo rankAnimationInfo2 = c31521CYr.LJFF;
        if (rankAnimationInfo2 != null && rankAnimationInfo2.type == EnumC31519CYp.BEFORE_SETTLE_SIMPLE.getType()) {
            return false;
        }
        return true;
    }

    public static void LJFF(View view) {
        o.LJIIIZ(view, "view");
        view.measure(View.MeasureSpec.makeMeasureSpec(0, 0), View.MeasureSpec.makeMeasureSpec(0, 0));
    }

    public final void LIZLLL(C31521CYr textInfo) {
        String str;
        C87818YdK c87818YdK;
        C31521CYr c31521CYr;
        o.LJIIIZ(textInfo, "textInfo");
        if (LIZJ(textInfo) && ((c31521CYr = (c87818YdK = this.LIZIZ).LJIIJJI) == null || c31521CYr.LJI <= textInfo.LJI)) {
            c87818YdK.LJIIJJI = textInfo;
        }
        C31521CYr c31521CYr2 = this.LIZIZ.LJIIJJI;
        if (c31521CYr2 != null && c31521CYr2.LJI > textInfo.LJI) {
            C31526CYw c31526CYw = c31521CYr2.LIZ;
            o.LJIIIZ(c31526CYw, "<set-?>");
            textInfo.LIZ = c31526CYw;
            String str2 = c31521CYr2.LIZIZ;
            o.LJIIIZ(str2, "<set-?>");
            textInfo.LIZIZ = str2;
        }
        if (this.LJIILIIL) {
            if (!(this instanceof C87822YdO) && !(this instanceof C87827YdT) && !LIZJ(textInfo)) {
                this.LIZIZ.LJIILIIL = textInfo;
                return;
            }
            return;
        }
        LJII(true);
        if (LIZJ(textInfo)) {
            TextView textView = this.LJIIJ;
            C31521CYr c31521CYr3 = this.LIZIZ.LJIIJJI;
            if (c31521CYr3 != null) {
                str = c31521CYr3.LIZIZ;
            } else {
                str = null;
            }
            textView.setText(str);
            LJI(this.LJIIIZ, this.LIZIZ.LJIIJJI);
            LJIIL(this.LIZIZ.LJIIJJI);
        }
        try {
            if (!(this instanceof C87794Ycw)) {
                C88207Yjb.LJIIL("rank_anim", new CHO(textInfo.LIZ.LIZIZ.type, C16880lQ.LJLLJ(getClass())));
            }
            LJ(textInfo);
        } catch (Throwable unused) {
            LJII(false);
        }
    }

    public final void LJII(boolean z) {
        long j;
        this.LJIILIIL = z;
        if (z) {
            this.LIZIZ.LIZ(this);
            return;
        }
        boolean z2 = false;
        if (!(this instanceof C87822YdO) && !(this instanceof C87827YdT)) {
            C87818YdK c87818YdK = this.LIZIZ;
            if (c87818YdK.LJIIL) {
                C31521CYr c31521CYr = c87818YdK.LJIIJJI;
                if (c31521CYr != null) {
                    this.LJI.setText(c31521CYr.LIZIZ);
                    LJI(this.LJFF, c31521CYr);
                    LJIIL(c31521CYr);
                }
                this.LIZJ.setCardBackgroundColor(this.LIZIZ.LJFF);
                LJIIIIZZ(this.LIZ, -2);
                LJIIIIZZ(this.LIZJ, -2);
                LJIIIIZZ(this.LJII, -2);
                LJIIIIZZ(this.LJIIJJI, -2);
            }
        }
        this.LIZIZ.LIZ(null);
        if (!(this instanceof C87794Ycw)) {
            C88207Yjb.LIZ("rank_anim");
        }
        this.LIZIZ.LIZ.LIZJ().LJIIZILJ = false;
        C87818YdK c87818YdK2 = this.LIZIZ;
        C31521CYr c31521CYr2 = c87818YdK2.LJIIJJI;
        if (c31521CYr2 != null && (c31521CYr2.LIZLLL || c31521CYr2.LJ)) {
            if (c31521CYr2.LIZLLL) {
                z2 = true;
            }
            ARunnableS35S0200000_16 aRunnableS35S0200000_16 = c87818YdK2.LJIIZILJ;
            if (aRunnableS35S0200000_16 != null) {
                c87818YdK2.LJIILL.removeCallbacks(aRunnableS35S0200000_16);
            }
            C31521CYr c31521CYr3 = c87818YdK2.LJIIJJI;
            if (c31521CYr3 != null) {
                ARunnableS35S0200000_16 aRunnableS35S0200000_162 = new ARunnableS35S0200000_16(c87818YdK2, c31521CYr3, 1);
                c87818YdK2.LJIIZILJ = aRunnableS35S0200000_162;
                Handler handler = c87818YdK2.LJIILL;
                RankEntranceLoopInterval.Config value = RankEntranceLoopInterval.INSTANCE.getValue();
                if (z2) {
                    j = value.onRankLoopInterval;
                } else {
                    j = value.offRankLoopInterval;
                }
                handler.postDelayed(aRunnableS35S0200000_162, j);
            }
        } else if (c87818YdK2.LIZJ && c87818YdK2.LJIIL) {
            ARunnableS35S0200000_16 aRunnableS35S0200000_163 = c87818YdK2.LJIJ;
            if (aRunnableS35S0200000_163 != null) {
                c87818YdK2.LJIILL.removeCallbacks(aRunnableS35S0200000_163);
            }
            C31521CYr c31521CYr4 = c87818YdK2.LJIIJJI;
            if (c31521CYr4 != null) {
                ARunnableS35S0200000_16 aRunnableS35S0200000_164 = new ARunnableS35S0200000_16(c87818YdK2, c31521CYr4, 2);
                c87818YdK2.LJIJ = aRunnableS35S0200000_164;
                c87818YdK2.LJIILL.postDelayed(aRunnableS35S0200000_164, RankEntranceMarqueeInterval.INSTANCE.getValue());
            }
        }
        this.LIZIZ.LJIIL = true;
    }

    public final void LJIIL(C31521CYr c31521CYr) {
        RankTypeV2 rankTypeV2;
        C31526CYw c31526CYw;
        C87818YdK c87818YdK = this.LIZIZ;
        if (c31521CYr != null && (c31526CYw = c31521CYr.LIZ) != null) {
            rankTypeV2 = c31526CYw.LIZIZ;
        } else {
            rankTypeV2 = null;
        }
        c87818YdK.LIZIZ.LJJLIIIJL(!o.LJ(rankTypeV2, RankTypeV2.LJII));
    }

    public AbstractC87817YdJ(CardView parentContainer, C87818YdK dataHolder) {
        o.LJIIIZ(parentContainer, "parentContainer");
        o.LJIIIZ(dataHolder, "dataHolder");
        this.LIZ = parentContainer;
        this.LIZIZ = dataHolder;
        View findViewById = parentContainer.findViewById(R.id.imi);
        o.LJIIIIZZ(findViewById, "parentContainer.findView….rank_entrance_container)");
        this.LIZJ = (CardView) findViewById;
        View findViewById2 = parentContainer.findViewById(R.id.imm);
        o.LJIIIIZZ(findViewById2, "parentContainer.findView…entrance_text_background)");
        this.LIZLLL = findViewById2;
        View findViewById3 = parentContainer.findViewById(R.id.iml);
        o.LJIIIIZZ(findViewById3, "parentContainer.findView…k_entrance_text_and_icon)");
        this.LJ = (LinearLayout) findViewById3;
        View findViewById4 = parentContainer.findViewById(R.id.imj);
        o.LJIIIIZZ(findViewById4, "parentContainer.findView…(R.id.rank_entrance_icon)");
        this.LJFF = (ImageView) findViewById4;
        View findViewById5 = parentContainer.findViewById(R.id.imk);
        o.LJIIIIZZ(findViewById5, "parentContainer.findView…(R.id.rank_entrance_text)");
        this.LJI = (TextView) findViewById5;
        View findViewById6 = parentContainer.findViewById(R.id.im7);
        o.LJIIIIZZ(findViewById6, "parentContainer.findView…rank_animation_container)");
        this.LJII = (CardView) findViewById6;
        View findViewById7 = parentContainer.findViewById(R.id.ima);
        o.LJIIIIZZ(findViewById7, "parentContainer.findView…_animation_text_and_icon)");
        this.LJIIIIZZ = (LinearLayout) findViewById7;
        View findViewById8 = parentContainer.findViewById(R.id.im8);
        o.LJIIIIZZ(findViewById8, "parentContainer.findView…R.id.rank_animation_icon)");
        this.LJIIIZ = (ImageView) findViewById8;
        View findViewById9 = parentContainer.findViewById(R.id.im_);
        o.LJIIIIZZ(findViewById9, "parentContainer.findView…R.id.rank_animation_text)");
        this.LJIIJ = (TextView) findViewById9;
        View findViewById10 = parentContainer.findViewById(R.id.im9);
        o.LJIIIIZZ(findViewById10, "parentContainer.findView…nimation_sweep_container)");
        this.LJIIJJI = (ViewGroup) findViewById10;
        View findViewById11 = parentContainer.findViewById(R.id.kwk);
        o.LJIIIIZZ(findViewById11, "parentContainer.findViewById(R.id.sweep_view)");
        this.LJIIL = findViewById11;
    }

    public static void LJI(ImageView imageView, C31521CYr c31521CYr) {
        EnumC31514CYk enumC31514CYk;
        EnumC31514CYk enumC31514CYk2;
        RankTypeV2 rankTypeV2;
        int i;
        RankTypeV2 rankTypeV22;
        C31526CYw c31526CYw;
        C31526CYw c31526CYw2;
        C31526CYw c31526CYw3;
        C31526CYw c31526CYw4;
        C31526CYw c31526CYw5;
        o.LJIIIZ(imageView, "imageView");
        RankTypeV2 rankTypeV23 = null;
        if (c31521CYr != null && (c31526CYw5 = c31521CYr.LIZ) != null) {
            enumC31514CYk = c31526CYw5.LIZ;
        } else {
            enumC31514CYk = null;
        }
        if (enumC31514CYk == EnumC31514CYk.E_COMMERCE) {
            i = R.drawable.czf;
        } else {
            if (c31521CYr != null && (c31526CYw4 = c31521CYr.LIZ) != null) {
                enumC31514CYk2 = c31526CYw4.LIZ;
            } else {
                enumC31514CYk2 = null;
            }
            if (enumC31514CYk2 == EnumC31514CYk.GAME_RANK) {
                i = R.drawable.czg;
            } else {
                if (c31521CYr != null && (c31526CYw3 = c31521CYr.LIZ) != null) {
                    rankTypeV2 = c31526CYw3.LIZIZ;
                } else {
                    rankTypeV2 = null;
                }
                if (!o.LJ(rankTypeV2, RankTypeV2.LIZJ)) {
                    if (c31521CYr != null && (c31526CYw2 = c31521CYr.LIZ) != null) {
                        rankTypeV22 = c31526CYw2.LIZIZ;
                    } else {
                        rankTypeV22 = null;
                    }
                    if (!o.LJ(rankTypeV22, RankTypeV2.LJIIJJI)) {
                        if (c31521CYr != null && (c31526CYw = c31521CYr.LIZ) != null) {
                            rankTypeV23 = c31526CYw.LIZIZ;
                        }
                        if (o.LJ(rankTypeV23, RankTypeV2.LJII)) {
                            i = R.drawable.d51;
                        } else {
                            i = R.drawable.csz;
                        }
                    }
                }
                i = R.drawable.czh;
            }
        }
        imageView.setImageResource(i);
    }

    public static void LJIIIIZZ(View view, int i) {
        o.LJIIIZ(view, "view");
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        layoutParams.width = i;
        view.setLayoutParams(layoutParams);
    }

    public static int LIZIZ(float f, int i, int i2) {
        if (i == i2) {
            return i;
        }
        return Color.argb((int) (((((i2 >> 24) & 255) - r2) * f) + ((i >> 24) & 255)), (int) (((((i2 >> 16) & 255) - r2) * f) + ((i >> 16) & 255)), (int) (((((i2 >> 8) & 255) - r2) * f) + ((i >> 8) & 255)), (int) ((((i2 & 255) - r2) * f) + (i & 255)));
    }

    public final void LJIIIZ(YZJ type, TextView textView, SpannableStringBuilder spannableStringBuilder, long j, InterfaceC87791Yct interfaceC87791Yct) {
        o.LJIIIZ(type, "type");
        o.LJIIIZ(textView, "textView");
        if (!this.LIZIZ.LIZJ || (0 <= j && j < 2000)) {
            if (interfaceC87791Yct != null) {
                interfaceC87791Yct.LIZ();
                return;
            }
            return;
        }
        long j2 = j - 200;
        int i = YZK.LIZ[type.ordinal()];
        if (i != 1) {
            if (i != 2) {
                return;
            }
            String spannableStringBuilder2 = spannableStringBuilder.toString();
            o.LJIIIIZZ(spannableStringBuilder2, "stringBuilder.toString()");
            textView.setText(spannableStringBuilder);
            RunnableC87792Ycu runnableC87792Ycu = new RunnableC87792Ycu(textView, spannableStringBuilder, this, spannableStringBuilder2, interfaceC87791Yct, j2);
            if (RankOptimizeSetting.INSTANCE.getValue()) {
                textView.postOnAnimation(runnableC87792Ycu);
                return;
            } else {
                textView.post(runnableC87792Ycu);
                return;
            }
        }
        textView.setText(spannableStringBuilder);
        RunnableC87801Yd3 runnableC87801Yd3 = new RunnableC87801Yd3(textView, this, j2, interfaceC87791Yct);
        if (RankOptimizeSetting.INSTANCE.getValue()) {
            textView.postOnAnimation(runnableC87801Yd3);
        } else {
            textView.post(runnableC87801Yd3);
        }
    }

    public final void LJIIJ(YZJ type, TextView textView, String text, long j, InterfaceC87791Yct interfaceC87791Yct) {
        o.LJIIIZ(type, "type");
        o.LJIIIZ(textView, "textView");
        o.LJIIIZ(text, "text");
        LJIIIZ(type, textView, new SpannableStringBuilder(text), j, interfaceC87791Yct);
    }
}
