package X;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.ss.android.ugc.aweme.ecommerce.base.common.model.Price;
import com.ss.android.ugc.aweme.ecommerce.base.osp.repository.dto.BillItem;
import com.zhiliaoapp.musically.R;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import kotlin.jvm.internal.o;

/* renamed from: X.AiF, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C26971AiF extends ConstraintLayout {
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

    public final void setExplainText(String str) {
        TextView global_osp_shipping_sheet_explain_text = (TextView) _$_findCachedViewById(R.id.dx7);
        o.LJIIIIZZ(global_osp_shipping_sheet_explain_text, "global_osp_shipping_sheet_explain_text");
        OUP.LJJLIIIJILLIZJL(global_osp_shipping_sheet_explain_text, str);
    }

    public final void setPrice(String str) {
        ((TextView) _$_findCachedViewById(R.id.mxn)).setText(str);
    }

    public final void setShippingFeeItem(ArrayList<BillItem> arrayList) {
        String str;
        if (arrayList != null) {
            Iterator<BillItem> it = arrayList.iterator();
            while (it.hasNext()) {
                BillItem next = it.next();
                ViewGroup viewGroup = (ViewGroup) _$_findCachedViewById(R.id.mxk);
                Context context = getContext();
                o.LJIIIIZZ(context, "context");
                Integer num = null;
                C26970AiE c26970AiE = new C26970AiE(context, null, 0);
                c26970AiE.setTitle(next.getItemName());
                Price itemPrice = next.getItemPrice();
                if (itemPrice != null) {
                    str = itemPrice.getPriceStr();
                } else {
                    str = null;
                }
                Integer itemTextFont = next.getItemTextFont();
                Price itemPrice2 = next.getItemPrice();
                if (itemPrice2 != null) {
                    num = itemPrice2.getPriceTextColor();
                }
                c26970AiE.LJJLJLI(itemTextFont, num, str);
                viewGroup.addView(c26970AiE);
            }
        }
    }

    public C26971AiF(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        C16880lQ.LLLLIILL(C16880lQ.LLZIL(context), R.layout.zg, this, true);
    }
}
