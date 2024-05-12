package com.ss.android.ugc.aweme;

import X.AbstractC36700Eam;
import X.ActivityC86117Xqz;
import X.C26042AJy;
import X.C37091Eh5;
import X.C58096Mr6;
import X.C58972NCm;
import X.C59484NWe;
import X.C85999Xp5;
import X.EF7;
import X.FJU;
import X.M53;
import X.NP8;
import X.NX2;
import X.Z8A;
import android.app.Activity;
import android.content.Context;
import android.net.Uri;
import android.view.View;
import com.ss.android.ugc.aweme.awemeservice.AwemeService;
import com.ss.android.ugc.aweme.commercialize.feed.popupwebview.DownloadBusiness;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import java.util.Locale;
import yq4.a;

/* loaded from: classes11.dex */
public class CrossPlatformLegacyServiceImpl implements ICrossPlatformLegacyService {
    public static ICrossPlatformLegacyService LJIJ() {
        Object LIZ = C58096Mr6.LIZ(ICrossPlatformLegacyService.class, false);
        if (LIZ != null) {
            return (ICrossPlatformLegacyService) LIZ;
        }
        if (C58096Mr6.LJJLI == null) {
            synchronized (ICrossPlatformLegacyService.class) {
                if (C58096Mr6.LJJLI == null) {
                    C58096Mr6.LJJLI = new CrossPlatformLegacyServiceImpl();
                }
            }
        }
        return C58096Mr6.LJJLI;
    }

    @Override // com.ss.android.ugc.aweme.ICrossPlatformLegacyService
    public final String LIZLLL() {
        return AbstractC36700Eam.LJLJJL.LJLJI;
    }

    @Override // com.ss.android.ugc.aweme.ICrossPlatformLegacyService
    public final String LIZ() {
        return C85999Xp5.LIZIZ();
    }

    @Override // com.ss.android.ugc.aweme.ICrossPlatformLegacyService
    public final Locale LJFF() {
        return C85999Xp5.LIZJ(EF7.LIZIZ(), null, null);
    }

    @Override // com.ss.android.ugc.aweme.ICrossPlatformLegacyService
    public final int LJI() {
        int i = FJU.LIZIZ().LIZIZ;
        if (i != 1 && i != 0 && i != 2) {
            return 2;
        }
        return i;
    }

    @Override // com.ss.android.ugc.aweme.ICrossPlatformLegacyService
    public final boolean LJII(Context context) {
        return NP8.LIZ(context);
    }

    @Override // com.ss.android.ugc.aweme.ICrossPlatformLegacyService
    public final String LJIIJ(String str) {
        return C37091Eh5.LIZ().appendDeviceId(str);
    }

    @Override // com.ss.android.ugc.aweme.ICrossPlatformLegacyService
    public final boolean LJIIZILJ(Uri uri) {
        return NP8.LIZIZ(uri);
    }

    @Override // com.ss.android.ugc.aweme.ICrossPlatformLegacyService
    public final void LIZIZ(Activity activity, Uri.Builder builder) {
        a.LJIILLIIL().LIZIZ(activity, builder);
    }

    @Override // com.ss.android.ugc.aweme.ICrossPlatformLegacyService
    public final boolean LIZJ(Context context, Uri uri) {
        return C58972NCm.LJII(context, uri);
    }

    @Override // com.ss.android.ugc.aweme.ICrossPlatformLegacyService
    public final void LJIIIIZZ(Activity activity, String str) {
        Aweme o6 = AwemeService.LIZ().o6(str);
        a.LJIILLIIL().LJI(C26042AJy.LIZIZ(o6));
        a.LJIILLIIL().LIZJ(activity, C26042AJy.LIZJ("landing_page", o6));
    }

    @Override // com.ss.android.ugc.aweme.ICrossPlatformLegacyService
    public final boolean LJIIIZ(Context context, Uri uri) {
        return NP8.LIZLLL(context, uri);
    }

    @Override // com.ss.android.ugc.aweme.ICrossPlatformLegacyService
    public final boolean LJIIJJI(Context context, Uri uri) {
        return C58972NCm.LJFF(context, uri);
    }

    @Override // com.ss.android.ugc.aweme.ICrossPlatformLegacyService
    public final boolean LJIIL(Context context, Uri uri) {
        return C58972NCm.LJ(context, uri);
    }

    @Override // com.ss.android.ugc.aweme.ICrossPlatformLegacyService
    public final boolean LJIILIIL(Context context, String str) {
        return M53.LIZ(context, str);
    }

    @Override // com.ss.android.ugc.aweme.ICrossPlatformLegacyService
    public final boolean LJIILJJIL(Context context, Uri uri) {
        return NP8.LJ(context, uri);
    }

    @Override // com.ss.android.ugc.aweme.ICrossPlatformLegacyService
    public final DownloadBusiness LJIILL(Class cls, C59484NWe c59484NWe) {
        if ((c59484NWe instanceof C59484NWe) && cls == NX2.class) {
            DownloadBusiness downloadBusiness = (DownloadBusiness) c59484NWe.LIZ(DownloadBusiness.class);
            if (downloadBusiness instanceof NX2) {
                return downloadBusiness;
            }
            return null;
        }
        return null;
    }

    @Override // com.ss.android.ugc.aweme.ICrossPlatformLegacyService
    public final boolean LJIILLIIL(Context context, Uri uri) {
        return C58972NCm.LIZLLL(context, uri);
    }

    @Override // com.ss.android.ugc.aweme.ICrossPlatformLegacyService
    public final void LJ(ActivityC86117Xqz activityC86117Xqz, View view, float f, String... strArr) {
        Z8A.LIZIZ.startHeaderDetailActivity(activityC86117Xqz, view, f, null, false, false, null, strArr);
    }
}
