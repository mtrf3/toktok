package com.ss.android.ugc.aweme.search.pages.result.topsearch.hub.core.viewmodel;

import X.InterfaceC50057Jkj;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;
import com.ss.android.ugc.aweme.search.pages.result.topsearch.hub.core.model.SearchLabel;
import java.util.Map;

/* loaded from: classes9.dex */
public final class SearchHubVM extends ViewModel {
    public static final /* synthetic */ int LJLL = 0;
    public final MutableLiveData<Map<String, Object>> LJLIL = new MutableLiveData<>();
    public InterfaceC50057Jkj LJLILLLLZI;
    public SearchLabel LJLJI;
    public long LJLJJI;
    public final MutableLiveData<Boolean> LJLJJL;
    public final MutableLiveData LJLJJLL;
    public final MutableLiveData<Integer> LJLJL;
    public final MutableLiveData<Boolean> LJLJLJ;
    public final MutableLiveData LJLJLLL;

    public SearchHubVM() {
        Boolean bool = Boolean.FALSE;
        MutableLiveData<Boolean> mutableLiveData = new MutableLiveData<>(bool);
        this.LJLJJL = mutableLiveData;
        this.LJLJJLL = mutableLiveData;
        this.LJLJL = new MutableLiveData<>();
        MutableLiveData<Boolean> mutableLiveData2 = new MutableLiveData<>(bool);
        this.LJLJLJ = mutableLiveData2;
        this.LJLJLLL = mutableLiveData2;
    }
}
