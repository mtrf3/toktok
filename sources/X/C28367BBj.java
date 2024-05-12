package X;

import com.bytedance.android.live.base.model.user.User;
import com.bytedance.android.live.design.app.LiveDialog;
import com.bytedance.android.livesdkapi.depend.model.live.Room;

/* renamed from: X.BBj, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C28367BBj implements C0K7 {
    public final /* synthetic */ C41071jL LJLIL;
    public final /* synthetic */ Room LJLILLLLZI;
    public final /* synthetic */ String LJLJI;
    public final /* synthetic */ InterfaceC65784Pro<C76800UCe> LJLJJI;

    public C28367BBj(C41071jL c41071jL, Room room, String str, BIT bit) {
        this.LJLIL = c41071jL;
        this.LJLILLLLZI = room;
        this.LJLJI = str;
        this.LJLJJI = bit;
    }

    @Override // X.C0K7
    public final void LJIILLIIL(LiveDialog liveDialog) {
        Long l;
        User owner;
        C41071jL c41071jL = this.LJLIL;
        if (c41071jL != null) {
            c41071jL.setChecked(true);
        }
        InterfaceC30442Bx8.U2.LIZJ(Boolean.TRUE);
        liveDialog.dismiss();
        BZI LIZ = C28787BRn.LIZ("livesdk_sub_only_live_longer_preview_popup_click");
        Room room = this.LJLILLLLZI;
        if (room != null && (owner = room.getOwner()) != null) {
            l = Long.valueOf(owner.getId());
        } else {
            l = null;
        }
        LIZ.LJIJJ(l, "anchor_id");
        C06490Nh.LIZLLL(LIZ, this.LJLJI, "click_position", "confirm", "click_type");
        this.LJLJJI.invoke();
    }
}
