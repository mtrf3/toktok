package X;

import Y.ACListenerS25S0100000_5;
import Y.ARunnableS41S0100000_5;
import Y.AUListenerS90S0100000_1;
import Y.AUListenerS94S0100000_5;
import Y.IDAListenerS74S0100000_5;
import android.animation.AnimatorSet;
import android.animation.ArgbEvaluator;
import android.animation.ObjectAnimator;
import android.animation.ValueAnimator;
import android.text.TextPaint;
import android.util.Property;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import au3.IDdS56S0100000_5;
import com.bytedance.android.live.base.model.ImageModel;
import com.bytedance.android.livesdk.gift.model.GiftColorInfo;
import com.bytedance.mt.protector.impl.color.ColorProtector;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.internal.o;

/* renamed from: X.Cpj, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C32531Cpj extends AbstractC32520CpY {
    public InterfaceC32530Cpi LJLIL;
    public final View LJLILLLLZI;
    public final TextView LJLJI;
    public C32522Cpa LJLJJI;
    public final C47061t0 LJLJJL;
    public final int LJLJJLL;
    public final int LJLJL;

    public C32531Cpj(View view) {
        super(view);
        this.LJLJJLL = ColorProtector.parseColor("#44000000");
        this.LJLJL = ColorProtector.parseColor("#22FFFFFF");
        this.LJLJJL = (C47061t0) view.findViewById(R.id.hvl);
        this.LJLILLLLZI = view.findViewById(R.id.af5);
        this.LJLJI = (TextView) view.findViewById(R.id.text);
        C16880lQ.LJIIJ(new ACListenerS25S0100000_5(this, 458), view);
    }

    @Override // X.AbstractC32520CpY
    public final void L(C32522Cpa c32522Cpa, InterfaceC32530Cpi interfaceC32530Cpi) {
        TextPaint paint;
        String str;
        GiftColorInfo giftColorInfo;
        String str2;
        GiftColorInfo giftColorInfo2;
        GiftColorInfo giftColorInfo3;
        ImageModel imageModel;
        int i;
        int i2;
        String str3;
        ViewGroup.LayoutParams layoutParams;
        TextPaint paint2;
        String str4;
        GiftColorInfo giftColorInfo4;
        this.LJLIL = interfaceC32530Cpi;
        this.LJLJJI = c32522Cpa;
        float f = 0.0f;
        if (c32522Cpa.LIZJ) {
            TextView textView = this.LJLJI;
            if (textView != null) {
                GiftColorInfo giftColorInfo5 = c32522Cpa.LIZ;
                if (giftColorInfo5 != null) {
                    str3 = giftColorInfo5.colorName;
                } else {
                    str3 = null;
                }
                textView.setText(str3);
            }
            TextView textView2 = this.LJLJI;
            if (textView2 != null && (paint2 = textView2.getPaint()) != null) {
                C32522Cpa c32522Cpa2 = this.LJLJJI;
                if (c32522Cpa2 == null || (giftColorInfo4 = c32522Cpa2.LIZ) == null || (str4 = giftColorInfo4.colorName) == null) {
                    str4 = "";
                }
                f = paint2.measureText(str4);
            }
            int i3 = (int) f;
            TextView textView3 = this.LJLJI;
            if (textView3 != null && (layoutParams = textView3.getLayoutParams()) != null) {
                layoutParams.width = 0;
            }
            TextView textView4 = this.LJLJI;
            if (textView4 != null) {
                textView4.postDelayed(new ARunnableS41S0100000_5(this, 349), 50L);
            }
            AnimatorSet animatorSet = new AnimatorSet();
            ValueAnimator valueAnimator = new ValueAnimator();
            ObjectAnimator objectAnimator = new ObjectAnimator();
            TextView textView5 = this.LJLJI;
            if (textView5 != null) {
                objectAnimator = ObjectAnimator.ofFloat(textView5, (Property<TextView, Float>) View.ALPHA, 0.0f, 1.0f);
                o.LJIIIIZZ(objectAnimator, "ofFloat(it, View.ALPHA, 0F, 1F)");
                objectAnimator.setDuration(200L);
                valueAnimator = ValueAnimator.ofInt(0, i3).setDuration(200L);
                o.LJIIIIZZ(valueAnimator, "ofInt(0, length).setDuration(200)");
                valueAnimator.addUpdateListener(new AUListenerS90S0100000_1(textView5, 96));
            }
            ValueAnimator valueAnimator2 = new ValueAnimator();
            valueAnimator2.setIntValues(this.LJLJL, this.LJLJJLL);
            valueAnimator2.setEvaluator(new ArgbEvaluator());
            valueAnimator2.addUpdateListener(new AUListenerS94S0100000_5(this, 72));
            valueAnimator2.setDuration(200L);
            animatorSet.playTogether(valueAnimator, objectAnimator, valueAnimator2);
            animatorSet.start();
        } else {
            TextView textView6 = this.LJLJI;
            if (textView6 != null && textView6.getVisibility() == 0) {
                TextView textView7 = this.LJLJI;
                if (textView7 != null && (paint = textView7.getPaint()) != null) {
                    C32522Cpa c32522Cpa3 = this.LJLJJI;
                    if (c32522Cpa3 != null && (giftColorInfo = c32522Cpa3.LIZ) != null) {
                        str = giftColorInfo.colorName;
                    } else {
                        str = null;
                    }
                    f = paint.measureText(str);
                }
                int i4 = (int) f;
                AnimatorSet animatorSet2 = new AnimatorSet();
                ValueAnimator valueAnimator3 = new ValueAnimator();
                ObjectAnimator objectAnimator2 = new ObjectAnimator();
                TextView textView8 = this.LJLJI;
                if (textView8 != null) {
                    objectAnimator2 = ObjectAnimator.ofFloat(textView8, (Property<TextView, Float>) View.ALPHA, 1.0f, 0.0f);
                    o.LJIIIIZZ(objectAnimator2, "ofFloat(it, View.ALPHA, 1F, 0F)");
                    objectAnimator2.setDuration(180L);
                    valueAnimator3 = ValueAnimator.ofInt(i4, 0).setDuration(180L);
                    o.LJIIIIZZ(valueAnimator3, "ofInt(length, 0).setDuration(180)");
                    valueAnimator3.addUpdateListener(new AUListenerS90S0100000_1(textView8, 95));
                }
                ValueAnimator valueAnimator4 = new ValueAnimator();
                valueAnimator4.setIntValues(this.LJLJJLL, this.LJLJL);
                valueAnimator4.setEvaluator(new ArgbEvaluator());
                valueAnimator4.addUpdateListener(new AUListenerS94S0100000_5(this, 71));
                valueAnimator4.setDuration(180L);
                animatorSet2.playTogether(valueAnimator3, objectAnimator2, valueAnimator4);
                animatorSet2.addListener(new IDAListenerS74S0100000_5(this, 41));
                animatorSet2.start();
            }
        }
        TextView textView9 = this.LJLJI;
        if (textView9 != null) {
            C32522Cpa c32522Cpa4 = this.LJLJJI;
            if (c32522Cpa4 != null && (giftColorInfo2 = c32522Cpa4.LIZ) != null) {
                str2 = giftColorInfo2.colorName;
            } else {
                str2 = null;
            }
            textView9.setText(str2);
        }
        C47061t0 c47061t0 = this.LJLJJL;
        if (c47061t0 != null) {
            c47061t0.setBackground(null);
        }
        IDdS56S0100000_5 iDdS56S0100000_5 = new IDdS56S0100000_5(this, 14);
        C32522Cpa c32522Cpa5 = this.LJLJJI;
        if (c32522Cpa5 != null && (giftColorInfo3 = c32522Cpa5.LIZ) != null && (imageModel = giftColorInfo3.colorImage) != null) {
            C47061t0 c47061t02 = this.LJLJJL;
            if (c47061t02 != null) {
                i = c47061t02.getMeasuredWidth();
            } else {
                i = -1;
            }
            C47061t0 c47061t03 = this.LJLJJL;
            if (c47061t03 != null) {
                i2 = c47061t03.getMeasuredHeight();
            } else {
                i2 = -1;
            }
            C30760C5k.LIZIZ(c47061t02, imageModel, -1, iDdS56S0100000_5, i, i2);
        }
    }
}
