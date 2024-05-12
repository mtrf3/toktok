package X;

import com.bytedance.android.livesdkapi.depend.model.live.Room;
import com.bytedance.ies.sdk.datachannel.DataChannelGlobal;
import kotlin.jvm.internal.o;

/* renamed from: X.UGn, reason: case insensitive filesystem */
/* loaded from: classes14.dex */
public final class C76913UGn implements InterfaceC77524Ubg {
    public final /* synthetic */ UI8 LIZ;

    @Override // X.InterfaceC77524Ubg
    public final void LIZJ() {
    }

    @Override // X.InterfaceC77524Ubg
    public final void LIZ() {
        C77541Ubx.LJIILIIL("contact_us", this.LIZ);
    }

    @Override // X.InterfaceC77524Ubg
    public final void LIZIZ() {
        C77541Ubx.LJIILIIL("cancel", this.LIZ);
    }

    @Override // X.InterfaceC77524Ubg
    public final void onShow() {
        boolean z;
        UI8 config = this.LIZ;
        o.LJIIIZ(config, "config");
        String LJII = C77541Ubx.LJII(config);
        Room room = (Room) DataChannelGlobal.LJLJJI.mv0(C29044Baa.class);
        if (room != null && ((C29374Bfu) B83.LIZ().LIZIZ()).getCurrentUserId() == room.getOwnerUserId()) {
            z = true;
        } else {
            z = false;
        }
        BZI LIZ = C28787BRn.LIZ("livesdk_recharge_ban_popup_show");
        LIZ.LJIIZILJ();
        LIZ.LJIJJ(String.valueOf(((C29374Bfu) B83.LIZ().LIZIZ()).getCurrentUserId()), "user_id");
        LIZ.LJIJJ(Boolean.valueOf(z), "is_anchor");
        C06490Nh.LIZLLL(LIZ, LJII, "popup_entrance", "gpppa", "ban_reason");
    }

    public C76913UGn(UI8 ui8) {
        this.LIZ = ui8;
    }
}
