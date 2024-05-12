package Y;

import X.C21180sM;
import X.C538529l;
import X.CN1;
import X.InterfaceC30442Bx8;
import X.XKX;
import android.widget.CompoundButton;
import androidx.lifecycle.LifecycleOwnerKt;
import com.bytedance.android.live.broadcast.api.IBroadcastService;
import com.bytedance.android.live.effect.karaoke.view.KaraokeSettingFragment;
import com.ss.ttlivestreamer.livestreamv2.filter.IAudioFilterManager;

/* loaded from: classes.dex */
public class IDCListenerS201S0100000 implements CompoundButton.OnCheckedChangeListener {
    public final int $t;
    public Object l0;

    @Override // android.widget.CompoundButton.OnCheckedChangeListener
    public final void onCheckedChanged(CompoundButton compoundButton, boolean z) {
        switch (this.$t) {
            case 0:
                onCheckedChanged$0(this, compoundButton, z);
                return;
            case 1:
                onCheckedChanged$1(this, compoundButton, z);
                return;
            case 2:
                onCheckedChanged$2(this, compoundButton, z);
                return;
            default:
                return;
        }
    }

    public IDCListenerS201S0100000(KaraokeSettingFragment karaokeSettingFragment, int i) {
        this.$t = i;
        this.l0 = karaokeSettingFragment;
    }

    public static final void onCheckedChanged$0(IDCListenerS201S0100000 iDCListenerS201S0100000, CompoundButton compoundButton, boolean z) {
        if (compoundButton.isPressed()) {
            ((IBroadcastService) CN1.LIZ(IBroadcastService.class)).getEchoHelper().LIZJ(z, true);
            C21180sM.LJII(((KaraokeSettingFragment) iDCListenerS201S0100000.l0).LJZI, "voice", z);
        }
    }

    public static final void onCheckedChanged$1(IDCListenerS201S0100000 iDCListenerS201S0100000, CompoundButton compoundButton, boolean z) {
        if (compoundButton.isPressed()) {
            InterfaceC30442Bx8.E3.LIZ(Boolean.valueOf(z));
            XKX.LIZLLL(LifecycleOwnerKt.getLifecycleScope((KaraokeSettingFragment) iDCListenerS201S0100000.l0), null, null, new C538529l((KaraokeSettingFragment) iDCListenerS201S0100000.l0, z, null), 3);
            C21180sM.LJII(((KaraokeSettingFragment) iDCListenerS201S0100000.l0).LJZI, "lyric", z);
        }
    }

    public static final void onCheckedChanged$2(IDCListenerS201S0100000 iDCListenerS201S0100000, CompoundButton compoundButton, boolean z) {
        if (compoundButton.isPressed()) {
            InterfaceC30442Bx8.F3.LIZ(Boolean.valueOf(z));
            IAudioFilterManager iAudioFilterManager = ((KaraokeSettingFragment) iDCListenerS201S0100000.l0).LJZ;
            if (iAudioFilterManager != null) {
                iAudioFilterManager.setOriginEnable(z);
            }
            C21180sM.LJII(((KaraokeSettingFragment) iDCListenerS201S0100000.l0).LJZI, "vocal", z);
        }
    }
}
