package X;

import com.bytedance.android.livesdk.unityanimation.widget.EventAreaUnityAnimationWidget;
import fjb.a;

@InterfaceC65848Psq(c = "com.bytedance.android.livesdk.unityanimation.widget.EventAreaUnityAnimationWidget$checkQueue$job$1", f = "EventAreaUnityAnimationWidget.kt", l = {178}, m = "invokeSuspend")
/* loaded from: classes13.dex */
public final class T3F extends AbstractC65782Prm implements InterfaceC88471Ynr<InterfaceC70422pa, InterfaceC67352kd<? super C76800UCe>, Object> {
    public int LJLIL;
    public final /* synthetic */ T3I LJLILLLLZI;
    public final /* synthetic */ EventAreaUnityAnimationWidget LJLJI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public T3F(T3I t3i, EventAreaUnityAnimationWidget eventAreaUnityAnimationWidget, InterfaceC67352kd<? super T3F> interfaceC67352kd) {
        super(2, interfaceC67352kd);
        this.LJLILLLLZI = t3i;
        this.LJLJI = eventAreaUnityAnimationWidget;
    }

    @Override // fjb.a
    public final InterfaceC67352kd<C76800UCe> create(Object obj, InterfaceC67352kd<?> interfaceC67352kd) {
        return new T3F(this.LJLILLLLZI, this.LJLJI, interfaceC67352kd);
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
            StringBuilder LIZIZ = C43881HKb.LIZIZ(obj, "start delay timeout job:");
            LIZIZ.append(this.LJLILLLLZI.LJLIL);
            LIZIZ.append("  delay time :");
            LIZIZ.append(((Number) this.LJLILLLLZI.LJLJJL.getValue()).intValue());
            LIZIZ.append('s');
            C0NB.LIZIZ("EventAreaUnityAnimationWidget", X1D.LIZIZ(LIZIZ));
            long intValue = ((Number) this.LJLILLLLZI.LJLJJL.getValue()).intValue() * 1000;
            this.LJLIL = 1;
            if (C1JD.LIZJ(intValue, this) == enumC58928NAu) {
                return enumC58928NAu;
            }
        }
        this.LJLJI.LJZI().remove(this.LJLILLLLZI);
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("timeout remove: ");
        C31811Ce7.LJ(LIZ, this.LJLILLLLZI.LJLIL, LIZ, "EventAreaUnityAnimationWidget");
        this.LJLJI.LJLZ();
        return C76800UCe.LIZ;
    }

    @Override // X.InterfaceC88471Ynr
    public final Object invoke(InterfaceC70422pa interfaceC70422pa, InterfaceC67352kd<? super C76800UCe> interfaceC67352kd) {
        return ((a) create(interfaceC70422pa, interfaceC67352kd)).invokeSuspend(C76800UCe.LIZ);
    }
}
