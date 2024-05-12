package X;

import Y.ARunnableS17S1000000_13;
import android.view.View;
import androidx.lifecycle.LifecycleOwner;
import com.bytedance.android.live.design.view.icon.LiveIconView;
import com.bytedance.android.live.liveinteract.multiguestv3.main.common.MultiGuestDataHolder;
import com.bytedance.android.live.liveinteract.multiguestv3.main.common.channel.MultiGuestV3PreviewPanelV2OpenEvent;
import com.bytedance.android.live.liveinteract.multiguestv3.model.MultiLiveGuestMuteVideoEvent;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.internal.AqS179S0100000_13;
import kotlin.jvm.internal.o;

/* loaded from: classes14.dex */
public final class TSW implements InterfaceViewOnClickListenerC30227Btf {
    public final LifecycleOwner LJLIL;
    public DataChannel LJLILLLLZI;

    @InterfaceC75558Tl4(name = "MULTI_GUEST_DATA_HOLDER")
    public MultiGuestDataHolder mMultiGuestDataHolder;

    @Override // X.InterfaceViewOnClickListenerC30227Btf
    public final /* synthetic */ void Ea(boolean z) {
    }

    @Override // X.InterfaceViewOnClickListenerC30227Btf
    public final /* synthetic */ void F() {
    }

    @Override // X.InterfaceViewOnClickListenerC30227Btf
    public final /* synthetic */ long LLJZ() {
        return 500L;
    }

    @Override // X.InterfaceViewOnClickListenerC30227Btf
    public final /* synthetic */ boolean LLLILZJ(View view) {
        return false;
    }

    @Override // X.InterfaceViewOnClickListenerC30227Btf
    public final /* synthetic */ void Q4(InterfaceC30237Btp interfaceC30237Btp, DataChannel dataChannel) {
    }

    @Override // X.InterfaceViewOnClickListenerC30227Btf
    public final /* synthetic */ void ei() {
    }

    @Override // X.InterfaceViewOnClickListenerC30227Btf
    public final /* synthetic */ void onHide() {
    }

    @Override // X.InterfaceViewOnClickListenerC30227Btf
    public final /* synthetic */ void onShow() {
    }

    @Override // X.InterfaceViewOnClickListenerC30227Btf
    public final /* synthetic */ boolean ud() {
        return true;
    }

    public final MultiGuestDataHolder LIZ() {
        MultiGuestDataHolder multiGuestDataHolder = this.mMultiGuestDataHolder;
        if (multiGuestDataHolder != null) {
            return multiGuestDataHolder;
        }
        o.LJIJI("mMultiGuestDataHolder");
        throw null;
    }

    public TSW(LifecycleOwner lifecycleOwner) {
        o.LJIIIZ(lifecycleOwner, "lifecycleOwner");
        this.LJLIL = lifecycleOwner;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        if (LIZ().LJJIJLIJ == 2 || LIZ().LJJIJLIJ == 0 || LIZ().LJJIJLIJ == -1) {
            C30868C9o.LIZJ(R.string.nep);
            return;
        }
        if (LIZ().LJ) {
            C74951TbH.LIZ(this.LJLILLLLZI, false);
            LIZ().LJ = true ^ LIZ().LJ;
            DataChannel dataChannel = this.LJLILLLLZI;
            if (dataChannel != null) {
                dataChannel.qv0(MultiLiveGuestMuteVideoEvent.class, new C74632TQu(LIZ().LJ, "business_mute_click_toolbar"));
            }
            C74824TYe.LIZ.LJJJJ("button_icon", LIZ().LJJJJI, false, LIZ().LJIIIIZZ);
            String LJJJJLL = C78886Uxe.LJJJJLL(C8E.LJ());
            String str = LIZ().LJJJJI;
            if (str == null) {
                str = "";
            }
            C74824TYe.LJLIIIL(0, "button_icon", false, LJJJJLL, str);
            TR8.LIZLLL(new ARunnableS17S1000000_13("toolBarMuteVideo", 0));
            return;
        }
        DataChannel dataChannel2 = this.LJLILLLLZI;
        if (dataChannel2 != null) {
            dataChannel2.qv0(MultiGuestV3PreviewPanelV2OpenEvent.class, new C74601TPp(new C74600TPo(LIZ().LJIIIIZZ, C74740TUy.LIZLLL().LJ, C74740TUy.LIZLLL().LJFF), "camera_icon", "button_icon"));
        }
        C74824TYe.LIZ.LJJJJ("button_icon", LIZ().LJJJJI, true, LIZ().LJIIIIZZ);
    }

    @Override // X.InterfaceViewOnClickListenerC30227Btf
    public final void i(InterfaceC30237Btp interfaceC30237Btp, DataChannel dataChannel) {
        C75559Tl5.LIZIZ.LIZLLL(this);
        this.LJLILLLLZI = dataChannel;
        if (dataChannel != null) {
            dataChannel.ov0(this.LJLIL, MultiLiveGuestMuteVideoEvent.class, new AqS179S0100000_13(interfaceC30237Btp, 403));
        }
        if (LIZ().LJ) {
            LiveIconView liveIconView = (LiveIconView) interfaceC30237Btp.LIZ(R.id.ld4);
            if (liveIconView != null) {
                liveIconView.setIconAttr(R.attr.avx);
                return;
            }
            return;
        }
        LiveIconView liveIconView2 = (LiveIconView) interfaceC30237Btp.LIZ(R.id.ld4);
        if (liveIconView2 == null) {
            return;
        }
        liveIconView2.setIconAttr(R.attr.avy);
    }
}
