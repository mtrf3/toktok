package X;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import com.bytedance.ies.bullet.service.base.IResourceLoaderService;
import com.bytedance.ies.bullet.service.base.resourceloader.config.GeckoConfig;
import com.ss.android.ugc.aweme.ad.preload.AdLandPagePreloadServiceImpl;
import com.ss.android.ugc.aweme.ad.preload.IAdLandPagePreloadService;
import com.ss.android.ugc.aweme.awemeservice.AwemeService;
import com.ss.android.ugc.aweme.bullet.module.base.BaseCommonBizRootContainer;
import kotlin.jvm.internal.o;

/* renamed from: X.NUx, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public class C59451NUx extends BaseCommonBizRootContainer {
    @Override // com.ss.android.ugc.aweme.bullet.module.base.BaseCommonBizRootContainer
    public final void LJIIL(C59304NPg c59304NPg) {
        ViewOnClickListenerC59660NbE viewOnClickListenerC59660NbE = this.LJLJL;
        if (viewOnClickListenerC59660NbE != null) {
            viewOnClickListenerC59660NbE.LIZIZ(AwemeService.LIZ().o6(c59304NPg.LIZLLL()));
        }
    }

    @Override // X.NW3, X.InterfaceC60179Njb
    public final void M3(Context context) {
        boolean z;
        String str;
        String LJIIL;
        Intent intent;
        Intent intent2;
        o.LJIIIZ(context, "context");
        Activity LJIJJ = C45804HyK.LJIJJ(context);
        if (LJIJJ != null && (intent2 = LJIJJ.getIntent()) != null) {
            z = intent2.getBooleanExtra("is_lynx_landing_page", false);
        } else {
            z = false;
        }
        String str2 = "";
        if (LJIJJ == null || (intent = LJIJJ.getIntent()) == null || (str = C16880lQ.LLJJIJIIJIL(intent, "access_key")) == null) {
            str = "";
        }
        if (z || str.length() > 0) {
            if (str.length() == 0) {
                IAdLandPagePreloadService LJJI = AdLandPagePreloadServiceImpl.LJJI();
                if (LJJI != null && (LJIIL = LJJI.LJIIL("lynx_feed")) != null) {
                    str2 = LJIIL;
                }
                str = str2;
            }
            IResourceLoaderService iResourceLoaderService = (IResourceLoaderService) C60373Nmj.LIZIZ().LIZ(IResourceLoaderService.class);
            if (iResourceLoaderService != null) {
                GeckoConfig LIZIZ = O1F.LIZIZ(C61238O1q.LIZ.LIZ(iResourceLoaderService), str);
                if (!o.LJ(LIZIZ.getAccessKey(), str)) {
                    iResourceLoaderService.registerConfig(str, new GeckoConfig(str, LIZIZ.getOfflineDir(), LIZIZ.getLoaderDepender(), false, false, 24, null));
                }
                iResourceLoaderService.registerCustomLoader(O1O.class, EnumC60171NjT.HIGH);
            }
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C59451NUx(F3T providerFactory, NUT bulletBusiness) {
        super(providerFactory, bulletBusiness);
        o.LJIIIZ(providerFactory, "providerFactory");
        o.LJIIIZ(bulletBusiness, "bulletBusiness");
    }
}
