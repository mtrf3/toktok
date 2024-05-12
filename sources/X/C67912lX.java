package X;

import android.content.Context;
import com.bytedance.ies.ugc.aweme.network.NetworkService;
import com.ss.android.ugc.aweme.search.core.model.SearchWidgetModel;
import com.ss.android.ugc.aweme.search.core.model.SearchWidgetSuggestWord;
import com.ss.android.ugc.aweme.search.core.repo.ISearchWidgetApi;
import fjb.a;
import kotlin.jvm.internal.o;

@InterfaceC65848Psq(c = "com.ss.android.ugc.aweme.search.core.viewmodel.SearchSuggestListWidgetManager$requestWidgetData$2", f = "SearchSuggestListWidgetManager.kt", l = {}, m = "invokeSuspend")
/* renamed from: X.2lX, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C67912lX extends AbstractC65782Prm implements InterfaceC88471Ynr<InterfaceC70422pa, InterfaceC67352kd<? super C76800UCe>, Object> {
    public final /* synthetic */ String LJLIL;
    public final /* synthetic */ Context LJLILLLLZI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C67912lX(Context context, String str, InterfaceC67352kd interfaceC67352kd) {
        super(2, interfaceC67352kd);
        this.LJLIL = str;
        this.LJLILLLLZI = context;
    }

    @Override // fjb.a
    public final InterfaceC67352kd<C76800UCe> create(Object obj, InterfaceC67352kd<?> interfaceC67352kd) {
        return new C67912lX(this.LJLILLLLZI, this.LJLIL, interfaceC67352kd);
    }

    @Override // fjb.a
    public final Object invokeSuspend(Object obj) {
        SearchWidgetSuggestWord[] suggestWords;
        C141335gf.LIZJ(obj);
        NetworkService.LJI().LJFF();
        C64797Pbt<SearchWidgetModel> execute = ((ISearchWidgetApi) C67922lY.LIZ.getValue()).getSearchWidget(this.LJLIL).execute();
        if (execute.LIZIZ()) {
            SearchWidgetModel searchWidgetModel = execute.LIZIZ;
            if (searchWidgetModel.status_code == 0) {
                String reqSource = this.LJLIL;
                o.LJIIIIZZ(searchWidgetModel, "response.body()");
                SearchWidgetModel searchWidgetModel2 = searchWidgetModel;
                o.LJIIIZ(reqSource, "reqSource");
                if (!o.LJ(reqSource, "widget_blank_page") ? !(!o.LJ(reqSource, "widget_preinstall_blank_page") || (suggestWords = searchWidgetModel2.getSuggestWords()) == null || suggestWords.length == 0) : searchWidgetModel2.getFirstGuessWord().length() > 0) {
                    C67932lZ.LIZIZ(this.LJLIL, execute.LIZIZ, true);
                    C67932lZ.LIZ(this.LJLILLLLZI, this.LJLIL);
                    return C76800UCe.LIZ;
                }
            }
        }
        C67932lZ.LIZIZ(this.LJLIL, execute.LIZIZ, false);
        C67932lZ.LIZ(this.LJLILLLLZI, this.LJLIL);
        return C76800UCe.LIZ;
    }

    @Override // X.InterfaceC88471Ynr
    public final Object invoke(InterfaceC70422pa interfaceC70422pa, InterfaceC67352kd<? super C76800UCe> interfaceC67352kd) {
        return ((a) create(interfaceC70422pa, interfaceC67352kd)).invokeSuspend(C76800UCe.LIZ);
    }
}
