package X;

import Y.AfS57S0100000_5;
import android.content.DialogInterface;
import com.bytedance.android.live.base.model.user.User;
import com.bytedance.android.livesdk.livesetting.other.subscribe.SubscriptionIconHideTextMinimumDimensionSetting;
import com.bytedance.android.livesdk.microom.LiveMicRoomInfoDialog;
import com.bytedance.android.livesdkapi.depend.model.live.Room;
import java.util.HashMap;

/* renamed from: X.Bfh, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class DialogInterfaceOnClickListenerC29361Bfh implements DialogInterface.OnClickListener {
    public final /* synthetic */ User LJLIL;
    public final /* synthetic */ LiveMicRoomInfoDialog LJLILLLLZI;
    public final /* synthetic */ User LJLJI;

    public DialogInterfaceOnClickListenerC29361Bfh(User user, LiveMicRoomInfoDialog liveMicRoomInfoDialog, User user2, String str) {
        this.LJLIL = user;
        this.LJLILLLLZI = liveMicRoomInfoDialog;
        this.LJLJI = user2;
    }

    @Override // android.content.DialogInterface.OnClickListener
    public final void onClick(DialogInterface dialogInterface, int i) {
        boolean z;
        long j;
        dialogInterface.dismiss();
        if (this.LJLIL.getFollowInfo() == null) {
            return;
        }
        LiveMicRoomInfoDialog liveMicRoomInfoDialog = this.LJLILLLLZI;
        C29432Bgq c29432Bgq = liveMicRoomInfoDialog.LJLJLLL;
        if (c29432Bgq != null) {
            ActivityC45651qj activityC45651qj = liveMicRoomInfoDialog.LJLJLJ;
            int followStatus = (int) this.LJLIL.getFollowInfo().getFollowStatus();
            long id = this.LJLJI.getId();
            Room room = this.LJLILLLLZI.LJLJL;
            if (room != null) {
                j = room.getId();
            } else {
                j = 0;
            }
            C73318Sq2 c73318Sq2 = c29432Bgq.LJLIL;
            InterfaceC29405BgP LIZIZ = B83.LIZ().LIZIZ();
            C29359Bff c29359Bff = new C29359Bff();
            c29359Bff.LIZJ = activityC45651qj;
            c29359Bff.LIZIZ(id);
            c29359Bff.LIZIZ = followStatus;
            c29359Bff.LIZLLL = j;
            c73318Sq2.LIZ(((C29374Bfu) LIZIZ).LJIJJ(new C29360Bfg(c29359Bff)).LJJJLIIL(new AfS57S0100000_5(c29432Bgq, SubscriptionIconHideTextMinimumDimensionSetting.DEFAULT), new AfS57S0100000_5(c29432Bgq, 391)));
        }
        C29291BeZ c29291BeZ = this.LJLILLLLZI.LJLL;
        if (c29291BeZ != null) {
            long id2 = this.LJLIL.getId();
            int i2 = this.LJLILLLLZI.LJLLL;
            if (B5G.LIZIZ().LJI == this.LJLIL.getId()) {
                z = true;
            } else {
                z = false;
            }
            c29291BeZ.LIZ(false, id2, i2, z, this.LJLIL.getFollowInfo().getFollowStatus(), this.LJLILLLLZI.LJLLJ);
        }
        LiveMicRoomInfoDialog liveMicRoomInfoDialog2 = this.LJLILLLLZI;
        Room room2 = liveMicRoomInfoDialog2.LJLJL;
        if (room2 != null) {
            User user = this.LJLIL;
            if (C28835BTj.LJFF(liveMicRoomInfoDialog2.dataChannel) && room2.getOwner() != null && user.getId() == room2.getOwner().getId()) {
                HashMap hashMap = new HashMap();
                hashMap.put("anchor_id", String.valueOf(room2.getOwner().getId()));
                hashMap.put("room_id", String.valueOf(room2.getId()));
                C28835BTj.LIZ("live_ad", "unfollow", null, hashMap);
            }
        }
    }
}
