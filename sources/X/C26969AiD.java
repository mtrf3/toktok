package X;

import android.content.Context;
import android.text.SpannableStringBuilder;
import android.util.AttributeSet;
import android.view.View;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.bytedance.tux.input.TuxTextView;
import com.ss.android.ugc.aweme.ecommerce.base.common.model.Price;
import com.ss.android.ugc.aweme.ecommerce.base.delivery.repo.dto.LogisticDTO;
import com.ss.android.ugc.aweme.ecommerce.base.pdp.repository.dto.LogisticLinkRichText;
import com.ss.android.ugc.aweme.ecommerce.base.pdp.repository.dto.LogisticsDescription;
import com.ss.android.ugc.aweme.ecommerce.core.utils.RichTextUtil;
import com.zhiliaoapp.musically.R;
import java.util.LinkedHashMap;
import java.util.List;
import kotlin.jvm.internal.o;

/* renamed from: X.AiD, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C26969AiD extends ConstraintLayout {
    public final java.util.Map<Integer, View> LJLIL = new LinkedHashMap();

    public final View _$_findCachedViewById(int i) {
        LinkedHashMap linkedHashMap = (LinkedHashMap) this.LJLIL;
        View view = (View) linkedHashMap.get(Integer.valueOf(i));
        if (view != null) {
            return view;
        }
        View findViewById = findViewById(i);
        if (findViewById == null) {
            return null;
        }
        linkedHashMap.put(Integer.valueOf(i), findViewById);
        return findViewById;
    }

    public final void LJJLJLI(LogisticDTO item, boolean z) {
        String str;
        String str2;
        Integer num;
        SpannableStringBuilder spannableStringBuilder;
        List<LogisticLinkRichText> list;
        LogisticLinkRichText logisticLinkRichText;
        SpannableStringBuilder spannableStringBuilder2;
        LogisticLinkRichText logisticLinkRichText2;
        o.LJIIIZ(item, "item");
        ((TextView) _$_findCachedViewById(R.id.bnv)).setText(item.deliveryName);
        TextView textView = (TextView) _$_findCachedViewById(R.id.bnq);
        LogisticsDescription logisticsDescription = item.logisticsDescription;
        if (logisticsDescription != null) {
            str = logisticsDescription.descriptionTitle;
        } else {
            str = null;
        }
        textView.setText(str);
        TuxTextView tuxTextView = (TuxTextView) _$_findCachedViewById(R.id.bnt);
        Price price = item.shippingFee;
        if (price != null) {
            str2 = price.getPriceStr();
        } else {
            str2 = null;
        }
        tuxTextView.setText(String.valueOf(str2));
        Price price2 = item.shippingFee;
        if (price2 != null) {
            num = price2.getPriceTextColor();
        } else {
            num = null;
        }
        tuxTextView.setTextColorRes(C78685UuP.LJLI(num, null));
        if (z) {
            LogisticsDescription logisticsDescription2 = item.logisticsDescription;
            if (logisticsDescription2 != null && (logisticLinkRichText2 = logisticsDescription2.appendixTemplate) != null) {
                RichTextUtil richTextUtil = RichTextUtil.LIZ;
                C26974AiI c26974AiI = C26974AiI.LJLIL;
                richTextUtil.getClass();
                spannableStringBuilder2 = RichTextUtil.LIZ(logisticLinkRichText2, this, c26974AiI);
            } else {
                spannableStringBuilder2 = null;
            }
            ((TextView) _$_findCachedViewById(R.id.bnr)).setText(spannableStringBuilder2);
            _$_findCachedViewById(R.id.bnr).setVisibility(0);
            _$_findCachedViewById(R.id.bns).setVisibility(0);
        } else {
            _$_findCachedViewById(R.id.bnr).setVisibility(8);
            _$_findCachedViewById(R.id.bns).setVisibility(8);
        }
        LogisticsDescription logisticsDescription3 = item.logisticsDescription;
        if (logisticsDescription3 != null && (logisticLinkRichText = logisticsDescription3.logisticsRichText) != null) {
            RichTextUtil richTextUtil2 = RichTextUtil.LIZ;
            C26975AiJ c26975AiJ = C26975AiJ.LJLIL;
            richTextUtil2.getClass();
            spannableStringBuilder = RichTextUtil.LIZ(logisticLinkRichText, this, c26975AiJ);
        } else {
            spannableStringBuilder = null;
        }
        ((TextView) _$_findCachedViewById(R.id.bnw)).setText(spannableStringBuilder);
        SpannableStringBuilder spannableStringBuilder3 = new SpannableStringBuilder("");
        LogisticsDescription logisticsDescription4 = item.logisticsDescription;
        if (logisticsDescription4 != null && (list = logisticsDescription4.descriptions) != null) {
            for (LogisticLinkRichText logisticLinkRichText3 : list) {
                RichTextUtil richTextUtil3 = RichTextUtil.LIZ;
                C26973AiH c26973AiH = C26973AiH.LJLIL;
                richTextUtil3.getClass();
                spannableStringBuilder3.append((CharSequence) RichTextUtil.LIZ(logisticLinkRichText3, null, c26973AiH));
                spannableStringBuilder3.append((CharSequence) "\n\n");
            }
        }
        ((TextView) _$_findCachedViewById(R.id.bnp)).setText(spannableStringBuilder3);
    }

    public C26969AiD(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        C16880lQ.LLLLIILL(C16880lQ.LLZIL(context), R.layout.a0n, this, true);
    }
}
