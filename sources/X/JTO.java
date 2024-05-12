package X;

import androidx.lifecycle.ViewModelProviders;
import com.ss.android.ugc.aweme.search.model.SearchEnterViewModel;
import java.util.LinkedHashMap;

/* loaded from: classes9.dex */
public final class JTO {
    public static SearchEnterViewModel LIZ(ActivityC45651qj activityC45651qj) {
        if (activityC45651qj == null) {
            return new SearchEnterViewModel();
        }
        SearchEnterViewModel searchEnterViewModel = (SearchEnterViewModel) ViewModelProviders.of(activityC45651qj).get(SearchEnterViewModel.class);
        if (searchEnterViewModel.LJLIL == null) {
            searchEnterViewModel.LJLIL = LIZIZ(activityC45651qj);
        }
        return searchEnterViewModel;
    }

    public static C50948Jz6 LIZIZ(ActivityC45651qj activityC45651qj) {
        if (activityC45651qj == null) {
            return null;
        }
        C50948Jz6 c50948Jz6 = (C50948Jz6) ((LinkedHashMap) SearchEnterViewModel.LJLILLLLZI).get(Integer.valueOf(activityC45651qj.hashCode()));
        if (c50948Jz6 != null) {
            return c50948Jz6;
        }
        return ((SearchEnterViewModel) ViewModelProviders.of(activityC45651qj).get(SearchEnterViewModel.class)).LJLIL;
    }
}
