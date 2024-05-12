package Y;

import X.AnonymousClass064;
import X.C16880lQ;
import X.C17N;
import X.C60939Nvr;
import X.C61779OMl;
import X.C61800ONg;
import X.C76732zl;
import X.OO3;
import android.text.TextPaint;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import android.view.Window;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.bytedance.hybrid.spark.page.SparkPopup;
import com.bytedance.tux.input.TuxTextView;
import com.ss.android.ugc.aweme.commercialize.profile.AdNewFakeUserProfileHeaderWidget;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.survey.Option;
import com.ss.android.ugc.aweme.profile.aigc.ProfileAigcIntroFragmentV2;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.internal.o;

/* loaded from: classes11.dex */
public class IDLListenerS61S0200000_10 implements ViewTreeObserver.OnGlobalLayoutListener {
    public final int $t;
    public Object l0;
    public Object l1;

    @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
    public final void onGlobalLayout() {
        switch (this.$t) {
            case 0:
                onGlobalLayout$0(this);
                return;
            case 1:
                onGlobalLayout$1(this);
                return;
            case 2:
                onGlobalLayout$2(this);
                return;
            case 3:
                onGlobalLayout$3(this);
                return;
            case 4:
                onGlobalLayout$4(this);
                return;
            default:
                return;
        }
    }

    public static final void onGlobalLayout$0(IDLListenerS61S0200000_10 iDLListenerS61S0200000_10) {
        String desc;
        ((LinearLayout) iDLListenerS61S0200000_10.l0).getViewTreeObserver().removeOnGlobalLayoutListener(iDLListenerS61S0200000_10);
        TextView LJIJ = ((AdNewFakeUserProfileHeaderWidget) iDLListenerS61S0200000_10.l1).LJIJ();
        if (LJIJ != null) {
            LinearLayout linearLayout = (LinearLayout) iDLListenerS61S0200000_10.l0;
            AdNewFakeUserProfileHeaderWidget adNewFakeUserProfileHeaderWidget = (AdNewFakeUserProfileHeaderWidget) iDLListenerS61S0200000_10.l1;
            String str = null;
            if (linearLayout.getVisibility() == 0) {
                int width = LJIJ.getWidth();
                int width2 = linearLayout.getWidth();
                C16880lQ.LJIIZILJ(linearLayout, new ACListenerS45S0200000_10(LJIJ, adNewFakeUserProfileHeaderWidget, 3));
                TextPaint paint = LJIJ.getPaint();
                if (LJIJ.getLayout() == null) {
                    Aweme aweme = adNewFakeUserProfileHeaderWidget.LJLJLJ;
                    if (aweme != null) {
                        str = aweme.getDesc();
                    }
                    LJIJ.setText(str);
                    return;
                }
                int lineStart = LJIJ.getLayout().getLineStart(2);
                int lineEnd = LJIJ.getLayout().getLineEnd(2);
                float f = width;
                float f2 = width2;
                if (f > paint.measureText("...") + f2) {
                    while (f - paint.measureText(LJIJ.getText().subSequence(lineStart, lineEnd).toString()) < paint.measureText("...") + f2) {
                        lineEnd--;
                    }
                } else {
                    AnonymousClass064 anonymousClass064 = new AnonymousClass064();
                    View view = adNewFakeUserProfileHeaderWidget.LJLJI;
                    o.LJII(view, "null cannot be cast to non-null type androidx.constraintlayout.widget.ConstraintLayout");
                    anonymousClass064.LJII((ConstraintLayout) view);
                    anonymousClass064.LJFF(R.id.g5y);
                    anonymousClass064.LJIIIIZZ(R.id.g5y, 4, R.id.i74, 4);
                    anonymousClass064.LJIIIIZZ(R.id.g5y, 6, R.id.i74, 7);
                    anonymousClass064.LJIIL(R.id.g5y, -2);
                    anonymousClass064.LJIIJ(R.id.g5y, -2);
                    View view2 = adNewFakeUserProfileHeaderWidget.LJLJI;
                    o.LJII(view2, "null cannot be cast to non-null type androidx.constraintlayout.widget.ConstraintLayout");
                    anonymousClass064.LIZIZ((ConstraintLayout) view2);
                }
                StringBuilder sb = new StringBuilder();
                Aweme aweme2 = adNewFakeUserProfileHeaderWidget.LJLJLJ;
                if (aweme2 != null && (desc = aweme2.getDesc()) != null) {
                    str = desc.substring(0, lineEnd);
                    o.LJIIIIZZ(str, "this as java.lang.String…ing(startIndex, endIndex)");
                }
                sb.append(str);
                sb.append("...");
                LJIJ.setText(sb.toString());
                return;
            }
            C16880lQ.LJIIZILJ(linearLayout, null);
        }
    }

    public static final void onGlobalLayout$1(IDLListenerS61S0200000_10 iDLListenerS61S0200000_10) {
        C76732zl c76732zl = (C76732zl) iDLListenerS61S0200000_10.l0;
        int height = ((ProfileAigcIntroFragmentV2) iDLListenerS61S0200000_10.l1)._$_findCachedViewById(R.id.ht8).getHeight();
        int height2 = ((ProfileAigcIntroFragmentV2) iDLListenerS61S0200000_10.l1)._$_findCachedViewById(R.id.fuj).getHeight();
        if (height < height2) {
            height = height2;
        }
        c76732zl.element = height;
        if (((ProfileAigcIntroFragmentV2) iDLListenerS61S0200000_10.l1)._$_findCachedViewById(R.id.fuj).getHeight() < ((C76732zl) iDLListenerS61S0200000_10.l0).element) {
            ((TextView) ((ProfileAigcIntroFragmentV2) iDLListenerS61S0200000_10.l1)._$_findCachedViewById(R.id.fuj)).setHeight(((C76732zl) iDLListenerS61S0200000_10.l0).element);
        }
        ((ProfileAigcIntroFragmentV2) iDLListenerS61S0200000_10.l1)._$_findCachedViewById(R.id.ht8).getViewTreeObserver().removeOnGlobalLayoutListener(iDLListenerS61S0200000_10);
    }

