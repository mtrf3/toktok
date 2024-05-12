package com.ss.android.ugc.aweme.bnpl.biz.bill.statements;

import X.C92373a9h;
import X.EnumC92002a3i;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import com.bytedance.ies.powerlist.PowerCell;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.internal.o;

/* loaded from: classes20.dex */
public final class StatementsCellGroupHeader extends PowerCell<C92373a9h> {
    @Override // com.bytedance.ies.powerlist.PowerCell
    public final void onBindItemView(C92373a9h c92373a9h) {
        String str;
        C92373a9h item = c92373a9h;
        o.LJIIIZ(item, "item");
        super.onBindItemView(item);
        EnumC92002a3i enumC92002a3i = item.LJLIL;
        if (enumC92002a3i == EnumC92002a3i.CURRENT) {
            str = this.itemView.getContext().getString(R.string.jn5);
        } else if (enumC92002a3i == EnumC92002a3i.UPCOMING) {
            str = this.itemView.getContext().getString(R.string.jnb);
        } else {
            str = item.LJLILLLLZI;
        }
        o.LJIIIIZZ(str, "if (item.type == Stateme…      item.year\n        }");
        ((TextView) this.itemView.findViewById(R.id.dm)).setText(str);
    }

    @Override // com.bytedance.ies.powerlist.PowerCell
    public final View onCreateItemView(ViewGroup parent) {
        o.LJIIIZ(parent, "parent");
        return inflateItemView(parent, R.layout.a4);
    }
}
