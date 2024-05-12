package X;

import android.view.View;
import androidx.fragment.app.FragmentManager;
import com.bytedance.android.live.effect.api.EffectRedDotStatusChangeEvent;
import com.bytedance.android.livesdk.LiveDialogFragment;
import com.bytedance.android.livesdk.livesetting.other.LiveRedDotOfflineEnableSetting;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.internal.o;

/* loaded from: classes6.dex */
public final class BZV extends BZU {
    public View LJLIL;
    public DataChannel LJLILLLLZI;

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        FragmentManager fragmentManager;
        DataChannel dataChannel = this.LJLILLLLZI;
        if (dataChannel != null && (fragmentManager = (FragmentManager) dataChannel.kv0(C29494Bhq.class)) != null) {
            LiveDialogFragment liveSoundEffectDialog = C7N.LJII().getLiveSoundEffectDialog();
            o.LJIIIIZZ(liveSoundEffectDialog, "effectService.liveSoundEffectDialog");
            liveSoundEffectDialog.show(fragmentManager, "LiveSoundEffectDialogFragment");
        }
        C29306Beo.LJI(this.LJLIL);
        InterfaceC30442Bx8.LLLLIILL.LIZ(Boolean.FALSE);
        DataChannel dataChannel2 = this.LJLILLLLZI;
        if (dataChannel2 != null) {
            dataChannel2.pv0(EffectRedDotStatusChangeEvent.class);
        }
        BZI LIZ = C28787BRn.LIZ("livesdk_live_take_sound_click");
        LIZ.LJIILLIIL(this.LJLILLLLZI);
        LIZ.LJJIIJZLJL();
    }

    @Override // X.BZU, X.InterfaceViewOnClickListenerC30227Btf
    public final void i(InterfaceC30237Btp interfaceC30237Btp, DataChannel dataChannel) {
        boolean z;
        super.i(interfaceC30237Btp, dataChannel);
        this.LJLILLLLZI = dataChannel;
        interfaceC30237Btp.LIZ(R.id.ld4);
        View LIZ = interfaceC30237Btp.LIZ(R.id.ldl);
        this.LJLIL = LIZ;
        if (!LiveRedDotOfflineEnableSetting.INSTANCE.getValue()) {
            Boolean LIZJ = InterfaceC30442Bx8.LLLLIILL.LIZJ();
            o.LJIIIIZZ(LIZJ, "LIVE_SOUND_EFFECT_RED_DOT_SHOW.value");
            if (LIZJ.booleanValue()) {
                z = true;
                C29306Beo.LJJLIIIJJI(LIZ, z);
            }
        }
        z = false;
        C29306Beo.LJJLIIIJJI(LIZ, z);
    }
}
