package X;

import com.ugc.effectcreator.canvas.CanvasImpl;
import fjb.a;
import kotlin.jvm.internal.o;

@InterfaceC65848Psq(c = "com.ugc.effectcreator.canvas.CanvasImpl$updateGestureEvent$1", f = "CanvasImpl.kt", l = {37}, m = "invokeSuspend")
/* renamed from: X.an6, reason: case insensitive filesystem */
/* loaded from: classes34.dex */
public final class C94816an6 extends AbstractC65782Prm implements InterfaceC88471Ynr<InterfaceC70422pa, InterfaceC67352kd<? super C76800UCe>, Object> {
    public int LJLIL;
    public final /* synthetic */ CanvasImpl LJLILLLLZI;
    public final /* synthetic */ C93485aRd LJLJI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C94816an6(CanvasImpl canvasImpl, C93485aRd c93485aRd, InterfaceC67352kd interfaceC67352kd) {
        super(2, interfaceC67352kd);
        this.LJLILLLLZI = canvasImpl;
        this.LJLJI = c93485aRd;
    }

    @Override // fjb.a
    public final InterfaceC67352kd<C76800UCe> create(Object obj, InterfaceC67352kd<?> completion) {
        o.LJIIIZ(completion, "completion");
        return new C94816an6(this.LJLILLLLZI, this.LJLJI, completion);
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
            C3BJ<C93485aRd> c3bj = this.LJLILLLLZI.gestureOperateData;
            C93485aRd c93485aRd = this.LJLJI;
            this.LJLIL = 1;
            if (c3bj.emit(c93485aRd, this) == enumC58928NAu) {
                return enumC58928NAu;
            }
        }
        return C76800UCe.LIZ;
    }
}
