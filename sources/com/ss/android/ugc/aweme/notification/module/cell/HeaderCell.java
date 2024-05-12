package com.ss.android.ugc.aweme.notification.module.cell;

import X.C16880lQ;
import X.C1DI;
import X.C5H3;
import X.C65352Pkq;
import X.C72513Sd3;
import X.C72516Sd6;
import X.C72521SdB;
import X.InterfaceC74236TBo;
import X.TBT;
import X.V1B;
import Y.ACListenerS45S0200000_10;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.internal.AqS162S0100000_12;
import kotlin.jvm.internal.o;

/* loaded from: classes13.dex */
public final class HeaderCell extends BaseChunkCell<C72521SdB> {
    public static final /* synthetic */ InterfaceC74236TBo<Object>[] LJLJLLL;
    public final C72516Sd6 LJLJJL = new C72516Sd6(this);
    public final C5H3 LJLJJLL = V1B.LJZI(new AqS162S0100000_12(this, 799));
    public final C5H3 LJLJL = V1B.LJZI(new AqS162S0100000_12(this, 798));
    public final C5H3 LJLJLJ = V1B.LJZI(new AqS162S0100000_12(this, 797));

    static {
        TBT tbt = new TBT(HeaderCell.class, "control", "getControl()Lcom/ss/android/ugc/aweme/notification/module/NotificationChunk$CellControl;", 0);
        C65352Pkq.LIZ.getClass();
        LJLJLLL = new InterfaceC74236TBo[]{tbt};
    }

    @Override // com.ss.android.ugc.aweme.notification.module.cell.BaseChunkCell, com.bytedance.ies.powerlist.PowerCell
    public final void onViewAttachedToWindow() {
        super.onViewAttachedToWindow();
        C72513Sd3 c72513Sd3 = (C72513Sd3) this.LJLJJL.LIZ(this, LJLJLLL[0]);
        o.LJI(c72513Sd3);
        c72513Sd3.LJLIL.LJIIJ().LIZLLL();
    }

    @Override // com.ss.android.ugc.aweme.notification.module.cell.BaseChunkCell, com.bytedance.ies.powerlist.PowerCell
    /* renamed from: N, reason: merged with bridge method [inline-methods] */
    public final void onBindItemView(C72521SdB t) {
        o.LJIIIZ(t, "t");
        super.onBindItemView(t);
        ((TextView) this.LJLJJLL.getValue()).setText(t.LJLILLLLZI);
        String str = t.LJLJI;
        if (str == null || str.length() == 0) {
            ((View) this.LJLJL.getValue()).setVisibility(8);
            ((ImageView) this.LJLJLJ.getValue()).setVisibility(8);
            C16880lQ.LJIIJ(null, this.itemView);
        } else {
            ((View) this.LJLJL.getValue()).setVisibility(0);
            ((ImageView) this.LJLJLJ.getValue()).setVisibility(0);
            ((TextView) this.LJLJL.getValue()).setText(t.LJLJI);
            C16880lQ.LJIIJ(new ACListenerS45S0200000_10(this, t, 7), this.itemView);
        }
    }

    @Override // com.bytedance.ies.powerlist.PowerCell
    public final View onCreateItemView(ViewGroup viewGroup) {
        return C1DI.LIZ(viewGroup, "parent", R.layout.sc, viewGroup, false, "from(parent.context).inf…nk_header, parent, false)");
    }
}
