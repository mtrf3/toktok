package X;

import fjb.a;

@InterfaceC65848Psq(c = "com.ss.android.ugc.aweme.im.sdk.relations.data.core.fetch.RelationFetchManager$fetchRelationAsync$1", f = "RelationFetchManager.kt", l = {136}, m = "invokeSuspend")
/* renamed from: X.3Fn, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C80913Fn extends AbstractC65782Prm implements InterfaceC88471Ynr<InterfaceC70422pa, InterfaceC67352kd<? super C76800UCe>, Object> {
    public int LJLIL;
    public /* synthetic */ Object LJLILLLLZI;
    public final /* synthetic */ C3YM LJLJI;
    public final /* synthetic */ boolean LJLJJI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C80913Fn(C3YM c3ym, boolean z, InterfaceC67352kd<? super C80913Fn> interfaceC67352kd) {
        super(2, interfaceC67352kd);
        this.LJLJI = c3ym;
        this.LJLJJI = z;
    }

    @Override // fjb.a
    public final InterfaceC67352kd<C76800UCe> create(Object obj, InterfaceC67352kd<?> interfaceC67352kd) {
        C80913Fn c80913Fn = new C80913Fn(this.LJLJI, this.LJLJJI, interfaceC67352kd);
        c80913Fn.LJLILLLLZI = obj;
        return c80913Fn;
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
                InterfaceC70422pa interfaceC70422pa = (InterfaceC70422pa) this.LJLILLLLZI;
                C3YC c3yc = C3YC.LJLIL;
                C3YM c3ym = this.LJLJI;
                boolean z = this.LJLJJI;
                this.LJLIL = 1;
                if (c3yc.LJIIJ(interfaceC70422pa, c3ym, z, this) == enumC58928NAu) {
                    return enumC58928NAu;
                }
            }
        } catch (Exception e) {
            StringBuilder LIZ = X1D.LIZ();
            LIZ.append("fetchRelationAsync [");
            LIZ.append(this.LJLJI);
            LIZ.append("]: error=");
            LIZ.append(e.getMessage());
            C3YC.LJIIL(X1D.LIZIZ(LIZ));
        }
        return C76800UCe.LIZ;
    }

    @Override // X.InterfaceC88471Ynr
    public final Object invoke(InterfaceC70422pa interfaceC70422pa, InterfaceC67352kd<? super C76800UCe> interfaceC67352kd) {
        return ((a) create(interfaceC70422pa, interfaceC67352kd)).invokeSuspend(C76800UCe.LIZ);
    }
}
