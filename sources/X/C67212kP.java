package X;

import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.services.IExternalService;
import com.ss.android.ugc.aweme.services.external.IAVDraftService;
import fjb.a;
import kotlin.jvm.internal.o;

@InterfaceC65848Psq(c = "com.ss.android.ugc.aweme.share.improve.action.ShareActionHelperKt$enableShowDeleteAndEdit$2", f = "ShareActionHelper.kt", l = {}, m = "invokeSuspend")
/* renamed from: X.2kP, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C67212kP extends AbstractC65782Prm implements InterfaceC88471Ynr<InterfaceC70422pa, InterfaceC67352kd<? super Boolean>, Object> {
    public final /* synthetic */ IExternalService LJLIL;
    public final /* synthetic */ Aweme LJLILLLLZI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C67212kP(IExternalService iExternalService, Aweme aweme, InterfaceC67352kd<? super C67212kP> interfaceC67352kd) {
        super(2, interfaceC67352kd);
        this.LJLIL = iExternalService;
        this.LJLILLLLZI = aweme;
    }

    @Override // fjb.a
    public final InterfaceC67352kd<C76800UCe> create(Object obj, InterfaceC67352kd<?> interfaceC67352kd) {
        return new C67212kP(this.LJLIL, this.LJLILLLLZI, interfaceC67352kd);
    }

    @Override // fjb.a
    public final Object invokeSuspend(Object obj) {
        C141335gf.LIZJ(obj);
        IAVDraftService draftService = this.LJLIL.draftService();
        String aid = this.LJLILLLLZI.getAid();
        o.LJIIIIZZ(aid, "aweme.aid");
        return Boolean.valueOf(draftService.hasAssociationWithPostedDraft(aid));
    }

    @Override // X.InterfaceC88471Ynr
    public final Object invoke(InterfaceC70422pa interfaceC70422pa, InterfaceC67352kd<? super Boolean> interfaceC67352kd) {
        return ((a) create(interfaceC70422pa, interfaceC67352kd)).invokeSuspend(C76800UCe.LIZ);
    }
}
