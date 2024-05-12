package X;

import com.ugc.effectcreator.canvas.CanvasImpl;
import fjb.a;
import kotlin.jvm.internal.o;

@InterfaceC65848Psq(c = "com.ugc.effectcreator.canvas.CanvasImpl$operateFeature$1", f = "CanvasImpl.kt", l = {47}, m = "invokeSuspend")
/* renamed from: X.an5, reason: case insensitive filesystem */
/* loaded from: classes34.dex */
public final class C94815an5 extends AbstractC65782Prm implements InterfaceC88471Ynr<InterfaceC70422pa, InterfaceC67352kd<? super C76800UCe>, Object> {
    public int LJLIL;
    public final /* synthetic */ CanvasImpl LJLILLLLZI;
    public final /* synthetic */ long LJLJI;
    public final /* synthetic */ EnumC93483aRb LJLJJI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C94815an5(CanvasImpl canvasImpl, long j, EnumC93483aRb enumC93483aRb, InterfaceC67352kd interfaceC67352kd) {
        super(2, interfaceC67352kd);
        this.LJLILLLLZI = canvasImpl;
        this.LJLJI = j;
        this.LJLJJI = enumC93483aRb;
    }

    @Override // fjb.a
    public final InterfaceC67352kd<C76800UCe> create(Object obj, InterfaceC67352kd<?> completion) {
        o.LJIIIZ(completion, "completion");
        return new C94815an5(this.LJLILLLLZI, this.LJLJI, this.LJLJJI, completion);
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
            C3BJ<C93484aRc> c3bj = this.LJLILLLLZI.featureOperateData;
            C93484aRc c93484aRc = new C93484aRc(this.LJLJI, this.LJLJJI);
            this.LJLIL = 1;
            if (c3bj.emit(c93484aRc, this) == enumC58928NAu) {
                return enumC58928NAu;
            }
        }
        return C76800UCe.LIZ;
    }
}
