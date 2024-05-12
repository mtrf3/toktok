package com.ss.android.ugc.aweme.pns.agegate.ui.view;

import X.C76800UCe;
import X.C86057Xq1;
import X.InterfaceC65784Pro;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import com.ss.android.ugc.aweme.pns.agegate.data.PNSFeedbackModel;
import java.util.Date;
import kotlin.jvm.internal.o;

/* loaded from: classes16.dex */
public abstract class PNSAgeGateBaseFragment extends Fragment {
    public abstract LiveData<Boolean> Al();

    public void Dl(C86057Xq1 c86057Xq1) {
    }

    public abstract void Gl();

    public void Hl(String str) {
    }

    public void Il(String str) {
    }

    public void Jl(boolean z) {
    }

    public void Kl(boolean z) {
    }

    public void vl(PNSFeedbackModel pNSFeedbackModel, InterfaceC65784Pro<C76800UCe> action) {
        o.LJIIIZ(action, "action");
    }

    public abstract MutableLiveData<C76800UCe> wl();

    public abstract LiveData<Date> xl();
}
