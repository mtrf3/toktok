package com.bytedance.android.live.liveinteract.multiguestv3.main.media.guest.previewv2.golive;

import X.B5G;
import X.C30868C9o;
import X.C31657Cbd;
import X.C62814Ol0;
import X.C65352Pkq;
import X.C68332mD;
import X.C73318Sq2;
import X.C73411SrX;
import X.C74749TVh;
import X.C74906TaY;
import X.C78857UxB;
import X.InterfaceC74236TBo;
import X.TBT;
import X.TQG;
import X.TQH;
import androidx.lifecycle.LiveData;
import com.bytedance.android.live.liveinteract.multiguestv3.main.common.MultiGuestDataHolder;
import com.bytedance.android.live.liveinteract.multiguestv3.main.guest.AnchorPermitGuestEvent;
import com.bytedance.android.live.liveinteract.multiguestv3.main.guest.GuestJoinChannelWhenAnchorPermitEvent;
import com.bytedance.android.live.liveinteract.multiguestv3.main.guest.GuestReplyAnchorEvent;
import com.bytedance.android.live.liveinteract.multiguestv3.main.media.guest.previewv2.common.AbsMultiGuestNewPreviewViewModel;
import com.bytedance.ies.sdk.datachannel.Channel;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import com.bytedance.ies.sdk.datachannel.Event;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.internal.AqS163S0100000_13;
import kotlin.jvm.internal.o;

/* loaded from: classes14.dex */
public final class MultiGuestGoLivePreviewViewModel extends AbsMultiGuestNewPreviewViewModel {
    public static final /* synthetic */ InterfaceC74236TBo<Object>[] LJZL;
    public C74749TVh LJLLILLLL;
    public C73411SrX LJZI;
    public final /* synthetic */ C74906TaY LJLLI = new C74906TaY();
    public final C31657Cbd LJLLJ = new C31657Cbd("MULTI_GUEST_DATA_HOLDER");
    public final C68332mD LJLLL = C62814Ol0.LJII(this, 0);
    public final C68332mD LJLLLL = C62814Ol0.LJIIJJI(this);
    public final C68332mD LJLLLLLL = C62814Ol0.LJIIJJI(this);
    public final C68332mD LJLZ = C62814Ol0.LJIIJJI(this);
    public final C68332mD LJZ = C62814Ol0.LJIIJJI(this);

    static {
        TBT tbt = new TBT(MultiGuestGoLivePreviewViewModel.class, "dataHolder", "getDataHolder()Lcom/bytedance/android/live/liveinteract/multiguestv3/main/common/MultiGuestDataHolder;", 0);
        C65352Pkq.LIZ.getClass();
        LJZL = new InterfaceC74236TBo[]{tbt};
    }

    public final Channel<Integer> mv0() {
        return (Channel) this.LJLLL.getValue();
    }

    public final Event<Boolean> nv0() {
        return (Event) this.LJLZ.getValue();
    }

    public final void qv0() {
        Integer num = (Integer) ((LiveData) this.LJZ.getValue()).getValue();
        if (num != null && num.intValue() > 0) {
            ((LiveData) this.LJZ.getValue()).setValue(0);
            ((LiveData) this.LJLLLLLL.getValue()).setValue(Boolean.TRUE);
            C73411SrX c73411SrX = this.LJZI;
            C74906TaY c74906TaY = this.LJLLI;
            if (c73411SrX != null) {
                ((C73318Sq2) c74906TaY.LIZ.getValue()).LIZIZ(c73411SrX);
            } else {
                c74906TaY.getClass();
            }
        }
    }

    @Override // com.bytedance.android.live.liveinteract.api.viewmodel.ViewModelExt, androidx.lifecycle.ViewModel
    public final void onCleared() {
        super.onCleared();
        ((C73318Sq2) this.LJLLI.LIZ.getValue()).dispose();
    }

    public final boolean ov0() {
        Integer value;
        Integer value2 = mv0().getValue();
        if ((value2 == null || value2.intValue() != 2) && ((value = mv0().getValue()) == null || value.intValue() != 4)) {
            return false;
        }
        return true;
    }

    public final boolean pv0() {
        Integer value;
        Integer value2 = mv0().getValue();
        if ((value2 == null || value2.intValue() != 3) && ((value = mv0().getValue()) == null || value.intValue() != 5)) {
            return false;
        }
        return true;
    }

    public final void sv0() {
        C74749TVh c74749TVh;
        TQH tqh;
        Integer value;
        Boolean value2 = nv0().getValue();
        Boolean bool = Boolean.TRUE;
        if (o.LJ(value2, bool)) {
            return;
        }
        if (B5G.LIZIZ().LJ() != 2) {
            C30868C9o.LIZJ(R.string.mhi);
            return;
        }
        MultiGuestDataHolder multiGuestDataHolder = (MultiGuestDataHolder) this.LJLLJ.LIZ(this, LJZL[0]);
        if (multiGuestDataHolder != null && !C78857UxB.LJJJI(multiGuestDataHolder.LJJIJLIJ) && (value = hv0().getValue()) != null && value.intValue() == 2) {
            hv0().setValue(1);
            C30868C9o.LIZJ(R.string.nep);
        }
        if (ov0()) {
            C74749TVh c74749TVh2 = this.LJLLILLLL;
            if (c74749TVh2 != null && c74749TVh2.LIZJ()) {
                DataChannel dataChannel = this.LJLJJI;
                if (dataChannel != null) {
                    dataChannel.pv0(GuestJoinChannelWhenAnchorPermitEvent.class);
                }
            } else {
                DataChannel dataChannel2 = this.LJLJJI;
                if (dataChannel2 != null) {
                    dataChannel2.pv0(AnchorPermitGuestEvent.class);
                }
            }
        } else if (pv0()) {
            C74749TVh c74749TVh3 = this.LJLLILLLL;
            if (c74749TVh3 != null && c74749TVh3.LJFF != null && c74749TVh3.LIZ() && c74749TVh3.LJI && (c74749TVh = this.LJLLILLLL) != null && c74749TVh.LJFF != null) {
                if (c74749TVh != null && (tqh = c74749TVh.LJFF) != null) {
                    this.LJLLJ.LIZ(this, LJZL[0]);
                    tqh.LJIIL(new AqS163S0100000_13(this, 326));
                }
            } else {
                DataChannel dataChannel3 = this.LJLJJI;
                if (dataChannel3 != null) {
                    dataChannel3.pv0(GuestReplyAnchorEvent.class);
                }
            }
        }
        nv0().setValue(bool);
    }

    public final void rv0(int i, String str) {
        boolean z;
        C74749TVh c74749TVh;
        TQG tqg;
        C74749TVh c74749TVh2;
        TQH tqh;
        C74749TVh c74749TVh3 = this.LJLLILLLL;
        if (c74749TVh3 != null && c74749TVh3.LIZ()) {
            z = true;
        } else {
            z = false;
        }
        if (z && (c74749TVh2 = this.LJLLILLLL) != null && c74749TVh2.LJFF != null) {
            if (c74749TVh2 != null && (tqh = c74749TVh2.LJFF) != null) {
                tqh.LIZIZ(i, str);
                return;
            }
            return;
        }
        C74749TVh c74749TVh4 = this.LJLLILLLL;
        if (c74749TVh4 == null || !c74749TVh4.LIZIZ() || (c74749TVh = this.LJLLILLLL) == null || c74749TVh.LJ == null || c74749TVh == null || (tqg = c74749TVh.LJ) == null) {
            return;
        }
        tqg.LIZIZ(i, str);
    }
}
