package X;

import fjb.a;

@InterfaceC65848Psq(c = "com.ss.android.ugc.aweme.search.performance.core.utils.SearchMixFeedPrefetcher$delayToCheckPressPrefetch$1", f = "SearchMixFeedPrefetcher.kt", l = {129}, m = "invokeSuspend")
/* renamed from: X.Jiu, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C49944Jiu extends AbstractC65782Prm implements InterfaceC88471Ynr<InterfaceC70422pa, InterfaceC67352kd<? super C76800UCe>, Object> {
    public int LJLIL;
    public final /* synthetic */ long LJLILLLLZI;
    public final /* synthetic */ C49915JiR LJLJI;
    public final /* synthetic */ C3CL LJLJJI;
    public final /* synthetic */ long LJLJJL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C49944Jiu(long j, C49915JiR c49915JiR, C3CL c3cl, long j2, InterfaceC67352kd<? super C49944Jiu> interfaceC67352kd) {
        super(2, interfaceC67352kd);
        this.LJLILLLLZI = j;
        this.LJLJI = c49915JiR;
        this.LJLJJI = c3cl;
        this.LJLJJL = j2;
    }

    @Override // fjb.a
    public final InterfaceC67352kd<C76800UCe> create(Object obj, InterfaceC67352kd<?> interfaceC67352kd) {
        return new C49944Jiu(this.LJLILLLLZI, this.LJLJI, this.LJLJJI, this.LJLJJL, interfaceC67352kd);
    }

    @Override // fjb.a
    public final Object invokeSuspend(Object obj) {
        EnumC58928NAu enumC58928NAu = EnumC58928NAu.COROUTINE_SUSPENDED;
        int i = this.LJLIL;
        try {
            if (i != 0) {
                if (i == 1) {
                    C141335gf.LIZJ(obj);
                } else {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            } else {
                C141335gf.LIZJ(obj);
                long j = this.LJLILLLLZI;
                C49943Jit c49943Jit = new C49943Jit(this.LJLJJL, this.LJLJI, this.LJLJJI, null);
                this.LJLIL = 1;
                if (C74209TAn.LIZIZ(j, c49943Jit, this) == enumC58928NAu) {
                    return enumC58928NAu;
                }
            }
        } catch (C74185T9p unused) {
            C49924Jia.LIZ(this.LJLJI);
            this.LJLJJI.LIZIZ(null);
        }
        return C76800UCe.LIZ;
    }

    @Override // X.InterfaceC88471Ynr
    public final Object invoke(InterfaceC70422pa interfaceC70422pa, InterfaceC67352kd<? super C76800UCe> interfaceC67352kd) {
        return ((a) create(interfaceC70422pa, interfaceC67352kd)).invokeSuspend(C76800UCe.LIZ);
    }
}
