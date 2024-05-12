package X;

import com.bytedance.android.livesdk.comp.api.linkcore.model.CoHostInviteDetailedExtra;
import com.bytedance.android.livesdkapi.depend.model.live.Room;
import com.bytedance.mt.protector.impl.GsonProtectorUtils;

/* renamed from: X.ToB, reason: case insensitive filesystem */
/* loaded from: classes14.dex */
public final class C75751ToB implements InterfaceC75706TnS<OLV> {
    public final /* synthetic */ Room LJLIL;
    public final /* synthetic */ InterfaceC75754ToE LJLILLLLZI;

    @Override // X.InterfaceC75706TnS
    public final void LJFF(OFV ofv) {
        C75642TmQ.LIZ.LJJJJZ(this.LJLIL, "invite", null);
        this.LJLILLLLZI.LIZ();
    }

    public C75751ToB(Room room, InterfaceC75754ToE interfaceC75754ToE) {
        this.LJLIL = room;
        this.LJLILLLLZI = interfaceC75754ToE;
    }

    @Override // X.InterfaceC75706TnS
    public final void LIZLLL(C76003TsF c76003TsF, Throwable th) {
        int i;
        if (th instanceof C29401Dk) {
            C29401Dk c29401Dk = (C29401Dk) th;
            CoHostInviteDetailedExtra coHostInviteDetailedExtra = (CoHostInviteDetailedExtra) GsonProtectorUtils.fromJson(C09650Zl.LIZIZ, c29401Dk.getExtra(), CoHostInviteDetailedExtra.class);
            if (coHostInviteDetailedExtra == null || (i = coHostInviteDetailedExtra.inviteBlockReason) < 0) {
                i = -1;
            }
            if (c29401Dk.getErrorCode() == C75925Tqz.LJ.LJLJJI) {
                C75642TmQ.LJJIJL(i, ((C29374Bfu) B83.LIZ().LIZIZ()).getCurrentUserId(), this.LJLIL.getOwnerUserId());
            }
        }
        this.LJLILLLLZI.LIZIZ(th);
    }
}
