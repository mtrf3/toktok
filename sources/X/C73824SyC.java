package X;

/* JADX INFO: Add missing generic type declarations: [T] */
/* renamed from: X.SyC, reason: case insensitive filesystem */
/* loaded from: classes13.dex */
public final class C73824SyC<T> implements InterfaceC73463SsN<T> {
    public final C73616Suq LJLIL;
    public final InterfaceC73463SsN<? super T> LJLILLLLZI;
    public final /* synthetic */ C73823SyB LJLJI;

    @Override // X.InterfaceC73463SsN
    public final void onError(Throwable th) {
        long j;
        C73616Suq c73616Suq = this.LJLIL;
        C73823SyB c73823SyB = this.LJLJI;
        AbstractC73946T0k abstractC73946T0k = c73823SyB.LJLJJI;
        RunnableC73826SyE runnableC73826SyE = new RunnableC73826SyE(this, th);
        if (c73823SyB.LJLJJL) {
            j = c73823SyB.LJLILLLLZI;
        } else {
            j = 0;
        }
        c73616Suq.replace(abstractC73946T0k.LIZJ(runnableC73826SyE, j, c73823SyB.LJLJI));
    }

    @Override // X.InterfaceC73463SsN
    public final void onSubscribe(InterfaceC92693kP interfaceC92693kP) {
        this.LJLIL.replace(interfaceC92693kP);
    }

    @Override // X.InterfaceC73463SsN
    public final void onSuccess(T t) {
        C73616Suq c73616Suq = this.LJLIL;
        C73823SyB c73823SyB = this.LJLJI;
        c73616Suq.replace(c73823SyB.LJLJJI.LIZJ(new RunnableC73825SyD(this, t), c73823SyB.LJLILLLLZI, c73823SyB.LJLJI));
    }

    public C73824SyC(C73823SyB c73823SyB, C73616Suq c73616Suq, InterfaceC73463SsN<? super T> interfaceC73463SsN) {
        this.LJLJI = c73823SyB;
        this.LJLIL = c73616Suq;
        this.LJLILLLLZI = interfaceC73463SsN;
    }
}
