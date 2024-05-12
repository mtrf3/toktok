package X;

import fjb.a;

@InterfaceC65848Psq(c = "com.bytedance.tux.compose.TuxLoadingKt$TuxDualBall$1$1$1$scope$1", f = "TuxLoading.kt", l = {148}, m = "invokeSuspend")
/* renamed from: X.2li, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C68022li extends AbstractC65782Prm implements InterfaceC88471Ynr<InterfaceC70422pa, InterfaceC67352kd<? super C76800UCe>, Object> {
    public int LJLIL;
    public /* synthetic */ Object LJLILLLLZI;
    public final /* synthetic */ boolean LJLJI;
    public final /* synthetic */ InterfaceC35811ar<Long> LJLJJI;
    public final /* synthetic */ InterfaceC35811ar<Boolean> LJLJJL;
    public final /* synthetic */ InterfaceC35811ar<Float> LJLJJLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C68022li(boolean z, InterfaceC35811ar<Long> interfaceC35811ar, InterfaceC35811ar<Boolean> interfaceC35811ar2, InterfaceC35811ar<Float> interfaceC35811ar3, InterfaceC67352kd<? super C68022li> interfaceC67352kd) {
        super(2, interfaceC67352kd);
        this.LJLJI = z;
        this.LJLJJI = interfaceC35811ar;
        this.LJLJJL = interfaceC35811ar2;
        this.LJLJJLL = interfaceC35811ar3;
    }

    @Override // fjb.a
    public final InterfaceC67352kd<C76800UCe> create(Object obj, InterfaceC67352kd<?> interfaceC67352kd) {
        C68022li c68022li = new C68022li(this.LJLJI, this.LJLJJI, this.LJLJJL, this.LJLJJLL, interfaceC67352kd);
        c68022li.LJLILLLLZI = obj;
        return c68022li;
    }

    @Override // fjb.a
    public final Object invokeSuspend(Object obj) {
        InterfaceC70422pa interfaceC70422pa;
        boolean z;
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
        }
        while (this.LJLJI && C48841JEv.LJIILLIIL(interfaceC70422pa)) {
            float nanoTime = ((float) ((System.nanoTime() / 1000000) - this.LJLJJI.getValue().longValue())) / 400.0f;
            int i2 = (int) nanoTime;
            InterfaceC35811ar<Boolean> interfaceC35811ar = this.LJLJJL;
            if (i2 % 2 == 1) {
                z = true;
            } else {
                z = false;
            }
            interfaceC35811ar.setValue(Boolean.valueOf(z));
            this.LJLJJLL.setValue(Float.valueOf(nanoTime - i2));
            this.LJLILLLLZI = interfaceC70422pa;
            this.LJLIL = 1;
            if (C1JD.LIZJ(17L, this) == enumC58928NAu) {
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
