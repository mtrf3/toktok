package com.ss.android.ugc.aweme.kids.discovery.list;

import X.C61878OQg;
import X.J8S;
import X.T16;
import Y.AfS6S0100100_10;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.kids.common.services.IReportAwemeManager;
import com.ss.android.ugc.aweme.kids.commonfeed.report.ReportAwemeManager;
import com.ss.android.ugc.aweme.kids.discovery.api.DiscoverApiKid;
import com.ss.android.ugc.aweme.kids.discovery.model.Category;
import java.util.List;

/* loaded from: classes11.dex */
public final class DiscoverViewModel extends ViewModel {
    public final IReportAwemeManager LJLIL = ReportAwemeManager.LIZJ();
    public final DiscoverApiKid LJLILLLLZI;
    public final MutableLiveData<Boolean> LJLJI;
    public final MutableLiveData<Boolean> LJLJJI;
    public final MutableLiveData<Boolean> LJLJJL;
    public final MutableLiveData<List<Category>> LJLJJLL;
    public int LJLJL;

    public final void refresh() {
        this.LJLJL = -1;
        long currentTimeMillis = System.currentTimeMillis();
        this.LJLILLLLZI.getCategoryV2List(-1, 10, 0).LJJL(T16.LIZ()).LJJJLIIL(new AfS6S0100100_10(this, currentTimeMillis, 4), new AfS6S0100100_10(this, currentTimeMillis, 5));
    }

    public DiscoverViewModel() {
        DiscoverApiKid.LIZ.getClass();
        this.LJLILLLLZI = J8S.LIZIZ;
        this.LJLJI = new MutableLiveData<>();
        this.LJLJJI = new MutableLiveData<>();
        this.LJLJJL = new MutableLiveData<>();
        this.LJLJJLL = new MutableLiveData<>();
    }

    public final boolean gv0(Category category) {
        IReportAwemeManager iReportAwemeManager = this.LJLIL;
        List<? extends Aweme> list = category.items;
        if (list == null) {
            list = C61878OQg.INSTANCE;
        }
        return iReportAwemeManager.LIZIZ(list).isEmpty();
    }
}
