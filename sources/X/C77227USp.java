package X;

import fjb.a;

@InterfaceC65848Psq(c = "com.ss.android.ugc.aweme.relation.auth.pipeline.fb.FBUploadAuthProcessor$process$res$1", f = "FBUploadAuthProcessor.kt", l = {22}, m = "invokeSuspend")
/* renamed from: X.USp, reason: case insensitive filesystem */
/* loaded from: classes14.dex */
public final class C77227USp extends AbstractC65782Prm implements InterfaceC88471Ynr<InterfaceC70422pa, InterfaceC67352kd<? super Boolean>, Object> {
    public int LJLIL;
    public final /* synthetic */ C77211URz LJLILLLLZI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C77227USp(C77211URz c77211URz, InterfaceC67352kd<? super C77227USp> interfaceC67352kd) {
        super(2, interfaceC67352kd);
        this.LJLILLLLZI = c77211URz;
    }

    @Override // fjb.a
    public final InterfaceC67352kd<C76800UCe> create(Object obj, InterfaceC67352kd<?> interfaceC67352kd) {
        return new C77227USp(this.LJLILLLLZI, interfaceC67352kd);
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
            InterfaceC237509Tu LJI = UTK.LIZIZ.LJI();
            EnumC58085Mqv LIZ = C58084Mqu.LIZ(this.LJLILLLLZI.LJLIL.LJ.LIZ);
            this.LJLIL = 1;
            obj = LJI.LIZ(LIZ, this);
            if (obj == enumC58928NAu) {
                return enumC58928NAu;
            }
        }
        return obj;
    }

    @Override // X.InterfaceC88471Ynr
    public final Object invoke(InterfaceC70422pa interfaceC70422pa, InterfaceC67352kd<? super Boolean> interfaceC67352kd) {
        return ((a) create(interfaceC70422pa, interfaceC67352kd)).invokeSuspend(C76800UCe.LIZ);
    }
}
