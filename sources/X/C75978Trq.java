package X;

import com.bytedance.android.live.liveinteract.multihost.biz.link.contract.MultiCoHostInviteListContract$AbsView;
import com.bytedance.android.livesdkapi.depend.model.live.Room;

/* renamed from: X.Trq, reason: case insensitive filesystem */
/* loaded from: classes14.dex */
public final class C75978Trq implements InterfaceC75706TnS<OLV> {
    public final /* synthetic */ Room LJLIL;
    public final /* synthetic */ C75981Trt LJLILLLLZI;
    public final /* synthetic */ AbstractC75977Trp LJLJI;

    @Override // X.InterfaceC75706TnS
    public final void LJFF(OFV ofv) {
        C75642TmQ.LIZ.LJJJJZ(this.LJLIL, "invite", this.LJLILLLLZI.LJLJJI);
        MultiCoHostInviteListContract$AbsView multiCoHostInviteListContract$AbsView = (MultiCoHostInviteListContract$AbsView) this.LJLJI.LJLILLLLZI;
        if (multiCoHostInviteListContract$AbsView != null) {
            multiCoHostInviteListContract$AbsView.Hl();
        }
    }

    @Override // X.InterfaceC75706TnS
    public final void LIZLLL(C76003TsF c76003TsF, Throwable th) {
        if (th != null) {
            this.LJLJI.LJIIZILJ(this.LJLIL, 0, th);
            C75516TkO.LIZ.LIZIZ(113, "multi_cohost invite failed", th, null);
        }
        MultiCoHostInviteListContract$AbsView multiCoHostInviteListContract$AbsView = (MultiCoHostInviteListContract$AbsView) this.LJLJI.LJLILLLLZI;
        if (multiCoHostInviteListContract$AbsView != null) {
            multiCoHostInviteListContract$AbsView.Gl(th, this.LJLIL);
        }
    }

    public C75978Trq(Room room, C75981Trt c75981Trt, AbstractC75977Trp abstractC75977Trp) {
        this.LJLIL = room;
        this.LJLILLLLZI = c75981Trt;
        this.LJLJI = abstractC75977Trp;
    }
}
