package X;

import com.ss.android.ugc.aweme.draft.model.AwemeDraft;
import com.ss.android.ugc.aweme.shortvideo.CreateBaseAwemeResponse;
import com.ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel;
import com.ss.android.ugc.aweme.shortvideo.publish.PublishModel;
import fjb.a;

@InterfaceC65848Psq(c = "com.ss.android.ugc.aweme.shortvideo.ShortVideoPublishCallback$handleDraftAndTnsOnPublishSuccess$1", f = "ShortVideoPublishCallback.kt", l = {123, 138}, m = "invokeSuspend")
/* renamed from: X.GPc, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C41464GPc extends AbstractC65782Prm implements InterfaceC88471Ynr<InterfaceC70422pa, InterfaceC67352kd<? super C76800UCe>, Object> {
    public int LJLIL;
    public final /* synthetic */ GVW LJLILLLLZI;
    public final /* synthetic */ VideoPublishEditModel LJLJI;
    public final /* synthetic */ CreateBaseAwemeResponse LJLJJI;
    public final /* synthetic */ AwemeDraft LJLJJL;
    public final /* synthetic */ PublishModel LJLJJLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C41464GPc(GVW gvw, VideoPublishEditModel videoPublishEditModel, CreateBaseAwemeResponse createBaseAwemeResponse, AwemeDraft awemeDraft, PublishModel publishModel, InterfaceC67352kd<? super C41464GPc> interfaceC67352kd) {
        super(2, interfaceC67352kd);
        this.LJLILLLLZI = gvw;
        this.LJLJI = videoPublishEditModel;
        this.LJLJJI = createBaseAwemeResponse;
        this.LJLJJL = awemeDraft;
        this.LJLJJLL = publishModel;
    }

    @Override // fjb.a
    public final InterfaceC67352kd<C76800UCe> create(Object obj, InterfaceC67352kd<?> interfaceC67352kd) {
        return new C41464GPc(this.LJLILLLLZI, this.LJLJI, this.LJLJJI, this.LJLJJL, this.LJLJJLL, interfaceC67352kd);
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x009b A[RETURN] */
    @Override // fjb.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r18) {
        /*
            Method dump skipped, instructions count: 275
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C41464GPc.invokeSuspend(java.lang.Object):java.lang.Object");
    }

    @Override // X.InterfaceC88471Ynr
    public final Object invoke(InterfaceC70422pa interfaceC70422pa, InterfaceC67352kd<? super C76800UCe> interfaceC67352kd) {
        return ((a) create(interfaceC70422pa, interfaceC67352kd)).invokeSuspend(C76800UCe.LIZ);
    }
}
