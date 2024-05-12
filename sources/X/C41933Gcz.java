package X;

import fjb.a;

@InterfaceC65848Psq(c = "com.ss.android.ugc.aweme.tools.music.aichoosemusic.task.BaseAIMusicUploadFrameTask$cleanDirIfNeed$1", f = "BaseAIMusicUploadFrameTask.kt", l = {}, m = "invokeSuspend")
/* renamed from: X.Gcz, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C41933Gcz extends AbstractC65782Prm implements InterfaceC88471Ynr<InterfaceC70422pa, InterfaceC67352kd<? super C76800UCe>, Object> {
    public final /* synthetic */ AbstractC41925Gcr LJLIL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C41933Gcz(AbstractC41925Gcr abstractC41925Gcr, InterfaceC67352kd<? super C41933Gcz> interfaceC67352kd) {
        super(2, interfaceC67352kd);
        this.LJLIL = abstractC41925Gcr;
    }

    @Override // fjb.a
    public final InterfaceC67352kd<C76800UCe> create(Object obj, InterfaceC67352kd<?> interfaceC67352kd) {
        return new C41933Gcz(this.LJLIL, interfaceC67352kd);
    }

    @Override // fjb.a
    public final Object invokeSuspend(Object obj) {
        C141335gf.LIZJ(obj);
        C44687HgJ.LJIILLIIL(this.LJLIL.LIZLLL(), C41934Gd0.LJLIL);
        return C76800UCe.LIZ;
    }

    @Override // X.InterfaceC88471Ynr
    public final Object invoke(InterfaceC70422pa interfaceC70422pa, InterfaceC67352kd<? super C76800UCe> interfaceC67352kd) {
        return ((a) create(interfaceC70422pa, interfaceC67352kd)).invokeSuspend(C76800UCe.LIZ);
    }
}
