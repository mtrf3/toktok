package X;

import androidx.lifecycle.LiveData;
import com.bytedance.als.LiveEvent;
import com.ss.android.ugc.aweme.filter.FilterBean;
import java.util.List;

/* loaded from: classes15.dex */
public interface WRP extends C0I6 {
    void addFilterSource(WPD wpd);

    void cleanFilterChosen();

    void clearFilterChosen();

    LiveData<C76800UCe> getClearFilter();

    C0IB<FilterBean> getCurSelectedFilter();

    LiveData<WPD> getCurrentFilterSource();

    LiveData<List<WPD>> getFilterSources();

    LiveEvent<WRS> getFilterSwitchEvent();

    LiveEvent<C44262HYs> getFilterUpdateEvent();

    boolean isFilterDisable(String str);

    void removeFilterSource(String str);

    void setFilterChosen(FilterBean filterBean, String str, boolean z, boolean z2, boolean z3);

    void setFilterDisable(boolean z, String str);

    void setFilterFromStore(boolean z);

    void setFilterIntensity(FilterBean filterBean, float f);

    void setFilterProgress(FilterBean filterBean, int i);

    void setFilterScroll(FilterBean filterBean, FilterBean filterBean2, float f);

    void useFilterSource(String str, boolean z);
}
