package com.ss.android.ugc.aweme.compliance.business.policynotice;

import X.C39338FcE;
import X.WM7;
import android.content.Context;
import android.os.Bundle;
import com.bytedance.mt.protector.impl.UriProtector;
import com.bytedance.mt.protector.impl.string2number.CastIntegerProtector;
import com.bytedance.router.route.IRouteAction;
import com.ss.android.ugc.aweme.pns.universalpopup.api.UniversalPopupService;
import com.ss.android.ugc.aweme.pns.universalpopup.api.UniversalPopupService2;
import com.ss.android.ugc.aweme.pns.universalpopup.core.UniversalPopupManager;
import com.ss.android.ugc.aweme.pns.universalpopup.core.UniversalPopupManager2;
import defpackage.e1;
import kotlin.jvm.internal.o;

/* loaded from: classes7.dex */
public final class UniversalPopupRouteAction implements IRouteAction {
    @Override // com.bytedance.router.route.IRouteAction
    public final Object open(Context context, String str, Bundle bundle) {
        Integer num;
        String queryParameter = UriProtector.getQueryParameter(UriProtector.parse(str), WM7.SCENE_SERVICE);
        if (queryParameter != null) {
            num = Integer.valueOf(CastIntegerProtector.parseInt(queryParameter));
        } else {
            num = null;
        }
        if (context != null) {
            int i = 0;
            if (e1.LIZ(31744, "popupsdk_multi_enabled", true, false)) {
                UniversalPopupService2 LIZLLL = UniversalPopupManager2.LIZLLL();
                o.LJIIIIZZ(LIZLLL, "get().getService(Univers…opupService2::class.java)");
                if (num != null) {
                    i = num.intValue();
                }
                C39338FcE.LIZ(LIZLLL, i, context, null, 28);
            } else {
                UniversalPopupService LJIIIIZZ = UniversalPopupManager.LJIIIIZZ();
                o.LJIIIIZZ(LJIIIIZZ, "get().getService(Univers…PopupService::class.java)");
                if (num != null) {
                    i = num.intValue();
                }
                LJIIIIZZ.LIZLLL(i, context, null);
            }
        }
        return Boolean.TRUE;
    }
}
