package com.ss.android.ugc.aweme.compliance.business.agegate.action;

import X.C40535FvX;
import X.C84763XOl;
import X.EF7;
import android.content.Context;
import android.os.Bundle;
import com.bytedance.mt.protector.impl.UriProtector;
import com.bytedance.router.route.IRouteAction;
import com.ss.android.ugc.aweme.compliance.api.services.agegate.IAgeGateService;
import com.ss.android.ugc.aweme.share.ShareServiceImpl;
import yq4.a;

/* loaded from: classes7.dex */
public final class VideoExportCompleteRouteAction implements IRouteAction {
    public static final int $stable = 0;

    @Override // com.bytedance.router.route.IRouteAction
    public Object open(Context context, String str, Bundle bundle) {
        String queryParameter = UriProtector.getQueryParameter(UriProtector.parse(str), "is_kids_mode");
        if (queryParameter != null) {
            if (queryParameter.hashCode() != 49 || !queryParameter.equals("1")) {
                IAgeGateService LIZIZ = a.LIZIZ();
                String LJ = LIZIZ.LJ();
                if (LJ == null) {
                    LJ = "";
                }
                LIZIZ.LJIIJ(LJ);
                ShareServiceImpl.LJJJLZIJ().LJJI(EF7.LIZIZ(), false);
            } else {
                C40535FvX.LIZJ(false);
                C40535FvX.LIZLLL(false);
                C40535FvX.LIZLLL(false);
                Context LJIIIIZZ = C84763XOl.LJIIIIZZ();
                if (LJIIIIZZ == null) {
                    LJIIIIZZ = EF7.LIZIZ();
                }
                a.LJI().LJIILJJIL(LJIIIIZZ);
                ShareServiceImpl.LJJJLZIJ().LJJI(EF7.LIZIZ(), true);
            }
            return Boolean.TRUE;
        }
        return Boolean.FALSE;
    }
}
