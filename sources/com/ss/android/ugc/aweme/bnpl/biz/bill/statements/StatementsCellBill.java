package com.ss.android.ugc.aweme.bnpl.biz.bill.statements;

import X.AI8;
import X.AIF;
import X.C32151Nz;
import X.C79045V0n;
import X.C91934a2c;
import X.C92114a5W;
import X.C92372a9g;
import X.O6R;
import X.ViewOnClickListenerC92003a3j;
import X.X1D;
import android.content.Context;
import android.text.SpannableString;
import android.text.style.AbsoluteSizeSpan;
import android.view.View;
import android.view.ViewGroup;
import com.bytedance.ies.powerlist.PowerCell;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.internal.o;

/* loaded from: classes20.dex */
public final class StatementsCellBill extends PowerCell<C92372a9g> {
    @Override // com.bytedance.ies.powerlist.PowerCell
    public final void onBindItemView(C92372a9g c92372a9g) {
        C92372a9g item = c92372a9g;
        o.LJIIIZ(item, "item");
        super.onBindItemView(item);
        String str = item.LJLILLLLZI;
        if (item.LJLJJI) {
            String string = this.itemView.getContext().getString(R.string.jnv);
            o.LJIIIIZZ(string, "itemView.context.getStri…repayment_amount_overdue)");
            StringBuilder LIZ = X1D.LIZ();
            LIZ.append(str);
            LIZ.append("  ");
            LIZ.append(string);
            SpannableString spannableString = new SpannableString(X1D.LIZIZ(LIZ));
            spannableString.setSpan(new AbsoluteSizeSpan(12, true), str.length() + 2, spannableString.length(), 17);
            Context context = this.itemView.getContext();
            o.LJIIIIZZ(context, "itemView.context");
            Integer LJI = C79045V0n.LJI(R.attr.e7, context);
            Context context2 = this.itemView.getContext();
            o.LJIIIIZZ(context2, "itemView.context");
            Integer LJI2 = C79045V0n.LJI(R.attr.dj, context2);
            if (LJI != null && LJI2 != null) {
                spannableString.setSpan(new C92114a5W(LJI.intValue(), LJI2.intValue(), O6R.LJJIIZ(C32151Nz.LJIIZILJ(5)), O6R.LJJIIZ(C32151Nz.LJIIZILJ(4))), str.length() + 2, spannableString.length(), 17);
            }
            ((AI8) this.itemView.findViewById(R.id.hq)).setTitle(spannableString);
        } else {
            ((AI8) this.itemView.findViewById(R.id.hq)).setTitle(str);
        }
        String string2 = this.itemView.getContext().getString(R.string.jp7);
        o.LJIIIIZZ(string2, "itemView.context.getStri…ing.pipo_common_due_date)");
        AI8 ai8 = (AI8) this.itemView.findViewById(R.id.hq);
        StringBuilder LIZ2 = X1D.LIZ();
        LIZ2.append(string2);
        LIZ2.append(": ");
        LIZ2.append(item.LJLJI);
        ai8.setSubtitle(X1D.LIZIZ(LIZ2));
        Context context3 = this.itemView.getContext();
        o.LJIIIIZZ(context3, "itemView.context");
        CharSequence LIZ3 = C91934a2c.LIZ(context3, item.LJLJJL);
        String str2 = item.LJLILLLLZI;
        AI8 ai82 = (AI8) this.itemView.findViewById(R.id.hq);
        Context context4 = this.itemView.getContext();
        o.LJIIIIZZ(context4, "itemView.context");
        AIF aif = new AIF(context4, null);
        aif.LJIILIIL(LIZ3);
        aif.LJIILJJIL(new ViewOnClickListenerC92003a3j(item, this, str2));
        ai82.setAccessory(aif);
    }

    @Override // com.bytedance.ies.powerlist.PowerCell
    public final View onCreateItemView(ViewGroup parent) {
        o.LJIIIZ(parent, "parent");
        return inflateItemView(parent, R.layout.a2);
    }
}
