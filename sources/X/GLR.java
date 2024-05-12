package X;

import com.ss.android.ugc.aweme.draft.model.AwemeDraft;
import fjb.a;

@InterfaceC65848Psq(c = "com.ss.android.ugc.aweme.external.AVDraftServiceImpl$editPostedDraft$1$draft$1", f = "AVDraftServiceImpl.kt", l = {}, m = "invokeSuspend")
/* loaded from: classes8.dex */
public final class GLR extends AbstractC65782Prm implements InterfaceC88471Ynr<InterfaceC70422pa, InterfaceC67352kd<? super AwemeDraft>, Object> {
    public final /* synthetic */ String LJLIL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public GLR(String str, InterfaceC67352kd<? super GLR> interfaceC67352kd) {
        super(2, interfaceC67352kd);
        this.LJLIL = str;
    }

    @Override // fjb.a
    public final InterfaceC67352kd<C76800UCe> create(Object obj, InterfaceC67352kd<?> interfaceC67352kd) {
        return new GLR(this.LJLIL, interfaceC67352kd);
    }

    @Override // fjb.a
    public final Object invokeSuspend(Object obj) {
        C141335gf.LIZJ(obj);
        return C60903NvH.LJIIJJI().LJJJI().LIZJ().LIZJ(this.LJLIL);
    }

    @Override // X.InterfaceC88471Ynr
    public final Object invoke(InterfaceC70422pa interfaceC70422pa, InterfaceC67352kd<? super AwemeDraft> interfaceC67352kd) {
        return ((a) create(interfaceC70422pa, interfaceC67352kd)).invokeSuspend(C76800UCe.LIZ);
    }
}
