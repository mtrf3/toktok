package Y;

import X.AbstractC29665Bkb;
import X.B83;
import X.BIR;
import X.BZI;
import X.C05490Jl;
import X.C276516r;
import X.C28433BDx;
import X.C28787BRn;
import X.C29374Bfu;
import X.C29536BiW;
import X.C29598BjW;
import X.C29656BkS;
import X.C30868C9o;
import X.C41071jL;
import X.InterfaceC29405BgP;
import X.InterfaceC64592gB;
import android.widget.CompoundButton;
import com.bytedance.android.live.base.model.user.User;
import com.bytedance.android.livesdk.chatroom.viewmodule.DecorationWrapperWidget;
import com.bytedance.android.livesdk.model.RoomSticker;
import com.bytedance.android.livesdk.moderator.ModeratorPermissionEditFragmentSheet;
import com.bytedance.android.livesdk.usercard.LiveProfileManageDialog;
import com.bytedance.android.livesdkapi.depend.model.live.Room;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import com.zhiliaoapp.musically.R;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.o;

/* loaded from: classes6.dex */
public class AfS17S0210000_5 implements InterfaceC64592gB {
    public final int $t;
    public Object l0;
    public Object l1;
    public boolean z2;

    @Override // X.InterfaceC64592gB
    public final void accept(Object obj) {
        switch (this.$t) {
            case 0:
                accept$0(this, obj);
                return;
            case 1:
                accept$1(this, obj);
                return;
            case 2:
                accept$2(this, obj);
                return;
            case 3:
                accept$3(this, obj);
                return;
            case 4:
                accept$4(this, obj);
                return;
            case 5:
                accept$5(this, obj);
                return;
            default:
                return;
        }
    }

    public static final void accept$0(AfS17S0210000_5 afS17S0210000_5, Object obj) {
        Boolean bool;
        Object obj2;
        if (afS17S0210000_5.z2) {
            List<AbstractC29665Bkb<?>> list = ((DecorationWrapperWidget) afS17S0210000_5.l0).LJLJL;
            RoomSticker roomSticker = (RoomSticker) afS17S0210000_5.l1;
            Iterator it = ((ArrayList) list).iterator();
            while (true) {
                bool = null;
                if (it.hasNext()) {
                    obj2 = it.next();
                    if (((AbstractC29665Bkb) obj2).LJLIL.id == roomSticker.id) {
                        break;
                    }
                } else {
                    obj2 = null;
                    break;
                }
            }
            AbstractC29665Bkb abstractC29665Bkb = (AbstractC29665Bkb) obj2;
            if (abstractC29665Bkb != null) {
                RoomSticker roomSticker2 = (RoomSticker) afS17S0210000_5.l1;
                if ((abstractC29665Bkb instanceof C29656BkS) && abstractC29665Bkb.LJLIL.type == 4) {
                    bool = Boolean.valueOf(C29536BiW.LIZ(roomSticker2, ((C29656BkS) abstractC29665Bkb).getContent()));
                }
            }
            C29598BjW.LJI(((DecorationWrapperWidget) afS17S0210000_5.l0).dataChannel, (RoomSticker) afS17S0210000_5.l1, bool);
        }
        int i = ((RoomSticker) afS17S0210000_5.l1).type;
        if (i != 4) {
            if (i != 5 && i != 6) {
                return;
            }
            ((DecorationWrapperWidget) afS17S0210000_5.l0).LJLJI = true;
            return;
        }
        ((DecorationWrapperWidget) afS17S0210000_5.l0).LJLJJI = true;
    }

    public static final void accept$1(AfS17S0210000_5 afS17S0210000_5, Object obj) {
        Throwable th = (Throwable) obj;
        if ((th instanceof C276516r) && ((C276516r) th).getErrorCode() == 4002167) {
            ((CompoundButton) afS17S0210000_5.l0).setOnCheckedChangeListener(null);
            ((CompoundButton) afS17S0210000_5.l0).setChecked(false);
            ((CompoundButton) afS17S0210000_5.l0).setOnCheckedChangeListener(new IDCListenerS206S0100000_5((ModeratorPermissionEditFragmentSheet) afS17S0210000_5.l1, 16));
            C30868C9o.LIZJ(R.string.n29);
            return;
        }
        ((CompoundButton) afS17S0210000_5.l0).setOnCheckedChangeListener(null);
        ((CompoundButton) afS17S0210000_5.l0).setChecked(!afS17S0210000_5.z2);
        ((CompoundButton) afS17S0210000_5.l0).setOnCheckedChangeListener(new IDCListenerS206S0100000_5((ModeratorPermissionEditFragmentSheet) afS17S0210000_5.l1, 17));
        C30868C9o.LIZJ(R.string.mg2);
    }

