package X;

import com.bytedance.effectcreatormobile.ckeapi.api.objectselect.PrefabPanel;
import com.bytedance.effectcreatormobile.objectselect.impl.PrefabPanelImpl;
import fjb.a;
import kotlin.jvm.internal.o;

@InterfaceC65848Psq(c = "com.bytedance.effectcreatormobile.objectselect.prefab.PrefabContainerFragment$onDestroyView$1", f = "PrefabContainerFragment.kt", l = {80}, m = "invokeSuspend")
/* renamed from: X.amF, reason: case insensitive filesystem */
/* loaded from: classes34.dex */
public final class C94763amF extends AbstractC65782Prm implements InterfaceC88471Ynr<InterfaceC70422pa, InterfaceC67352kd<? super C76800UCe>, Object> {
    public int LJLIL;

    public C94763amF(InterfaceC67352kd interfaceC67352kd) {
        super(2, interfaceC67352kd);
    }

    @Override // fjb.a
    public final InterfaceC67352kd<C76800UCe> create(Object obj, InterfaceC67352kd<?> completion) {
        o.LJIIIZ(completion, "completion");
        return new C94763amF(completion);
    }

    @Override // X.InterfaceC88471Ynr
    public final Object invoke(InterfaceC70422pa interfaceC70422pa, InterfaceC67352kd<? super C76800UCe> interfaceC67352kd) {
        return ((a) create(interfaceC70422pa, interfaceC67352kd)).invokeSuspend(C76800UCe.LIZ);
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
            C33R<EnumC93821aX3> prefabPanelState = ((PrefabPanelImpl) C93745aVp.LIZ(PrefabPanel.class)).getPrefabPanelState();
            EnumC93821aX3 enumC93821aX3 = EnumC93821aX3.DISMISS;
            this.LJLIL = 1;
            if (prefabPanelState.emit(enumC93821aX3, this) == enumC58928NAu) {
                return enumC58928NAu;
            }
        }
        return C76800UCe.LIZ;
    }
}
