package X;

import com.bytedance.android.livesdkapi.depend.model.live.Room;

/* renamed from: X.ToC, reason: case insensitive filesystem */
/* loaded from: classes14.dex */
public final class C75752ToC implements InterfaceC75706TnS<OLV> {
    public final /* synthetic */ Room LJLIL;
    public final /* synthetic */ InterfaceC75754ToE LJLILLLLZI;

    @Override // X.InterfaceC75706TnS
    public final void LJFF(OFV ofv) {
        C75642TmQ.LIZ.LJJJJZ(this.LJLIL, "apply", null);
        this.LJLILLLLZI.LIZ();
    }

    public C75752ToC(Room room, InterfaceC75754ToE interfaceC75754ToE) {
        this.LJLIL = room;
        this.LJLILLLLZI = interfaceC75754ToE;
    }

    @Override // X.InterfaceC75706TnS
    public final void LIZLLL(C76003TsF c76003TsF, Throwable th) {
        this.LJLILLLLZI.LIZIZ(th);
    }
}