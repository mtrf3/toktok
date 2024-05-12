package X;

import com.ss.android.ugc.aweme.search.pages.result.core.repo.ClickSearchResponse;
import com.ss.android.ugc.aweme.search.pages.result.core.repo.ClickSearchWord;
import com.ss.android.ugc.aweme.search.pages.result.topsearch.cs.core.model.ClickSearchViewModel;
import java.util.List;
import kotlin.jvm.internal.o;

/* loaded from: classes9.dex */
public final class JPB<TTaskResult, TContinuationResult> implements C10I {
    public final /* synthetic */ int LIZ;
    public final /* synthetic */ ClickSearchViewModel LIZIZ;
    public final /* synthetic */ String LIZJ;
    public final /* synthetic */ String LIZLLL;

    public JPB(int i, ClickSearchViewModel clickSearchViewModel, String str, String str2) {
        this.LIZ = i;
        this.LIZIZ = clickSearchViewModel;
        this.LIZJ = str;
        this.LIZLLL = str2;
    }

    @Override // X.C10I
    public final Object then(C10K c10k) {
        Integer num;
        List<ClickSearchWord> list;
        if (c10k.LJIILIIL()) {
            ClickSearchResponse clickSearchResponse = (ClickSearchResponse) c10k.LJIIJJI();
            StringBuilder LIZ = X1D.LIZ();
            LIZ.append("Fetch completed for Aweme #");
            LIZ.append(this.LIZ);
            LIZ.append(", words: ");
            if (clickSearchResponse != null && (list = clickSearchResponse.wordsList) != null) {
                num = Integer.valueOf(list.size());
            } else {
                num = null;
            }
            LIZ.append(num);
            X1D.LIZIZ(LIZ);
            if (clickSearchResponse != null) {
                ClickSearchViewModel clickSearchViewModel = this.LIZIZ;
                int i = this.LIZ;
                String aid = this.LIZJ;
                o.LJIIIIZZ(aid, "aid");
                String str = this.LIZLLL;
                C50764Jw8 c50764Jw8 = new C50764Jw8(clickSearchResponse);
                clickSearchViewModel.getClass();
                new JO9(i, clickSearchViewModel, aid, str, c50764Jw8, true).invoke(clickSearchViewModel.hv0().getValue());
            }
        }
        return C76800UCe.LIZ;
    }
}
