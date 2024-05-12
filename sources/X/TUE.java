package X;

import android.view.View;
import androidx.lifecycle.LifecycleOwner;
import com.bytedance.android.live.liveinteract.api.IInteractService;
import com.bytedance.android.live.liveinteract.multiguestv3.MultiGuestAudioVolumeEvent;
import com.bytedance.android.live.liveinteract.multiguestv3.main.common.MultiGuestDataHolder;
import com.bytedance.android.live.liveinteract.multiguestv3.main.common.channel.MicClickableEvent;
import com.bytedance.android.live.liveinteract.multiguestv3.model.MultiLiveGuestMuteAudioEvent;
import com.bytedance.android.livesdk.livesetting.linkmic.LinkMicGuestMicEffectSetting;
import com.bytedance.android.livesdk.livesetting.linkmic.MultiGuestLiveShowConfigSetting;
import com.bytedance.android.livesdk.livesetting.linkmic.multilive.MultiGuestV3AudioBeOccupiedGuestABSetting;
import com.bytedance.android.livesdkapi.depend.model.live.Room;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import com.bytedance.ies.sdk.datachannel.DataChannelGlobal;
import com.zhiliaoapp.musically.R;
import java.util.Iterator;
import kotlin.jvm.internal.AqS144S0200000_13;
import kotlin.jvm.internal.AqS179S0100000_13;
import kotlin.jvm.internal.o;
import webcast.data.multi_guest_play.ShowConfig;
import webcast.data.multi_guest_play.ShowContent;
import webcast.data.multi_guest_play.ShowListUser;

/* loaded from: classes14.dex */
public final class TUE implements InterfaceViewOnClickListenerC30227Btf {
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

    public static boolean LIZIZ() {
        String str;
        IInteractService iInteractService = (IInteractService) CN1.LIZ(IInteractService.class);
        Room room = (Room) DataChannelGlobal.LJLJJI.mv0(C29044Baa.class);
        if (room != null) {
            str = C17280m4.LIZ(room);
        } else {
            str = null;
        }
        return iInteractService.gt(str);
    }

    public final MultiGuestDataHolder LIZ() {
        MultiGuestDataHolder multiGuestDataHolder = this.mMultiGuestDataHolder;
        if (multiGuestDataHolder != null) {
            return multiGuestDataHolder;
        }
        o.LJIJI("mMultiGuestDataHolder");
        throw null;
    }

    public TUE(LifecycleOwner lifeCycleOwner) {
        o.LJIIIZ(lifeCycleOwner, "lifeCycleOwner");
        this.LJLIL = lifeCycleOwner;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        U35 LIZ;
        ShowContent content;
        ShowConfig showConfig;
        ShowListUser showListUser;
        Long valueOf;
        if (LIZ().LJJIJLIJ == 1 || LIZ().LJJIJLIJ == 0 || LIZ().LJJIJLIJ == -1 || LIZIZ()) {
            return;
        }
        if (MultiGuestV3AudioBeOccupiedGuestABSetting.INSTANCE.showOccupied() && !LIZ().LJIL) {
            C30868C9o.LIZJ(R.string.n0d);
            C74824TYe.LJJJIL("pm_mic_occupy_during_live_toast", "guest_connection");
            return;
        }
        if (C74838TYs.LJ().LJJIL) {
            C30868C9o.LIZJ(R.string.n7a);
            return;
        }
        if (MultiGuestLiveShowConfigSetting.INSTANCE.isOpenLiveShow() && (LIZ = TQA.LIZ()) != null && (content = LIZ.getContent()) != null && (showConfig = content.showConfig) != null && !showConfig.allowOpenMicFreely) {
            Iterator<ShowListUser> it = content.showingAndReadyList.iterator();
            do {
                showListUser = null;
                if (!it.hasNext()) {
                    break;
                } else {
                    showListUser = it.next();
                }
            } while (showListUser.status != 2);
            ShowListUser showListUser2 = showListUser;
            if (showListUser2 != null && (valueOf = Long.valueOf(showListUser2.userId)) != null) {
                if (valueOf.longValue() != ((C29374Bfu) B83.LIZ().LIZIZ()).getCurrentUserId() && !LIZ().LIZLLL) {
                    C30868C9o.LIZJ(R.string.ndl);
                    return;
                }
            }
        }
        C74824TYe.LIZ.LJJ(LIZ().LJJIJL, LIZ().LJJJJI, "button_icon", LIZ().LIZLLL);
        LIZ().LIZLLL = true ^ LIZ().LIZLLL;
        StringBuilder LIZ2 = X1D.LIZ();
        LIZ2.append("ToolbarMultiGuestMic#onClick enable = ");
        FT5.LJ(LIZ2, LIZ().LIZLLL, LIZ2, "ToolbarMultiGuestMicBehavior");
        DataChannel dataChannel = this.LJLILLLLZI;
        if (dataChannel == null) {
            return;
        }
        dataChannel.qv0(MultiLiveGuestMuteAudioEvent.class, new C74631TQt(LIZ().LIZLLL, "business_mute_click_toolbar"));
    }

    @Override // X.InterfaceViewOnClickListenerC30227Btf
    public final void i(InterfaceC30237Btp interfaceC30237Btp, DataChannel dataChannel) {
        C75559Tl5.LIZIZ.LIZLLL(this);
        this.LJLILLLLZI = dataChannel;
        if (dataChannel != null) {
            dataChannel.ov0(this.LJLIL, MultiLiveGuestMuteAudioEvent.class, new AqS144S0200000_13(this, interfaceC30237Btp, 39));
            dataChannel.ov0(this.LJLIL, MultiGuestAudioVolumeEvent.class, new AqS179S0100000_13(interfaceC30237Btp, 402));
            dataChannel.ov0(this.LJLIL, MicClickableEvent.class, new AqS144S0200000_13(interfaceC30237Btp, dataChannel, 40));
        }
        C76633U5t c76633U5t = (C76633U5t) interfaceC30237Btp.LIZ(R.id.gin);
        if (c76633U5t != null) {
            c76633U5t.setAudioEnabled(LIZ().LIZLLL);
            c76633U5t.setAudioClickable(LIZ().LJIL);
            c76633U5t.LJZI = LinkMicGuestMicEffectSetting.INSTANCE.getValue();
        }
    }
}
