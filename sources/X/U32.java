package X;

import com.bytedance.android.live.liveinteract.multiguestv3.main.show.common.BaseLiveShowWidget;

/* loaded from: classes14.dex */
public final class U32 implements InterfaceC72822Si2 {
    public final /* synthetic */ BaseLiveShowWidget LJLIL;

    public U32(BaseLiveShowWidget baseLiveShowWidget) {
        this.LJLIL = baseLiveShowWidget;
    }

    @Override // X.InterfaceC72822Si2
    public final void onReceiveJsEvent(C199097rd c199097rd) {
        Integer num;
        Integer num2;
        Integer num3;
        C0NB.LIZIZ("BaseLiveShowWidget", "receive multi_guest_banner_ready js event");
        C74838TYs.LJ().LJJIJIL = true;
        BaseLiveShowWidget baseLiveShowWidget = this.LJLIL;
        baseLiveShowWidget.getClass();
        if (!C74838TYs.LJ().LJJIJL) {
            StringBuilder LIZ = X1D.LIZ();
            LIZ.append("sendBannerJsEventWhenRefreshSuccess: status: ");
            LIZ.append(baseLiveShowWidget.LJLJLJ);
            LIZ.append(", order: ");
            LIZ.append(baseLiveShowWidget.LJLJJL);
            LIZ.append(", name: ");
            C31811Ce7.LJ(LIZ, baseLiveShowWidget.LJLJJLL, LIZ, "BaseLiveShowWidget");
            int i = baseLiveShowWidget.LJLJLJ;
            if (i != 1) {
                if (i != 2) {
                    if (i != 3) {
                        if (i != 4) {
                            if (i == 5) {
                                baseLiveShowWidget.LLFF(5, null, null, null);
                            }
                        } else {
                            baseLiveShowWidget.LLFF(1, baseLiveShowWidget.LJLJJL, baseLiveShowWidget.LJLJJLL, baseLiveShowWidget.LJLJL);
                        }
                    } else if (baseLiveShowWidget.LJLJJLL != null && (num3 = baseLiveShowWidget.LJLJJL) != null) {
                        num3.intValue();
                        baseLiveShowWidget.LLFF(3, baseLiveShowWidget.LJLJJL, baseLiveShowWidget.LJLJJLL, baseLiveShowWidget.LJLJL);
                    }
                    BaseLiveShowWidget.LLFFF();
                } else if (baseLiveShowWidget.LJLJJLL != null && (num2 = baseLiveShowWidget.LJLJJL) != null) {
                    num2.intValue();
                    baseLiveShowWidget.LLFF(2, baseLiveShowWidget.LJLJJL, baseLiveShowWidget.LJLJJLL, baseLiveShowWidget.LJLJL);
                    BaseLiveShowWidget.LLFFF();
                }
            } else if (baseLiveShowWidget.LJLJJLL != null && (num = baseLiveShowWidget.LJLJJL) != null) {
                num.intValue();
                baseLiveShowWidget.LLFF(1, baseLiveShowWidget.LJLJJL, baseLiveShowWidget.LJLJJLL, baseLiveShowWidget.LJLJL);
                BaseLiveShowWidget.LLFFF();
            }
        }
        C74838TYs.LJ().LJJIJL = true;
    }
}
