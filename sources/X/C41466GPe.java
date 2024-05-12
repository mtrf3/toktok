package X;

import com.ss.android.ugc.aweme.draft.model.AwemeDraft;
import com.ss.android.ugc.aweme.shortvideo.CreateBaseAwemeResponse;
import com.ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel;
import fjb.a;

@InterfaceC65848Psq(c = "com.ss.android.ugc.aweme.shortvideo.ShortVideoPublishCallback$handleTnsWhenPublishSuccess$2", f = "ShortVideoPublishCallback.kt", l = {}, m = "invokeSuspend")
/* renamed from: X.GPe, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C41466GPe extends AbstractC65782Prm implements InterfaceC88471Ynr<InterfaceC70422pa, InterfaceC67352kd<? super C76800UCe>, Object> {
    public final /* synthetic */ CreateBaseAwemeResponse LJLIL;
    public final /* synthetic */ VideoPublishEditModel LJLILLLLZI;
    public final /* synthetic */ GVW LJLJI;
    public final /* synthetic */ AwemeDraft LJLJJI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C41466GPe(AwemeDraft awemeDraft, CreateBaseAwemeResponse createBaseAwemeResponse, GVW gvw, VideoPublishEditModel videoPublishEditModel, InterfaceC67352kd interfaceC67352kd) {
        super(2, interfaceC67352kd);
        this.LJLIL = createBaseAwemeResponse;
        this.LJLILLLLZI = videoPublishEditModel;
        this.LJLJI = gvw;
        this.LJLJJI = awemeDraft;
    }

    @Override // fjb.a
    public final InterfaceC67352kd<C76800UCe> create(Object obj, InterfaceC67352kd<?> interfaceC67352kd) {
        CreateBaseAwemeResponse createBaseAwemeResponse = this.LJLIL;
        VideoPublishEditModel videoPublishEditModel = this.LJLILLLLZI;
        return new C41466GPe(this.LJLJJI, createBaseAwemeResponse, this.LJLJI, videoPublishEditModel, interfaceC67352kd);
    }

    @Override // fjb.a
    public final Object invokeSuspend(Object obj) {
        C141335gf.LIZJ(obj);
        C78934UyQ.LJLIL.LJIIIZ();
        HG3.LJIILJJIL(this.LJLIL, this.LJLILLLLZI, this.LJLJI.LJLJI);
        C78934UyQ.LJLIL.LJIIIZ().LJIILIIL(this.LJLIL, this.LJLILLLLZI, this.LJLJI.LJLJI);
        this.LJLJI.LJLJI.await();
        C78934UyQ.LJLIL.LJIIIZ().LJI(this.LJLILLLLZI);
        return C76800UCe.LIZ;
    }

    @Override // X.InterfaceC88471Ynr
    public final Object invoke(InterfaceC70422pa interfaceC70422pa, InterfaceC67352kd<? super C76800UCe> interfaceC67352kd) {
        return ((a) create(interfaceC70422pa, interfaceC67352kd)).invokeSuspend(C76800UCe.LIZ);
    }
}
