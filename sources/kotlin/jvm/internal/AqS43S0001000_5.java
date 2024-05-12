package kotlin.jvm.internal;

import X.AbstractC65781Prl;
import X.B83;
import X.BZI;
import X.C28787BRn;
import X.C29044Baa;
import X.C29374Bfu;
import X.C29800Bmm;
import X.C76800UCe;
import X.CN1;
import X.InterfaceC65784Pro;
import X.UFE;
import com.bytedance.android.livesdk.api.revenue.level.IUserLevelService;
import com.bytedance.android.livesdkapi.depend.model.live.Room;
import com.bytedance.ies.sdk.datachannel.DataChannelGlobal;

/* loaded from: classes6.dex */
public class AqS43S0001000_5 extends AbstractC65781Prl implements InterfaceC65784Pro {
    public final int $t;
    public int i0;

    @Override // X.InterfaceC65784Pro
    public final Object invoke() {
        switch (this.$t) {
            case 0:
                return invoke$0(this);
            case 1:
                return invoke$1(this);
            case 2:
                return invoke$2(this);
            case 3:
                return invoke$3(this);
            case 4:
                return invoke$4(this);
            default:
                return null;
        }
    }

    public static final Object invoke$0(AqS43S0001000_5 aqS43S0001000_5) {
        long j;
        int i;
        Room room = (Room) DataChannelGlobal.LJLJJI.mv0(C29044Baa.class);
        long j2 = 0;
        if (room != null) {
            j = room.getId();
            if (room.getOwner() != null) {
                j2 = room.getOwner().getId();
            }
        } else {
            j = 0;
        }
        long currentUserId = ((C29374Bfu) B83.LIZ().LIZIZ()).getCurrentUserId();
        C29800Bmm gr = ((IUserLevelService) CN1.LIZ(IUserLevelService.class)).gr();
        BZI LIZ = C28787BRn.LIZ("livesdk_panel_tab_reddot_show");
        LIZ.LJIIZILJ();
        LIZ.LJIJJ(Long.valueOf(j), "room_id");
        LIZ.LJIJJ(Long.valueOf(j2), "anchor_id");
        LIZ.LJIJJ(Long.valueOf(currentUserId), "user_id");
        if (gr != null) {
            i = gr.LIZ;
        } else {
            i = 0;
        }
        LIZ.LJIJJ(Integer.valueOf(i), "user_level");
        UFE.LIZIZ(aqS43S0001000_5.i0, LIZ, "tab_id");
        return C76800UCe.LIZ;
    }

    public static final Object invoke$1(AqS43S0001000_5 aqS43S0001000_5) {
        int i = aqS43S0001000_5.i0;
        boolean z = true;
        if (1 > i || i >= 4) {
            z = false;
        }
        return Boolean.valueOf(z);
    }

    public static final Object invoke$2(AqS43S0001000_5 aqS43S0001000_5) {
        int i = aqS43S0001000_5.i0;
        boolean z = true;
        if (1 > i || i >= 4) {
            z = false;
        }
        return Boolean.valueOf(z);
    }

    public static final Object invoke$3(AqS43S0001000_5 aqS43S0001000_5) {
        boolean z;
        if (aqS43S0001000_5.i0 == 0) {
            z = true;
        } else {
            z = false;
        }
        return Boolean.valueOf(z);
    }

    public static final Object invoke$4(AqS43S0001000_5 aqS43S0001000_5) {
        boolean z;
        if (aqS43S0001000_5.i0 == 0) {
            z = true;
        } else {
            z = false;
        }
        return Boolean.valueOf(z);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AqS43S0001000_5(int i, int i2) {
        super(0);
        this.$t = i2;
        this.i0 = i;
    }
}
