package com.ss.android.ugc.aweme.web.business.preload;

import X.C221108m2;
import X.C39897FlF;
import X.C39898FlG;
import X.C39900FlI;
import X.C39902FlK;
import X.C39903FlL;
import X.C58096Mr6;
import X.C59222NMc;
import X.C62822Ol8;
import X.InterfaceC39904FlM;
import android.content.Context;
import com.ss.android.ugc.aweme.ad.preload.interfaces.IAdWebViewInterceptorService;
import com.ss.android.ugc.aweme.web.intercept.forest.AdWebViewForestServiceImpl;
import java.util.ArrayList;
import kotlin.jvm.internal.o;

/* loaded from: classes7.dex */
public final class AdWebViewInterceptorService implements IAdWebViewInterceptorService {
    public final C62822Ol8 LIZ = C221108m2.LIZIZ(C39903FlL.LJLIL);
    public boolean LIZIZ;

    public static IAdWebViewInterceptorService LIZJ() {
        Object LIZ = C58096Mr6.LIZ(IAdWebViewInterceptorService.class, false);
        if (LIZ != null) {
            return (IAdWebViewInterceptorService) LIZ;
        }
        if (C58096Mr6.f8 == null) {
            synchronized (IAdWebViewInterceptorService.class) {
                if (C58096Mr6.f8 == null) {
                    C58096Mr6.f8 = new AdWebViewInterceptorService();
                }
            }
        }
        return C58096Mr6.f8;
    }

    public final C39902FlK LIZLLL() {
        return (C39902FlK) this.LIZ.getValue();
    }

    @Override // com.ss.android.ugc.aweme.ad.preload.interfaces.IAdWebViewInterceptorService
    public final C39902FlK LIZIZ() {
        return LIZLLL();
    }

    @Override // com.ss.android.ugc.aweme.ad.preload.interfaces.IAdWebViewInterceptorService
    public final C39902FlK LIZ(Context context, C59222NMc c59222NMc, InterfaceC39904FlM interfaceC39904FlM) {
        o.LJIIIZ(context, "context");
        AdWebViewForestServiceImpl.LIZJ().LIZ(LIZLLL().LIZ);
        if (this.LIZIZ) {
            return LIZLLL();
        }
        this.LIZIZ = true;
        ((ArrayList) C39900FlI.LIZIZ).add(new C39898FlG(this, interfaceC39904FlM));
        ((ArrayList) C39900FlI.LIZ).add(new C39897FlF(this, interfaceC39904FlM));
        return LIZLLL();
    }
}
