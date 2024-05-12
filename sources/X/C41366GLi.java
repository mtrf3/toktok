package X;

import com.ss.android.ugc.aweme.creative.CreativeInfo;
import com.ss.android.ugc.aweme.draft.model.AwemeDraft;
import com.ss.android.ugc.aweme.shortvideo.recoverpanel.PublishFailureReason;
import fjb.a;

@InterfaceC65848Psq(c = "com.ss.android.ugc.aweme.publishpreview.PublishPreviewManager$retryPublish$1", f = "PublishPreviewManager.kt", l = {}, m = "invokeSuspend")
/* renamed from: X.GLi, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C41366GLi extends AbstractC65782Prm implements InterfaceC88471Ynr<InterfaceC70422pa, InterfaceC67352kd<? super C76800UCe>, Object> {
    public final /* synthetic */ C224578rd LJLIL;
    public final /* synthetic */ ActivityC45651qj LJLILLLLZI;
    public final /* synthetic */ PublishFailureReason LJLJI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C41366GLi(C224578rd c224578rd, ActivityC45651qj activityC45651qj, PublishFailureReason publishFailureReason, InterfaceC67352kd<? super C41366GLi> interfaceC67352kd) {
        super(2, interfaceC67352kd);
        this.LJLIL = c224578rd;
        this.LJLILLLLZI = activityC45651qj;
        this.LJLJI = publishFailureReason;
    }

    @Override // fjb.a
    public final InterfaceC67352kd<C76800UCe> create(Object obj, InterfaceC67352kd<?> interfaceC67352kd) {
        return new C41366GLi(this.LJLIL, this.LJLILLLLZI, this.LJLJI, interfaceC67352kd);
    }

    @Override // fjb.a
    public final Object invokeSuspend(Object obj) {
        C141335gf.LIZJ(obj);
        AwemeDraft LJ = C60903NvH.LJIIJJI().LJJJI().LIZJ().LJ(new C41363GLf(new CreativeInfo(this.LJLIL.LJLIL.creationId, 0, null, 6, null), true));
        if (LJ == null) {
            return C76800UCe.LIZ;
        }
        C268713r.LIZ().LJIIJJI(this.LJLILLLLZI, LJ, this.LJLJI);
        return C76800UCe.LIZ;
    }

    @Override // X.InterfaceC88471Ynr
    public final Object invoke(InterfaceC70422pa interfaceC70422pa, InterfaceC67352kd<? super C76800UCe> interfaceC67352kd) {
        return ((a) create(interfaceC70422pa, interfaceC67352kd)).invokeSuspend(C76800UCe.LIZ);
    }
}
