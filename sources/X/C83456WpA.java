package X;

import com.bytedance.ies.actionai.jni.ActionExecuteCallback;
import com.ss.android.ugc.aweme.actionai.action.data.ActionAITemplateData;
import fjb.a;

@InterfaceC65848Psq(c = "com.ss.android.ugc.aweme.actionai.action.microaction.template.AutoCutChangeOneAction$selectionUIMicroAction$1$onChange$result$1", f = "AutoCutChangeOneAction.kt", l = {51}, m = "invokeSuspend")
/* renamed from: X.WpA, reason: case insensitive filesystem */
/* loaded from: classes15.dex */
public final class C83456WpA extends AbstractC65782Prm implements InterfaceC88471Ynr<InterfaceC70422pa, InterfaceC67352kd<? super C3C5<? extends C83429Woj<String>>>, Object> {
    public int LJLIL;
    public final /* synthetic */ C83454Wp8 LJLILLLLZI;
    public final /* synthetic */ ActionExecuteCallback LJLJI;
    public final /* synthetic */ C45241HpF<ActionAITemplateData> LJLJJI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C83456WpA(C83454Wp8 c83454Wp8, ActionExecuteCallback actionExecuteCallback, C45241HpF<ActionAITemplateData> c45241HpF, InterfaceC67352kd<? super C83456WpA> interfaceC67352kd) {
        super(2, interfaceC67352kd);
        this.LJLILLLLZI = c83454Wp8;
        this.LJLJI = actionExecuteCallback;
        this.LJLJJI = c45241HpF;
    }

    @Override // fjb.a
    public final InterfaceC67352kd<C76800UCe> create(Object obj, InterfaceC67352kd<?> interfaceC67352kd) {
        return new C83456WpA(this.LJLILLLLZI, this.LJLJI, this.LJLJJI, interfaceC67352kd);
    }

    @Override // fjb.a
    public final Object invokeSuspend(Object obj) {
        Object LIZJ;
        EnumC58928NAu enumC58928NAu = EnumC58928NAu.COROUTINE_SUSPENDED;
        int i = this.LJLIL;
        if (i != 0) {
            if (i == 1) {
                C141335gf.LIZJ(obj);
                LIZJ = ((C3C5) obj).m15unboximpl();
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            C141335gf.LIZJ(obj);
            C45233Hp7 c45233Hp7 = (C45233Hp7) this.LJLILLLLZI.LJII.getValue();
            C45241HpF<ActionAITemplateData> c45241HpF = this.LJLJJI;
            this.LJLIL = 1;
            LIZJ = c45233Hp7.LIZJ(c45241HpF, this);
            if (LIZJ == enumC58928NAu) {
                return enumC58928NAu;
            }
        }
        return C3C5.m6boximpl(LIZJ);
    }

    @Override // X.InterfaceC88471Ynr
    public final Object invoke(InterfaceC70422pa interfaceC70422pa, InterfaceC67352kd<? super C3C5<? extends C83429Woj<String>>> interfaceC67352kd) {
        return ((a) create(interfaceC70422pa, interfaceC67352kd)).invokeSuspend(C76800UCe.LIZ);
    }
}
