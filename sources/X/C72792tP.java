package X;

import androidx.fragment.app.Fragment;
import com.ss.android.ugc.aweme.comment.service.CommentServiceImpl;
import com.ss.android.ugc.aweme.comment.services.CommentService;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import fjb.a;

@InterfaceC65848Psq(c = "com.ss.android.ugc.aweme.search.pages.result.topsearch.hotspot.comment.core.viewmodel.HotSpotCommentHelper$showCommentForAweme$1", f = "HotSpotCommentHelper.kt", l = {}, m = "invokeSuspend")
/* renamed from: X.2tP, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C72792tP extends AbstractC65782Prm implements InterfaceC88471Ynr<InterfaceC70422pa, InterfaceC67352kd<? super C76800UCe>, Object> {
    public final /* synthetic */ Fragment LJLIL;
    public final /* synthetic */ Aweme LJLILLLLZI;
    public final /* synthetic */ InterfaceC1794272k LJLJI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C72792tP(Fragment fragment, Aweme aweme, InterfaceC1794272k interfaceC1794272k, InterfaceC67352kd<? super C72792tP> interfaceC67352kd) {
        super(2, interfaceC67352kd);
        this.LJLIL = fragment;
        this.LJLILLLLZI = aweme;
        this.LJLJI = interfaceC1794272k;
    }

    @Override // fjb.a
    public final InterfaceC67352kd<C76800UCe> create(Object obj, InterfaceC67352kd<?> interfaceC67352kd) {
        return new C72792tP(this.LJLIL, this.LJLILLLLZI, this.LJLJI, interfaceC67352kd);
    }

    @Override // fjb.a
    public final Object invokeSuspend(Object obj) {
        C141335gf.LIZJ(obj);
        CommentService.LIZ.getClass();
        CommentServiceImpl.LJJL().LJJJ(this.LJLIL, this.LJLILLLLZI, this.LJLJI);
        return C76800UCe.LIZ;
    }

    @Override // X.InterfaceC88471Ynr
    public final Object invoke(InterfaceC70422pa interfaceC70422pa, InterfaceC67352kd<? super C76800UCe> interfaceC67352kd) {
        return ((a) create(interfaceC70422pa, interfaceC67352kd)).invokeSuspend(C76800UCe.LIZ);
    }
}
