package X;

import com.bytedance.android.live.design.app.LiveDialog;
import com.bytedance.android.live.liveinteract.multiguestv3.main.common.MultiGuestDataHolder;
import com.bytedance.android.live.liveinteract.multiguestv3.main.common.channel.MultiGuestV3PreviewPanelV2OpenEvent;
import com.bytedance.android.live.liveinteract.multiguestv3.model.MultiLiveGuestMuteAudioEvent;
import com.bytedance.android.livesdk.model.message.linker.listchangemessage.LinkListUser;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import com.zhiliaoapp.musically.R;

/* renamed from: X.TSg, reason: case insensitive filesystem */
/* loaded from: classes14.dex */
public final class C74670TSg implements C0K7 {
    public final /* synthetic */ TTB LJLIL;
    public final /* synthetic */ LinkListUser LJLILLLLZI;
    public final /* synthetic */ C34K LJLJI;
    public final /* synthetic */ C34K LJLJJI;

    public C74670TSg(TTB ttb, LinkListUser linkListUser, C34K c34k, C34K c34k2) {
        this.LJLIL = ttb;
        this.LJLILLLLZI = linkListUser;
        this.LJLJI = c34k;
        this.LJLJJI = c34k2;
    }

    @Override // X.C0K7
    public final void LJIILLIIL(LiveDialog liveDialog) {
        String str;
        TTB ttb;
        DataChannel dataChannel;
        liveDialog.dismiss();
        TTB ttb2 = this.LJLIL;
        LinkListUser linkListUser = this.LJLILLLLZI;
        boolean z = this.LJLJI.element;
        if (this.LJLJJI.element) {
            str = "check_click";
        } else {
            str = "click";
        }
        ttb2.LIZIZ(linkListUser, z, str, false);
        TTB ttb3 = this.LJLIL;
        MultiGuestDataHolder multiGuestDataHolder = ttb3.LJLJI;
        if (!multiGuestDataHolder.LIZLLL) {
            multiGuestDataHolder.LIZLLL = true;
            DataChannel dataChannel2 = ttb3.LJLJJL;
            if (dataChannel2 != null) {
                dataChannel2.qv0(MultiLiveGuestMuteAudioEvent.class, new C74631TQt(this.LJLIL.LJLJI.LIZLLL, "business_mute_guest_confirm_host_invite"));
            }
            C30868C9o.LJI(C15380j0.LJIILJJIL(R.string.n9w));
            C74824TYe c74824TYe = C74824TYe.LIZ;
            MultiGuestDataHolder multiGuestDataHolder2 = this.LJLIL.LJLJI;
            c74824TYe.LJJ(multiGuestDataHolder2.LJJIJ, multiGuestDataHolder2.LJJJJI, "anchor_manage", false);
        }
        if (this.LJLJJI.element && (dataChannel = (ttb = this.LJLIL).LJLJJL) != null) {
            dataChannel.qv0(MultiGuestV3PreviewPanelV2OpenEvent.class, new C74601TPp(new C74600TPo(ttb.LJLJI.LJIIIIZZ, C74740TUy.LIZLLL().LJ, C74740TUy.LIZLLL().LJFF), "anchor_invite", "anchor_invite_guest"));
        }
    }
}
