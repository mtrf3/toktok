package X;

@InterfaceC65848Psq(c = "androidx.compose.foundation.ClickableKt$clickable$4$1$gesture$1$1$1", f = "Clickable.kt", l = {161}, m = "invokeSuspend")
/* renamed from: X.2CU, reason: invalid class name */
/* loaded from: classes.dex */
public final class C2CU extends AbstractC65782Prm implements InterfaceC88473Ynt<C1N5, C10370av, InterfaceC67352kd<? super C76800UCe>, Object> {
    public int LJLIL;
    public /* synthetic */ C1N5 LJLILLLLZI;
    public /* synthetic */ long LJLJI;
    public final /* synthetic */ boolean LJLJJI;
    public final /* synthetic */ C1OH LJLJJL;
    public final /* synthetic */ InterfaceC35811ar<C1OJ> LJLJJLL;
    public final /* synthetic */ InterfaceC24760y8<InterfaceC65784Pro<Boolean>> LJLJL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public C2CU(boolean z, C1OH c1oh, InterfaceC35811ar<C1OJ> interfaceC35811ar, InterfaceC24760y8<? extends InterfaceC65784Pro<Boolean>> interfaceC24760y8, InterfaceC67352kd<? super C2CU> interfaceC67352kd) {
        super(3, interfaceC67352kd);
        this.LJLJJI = z;
        this.LJLJJL = c1oh;
        this.LJLJJLL = interfaceC35811ar;
        this.LJLJL = interfaceC24760y8;
    }

    @Override // fjb.a
    public final Object invokeSuspend(Object obj) {
        Object obj2 = EnumC58928NAu.COROUTINE_SUSPENDED;
        int i = this.LJLIL;
        if (i != 0) {
            if (i == 1) {
                C141335gf.LIZJ(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            C141335gf.LIZJ(obj);
            C1N5 c1n5 = this.LJLILLLLZI;
            long j = this.LJLJI;
            if (this.LJLJJI) {
                C1OH c1oh = this.LJLJJL;
                InterfaceC35811ar<C1OJ> interfaceC35811ar = this.LJLJJLL;
                InterfaceC24760y8<InterfaceC65784Pro<Boolean>> interfaceC24760y8 = this.LJLJL;
                this.LJLIL = 1;
                Object LJI = C48841JEv.LJI(new C2CH(c1n5, j, c1oh, interfaceC35811ar, interfaceC24760y8, null), this);
                if (LJI != obj2) {
                    LJI = C76800UCe.LIZ;
                }
                if (LJI == obj2) {
                    return obj2;
                }
            }
        }
        return C76800UCe.LIZ;
    }

    @Override // X.InterfaceC88473Ynt
    public final Object invoke(C1N5 c1n5, C10370av c10370av, InterfaceC67352kd<? super C76800UCe> interfaceC67352kd) {
        long j = c10370av.LIZ;
        C2CU c2cu = new C2CU(this.LJLJJI, this.LJLJJL, this.LJLJJLL, this.LJLJL, interfaceC67352kd);
        c2cu.LJLILLLLZI = c1n5;
        c2cu.LJLJI = j;
        return c2cu.invokeSuspend(C76800UCe.LIZ);
    }
}
