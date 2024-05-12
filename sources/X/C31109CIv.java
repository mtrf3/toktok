package X;

/* renamed from: X.CIv, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C31109CIv<T> implements InterfaceC64592gB {
    public final /* synthetic */ int LJLIL;
    public final /* synthetic */ long LJLILLLLZI;

    public C31109CIv(int i, long j) {
        this.LJLIL = i;
        this.LJLILLLLZI = j;
    }

    @Override // X.InterfaceC64592gB
    public final void accept(Object obj) {
        C31106CIs.LJIIIIZZ.put(Integer.valueOf(this.LJLIL), EnumC31110CIw.LOAD_FAILED);
        C30929CBx.LJIILIIL(this.LJLILLLLZI, (Throwable) obj);
    }
}
