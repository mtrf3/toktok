package X;

import Y.ACListenerS10S2100000_3;
import Y.ALAdapterS2S0200000_3;
import Y.AUListenerS92S0100000_3;
import Y.AUListenerS95S0200000_3;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.animation.ValueAnimator;
import android.content.Context;
import android.text.Editable;
import android.text.TextUtils;
import android.util.Property;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.Interpolator;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.bytedance.lighten.loader.SmartImageView;
import com.bytedance.tux.icon.TuxIconView;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.internal.o;

/* renamed from: X.6xc, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C177326xc {
    public final C224748ru LIZ;
    public final TuxIconView LIZIZ;
    public final ImageView LIZJ;
    public final SmartImageView LIZLLL;
    public final LinearLayout LJ;
    public final View LJFF;
    public final TextView LJI;
    public final View LJII;
    public final View LJIIIIZZ;
    public final SmartImageView LJIIIZ;
    public final ViewGroup LJIIJ;
    public boolean LJIIJJI;

    public final void LIZIZ() {
        Integer num;
        int i;
        ViewGroup.LayoutParams layoutParams;
        if (!this.LJIIJJI) {
            return;
        }
        ViewGroup viewGroup = this.LJIIJ;
        if (viewGroup != null && (layoutParams = viewGroup.getLayoutParams()) != null) {
            num = Integer.valueOf(layoutParams.height);
        } else {
            num = null;
        }
        int[] iArr = new int[2];
        ViewGroup viewGroup2 = this.LJIIJ;
        if (viewGroup2 != null) {
            i = viewGroup2.getHeight();
        } else {
            i = 0;
        }
        iArr[0] = i;
        iArr[1] = 0;
        ValueAnimator ofInt = ValueAnimator.ofInt(iArr);
        ofInt.addUpdateListener(new AUListenerS92S0100000_3(this, 1));
        ObjectAnimator ofFloat = ObjectAnimator.ofFloat(this.LJIIJ, (Property<ViewGroup, Float>) View.ALPHA, 1.0f, 0.0f);
        o.LJIIIIZZ(ofFloat, "ofFloat(upvoteCommentCard, View.ALPHA, 1f, 0f)");
        ObjectAnimator ofFloat2 = ObjectAnimator.ofFloat(this.LJIIIZ, (Property<SmartImageView, Float>) View.ALPHA, 1.0f, 0.0f);
        o.LJIIIIZZ(ofFloat2, "ofFloat(upvoteIcon, View.ALPHA, 1f, 0f)");
        AnimatorSet animatorSet = new AnimatorSet();
        animatorSet.playTogether(ofInt, ofFloat, ofFloat2);
        animatorSet.addListener(new ALAdapterS2S0200000_3(this, num, 2));
        animatorSet.setDuration(100L);
        animatorSet.start();
        this.LIZ.setHint(R.string.dix);
        this.LJIIJJI = false;
    }

    public C177326xc(ViewGroup inputAreaWrapper) {
        o.LJIIIZ(inputAreaWrapper, "inputAreaWrapper");
        View findViewById = inputAreaWrapper.findViewById(R.id.bk7);
        o.LJIIIIZZ(findViewById, "inputAreaWrapper.findVie…Id(R.id.comment_edit_new)");
        C224748ru c224748ru = (C224748ru) findViewById;
        this.LIZ = c224748ru;
        View findViewById2 = inputAreaWrapper.findViewById(R.id.blk);
        o.LJIIIIZZ(findViewById2, "inputAreaWrapper.findVie…id.comment_send_new_area)");
        this.LIZIZ = (TuxIconView) findViewById2;
        this.LIZJ = (ImageView) inputAreaWrapper.findViewById(R.id.iws);
        this.LIZLLL = (SmartImageView) inputAreaWrapper.findViewById(R.id.bjp);
        View findViewById3 = inputAreaWrapper.findViewById(R.id.ebo);
        o.LJIIIIZZ(findViewById3, "inputAreaWrapper.findVie…(R.id.icon_group_wrapper)");
        this.LJ = (LinearLayout) findViewById3;
        View findViewById4 = inputAreaWrapper.findViewById(R.id.fi1);
        o.LJIIIIZZ(findViewById4, "inputAreaWrapper.findVie…yout_edit_box_background)");
        this.LJFF = findViewById4;
        this.LJI = (TextView) inputAreaWrapper.findViewById(R.id.w1);
        this.LJII = inputAreaWrapper.findViewById(R.id.f20);
        this.LJIIIIZZ = inputAreaWrapper.findViewById(R.id.ezq);
        this.LJIIIZ = (SmartImageView) inputAreaWrapper.findViewById(R.id.fc7);
        this.LJIIJ = (ViewGroup) inputAreaWrapper.findViewById(R.id.w0);
        Context context = c224748ru.getContext();
        o.LJIIIIZZ(context, "editText.context");
        Integer LJI = C79045V0n.LJI(R.attr.gp, context);
        if (LJI != null) {
            c224748ru.setHintTextColor(LJI.intValue());
        }
        LJFF(C32151Nz.LJIIZILJ(22));
    }

    public final void LIZLLL(boolean z) {
        int i;
        ViewGroup.LayoutParams layoutParams = this.LJFF.getLayoutParams();
        o.LJII(layoutParams, "null cannot be cast to non-null type android.view.ViewGroup.MarginLayoutParams");
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams;
        if (z) {
            i = 14;
        } else {
            i = 12;
        }
        marginLayoutParams.setMarginEnd(O6R.LJJIIZ(C32151Nz.LJIIZILJ(Integer.valueOf(i))));
        this.LJFF.setLayoutParams(marginLayoutParams);
    }

    public final void LJFF(float f) {
        View view = this.LJFF;
        C110614Vt c110614Vt = new C110614Vt();
        c110614Vt.LIZJ = Float.valueOf(f);
        c110614Vt.LIZIZ = Integer.valueOf(R.attr.cf);
        C71313Ryn.LIZIZ(this.LJFF, "inputBackground.context", c110614Vt, view);
    }

    public static void LIZ(C224748ru c224748ru, boolean z) {
        o.LJIIIZ(c224748ru, "<this>");
        Editable text = c224748ru.getText();
        if (text == null || text.length() == 0) {
            c224748ru.setMaxLines(1);
            c224748ru.setEllipsize(TextUtils.TruncateAt.END);
            return;
        }
        c224748ru.setHint("");
        if (z) {
            if (C175276uJ.LIZ()) {
                c224748ru.setMaxHeight(c224748ru.getPaddingBottom() + c224748ru.getPaddingTop() + ((int) (c224748ru.getLineHeight() * 3.5d)));
                return;
            }
            c224748ru.setMaxLines(4);
            return;
        }
        if (C175276uJ.LIZ()) {
            c224748ru.setMaxLines(1);
        } else {
            c224748ru.setMaxLines(4);
        }
    }

    public final void LIZJ(String aid, String str) {
        o.LJIIIZ(aid, "aid");
        this.LJIIJJI = true;
        TextView textView = this.LJI;
        if (textView != null) {
            textView.setVisibility(0);
        }
        View view = this.LJII;
        if (view != null) {
            view.setVisibility(0);
        }
        View view2 = this.LJIIIIZZ;
        if (view2 != null) {
            view2.setVisibility(0);
        }
        View view3 = this.LJIIIIZZ;
        if (view3 != null) {
            C16880lQ.LJIIJ(new ACListenerS10S2100000_3(this, str, aid, 1), view3);
        }
    }

    public final void LJ(int i, boolean z) {
        ValueAnimator ofInt;
        ViewGroup.LayoutParams layoutParams = this.LJFF.getLayoutParams();
        o.LJII(layoutParams, "null cannot be cast to non-null type android.view.ViewGroup.MarginLayoutParams");
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams;
        if (i != 0) {
            if (i != 2) {
                return;
            }
            if (z) {
                ofInt = ValueAnimator.ofInt(C7MY.LIZIZ(114), C7MY.LIZIZ(52));
                o.LJIIIIZZ(ofInt, "{\n                    Va… 52.dp)\n                }");
            } else {
                ofInt = ValueAnimator.ofInt(C7MY.LIZIZ(52), C7MY.LIZIZ(114));
                o.LJIIIIZZ(ofInt, "{\n                    Va…114.dp)\n                }");
            }
            ofInt.addUpdateListener(new AUListenerS95S0200000_3(marginLayoutParams, this, 0));
            ofInt.setDuration(300L).start();
            return;
        }
        marginLayoutParams.setMarginStart(O6R.LJJIIZ(C32151Nz.LJIIZILJ(12)));
        this.LJFF.setLayoutParams(marginLayoutParams);
    }

    public final void LJI(boolean z, boolean z2, boolean z3, boolean z4) {
        if (z) {
            this.LIZIZ.setVisibility(0);
            LIZLLL(z3);
            if (z2) {
                ObjectAnimator duration = ObjectAnimator.ofFloat(this.LIZIZ, (Property<TuxIconView, Float>) View.SCALE_X, 0.0f, 1.0f).setDuration(250L);
                o.LJIIIIZZ(duration, "ofFloat(btnSendComment, …0f, 1f).setDuration(250L)");
                ObjectAnimator duration2 = ObjectAnimator.ofFloat(this.LIZIZ, (Property<TuxIconView, Float>) View.SCALE_Y, 0.0f, 1.0f).setDuration(250L);
                o.LJIIIIZZ(duration2, "ofFloat(btnSendComment, …0f, 1f).setDuration(250L)");
                AnimatorSet animatorSet = new AnimatorSet();
                animatorSet.setInterpolator(new Interpolator() { // from class: X.6xu
                    @Override // android.animation.TimeInterpolator
                    public final float getInterpolation(float f) {
                        if (f == 0.0f) {
                            return 0.0f;
                        }
                        return f <= 0.72f ? 1.14f * (f / 0.72f) : f <= 0.88f ? (((0.88f - f) / 0.16f) * 0.20999998f) + 0.93f : 1.0f - (((1.0f - f) / 0.12f) * 0.06999999f);
                    }
                });
                animatorSet.playTogether(duration, duration2);
                animatorSet.start();
            }
        } else {
            this.LIZIZ.setVisibility(8);
            LIZLLL(z3);
        }
        LIZ(this.LIZ, z4);
    }
}
