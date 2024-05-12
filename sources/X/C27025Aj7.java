package X;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.ss.android.ugc.aweme.ecommerce.base.address.dto.CandInputData;
import com.ss.android.ugc.aweme.ecommerce.base.address.dto.ViewItem;
import com.ss.android.ugc.aweme.ecommerce.base.address.dto.ViewStyle;
import com.zhiliaoapp.musically.R;
import java.util.List;
import kotlin.jvm.internal.o;

/* renamed from: X.Aj7, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C27025Aj7 extends AbstractViewOnClickListenerC27027Aj9 {
    public final /* synthetic */ C27022Aj4 LJLILLLLZI;
    public final /* synthetic */ ViewGroup LJLJI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C27025Aj7(C27022Aj4 c27022Aj4, ViewGroup viewGroup, View view) {
        super(view);
        this.LJLILLLLZI = c27022Aj4;
        this.LJLJI = viewGroup;
        o.LJIIIIZZ(view, "createView(parent, R.lay…ress_candidate_item_view)");
    }

    @Override // X.AbstractViewOnClickListenerC27027Aj9
    public final void L(CandInputData candInputData, int i, ViewStyle viewStyle, String str) {
        int i2;
        String str2;
        String str3;
        List<ViewItem> list;
        ViewItem viewItem;
        List<ViewItem> list2;
        ViewItem viewItem2;
        List<ViewItem> list3;
        TextView textView = (TextView) this.itemView.findViewById(R.id.m1k);
        TextView textView2 = (TextView) this.itemView.findViewById(R.id.m1l);
        this.LJLILLLLZI.getClass();
        boolean z = false;
        if (candInputData != null && (list3 = candInputData.viewItems) != null) {
            i2 = list3.size();
        } else {
            i2 = 0;
        }
        if (i2 > 1) {
            Context context = this.LJLJI.getContext();
            o.LJIIIIZZ(context, "parent.context");
            Integer LJI = C79045V0n.LJI(R.attr.go, context);
            Context context2 = this.LJLJI.getContext();
            o.LJIIIIZZ(context2, "parent.context");
            Integer LJI2 = C79045V0n.LJI(R.attr.gu, context2);
            if (candInputData == null || (list2 = candInputData.viewItems) == null || (viewItem2 = (ViewItem) ListProtector.get(list2, 0)) == null || (str2 = viewItem2.text) == null) {
                str2 = "";
            }
            Context context3 = this.itemView.getContext();
            o.LJIIIIZZ(context3, "itemView.context");
            textView.setText(C92153jX.LIZ(str, LJI, LJI2, str2, context3));
            if (candInputData != null && (list = candInputData.viewItems) != null && (viewItem = (ViewItem) ListProtector.get(list, 1)) != null) {
                str3 = viewItem.text;
            } else {
                str3 = null;
            }
            textView2.setText(str3);
        }
        View itemView = this.itemView;
        o.LJIIIIZZ(itemView, "itemView");
        if (getLayoutPosition() != i - 1) {
            z = true;
        }
        C26508Aam.LIZ(itemView, z);
    }
}
