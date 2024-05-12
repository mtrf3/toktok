package com.ss.android.ugc.aweme.compliance.business.antibullying.common;

import X.AbstractC73672Svk;
import X.C73422Sri;
import X.C73969T1h;
import X.GIQ;
import X.T16;
import Y.AfS59S0100000_7;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;
import com.ss.android.ugc.aweme.base.api.BaseResponse;
import com.ss.android.ugc.aweme.compliance.business.antibullying.base.CyberbullyingApi;
import kotlin.jvm.internal.o;

/* loaded from: classes8.dex */
public class AntiBullyingCommonViewModel extends ViewModel {
    public final MutableLiveData<Boolean> LJLIL = new MutableLiveData<>(Boolean.FALSE);

    public AbstractC73672Svk<BaseResponse> hv0() {
        return ((CyberbullyingApi) GIQ.LIZ.getValue()).updateCyberBullyingSettings(o.LJ(this.LJLIL.getValue(), Boolean.TRUE)).LJJL(T16.LIZ()).LJJJ(C73969T1h.LIZIZ());
    }

    public C73422Sri gv0() {
        return ((CyberbullyingApi) GIQ.LIZ.getValue()).getCyberBullyingSettings().LJJL(T16.LIZ()).LJJJ(C73969T1h.LIZIZ()).LJIJJLI(new AfS59S0100000_7(this, 51));
    }
}
