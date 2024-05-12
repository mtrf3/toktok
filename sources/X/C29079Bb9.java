package X;

import com.bytedance.android.live.base.model.user.User;
import com.bytedance.android.live.share.IShareService;
import com.bytedance.android.livesdk.dataChannel.RoomUserChannel;
import com.bytedance.android.livesdkapi.depend.model.live.Room;
import com.bytedance.android.livesdkapi.host.IHostAppContext;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import com.bytedance.ies.sdk.datachannel.DataChannelGlobal;
import kotlin.jvm.internal.o;

/* renamed from: X.Bb9, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C29079Bb9 extends V8Q implements InterfaceC75136TeG {
    public final InterfaceC29081BbB LJLILLLLZI;
    public final DataChannel LJLJI;

    @Override // X.V8Q
    public final void LIZJ() {
        throw null;
    }

    @Override // X.InterfaceC75136TeG
    public final void LIZIZ() {
        String str;
        boolean z;
        String str2;
        this.LJLILLLLZI.dismiss();
        Room room = (Room) DataChannelGlobal.LJLJJI.mv0(C29044Baa.class);
        if (room == null) {
            return;
        }
        DataChannel dataChannel = this.LJLJI;
        User user = null;
        if (dataChannel != null) {
            str = (String) dataChannel.kv0(C28388BCe.class);
        } else {
            str = null;
        }
        C29929Bor c29929Bor = new C29929Bor(room);
        if (room.getOwner() != null) {
            if (((IHostAppContext) CN1.LIZ(IHostAppContext.class)).isInMusicallyRegion()) {
                str2 = "h5_m";
            } else {
                str2 = "h5_t";
            }
            StringBuilder LIZ = X1D.LIZ();
            LIZ.append("www.tiktok.com/@");
            LIZ.append(C05170If.LJ(room.getOwner()));
            LIZ.append("/live");
            LIZ.append(str2);
            LIZ.append("&_r=1");
            c29929Bor.LJIIJ = X1D.LIZIZ(LIZ);
        }
        c29929Bor.LIZLLL = ((C29374Bfu) B83.LIZ().LIZIZ()).getCurrentUserId();
        room.getId();
        room.getOwnerUserId();
        c29929Bor.LJIIZILJ = BJM.LJIILIIL();
        DataChannel dataChannel2 = this.LJLJI;
        if (dataChannel2 != null) {
            user = (User) dataChannel2.kv0(RoomUserChannel.class);
        }
        if (user != null && user.getUserAttr() != null && user.getUserAttr().isAdmin) {
            z = true;
        } else {
            z = false;
        }
        BNI un0 = ((IShareService) CN1.LIZ(IShareService.class)).un0();
        ActivityC45651qj LIZIZ = C29306Beo.LIZIZ(this.LJLILLLLZI.getContext());
        c29929Bor.LJIIL = room.getUserShareText();
        c29929Bor.LJIILJJIL = false;
        c29929Bor.LJIILL = z;
        c29929Bor.LJIILLIIL = EnumC30204BtI.SHARE.isRedDotShowing(this.LJLJI);
        c29929Bor.LJIJ = str;
        ((C29338BfK) un0).LIZ(LIZIZ, new C29930Bos(c29929Bor), new C29080BbA());
        C31951CgN.LIZIZ(this.LJLILLLLZI.getContext()).LIZJ(room.getId(), room.getIdStr());
    }

    public C29079Bb9(InterfaceC29081BbB view) {
        o.LJIIIZ(view, "view");
        this.LJLILLLLZI = view;
        this.LJLJI = view.LJIIL();
    }
}
