package X;

import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.search.common.viewmodel.SearchGlobalViewModel;
import com.ss.android.ugc.aweme.search.pages.result.topsearch.topfeed.TopVideoHolderVM;
import com.ss.android.ugc.aweme.share.ShareDependService;
import kotlin.jvm.internal.o;

/* loaded from: classes9.dex */
public final class JWJ<T> implements InterfaceC72642tA {
    public final /* synthetic */ Aweme LJLIL;
    public final /* synthetic */ JQA LJLILLLLZI;
    public final /* synthetic */ ActivityC45651qj LJLJI;
    public final /* synthetic */ TopVideoHolderVM LJLJJI;

    public JWJ(Aweme aweme, JQA jqa, ActivityC45651qj activityC45651qj, TopVideoHolderVM topVideoHolderVM) {
        this.LJLIL = aweme;
        this.LJLILLLLZI = jqa;
        this.LJLJI = activityC45651qj;
        this.LJLJJI = topVideoHolderVM;
    }

    @Override // X.InterfaceC72642tA
    public final void onInternalEvent(Object obj) {
        int i = ((C50420Jqa) obj).LJLIL;
        if (i != 1) {
            if (i != 28) {
                return;
            }
            SearchGlobalViewModel searchGlobalViewModel = this.LJLJJI.LJLLLLLL;
            if (searchGlobalViewModel != null) {
                searchGlobalViewModel.LJLJI.postValue(null);
                return;
            } else {
                o.LJIJI("searchGlobalVM");
                throw null;
            }
        }
        ShareDependService.LIZ.getClass();
        ShareDependService LIZ = C44498HdG.LIZ();
        Aweme aweme = this.LJLIL;
        JQA jqa = this.LJLILLLLZI;
        OQA.LIZJ(LIZ, aweme, jqa.LJFF, this.LJLJI, "", jqa.LJI, null, 192);
    }
}
