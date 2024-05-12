package X;

import com.bytedance.effectcreatormobile.behaviour.viewmodel.ActionViewModel;
import com.bytedance.effectcreatormobile.ckeapi.api.behaviour.res.IBehaviourResProvider;
import com.bytedance.news.common.service.manager.IService;
import com.ugc.effectcreator.foundation.viewmodel.StateViewModel;
import fjb.a;
import java.util.List;
import kotlin.jvm.internal.o;

@InterfaceC65848Psq(c = "com.bytedance.effectcreatormobile.behaviour.viewmodel.ActionViewModel$load$1", f = "ActionViewModel.kt", l = {20, 25}, m = "invokeSuspend")
/* renamed from: X.am4, reason: case insensitive filesystem */
/* loaded from: classes34.dex */
public final class C94752am4 extends AbstractC65782Prm implements InterfaceC88471Ynr<InterfaceC70422pa, InterfaceC67352kd<? super C76800UCe>, Object> {
    public Object LJLIL;
    public Object LJLILLLLZI;
    public int LJLJI;
    public final /* synthetic */ ActionViewModel LJLJJI;
    public final /* synthetic */ AbstractC94372afw LJLJJL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C94752am4(ActionViewModel actionViewModel, AbstractC94372afw abstractC94372afw, InterfaceC67352kd interfaceC67352kd) {
        super(2, interfaceC67352kd);
        this.LJLJJI = actionViewModel;
        this.LJLJJL = abstractC94372afw;
    }

    @Override // fjb.a
    public final InterfaceC67352kd<C76800UCe> create(Object obj, InterfaceC67352kd<?> completion) {
        o.LJIIIZ(completion, "completion");
        return new C94752am4(this.LJLJJI, this.LJLJJL, completion);
    }

    @Override // X.InterfaceC88471Ynr
    public final Object invoke(InterfaceC70422pa interfaceC70422pa, InterfaceC67352kd<? super C76800UCe> interfaceC67352kd) {
        return ((a) create(interfaceC70422pa, interfaceC67352kd)).invokeSuspend(C76800UCe.LIZ);
    }

    @Override // fjb.a
    public final Object invokeSuspend(Object obj) {
        C93624aTs<List<C94384ag8>> c93624aTs;
        Object obj2;
        EnumC58928NAu enumC58928NAu = EnumC58928NAu.COROUTINE_SUSPENDED;
        int i = this.LJLJI;
        if (i != 0) {
            if (i != 1) {
                if (i == 2) {
                    Object obj3 = this.LJLILLLLZI;
                    c93624aTs = (C93624aTs) this.LJLIL;
                    C141335gf.LIZJ(obj);
                    obj2 = obj3;
                    obj2.getClass();
                    StateViewModel.hv0(c93624aTs, obj);
                    return C76800UCe.LIZ;
                }
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            C141335gf.LIZJ(obj);
        } else {
            C141335gf.LIZJ(obj);
            IBehaviourResProvider iBehaviourResProvider = (IBehaviourResProvider) ((IService) C93971aZT.LIZ().LIZ(IBehaviourResProvider.class));
            if (iBehaviourResProvider != null) {
                this.LJLJI = 1;
                obj = iBehaviourResProvider.loadActionRes(this);
                if (obj == enumC58928NAu) {
                    return enumC58928NAu;
                }
            }
            StateViewModel.gv0(this.LJLJJI.LJLJI, EnumC93623aTr.Fail);
            return C76800UCe.LIZ;
        }
        C94381ag5 c94381ag5 = (C94381ag5) obj;
        if (c94381ag5 != null) {
            if (c94381ag5.LJLIL) {
                StateViewModel.gv0(this.LJLJJI.LJLJI, EnumC93623aTr.Success);
                ActionViewModel actionViewModel = this.LJLJJI;
                c93624aTs = actionViewModel.LJLILLLLZI;
                List<C94384ag8> list = c94381ag5.LJLILLLLZI;
                List<String> LJFF = this.LJLJJL.LJFF();
                this.LJLIL = c93624aTs;
                this.LJLILLLLZI = actionViewModel;
                this.LJLJI = 2;
                obj = XKX.LJI(C78613UtF.LIZJ, new C94852ang(list, LJFF, null), this);
                obj2 = actionViewModel;
                if (obj == enumC58928NAu) {
                    return enumC58928NAu;
                }
                obj2.getClass();
                StateViewModel.hv0(c93624aTs, obj);
                return C76800UCe.LIZ;
            }
            StateViewModel.gv0(this.LJLJJI.LJLJI, EnumC93623aTr.Fail);
            return C76800UCe.LIZ;
        }
        StateViewModel.gv0(this.LJLJJI.LJLJI, EnumC93623aTr.Fail);
        return C76800UCe.LIZ;
    }
}
