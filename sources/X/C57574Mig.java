package X;

import Y.IDfS130S0100000_9;
import android.content.Context;
import fjb.a;
import kotlin.jvm.internal.AqS113S0300000_9;

@InterfaceC65848Psq(c = "com.ss.android.ugc.aweme.relation.ffp.ext.CommonExtKt$newAuthFlow$1", f = "CommonExt.kt", l = {126}, m = "invokeSuspend")
/* renamed from: X.Mig, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public final class C57574Mig extends AbstractC65782Prm implements InterfaceC88471Ynr<InterfaceC70422pa, InterfaceC67352kd<? super C76800UCe>, Object> {
    public int LJLIL;
    public /* synthetic */ Object LJLILLLLZI;
    public final /* synthetic */ Context LJLJI;
    public final /* synthetic */ EnumC77147UPn LJLJJI;
    public final /* synthetic */ C57571Mid LJLJJL;
    public final /* synthetic */ InterfaceC88472Yns<Boolean, C76800UCe> LJLJJLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public C57574Mig(Context context, EnumC77147UPn enumC77147UPn, C57571Mid c57571Mid, InterfaceC88472Yns<? super Boolean, C76800UCe> interfaceC88472Yns, InterfaceC67352kd<? super C57574Mig> interfaceC67352kd) {
        super(2, interfaceC67352kd);
        this.LJLJI = context;
        this.LJLJJI = enumC77147UPn;
        this.LJLJJL = c57571Mid;
        this.LJLJJLL = interfaceC88472Yns;
    }

    @Override // fjb.a
    public final InterfaceC67352kd<C76800UCe> create(Object obj, InterfaceC67352kd<?> interfaceC67352kd) {
        C57574Mig c57574Mig = new C57574Mig(this.LJLJI, this.LJLJJI, this.LJLJJL, this.LJLJJLL, interfaceC67352kd);
        c57574Mig.LJLILLLLZI = obj;
        return c57574Mig;
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
            C3C3 LIZ = ((USE) C77125UOr.LJII(this.LJLJI, new AqS113S0300000_9((InterfaceC70422pa) this.LJLILLLLZI, this.LJLJJI, this.LJLJJL, 16))).LIZ();
            IDfS130S0100000_9 iDfS130S0100000_9 = new IDfS130S0100000_9(this.LJLJJLL, 8);
            this.LJLIL = 1;
            if (LIZ.collect(iDfS130S0100000_9, this) == enumC58928NAu) {
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
