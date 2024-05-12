package X;

import com.bytedance.android.livesdkapi.depend.model.live.Room;

/* renamed from: X.Trr, reason: case insensitive filesystem */
/* loaded from: classes14.dex */
public final class C75979Trr implements InterfaceC75706TnS<OLV> {
    public final /* synthetic */ Room LJLIL;
    public final /* synthetic */ C75981Trt LJLILLLLZI;
    public final /* synthetic */ AbstractC75977Trp LJLJI;

    @Override // X.InterfaceC75706TnS
    public final void LJFF(OFV ofv) {
        C75642TmQ.LIZ.LJJJJZ(this.LJLIL, "apply", this.LJLILLLLZI.LJLJJI);
    }

    @Override // X.InterfaceC75706TnS
    public final void LIZLLL(C76003TsF c76003TsF, Throwable th) {
        if (th != null) {
            this.LJLJI.LJIIZILJ(this.LJLIL, 1, th);
            C75516TkO.LIZ.LIZIZ(201, "apply multi_cohost link mic failed", th, null);
        }
    }

    public C75979Trr(Room room, C75981Trt c75981Trt, AbstractC75977Trp abstractC75977Trp) {
        this.LJLIL = room;
        this.LJLILLLLZI = c75981Trt;
        this.LJLJI = abstractC75977Trp;
    }
}
