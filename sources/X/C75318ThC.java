package X;

import com.bytedance.android.live.base.model.user.User;
import com.bytedance.android.live.liveinteract.platform.statemanager.iablility.ILinkStateAbility;
import com.bytedance.android.live.liveinteract.voicechat.main.common.FanTicketIconUrlChannel;
import com.bytedance.android.livesdk.model.message.linker.listchangemessage.LinkListUser;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import kotlin.jvm.internal.o;

/* renamed from: X.ThC, reason: case insensitive filesystem */
/* loaded from: classes14.dex */
public final class C75318ThC extends AbstractC75323ThH {
    public final C75320ThE LJIIL;

    @Override // X.AbstractC75323ThH
    public final String LJIIIIZZ() {
        return null;
    }

    @Override // X.AbstractC75323ThH
    public final String LJIIIZ() {
        TQ8 tq8;
        AbstractC74727TUl LIZ;
        DataChannel dataChannel = this.LIZ;
        if (dataChannel != null && (tq8 = (TQ8) C79004UzY.LJIL(dataChannel, TQ8.class)) != null && (LIZ = tq8.LIZ()) != null && LIZ.LIZLLL(((C29374Bfu) B83.LIZ().LIZIZ()).getCurrentUserId()) != null) {
            return "guest";
        }
        return "viewer";
    }

    @Override // X.AbstractC75323ThH
    public final User LJIIJ() {
        TQ8 tq8;
        AbstractC74727TUl LIZ;
        LinkListUser linkListUser;
        DataChannel dataChannel = this.LIZ;
        if (dataChannel != null && (tq8 = (TQ8) C79004UzY.LJIL(dataChannel, TQ8.class)) != null && (LIZ = tq8.LIZ()) != null && (linkListUser = (LinkListUser) LIZ.LJIIJJI(this.LIZIZ)) != null) {
            return linkListUser.user;
        }
        return null;
    }

    @Override // X.AbstractC75323ThH
    public final void LJIILIIL() {
        TRS trs;
        DataChannel dataChannel = this.LIZ;
        if (dataChannel != null && (trs = (TRS) C79004UzY.LJIL(dataChannel, TQ8.class)) != null) {
            trs.LIZLLL(this.LJIIL);
        }
        super.LJIILIIL();
    }

    @Override // X.AbstractC75323ThH
    public final void LJIIL(ILinkStateAbility iLinkStateAbility) {
        Object kv0;
        TQ8 tq8;
        super.LJIIL(iLinkStateAbility);
        DataChannel dataChannel = this.LIZ;
        if (dataChannel != null && (tq8 = (TQ8) C79004UzY.LJIL(dataChannel, TQ8.class)) != null) {
            tq8.LJ(this.LJIIL);
            this.LJIIL.V(tq8.LIZ());
        }
        DataChannel dataChannel2 = this.LIZ;
        if (dataChannel2 != null && (kv0 = dataChannel2.kv0(FanTicketIconUrlChannel.class)) != null) {
            AbstractC75323ThH.LJIILJJIL(LJII(), kv0);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C75318ThC(DataChannel dataChannel, String linkMicId) {
        super(dataChannel, linkMicId);
        o.LJIIIZ(linkMicId, "linkMicId");
        this.LJIIL = new C75320ThE(linkMicId, this);
    }
}
