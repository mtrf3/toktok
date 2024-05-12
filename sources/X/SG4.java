package X;

import Y.ARunnableS15S0201000_12;
import android.content.Context;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.text.Html;
import android.text.SpannableStringBuilder;
import android.text.method.LinkMovementMethod;
import android.text.style.ImageSpan;
import android.util.AttributeSet;
import android.view.View;
import com.bytedance.android.livesdk.livesetting.linkmic.LivesdkLinkmicFloatWindowOptimizeSetting;
import com.zhiliaoapp.musically.R;
import java.util.Arrays;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import kotlin.jvm.internal.AqS162S0100000_12;
import kotlin.jvm.internal.o;

/* loaded from: classes13.dex */
public final class SG4 extends SG5 {
    public SpannableStringBuilder LJZ;
    public SpannableStringBuilder LJZI;
    public final String LJZL;
    public int LL;
    public int LLD;
    public boolean LLF;
    public boolean LLFF;
    public boolean LLFFF;
    public boolean LLFII;
    public final java.util.Map<Integer, View> LLFZ;

    @Override // X.SG5, com.bytedance.tux.input.TuxTextView
    public final View LJJIJIL(int i) {
        java.util.Map<Integer, View> map = this.LLFZ;
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

    public final boolean getHasCalculate() {
        return this.LLFF;
    }

    public final boolean getNeedExpandDesc() {
        return this.LLFFF;
    }

    public final boolean getShouleExpand() {
        return this.LLFII;
    }

    public final void setExpand(boolean z) {
        this.LLF = z;
    }

    public final void setHasCalculate(boolean z) {
        this.LLFF = z;
    }

    public final void setNeedExpandDesc(boolean z) {
        this.LLFFF = z;
    }

    public final void setShouleExpand(boolean z) {
        this.LLFII = z;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SG4(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, 0);
        this.LLFZ = C62850Ola.LJFF(context, "context");
        this.LJZL = " ...";
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r11v0, types: [android.widget.TextView, X.SG4, X.SG5, android.view.View, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r9v2, types: [android.text.Spanned, java.lang.CharSequence] */
    /* JADX WARN: Type inference failed for: r9v5 */
    /* JADX WARN: Type inference failed for: r9v6 */
    public static void LJJJJJ(SG4 sg4, CharSequence charSequence, List list, int i, int i2, int i3) {
        SG8 callback;
        int lineHeight;
        SpannableStringBuilder spannableStringBuilder;
        int i4 = i;
        int i5 = i2;
        if ((i3 & 4) != 0) {
            i4 = 0;
        }
        if ((i3 & 8) != 0) {
            i5 = 3;
        }
        if ((i3 & 16) != 0) {
            callback = SG8.LJLIL;
        } else {
            callback = null;
        }
        sg4.getClass();
        o.LJIIIZ(callback, "callback");
        if (list == null || list.isEmpty()) {
            sg4.setText(charSequence);
            if (!sg4.LLFFF) {
                return;
            }
            sg4.setEllipsize(null);
            sg4.setMovementMethod(LinkMovementMethod.getInstance());
            sg4.post(new ARunnableS15S0201000_12(i5, sg4, charSequence, 1));
            return;
        }
        sg4.LL = list.size();
        StringBuilder sb = new StringBuilder();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            String LLLZ = C16880lQ.LLLZ("<img src='%s'>", Arrays.copyOf(new Object[]{it.next()}, 1));
            o.LJIIIIZZ(LLLZ, "format(format, *args)");
            sb.append(LLLZ);
            sb.append(" ");
        }
        sb.append(charSequence);
        String sb2 = sb.toString();
        o.LJIIIIZZ(sb2, "imageBuilder.toString()");
        if (sg4.getLogoMaxHeight() > LivesdkLinkmicFloatWindowOptimizeSetting.CORNER_RADIUS_PX) {
            lineHeight = O6R.LJJIIJZLJL(sg4.getLogoMaxHeight());
        } else {
            lineHeight = sg4.getLineHeight();
        }
        if (Build.VERSION.SDK_INT >= 24) {
            Context context = sg4.getContext();
            o.LJIIIIZZ(context, "context");
            spannableStringBuilder = Html.fromHtml(sb2, 0, new SGA(sg4, context, sg4, lineHeight, i4, i5), null);
        } else {
            Context context2 = sg4.getContext();
            o.LJIIIIZZ(context2, "context");
            spannableStringBuilder = Html.fromHtml(sb2, new SGA(sg4, context2, sg4, lineHeight, i4, i5), null);
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
        sg4.setText(spannableStringBuilder);
    }

    public final void LJJJJ(SpannableStringBuilder spannableStringBuilder, int i, int i2, int i3, int i4, int i5, int i6, boolean z, AqS162S0100000_12 aqS162S0100000_12) {
        if (spannableStringBuilder == null) {
            return;
        }
        spannableStringBuilder.insert(spannableStringBuilder.length(), " ");
        Context context = getContext();
        o.LJIIIIZZ(context, "context");
        SY9 sy9 = new SY9(context, i);
        Context context2 = getContext();
        o.LJIIIIZZ(context2, "context");
        sy9.LJFF(R.attr.gv, context2);
        sy9.setBounds(i2, i3, i4, i5);
        C8FR c8fr = new C8FR(sy9, 2);
        c8fr.LIZIZ(i6, 0, z);
        spannableStringBuilder.setSpan(c8fr, spannableStringBuilder.length() - 1, spannableStringBuilder.length(), 33);
        spannableStringBuilder.setSpan(new SG6(aqS162S0100000_12), spannableStringBuilder.length() - 1, spannableStringBuilder.length(), 33);
    }
}
