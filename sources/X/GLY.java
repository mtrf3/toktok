package X;

import com.ss.android.ugc.aweme.creative.model.ForwardEditPublishData;
import com.ss.android.ugc.aweme.draft.model.AwemeDraft;
import com.ss.android.ugc.aweme.out.AVExternalServiceImpl;
import com.ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel;
import fjb.a;

@InterfaceC65848Psq(c = "com.ss.android.ugc.gamora.editor.lightening.canvas.forward.QuickForwardResolver$discardPublishTask$1", f = "QuickForwardResolver.kt", l = {323}, m = "invokeSuspend")
/* loaded from: classes8.dex */
public final class GLY extends AbstractC65782Prm implements InterfaceC88471Ynr<InterfaceC70422pa, InterfaceC67352kd<? super C76800UCe>, Object> {
    public int LJLIL;
    public final /* synthetic */ VideoPublishEditModel LJLILLLLZI;
    public final /* synthetic */ ForwardEditPublishData LJLJI;
    public final /* synthetic */ boolean LJLJJI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public GLY(VideoPublishEditModel videoPublishEditModel, ForwardEditPublishData forwardEditPublishData, boolean z, InterfaceC67352kd<? super GLY> interfaceC67352kd) {
        super(2, interfaceC67352kd);
        this.LJLILLLLZI = videoPublishEditModel;
        this.LJLJI = forwardEditPublishData;
        this.LJLJJI = z;
    }

    @Override // fjb.a
    public final InterfaceC67352kd<C76800UCe> create(Object obj, InterfaceC67352kd<?> interfaceC67352kd) {
        return new GLY(this.LJLILLLLZI, this.LJLJI, this.LJLJJI, interfaceC67352kd);
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
            new C43542H7a("quit_edit");
            AwemeDraft LIZLLL = C43542H7a.LIZLLL(this.LJLILLLLZI);
            AVExternalServiceImpl.LIZ().publishService().cancelPublish(this.LJLJI.publishId, new C41359GLb("discard", true, null, 4));
            if (this.LJLJJI) {
                InterfaceC41392GMi LJFF = C60903NvH.LJIIJJI().LJJJI().LJFF();
                GPP gpp = new GPP(LIZLLL, new C41360GLc("quit_edit"), null, null, 60);
                this.LJLIL = 1;
                if (LJFF.LJFF(gpp, this) == enumC58928NAu) {
                    return enumC58928NAu;
                }
            }
        }
        return C76800UCe.LIZ;
    }

    @Override // X.InterfaceC88471Ynr
    public final Object invoke(InterfaceC70422pa interfaceC70422pa, InterfaceC67352kd<? super C76800UCe> interfaceC67352kd) {
        return ((a) create(interfaceC70422pa, interfaceC67352kd)).invokeSuspend(C76800UCe.LIZ);
    }
}
