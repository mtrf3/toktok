package X;

import android.view.View;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.internal.AqS171S0100000_5;
import kotlin.jvm.internal.o;

/* loaded from: classes6.dex */
public final class BWY implements InterfaceViewOnClickListenerC30227Btf {
    public View LJLIL;
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

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        C30444BxA.LIZ(EnumC30410Bwc.LIVE_BROADCAST_KARAOKE);
        if (BYI.LIZ(BWZ.KARAOKE)) {
            if (BYI.LIZIZ(BWZ.BGM)) {
                BPM bpm = new BPM();
                bpm.LIZJ = R.string.jvq;
                bpm.LIZIZ = "pm_mt_LIVEKaraoke_LIVEhostPage_musicKaraokeToast";
                bpm.LIZLLL = true;
                bpm.LJFF = this.LJLILLLLZI;
                bpm.LJ = E2C.LIZJ("extra", "bgm");
                C30868C9o.LJII(bpm);
                return;
            }
            if (BYI.LIZIZ(BWZ.VOICE_EFFECT)) {
                BPM bpm2 = new BPM();
                bpm2.LIZJ = R.string.jw4;
                bpm2.LIZIZ = "pm_mt_LIVEKaraoke_LIVEhostPage_voiceEffectKaraokeToast";
                bpm2.LIZLLL = true;
                bpm2.LJFF = this.LJLILLLLZI;
                bpm2.LJ = E2C.LIZJ("extra", "voice");
                C30868C9o.LJII(bpm2);
                return;
            }
        }
        C7N.LJII().openLiveKaraokeDialog(this.LJLILLLLZI);
        BZI LIZ = C28787BRn.LIZ("livesdk_live_karaoke_click");
        LIZ.LJIILLIIL(this.LJLILLLLZI);
        LIZ.LJJIIJZLJL();
    }

    @Override // X.InterfaceViewOnClickListenerC30227Btf
    public final void i(InterfaceC30237Btp interfaceC30237Btp, DataChannel dataChannel) {
        this.LJLILLLLZI = dataChannel;
        interfaceC30237Btp.LIZ(R.id.ld4);
        this.LJLIL = interfaceC30237Btp.LIZ(R.id.ldl);
        BWZ businessType = BWZ.KARAOKE;
        AqS171S0100000_5 aqS171S0100000_5 = new AqS171S0100000_5(interfaceC30237Btp, 740);
        o.LJIIIZ(businessType, "businessType");
        BYI.LIZIZ.put(businessType, aqS171S0100000_5);
        aqS171S0100000_5.invoke(Boolean.valueOf(BYI.LIZ(businessType)));
        ActivityC45651qj LIZIZ = C29306Beo.LIZIZ(interfaceC30237Btp.getContext());
        if (LIZIZ != null) {
            C30444BxA.LIZIZ(EnumC30410Bwc.LIVE_BROADCAST_KARAOKE, LIZIZ, interfaceC30237Btp.LIZ(R.id.ldl), new AqS171S0100000_5(dataChannel, 741));
        }
        C77800Ug8.LJ("livesdk_live_karaoke_show", dataChannel);
    }
}
