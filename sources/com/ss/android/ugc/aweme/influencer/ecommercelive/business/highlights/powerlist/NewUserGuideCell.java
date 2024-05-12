package com.ss.android.ugc.aweme.influencer.ecommercelive.business.highlights.powerlist;

import X.AnonymousClass636;
import X.C16880lQ;
import X.C19N;
import X.W5F;
import X.W5U;
import android.content.Context;
import android.text.SpannableString;
import android.text.style.ForegroundColorSpan;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import com.bytedance.ies.powerlist.PowerCell;
import com.bytedance.lighten.loader.SmartImageView;
import com.ss.android.ugc.aweme.influencer.ecommercelive.business.highlights.model.HighlightNewUserGuide;
import com.ss.android.ugc.aweme.influencer.ecommercelive.business.highlights.model.HighlightNewUserGuideText;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.internal.o;
import ujb.s;

/* loaded from: classes5.dex */
public final class NewUserGuideCell extends PowerCell<HighlightNewUserGuide> {
    @Override // com.bytedance.ies.powerlist.PowerCell
    public final void onBindItemView(HighlightNewUserGuide highlightNewUserGuide) {
        String imageUrl;
        HighlightNewUserGuide t = highlightNewUserGuide;
        o.LJIIIZ(t, "t");
        HighlightNewUserGuideText guideText = t.getGuideText();
        if (guideText == null || guideText.getCommonText() == null || t.getGuideText().getMarkText() == null) {
            return;
        }
        SpannableString spannableString = new SpannableString(ujb.o.LJJJJZ(t.getGuideText().getCommonText(), "{%s}", t.getGuideText().getMarkText(), false));
        Integer LIZIZ = C19N.LIZIZ(this.itemView, "itemView.context", R.attr.e2);
        if (LIZIZ != null) {
            int intValue = LIZIZ.intValue();
            spannableString.setSpan(new ForegroundColorSpan(intValue), s.LJJLIIIJL(t.getGuideText().getCommonText(), "{%s}", 0, false, 6), t.getGuideText().getMarkText().length(), 17);
        }
        ((TextView) this.itemView.findViewById(R.id.lwj)).setText(spannableString);
        Context context = this.itemView.getContext();
        if (context != null && AnonymousClass636.LJIILJJIL(context)) {
            imageUrl = t.getImageDarkUrl();
        } else {
            imageUrl = t.getImageUrl();
        }
        if (imageUrl == null) {
            return;
        }
        W5F LJIIIIZZ = W5U.LJIIIIZZ(imageUrl);
        LJIIIIZZ.LJJIIJ = (SmartImageView) this.itemView.findViewById(R.id.ewc);
        C16880lQ.LLJJJ(LJIIIIZZ);
    }

    @Override // com.bytedance.ies.powerlist.PowerCell
    public final View onCreateItemView(ViewGroup parent) {
        o.LJIIIZ(parent, "parent");
        return inflateItemView(parent, R.layout.apo);
    }
}
