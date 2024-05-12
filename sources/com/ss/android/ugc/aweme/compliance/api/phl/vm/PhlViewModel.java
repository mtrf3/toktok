package com.ss.android.ugc.aweme.compliance.api.phl.vm;

import X.C73969T1h;
import X.C7FX;
import X.T16;
import Y.AfS55S0100000_3;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;
import com.ss.android.ugc.aweme.compliance.api.phl.model.PrivacyHighlightsForTeensApproveInfo;
import com.ss.android.ugc.aweme.compliance.api.phl.model.PrivacyHighlightsForTeensDescription;
import com.ss.android.ugc.aweme.compliance.api.phl.model.PrivacyHighlightsForTeensVideo;
import java.util.List;

/* loaded from: classes4.dex */
public final class PhlViewModel extends ViewModel {
    public final C7FX LJLIL;
    public final MutableLiveData<String> LJLILLLLZI = new MutableLiveData<>();
    public final MutableLiveData<PrivacyHighlightsForTeensDescription> LJLJI = new MutableLiveData<>();
    public final MutableLiveData<List<PrivacyHighlightsForTeensVideo>> LJLJJI = new MutableLiveData<>();
    public final MutableLiveData<String> LJLJJL = new MutableLiveData<>();
    public final MutableLiveData<Boolean> LJLJJLL = new MutableLiveData<>();
    public final MutableLiveData<PrivacyHighlightsForTeensApproveInfo> LJLJL = new MutableLiveData<>();

    public final void gv0() {
        this.LJLIL.LIZ().LJJL(T16.LIZ()).LJJJ(C73969T1h.LIZIZ()).LJJJLIIL(new AfS55S0100000_3(this, 7), new AfS55S0100000_3(this, 8));
    }

    public PhlViewModel(C7FX c7fx) {
        this.LJLIL = c7fx;
    }
}
