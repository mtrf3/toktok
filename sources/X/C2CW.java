package X;

import fjb.a;

@InterfaceC65848Psq(c = "androidx.compose.foundation.ClickableKt$clickable$4$1$gesture$1$1", f = "Clickable.kt", l = {158}, m = "invokeSuspend")
/* renamed from: X.2CW, reason: invalid class name */
/* loaded from: classes.dex */
public final class C2CW extends AbstractC65782Prm implements InterfaceC88471Ynr<InterfaceC37501da, InterfaceC67352kd<? super C76800UCe>, Object> {
    public int LJLIL;
    public /* synthetic */ Object LJLILLLLZI;
    public final /* synthetic */ InterfaceC35811ar<C10370av> LJLJI;
    public final /* synthetic */ boolean LJLJJI;
    public final /* synthetic */ C1OH LJLJJL;
    public final /* synthetic */ InterfaceC35811ar<C1OJ> LJLJJLL;
    public final /* synthetic */ InterfaceC24760y8<InterfaceC65784Pro<Boolean>> LJLJL;
    public final /* synthetic */ InterfaceC24760y8<InterfaceC65784Pro<C76800UCe>> LJLJLJ;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public C2CW(InterfaceC35811ar<C10370av> interfaceC35811ar, boolean z, C1OH c1oh, InterfaceC35811ar<C1OJ> interfaceC35811ar2, InterfaceC24760y8<? extends InterfaceC65784Pro<Boolean>> interfaceC24760y8, InterfaceC24760y8<? extends InterfaceC65784Pro<C76800UCe>> interfaceC24760y82, InterfaceC67352kd<? super C2CW> interfaceC67352kd) {
        super(2, interfaceC67352kd);
        this.LJLJI = interfaceC35811ar;
        this.LJLJJI = z;
        this.LJLJJL = c1oh;
        this.LJLJJLL = interfaceC35811ar2;
        this.LJLJL = interfaceC24760y8;
        this.LJLJLJ = interfaceC24760y82;
    }

    @Override // fjb.a
    public final InterfaceC67352kd<C76800UCe> create(Object obj, InterfaceC67352kd<?> interfaceC67352kd) {
        C2CW c2cw = new C2CW(this.LJLJI, this.LJLJJI, this.LJLJJL, this.LJLJJLL, this.LJLJL, this.LJLJLJ, interfaceC67352kd);
        c2cw.LJLILLLLZI = obj;
        return c2cw;
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
            InterfaceC37501da interfaceC37501da = (InterfaceC37501da) this.LJLILLLLZI;
            InterfaceC35811ar<C10370av> interfaceC35811ar = this.LJLJI;
            long LIZ = interfaceC37501da.LIZ();
            long LIZ2 = C78939UyV.LIZ(((int) (LIZ >> 32)) / 2, C23490w5.LIZIZ(LIZ) / 2);
            interfaceC35811ar.setValue(new C10370av(C78923UyF.LIZ((int) (LIZ2 >> 32), C23450w1.LIZJ(LIZ2))));
            C2CU c2cu = new C2CU(this.LJLJJI, this.LJLJJL, this.LJLJJLL, this.LJLJL, null);
            C49371wj c49371wj = new C49371wj(this.LJLJLJ, this.LJLJJI);
            this.LJLIL = 1;
            Object LIZIZ = C0UR.LIZIZ(interfaceC37501da, new C2D2(new C42091kz(interfaceC37501da), c2cu, c49371wj, null), this);
            if (LIZIZ != obj2) {
                LIZIZ = C76800UCe.LIZ;
            }
            if (LIZIZ == obj2) {
                return obj2;
            }
        }
        return C76800UCe.LIZ;
    }

    @Override // X.InterfaceC88471Ynr
    public final Object invoke(InterfaceC37501da interfaceC37501da, InterfaceC67352kd<? super C76800UCe> interfaceC67352kd) {
        return ((a) create(interfaceC37501da, interfaceC67352kd)).invokeSuspend(C76800UCe.LIZ);
    }
}
