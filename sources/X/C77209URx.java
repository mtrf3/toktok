package X;

import Y.IDfS133S0100000_13;
import fjb.a;
import kotlin.jvm.internal.AqS117S0300000_13;

@InterfaceC65848Psq(c = "com.ss.android.ugc.aweme.relation.auth.dialogcenter.task.RequestEmailAuthPipelineTask$getAuthPipeline$1", f = "RequestEmailAuthPipelineTask.kt", l = {118}, m = "invokeSuspend")
/* renamed from: X.URx, reason: case insensitive filesystem */
/* loaded from: classes14.dex */
public final class C77209URx extends AbstractC65782Prm implements InterfaceC88471Ynr<InterfaceC70422pa, InterfaceC67352kd<? super C76800UCe>, Object> {
    public int LJLIL;
    public /* synthetic */ Object LJLILLLLZI;
    public final /* synthetic */ C77208URw LJLJI;
    public final /* synthetic */ EnumC77147UPn LJLJJI;
    public final /* synthetic */ XJL<Boolean> LJLJJL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public C77209URx(C77208URw c77208URw, EnumC77147UPn enumC77147UPn, XJL<? super Boolean> xjl, InterfaceC67352kd<? super C77209URx> interfaceC67352kd) {
        super(2, interfaceC67352kd);
        this.LJLJI = c77208URw;
        this.LJLJJI = enumC77147UPn;
        this.LJLJJL = xjl;
    }

    @Override // fjb.a
    public final InterfaceC67352kd<C76800UCe> create(Object obj, InterfaceC67352kd<?> interfaceC67352kd) {
        C77209URx c77209URx = new C77209URx(this.LJLJI, this.LJLJJI, this.LJLJJL, interfaceC67352kd);
        c77209URx.LJLILLLLZI = obj;
        return c77209URx;
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
            InterfaceC70422pa interfaceC70422pa = (InterfaceC70422pa) this.LJLILLLLZI;
            C77208URw c77208URw = this.LJLJI;
            C3C3 LIZ = ((USE) C77125UOr.LJII(c77208URw.LJLIL.LIZ, new AqS117S0300000_13(interfaceC70422pa, this.LJLJJI, c77208URw, 11))).LIZ();
            IDfS133S0100000_13 iDfS133S0100000_13 = new IDfS133S0100000_13(this.LJLJJL, 1);
            this.LJLIL = 1;
            if (LIZ.collect(iDfS133S0100000_13, this) == enumC58928NAu) {
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
