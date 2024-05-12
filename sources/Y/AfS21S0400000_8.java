package Y;

import X.InterfaceC64592gB;
import android.view.View;
import androidx.lifecycle.LifecycleOwner;
import com.ss.android.ugc.aweme.search.entry.core.viewmodel.DetailFeedSearchHelper;
import com.ss.android.ugc.aweme.search.pages.sug.core.model.SearchSugWordResponse;
import java.util.Map;

/* loaded from: classes9.dex */
public class AfS21S0400000_8 implements InterfaceC64592gB {
    public final int $t;
    public Object l0;
    public Object l1;
    public Object l2;
    public Object l3;

    @Override // X.InterfaceC64592gB
    public final void accept(Object obj) {
        switch (this.$t) {
            case 0:
                accept$0(this, obj);
                return;
            case 1:
                accept$1(this, obj);
                return;
            default:
                return;
        }
    }

    public static final void accept$0(AfS21S0400000_8 afS21S0400000_8, Object obj) {
        SearchSugWordResponse searchSugWordResponse = (SearchSugWordResponse) obj;
        DetailFeedSearchHelper detailFeedSearchHelper = DetailFeedSearchHelper.LJLIL;
        LifecycleOwner lifecycleOwner = (LifecycleOwner) afS21S0400000_8.l0;
        detailFeedSearchHelper.getClass();
        if (!DetailFeedSearchHelper.LJIIIZ(lifecycleOwner)) {
            DetailFeedSearchHelper.LJIIIIZZ((View) afS21S0400000_8.l1, searchSugWordResponse, (Map) afS21S0400000_8.l2, (Map) afS21S0400000_8.l3);
        }
    }

    public static final void accept$1(AfS21S0400000_8 afS21S0400000_8, Object obj) {
        DetailFeedSearchHelper detailFeedSearchHelper = DetailFeedSearchHelper.LJLIL;
        LifecycleOwner lifecycleOwner = (LifecycleOwner) afS21S0400000_8.l0;
        detailFeedSearchHelper.getClass();
        if (!DetailFeedSearchHelper.LJIIIZ(lifecycleOwner)) {
            DetailFeedSearchHelper.LJIIIIZZ((View) afS21S0400000_8.l1, null, (Map) afS21S0400000_8.l2, (Map) afS21S0400000_8.l3);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public AfS21S0400000_8(LifecycleOwner lifecycleOwner, LifecycleOwner lifecycleOwner2, View view, Map<String, String> map, Map<String, Boolean> map2) {
        this.$t = map2;
        this.l0 = lifecycleOwner;
        this.l1 = lifecycleOwner2;
        this.l2 = view;
        this.l3 = map;
    }
}
