package X;

/* renamed from: X.Tqg, reason: case insensitive filesystem */
/* loaded from: classes14.dex */
public final class C75906Tqg implements InterfaceC75706TnS<OLU> {
    @Override // X.InterfaceC75706TnS
    public final void LJFF(OFV ofv) {
        B5G.LIZIZ().LJJJ = new C75648TmW("invitee");
    }

    @Override // X.InterfaceC75706TnS
    public final void LIZLLL(C76003TsF c76003TsF, Throwable th) {
        if (th != null) {
            BPP.LJ(C15380j0.LIZLLL(), th);
            C75516TkO.LIZ.LIZIZ(702, "reply multi_cohost invitation failed", th, null);
        }
    }
}
