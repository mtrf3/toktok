package com.ss.android.ugc.aweme.setting.ui.cell;

import X.C1DI;
import X.C25876ADo;
import android.view.View;
import android.view.ViewGroup;
import com.bytedance.tux.input.TuxTextView;
import com.ss.android.ugc.aweme.cell.BaseCell;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.internal.o;
import o3.IDaS90S0000000_4;
import o3.h0;

/* loaded from: classes5.dex */
public final class SettingHeaderCell extends BaseCell<C25876ADo> {
    @Override // com.ss.android.ugc.aweme.cell.BaseCell
    public final View L(ViewGroup viewGroup) {
        return C1DI.LIZ(viewGroup, "parent", R.layout.cky, viewGroup, false, "from(parent.context)\n   …ng_header, parent, false)");
    }

    @Override // com.ss.android.ugc.aweme.cell.BaseCell, com.bytedance.ies.powerlist.PowerCell
    /* renamed from: N, reason: merged with bridge method [inline-methods] */
    public final void onBindItemView(C25876ADo t) {
        TuxTextView tuxTextView;
        o.LJIIIZ(t, "t");
        super.onBindItemView(t);
        View view = this.itemView;
        if ((view instanceof TuxTextView) && (tuxTextView = (TuxTextView) view) != null) {
            String str = t.LJLJLJ;
            if (str == null) {
                str = tuxTextView.getContext().getString(R.string.dhz);
            }
            tuxTextView.setText(str);
            tuxTextView.LJJJ(28.0f);
            h0.LJIJI(tuxTextView, new IDaS90S0000000_4(1));
        }
    }
}
