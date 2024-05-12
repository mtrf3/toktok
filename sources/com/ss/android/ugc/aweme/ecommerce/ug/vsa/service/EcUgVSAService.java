package com.ss.android.ugc.aweme.ecommerce.ug.vsa.service;

import X.C113554cx;
import X.C38995FSd;
import X.C58096Mr6;
import X.C61739OKx;
import X.ED3;
import X.LUT;
import X.OL1;
import X.OL3;
import X.OLG;
import Y.ARunnableS17S0000000_10;
import Y.ARunnableS46S0100000_10;
import android.content.Context;
import android.net.Uri;
import com.bytedance.mt.protector.impl.UriProtector;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.o;

/* loaded from: classes11.dex */
public final class EcUgVSAService implements IEcUgVSAService {
    @Override // com.ss.android.ugc.aweme.ecommerce.ug.vsa.service.IEcUgVSAService
    public final void LIZJ() {
        try {
            C38995FSd.LIZJ().execute(new ARunnableS17S0000000_10(11));
        } catch (Throwable unused) {
        }
    }

    @Override // com.ss.android.ugc.aweme.ecommerce.ug.vsa.service.IEcUgVSAService
    public final boolean LJFF() {
        try {
            return OL1.LIZIZ != null;
        } catch (Throwable unused) {
            return false;
        }
    }

    public static IEcUgVSAService LJIIJJI() {
        Object LIZ = C58096Mr6.LIZ(IEcUgVSAService.class, false);
        if (LIZ != null) {
            return (IEcUgVSAService) LIZ;
        }
        if (C58096Mr6.j0 == null) {
            synchronized (IEcUgVSAService.class) {
                if (C58096Mr6.j0 == null) {
                    C58096Mr6.j0 = new EcUgVSAService();
                }
            }
        }
        return C58096Mr6.j0;
    }

    @Override // com.ss.android.ugc.aweme.ecommerce.ug.vsa.service.IEcUgVSAService
    public final Map<String, String> LIZ(Context context) {
        o.LJIIIZ(context, "context");
        try {
            return OL3.LIZIZ(context);
        } catch (Throwable unused) {
            return C113554cx.LJJJLIIL();
        }
    }

    @Override // com.ss.android.ugc.aweme.ecommerce.ug.vsa.service.IEcUgVSAService
    public final boolean LIZLLL(String str) {
        try {
            return LUT.LJ(str);
        } catch (Throwable unused) {
            return false;
        }
    }

    @Override // com.ss.android.ugc.aweme.ecommerce.ug.vsa.service.IEcUgVSAService
    public final boolean LJ(String str) {
        OLG.LIZ.getClass();
        try {
            return o.LJ("1", ED3.LJ(UriProtector.parse(str), "is_ec_ug_popup"));
        } catch (Throwable unused) {
            return false;
        }
    }

    @Override // com.ss.android.ugc.aweme.ecommerce.ug.vsa.service.IEcUgVSAService
    public final void LJII(List<? extends Aweme> list) {
        try {
            C38995FSd.LIZJ().execute(new ARunnableS46S0100000_10(list, 138));
        } catch (Throwable unused) {
        }
    }

    @Override // com.ss.android.ugc.aweme.ecommerce.ug.vsa.service.IEcUgVSAService
    public final boolean LJIIIIZZ(String str) {
        String queryParameter;
        OLG.LIZ.getClass();
        if (str == null || ujb.o.LJJJJJL(str)) {
            return false;
        }
        try {
            Uri parse = UriProtector.parse(str);
            String host = parse.getHost();
            String path = parse.getPath();
            if (!o.LJ("ec", host) || !o.LJ("/plp", path) || (queryParameter = UriProtector.getQueryParameter(parse, "plp_cache_key")) == null) {
                return false;
            }
            if (ujb.o.LJJJJJL(queryParameter)) {
                return false;
            }
            return true;
        } catch (Throwable unused) {
            return false;
        }
    }

    @Override // com.ss.android.ugc.aweme.ecommerce.ug.vsa.service.IEcUgVSAService
    public final boolean LJIIIZ(String str) {
        OLG.LIZ.getClass();
        if (str == null || ujb.o.LJJJJJL(str)) {
            return false;
        }
        try {
            Uri parse = UriProtector.parse(str);
            String host = parse.getHost();
            String path = parse.getPath();
            if (!o.LJ("ec", host)) {
                return false;
            }
            if (!o.LJ("/pdp", path)) {
                return false;
            }
            return true;
        } catch (Throwable unused) {
            return false;
        }
    }

    @Override // com.ss.android.ugc.aweme.ecommerce.ug.vsa.service.IEcUgVSAService
    public final C61739OKx LJI(Aweme aweme, String str) {
        try {
            if (!OL3.LIZJ(str) || !OL1.LJIIIIZZ(aweme)) {
                return null;
            }
            return new C61739OKx();
        } catch (Throwable unused) {
            return null;
        }
    }

    @Override // com.ss.android.ugc.aweme.ecommerce.ug.vsa.service.IEcUgVSAService
    public final String LJIIJ(Context context, Aweme aweme, int i) {
        try {
            return OL3.LIZLLL(context, null, aweme, Integer.valueOf(i), null, 18);
        } catch (Throwable unused) {
            return "";
        }
    }

    @Override // com.ss.android.ugc.aweme.ecommerce.ug.vsa.service.IEcUgVSAService
    public final String LIZIZ(Context context, Aweme aweme, String str, String str2) {
        try {
            return OL3.LIZLLL(context, str, aweme, null, str2, 8);
        } catch (Throwable unused) {
            return "";
        }
    }
}
