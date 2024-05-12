package X;

import com.bytedance.vcloud.vctrace.BuildConfig;
import fjb.a;

@InterfaceC65848Psq(c = "androidx.compose.material.ripple.StateLayer$handleInteraction$1", f = "Ripple.kt", l = {BuildConfig.VERSION_CODE}, m = "invokeSuspend")
/* renamed from: X.2GB, reason: invalid class name */
/* loaded from: classes.dex */
public final class C2GB extends AbstractC65782Prm implements InterfaceC88471Ynr<InterfaceC70422pa, InterfaceC67352kd<? super C76800UCe>, Object> {
    public int LJLIL;
    public final /* synthetic */ C23300vm LJLILLLLZI;
    public final /* synthetic */ float LJLJI;
    public final /* synthetic */ C0Q2<Float> LJLJJI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C2GB(C23300vm c23300vm, float f, C0Q2<Float> c0q2, InterfaceC67352kd<? super C2GB> interfaceC67352kd) {
        super(2, interfaceC67352kd);
        this.LJLILLLLZI = c23300vm;
        this.LJLJI = f;
        this.LJLJJI = c0q2;
    }

    @Override // fjb.a
    public final InterfaceC67352kd<C76800UCe> create(Object obj, InterfaceC67352kd<?> interfaceC67352kd) {
        return new C2GB(this.LJLILLLLZI, this.LJLJI, this.LJLJJI, interfaceC67352kd);
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
            C07070Pn<Float, C1JM> c07070Pn = this.LJLILLLLZI.LIZJ;
            Float f = new Float(this.LJLJI);
            C0Q2<Float> c0q2 = this.LJLJJI;
            this.LJLIL = 1;
            if (C07070Pn.LIZIZ(c07070Pn, f, c0q2, null, this, 12) == enumC58928NAu) {
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
