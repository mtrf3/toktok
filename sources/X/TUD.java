package X;

import android.view.View;
import androidx.lifecycle.LifecycleOwner;
import com.bytedance.android.live.liveinteract.multiguestv3.MultiGuestAudioVolumeEvent;
import com.bytedance.android.livesdk.comp.impl.game.linkmic.model.GameLinkGuestMuteAudioEvent;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.internal.AqS179S0100000_13;
import kotlin.jvm.internal.o;

/* loaded from: classes14.dex */
public final class TUD implements InterfaceViewOnClickListenerC30227Btf {
    public final LifecycleOwner LJLIL;
    public DataChannel LJLILLLLZI;

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

    public TUD(LifecycleOwner lifeCycleOwner) {
        o.LJIIIZ(lifeCycleOwner, "lifeCycleOwner");
        this.LJLIL = lifeCycleOwner;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        if (TTV.LIZ().LJIIZILJ == 1 || TTV.LIZ().LJIIZILJ == 0 || TTV.LIZ().LJIIZILJ == -1) {
            StringBuilder LIZ = X1D.LIZ();
            LIZ.append("onClick permission error = ");
            LIZ.append(TTV.LIZ().LJIIZILJ);
            TYP.LIZJ("ToolbarGameLinkMicBehavior", X1D.LIZIZ(LIZ));
            return;
        }
        TWL.LIZ.LJIIJ(TTV.LIZ().LJIILLIIL, TTV.LIZ().LJJ, "button_icon", !TTV.LIZ().LJIIIIZZ);
        TTV.LIZ().LJIIIIZZ = true ^ TTV.LIZ().LJIIIIZZ;
        StringBuilder LIZ2 = X1D.LIZ();
        LIZ2.append("onClick isAudioEnable = ");
        LIZ2.append(TTV.LIZ().LJIIIIZZ);
        TYP.LIZJ("ToolbarGameLinkMicBehavior", X1D.LIZIZ(LIZ2));
        DataChannel dataChannel = this.LJLILLLLZI;
        if (dataChannel != null) {
            dataChannel.qv0(GameLinkGuestMuteAudioEvent.class, new C74674TSk(TTV.LIZ().LJIIIIZZ, "business_mute_click_toolbar"));
        }
    }

    @Override // X.InterfaceViewOnClickListenerC30227Btf
    public final void i(InterfaceC30237Btp interfaceC30237Btp, DataChannel dataChannel) {
        this.LJLILLLLZI = dataChannel;
        if (dataChannel != null) {
            dataChannel.ov0(this.LJLIL, GameLinkGuestMuteAudioEvent.class, new AqS179S0100000_13(interfaceC30237Btp, 684));
            dataChannel.ov0(this.LJLIL, MultiGuestAudioVolumeEvent.class, new AqS179S0100000_13(interfaceC30237Btp, 685));
        }
        C76633U5t c76633U5t = (C76633U5t) interfaceC30237Btp.LIZ(R.id.gin);
        if (c76633U5t != null) {
            c76633U5t.setAudioEnabled(TTV.LIZ().LJIIIIZZ);
        }
    }
}
