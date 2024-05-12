package X;

import com.ss.android.ugc.aweme.comment.model.BaseCommentResponse;
import com.ss.android.ugc.aweme.comment.model.Comment;
import com.ss.android.ugc.aweme.search.pages.result.topsearch.topfeed.TopVideoHolderVM;
import fjb.a;

@InterfaceC65848Psq(c = "com.ss.android.ugc.aweme.search.pages.result.topsearch.topfeed.TopVideoHolderVM$syncCommentLikeStatus$2", f = "TopVideoHolderVM.kt", l = {}, m = "invokeSuspend")
/* renamed from: X.2lK, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C67782lK extends AbstractC65782Prm implements InterfaceC88471Ynr<InterfaceC70422pa, InterfaceC67352kd<? super Integer>, Object> {
    public /* synthetic */ Object LJLIL;
    public final /* synthetic */ Comment LJLILLLLZI;
    public final /* synthetic */ TopVideoHolderVM LJLJI;
    public final /* synthetic */ String LJLJJI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C67782lK(Comment comment, TopVideoHolderVM topVideoHolderVM, String str, InterfaceC67352kd<? super C67782lK> interfaceC67352kd) {
        super(2, interfaceC67352kd);
        this.LJLILLLLZI = comment;
        this.LJLJI = topVideoHolderVM;
        this.LJLJJI = str;
    }

    @Override // fjb.a
    public final InterfaceC67352kd<C76800UCe> create(Object obj, InterfaceC67352kd<?> interfaceC67352kd) {
        C67782lK c67782lK = new C67782lK(this.LJLILLLLZI, this.LJLJI, this.LJLJJI, interfaceC67352kd);
        c67782lK.LJLIL = obj;
        return c67782lK;
    }

    @Override // fjb.a
    public final Object invokeSuspend(Object obj) {
        Object LIZ;
        String str;
        C141335gf.LIZJ(obj);
        Comment comment = this.LJLILLLLZI;
        TopVideoHolderVM topVideoHolderVM = this.LJLJI;
        String str2 = this.LJLJJI;
        try {
            if (comment.isUserDigged()) {
                str = "1";
            } else {
                str = "2";
            }
            BaseCommentResponse LJIILL = topVideoHolderVM.iv0().LJIILL(comment.getCid(), str2, str);
            StringBuilder LIZ2 = X1D.LIZ();
            LIZ2.append("syncCommentLikeStatus (");
            LIZ2.append(str);
            LIZ2.append("): ");
            LIZ2.append(LJIILL.message);
            LIZ = new Integer(android.util.Log.d("TopVideoVm", X1D.LIZIZ(LIZ2)));
            C3C5.m7constructorimpl(LIZ);
        } catch (Throwable th) {
            LIZ = C141335gf.LIZ(th);
            C3C5.m7constructorimpl(LIZ);
        }
        Throwable m10exceptionOrNullimpl = C3C5.m10exceptionOrNullimpl(LIZ);
        if (m10exceptionOrNullimpl != null) {
            return new Integer(android.util.Log.d("TopVideoVm", "syncCommentLikeStatus error: " + m10exceptionOrNullimpl));
        }
        return null;
    }

    @Override // X.InterfaceC88471Ynr
    public final Object invoke(InterfaceC70422pa interfaceC70422pa, InterfaceC67352kd<? super Integer> interfaceC67352kd) {
        return ((a) create(interfaceC70422pa, interfaceC67352kd)).invokeSuspend(C76800UCe.LIZ);
    }
}
