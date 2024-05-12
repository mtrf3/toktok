package X;

import com.bytedance.ies.actionai.jni.ActionExecuteCallback;
import com.bytedance.ies.actionai.jni.ActionNodeList;
import com.bytedance.ies.actionai.jni.ExecutionContext;
import fjb.a;

@InterfaceC65848Psq(c = "com.ss.android.ugc.aweme.actionai.action.framework.BaseSelectionUIMicroAction$execute$2", f = "BaseSelectionUIMicroAction.kt", l = {}, m = "invokeSuspend")
/* renamed from: X.Wob, reason: case insensitive filesystem */
/* loaded from: classes15.dex */
public final class C83421Wob extends AbstractC65782Prm implements InterfaceC88471Ynr<InterfaceC70422pa, InterfaceC67352kd<? super C76800UCe>, Object> {
    public final /* synthetic */ C83427Woh<I> LJLIL;
    public final /* synthetic */ C35729E0n LJLILLLLZI;
    public final /* synthetic */ ExecutionContext LJLJI;
    public final /* synthetic */ C83429Woj<I> LJLJJI;
    public final /* synthetic */ ActionExecuteCallback LJLJJL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C83421Wob(C83427Woh<I> c83427Woh, C35729E0n c35729E0n, ExecutionContext executionContext, C83429Woj<I> c83429Woj, ActionExecuteCallback actionExecuteCallback, InterfaceC67352kd<? super C83421Wob> interfaceC67352kd) {
        super(2, interfaceC67352kd);
        this.LJLIL = c83427Woh;
        this.LJLILLLLZI = c35729E0n;
        this.LJLJI = executionContext;
        this.LJLJJI = c83429Woj;
        this.LJLJJL = actionExecuteCallback;
    }

    @Override // fjb.a
    public final InterfaceC67352kd<C76800UCe> create(Object obj, InterfaceC67352kd<?> interfaceC67352kd) {
        return new C83421Wob(this.LJLIL, this.LJLILLLLZI, this.LJLJI, this.LJLJJI, this.LJLJJL, interfaceC67352kd);
    }

    @Override // fjb.a
    public final Object invokeSuspend(Object obj) {
        String str;
        String str2;
        C141335gf.LIZJ(obj);
        InterfaceC83402WoI interfaceC83402WoI = this.LJLIL.LJLIL;
        ActionNodeList actionNodeList = null;
        if (interfaceC83402WoI == null) {
            return null;
        }
        String str3 = this.LJLILLLLZI.LIZ;
        ExecutionContext executionContext = this.LJLJI;
        if (executionContext != null) {
            str = executionContext.getConversationId();
        } else {
            str = null;
        }
        ExecutionContext executionContext2 = this.LJLJI;
        if (executionContext2 != null) {
            str2 = executionContext2.getMessageId();
        } else {
            str2 = null;
        }
        ExecutionContext executionContext3 = this.LJLJI;
        if (executionContext3 != null) {
            actionNodeList = executionContext3.getActionDAG();
        }
        C83351WnT c83351WnT = new C83351WnT(str3, C42428Gky.LIZIZ(actionNodeList), str, str2, this.LJLILLLLZI.LIZIZ, true, null, 1760);
        C83427Woh<I> c83427Woh = this.LJLIL;
        C83429Woj<I> c83429Woj = this.LJLJJI;
        interfaceC83402WoI.X20(c83351WnT, new C83422Woc(c83427Woh, c83429Woj, this.LJLJJL), c83429Woj.LIZ);
        return C76800UCe.LIZ;
    }

    @Override // X.InterfaceC88471Ynr
    public final Object invoke(InterfaceC70422pa interfaceC70422pa, InterfaceC67352kd<? super C76800UCe> interfaceC67352kd) {
        return ((a) create(interfaceC70422pa, interfaceC67352kd)).invokeSuspend(C76800UCe.LIZ);
    }
}
