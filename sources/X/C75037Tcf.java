package X;

import com.bytedance.android.live.liveinteract.multiguestv3.main.userinfo.anchor.MultiLiveAsAnchorListDialogV2;
import com.bytedance.android.livesdkapi.depend.model.live.Room;
import com.bytedance.ies.sdk.datachannel.DataChannelGlobal;
import java.util.HashMap;
import kotlin.jvm.internal.o;

/* renamed from: X.Tcf, reason: case insensitive filesystem */
/* loaded from: classes14.dex */
public final /* synthetic */ class C75037Tcf extends TBS implements InterfaceC65784Pro<C76800UCe> {
    public C75037Tcf(Object obj) {
        super(0, obj, MultiLiveAsAnchorListDialogV2.class, "onReminderInfoClick", "onReminderInfoClick()V", 0);
    }

    @Override // X.InterfaceC65784Pro
    public final C76800UCe invoke() {
        AbstractC74727TUl LIZ;
        Long LJIILIIL;
        String l;
        AbstractC74727TUl LIZ2;
        String LJIILLIIL;
        MultiLiveAsAnchorListDialogV2 multiLiveAsAnchorListDialogV2 = (MultiLiveAsAnchorListDialogV2) this.receiver;
        DialogC75067Td9 dialogC75067Td9 = (DialogC75067Td9) multiLiveAsAnchorListDialogV2.LLJILJILJ.getValue();
        InterfaceC31805Ce1 LJJJJJL = multiLiveAsAnchorListDialogV2.LJJJJJL();
        String str = null;
        if (LJJJJJL != null && (LIZ2 = LJJJJJL.LIZ()) != null && (LJIILLIIL = LIZ2.LJIILLIIL()) != null) {
            dialogC75067Td9.LJLJI = LJIILLIIL;
        } else {
            dialogC75067Td9.getClass();
        }
        C29306Beo.LJJJJIZL(dialogC75067Td9);
        String LJJJJ = multiLiveAsAnchorListDialogV2.LJJJJ();
        String tabName = multiLiveAsAnchorListDialogV2.LLILIL;
        C75060Td2 c75060Td2 = multiLiveAsAnchorListDialogV2.LLJIJIL;
        if (c75060Td2 == null || (l = Long.valueOf(c75060Td2.LJLILLLLZI).toString()) == null) {
            InterfaceC31805Ce1 LJJJJJL2 = multiLiveAsAnchorListDialogV2.LJJJJJL();
            if (LJJJJJL2 != null && (LIZ = LJJJJJL2.LIZ()) != null && (LJIILIIL = LIZ.LJIILIIL()) != null) {
                str = LJIILIIL.toString();
            }
        } else {
            str = l;
        }
        o.LJIIIZ(tabName, "tabName");
        if (o.LJ(C74824TYe.LJIIL, "selfie_window")) {
            C74824TYe.LJIIL = "";
            LJJJJ = "selfie_window";
        }
        HashMap LIZLLL = C73098SmU.LIZLLL();
        Room room = (Room) DataChannelGlobal.LJLJJI.mv0(C29044Baa.class);
        if (room != null) {
            String idStr = room.getIdStr();
            o.LJIIIIZZ(idStr, "room.idStr");
            LIZLLL.put("room_id", idStr);
            LIZLLL.put("anchor_id", String.valueOf(room.getOwnerUserId()));
        }
        LIZLLL.put("request_page", LJJJJ);
        LIZLLL.put("guest_connected_cnt", String.valueOf(C74838TYs.LJ().LJJ));
        LIZLLL.put("tab_name", tabName);
        if (str != null) {
            LIZLLL.put("guest_bonus", str);
        }
        C74824TYe.LJLL("livesdk_anchor_guest_bonus_info_popup_show", LIZLLL);
        return C76800UCe.LIZ;
    }
}
