package X;

import Y.AObjectS89S0100000_14;
import androidx.lifecycle.LifecycleOwner;
import com.bytedance.als.LiveEvent;
import com.bytedance.ies.actionai.jni.ActionAIErrorCode;
import com.bytedance.ies.actionai.jni.ActionExecuteCallback;
import com.bytedance.ies.actionai.jni.ActionNodeList;
import com.bytedance.ies.actionai.jni.ActionResult;
import com.bytedance.ies.actionai.jni.ExecutionContext;
import com.bytedance.ies.actionai.jni.ServerErrorInfo;
import fjb.a;

@InterfaceC65848Psq(c = "com.ss.android.ugc.aweme.actionai.action.AbsBaseAction$execute$1", f = "AbsBaseAction.kt", l = {84}, m = "invokeSuspend")
/* renamed from: X.WoZ, reason: case insensitive filesystem */
/* loaded from: classes15.dex */
public final class C83419WoZ extends AbstractC65782Prm implements InterfaceC88471Ynr<InterfaceC70422pa, InterfaceC67352kd<? super C76800UCe>, Object> {
    public long LJLIL;
    public int LJLILLLLZI;
    public final /* synthetic */ AbstractC83417WoX LJLJI;
    public final /* synthetic */ ExecutionContext LJLJJI;
    public final /* synthetic */ ActionExecuteCallback LJLJJL;
    public final /* synthetic */ String LJLJJLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C83419WoZ(AbstractC83417WoX abstractC83417WoX, ExecutionContext executionContext, ActionExecuteCallback actionExecuteCallback, String str, InterfaceC67352kd<? super C83419WoZ> interfaceC67352kd) {
        super(2, interfaceC67352kd);
        this.LJLJI = abstractC83417WoX;
        this.LJLJJI = executionContext;
        this.LJLJJL = actionExecuteCallback;
        this.LJLJJLL = str;
    }

