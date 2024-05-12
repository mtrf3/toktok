package X;

import com.bytedance.android.live.liveinteract.multiguestv3.main.show.common.BaseLiveShowViewModel;
import com.bytedance.android.live.liveinteract.multiguestv3.main.show.common.BaseLiveShowWidget;
import com.bytedance.android.live.liveinteract.multiguestv3.main.show.common.LiveShowCountDownEvent;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import kotlin.jvm.internal.o;
import webcast.data.multi_guest_play.ShowListUser;

/* loaded from: classes14.dex */
public final class U31<T> implements InterfaceC64592gB {
    public final /* synthetic */ BaseLiveShowWidget LJLIL;
    public final /* synthetic */ long LJLILLLLZI;
    public final /* synthetic */ long LJLJI;
    public final /* synthetic */ int LJLJJI;
    public final /* synthetic */ String LJLJJL;
    public final /* synthetic */ String LJLJJLL;
    public final /* synthetic */ U33 LJLJL;

    public U31(BaseLiveShowWidget baseLiveShowWidget, long j, long j2, int i, String str, String str2, U33 u33) {
        this.LJLIL = baseLiveShowWidget;
        this.LJLILLLLZI = j;
        this.LJLJI = j2;
        this.LJLJJI = i;
        this.LJLJJL = str;
        this.LJLJJLL = str2;
        this.LJLJL = u33;
    }

    @Override // X.InterfaceC64592gB
    public final void accept(Object obj) {
        String str;
        Long t = (Long) obj;
        DataChannel dataChannel = this.LJLIL.dataChannel;
        long j = this.LJLILLLLZI;
        long j2 = this.LJLJI;
        o.LJIIIIZZ(t, "t");
        dataChannel.qv0(LiveShowCountDownEvent.class, new C75270TgQ(this.LJLJJI, j, j2 - t.longValue(), this.LJLJJL));
        if (this.LJLJI - t.longValue() <= 10) {
            ShowListUser LJZ = this.LJLIL.LJZ(this.LJLJJI);
            if (LJZ == null) {
                BaseLiveShowWidget baseLiveShowWidget = this.LJLIL;
                if (baseLiveShowWidget.LJLJLLL != null && baseLiveShowWidget.LJLJLJ != 1) {
                    baseLiveShowWidget.LLFF(1, Integer.valueOf(this.LJLJJI), this.LJLJJLL, this.LJLJL.LIZIZ);
                }
            } else {
                ShowListUser showListUser = this.LJLIL.LJLJLLL;
                if (showListUser != null) {
                    str = showListUser.linkmicIdStr;
                } else {
                    str = null;
                }
                if (!o.LJ(str, LJZ.linkmicIdStr)) {
                    this.LJLIL.LLFF(3, Integer.valueOf(LJZ.order), LJZ.nickname, LJZ);
                }
            }
            this.LJLIL.LJLJLLL = LJZ;
            if (this.LJLJI - t.longValue() == 0) {
                BaseLiveShowWidget baseLiveShowWidget2 = this.LJLIL;
                if (baseLiveShowWidget2.LJLJLLL != null) {
                    BaseLiveShowViewModel baseLiveShowViewModel = baseLiveShowWidget2.LJLILLLLZI;
                    if (baseLiveShowViewModel != null) {
                        baseLiveShowViewModel.hv0(0);
                    }
                    BaseLiveShowViewModel baseLiveShowViewModel2 = this.LJLIL.LJLILLLLZI;
                    if (baseLiveShowViewModel2 != null) {
                        baseLiveShowViewModel2.iv0(0);
                    }
                }
            }
        }
    }
}
