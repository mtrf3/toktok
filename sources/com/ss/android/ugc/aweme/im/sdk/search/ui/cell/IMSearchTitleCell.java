package com.ss.android.ugc.aweme.im.sdk.search.ui.cell;

import X.C1DI;
import X.C214298b3;
import X.C33J;
import X.C65352Pkq;
import X.C65776Prg;
import X.C87045YEf;
import X.C87046YEg;
import X.C87047YEh;
import X.C87051YEl;
import X.C87053YEn;
import X.C87054YEo;
import X.C9BD;
import X.C9BE;
import X.C9XN;
import X.InterfaceC65784Pro;
import X.YE1;
import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import com.bytedance.ies.powerlist.PowerCell;
import com.ss.android.ugc.aweme.im.sdk.search.viewmodel.IMSearchDefaultVM;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.internal.AqS165S0100000_15;
import kotlin.jvm.internal.o;

/* loaded from: classes16.dex */
public final class IMSearchTitleCell extends PowerCell<C33J> {
    public IMSearchTitleCell() {
        C9BE c9be = C9BE.LIZ;
        C65776Prg LIZ = C65352Pkq.LIZ(IMSearchDefaultVM.class);
        AqS165S0100000_15 aqS165S0100000_15 = new AqS165S0100000_15(LIZ, 462);
        C87051YEl c87051YEl = C87051YEl.INSTANCE;
        if (o.LJ(c9be, C9BD.LIZ)) {
            new C214298b3(LIZ, aqS165S0100000_15, C87046YEg.INSTANCE, new AqS165S0100000_15(this, 463), new AqS165S0100000_15(this, 464), C87054YEo.INSTANCE, c87051YEl, new AqS165S0100000_15(this, 465), 256);
            return;
        }
        if (o.LJ(c9be, c9be)) {
            new C214298b3(LIZ, aqS165S0100000_15, C87047YEh.INSTANCE, new AqS165S0100000_15(this, 466), new AqS165S0100000_15(this, 457), C87053YEn.INSTANCE, c87051YEl, new AqS165S0100000_15(this, 458), 256);
        } else {
            if (c9be == null || o.LJ(c9be, C9XN.LIZ)) {
                new C214298b3(LIZ, aqS165S0100000_15, C87045YEf.INSTANCE, new AqS165S0100000_15(this, 459), new AqS165S0100000_15(this, 460), new AqS165S0100000_15(this, 461), c87051YEl, (InterfaceC65784Pro) null, 384);
                return;
            }
            throw new IllegalArgumentException(YE1.LIZJ("Don't support this VMScope: ", c9be, " there"));
        }
    }

    @Override // com.bytedance.ies.powerlist.PowerCell
    public final void onBindItemView(C33J c33j) {
        int i;
        C33J t = c33j;
        o.LJIIIZ(t, "t");
        View view = this.itemView;
        boolean z = true;
        if (t.LJLIL == 1) {
            z = false;
        }
        TextView textView = (TextView) view.findViewById(R.id.lao);
        Context context = view.getContext();
        if (z) {
            i = R.string.hfa;
        } else {
            i = R.string.hfc;
        }
        textView.setText(context.getText(i));
        view.findViewById(R.id.beb).setVisibility(8);
    }

    @Override // com.bytedance.ies.powerlist.PowerCell
    public final View onCreateItemView(ViewGroup viewGroup) {
        return C1DI.LIZ(viewGroup, "parent", R.layout.b5p, viewGroup, false, "from(parent.context).inf…rch_title, parent, false)");
    }
}
