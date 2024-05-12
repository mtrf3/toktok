package com.ss.android.ugc.aweme.bnpl.biz.bill.detail;

import X.C16880lQ;
import X.C2068389v;
import X.C39386Fd0;
import X.C91933a2b;
import X.C91934a2c;
import X.C92364a9Y;
import X.EF7;
import X.EnumC91911a2F;
import X.EnumC91913a2H;
import X.ViewOnClickListenerC91852a1I;
import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import com.bytedance.bddatefmt.BDDateFormat;
import com.bytedance.ies.powerlist.PowerCell;
import com.bytedance.tux.icon.TuxIconView;
import com.zhiliaoapp.musically.R;
import java.util.Locale;
import kotlin.jvm.internal.o;

/* loaded from: classes20.dex */
public final class StatementDetailCell extends PowerCell<C92364a9Y> {
    @Override // com.bytedance.ies.powerlist.PowerCell
    public final void onBindItemView(C92364a9Y c92364a9Y) {
        int i;
        String LIZIZ;
        C92364a9Y item = c92364a9Y;
        o.LJIIIZ(item, "item");
        super.onBindItemView(item);
        boolean LJ = o.LJ(item.LJLJJLL, EnumC91913a2H.ORDER_INSTALLMENTS.getValue());
        if (LJ) {
            i = R.raw.icon_money;
        } else {
            i = R.raw.icon_shopping_cart_ltr;
        }
        TuxIconView tuxIconView = (TuxIconView) this.itemView.findViewById(R.id.dx);
        C2068389v c2068389v = new C2068389v();
        c2068389v.LIZ = i;
        c2068389v.LJ = Integer.valueOf(R.attr.gx);
        tuxIconView.setTuxIcon(c2068389v);
        ((TextView) this.itemView.findViewById(R.id.e2)).setText(item.LJLJI);
        TextView textView = (TextView) this.itemView.findViewById(R.id.e1);
        long j = item.LJLJJI;
        String str = "";
        if (j == 0) {
            LIZIZ = "";
        } else {
            BDDateFormat bDDateFormat = (BDDateFormat) C91933a2b.LJ.getValue();
            Locale LIZIZ2 = C39386Fd0.LIZIZ(EF7.LIZIZ());
            o.LJIIIIZZ(LIZIZ2, "getFrom(AppContextManager.getApplicationContext())");
            LIZIZ = bDDateFormat.LIZIZ(j, LIZIZ2);
        }
        textView.setText(LIZIZ);
        Context context = this.itemView.getContext();
        o.LJIIIIZZ(context, "itemView.context");
        ((TextView) this.itemView.findViewById(R.id.dr)).setText(C91934a2c.LIZ(context, item.LJLJL));
        if (o.LJ(item.LJLJJL, EnumC91911a2F.ORDER_PARTIAL_REFUND.getValue())) {
            str = this.itemView.getContext().getString(R.string.jpg);
        } else if (o.LJ(item.LJLJJL, EnumC91911a2F.ORDER_REFUND.getValue())) {
            str = this.itemView.getContext().getString(R.string.jph);
        }
        o.LJIIIIZZ(str, "if (item.orderStatus == …nd,\n            ) else \"\"");
        ((TextView) this.itemView.findViewById(R.id.dz)).setText(str);
        C16880lQ.LJIIJ(new ViewOnClickListenerC91852a1I(item, LJ, this), this.itemView);
    }

    @Override // com.bytedance.ies.powerlist.PowerCell
    public final View onCreateItemView(ViewGroup parent) {
        o.LJIIIZ(parent, "parent");
        return inflateItemView(parent, R.layout.z);
    }
}