    @Override // fjb.a
    public final InterfaceC67352kd<C76800UCe> create(Object obj, InterfaceC67352kd<?> interfaceC67352kd) {
        return new C83419WoZ(this.LJLJI, this.LJLJJI, this.LJLJJL, this.LJLJJLL, interfaceC67352kd);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v65, types: [T, java.lang.String] */
    @Override // fjb.a
    public final Object invokeSuspend(Object obj) {
        InterfaceC83402WoI LIZIZ;
        LiveEvent<C76800UCe> fS;
        InterfaceC83402WoI LIZIZ2;
        long currentTimeMillis;
        Object LIZ;
        InterfaceC83402WoI LIZIZ3;
        LiveEvent<C76800UCe> fS2;
        InterfaceC83402WoI LIZIZ4;
        LiveEvent<C76800UCe> fS3;
        InterfaceC83402WoI LIZIZ5;
        LiveEvent<C76800UCe> fS4;
        InterfaceC83402WoI LIZIZ6;
        boolean z;
        ActionNodeList actionDAG;
        String str;
        InterfaceC83402WoI LIZIZ7;
        LiveEvent<C76800UCe> fS5;
        InterfaceC83402WoI LIZIZ8;
        ?? message;
        EnumC58928NAu enumC58928NAu = EnumC58928NAu.COROUTINE_SUSPENDED;
        int i = this.LJLILLLLZI;
        try {
            if (i != 0) {
                if (i == 1) {
                    currentTimeMillis = this.LJLIL;
                    C141335gf.LIZJ(obj);
                    LIZ = ((C3C5) obj).m15unboximpl();
                } else {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            } else {
                C141335gf.LIZJ(obj);
                currentTimeMillis = System.currentTimeMillis();
                AbstractC83417WoX abstractC83417WoX = this.LJLJI;
                if (abstractC83417WoX.LJFF == null) {
                    abstractC83417WoX.LJFF = new AObjectS89S0100000_14(abstractC83417WoX, 449);
                    AbstractC82626Wbm<InterfaceC83402WoI> abstractC82626Wbm = abstractC83417WoX.LIZIZ;
                    if (abstractC82626Wbm != null && (LIZIZ4 = abstractC82626Wbm.LIZIZ()) != null && (fS3 = LIZIZ4.fS()) != null) {
                        AbstractC83417WoX abstractC83417WoX2 = this.LJLJI;
                        LifecycleOwner lifecycleOwner = abstractC83417WoX2.LIZ;
                        AObjectS89S0100000_14 aObjectS89S0100000_14 = abstractC83417WoX2.LJFF;
                        if (aObjectS89S0100000_14 != null) {
                            fS3.LIZLLL(lifecycleOwner, aObjectS89S0100000_14);
                        } else {
                            "Required value was null.".toString();
                            throw new IllegalArgumentException("Required value was null.");
                        }
                    }
                }
                AbstractC82626Wbm<InterfaceC83402WoI> abstractC82626Wbm2 = this.LJLJI.LIZIZ;
                if (abstractC82626Wbm2 != null && (LIZIZ3 = abstractC82626Wbm2.LIZIZ()) != null && (fS2 = LIZIZ3.fS()) != null) {
                    AbstractC83417WoX abstractC83417WoX3 = this.LJLJI;
                    fS2.LIZLLL(abstractC83417WoX3.LIZ, (InterfaceC29911Fj) abstractC83417WoX3.LJ.getValue());
                }
                C83467WpL<String, String> LIZJ = this.LJLJI.LIZJ();
                ExecutionContext executionContext = this.LJLJJI;
                ActionExecuteCallback actionExecuteCallback = this.LJLJJL;
                String str2 = this.LJLJJLL;
                this.LJLIL = currentTimeMillis;
                this.LJLILLLLZI = 1;
                LIZ = LIZJ.LIZ(executionContext, actionExecuteCallback, str2, this);
                if (LIZ == enumC58928NAu) {
                    return enumC58928NAu;
                }
            }
        } catch (Exception e) {
            AbstractC82626Wbm<InterfaceC83402WoI> abstractC82626Wbm3 = this.LJLJI.LIZIZ;
            if (abstractC82626Wbm3 != null && (LIZIZ2 = abstractC82626Wbm3.LIZIZ()) != null) {
                LIZIZ2.eO(new C83361Wnd(EnumC83360Wnc.EXECUTE_FAIL, -1));
            }
            AbstractC82626Wbm<InterfaceC83402WoI> abstractC82626Wbm4 = this.LJLJI.LIZIZ;
            if (abstractC82626Wbm4 != null && (LIZIZ = abstractC82626Wbm4.LIZIZ()) != null && (fS = LIZIZ.fS()) != null) {
                fS.LJFF((InterfaceC29911Fj) this.LJLJI.LJ.getValue());
            }
            if (e instanceof C37321Ekn) {
                ActionExecuteCallback actionExecuteCallback2 = this.LJLJJL;
                if (actionExecuteCallback2 != null) {
                    C37321Ekn c37321Ekn = (C37321Ekn) e;
                    actionExecuteCallback2.onExecuteError(c37321Ekn.getErrorCode(), e.getMessage(), c37321Ekn.getServerErrorInfo());
                }
            } else {
                ActionExecuteCallback actionExecuteCallback3 = this.LJLJJL;
                if (actionExecuteCallback3 != null) {
                    actionExecuteCallback3.onExecuteError(ActionAIErrorCode.SendMsgExecutorError, e.toString(), new ServerErrorInfo());
                }
            }
        }
        if (C3C5.m12isFailureimpl(LIZ)) {
            Throwable m10exceptionOrNullimpl = C3C5.m10exceptionOrNullimpl(LIZ);
            C76732zl c76732zl = new C76732zl();
            c76732zl.element = -1;
            C68322mC c68322mC = new C68322mC();
            c68322mC.element = "";
            if (m10exceptionOrNullimpl instanceof C37321Ekn) {
                ActionExecuteCallback actionExecuteCallback4 = this.LJLJJL;
                if (actionExecuteCallback4 != null) {
                    actionExecuteCallback4.onExecuteError(((C37321Ekn) m10exceptionOrNullimpl).getErrorCode(), ((C37321Ekn) m10exceptionOrNullimpl).getMessage(), ((C37321Ekn) m10exceptionOrNullimpl).getServerErrorInfo());
                }
                ServerErrorInfo serverErrorInfo = ((C37321Ekn) m10exceptionOrNullimpl).getServerErrorInfo();
                if (serverErrorInfo != null) {
                    c76732zl.element = serverErrorInfo.getStatusCode();
                }
                ServerErrorInfo serverErrorInfo2 = ((C37321Ekn) m10exceptionOrNullimpl).getServerErrorInfo();
                if (serverErrorInfo2 != null && (message = serverErrorInfo2.getMessage()) != 0) {
                    c68322mC.element = message;
                }
                C2VQ.LIZ(new C83420Woa(c76732zl, c68322mC, this.LJLJI, currentTimeMillis, this.LJLJJI, m10exceptionOrNullimpl));
            } else {
                ActionExecuteCallback actionExecuteCallback5 = this.LJLJJL;
                if (actionExecuteCallback5 != null) {
                    ActionAIErrorCode actionAIErrorCode = ActionAIErrorCode.SendMsgExecutorError;
                    Throwable m10exceptionOrNullimpl2 = C3C5.m10exceptionOrNullimpl(LIZ);
                    if (m10exceptionOrNullimpl2 == null || (str = m10exceptionOrNullimpl2.getMessage()) == null) {
                        str = "Something error happend";
                    }
                    actionExecuteCallback5.onExecuteError(actionAIErrorCode, str, new ServerErrorInfo());
                }
                C2VQ.LIZ(new C83425Wof(c76732zl, c68322mC, this.LJLJI, currentTimeMillis, this.LJLJJI));
            }
            AbstractC82626Wbm<InterfaceC83402WoI> abstractC82626Wbm5 = this.LJLJI.LIZIZ;
            if (abstractC82626Wbm5 != null && (LIZIZ8 = abstractC82626Wbm5.LIZIZ()) != null) {
                LIZIZ8.eO(new C83361Wnd(EnumC83360Wnc.EXECUTE_FAIL, -1));
            }
            AbstractC82626Wbm<InterfaceC83402WoI> abstractC82626Wbm6 = this.LJLJI.LIZIZ;
            if (abstractC82626Wbm6 != null && (LIZIZ7 = abstractC82626Wbm6.LIZIZ()) != null && (fS5 = LIZIZ7.fS()) != null) {
                fS5.LJFF((InterfaceC29911Fj) this.LJLJI.LJ.getValue());
            }
            return C76800UCe.LIZ;
        }
        if (C3C5.m12isFailureimpl(LIZ)) {
            LIZ = null;
        }
        C83429Woj c83429Woj = (C83429Woj) LIZ;
        if (c83429Woj != null) {
            ActionExecuteCallback actionExecuteCallback6 = this.LJLJJL;
            AbstractC83417WoX abstractC83417WoX4 = this.LJLJI;
            ExecutionContext executionContext2 = this.LJLJJI;
            if (actionExecuteCallback6 != null) {
                ActionResult actionResult = new ActionResult();
                actionResult.setOutputJsonStr((String) c83429Woj.LIZ);
                if (c83429Woj.LIZLLL && (executionContext2 == null || (actionDAG = executionContext2.getActionDAG()) == null || actionDAG.size() <= 2)) {
                    z = true;
                } else {
                    z = false;
                }
                actionResult.setDropEndMsg(z);
                actionExecuteCallback6.onExecuteSuccess(actionResult);
            }
            if (c83429Woj.LIZLLL) {
                C83412WoS.LIZ(true);
            }
            AbstractC82626Wbm<InterfaceC83402WoI> abstractC82626Wbm7 = abstractC83417WoX4.LIZIZ;
            if (abstractC82626Wbm7 != null && (LIZIZ6 = abstractC82626Wbm7.LIZIZ()) != null) {
                LIZIZ6.eO(new C83361Wnd(EnumC83360Wnc.EXECUTE_SUCCESS, 0));
            }
            AbstractC82626Wbm<InterfaceC83402WoI> abstractC82626Wbm8 = abstractC83417WoX4.LIZIZ;
            if (abstractC82626Wbm8 != null && (LIZIZ5 = abstractC82626Wbm8.LIZIZ()) != null && (fS4 = LIZIZ5.fS()) != null) {
                fS4.LJFF((InterfaceC29911Fj) abstractC83417WoX4.LJ.getValue());
            }
            C2VQ.LIZ(new C83424Woe(c83429Woj, abstractC83417WoX4, currentTimeMillis, executionContext2));
        }
        return C76800UCe.LIZ;
    }

    @Override // X.InterfaceC88471Ynr
    public final Object invoke(InterfaceC70422pa interfaceC70422pa, InterfaceC67352kd<? super C76800UCe> interfaceC67352kd) {
        return ((a) create(interfaceC70422pa, interfaceC67352kd)).invokeSuspend(C76800UCe.LIZ);
    }
}
