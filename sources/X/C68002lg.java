package X;

import fjb.a;

@InterfaceC65848Psq(c = "com.ss.android.ugc.aweme.ecommercelive.business.common.task.PopCardShowTask$changeShowTime$2$1", f = "PopCardShowTask.kt", l = {101}, m = "invokeSuspend")
/* renamed from: X.2lg, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C68002lg extends AbstractC65782Prm implements InterfaceC88471Ynr<InterfaceC70422pa, InterfaceC67352kd<? super C76800UCe>, Object> {
    public int LJLIL;
    public /* synthetic */ Object LJLILLLLZI;
    public final /* synthetic */ long LJLJI;
    public final /* synthetic */ AbstractC74122vY LJLJJI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C68002lg(long j, AbstractC74122vY abstractC74122vY, InterfaceC67352kd<? super C68002lg> interfaceC67352kd) {
        super(2, interfaceC67352kd);
        this.LJLJI = j;
        this.LJLJJI = abstractC74122vY;
    }

    @Override // fjb.a
    public final InterfaceC67352kd<C76800UCe> create(Object obj, InterfaceC67352kd<?> interfaceC67352kd) {
        C68002lg c68002lg = new C68002lg(this.LJLJI, this.LJLJJI, interfaceC67352kd);
        c68002lg.LJLILLLLZI = obj;
        return c68002lg;
    }

    @Override // fjb.a
    public final Object invokeSuspend(Object obj) {
        InterfaceC70422pa interfaceC70422pa;
        EnumC58928NAu enumC58928NAu = EnumC58928NAu.COROUTINE_SUSPENDED;
        int i = this.LJLIL;
        if (i != 0) {
            if (i == 1) {
                interfaceC70422pa = (InterfaceC70422pa) this.LJLILLLLZI;
                C141335gf.LIZJ(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            C141335gf.LIZJ(obj);
            interfaceC70422pa = (InterfaceC70422pa) this.LJLILLLLZI;
            long j = this.LJLJI;
            this.LJLILLLLZI = interfaceC70422pa;
            this.LJLIL = 1;
            if (C1JD.LIZJ(j, this) == enumC58928NAu) {
                return enumC58928NAu;
            }
        }
        if (!C48841JEv.LJIILLIIL(interfaceC70422pa)) {
            return C76800UCe.LIZ;
        }
        this.LJLJJI.LIZIZ(1);
        return C76800UCe.LIZ;
    }

    @Override // X.InterfaceC88471Ynr
    public final Object invoke(InterfaceC70422pa interfaceC70422pa, InterfaceC67352kd<? super C76800UCe> interfaceC67352kd) {
        return ((a) create(interfaceC70422pa, interfaceC67352kd)).invokeSuspend(C76800UCe.LIZ);
    }
}
