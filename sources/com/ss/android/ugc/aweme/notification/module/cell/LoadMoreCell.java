package com.ss.android.ugc.aweme.notification.module.cell;

import X.C1DI;
import X.C221018lt;
import X.C65352Pkq;
import X.C72513Sd3;
import X.C72517Sd7;
import X.C72524SdE;
import X.C73305Spp;
import X.C73318Sq2;
import X.C73969T1h;
import X.C78999UzT;
import X.EnumC72512Sd2;
import X.InterfaceC74236TBo;
import X.MQ0;
import X.T16;
import X.TBT;
import X.X1D;
import Y.AObserverS77S0100000_9;
import Y.AfS64S0100000_12;
import Y.IDhS105S0100000_12;
import android.view.View;
import android.view.ViewGroup;
import com.ss.android.ugc.aweme.notice.repo.list.bean.MultiNotice;
import com.ss.android.ugc.aweme.notification.api.NotificationApi;
import com.ss.android.ugc.aweme.notification.module.NotificationChunkVM;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.internal.o;

/* loaded from: classes13.dex */
public final class LoadMoreCell extends BaseChunkCell<C72524SdE> {
    public static final /* synthetic */ InterfaceC74236TBo<Object>[] LJLJL;
    public final C72517Sd7 LJLJJL = new C72517Sd7(this);
    public final AObserverS77S0100000_9 LJLJJLL = new AObserverS77S0100000_9(this, 34);

    static {
        TBT tbt = new TBT(LoadMoreCell.class, "control", "getControl()Lcom/ss/android/ugc/aweme/notification/module/NotificationChunk$CellControl;", 0);
        C65352Pkq.LIZ.getClass();
        LJLJL = new InterfaceC74236TBo[]{tbt};
    }

    @Override // com.ss.android.ugc.aweme.notification.module.cell.BaseChunkCell, com.bytedance.ies.powerlist.PowerCell
    public final void onViewAttachedToWindow() {
        super.onViewAttachedToWindow();
        View view = this.itemView;
        o.LJII(view, "null cannot be cast to non-null type com.bytedance.tux.status.TuxStatusView");
        boolean z = false;
        ((C73305Spp) view).setVisibility(0);
        View view2 = this.itemView;
        o.LJII(view2, "null cannot be cast to non-null type com.bytedance.tux.status.TuxStatusView");
        ((C73305Spp) view2).LJFF();
        C72513Sd3 c72513Sd3 = (C72513Sd3) this.LJLJJL.LIZ(this, LJLJL[0]);
        o.LJI(c72513Sd3);
        NotificationChunkVM notificationChunkVM = c72513Sd3.LJLILLLLZI;
        notificationChunkVM.jv0().observe(this, this.LJLJJLL);
        MQ0 value = notificationChunkVM.jv0().getValue();
        MQ0 mq0 = MQ0.LOADING;
        if (value != mq0) {
            if (notificationChunkVM.LJLLJ != EnumC72512Sd2.EXPAND || notificationChunkVM.jv0().getValue() == mq0 || !notificationChunkVM.LJLLL.LIZLLL || notificationChunkVM.LJLLL.LJ <= 0) {
                StringBuilder LIZ = X1D.LIZ();
                LIZ.append("loadMore invalid:");
                LIZ.append(notificationChunkVM.LJLLJ);
                LIZ.append(", ");
                if (notificationChunkVM.jv0().getValue() == mq0) {
                    z = true;
                }
                LIZ.append(z);
                C221018lt.LIZIZ("NotificationChunkVM", notificationChunkVM.hv0(X1D.LIZIZ(LIZ)));
                return;
            }
            notificationChunkVM.jv0().setValue(mq0);
            C221018lt.LJFF("NotificationChunkVM", notificationChunkVM.hv0("loadMore start"));
            NotificationApi.Api LIZ2 = NotificationApi.LIZ();
            MultiNotice multiNotice = new MultiNotice(notificationChunkVM.LJLL.LIZ, notificationChunkVM.LJLLL.LJ, notificationChunkVM.LJLLL.LJFF, 0, 0, 24, null);
            multiNotice.mayWithMergedTTShopArg(notificationChunkVM.LJLL.LJ);
            C78999UzT.LJFF(LIZ2.fetchGroupNotice(multiNotice.toReqStr(), 0).LJJIJL(new IDhS105S0100000_12(notificationChunkVM, 36)).LJJL(T16.LIZ()).LJJJ(C73969T1h.LIZIZ()).LJJJLIIL(new AfS64S0100000_12(notificationChunkVM, 161), new AfS64S0100000_12(notificationChunkVM, 162)), (C73318Sq2) notificationChunkVM.LJLIL.getValue());
        }
    }

    @Override // com.ss.android.ugc.aweme.notification.module.cell.BaseChunkCell, com.bytedance.ies.powerlist.PowerCell
    public final void onViewDetachedFromWindow() {
        super.onViewDetachedFromWindow();
        C72513Sd3 c72513Sd3 = (C72513Sd3) this.LJLJJL.LIZ(this, LJLJL[0]);
        o.LJI(c72513Sd3);
        c72513Sd3.LJLILLLLZI.jv0().removeObserver(this.LJLJJLL);
    }

    @Override // com.bytedance.ies.powerlist.PowerCell
    public final View onCreateItemView(ViewGroup viewGroup) {
        return C1DI.LIZ(viewGroup, "parent", R.layout.sf, viewGroup, false, "from(parent.context).inf…load_more, parent, false)");
    }
}
