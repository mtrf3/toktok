package X;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.text.Html;
import android.text.SpannableStringBuilder;
import android.text.style.ImageSpan;
import android.util.AttributeSet;
import android.view.View;
import com.bytedance.android.livesdk.livesetting.linkmic.LivesdkLinkmicFloatWindowOptimizeSetting;
import com.bytedance.tux.input.TuxTextView;
import com.zhiliaoapp.musically.R;
import java.util.Arrays;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import kotlin.jvm.internal.o;

/* loaded from: classes13.dex */
public class SG5 extends TuxTextView {
    public static final /* synthetic */ int LJLZ = 0;
    public double LJLLLL;
    public final java.util.Map<Integer, View> LJLLLLLL;

    @Override // com.bytedance.tux.input.TuxTextView
    public View LJJIJIL(int i) {
        java.util.Map<Integer, View> map = this.LJLLLLLL;
        Integer valueOf = Integer.valueOf(R.id.title);
        LinkedHashMap linkedHashMap = (LinkedHashMap) map;
        View view = (View) linkedHashMap.get(valueOf);
        if (view != null) {
            return view;
        }
        View findViewById = findViewById(R.id.title);
        if (findViewById == null) {
            return null;
        }
        linkedHashMap.put(valueOf, findViewById);
        return findViewById;
    }

    public final double getLogoMaxHeight() {
        return this.LJLLLL;
    }

    public final void setLogoMaxHeight(double d) {
        this.LJLLLL = d;
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public SG5(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
        o.LJIIIZ(context, "context");
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SG5(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.LJLLLLLL = C62850Ola.LJFF(context, "context");
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, new int[]{R.attr.ay5});
        o.LJIIIIZZ(obtainStyledAttributes, "context.obtainStyledAttr…tyleable.LogoTuxTextView)");
        this.LJLLLL = obtainStyledAttributes.getDimensionPixelSize(0, C17N.LJIILL(-1.0d));
        obtainStyledAttributes.recycle();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r15v0, types: [android.widget.TextView, X.SG5, android.view.View] */
    /* JADX WARN: Type inference failed for: r9v2, types: [android.text.Spanned, java.lang.CharSequence] */
    /* JADX WARN: Type inference failed for: r9v5 */
    /* JADX WARN: Type inference failed for: r9v6 */
    public final void LJJJIL(CharSequence charSequence, List<String> list, Float f) {
        int lineHeight;
        SpannableStringBuilder spannableStringBuilder;
        if (list == null || list.isEmpty()) {
            setText(charSequence);
            return;
        }
        StringBuilder sb = new StringBuilder();
        Iterator<String> it = list.iterator();
        while (it.hasNext()) {
            String LLLZ = C16880lQ.LLLZ("<img src='%s'>", Arrays.copyOf(new Object[]{it.next()}, 1));
            o.LJIIIIZZ(LLLZ, "format(format, *args)");
            sb.append(LLLZ);
        }
        sb.append(" ");
        sb.append(charSequence);
        String sb2 = sb.toString();
        o.LJIIIIZZ(sb2, "imageBuilder.toString()");
        double d = this.LJLLLL;
        if (d > LivesdkLinkmicFloatWindowOptimizeSetting.CORNER_RADIUS_PX) {
            lineHeight = O6R.LJJIIJZLJL(d);
        } else {
            lineHeight = getLineHeight();
        }
        if (Build.VERSION.SDK_INT >= 24) {
            Context context = getContext();
            o.LJIIIIZZ(context, "context");
            spannableStringBuilder = Html.fromHtml(sb2, 0, new SGD(this, context, this, lineHeight, f), null);
        } else {
            Context context2 = getContext();
            o.LJIIIIZZ(context2, "context");
            spannableStringBuilder = Html.fromHtml(sb2, new SGD(this, context2, this, lineHeight, f), null);
        }
        if (spannableStringBuilder instanceof SpannableStringBuilder) {
            ImageSpan[] imgSpans = (ImageSpan[]) spannableStringBuilder.getSpans(0, spannableStringBuilder.length(), ImageSpan.class);
            o.LJIIIIZZ(imgSpans, "imgSpans");
            for (ImageSpan imageSpan : imgSpans) {
                int spanStart = spannableStringBuilder.getSpanStart(imageSpan);
                int spanEnd = spannableStringBuilder.getSpanEnd(imageSpan);
                Drawable drawable = imageSpan.getDrawable();
                o.LJIIIIZZ(drawable, "iSpan.drawable");
                SJT sjt = new SJT(drawable);
                SpannableStringBuilder spannableStringBuilder2 = spannableStringBuilder;
                spannableStringBuilder2.setSpan(sjt, spanStart, spanEnd, 34);
                spannableStringBuilder2.removeSpan(imageSpan);
            }
        }
        setText(spannableStringBuilder);
    }
}
