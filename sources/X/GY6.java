package X;

import com.ss.android.ugc.aweme.canvas.ForwardVideo;
import fjb.a;

@InterfaceC65848Psq(c = "com.ss.android.ugc.gamora.editor.lightening.canvas.forward.QuickForwardResolver$restoreCanvasResource$1$downloadVideoTask$1", f = "QuickForwardResolver.kt", l = {275}, m = "invokeSuspend")
/* loaded from: classes8.dex */
public final class GY6 extends AbstractC65782Prm implements InterfaceC88471Ynr<InterfaceC70422pa, InterfaceC67352kd<? super GY8>, Object> {
    public int LJLIL;
    public final /* synthetic */ ForwardVideo LJLILLLLZI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public GY6(ForwardVideo forwardVideo, InterfaceC67352kd<? super GY6> interfaceC67352kd) {
        super(2, interfaceC67352kd);
        this.LJLILLLLZI = forwardVideo;
    }

    @Override // fjb.a
    public final InterfaceC67352kd<C76800UCe> create(Object obj, InterfaceC67352kd<?> interfaceC67352kd) {
        return new GY6(this.LJLILLLLZI, interfaceC67352kd);
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
            ForwardVideo forwardVideo = this.LJLILLLLZI;
            GZB gzb = new GZB(forwardVideo, C41719GYx.LIZ(forwardVideo, true));
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
