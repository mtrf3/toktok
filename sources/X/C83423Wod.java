package X;

import com.bytedance.ies.actionai.jni.ActionExecuteCallback;
import fjb.a;
import kotlin.jvm.internal.o;

@InterfaceC65848Psq(c = "com.ss.android.ugc.aweme.actionai.action.framework.BaseSelectionUIMicroAction$execute$2$1$invoke$1", f = "BaseSelectionUIMicroAction.kt", l = {93}, m = "invokeSuspend")
/* renamed from: X.Wod, reason: case insensitive filesystem */
/* loaded from: classes15.dex */
public final class C83423Wod extends AbstractC65782Prm implements InterfaceC88471Ynr<InterfaceC70422pa, InterfaceC67352kd<? super C76800UCe>, Object> {
    public int LJLIL;
    public final /* synthetic */ C83427Woh<Object> LJLILLLLZI;
    public final /* synthetic */ ActionExecuteCallback LJLJI;
    public final /* synthetic */ C45241HpF<Object> LJLJJI;
    public final /* synthetic */ int LJLJJL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C83423Wod(C83427Woh<Object> c83427Woh, ActionExecuteCallback actionExecuteCallback, C45241HpF<Object> c45241HpF, int i, InterfaceC67352kd<? super C83423Wod> interfaceC67352kd) {
        super(2, interfaceC67352kd);
        this.LJLILLLLZI = c83427Woh;
        this.LJLJI = actionExecuteCallback;
        this.LJLJJI = c45241HpF;
        this.LJLJJL = i;
    }

    @Override // fjb.a
    public final InterfaceC67352kd<C76800UCe> create(Object obj, InterfaceC67352kd<?> interfaceC67352kd) {
        return new C83423Wod(this.LJLILLLLZI, this.LJLJI, this.LJLJJI, this.LJLJJL, interfaceC67352kd);
    }

    @Override // fjb.a
    public final Object invokeSuspend(Object obj) {
        EnumC83360Wnc enumC83360Wnc;
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
            InterfaceC83426Wog<Object> interfaceC83426Wog = this.LJLILLLLZI.LJLILLLLZI;
            if (interfaceC83426Wog != null) {
                ActionExecuteCallback actionExecuteCallback = this.LJLJI;
                C45241HpF<Object> c45241HpF = this.LJLJJI;
                this.LJLIL = 1;
                obj = interfaceC83426Wog.LIZ(actionExecuteCallback, c45241HpF, this);
                if (obj == enumC58928NAu) {
                    return enumC58928NAu;
                }
            } else {
                obj = null;
            }
        }
        InterfaceC83402WoI interfaceC83402WoI = this.LJLILLLLZI.LJLIL;
        if (o.LJ(obj, Boolean.TRUE)) {
            enumC83360Wnc = EnumC83360Wnc.EXECUTE_SUCCESS;
        } else {
            enumC83360Wnc = EnumC83360Wnc.EXECUTE_FAIL;
        }
        interfaceC83402WoI.eO(new C83361Wnd(enumC83360Wnc, this.LJLJJL));
        return C76800UCe.LIZ;
    }

    @Override // X.InterfaceC88471Ynr
    public final Object invoke(InterfaceC70422pa interfaceC70422pa, InterfaceC67352kd<? super C76800UCe> interfaceC67352kd) {
        return ((a) create(interfaceC70422pa, interfaceC67352kd)).invokeSuspend(C76800UCe.LIZ);
    }
}
