package com.ss.android.ugc.aweme.kids.common.ui.awemegrid;

import X.C73411SrX;
import X.InterfaceC36195EIl;
import X.OSZ;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.kids.common.services.IReportAwemeManager;
import com.ss.android.ugc.aweme.kids.commonfeed.report.ReportAwemeManager;
import java.util.List;

/* loaded from: classes7.dex */
public final class KidsAwemeGridViewModel extends ViewModel {
    public final InterfaceC36195EIl LJLIL;
    public C73411SrX LJLJJL;
    public C73411SrX LJLJJLL;
    public boolean LJLJL;
    public final MutableLiveData<List<Aweme>> LJLILLLLZI = new MutableLiveData<>();
    public final MutableLiveData<Integer> LJLJI = new MutableLiveData<>();
    public final MutableLiveData<Integer> LJLJJI = new MutableLiveData<>();
    public final IReportAwemeManager LJLJLJ = ReportAwemeManager.LIZJ();

    public KidsAwemeGridViewModel(InterfaceC36195EIl interfaceC36195EIl) {
        this.LJLIL = interfaceC36195EIl;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final OSZ<List<Aweme>, Integer> gv0(OSZ<? extends List<? extends Aweme>, Integer> osz) {
        int i;
        if (((Number) osz.getSecond()).intValue() == 0) {
            List<Aweme> LIZIZ = this.LJLJLJ.LIZIZ((List) osz.getFirst());
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
