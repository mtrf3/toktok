package X;

/* renamed from: X.CtC, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C32746CtC<T> implements InterfaceC86003Zc {
    public final /* synthetic */ android.net.Uri LJLIL;
    public final /* synthetic */ long LJLILLLLZI;
    public final /* synthetic */ InterfaceC88472Yns<Boolean, C76800UCe> LJLJI;

    public C32746CtC(long j, android.net.Uri uri, InterfaceC88472Yns interfaceC88472Yns) {
        this.LJLIL = uri;
        this.LJLILLLLZI = j;
        this.LJLJI = interfaceC88472Yns;
    }

    @Override // X.InterfaceC86003Zc
    public final void subscribe(InterfaceC73573Su9<ZCF> interfaceC73573Su9) {
        T16.LIZ().LIZIZ(new RunnableC32745CtB(this.LJLIL, (C73433Srt) interfaceC73573Su9, this.LJLILLLLZI, this.LJLJI));
    }
}
