package X;

import com.ss.android.ugc.aweme.draft.model.AwemeDraft;
import com.ss.android.ugc.aweme.shortvideo.CreateBaseAwemeResponse;
import com.ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel;
import fjb.a;

@InterfaceC65848Psq(c = "com.ss.android.ugc.aweme.shortvideo.ShortVideoPublishCallback$handleDraftAndTnsOnPublishSuccess$1$4", f = "ShortVideoPublishCallback.kt", l = {144}, m = "invokeSuspend")
/* renamed from: X.GPd, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C41465GPd extends AbstractC65782Prm implements InterfaceC88472Yns<InterfaceC67352kd<? super C76800UCe>, Object> {
    public int LJLIL;
    public final /* synthetic */ GVW LJLILLLLZI;
    public final /* synthetic */ VideoPublishEditModel LJLJI;
    public final /* synthetic */ CreateBaseAwemeResponse LJLJJI;
    public final /* synthetic */ AwemeDraft LJLJJL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C41465GPd(AwemeDraft awemeDraft, CreateBaseAwemeResponse createBaseAwemeResponse, GVW gvw, VideoPublishEditModel videoPublishEditModel, InterfaceC67352kd interfaceC67352kd) {
        super(1, interfaceC67352kd);
        this.LJLILLLLZI = gvw;
        this.LJLJI = videoPublishEditModel;
        this.LJLJJI = createBaseAwemeResponse;
        this.LJLJJL = awemeDraft;
    }

    @Override // fjb.a
    public final InterfaceC67352kd<C76800UCe> create(InterfaceC67352kd<?> interfaceC67352kd) {
        GVW gvw = this.LJLILLLLZI;
        VideoPublishEditModel videoPublishEditModel = this.LJLJI;
        return new C41465GPd(this.LJLJJL, this.LJLJJI, gvw, videoPublishEditModel, interfaceC67352kd);
    }

    @Override // X.InterfaceC88472Yns
    public final Object invoke(InterfaceC67352kd<? super C76800UCe> interfaceC67352kd) {
        return ((a) create(interfaceC67352kd)).invokeSuspend(C76800UCe.LIZ);
    }

    @Override // fjb.a
    public final Object invokeSuspend(Object obj) {
        Object obj2 = EnumC58928NAu.COROUTINE_SUSPENDED;
        int i = this.LJLIL;
        if (i != 0) {
            if (i == 1) {
                C141335gf.LIZJ(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            C141335gf.LIZJ(obj);
            GVW gvw = this.LJLILLLLZI;
            VideoPublishEditModel videoPublishEditModel = this.LJLJI;
            CreateBaseAwemeResponse createBaseAwemeResponse = this.LJLJJI;
            AwemeDraft awemeDraft = this.LJLJJL;
            this.LJLIL = 1;
            gvw.getClass();
            Object LJI = XKX.LJI(C78613UtF.LIZJ, new C41466GPe(awemeDraft, createBaseAwemeResponse, gvw, videoPublishEditModel, null), this);
            if (LJI != obj2) {
                LJI = C76800UCe.LIZ;
            }
            if (LJI == obj2) {
                return obj2;
            }
        }
        return C76800UCe.LIZ;
    }
}
