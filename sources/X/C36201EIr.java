package X;

/* renamed from: X.EIr, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C36201EIr<T> implements InterfaceC64592gB {
    public final /* synthetic */ long LJLIL;
    public final /* synthetic */ long LJLILLLLZI;

    public C36201EIr(long j, long j2) {
        this.LJLIL = j;
        this.LJLILLLLZI = j2;
    }

    @Override // X.InterfaceC64592gB
    public final void accept(Object obj) {
        Throwable th = (Throwable) obj;
        long j = this.LJLIL;
        long j2 = this.LJLILLLLZI;
        C36203EIt.LJ = false;
        InterfaceC36202EIs interfaceC36202EIs = (InterfaceC36202EIs) C36203EIt.LJFF.getValue();
        if (interfaceC36202EIs != null) {
            interfaceC36202EIs.LIZ(j, j2, th);
        }
        C36207EIx.LIZ().Bt0(th, C36203EIt.LIZIZ);
    }
}
