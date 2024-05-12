package X;

import com.bytedance.android.live.design.app.LiveDialog;
import com.bytedance.android.live.liveinteract.multiguestv3.main.common.MultiGuestDataHolder;
import com.bytedance.android.live.liveinteract.multiguestv3.main.common.channel.MultiGuestV3PreviewPanelV2OpenEvent;
import com.bytedance.android.live.liveinteract.multiguestv3.model.MultiLiveGuestMuteAudioEvent;
import com.bytedance.android.livesdk.model.message.linker.listchangemessage.LinkListUser;
import com.bytedance.ies.sdk.datachannel.DataChannel;

/* renamed from: X.TSf, reason: case insensitive filesystem */
/* loaded from: classes14.dex */
public final class C74669TSf implements C0K7 {
    public final /* synthetic */ TTB LJLIL;
    public final /* synthetic */ LinkListUser LJLILLLLZI;
    public final /* synthetic */ C34K LJLJI;
    public final /* synthetic */ C34K LJLJJI;

    public C74669TSf(TTB ttb, LinkListUser linkListUser, C34K c34k, C34K c34k2) {
        this.LJLIL = ttb;
        this.LJLILLLLZI = linkListUser;
        this.LJLJI = c34k;
        this.LJLJJI = c34k2;
    }

    @Override // X.C0K7
    public final void LJIILLIIL(LiveDialog liveDialog) {
        String str;
        liveDialog.dismiss();
        TTB ttb = this.LJLIL;
        LinkListUser linkListUser = this.LJLILLLLZI;
        boolean z = this.LJLJI.element;
        if (this.LJLJJI.element) {
            str = "check_click";
        } else {
            str = "click";
        }
        ttb.LIZIZ(linkListUser, z, str, true);
        TTB ttb2 = this.LJLIL;
        MultiGuestDataHolder multiGuestDataHolder = ttb2.LJLJI;
        if (!multiGuestDataHolder.LJ) {
            if (this.LJLJJI.element) {
                multiGuestDataHolder.LIZLLL = true;
                DataChannel dataChannel = ttb2.LJLJJL;
                if (dataChannel != null) {
                    dataChannel.qv0(MultiLiveGuestMuteAudioEvent.class, new C74631TQt(this.LJLIL.LJLJI.LIZLLL, "business_mute_guest_confirm_host_invite"));
                }
            }
            TTB ttb3 = this.LJLIL;
            DataChannel dataChannel2 = ttb3.LJLJJL;
            if (dataChannel2 != null) {
                dataChannel2.qv0(MultiGuestV3PreviewPanelV2OpenEvent.class, new C74601TPp(new C74600TPo(ttb3.LJLJI.LJIIIIZZ, C74740TUy.LIZLLL().LJ, C74740TUy.LIZLLL().LJFF), "anchor_invite", "anchor_invite_guest"));
            }
            C74824TYe c74824TYe = C74824TYe.LIZ;
            MultiGuestDataHolder multiGuestDataHolder2 = this.LJLIL.LJLJI;
            c74824TYe.LJJJJ("anchor_manage", multiGuestDataHolder2.LJJJJI, true, multiGuestDataHolder2.LJIIIIZZ);
        }
    }
}
