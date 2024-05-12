package X;

import android.graphics.Bitmap;
import com.ss.android.ugc.aweme.initializer.AVServiceProxyImpl;
import com.ss.android.ugc.aweme.services.story.forward.ForwardMedia;
import com.ss.android.ugc.aweme.story.IStoryService;
import fjb.a;

@InterfaceC65848Psq(c = "com.ss.android.ugc.gamora.editor.lightening.canvas.forward.QuickForwardResolver$resolve$job$1$extractSourceCoverTask$1", f = "QuickForwardResolver.kt", l = {136, 141}, m = "invokeSuspend")
/* loaded from: classes8.dex */
public final class GYC extends AbstractC65782Prm implements InterfaceC88471Ynr<InterfaceC70422pa, InterfaceC67352kd<? super Bitmap>, Object> {
    public int LJLIL;
    public final /* synthetic */ InterfaceC68342mE<GY8> LJLILLLLZI;
    public final /* synthetic */ ForwardMedia LJLJI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public GYC(InterfaceC68342mE<GY8> interfaceC68342mE, ForwardMedia forwardMedia, InterfaceC67352kd<? super GYC> interfaceC67352kd) {
        super(2, interfaceC67352kd);
        this.LJLILLLLZI = interfaceC68342mE;
        this.LJLJI = forwardMedia;
    }

    @Override // fjb.a
    public final InterfaceC67352kd<C76800UCe> create(Object obj, InterfaceC67352kd<?> interfaceC67352kd) {
        return new GYC(this.LJLILLLLZI, this.LJLJI, interfaceC67352kd);
    }

    @Override // fjb.a
    public final Object invokeSuspend(Object obj) {
        EnumC58928NAu enumC58928NAu = EnumC58928NAu.COROUTINE_SUSPENDED;
        int i = this.LJLIL;
        if (i != 0) {
            if (i != 1) {
                if (i == 2) {
                    C141335gf.LIZJ(obj);
                    return obj;
                }
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            C141335gf.LIZJ(obj);
        } else {
            C141335gf.LIZJ(obj);
            InterfaceC68342mE<GY8> interfaceC68342mE = this.LJLILLLLZI;
            this.LJLIL = 1;
            obj = interfaceC68342mE.LJI(this);
            if (obj == enumC58928NAu) {
                return enumC58928NAu;
            }
        }
        String str = ((GY8) obj).LIZ;
        float min = Math.min(this.LJLJI.getVideo().getSourceWidth() / 720.0f, this.LJLJI.getVideo().getSourceHeight() / 720.0f);
        if (min <= 1.0f) {
            min = 1.0f;
        }
        int sourceWidth = (int) (this.LJLJI.getVideo().getSourceWidth() / min);
        int sourceHeight = (int) (this.LJLJI.getVideo().getSourceHeight() / min);
        C41842GbW c41842GbW = new C41842GbW();
        C41841GbV c41841GbV = new C41841GbV(str, this.LJLJI, sourceWidth, sourceHeight, ((IStoryService) ((C43119Gw7) AVServiceProxyImpl.createIAVServiceProxybyMonsterPlugin(false).getStoryService()).LIZ.get()).LJII().LJIIIIZZ());
        this.LJLIL = 2;
        obj = AbstractC41806Gaw.LIZ(c41842GbW, c41841GbV, this);
        if (obj != enumC58928NAu) {
            return obj;
        }
        return enumC58928NAu;
    }

    @Override // X.InterfaceC88471Ynr
    public final Object invoke(InterfaceC70422pa interfaceC70422pa, InterfaceC67352kd<? super Bitmap> interfaceC67352kd) {
        return ((a) create(interfaceC70422pa, interfaceC67352kd)).invokeSuspend(C76800UCe.LIZ);
    }
}
