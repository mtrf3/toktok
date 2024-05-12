package X;

import androidx.lifecycle.ViewModelProviders;
import androidx.recyclerview.widget.RecyclerView;
import com.ss.android.ugc.aweme.search.pages.result.topsearch.hub.SearchHubHeaderComponent;
import com.ss.android.ugc.aweme.search.pages.result.topsearch.hub.core.model.EntityCardLabel;
import com.ss.android.ugc.aweme.search.pages.result.topsearch.hub.core.model.EntityCardTitle;
import com.ss.android.ugc.aweme.search.pages.result.topsearch.hub.core.viewmodel.SearchHubVM;

/* renamed from: X.Jkh, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C50055Jkh {
    public static int LIZIZ(ActivityC45651qj activityC45651qj, RecyclerView recyclerView) {
        Integer value;
        if (activityC45651qj == null || (value = ((SearchHubVM) ViewModelProviders.of(activityC45651qj).get(SearchHubVM.class)).LJLJL.getValue()) == null) {
            return 0;
        }
        return (-recyclerView.getPaddingTop()) + value.intValue();
    }

    public static void LIZJ(ActivityC45651qj activityC45651qj, boolean z) {
        if (activityC45651qj == null) {
            return;
        }
        ((SearchHubVM) ViewModelProviders.of(activityC45651qj).get(SearchHubVM.class)).LJLJLJ.postValue(Boolean.valueOf(z));
    }

    public static void LIZ(ActivityC45651qj activityC45651qj, RecyclerView recyclerView, EntityCardTitle entityCardTitle) {
        EntityCardLabel entityCardLabel;
        Integer num;
        int i;
        if (activityC45651qj != null) {
            ViewModelProviders.of(activityC45651qj).get(SearchHubVM.class).getClass();
            if (entityCardTitle != null && (entityCardLabel = entityCardTitle.labelInfo) != null && (num = entityCardLabel.labelIndex) != null) {
                int intValue = num.intValue();
                if (C50269Jo9.LIZ()) {
                    i = SearchHubHeaderComponent.LJLLILLLL;
                } else if (intValue == 0) {
                    i = SearchHubHeaderComponent.LJLL;
                } else {
                    i = SearchHubHeaderComponent.LJLLI;
                }
                Integer valueOf = Integer.valueOf(i);
                if (valueOf != null) {
                    int intValue2 = valueOf.intValue();
                    V1B.LJLLI(intValue2, recyclerView);
                    StringBuilder LIZ = X1D.LIZ();
                    LIZ.append("set padding top for reversed : ");
                    LIZ.append(intValue2);
                    X1D.LIZIZ(LIZ);
                }
            }
        }
    }
}
