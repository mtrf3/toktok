package X;

import com.bytedance.android.livesdk.livesetting.broadcast.LiveTryModeCountDownThresholdSetting;
import com.bytedance.effectcreatormobile.behaviour.BehaviourImpl;
import fjb.a;
import kotlin.jvm.internal.o;

@InterfaceC65848Psq(c = "com.bytedance.effectcreatormobile.behaviour.view.preview.BehaviourPreviewFragment$notifyValidCommandAdded$2", f = "BehaviourPreviewFragment.kt", l = {LiveTryModeCountDownThresholdSetting.DEFAULT}, m = "invokeSuspend")
/* renamed from: X.anf, reason: case insensitive filesystem */
/* loaded from: classes34.dex */
public final class C94851anf extends AbstractC65782Prm implements InterfaceC88471Ynr<InterfaceC70422pa, InterfaceC67352kd<? super C76800UCe>, Object> {
    public int LJLIL;

    public C94851anf(InterfaceC67352kd interfaceC67352kd) {
        super(2, interfaceC67352kd);
    }

    @Override // fjb.a
    public final InterfaceC67352kd<C76800UCe> create(Object obj, InterfaceC67352kd<?> completion) {
        o.LJIIIZ(completion, "completion");
        return new C94851anf(completion);
    }

    @Override // X.InterfaceC88471Ynr
    public final Object invoke(InterfaceC70422pa interfaceC70422pa, InterfaceC67352kd<? super C76800UCe> interfaceC67352kd) {
        return ((a) create(interfaceC70422pa, interfaceC67352kd)).invokeSuspend(C76800UCe.LIZ);
    }

    @Override // fjb.a
    public final Object invokeSuspend(Object obj) {
        C3BJ<C76800UCe> validCommandAddedEvent;
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
            BehaviourImpl LIZIZ = C94048aai.LIZIZ();
            if (LIZIZ != null && (validCommandAddedEvent = LIZIZ.getValidCommandAddedEvent()) != null) {
                C76800UCe c76800UCe = C76800UCe.LIZ;
                this.LJLIL = 1;
                if (validCommandAddedEvent.emit(c76800UCe, this) == enumC58928NAu) {
                    return enumC58928NAu;
                }
            }
        }
        return C76800UCe.LIZ;
    }
}
