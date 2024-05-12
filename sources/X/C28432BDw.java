package X;

import com.bytedance.android.live.base.model.user.User;
import com.bytedance.android.live.network.response.BaseResponse;
import com.bytedance.android.livesdk.model.RoomAuthStatus;
import com.bytedance.android.livesdkapi.depend.model.live.Room;
import com.zhiliaoapp.musically.R;

/* renamed from: X.BDw, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C28432BDw<T> implements InterfaceC64592gB {
    public final /* synthetic */ Room LJLIL;
    public final /* synthetic */ boolean LJLILLLLZI;
    public final /* synthetic */ C28433BDx LJLJI;
    public final /* synthetic */ String LJLJJI;
    public final /* synthetic */ C41071jL LJLJJL;

    public C28432BDw(Room room, boolean z, C28433BDx c28433BDx, String str, C41071jL c41071jL) {
        this.LJLIL = room;
        this.LJLILLLLZI = z;
        this.LJLJI = c28433BDx;
        this.LJLJJI = str;
        this.LJLJJL = c41071jL;
    }

    @Override // X.InterfaceC64592gB
    public final void accept(Object obj) {
        Long l;
        Long l2;
        User owner;
        RoomAuthStatus roomAuthStatus;
        Long l3 = null;
        if (((BaseResponse) obj).statusCode == 0) {
            Room room = this.LJLIL;
            if (room != null && (roomAuthStatus = room.getRoomAuthStatus()) != null) {
                roomAuthStatus.chatSubOnly = this.LJLILLLLZI;
            }
            C29232Bdc.LJIJ(this.LJLILLLLZI);
            C28433BDx c28433BDx = this.LJLJI;
            String str = this.LJLJJI;
            Room room2 = this.LJLIL;
            c28433BDx.getClass();
            BZI LIZ = C28787BRn.LIZ("livesdk_sub_only_chat_button_click");
            LIZ.LJIJJ(str, "click_position");
            if (room2 != null) {
                l = Long.valueOf(room2.getId());
            } else {
                l = null;
            }
            LIZ.LJIJJ(l, "room_id");
            if (room2 != null && (owner = room2.getOwner()) != null) {
                l2 = Long.valueOf(owner.getId());
            } else {
                l2 = null;
            }
            LIZ.LJIJJ(l2, "anchor_id");
            LIZ.LJJIIJZLJL();
            C28433BDx c28433BDx2 = this.LJLJI;
            Room room3 = this.LJLIL;
            boolean z = this.LJLILLLLZI;
            c28433BDx2.getClass();
            BZI LIZ2 = C28787BRn.LIZ("livesdk_subscription_sub_only_set_status");
            if (room3 != null) {
                l3 = Long.valueOf(room3.getId());
            }
            LIZ2.LJIJJ(l3, "room_id");
            LIZ2.LJIJJ(Integer.valueOf(z ? 1 : 0), "status");
            LIZ2.LJJIIJZLJL();
            return;
        }
        C41071jL c41071jL = this.LJLJJL;
        if (c41071jL != null) {
            c41071jL.setChecked(!this.LJLILLLLZI);
        }
        this.LJLJI.LIZLLL(this.LJLJJL, true, 2, null);
        C30868C9o.LIZJ(R.string.mg2);
    }
}
