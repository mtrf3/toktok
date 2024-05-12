package X;

import com.ss.android.ugc.aweme.topic.book.detail.vm.BookDetailVM;
import com.ss.android.ugc.aweme.topic.book.model.BookDetail;
import com.ss.android.ugc.aweme.topic.common.model.TopicRawInfo;
import com.ss.android.ugc.governance.eventbus.IEvent;
import fjb.a;
import kotlin.jvm.internal.AqS8S0010000_3;

@InterfaceC65848Psq(c = "com.ss.android.ugc.aweme.topic.book.detail.vm.BookDetailVM$toggleFavorite$1$1$1", f = "BookDetailVM.kt", l = {}, m = "invokeSuspend")
/* renamed from: X.7Pl, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C185417Pl extends AbstractC65782Prm implements InterfaceC88471Ynr<InterfaceC70422pa, InterfaceC67352kd<? super IEvent>, Object> {
    public final /* synthetic */ BookDetailVM LJLIL;
    public final /* synthetic */ boolean LJLILLLLZI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C185417Pl(BookDetailVM bookDetailVM, boolean z, InterfaceC67352kd<? super C185417Pl> interfaceC67352kd) {
        super(2, interfaceC67352kd);
        this.LJLIL = bookDetailVM;
        this.LJLILLLLZI = z;
    }

    @Override // fjb.a
    public final InterfaceC67352kd<C76800UCe> create(Object obj, InterfaceC67352kd<?> interfaceC67352kd) {
        return new C185417Pl(this.LJLIL, this.LJLILLLLZI, interfaceC67352kd);
    }

    @Override // fjb.a
    public final Object invokeSuspend(Object obj) {
        TopicRawInfo topicRawInfo;
        C141335gf.LIZJ(obj);
        C7OG.LIZLLL(C7PV.BOOK, this.LJLIL.gv0(), !this.LJLILLLLZI);
        this.LJLIL.setState(new AqS8S0010000_3(this.LJLILLLLZI, 16));
        BookDetail LIZ = this.LJLIL.getState().LJLIL.LIZ();
        if (LIZ != null) {
            topicRawInfo = LIZ.LIZ();
        } else {
            topicRawInfo = null;
        }
        C184807Nc c184807Nc = new C184807Nc(topicRawInfo, !this.LJLILLLLZI);
        C2U8.LIZ(c184807Nc);
        return c184807Nc;
    }

    @Override // X.InterfaceC88471Ynr
    public final Object invoke(InterfaceC70422pa interfaceC70422pa, InterfaceC67352kd<? super IEvent> interfaceC67352kd) {
        return ((a) create(interfaceC70422pa, interfaceC67352kd)).invokeSuspend(C76800UCe.LIZ);
    }
}
