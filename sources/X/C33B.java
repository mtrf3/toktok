package X;

import fjb.a;
import java.util.List;

@InterfaceC65848Psq(c = "com.ss.android.ugc.aweme.im.sdk.search.data.IMSearchDefaultRepository$updateRecentContactInner$1", f = "IMSearchDefaultRepository.kt", l = {223}, m = "invokeSuspend")
/* renamed from: X.33B, reason: invalid class name */
/* loaded from: classes2.dex */
public final class C33B extends AbstractC65782Prm implements InterfaceC88471Ynr<InterfaceC70422pa, InterfaceC67352kd<? super C76800UCe>, Object> {
    public int LJLIL;
    public final /* synthetic */ InterfaceC65784Pro<C76800UCe> LJLILLLLZI;
    public final /* synthetic */ C33A LJLJI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C33B(InterfaceC65784Pro<C76800UCe> interfaceC65784Pro, C33A c33a, InterfaceC67352kd<? super C33B> interfaceC67352kd) {
        super(2, interfaceC67352kd);
        this.LJLILLLLZI = interfaceC65784Pro;
        this.LJLJI = c33a;
    }

    @Override // fjb.a
    public final InterfaceC67352kd<C76800UCe> create(Object obj, InterfaceC67352kd<?> interfaceC67352kd) {
        return new C33B(this.LJLILLLLZI, this.LJLJI, interfaceC67352kd);
    }

    @Override // fjb.a
    public final Object invokeSuspend(Object obj) {
        int i;
        EnumC58928NAu enumC58928NAu = EnumC58928NAu.COROUTINE_SUSPENDED;
        int i2 = this.LJLIL;
        if (i2 != 0) {
            if (i2 == 1) {
                C141335gf.LIZJ(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            C141335gf.LIZJ(obj);
            this.LJLILLLLZI.invoke();
            AnonymousClass336 LIZIZ = this.LJLJI.LIZIZ.LIZIZ();
            boolean z = LIZIZ.LJLIL;
            List<InterfaceC57784Mm4> list = LIZIZ.LJLILLLLZI;
            C3BJ c3bj = (C3BJ) this.LJLJI.LJI.getValue();
            if (this.LJLJI.LJII) {
                i = 3;
            } else {
                i = -1;
            }
            C33C c33c = new C33C(i, z, list);
            this.LJLIL = 1;
            if (c3bj.emit(c33c, this) == enumC58928NAu) {
                return enumC58928NAu;
            }
        }
        return C76800UCe.LIZ;
    }

    @Override // X.InterfaceC88471Ynr
    public final Object invoke(InterfaceC70422pa interfaceC70422pa, InterfaceC67352kd<? super C76800UCe> interfaceC67352kd) {
        return ((a) create(interfaceC70422pa, interfaceC67352kd)).invokeSuspend(C76800UCe.LIZ);
    }
}
