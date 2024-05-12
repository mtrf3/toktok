package X;

import com.ss.android.ugc.aweme.search.core.model.SearchWidgetModel;
import com.ss.android.ugc.aweme.search.core.repo.ISearchWidgetApi;

@InterfaceC65848Psq(c = "com.ss.android.ugc.aweme.search.core.viewmodel.SearchWidgetManager$requestWidgetData$2", f = "SearchWidgetManager.kt", l = {}, m = "invokeSuspend")
/* renamed from: X.2lW, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C67902lW extends AbstractC65782Prm implements InterfaceC88471Ynr<InterfaceC70422pa, InterfaceC67352kd<? super C76800UCe>, Object> {
    public C67902lW(InterfaceC67352kd<? super C67902lW> interfaceC67352kd) {
        super(2, interfaceC67352kd);
    }

    @Override // fjb.a
    public final InterfaceC67352kd<C76800UCe> create(Object obj, InterfaceC67352kd<?> interfaceC67352kd) {
        return new C67902lW(interfaceC67352kd);
    }

    /* JADX WARN: Type inference failed for: r0v10, types: [T] */
    @Override // fjb.a
    public final Object invokeSuspend(Object obj) {
        C141335gf.LIZJ(obj);
        C64797Pbt<SearchWidgetModel> execute = ((ISearchWidgetApi) C67922lY.LIZ.getValue()).getSearchWidget("widget_blank_page").execute();
        int i = 3;
        if (execute.LIZIZ()) {
            SearchWidgetModel searchWidgetModel = execute.LIZIZ;
            if (searchWidgetModel.status_code == 0 && searchWidgetModel.getFirstGuessWord().length() > 0) {
                C67942la<SearchWidgetModel> c67942la = MAR.LIZJ;
                ?? r0 = execute.LIZIZ;
                c67942la.getClass();
                if (r0 != 0) {
                    i = 2;
                }
                c67942la.LIZ = i;
                c67942la.LIZIZ = r0;
                MAR.LIZJ.LIZ = 2;
                return C76800UCe.LIZ;
            }
        }
        C67942la<SearchWidgetModel> c67942la2 = MAR.LIZJ;
        c67942la2.getClass();
        c67942la2.LIZ = 3;
        c67942la2.LIZIZ = null;
        MAR.LIZJ.LIZ = 3;
        return C76800UCe.LIZ;
    }

    @Override // X.InterfaceC88471Ynr
    public final Object invoke(InterfaceC70422pa interfaceC70422pa, InterfaceC67352kd<? super C76800UCe> interfaceC67352kd) {
        return new C67902lW(interfaceC67352kd).invokeSuspend(C76800UCe.LIZ);
    }
}
