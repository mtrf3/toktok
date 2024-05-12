package X;

import fjb.a;

@InterfaceC65848Psq(c = "com.ss.android.ugc.aweme.newtoolbar.PartitionToolbarScene$dismissInitText$1", f = "PartitionToolbarScene.kt", l = {155, 156}, m = "invokeSuspend")
/* renamed from: X.2ih, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C66152ih extends AbstractC65782Prm implements InterfaceC88471Ynr<InterfaceC70422pa, InterfaceC67352kd<? super C76800UCe>, Object> {
    public int LJLIL;
    public final /* synthetic */ C82101WKb LJLILLLLZI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C66152ih(C82101WKb c82101WKb, InterfaceC67352kd<? super C66152ih> interfaceC67352kd) {
        super(2, interfaceC67352kd);
        this.LJLILLLLZI = c82101WKb;
    }

    @Override // fjb.a
    public final InterfaceC67352kd<C76800UCe> create(Object obj, InterfaceC67352kd<?> interfaceC67352kd) {
        return new C66152ih(this.LJLILLLLZI, interfaceC67352kd);
    }

    @Override // fjb.a
    public final Object invokeSuspend(Object obj) {
        EnumC58928NAu enumC58928NAu = EnumC58928NAu.COROUTINE_SUSPENDED;
        int i = this.LJLIL;
        if (i != 0) {
            if (i != 1) {
                if (i == 2) {
                    C141335gf.LIZJ(obj);
                    return C76800UCe.LIZ;
                }
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            C141335gf.LIZJ(obj);
        } else {
            C141335gf.LIZJ(obj);
            this.LJLIL = 1;
            if (C1JD.LIZJ(5000L, this) == enumC58928NAu) {
                return enumC58928NAu;
            }
        }
        AbstractC78621UtN abstractC78621UtN = C36636EZk.LIZ;
        WKO wko = new WKO(this.LJLILLLLZI, null);
        this.LJLIL = 2;
        if (XKX.LJI(abstractC78621UtN, wko, this) == enumC58928NAu) {
            return enumC58928NAu;
        }
        return C76800UCe.LIZ;
    }

    @Override // X.InterfaceC88471Ynr
    public final Object invoke(InterfaceC70422pa interfaceC70422pa, InterfaceC67352kd<? super C76800UCe> interfaceC67352kd) {
        return ((a) create(interfaceC70422pa, interfaceC67352kd)).invokeSuspend(C76800UCe.LIZ);
    }
}