    public static final void accept$2(AfS17S0210000_5 afS17S0210000_5, Object obj) {
        Boolean bool;
        Object obj2;
        if (afS17S0210000_5.z2) {
            List<AbstractC29665Bkb<?>> list = ((DecorationWrapperWidget) afS17S0210000_5.l0).LJLJL;
            RoomSticker roomSticker = (RoomSticker) afS17S0210000_5.l1;
            Iterator it = ((ArrayList) list).iterator();
            while (true) {
                bool = null;
                if (it.hasNext()) {
                    obj2 = it.next();
                    if (((AbstractC29665Bkb) obj2).LJLIL.id == roomSticker.id) {
                        break;
                    }
                } else {
                    obj2 = null;
                    break;
                }
            }
            AbstractC29665Bkb abstractC29665Bkb = (AbstractC29665Bkb) obj2;
            if (abstractC29665Bkb != null) {
                RoomSticker roomSticker2 = (RoomSticker) afS17S0210000_5.l1;
                if ((abstractC29665Bkb instanceof C29656BkS) && abstractC29665Bkb.LJLIL.type == 4) {
                    bool = Boolean.valueOf(C29536BiW.LIZ(roomSticker2, ((C29656BkS) abstractC29665Bkb).getContent()));
                }
            }
            DataChannel dataChannel = ((DecorationWrapperWidget) afS17S0210000_5.l0).dataChannel;
            RoomSticker roomSticker3 = (RoomSticker) afS17S0210000_5.l1;
            if (roomSticker3 != null && roomSticker3.type == 4) {
                BZI LIZ = C28787BRn.LIZ("livesdk_live_host_character_prop_effective_use");
                LIZ.LJIJJ(String.valueOf(roomSticker3.id), "prop_id");
                LIZ.LJIJJ(roomSticker3.name, "prop_name");
                LIZ.LJIJJ(Integer.valueOf(1 ^ (o.LJ(bool, Boolean.TRUE) ? 1 : 0)), "is_origin_words");
                LIZ.LJIJJ(Integer.valueOf(roomSticker3.LIZIZ ? 1 : 0), "is_remember");
                LIZ.LJIIJJI("live_take_detail");
                LIZ.LJIJJ(roomSticker3.LIZ, "resource_id");
                LIZ.LJIILLIIL(dataChannel);
                LIZ.LJJIIJZLJL();
            }
        }
    }

    public static final void accept$3(AfS17S0210000_5 afS17S0210000_5, Object obj) {
        String str;
        String str2;
        C05490Jl c05490Jl = (C05490Jl) obj;
        InterfaceC29405BgP LIZIZ = B83.LIZ().LIZIZ();
        if (LIZIZ != null && ((C29374Bfu) LIZIZ).getCurrentUserId() == ((Room) afS17S0210000_5.l0).getOwnerUserId()) {
            str = "anchor";
        } else {
            str = "admin";
        }
        BZI LIZ = C28787BRn.LIZ("livesdk_mute_click");
        LIZ.LJIILLIIL(((LiveProfileManageDialog) afS17S0210000_5.l1).dataChannel);
        LIZ.LJIJJ(Long.valueOf(c05490Jl.LIZ), "default_mute_set");
        User user = ((LiveProfileManageDialog) afS17S0210000_5.l1).LJLILLLLZI;
        if (user != null) {
            LIZ.LJIJJ(String.valueOf(user.getId()), "to_user_id");
            LIZ.LJIJJ("profile_card", "entry_point");
            LIZ.LJIJJ(Long.valueOf(((Room) afS17S0210000_5.l0).getOwnerUserId()), "anchor_id");
            LIZ.LJIJJ(Long.valueOf(((Room) afS17S0210000_5.l0).getId()), "room_id");
            LIZ.LJIJJ(str, "admin_type");
            if (afS17S0210000_5.z2) {
                str2 = "set";
            } else {
                str2 = "cancel";
            }
            LIZ.LJIJJ(str2, "action_type");
            LIZ.LJJIIJZLJL();
            return;
        }
        o.LJIJI("mUser");
        throw null;
    }

    public static final void accept$4(AfS17S0210000_5 afS17S0210000_5, Object obj) {
        C41071jL c41071jL = (C41071jL) afS17S0210000_5.l0;
        if (c41071jL != null) {
            c41071jL.setChecked(afS17S0210000_5.z2);
        }
        ((BIR) afS17S0210000_5.l1).LJIIIZ((C41071jL) afS17S0210000_5.l0, true, null);
        C30868C9o.LIZJ(R.string.mg2);
    }

    public static final void accept$5(AfS17S0210000_5 afS17S0210000_5, Object obj) {
        C41071jL c41071jL = (C41071jL) afS17S0210000_5.l0;
        if (c41071jL != null) {
            c41071jL.setChecked(!afS17S0210000_5.z2);
        }
        ((C28433BDx) afS17S0210000_5.l1).LIZLLL((C41071jL) afS17S0210000_5.l0, true, 2, null);
        C30868C9o.LIZJ(R.string.mg2);
    }

    public AfS17S0210000_5(C41071jL c41071jL, BIR bir, int i) {
        this.$t = i;
        this.l0 = c41071jL;
        this.z2 = true;
        this.l1 = bir;
    }

    public AfS17S0210000_5(DecorationWrapperWidget decorationWrapperWidget, RoomSticker roomSticker, int i) {
        this.$t = i;
        this.z2 = true;
        this.l0 = decorationWrapperWidget;
        this.l1 = roomSticker;
    }

    public AfS17S0210000_5(Object obj, Object obj2, boolean z, int i) {
        this.$t = i;
        this.l0 = obj;
        this.l1 = obj2;
        this.z2 = z;
    }
}
