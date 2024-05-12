package X;

@InterfaceC65848Psq(c = "com.ss.android.ugc.aweme.relation.storage.common.StorageLegoTask$run$1", f = "StorageLegoTask.kt", l = {44}, m = "invokeSuspend")
/* renamed from: X.2o9, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C69532o9 extends AbstractC65782Prm implements InterfaceC88471Ynr<InterfaceC70422pa, InterfaceC67352kd<? super C76800UCe>, Object> {
    public int LJLIL;

    public C69532o9(InterfaceC67352kd<? super C69532o9> interfaceC67352kd) {
        super(2, interfaceC67352kd);
    }

    @Override // fjb.a
    public final InterfaceC67352kd<C76800UCe> create(Object obj, InterfaceC67352kd<?> interfaceC67352kd) {
        return new C69532o9(interfaceC67352kd);
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
            C79863Bm c79863Bm = C69582oE.LJLJI;
            C64562g8 c64562g8 = new C64562g8(null);
            this.LJLIL = 1;
            obj = V1M.LJIILL(c79863Bm, c64562g8, this);
            if (obj == enumC58928NAu) {
                return enumC58928NAu;
            }
        }
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("login Uid: ");
        LIZ.append((String) obj);
        C69542oA.LIZIZ("Lego", X1D.LIZIZ(LIZ));
        C69622oI.LIZ();
        return C76800UCe.LIZ;
    }

    @Override // X.InterfaceC88471Ynr
    public final Object invoke(InterfaceC70422pa interfaceC70422pa, InterfaceC67352kd<? super C76800UCe> interfaceC67352kd) {
        return new C69532o9(interfaceC67352kd).invokeSuspend(C76800UCe.LIZ);
    }
}
