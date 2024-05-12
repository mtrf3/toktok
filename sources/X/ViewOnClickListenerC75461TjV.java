package X;

import android.view.View;
import com.bytedance.android.live.base.model.user.User;
import com.bytedance.android.live.liveinteract.api.event.OpenCoHostListPanelEvent;
import com.bytedance.android.livesdk.model.message.LinkMicAnchorGuideMessage;
import com.bytedance.android.livesdk.model.message.OptPairInfo;
import com.bytedance.android.livesdkapi.depend.model.live.Room;
import com.bytedance.ies.sdk.datachannel.DataChannelGlobal;
import java.util.HashMap;
import java.util.List;

/* renamed from: X.TjV, reason: case insensitive filesystem */
/* loaded from: classes14.dex */
public final class ViewOnClickListenerC75461TjV implements View.OnClickListener {
    public final /* synthetic */ OptPairInfo.OptPairUser LJLIL;
    public final /* synthetic */ LinkMicAnchorGuideMessage LJLILLLLZI;
    public final /* synthetic */ boolean LJLJI;
    public final /* synthetic */ C75525TkX LJLJJI;

    public ViewOnClickListenerC75461TjV(OptPairInfo.OptPairUser optPairUser, LinkMicAnchorGuideMessage linkMicAnchorGuideMessage, boolean z, C75525TkX c75525TkX) {
        this.LJLIL = optPairUser;
        this.LJLILLLLZI = linkMicAnchorGuideMessage;
        this.LJLJI = z;
        this.LJLJJI = c75525TkX;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        Long l;
        Long l2;
        Long l3;
        List<OptPairInfo.OptPairUser> list;
        OptPairInfo.OptPairUser optPairUser;
        User user;
        OptPairInfo.OptPairUser optPairUser2 = this.LJLIL;
        if (optPairUser2.user != null && optPairUser2.roomId != 0) {
            OptPairInfo optPairInfo = this.LJLILLLLZI.optPairInfo;
            HashMap hashMap = new HashMap();
            DataChannelGlobal dataChannelGlobal = DataChannelGlobal.LJLJJI;
            Room room = (Room) dataChannelGlobal.mv0(C29044Baa.class);
            Long l4 = null;
            if (room != null) {
                l = Long.valueOf(room.getOwnerUserId());
            } else {
                l = null;
            }
            hashMap.put("anchor_id", String.valueOf(l));
            if (room != null) {
                l2 = Long.valueOf(room.getOwnerUserId());
            } else {
                l2 = null;
            }
            hashMap.put("connection_inviter_id", String.valueOf(l2));
            if (optPairInfo != null && (list = optPairInfo.displayUserList) != null && (optPairUser = (OptPairInfo.OptPairUser) ORZ.LJLLLLLL(0, list)) != null && (user = optPairUser.user) != null) {
                l3 = Long.valueOf(user.getId());
            } else {
                l3 = null;
            }
            hashMap.put("connection_invitee_id", String.valueOf(l3));
            hashMap.put("enter_from", "anchor_pair_designed_guide");
            if (optPairInfo != null) {
                l4 = Long.valueOf(optPairInfo.mappingId);
            }
            hashMap.put("pk_mapping_id", String.valueOf(l4));
            String LJIJJ = C75642TmQ.LJIJJ();
            LJIJJ.toString();
            hashMap.put("before_connection_status", LJIJJ);
            AnonymousClass172.LIZ("livesdk_connection_pair_designed_bubble_click", hashMap);
            if (!this.LJLJI) {
                C75525TkX c75525TkX = this.LJLJJI;
                User user2 = this.LJLIL.user;
                if (user2 == null) {
                    user2 = new User();
                }
                c75525TkX.LJI(user2, this.LJLIL.roomId, null, this.LJLILLLLZI.optPairInfo);
            } else {
                this.LJLJJI.getClass();
                dataChannelGlobal.rv0(OpenCoHostListPanelEvent.class);
            }
        }
        C19980qQ.LIZ(this.LJLJJI.LJFF());
    }
}
