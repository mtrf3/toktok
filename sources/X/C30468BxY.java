package X;

import com.bytedance.android.live.design.app.LiveDialog;
import com.bytedance.android.livesdk.api.revenue.subscription.ISubscribeService;
import com.bytedance.android.livesdk.broadcast.voicechat.VoiceChatBroadcastFragment;
import com.bytedance.bpea.basics.PrivacyCert;
import com.bytedance.bpea.store.policy.PrivacyPolicyStore;
import kotlin.jvm.internal.o;

/* renamed from: X.BxY, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C30468BxY implements C0K7 {
    public final /* synthetic */ VoiceChatBroadcastFragment LJLIL;
    public final /* synthetic */ Integer LJLILLLLZI;
    public final /* synthetic */ boolean LJLJI;

    public C30468BxY(VoiceChatBroadcastFragment voiceChatBroadcastFragment, Integer num, boolean z) {
        this.LJLIL = voiceChatBroadcastFragment;
        this.LJLILLLLZI = num;
        this.LJLJI = z;
    }

    @Override // X.C0K7
    public final void LJIILLIIL(LiveDialog liveDialog) {
        VoiceChatBroadcastFragment voiceChatBroadcastFragment = this.LJLIL;
        PrivacyCert.Builder LIZ = C44878HjO.LIZ(PrivacyCert.Builder.Companion, "bpea-voice-showEndLiveDialog-453", "", "stop video/audio capture when live ends");
        LIZ.policies(PrivacyPolicyStore.getAudioPrivacyPolicy());
        voiceChatBroadcastFragment.dm(LIZ.build());
        B5G.LIZIZ().LJJIJL = true;
        B5G.LIZIZ().LJJIJLIJ = true;
        B5G.LIZIZ().LJJLIL = this.LJLIL.Al();
        liveDialog.dismiss();
        Integer num = this.LJLILLLLZI;
        if (num != null && num.intValue() == 4) {
            C7N.LJIIIIZZ().logBoostCardLiveEndClick(1);
        }
        if (this.LJLJI) {
            InterfaceC06390Mx LIZ2 = CN1.LIZ(ISubscribeService.class);
            o.LJIIIIZZ(LIZ2, "getService(T::class.java)");
            ((ISubscribeService) LIZ2).Rv();
            C28959BYd.LIZ(true);
        }
    }
}
