package X;

import com.bytedance.android.livesdk.broadcast.voicechat.VoiceChatBroadcastFragment;
import com.bytedance.android.livesdk.dataChannel.PauseLiveChannel;
import com.bytedance.android.livesdk.livesetting.broadcast.LiveRemoveBroadcastForegroundSetting;
import com.bytedance.android.livesdk.tunnel.BroadcastTunnelVM;
import com.bytedance.bpea.basics.PrivacyCert;
import com.bytedance.bpea.store.policy.PrivacyPolicyStore;

/* renamed from: X.C1g, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C30652C1g implements InterfaceC78493UrJ {
    public final /* synthetic */ VoiceChatBroadcastFragment LJLIL;

    @Override // X.InterfaceC78493UrJ
    public final void LJJIL() {
        C0NB.LJIIIZ("VoiceChatBroadcastFragment", "onEnterBackground");
        this.LJLIL.LJLJL = true;
        if (LiveRemoveBroadcastForegroundSetting.INSTANCE.disable()) {
            CKO cko = this.LJLIL.LJLLLL;
            if (cko != null) {
                PrivacyCert.Builder LIZ = C44878HjO.LIZ(PrivacyCert.Builder.Companion, "bpea-anchor-pause-broadcast", "", "Switch to background during live broadcast");
                LIZ.policies(PrivacyPolicyStore.getAudioPrivacyPolicy());
                cko.LIZJ(LIZ.build());
            }
            C11000bw c11000bw = this.LJLIL.LJLLLLLL;
            if (c11000bw != null) {
                c11000bw.LIZ(2);
            }
        }
    }

    @Override // X.InterfaceC78493UrJ
    public final void LLIIIZ() {
        C0NB.LJIIIZ("VoiceChatBroadcastFragment", "onEnterForeground");
        this.LJLIL.LJLJL = false;
        if (LiveRemoveBroadcastForegroundSetting.INSTANCE.disable() && ((BroadcastTunnelVM) this.LJLIL.LLIIZ.getValue()).LJLIL.getValue() == A9Z.STREAM_ON && C29306Beo.LJIILLIIL((Boolean) this.LJLIL.LJIIL().kv0(PauseLiveChannel.class))) {
            CKO cko = this.LJLIL.LJLLLL;
            if (cko != null) {
                PrivacyCert.Builder LIZ = C44878HjO.LIZ(PrivacyCert.Builder.Companion, "bpea-anchor-resume-broadcast", "", "Switch from background to foreground during live broadcast");
                LIZ.policies(PrivacyPolicyStore.getAudioPrivacyPolicy());
                cko.LJIIJJI(LIZ.build());
            }
            C11000bw c11000bw = this.LJLIL.LJLLLLLL;
            if (c11000bw != null) {
                c11000bw.LIZIZ(2);
            }
        }
    }

    public C30652C1g(VoiceChatBroadcastFragment voiceChatBroadcastFragment) {
        this.LJLIL = voiceChatBroadcastFragment;
    }
}
