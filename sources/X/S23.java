package X;

import android.content.Context;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import com.bytedance.android.livesdk.model.message.ext.PromotionItem;
import com.bytedance.tux.input.TuxTextView;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.internal.o;

/* loaded from: classes13.dex */
public final class S23 implements S27<ViewGroup> {
    public final int LIZ;

    public S23(int i) {
        this.LIZ = i;
    }

    @Override // X.S27
    public final View LIZ(ViewGroup viewGroup, PromotionItem promotionItem) {
        ViewGroup containerView = viewGroup;
        o.LJIIIZ(containerView, "containerView");
        o.LJIIIZ(promotionItem, "promotionItem");
        Integer type = promotionItem.getType();
        if (type == null || 4 != type.intValue()) {
            Context context = containerView.getContext();
            o.LJIIIIZZ(context, "containerView.context");
            TuxTextView tuxTextView = new TuxTextView(context, null, 6, 0);
            tuxTextView.setTextAlignment(5);
            tuxTextView.setTuxFont(this.LIZ);
            tuxTextView.setTextColorRes(R.attr.dm);
            tuxTextView.setMaxLines(1);
            tuxTextView.setEllipsize(TextUtils.TruncateAt.END);
            tuxTextView.setText(promotionItem.getPreviewShowText());
            return tuxTextView;
        }
        Context context2 = containerView.getContext();
        o.LJIIIIZZ(context2, "containerView.context");
        return new C4MG(context2, this.LIZ);
    }
}
