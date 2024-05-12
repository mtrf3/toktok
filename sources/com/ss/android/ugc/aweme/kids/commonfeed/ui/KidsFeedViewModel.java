package com.ss.android.ugc.aweme.kids.commonfeed.ui;

import X.C73411SrX;
import X.OB7;
import X.OSZ;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.kids.common.services.IReportAwemeManager;
import com.ss.android.ugc.aweme.kids.commonfeed.report.ReportAwemeManager;
import java.util.List;

/* loaded from: classes7.dex */
public final class KidsFeedViewModel extends ViewModel {
    public final OB7 LJLIL;
    public C73411SrX LJLJJLL;
    public C73411SrX LJLJL;
    public C73411SrX LJLJLJ;
    public final MutableLiveData<List<Aweme>> LJLILLLLZI = new MutableLiveData<>();
    public final MutableLiveData<Integer> LJLJI = new MutableLiveData<>();
    public final MutableLiveData<Integer> LJLJJI = new MutableLiveData<>();
    public final MutableLiveData<Boolean> LJLJJL = new MutableLiveData<>();
    public final IReportAwemeManager LJLJLLL = ReportAwemeManager.LIZJ();

    public KidsFeedViewModel(OB7 ob7) {
        this.LJLIL = ob7;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final OSZ<List<Aweme>, Integer> gv0(OSZ<? extends List<? extends Aweme>, Integer> osz) {
        int i;
        if (((Number) osz.getSecond()).intValue() == 0) {
            List<Aweme> LIZIZ = this.LJLJLLL.LIZIZ((List) osz.getFirst());
            if (LIZIZ.isEmpty()) {
                i = -1;
            } else {
                i = 0;
            }
            return new OSZ<>(LIZIZ, Integer.valueOf(i));
        }
        return osz;
    }
}
