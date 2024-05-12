package X;

import com.ss.android.ugc.aweme.search.ecommerce.middle.DynamicSingleIntermediateFragmentNew;
import fjb.a;
import java.util.concurrent.TimeUnit;

@InterfaceC65848Psq(c = "com.ss.android.ugc.aweme.search.ecommerce.middle.DynamicSingleIntermediateFragmentNew$updateDataWhenLynxReady$1$1", f = "DynamicSingleIntermediateFragmentNew.kt", l = {269}, m = "invokeSuspend")
/* loaded from: classes7.dex */
public final class EDM extends AbstractC65782Prm implements InterfaceC88471Ynr<InterfaceC70422pa, InterfaceC67352kd<? super C76800UCe>, Object> {
    public int LJLIL;
    public final /* synthetic */ DynamicSingleIntermediateFragmentNew LJLILLLLZI;
    public final /* synthetic */ InterfaceC65784Pro<C76800UCe> LJLJI;
    public final /* synthetic */ String LJLJJI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public EDM(DynamicSingleIntermediateFragmentNew dynamicSingleIntermediateFragmentNew, InterfaceC65784Pro<C76800UCe> interfaceC65784Pro, String str, InterfaceC67352kd<? super EDM> interfaceC67352kd) {
        super(2, interfaceC67352kd);
        this.LJLILLLLZI = dynamicSingleIntermediateFragmentNew;
        this.LJLJI = interfaceC65784Pro;
        this.LJLJJI = str;
    }

    @Override // fjb.a
    public final InterfaceC67352kd<C76800UCe> create(Object obj, InterfaceC67352kd<?> interfaceC67352kd) {
        return new EDM(this.LJLILLLLZI, this.LJLJI, this.LJLJJI, interfaceC67352kd);
    }

    @Override // X.InterfaceC88471Ynr
    public final Object invoke(InterfaceC70422pa interfaceC70422pa, InterfaceC67352kd<? super C76800UCe> interfaceC67352kd) {
        return ((a) create(interfaceC70422pa, interfaceC67352kd)).invokeSuspend(C76800UCe.LIZ);
    }

    @Override // fjb.a
    public final Object invokeSuspend(Object obj) {
        boolean z;
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
            long currentTimeMillis = System.currentTimeMillis();
            try {
                z = this.LJLILLLLZI.LLIIIJ.await(5000L, TimeUnit.MILLISECONDS);
            } catch (Exception e) {
                C16880lQ.LLLLIIL(e);
                z = false;
            }
            XIF xif = EXV.LIZ;
            C50767JwB c50767JwB = new C50767JwB(this.LJLJI, currentTimeMillis, this.LJLJJI, z, this.LJLILLLLZI, null);
            this.LJLIL = 1;
            if (XKX.LJI(xif, c50767JwB, this) == enumC58928NAu) {
                return enumC58928NAu;
            }
        }
        return C76800UCe.LIZ;
    }
}
