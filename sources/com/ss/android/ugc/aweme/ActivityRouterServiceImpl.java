package com.ss.android.ugc.aweme;

import X.AbstractC57425MgH;
import X.C58096Mr6;
import X.HPV;
import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import kotlin.jvm.internal.o;

/* loaded from: classes11.dex */
public final class ActivityRouterServiceImpl implements IActivityRouterService {
    public static IActivityRouterService LIZ() {
        Object LIZ = C58096Mr6.LIZ(IActivityRouterService.class, false);
        if (LIZ != null) {
            return (IActivityRouterService) LIZ;
        }
        if (C58096Mr6.LJJJLIIL == null) {
            synchronized (IActivityRouterService.class) {
                if (C58096Mr6.LJJJLIIL == null) {
                    C58096Mr6.LJJJLIIL = new ActivityRouterServiceImpl();
                }
            }
        }
        return C58096Mr6.LJJJLIIL;
    }

    @Override // com.ss.android.ugc.aweme.IActivityRouterService
    public final Intent LIZIZ(Context context, Uri uri) {
        Intent LJI = AbstractC57425MgH.LJI(context, uri);
        o.LJIIIIZZ(LJI, "handleAmeWebViewBrowser(context, uri)");
        return LJI;
    }

    @Override // com.ss.android.ugc.aweme.IActivityRouterService
    public final void LIZJ(Activity activity, Uri uri) {
        o.LJIIIZ(uri, "uri");
        HPV.LIZ(activity, uri);
    }
}
