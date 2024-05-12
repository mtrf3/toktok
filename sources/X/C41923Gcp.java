package X;

import fjb.a;

@InterfaceC65848Psq(c = "com.ss.android.ugc.aweme.tools.music.aichoosemusic.task.BaseAIMusicUploadFrameTask$start$2$1$zipPathDefer$1", f = "BaseAIMusicUploadFrameTask.kt", l = {138}, m = "invokeSuspend")
/* renamed from: X.Gcp, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C41923Gcp extends AbstractC65782Prm implements InterfaceC88471Ynr<InterfaceC70422pa, InterfaceC67352kd<? super String>, Object> {
    public int LJLIL;
    public /* synthetic */ Object LJLILLLLZI;
    public final /* synthetic */ AbstractC41925Gcr LJLJI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C41923Gcp(AbstractC41925Gcr abstractC41925Gcr, InterfaceC67352kd<? super C41923Gcp> interfaceC67352kd) {
        super(2, interfaceC67352kd);
        this.LJLJI = abstractC41925Gcr;
    }

    @Override // fjb.a
    public final InterfaceC67352kd<C76800UCe> create(Object obj, InterfaceC67352kd<?> interfaceC67352kd) {
        C41923Gcp c41923Gcp = new C41923Gcp(this.LJLJI, interfaceC67352kd);
        c41923Gcp.LJLILLLLZI = obj;
        return c41923Gcp;
    }

    @Override // fjb.a
    public final Object invokeSuspend(Object obj) {
        EnumC58928NAu enumC58928NAu = EnumC58928NAu.COROUTINE_SUSPENDED;
        int i = this.LJLIL;
        if (i != 0) {
            if (i == 1) {
                C141335gf.LIZJ(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            C141335gf.LIZJ(obj);
            AbstractC41925Gcr abstractC41925Gcr = this.LJLJI;
            this.LJLIL = 1;
            obj = abstractC41925Gcr.LIZ(this);
            if (obj == enumC58928NAu) {
                return enumC58928NAu;
            }
        }
        return obj;
    }

    @Override // X.InterfaceC88471Ynr
    public final Object invoke(InterfaceC70422pa interfaceC70422pa, InterfaceC67352kd<? super String> interfaceC67352kd) {
        return ((a) create(interfaceC70422pa, interfaceC67352kd)).invokeSuspend(C76800UCe.LIZ);
    }
}
