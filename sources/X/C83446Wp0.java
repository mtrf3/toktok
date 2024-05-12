package X;

import com.bytedance.ies.actionai.jni.ActionExecuteCallback;
import com.ss.android.ugc.aweme.actionai.action.data.ActionAIMusicInfoList;
import fjb.a;

@InterfaceC65848Psq(c = "com.ss.android.ugc.aweme.actionai.action.microaction.music.MusicApplyOneAction$selectionUIMicroAction$1$onChange$result$1", f = "MusicApplyOneAction.kt", l = {C61447O9r.LJIIJ}, m = "invokeSuspend")
/* renamed from: X.Wp0, reason: case insensitive filesystem */
/* loaded from: classes15.dex */
public final class C83446Wp0 extends AbstractC65782Prm implements InterfaceC88471Ynr<InterfaceC70422pa, InterfaceC67352kd<? super C3C5<? extends C83429Woj<String>>>, Object> {
    public int LJLIL;
    public final /* synthetic */ C83444Woy LJLILLLLZI;
    public final /* synthetic */ ActionExecuteCallback LJLJI;
    public final /* synthetic */ C45241HpF<ActionAIMusicInfoList> LJLJJI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C83446Wp0(C83444Woy c83444Woy, ActionExecuteCallback actionExecuteCallback, C45241HpF<ActionAIMusicInfoList> c45241HpF, InterfaceC67352kd<? super C83446Wp0> interfaceC67352kd) {
        super(2, interfaceC67352kd);
        this.LJLILLLLZI = c83444Woy;
        this.LJLJI = actionExecuteCallback;
        this.LJLJJI = c45241HpF;
    }

    @Override // fjb.a
    public final InterfaceC67352kd<C76800UCe> create(Object obj, InterfaceC67352kd<?> interfaceC67352kd) {
        return new C83446Wp0(this.LJLILLLLZI, this.LJLJI, this.LJLJJI, interfaceC67352kd);
    }

    @Override // fjb.a
    public final Object invokeSuspend(Object obj) {
        Object LIZLLL;
        EnumC58928NAu enumC58928NAu = EnumC58928NAu.COROUTINE_SUSPENDED;
        int i = this.LJLIL;
        if (i != 0) {
            if (i == 1) {
                C141335gf.LIZJ(obj);
                LIZLLL = ((C3C5) obj).m15unboximpl();
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            C141335gf.LIZJ(obj);
            C45323HqZ c45323HqZ = (C45323HqZ) this.LJLILLLLZI.LJII.getValue();
            C45241HpF<ActionAIMusicInfoList> c45241HpF = this.LJLJJI;
            this.LJLIL = 1;
            LIZLLL = c45323HqZ.LIZLLL(c45241HpF, this);
            if (LIZLLL == enumC58928NAu) {
                return enumC58928NAu;
            }
        }
        return C3C5.m6boximpl(LIZLLL);
    }

    @Override // X.InterfaceC88471Ynr
    public final Object invoke(InterfaceC70422pa interfaceC70422pa, InterfaceC67352kd<? super C3C5<? extends C83429Woj<String>>> interfaceC67352kd) {
        return ((a) create(interfaceC70422pa, interfaceC67352kd)).invokeSuspend(C76800UCe.LIZ);
    }
}
