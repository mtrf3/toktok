package X;

import android.text.TextUtils;
import com.bytedance.android.live.liveinteract.api.dataholder.LinkCrossRoomDataHolder;
import com.bytedance.android.livesdk.LiveRoomFragment;
import com.bytedance.android.livesdk.liveroom.RoomListener;
import com.bytedance.android.livesdk.livesetting.performance.BuriedFieldReductionSetting;

/* loaded from: classes6.dex */
public final class B5F implements B4G {
    public final /* synthetic */ RoomListener LIZ;

    public B5F(RoomListener roomListener) {
        this.LIZ = roomListener;
    }

    public final void LIZ(String str) {
        ActivityC45651qj mo49getActivity;
        C28151B3b.LIZ().LIZIZ();
        LinkCrossRoomDataHolder linkCrossRoomDataHolder = LinkCrossRoomDataHolder.LJLILLLLZI;
        if (linkCrossRoomDataHolder != null) {
            linkCrossRoomDataHolder.LJII("LivePlayActivity_Destory");
        }
        LinkCrossRoomDataHolder linkCrossRoomDataHolder2 = LinkCrossRoomDataHolder.LJLILLLLZI;
        if (linkCrossRoomDataHolder2 != null) {
            linkCrossRoomDataHolder2.LIZIZ = null;
        }
        LinkCrossRoomDataHolder.LJLILLLLZI = null;
        this.LIZ.trySendExitPosition(str);
        this.LIZ.trySendRoomLists(str);
        LiveRoomFragment liveRoomFragment = this.LIZ.fragment;
        if (liveRoomFragment != null && (mo49getActivity = liveRoomFragment.mo49getActivity()) != null) {
            B5S.LIZIZ("exit_room_container");
            mo49getActivity.finish();
        }
        BZI LIZ = C28787BRn.LIZ("livesdk_live_leave");
        if (TextUtils.isEmpty(str)) {
            str = "draw";
        }
        LIZ.LJIJJ(str, "leave_type");
        if (!BuriedFieldReductionSetting.INSTANCE.isBuriedField(LIZ.LJIILL())) {
            LIZ.LJIIZILJ();
            LIZ.LJJIIJZLJL();
            return;
        }
        LIZ.LJJIJ();
        LIZ.LJI();
        LIZ.LJIJJ(BJM.LJIILIIL(), "request_id");
        LIZ.LJIJJ(BJM.LIZLLL(), "action_type");
        LIZ.LJIJJ(BJM.LJIJ(), "video_id");
        LIZ.LJIJJ(BJM.LJIIJJI(), "log_pb");
        LIZ.LJJIIZI();
    }
}
