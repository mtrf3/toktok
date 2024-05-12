package X;

import com.ss.android.ugc.aweme.draft.model.AwemeDraft;
import fjb.a;

@InterfaceC65848Psq(c = "com.ss.android.ugc.aweme.tools.draft.service.CreativeDraftUpdateServiceImpl$save$1", f = "DraftUpdateServiceImpl.kt", l = {56}, m = "invokeSuspend")
/* loaded from: classes8.dex */
public final class GLN extends AbstractC65782Prm implements InterfaceC88471Ynr<InterfaceC70422pa, InterfaceC67352kd<? super C76800UCe>, Object> {
    public int LJLIL;
    public final /* synthetic */ GO0 LJLILLLLZI;
    public final /* synthetic */ C41021G8b LJLJI;
    public final /* synthetic */ InterfaceC88472Yns<AwemeDraft, C76800UCe> LJLJJI;
    public final /* synthetic */ GI1 LJLJJL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public GLN(GO0 go0, C41021G8b c41021G8b, InterfaceC88472Yns<? super AwemeDraft, C76800UCe> interfaceC88472Yns, GI1 gi1, InterfaceC67352kd<? super GLN> interfaceC67352kd) {
        super(2, interfaceC67352kd);
        this.LJLILLLLZI = go0;
        this.LJLJI = c41021G8b;
        this.LJLJJI = interfaceC88472Yns;
        this.LJLJJL = gi1;
    }

    @Override // fjb.a
    public final InterfaceC67352kd<C76800UCe> create(Object obj, InterfaceC67352kd<?> interfaceC67352kd) {
        return new GLN(this.LJLILLLLZI, this.LJLJI, this.LJLJJI, this.LJLJJL, interfaceC67352kd);
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
            GO0 go0 = this.LJLILLLLZI;
            C41021G8b c41021G8b = this.LJLJI;
            InterfaceC88472Yns<AwemeDraft, C76800UCe> interfaceC88472Yns = this.LJLJJI;
            this.LJLIL = 1;
            obj = go0.LIZIZ(c41021G8b, interfaceC88472Yns, this);
            if (obj == enumC58928NAu) {
                return enumC58928NAu;
            }
        }
        C142535ib c142535ib = (C142535ib) obj;
        if (c142535ib.LJLIL.isSuc()) {
            this.LJLJJL.LIZIZ(c142535ib);
        } else {
            this.LJLJJL.LIZJ(c142535ib);
        }
        return C76800UCe.LIZ;
    }

    @Override // X.InterfaceC88471Ynr
    public final Object invoke(InterfaceC70422pa interfaceC70422pa, InterfaceC67352kd<? super C76800UCe> interfaceC67352kd) {
        return ((a) create(interfaceC70422pa, interfaceC67352kd)).invokeSuspend(C76800UCe.LIZ);
    }
}
