package com.ss.android.ugc.aweme.compliance.business.serviceimpl;

import X.C76800UCe;
import X.C78886Uxe;
import X.InterfaceC88472Yns;
import X.N36;
import android.net.Uri;
import com.bytedance.mt.protector.impl.UriProtector;
import com.ss.android.ugc.aweme.compliance.api.services.agegate.AgeAppealService;
import java.util.HashMap;

/* loaded from: classes11.dex */
public final class AgeAppealServiceImpl implements AgeAppealService {
    @Override // com.ss.android.ugc.aweme.compliance.api.services.agegate.AgeAppealService
    public final void LIZ(String str, InterfaceC88472Yns<? super String, C76800UCe> interfaceC88472Yns) {
        Uri.Builder appendQueryParameter = UriProtector.parse(str).buildUpon().appendQueryParameter("app_id", String.valueOf(1233));
        C78886Uxe.LJIILJJIL().LIZIZ("/passport/user/appeal_ticket/", new HashMap(), new N36(interfaceC88472Yns, appendQueryParameter));
    }
}
