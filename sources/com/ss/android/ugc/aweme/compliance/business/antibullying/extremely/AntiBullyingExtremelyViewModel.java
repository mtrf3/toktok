package com.ss.android.ugc.aweme.compliance.business.antibullying.extremely;

import X.AbstractC73672Svk;
import X.C73422Sri;
import X.C73969T1h;
import X.GIQ;
import X.T16;
import Y.AfS59S0100000_7;
import androidx.lifecycle.MutableLiveData;
import com.ss.android.ugc.aweme.base.api.BaseResponse;
import com.ss.android.ugc.aweme.compliance.business.antibullying.base.CyberbullyingApi;
import com.ss.android.ugc.aweme.compliance.business.antibullying.common.AntiBullyingCommonViewModel;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import kotlin.jvm.internal.o;

/* loaded from: classes8.dex */
public class AntiBullyingExtremelyViewModel extends AntiBullyingCommonViewModel {
    public String LJLILLLLZI;
    public final MutableLiveData<Aweme> LJLJI = new MutableLiveData<>();
    public final MutableLiveData<Boolean> LJLJJI;
    public final MutableLiveData<Boolean> LJLJJL;

    @Override // com.ss.android.ugc.aweme.compliance.business.antibullying.common.AntiBullyingCommonViewModel
    public final C73422Sri gv0() {
        AbstractC73672Svk<CyberbullyingApi.CyberBullyingSettingsResp> cyberBullyingSettings;
        String str = this.LJLILLLLZI;
        if (str == null) {
            cyberBullyingSettings = ((CyberbullyingApi) GIQ.LIZ.getValue()).getCyberBullyingSettings();
        } else {
            cyberBullyingSettings = ((CyberbullyingApi) GIQ.LIZ.getValue()).getCyberBullyingSettings(str);
        }
        return cyberBullyingSettings.LJJL(T16.LIZ()).LJJJ(C73969T1h.LIZIZ()).LJIJJLI(new AfS59S0100000_7(this, 56));
    }

    @Override // com.ss.android.ugc.aweme.compliance.business.antibullying.common.AntiBullyingCommonViewModel
    public final AbstractC73672Svk<BaseResponse> hv0() {
        String str = this.LJLILLLLZI;
        if (str != null) {
            Boolean value = this.LJLJJI.getValue();
            Boolean bool = Boolean.TRUE;
            C73422Sri LJIJJLI = ((CyberbullyingApi) GIQ.LIZ.getValue()).updateCyberBullyingSettings(str, o.LJ(value, bool), o.LJ(this.LJLJJL.getValue(), bool), o.LJ(this.LJLIL.getValue(), bool)).LJJL(T16.LIZ()).LJJJ(C73969T1h.LIZIZ()).LJIJJLI(new AfS59S0100000_7(this, 10));
            if (LJIJJLI != null) {
                return LJIJJLI;
            }
        }
        return super.hv0();
    }

    public AntiBullyingExtremelyViewModel() {
        Boolean bool = Boolean.FALSE;
        this.LJLJJI = new MutableLiveData<>(bool);
        this.LJLJJL = new MutableLiveData<>(bool);
    }
}
