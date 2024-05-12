package X;

import android.view.View;
import android.widget.TextView;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.ss.android.ugc.aweme.ecommerce.base.address.dto.CandInputData;
import com.ss.android.ugc.aweme.ecommerce.base.address.dto.ViewItem;
import com.ss.android.ugc.aweme.ecommerce.base.address.dto.ViewStyle;
import com.zhiliaoapp.musically.R;
import java.util.List;
import kotlin.jvm.internal.o;

/* renamed from: X.Aj8, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C27026Aj8 extends AbstractViewOnClickListenerC27027Aj9 {
    public final TextView LJLILLLLZI;

    public C27026Aj8(View view) {
        super(view);
        View findViewById = this.itemView.findViewById(R.id.m1i);
        o.LJIIIIZZ(findViewById, "itemView.findViewById(R.id.tv_cand_header)");
        this.LJLILLLLZI = (TextView) findViewById;
    }

    @Override // X.AbstractViewOnClickListenerC27027Aj9
    public final void L(CandInputData candInputData, int i, ViewStyle viewStyle, String str) {
        List<ViewItem> list;
        List<ViewItem> list2;
        ViewItem viewItem;
        String str2 = null;
        if (this.LJLIL != null) {
            this.LJLIL = null;
        }
        if (candInputData == null || (list = candInputData.viewItems) == null || list.isEmpty()) {
            return;
        }
        TextView textView = this.LJLILLLLZI;
        if (candInputData != null && (list2 = candInputData.viewItems) != null && (viewItem = (ViewItem) ListProtector.get(list2, 0)) != null) {
            str2 = viewItem.text;
        }
        textView.setText(str2);
    }
}
