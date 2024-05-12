package X;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.text.Html;
import android.text.SpannableStringBuilder;
import android.text.style.ImageSpan;
import android.util.AttributeSet;
import android.view.View;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.bytedance.tux.input.TuxTextView;
import com.ss.android.ugc.aweme.ecommerce.base.pdp.repository.dto.PromotionLogo;
import com.ss.android.ugc.aweme.ecommerce.service.vo.Image;
import com.zhiliaoapp.musically.R;
import java.util.Arrays;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import kotlin.jvm.internal.o;

/* loaded from: classes13.dex */
public final class SG3 extends TuxTextView {
    public List<PromotionLogo> LJLLLL;
    public final java.util.Map<Integer, View> LJLLLLLL;

    @Override // com.bytedance.tux.input.TuxTextView
    public final View LJJIJIL(int i) {
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

    public final List<PromotionLogo> getLogoList() {
        return this.LJLLLL;
    }

    public final void setLogoList(List<PromotionLogo> list) {
        this.LJLLLL = list;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SG3(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, 0);
        this.LJLLLLLL = C62850Ola.LJFF(context, "context");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r10v0, types: [android.widget.TextView, X.SG3, android.view.View] */
    /* JADX WARN: Type inference failed for: r9v1, types: [android.text.Spanned, java.lang.CharSequence] */
    /* JADX WARN: Type inference failed for: r9v3 */
    /* JADX WARN: Type inference failed for: r9v4 */
    public final void LJJJIL(CharSequence charSequence, List<PromotionLogo> list) {
        SpannableStringBuilder spannableStringBuilder;
        List<String> urls;
        Object obj;
        if (list == null || list.isEmpty()) {
            setText(charSequence);
            return;
        }
        StringBuilder sb = new StringBuilder();
        Iterator<PromotionLogo> it = list.iterator();
        while (it.hasNext()) {
            Image image = it.next().image;
            if (image != null && (urls = image.getUrls()) != null && (obj = ListProtector.get(urls, 0)) != null) {
                String LLLZ = C16880lQ.LLLZ("<img src='%s'>", Arrays.copyOf(new Object[]{obj}, 1));
                o.LJIIIIZZ(LLLZ, "format(format, *args)");
                sb.append(LLLZ);
            }
        }
        sb.append(" ");
        sb.append(charSequence);
        String sb2 = sb.toString();
        o.LJIIIIZZ(sb2, "imageBuilder.toString()");
        if (Build.VERSION.SDK_INT >= 24) {
            Context context = getContext();
            o.LJIIIIZZ(context, "context");
            spannableStringBuilder = Html.fromHtml(sb2, 0, new SGB(context, this), null);
        } else {
            Context context2 = getContext();
            o.LJIIIIZZ(context2, "context");
            spannableStringBuilder = Html.fromHtml(sb2, new SGB(context2, this), null);
        }
        if (spannableStringBuilder instanceof SpannableStringBuilder) {
            ImageSpan[] imgSpans = (ImageSpan[]) spannableStringBuilder.getSpans(0, spannableStringBuilder.length(), ImageSpan.class);
            o.LJIIIIZZ(imgSpans, "imgSpans");
            for (ImageSpan imageSpan : imgSpans) {
                int spanStart = spannableStringBuilder.getSpanStart(imageSpan);
                int spanEnd = spannableStringBuilder.getSpanEnd(imageSpan);
                Drawable drawable = imageSpan.getDrawable();
                o.LJIIIIZZ(drawable, "iSpan.drawable");
                SJS sjs = new SJS(drawable);
                SpannableStringBuilder spannableStringBuilder2 = spannableStringBuilder;
                spannableStringBuilder2.setSpan(sjs, spanStart, spanEnd, 34);
                spannableStringBuilder2.removeSpan(imageSpan);
            }
        }
        setText(spannableStringBuilder);
    }
}
