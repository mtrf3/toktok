package X;

import com.ss.android.ugc.aweme.comment.model.Comment;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.search.pages.result.topsearch.topfeed.TopVideoHolderVM;
import fjb.a;

@InterfaceC65848Psq(c = "com.ss.android.ugc.aweme.search.pages.result.topsearch.topfeed.TopVideoHolderVM$toggleLikeComment$1", f = "TopVideoHolderVM.kt", l = {496}, m = "invokeSuspend")
/* renamed from: X.2lJ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C67772lJ extends AbstractC65782Prm implements InterfaceC88471Ynr<InterfaceC70422pa, InterfaceC67352kd<? super C76800UCe>, Object> {
    public int LJLIL;
    public final /* synthetic */ TopVideoHolderVM LJLILLLLZI;
    public final /* synthetic */ Comment LJLJI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C67772lJ(TopVideoHolderVM topVideoHolderVM, Comment comment, InterfaceC67352kd<? super C67772lJ> interfaceC67352kd) {
        super(2, interfaceC67352kd);
        this.LJLILLLLZI = topVideoHolderVM;
        this.LJLJI = comment;
    }

    @Override // fjb.a
    public final InterfaceC67352kd<C76800UCe> create(Object obj, InterfaceC67352kd<?> interfaceC67352kd) {
        return new C67772lJ(this.LJLILLLLZI, this.LJLJI, interfaceC67352kd);
    }

    @Override // fjb.a
    public final Object invokeSuspend(Object obj) {
        String str;
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
            TopVideoHolderVM topVideoHolderVM = this.LJLILLLLZI;
            Comment comment = this.LJLJI;
            Aweme aweme = topVideoHolderVM.LJLZ;
            if (aweme == null || (str = aweme.getAid()) == null) {
                str = "";
            }
            this.LJLIL = 1;
            topVideoHolderVM.getClass();
            if (T2R.LJJIFFI(new C67782lK(comment, topVideoHolderVM, str, null), this) == enumC58928NAu) {
                return enumC58928NAu;
            }
        }
        return C76800UCe.LIZ;
    }

    @Override // X.InterfaceC88471Ynr
    public final Object invoke(InterfaceC70422pa interfaceC70422pa, InterfaceC67352kd<? super C76800UCe> interfaceC67352kd) {
        return ((a) create(interfaceC70422pa, interfaceC67352kd)).invokeSuspend(C76800UCe.LIZ);
    }
}
