package X;

import com.ss.android.ugc.aweme.im.sdk.dmfilter.DmFilterKeywordsViewModel;
import com.ss.android.ugc.aweme.im.sdk.dmfilter.data.api.FilterKeywordsService;
import com.ss.android.ugc.aweme.im.sdk.dmfilter.data.model.FilterKeywords;
import fjb.a;
import java.util.List;

@InterfaceC65848Psq(c = "com.ss.android.ugc.aweme.im.sdk.dmfilter.DmFilterKeywordsViewModel$getKeywords$1", f = "DmFilterKeywordsViewModel.kt", l = {93}, m = "invokeSuspend")
/* renamed from: X.2od, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C69832od extends AbstractC65782Prm implements InterfaceC88471Ynr<InterfaceC70422pa, InterfaceC67352kd<? super C76800UCe>, Object> {
    public int LJLIL;
    public final /* synthetic */ DmFilterKeywordsViewModel LJLILLLLZI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C69832od(DmFilterKeywordsViewModel dmFilterKeywordsViewModel, InterfaceC67352kd<? super C69832od> interfaceC67352kd) {
        super(2, interfaceC67352kd);
        this.LJLILLLLZI = dmFilterKeywordsViewModel;
    }

    @Override // fjb.a
    public final InterfaceC67352kd<C76800UCe> create(Object obj, InterfaceC67352kd<?> interfaceC67352kd) {
        return new C69832od(this.LJLILLLLZI, interfaceC67352kd);
    }

    @Override // fjb.a
    public final Object invokeSuspend(Object obj) {
        EnumC58928NAu enumC58928NAu = EnumC58928NAu.COROUTINE_SUSPENDED;
        int i = this.LJLIL;
        try {
        } catch (Exception e) {
            C34B.LJ("DmFilterAddKeywordsBottomSheetViewModel", e);
        }
        if (i != 0) {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            C141335gf.LIZJ(obj);
        } else {
            C141335gf.LIZJ(obj);
            FilterKeywordsService filterKeywordsService = (FilterKeywordsService) C69852of.LIZ.getValue();
            if (filterKeywordsService != null) {
                this.LJLIL = 1;
                obj = filterKeywordsService.getFilterKeywords(this);
                if (obj == enumC58928NAu) {
                    return enumC58928NAu;
                }
            }
            return C76800UCe.LIZ;
        }
        FilterKeywords filterKeywords = (FilterKeywords) obj;
        if (filterKeywords != null) {
            DmFilterKeywordsViewModel dmFilterKeywordsViewModel = this.LJLILLLLZI;
            dmFilterKeywordsViewModel.LJLJJI = true;
            XLM xlm = dmFilterKeywordsViewModel.LJLIL;
            List list = filterKeywords.words;
            if (list == null) {
                list = C61878OQg.INSTANCE;
            }
            xlm.setValue(new AnonymousClass316(list));
        }
        return C76800UCe.LIZ;
    }

    @Override // X.InterfaceC88471Ynr
    public final Object invoke(InterfaceC70422pa interfaceC70422pa, InterfaceC67352kd<? super C76800UCe> interfaceC67352kd) {
        return ((a) create(interfaceC70422pa, interfaceC67352kd)).invokeSuspend(C76800UCe.LIZ);
    }
}
