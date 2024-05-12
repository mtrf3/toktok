package X;

@InterfaceC65848Psq(c = "com.ss.android.ugc.aweme.relation.usercard.ext.RecUserContactAccessHelper$forceRead$1$1", f = "RecUserContactAccessHelper.kt", l = {76}, m = "invokeSuspend")
/* loaded from: classes10.dex */
public final class LTQ extends AbstractC65782Prm implements InterfaceC88471Ynr<InterfaceC70422pa, InterfaceC67352kd<? super C76800UCe>, Object> {
    public int LJLIL;

    public LTQ(InterfaceC67352kd<? super LTQ> interfaceC67352kd) {
        super(2, interfaceC67352kd);
    }

    @Override // fjb.a
    public final InterfaceC67352kd<C76800UCe> create(Object obj, InterfaceC67352kd<?> interfaceC67352kd) {
        return new LTQ(interfaceC67352kd);
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
            C57576Mii c57576Mii = C57576Mii.LIZ;
            String str = C57576Mii.LIZLLL;
            this.LJLIL = 1;
            if (C56667MLv.LIZ(c57576Mii, str, this, 1) == enumC58928NAu) {
                return enumC58928NAu;
            }
        }
        return C76800UCe.LIZ;
    }

    @Override // X.InterfaceC88471Ynr
    public final Object invoke(InterfaceC70422pa interfaceC70422pa, InterfaceC67352kd<? super C76800UCe> interfaceC67352kd) {
        return new LTQ(interfaceC67352kd).invokeSuspend(C76800UCe.LIZ);
    }
}
