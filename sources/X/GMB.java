package X;

import com.ss.android.ugc.aweme.tools.draft.DraftFragment;
import fjb.a;
import java.util.LinkedHashMap;
import kotlin.jvm.internal.o;

@InterfaceC65848Psq(c = "com.ss.android.ugc.aweme.tools.draft.DraftFragment$onLongClick$1", f = "DraftFragment.kt", l = {835}, m = "invokeSuspend")
/* loaded from: classes8.dex */
public final class GMB extends AbstractC65782Prm implements InterfaceC88471Ynr<InterfaceC70422pa, InterfaceC67352kd<? super C76800UCe>, Object> {
    public int LJLIL;
    public final /* synthetic */ DraftFragment LJLILLLLZI;
    public final /* synthetic */ C41425GNp LJLJI;
    public final /* synthetic */ String LJLJJI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public GMB(DraftFragment draftFragment, C41425GNp c41425GNp, String str, InterfaceC67352kd<? super GMB> interfaceC67352kd) {
        super(2, interfaceC67352kd);
        this.LJLILLLLZI = draftFragment;
        this.LJLJI = c41425GNp;
        this.LJLJJI = str;
    }

    @Override // fjb.a
    public final InterfaceC67352kd<C76800UCe> create(Object obj, InterfaceC67352kd<?> interfaceC67352kd) {
        return new GMB(this.LJLILLLLZI, this.LJLJI, this.LJLJJI, interfaceC67352kd);
    }

    @Override // fjb.a
    public final Object invokeSuspend(Object newDraftId) {
        EnumC58928NAu enumC58928NAu = EnumC58928NAu.COROUTINE_SUSPENDED;
        int i = this.LJLIL;
        if (i != 0) {
            if (i == 1) {
                C141335gf.LIZJ(newDraftId);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            C141335gf.LIZJ(newDraftId);
            DraftFragment draftFragment = this.LJLILLLLZI;
            C41425GNp c41425GNp = this.LJLJI;
            this.LJLIL = 1;
            newDraftId = draftFragment.xl(c41425GNp, this);
            if (newDraftId == enumC58928NAu) {
                return enumC58928NAu;
            }
        }
        String enterFrom = this.LJLILLLLZI.getEnterFrom();
        String pageType = this.LJLILLLLZI.Al();
        String action = this.LJLJJI;
        o.LJIIIZ(enterFrom, "enterFrom");
        o.LJIIIZ(pageType, "pageType");
        o.LJIIIZ(newDraftId, "newDraftId");
        o.LJIIIZ(action, "action");
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        C244009hs.LIZ(enterFrom, pageType, linkedHashMap);
        linkedHashMap.put("new_draft_id", newDraftId);
        linkedHashMap.put("action", action);
        FMX.LJIIL("long_press_draft_cell", linkedHashMap);
        return C76800UCe.LIZ;
    }

    @Override // X.InterfaceC88471Ynr
    public final Object invoke(InterfaceC70422pa interfaceC70422pa, InterfaceC67352kd<? super C76800UCe> interfaceC67352kd) {
        return ((a) create(interfaceC70422pa, interfaceC67352kd)).invokeSuspend(C76800UCe.LIZ);
    }
}
