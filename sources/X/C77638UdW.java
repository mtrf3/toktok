package X;

/* renamed from: X.UdW, reason: case insensitive filesystem */
/* loaded from: classes14.dex */
public final class C77638UdW<T> implements InterfaceC86003Zc {
    public final /* synthetic */ C77631UdP LJLIL;
    public final /* synthetic */ int LJLILLLLZI;
    public final /* synthetic */ long LJLJI;
    public final /* synthetic */ long LJLJJI;
    public final /* synthetic */ InterfaceC77685UeH LJLJJL;
    public final /* synthetic */ boolean LJLJJLL;

    public C77638UdW(C77631UdP c77631UdP, int i, long j, long j2, EnumC77641UdZ enumC77641UdZ, boolean z) {
        this.LJLIL = c77631UdP;
        this.LJLILLLLZI = i;
        this.LJLJI = j;
        this.LJLJJI = j2;
        this.LJLJJL = enumC77641UdZ;
        this.LJLJJLL = z;
    }

    @Override // X.InterfaceC86003Zc
    public final void subscribe(InterfaceC73573Su9<C77626UdK> interfaceC73573Su9) {
        interfaceC73573Su9.onNext(this.LJLIL.LJ(this.LJLILLLLZI, this.LJLJI, this.LJLJJI, this.LJLJJL, true, null, this.LJLJJLL));
        interfaceC73573Su9.onComplete();
    }
}
