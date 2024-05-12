package X;

import com.bytedance.android.live.base.model.user.User;
import com.bytedance.android.live.liveinteract.platform.statemanager.iablility.ILinkStateAbility;
import com.bytedance.android.livesdk.chatroom.model.interact.LinkPlayerInfo;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import kotlin.jvm.internal.o;

/* renamed from: X.ThG, reason: case insensitive filesystem */
/* loaded from: classes14.dex */
public final class C75322ThG extends AbstractC75323ThH {
    public final C75321ThF LJIIL;

    @Override // X.AbstractC75323ThH
    public final String LJIIIZ() {
        return "anchor";
    }

    @Override // X.AbstractC75323ThH
    public final User LJIIJ() {
        InterfaceC31805Ce1 interfaceC31805Ce1;
        AbstractC74727TUl LIZ;
        LinkPlayerInfo linkPlayerInfo;
        DataChannel dataChannel = this.LIZ;
        if (dataChannel != null && (interfaceC31805Ce1 = (InterfaceC31805Ce1) C79004UzY.LJIL(dataChannel, InterfaceC31805Ce1.class)) != null && (LIZ = interfaceC31805Ce1.LIZ()) != null && (linkPlayerInfo = (LinkPlayerInfo) LIZ.LJIIJJI(this.LIZIZ)) != null) {
            return linkPlayerInfo.mUser;
        }
        return null;
    }

    @Override // X.AbstractC75323ThH
    public final void LJIILIIL() {
        TRS trs;
        DataChannel dataChannel = this.LIZ;
        if (dataChannel != null && (trs = (TRS) C79004UzY.LJIL(dataChannel, InterfaceC31805Ce1.class)) != null) {
            trs.LIZLLL(this.LJIIL);
        }
        super.LJIILIIL();
    }

    @Override // X.AbstractC75323ThH
    public final String LJIIIIZZ() {
        TRS trs;
        C75330ThO value = LJFF().getValue();
        if (value == null) {
            return null;
        }
        long j = value.LJLIL;
        DataChannel dataChannel = this.LIZ;
        if (dataChannel == null || (trs = (TRS) C79004UzY.LJIL(dataChannel, InterfaceC31805Ce1.class)) == null) {
            return null;
        }
        return trs.LIZIZ(j);
    }

    @Override // X.AbstractC75323ThH
    public final void LJIIL(ILinkStateAbility iLinkStateAbility) {
        InterfaceC31805Ce1 interfaceC31805Ce1;
        super.LJIIL(iLinkStateAbility);
        DataChannel dataChannel = this.LIZ;
        if (dataChannel != null && (interfaceC31805Ce1 = (InterfaceC31805Ce1) C79004UzY.LJIL(dataChannel, InterfaceC31805Ce1.class)) != null) {
            interfaceC31805Ce1.LJ(this.LJIIL);
            this.LJIIL.LLILII(interfaceC31805Ce1.LIZ(), 0);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C75322ThG(DataChannel dataChannel, String linkMicId) {
        super(dataChannel, linkMicId);
        o.LJIIIZ(linkMicId, "linkMicId");
        this.LJIIL = new C75321ThF(linkMicId, this);
    }
}
