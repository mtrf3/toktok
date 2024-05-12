package X;

import android.text.Editable;
import com.bytedance.ies.im.core.api.model.RichTextInfo;
import com.ss.android.ugc.aweme.feed.model.CardStruct;
import com.ss.android.ugc.aweme.im.sdk.chat.data.model.Range;
import com.ss.android.ugc.aweme.im.sdk.chat.ui.base.assems.input.draft.MessageDraftVM;
import fjb.a;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.o;

@InterfaceC65848Psq(c = "com.ss.android.ugc.aweme.im.sdk.chat.ui.base.assems.input.draft.MessageDraftVM$storeMessageDraft$1", f = "MessageDraftVM.kt", l = {47}, m = "invokeSuspend")
/* renamed from: X.3ky, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C93043ky extends AbstractC65782Prm implements InterfaceC88471Ynr<InterfaceC70422pa, InterfaceC67352kd<? super C76800UCe>, Object> {
    public int LJLIL;
    public final /* synthetic */ Editable LJLILLLLZI;
    public final /* synthetic */ MessageDraftVM LJLJI;
    public final /* synthetic */ AbstractC90763hI LJLJJI;
    public final /* synthetic */ Long LJLJJL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C93043ky(Editable editable, MessageDraftVM messageDraftVM, AbstractC90763hI abstractC90763hI, Long l, InterfaceC67352kd<? super C93043ky> interfaceC67352kd) {
        super(2, interfaceC67352kd);
        this.LJLILLLLZI = editable;
        this.LJLJI = messageDraftVM;
        this.LJLJJI = abstractC90763hI;
        this.LJLJJL = l;
    }

    @Override // fjb.a
    public final InterfaceC67352kd<C76800UCe> create(Object obj, InterfaceC67352kd<?> interfaceC67352kd) {
        return new C93043ky(this.LJLILLLLZI, this.LJLJI, this.LJLJJI, this.LJLJJL, interfaceC67352kd);
    }

    @Override // fjb.a
    public final Object invokeSuspend(Object obj) {
        List<C93073l1> list;
        ArrayList arrayList;
        String str;
        C3H0 c3h0;
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
            ArrayList arrayList2 = null;
            if (C81253Gv.LIZ()) {
                Editable editable = this.LJLILLLLZI;
                Object[] spans = editable.getSpans(0, editable.length(), C93073l1.class);
                if (spans != null) {
                    list = ORY.LJJZZIII(spans);
                } else {
                    list = null;
                }
                if (C1GE.LJIILIIL(list)) {
                    this.LJLJI.getClass();
                    if (list != null) {
                        arrayList = new ArrayList();
                        for (C93073l1 c93073l1 : list) {
                            Range range = c93073l1.LIZLLL;
                            if (range != null && (str = c93073l1.LIZIZ) != null) {
                                if (o.LJ(str, CardStruct.IStatusCode.DEFAULT)) {
                                    c3h0 = C3H0.MENTION_ALL;
                                } else {
                                    c3h0 = C3H0.MENTION_SINGLE;
                                }
                                arrayList.add(new RichTextInfo(range.getFrom(), range.getTo() - range.getFrom(), c3h0.getValue(), str));
                            }
                        }
                    } else {
                        arrayList = null;
                    }
                    if (C1GE.LJIILIIL(arrayList)) {
                        arrayList2 = arrayList;
                    }
                }
            }
            AbstractC90763hI abstractC90763hI = this.LJLJJI;
            C792239a c792239a = new C792239a(this.LJLILLLLZI.toString(), this.LJLJJL, arrayList2);
            this.LJLIL = 1;
            if (abstractC90763hI.LJIILJJIL(c792239a) == enumC58928NAu) {
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
