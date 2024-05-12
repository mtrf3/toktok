package com.ss.android.ugc.aweme.music.app.auth.setting.cell;

import X.C16880lQ;
import X.C78897Uxp;
import X.C94968apY;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import com.bytedance.tux.icon.TuxIconView;
import com.ss.android.ugc.aweme.cell.BaseCell;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.internal.o;

/* loaded from: classes34.dex */
public final class DspPlatformCell extends BaseCell<C94968apY> {
    @Override // com.ss.android.ugc.aweme.cell.BaseCell
    public final View L(ViewGroup parent) {
        o.LJIIIZ(parent, "parent");
        View getView$lambda$0 = C16880lQ.LLLLIILL(C16880lQ.LLZIL(parent.getContext()), R.layout.dwi, parent, false);
        o.LJIIIIZZ(getView$lambda$0, "getView$lambda$0");
        C78897Uxp.LJJJJJL(getView$lambda$0, 0.0f);
        return getView$lambda$0;
    }

    @Override // com.ss.android.ugc.aweme.cell.BaseCell, com.bytedance.ies.powerlist.PowerCell
    /* renamed from: N, reason: merged with bridge method [inline-methods] */
    public final void onBindItemView(C94968apY t) {
        o.LJIIIZ(t, "t");
        super.onBindItemView(t);
        ((TuxIconView) this.itemView.findViewById(R.id.npd)).setTuxIcon(t.LL);
        ((TextView) this.itemView.findViewById(R.id.npw)).setText(t.LJZL);
        if (t.LLFFF != null) {
            ((TextView) this.itemView.findViewById(R.id.npv)).setText(t.LLFFF.intValue());
        } else {
            ((TextView) this.itemView.findViewById(R.id.npv)).setText("");
        }
        C16880lQ.LJIIJ(t.LLD, this.itemView);
    }
}