    public static final void onGlobalLayout$2(IDLListenerS61S0200000_10 iDLListenerS61S0200000_10) {
        C76732zl c76732zl = (C76732zl) iDLListenerS61S0200000_10.l0;
        int height = ((ProfileAigcIntroFragmentV2) iDLListenerS61S0200000_10.l1)._$_findCachedViewById(R.id.fuj).getHeight();
        int height2 = ((ProfileAigcIntroFragmentV2) iDLListenerS61S0200000_10.l1)._$_findCachedViewById(R.id.ht8).getHeight();
        if (height < height2) {
            height = height2;
        }
        c76732zl.element = height;
        if (((ProfileAigcIntroFragmentV2) iDLListenerS61S0200000_10.l1)._$_findCachedViewById(R.id.ht8).getHeight() < ((C76732zl) iDLListenerS61S0200000_10.l0).element) {
            ((TextView) ((ProfileAigcIntroFragmentV2) iDLListenerS61S0200000_10.l1)._$_findCachedViewById(R.id.ht8)).setHeight(((C76732zl) iDLListenerS61S0200000_10.l0).element);
        }
        ((ProfileAigcIntroFragmentV2) iDLListenerS61S0200000_10.l1)._$_findCachedViewById(R.id.fuj).getViewTreeObserver().removeOnGlobalLayoutListener(iDLListenerS61S0200000_10);
    }

    public static final void onGlobalLayout$3(IDLListenerS61S0200000_10 iDLListenerS61S0200000_10) {
        SparkPopup sparkPopup = (SparkPopup) iDLListenerS61S0200000_10.l0;
        C60939Nvr c60939Nvr = SparkPopup.LLIIZ;
        Window Jl = sparkPopup.Jl();
        View view = sparkPopup.getView();
        c60939Nvr.getClass();
        int LIZ = C60939Nvr.LIZ(Jl, view, sparkPopup);
        SparkPopup sparkPopup2 = (SparkPopup) iDLListenerS61S0200000_10.l0;
        if (LIZ == sparkPopup2.LLF || sparkPopup2.LLD) {
            return;
        }
        sparkPopup2.LLF = LIZ;
        ViewTreeObserver.OnGlobalLayoutListener onGlobalLayoutListener = sparkPopup2.LLFF;
        if (onGlobalLayoutListener != null) {
            onGlobalLayoutListener.onGlobalLayout();
        }
        ((SparkPopup) iDLListenerS61S0200000_10.l0).LLD = true;
        ViewTreeObserver viewTreeObserver = ((View) iDLListenerS61S0200000_10.l1).getViewTreeObserver();
        if (viewTreeObserver == null) {
            return;
        }
        viewTreeObserver.removeOnGlobalLayoutListener(((SparkPopup) iDLListenerS61S0200000_10.l0).LLFF);
    }

    public static final void onGlobalLayout$4(IDLListenerS61S0200000_10 iDLListenerS61S0200000_10) {
        ViewTreeObserver viewTreeObserver;
        View view = ((C61800ONg) iDLListenerS61S0200000_10.l0).LJIL;
        if (view != null && (viewTreeObserver = view.getViewTreeObserver()) != null) {
            viewTreeObserver.removeOnGlobalLayoutListener(iDLListenerS61S0200000_10);
        }
        C61800ONg c61800ONg = (C61800ONg) iDLListenerS61S0200000_10.l0;
        View view2 = c61800ONg.LJIL;
        if (view2 != null) {
            Option option = (Option) iDLListenerS61S0200000_10.l1;
            view2.getLayoutParams().height = C17N.LJIILL(60.0d) + view2.getHeight();
            if (C61779OMl.LJ(c61800ONg.LIZLLL)) {
                View view3 = c61800ONg.LJIIL;
                if (view3 != null) {
                    ViewGroup.LayoutParams layoutParams = view3.getLayoutParams();
                    o.LJII(layoutParams, "null cannot be cast to non-null type android.view.ViewGroup.MarginLayoutParams");
                    ((ViewGroup.MarginLayoutParams) layoutParams).topMargin = -C17N.LJIILL(60.0d);
                    view3.setLayoutParams(layoutParams);
                }
                OO3 oo3 = c61800ONg.LJJI;
                if (oo3 != null) {
                    oo3.LJJJJ = true;
                }
            }
            view2.requestLayout();
            View view4 = c61800ONg.LJIIZILJ;
            if (view4 != null) {
                view4.setVisibility(0);
            }
            View view5 = c61800ONg.LJIIZILJ;
            if (view5 != null) {
                view5.setAlpha(1.0f);
            }
            TuxTextView tuxTextView = c61800ONg.LJIJ;
            if (tuxTextView == null) {
                return;
            }
            tuxTextView.setText(option.getAdditional_content());
        }
    }

    public IDLListenerS61S0200000_10(Object obj, Object obj2, int i) {
        this.$t = i;
        this.l0 = obj;
        this.l1 = obj2;
    }
}
