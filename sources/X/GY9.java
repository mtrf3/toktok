package X;

import android.content.Context;
import com.ss.android.ugc.aweme.creative.CreativeInfo;
import com.ss.android.ugc.aweme.services.story.forward.ForwardMedia;
import fjb.a;

@InterfaceC65848Psq(c = "com.ss.android.ugc.gamora.editor.lightening.canvas.forward.QuickForwardResolver$resolve$job$1$generateNickNameStickerTask$1", f = "QuickForwardResolver.kt", l = {151}, m = "invokeSuspend")
/* loaded from: classes8.dex */
public final class GY9 extends AbstractC65782Prm implements InterfaceC88471Ynr<InterfaceC70422pa, InterfaceC67352kd<? super GZX>, Object> {
    public int LJLIL;
    public final /* synthetic */ Context LJLILLLLZI;
    public final /* synthetic */ CreativeInfo LJLJI;
    public final /* synthetic */ ForwardMedia LJLJJI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public GY9(Context context, CreativeInfo creativeInfo, ForwardMedia forwardMedia, InterfaceC67352kd<? super GY9> interfaceC67352kd) {
        super(2, interfaceC67352kd);
        this.LJLILLLLZI = context;
        this.LJLJI = creativeInfo;
        this.LJLJJI = forwardMedia;
    }

    @Override // fjb.a
    public final InterfaceC67352kd<C76800UCe> create(Object obj, InterfaceC67352kd<?> interfaceC67352kd) {
        return new GY9(this.LJLILLLLZI, this.LJLJI, this.LJLJJI, interfaceC67352kd);
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
            GZV gzv = new GZV();
            GYA gya = new GYA(this.LJLILLLLZI, this.LJLJI, GYP.LIZIZ(this.LJLJJI.getAuthor()), C2311395h.LIZ(), new OSZ(new Integer(this.LJLJJI.getVideo().getSourceWidth()), new Integer(this.LJLJJI.getVideo().getSourceHeight())));
            this.LJLIL = 1;
            obj = AbstractC41806Gaw.LIZ(gzv, gya, this);
            if (obj == enumC58928NAu) {
                return enumC58928NAu;
            }
        }
        return obj;
    }

    @Override // X.InterfaceC88471Ynr
    public final Object invoke(InterfaceC70422pa interfaceC70422pa, InterfaceC67352kd<? super GZX> interfaceC67352kd) {
        return ((a) create(interfaceC70422pa, interfaceC67352kd)).invokeSuspend(C76800UCe.LIZ);
    }
}
