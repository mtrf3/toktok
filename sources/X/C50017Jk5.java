package X;

import com.google.gson.m;
import com.ss.android.ugc.aweme.search.pages.result.common.core.viewmodel.DynamicSearchBaseViewModel;
import fjb.a;
import kotlin.jvm.internal.AqS174S0100000_8;

@InterfaceC65848Psq(c = "com.ss.android.ugc.aweme.search.pages.result.common.core.viewmodel.DynamicSearchBaseViewModel$fetchSearchDataList$1", f = "DynamicSearchBaseViewModel.kt", l = {39}, m = "invokeSuspend")
/* renamed from: X.Jk5, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C50017Jk5 extends AbstractC65782Prm implements InterfaceC88471Ynr<InterfaceC70422pa, InterfaceC67352kd<? super C76800UCe>, Object> {
    public int LJLIL;
    public final /* synthetic */ DynamicSearchBaseViewModel LJLILLLLZI;
    public final /* synthetic */ C50031JkJ LJLJI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C50017Jk5(DynamicSearchBaseViewModel dynamicSearchBaseViewModel, C50031JkJ c50031JkJ, InterfaceC67352kd<? super C50017Jk5> interfaceC67352kd) {
        super(2, interfaceC67352kd);
        this.LJLILLLLZI = dynamicSearchBaseViewModel;
        this.LJLJI = c50031JkJ;
    }

    @Override // fjb.a
    public final InterfaceC67352kd<C76800UCe> create(Object obj, InterfaceC67352kd<?> interfaceC67352kd) {
        return new C50017Jk5(this.LJLILLLLZI, this.LJLJI, interfaceC67352kd);
    }

    @Override // fjb.a
    public final Object invokeSuspend(Object obj) {
        EnumC58928NAu enumC58928NAu = EnumC58928NAu.COROUTINE_SUSPENDED;
        int i = this.LJLIL;
        try {
            if (i != 0) {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                C141335gf.LIZJ(obj);
            } else {
                C141335gf.LIZJ(obj);
                InterfaceC50022JkA operator = this.LJLILLLLZI.gv0().getOperator();
                C50031JkJ c50031JkJ = this.LJLJI;
                this.LJLIL = 1;
                obj = operator.LJJLIIJ(c50031JkJ);
                if (obj == enumC58928NAu) {
                    return enumC58928NAu;
                }
            }
            m mVar = (m) obj;
            mVar.LJJIIZ("client_time_stamp", String.valueOf(System.currentTimeMillis()));
            this.LJLILLLLZI.setState(new AqS174S0100000_8(mVar, 261));
        } catch (Exception e) {
            this.LJLILLLLZI.setState(new AqS174S0100000_8(e, 262));
        }
        return C76800UCe.LIZ;
    }

    @Override // X.InterfaceC88471Ynr
    public final Object invoke(InterfaceC70422pa interfaceC70422pa, InterfaceC67352kd<? super C76800UCe> interfaceC67352kd) {
        return ((a) create(interfaceC70422pa, interfaceC67352kd)).invokeSuspend(C76800UCe.LIZ);
    }
}
