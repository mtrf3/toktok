package X;

import com.ss.android.ugc.aweme.topic.book.detail.vm.BookDetailVM;
import com.ss.android.ugc.aweme.topic.book.model.BookDetail;
import com.ss.android.ugc.aweme.topic.common.model.TopicRawInfo;
import fjb.a;
import kotlin.jvm.internal.AqS169S0100000_3;

@InterfaceC65848Psq(c = "com.ss.android.ugc.aweme.topic.book.detail.vm.BookDetailVM$toggleFavorite$1$1$3", f = "BookDetailVM.kt", l = {}, m = "invokeSuspend")
/* renamed from: X.7Pk, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C185407Pk extends AbstractC65782Prm implements InterfaceC88471Ynr<InterfaceC70422pa, InterfaceC67352kd<? super C76800UCe>, Object> {
    public final /* synthetic */ XGX<? extends InterfaceC199277rv> LJLIL;
    public final /* synthetic */ BookDetailVM LJLILLLLZI;
    public final /* synthetic */ InterfaceC70422pa LJLJI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C185407Pk(XGX<? extends InterfaceC199277rv> xgx, BookDetailVM bookDetailVM, InterfaceC70422pa interfaceC70422pa, InterfaceC67352kd<? super C185407Pk> interfaceC67352kd) {
        super(2, interfaceC67352kd);
        this.LJLIL = xgx;
        this.LJLILLLLZI = bookDetailVM;
        this.LJLJI = interfaceC70422pa;
    }

    @Override // fjb.a
    public final InterfaceC67352kd<C76800UCe> create(Object obj, InterfaceC67352kd<?> interfaceC67352kd) {
        return new C185407Pk(this.LJLIL, this.LJLILLLLZI, this.LJLJI, interfaceC67352kd);
    }

    @Override // X.InterfaceC88471Ynr
    public final Object invoke(InterfaceC70422pa interfaceC70422pa, InterfaceC67352kd<? super C76800UCe> interfaceC67352kd) {
        return ((a) create(interfaceC70422pa, interfaceC67352kd)).invokeSuspend(C76800UCe.LIZ);
    }

    @Override // fjb.a
    public final Object invokeSuspend(Object obj) {
        TopicRawInfo topicRawInfo;
        C141335gf.LIZJ(obj);
        C16880lQ.LLLLIIL(((XGT) this.LJLIL).LJFF);
        C7OG.LIZLLL(C7PV.BOOK, this.LJLILLLLZI.gv0(), this.LJLILLLLZI.LJLILLLLZI);
        BookDetailVM bookDetailVM = this.LJLILLLLZI;
        bookDetailVM.setState(new AqS169S0100000_3(bookDetailVM, 484));
        BookDetail LIZ = this.LJLILLLLZI.getState().LJLIL.LIZ();
        if (LIZ != null) {
            topicRawInfo = LIZ.LIZ();
        } else {
            topicRawInfo = null;
        }
        C2U8.LIZ(new C184807Nc(topicRawInfo, this.LJLILLLLZI.LJLILLLLZI));
        C48841JEv.LIZJ(this.LJLJI, null);
        return C76800UCe.LIZ;
    }
}
