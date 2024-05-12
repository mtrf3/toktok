package X;

import com.bytedance.android.live.base.model.ImageModel;
import com.bytedance.android.live.base.model.user.User;
import com.bytedance.android.live.liveinteract.multiguestv3.main.common.channel.MultiGuestReceiveInviteMeFromModeratorChannel;
import com.bytedance.android.live.liveinteract.multiguestv3.main.common.channel.ShowMultiGuestV3BeInvitedDialogEvent;
import com.bytedance.android.live.liveinteract.multilive.guset.util.MultiLiveInviteeShareHelper;
import com.bytedance.android.live.liveinteract.multilive.model.ReplyInvitationPanelInfo;
import com.bytedance.android.livesdk.chatroom.model.multilive.MultiLiveAnchorPanelSettings;
import com.bytedance.android.livesdk.comp.api.linkcore.model.Layout;
import com.bytedance.ies.sdk.datachannel.DataChannel;

/* loaded from: classes14.dex */
public final class TXM implements UC6 {
    public final /* synthetic */ String LIZ;
    public final /* synthetic */ MultiLiveInviteeShareHelper LIZIZ;
    public final /* synthetic */ ReplyInvitationPanelInfo LIZJ;

    @Override // X.UC6
    public final void LIZ(Layout layout) {
        String str;
        ImageModel imageModel;
        if (layout == null) {
            StringBuilder LIZ = X1D.LIZ();
            LIZ.append("onBeInvited return as there isn't a layout for layoutId:");
            C31811Ce7.LJ(LIZ, this.LIZ, LIZ, "MultiLiveInviteeShareHelper");
            return;
        }
        MultiLiveInviteeShareHelper multiLiveInviteeShareHelper = this.LIZIZ;
        ReplyInvitationPanelInfo replyInvitationPanelInfo = this.LIZJ;
        multiLiveInviteeShareHelper.getClass();
        C0NB.LIZIZ("MultiLiveInviteeShareHelper", "beInvite");
        C75017TcL.LIZ = "outside_liveroom";
        C74824TYe.LJIIIZ = "outside_liveroom";
        C75017TcL.LJIILJJIL("outside_liveroom");
        User owner = multiLiveInviteeShareHelper.LIZIZ.getOwner();
        MultiLiveAnchorPanelSettings multiLiveAnchorPanelSettings = null;
        if (owner == null || (str = C05170If.LIZ(owner)) == null) {
            str = "";
        }
        User owner2 = multiLiveInviteeShareHelper.LIZIZ.getOwner();
        if (owner2 != null) {
            imageModel = owner2.getAvatarThumb();
        } else {
            imageModel = null;
        }
        multiLiveInviteeShareHelper.LIZ.rv0(MultiGuestReceiveInviteMeFromModeratorChannel.class, Boolean.FALSE);
        DataChannel dataChannel = multiLiveInviteeShareHelper.LIZ;
        if (replyInvitationPanelInfo != null) {
            multiLiveAnchorPanelSettings = replyInvitationPanelInfo.anchorSettingInfo;
        }
        dataChannel.qv0(ShowMultiGuestV3BeInvitedDialogEvent.class, new C74628TQq(null, null, multiLiveAnchorPanelSettings, true, false, str, imageModel, multiLiveInviteeShareHelper.LIZIZ.getOwner().getId(), 51));
    }

    public TXM(String str, MultiLiveInviteeShareHelper multiLiveInviteeShareHelper, ReplyInvitationPanelInfo replyInvitationPanelInfo) {
        this.LIZ = str;
        this.LIZIZ = multiLiveInviteeShareHelper;
        this.LIZJ = replyInvitationPanelInfo;
    }
}
