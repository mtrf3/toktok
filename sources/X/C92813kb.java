package X;

import com.ss.android.ugc.aweme.im.sdk.chat.ui.base.assems.input.draft.MessageDraftVM;
import fjb.a;
import kotlin.jvm.internal.AqS26S0210000_1;
import ujb.s;

@InterfaceC65848Psq(c = "com.ss.android.ugc.aweme.im.sdk.chat.ui.base.assems.input.draft.MessageDraftVM$restoreMessageDraft$1", f = "MessageDraftVM.kt", l = {}, m = "invokeSuspend")
/* renamed from: X.3kb, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C92813kb extends AbstractC65782Prm implements InterfaceC88471Ynr<InterfaceC70422pa, InterfaceC67352kd<? super C76800UCe>, Object> {
    public final /* synthetic */ AbstractC90763hI LJLIL;
    public final /* synthetic */ MessageDraftVM LJLILLLLZI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C92813kb(AbstractC90763hI abstractC90763hI, MessageDraftVM messageDraftVM, InterfaceC67352kd<? super C92813kb> interfaceC67352kd) {
        super(2, interfaceC67352kd);
        this.LJLIL = abstractC90763hI;
        this.LJLILLLLZI = messageDraftVM;
    }

    @Override // fjb.a
    public final InterfaceC67352kd<C76800UCe> create(Object obj, InterfaceC67352kd<?> interfaceC67352kd) {
        return new C92813kb(this.LJLIL, this.LJLILLLLZI, interfaceC67352kd);
    }

    @Override // fjb.a
    public final Object invokeSuspend(Object obj) {
        C109544Rq c109544Rq;
        C141335gf.LIZJ(obj);
        C792239a LJI = this.LJLIL.LJI();
        Long l = LJI.LIZIZ;
        if (l != null) {
            c109544Rq = this.LJLILLLLZI.LJLIL.LIZ(l.longValue());
        } else {
            c109544Rq = null;
        }
        String str = LJI.LIZ;
        boolean z = false;
        if (str != null) {
            z = s.LJJJLZIJ(str, "@", false);
        }
        this.LJLILLLLZI.setState(new AqS26S0210000_1(LJI, c109544Rq, z, 6));
        return C76800UCe.LIZ;
    }

    @Override // X.InterfaceC88471Ynr
    public final Object invoke(InterfaceC70422pa interfaceC70422pa, InterfaceC67352kd<? super C76800UCe> interfaceC67352kd) {
        return ((a) create(interfaceC70422pa, interfaceC67352kd)).invokeSuspend(C76800UCe.LIZ);
    }
}
