package X;

import fjb.a;

@InterfaceC65848Psq(c = "com.ss.android.ugc.aweme.tools.music.aichoosemusic.task.BaseAIMusicUploadFrameTask$start$2", f = "BaseAIMusicUploadFrameTask.kt", l = {}, m = "invokeSuspend")
/* renamed from: X.Gcq, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C41924Gcq extends AbstractC65782Prm implements InterfaceC88471Ynr<InterfaceC70422pa, InterfaceC67352kd<? super C76800UCe>, Object> {
    public /* synthetic */ Object LJLIL;
    public final /* synthetic */ AbstractC41925Gcr LJLILLLLZI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C41924Gcq(AbstractC41925Gcr abstractC41925Gcr, InterfaceC67352kd<? super C41924Gcq> interfaceC67352kd) {
        super(2, interfaceC67352kd);
        this.LJLILLLLZI = abstractC41925Gcr;
    }

    @Override // fjb.a
    public final InterfaceC67352kd<C76800UCe> create(Object obj, InterfaceC67352kd<?> interfaceC67352kd) {
        C41924Gcq c41924Gcq = new C41924Gcq(this.LJLILLLLZI, interfaceC67352kd);
        c41924Gcq.LJLIL = obj;
        return c41924Gcq;
    }

    @Override // fjb.a
    public final Object invokeSuspend(Object obj) {
        C141335gf.LIZJ(obj);
        InterfaceC70422pa interfaceC70422pa = (InterfaceC70422pa) this.LJLIL;
        AbstractC41925Gcr abstractC41925Gcr = this.LJLILLLLZI;
        abstractC41925Gcr.LJ = XKX.LIZLLL(interfaceC70422pa, null, null, new H0N(abstractC41925Gcr, null), 3);
        return C76800UCe.LIZ;
    }

    @Override // X.InterfaceC88471Ynr
    public final Object invoke(InterfaceC70422pa interfaceC70422pa, InterfaceC67352kd<? super C76800UCe> interfaceC67352kd) {
        return ((a) create(interfaceC70422pa, interfaceC67352kd)).invokeSuspend(C76800UCe.LIZ);
    }
}
