package X;

import androidx.lifecycle.LiveData;
import java.util.List;

/* loaded from: classes13.dex */
public interface TL9<DATA> {
    void CD(RTW rtw);

    void F9();

    LiveData<List<DATA>> e7();

    LiveData<Object> getExtraData();

    LiveData<TEN> getLoadMoreState();

    LiveData<TEN> getPageState();

    void u10();
}
