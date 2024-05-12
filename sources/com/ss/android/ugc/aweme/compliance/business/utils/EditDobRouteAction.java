package com.ss.android.ugc.aweme.compliance.business.utils;

import X.C30591Hz;
import X.C45804HyK;
import android.app.Activity;
import android.content.Context;
import android.os.Bundle;
import com.bytedance.mt.protector.impl.string2number.CastIntegerProtector;
import com.bytedance.router.route.IRouteAction;
import com.ss.android.ugc.aweme.compliance.api.services.agegate.IAgeGateService;
import com.ss.android.ugc.aweme.compliance.business.serviceimpl.AgeGateServiceImpl;
import kotlin.jvm.internal.o;

/* loaded from: classes5.dex */
public final class EditDobRouteAction implements IRouteAction {
    public static final int $stable = 0;

    @Override // com.bytedance.router.route.IRouteAction
    public Object open(Context context, String str, Bundle bundle) {
        Activity LJIJJ;
        C30591Hz.LJIILIIL(str, "default_birthdate");
        C30591Hz.LJIILIIL(str, "upper_bound_date");
        try {
            CastIntegerProtector.valueOf(C30591Hz.LJIILIIL(str, "edibility_birthdate_type"));
        } catch (Exception unused) {
        }
        String enterMethod = C30591Hz.LJIILIIL(str, "enter_method");
        try {
            CastIntegerProtector.valueOf(C30591Hz.LJIILIIL(str, "desc_type"));
        } catch (Exception unused2) {
        }
        if (context != null && (LJIJJ = C45804HyK.LJIJJ(context)) != null) {
            IAgeGateService LJJ = AgeGateServiceImpl.LJJ();
            o.LJIIIIZZ(enterMethod, "enterMethod");
            LJJ.LJIIL(LJIJJ, null, enterMethod);
        }
        return Boolean.TRUE;
    }
}
