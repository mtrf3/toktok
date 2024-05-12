package X;

import Y.ACListenerS32S0100000_12;
import Y.ARunnableS12S0301000_12;
import android.content.Context;
import android.text.SpannableStringBuilder;
import android.text.style.ForegroundColorSpan;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.bytedance.tux.input.TuxTextView;
import com.ss.android.ugc.aweme.ecommerce.base.review.repo.dto.ReviewItemStruct;
import com.zhiliaoapp.musically.R;
import java.util.List;
import kotlin.jvm.internal.o;

/* renamed from: X.Roc */
/* loaded from: classes13.dex */
public final class C70682Roc extends FrameLayout {
    public InterfaceC88472Yns<? super Boolean, C76800UCe> LJLIL;
    public final java.util.Map<Integer, View> LJLILLLLZI;

    public final View LIZ(int i) {
        java.util.Map<Integer, View> map = this.LJLILLLLZI;
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

    public final void setContentColor(int i) {
        ((TuxTextView) LIZ(R.id.bst)).setTextColorRes(i);
        ((TuxTextView) LIZ(R.id.gmd)).setTextColorRes(i);
        ((TuxTextView) LIZ(R.id.gma)).setTextColorRes(i);
    }

    public final void setContentFont(int i) {
        ((TuxTextView) LIZ(R.id.bst)).setTuxFont(i);
    }

    public final void setContentTextColor(int i) {
        ((TextView) LIZ(R.id.bst)).setTextColor(i);
        ((TextView) LIZ(R.id.gmd)).setTextColor(i);
    }

    public final void setExpandListener(InterfaceC88472Yns<? super Boolean, C76800UCe> interfaceC88472Yns) {
        this.LJLIL = interfaceC88472Yns;
    }

    public final void setMoreDotText(String text) {
        o.LJIIIZ(text, "text");
        ((TextView) LIZ(R.id.gmd)).setText(text);
    }

    public final void setMoreFont(int i) {
        ((TuxTextView) LIZ(R.id.gmd)).setTuxFont(i);
        ((TuxTextView) LIZ(R.id.gma)).setTuxFont(i);
    }

    public final void setTagText(List<ReviewItemStruct.DisplayReviewText> list) {
        int i;
        ((ViewGroup) LIZ(R.id.l0g)).removeAllViews();
        if (list != null) {
            for (ReviewItemStruct.DisplayReviewText displayReviewText : list) {
                Context context = getContext();
                o.LJIIIIZZ(context, "this.context");
                TuxTextView tuxTextView = new TuxTextView(context, null, 6, 0);
                SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
                Integer num = displayReviewText.textType;
                if (num == null || num.intValue() != 2) {
                    Integer num2 = displayReviewText.textType;
                    if (num2 != null && num2.intValue() == 1) {
                        String str = displayReviewText.plainText;
                        if (str != null && !ujb.o.LJJJJJL(str)) {
                            spannableStringBuilder.append((CharSequence) displayReviewText.plainText);
                            tuxTextView.setText(spannableStringBuilder);
                        }
                    }
                } else {
                    String str2 = displayReviewText.tagKey;
                    if (str2 != null) {
                        spannableStringBuilder.append((CharSequence) str2);
                        spannableStringBuilder.append((CharSequence) ":");
                    }
                    String str3 = displayReviewText.tagText;
                    if (str3 != null) {
                        spannableStringBuilder.append((CharSequence) str3);
                    }
                    int length = spannableStringBuilder.length();
                    String str4 = displayReviewText.tagText;
                    if (str4 != null) {
                        i = str4.length();
                    } else {
                        i = 0;
                    }
                    Context context2 = getContext();
                    o.LJIIIIZZ(context2, "this.context");
                    spannableStringBuilder.setSpan(new ForegroundColorSpan(AnonymousClass636.LJIIIIZZ(R.attr.gv, context2)), 0, length - i, 33);
                    tuxTextView.setText(spannableStringBuilder);
                }
                tuxTextView.setLayoutParams(new LinearLayout.LayoutParams(-1, -2));
                ((ViewGroup) LIZ(R.id.l0g)).addView(tuxTextView);
            }
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C70682Roc(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, 0);
        this.LJLILLLLZI = C62850Ola.LJFF(context, "context");
        C16880lQ.LLLLIILL(C16880lQ.LLZIL(context), R.layout.a61, this, true);
        C16880lQ.LJIIZILJ((LinearLayout) LIZ(R.id.gm2), new ACListenerS32S0100000_12(this, 193));
        ((TextView) LIZ(R.id.gmd)).setText("... ");
    }

    public final void LIZIZ(CharSequence charSequence, int i, boolean z, InterfaceC88472Yns<? super CharSequence, ? extends CharSequence> textConfigurator) {
        o.LJIIIZ(textConfigurator, "textConfigurator");
        if (!z) {
            ((TextView) LIZ(R.id.bst)).setEllipsize(null);
            ((TextView) LIZ(R.id.bst)).setMaxLines(i);
            LIZ(R.id.gm2).setVisibility(8);
            post(new ARunnableS12S0301000_12(i, this, textConfigurator, charSequence, 0));
            return;
        }
        ((TextView) LIZ(R.id.bst)).setEllipsize(null);
        ((TextView) LIZ(R.id.bst)).setMaxLines(Integer.MAX_VALUE);
        post(new ARunnableS12S0301000_12(i, this, textConfigurator, charSequence, 1));
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ void LIZJ(C70682Roc c70682Roc, CharSequence charSequence, int i, boolean z, InterfaceC88472Yns interfaceC88472Yns, int i2) {
        if ((i2 & 2) != 0) {
            i = Integer.MAX_VALUE;
        }
        if ((i2 & 4) != 0) {
            z = false;
        }
        if ((i2 & 8) != 0) {
            interfaceC88472Yns = C70685Rof.LJLIL;
        }
        c70682Roc.LIZIZ(charSequence, i, z, interfaceC88472Yns);
    }
}
