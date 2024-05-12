package X;

import com.bytedance.android.livesdk.dataChannel.RoomChannel;
import com.bytedance.android.livesdk.impl.revenue.starcomment.manage.AnchorStarCommentManageDialog;
import com.bytedance.android.livesdk.message.proto.StarCommentConfig;
import com.bytedance.android.livesdkapi.depend.model.live.Room;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import kotlin.jvm.internal.o;

/* loaded from: classes6.dex */
public final class BC6 implements InterfaceC72822Si2 {
    public final /* synthetic */ AnchorStarCommentManageDialog LJLIL;

    public BC6(AnchorStarCommentManageDialog anchorStarCommentManageDialog) {
        this.LJLIL = anchorStarCommentManageDialog;
    }

    @Override // X.InterfaceC72822Si2
    public final void onReceiveJsEvent(C199097rd c199097rd) {
        InterfaceC78280Uns interfaceC78280Uns;
        Room room;
        if (o.LJ(c199097rd.LJLIL, "star_comment_setting_event") && (interfaceC78280Uns = c199097rd.LJLILLLLZI) != null) {
            AnchorStarCommentManageDialog anchorStarCommentManageDialog = this.LJLIL;
            try {
                StarCommentConfig starCommentConfig = new StarCommentConfig();
                starCommentConfig.starCommentSwitch = interfaceC78280Uns.getBoolean("star_comment_switch");
                starCommentConfig.grantGroup = interfaceC78280Uns.getInt("grant_group");
                starCommentConfig.grantLevel = interfaceC78280Uns.getInt("grant_level");
                starCommentConfig.starCommentQualification = true;
                DataChannel dataChannel = anchorStarCommentManageDialog.dataChannel;
                if (dataChannel != null && (room = (Room) dataChannel.kv0(RoomChannel.class)) != null) {
                    room.starCommentConfig = starCommentConfig;
                }
            } catch (Exception unused) {
            }
        }
    }
}
