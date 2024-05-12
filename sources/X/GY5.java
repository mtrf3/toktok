package X;

import com.ss.android.ugc.aweme.services.story.forward.ForwardMedia;
import fjb.a;

@InterfaceC65848Psq(c = "com.ss.android.ugc.gamora.editor.lightening.canvas.forward.QuickForwardResolver$resolve$job$1$downloadVideoTask$1", f = "QuickForwardResolver.kt", l = {128}, m = "invokeSuspend")
/* loaded from: classes8.dex */
public final class GY5 extends AbstractC65782Prm implements InterfaceC88471Ynr<InterfaceC70422pa, InterfaceC67352kd<? super GY8>, Object> {
    public int LJLIL;
    public final /* synthetic */ ForwardMedia LJLILLLLZI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public GY5(ForwardMedia forwardMedia, InterfaceC67352kd<? super GY5> interfaceC67352kd) {
        super(2, interfaceC67352kd);
        this.LJLILLLLZI = forwardMedia;
    }

    @Override // fjb.a
    public final InterfaceC67352kd<C76800UCe> create(Object obj, InterfaceC67352kd<?> interfaceC67352kd) {
        return new GY5(this.LJLILLLLZI, interfaceC67352kd);
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
            GZ6 gz6 = new GZ6();
            GZB gzb = new GZB(this.LJLILLLLZI.getVideo(), C41719GYx.LIZ(this.LJLILLLLZI.getVideo(), !C169656lF.LIZ));
            this.LJLIL = 1;
            obj = AbstractC41806Gaw.LIZ(gz6, gzb, this);
            if (obj == enumC58928NAu) {
                return enumC58928NAu;
            }
        }
        return obj;
    }

    @Override // X.InterfaceC88471Ynr
    public final Object invoke(InterfaceC70422pa interfaceC70422pa, InterfaceC67352kd<? super GY8> interfaceC67352kd) {
        return ((a) create(interfaceC70422pa, interfaceC67352kd)).invokeSuspend(C76800UCe.LIZ);
    }
}
