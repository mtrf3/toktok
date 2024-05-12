package com.ss.android.ugc.aweme.app.services;

import X.ActivityC45651qj;
import X.C221108m2;
import X.C39088FVs;
import X.C58096Mr6;
import X.C63081OpJ;
import X.EE1;
import X.EFM;
import X.EFN;
import X.FQY;
import X.InterfaceC39089FVt;
import android.app.Activity;
import android.content.Context;
import com.ss.android.ugc.aweme.contentlanguage.api.ContentLanguageGuideServiceImpl;
import com.ss.android.ugc.aweme.deeplink.DeepLinkServiceImpl;
import com.ss.android.ugc.aweme.deeplink.IDeepLinkService;
import com.ss.android.ugc.aweme.journey.INewUserMainModuleService;
import com.ss.android.ugc.aweme.legoImp.task.FeedCachePreloadTask;
import com.ss.android.ugc.aweme.request_combine.request.individual.FetchComplianceSettingRequest;
import com.ss.android.ugc.aweme.requesttask.p0.FeedPreloadRequest;
import com.ss.android.ugc.aweme.splash.SplashActivity;
import kotlin.jvm.internal.o;

/* loaded from: classes7.dex */
public final class NewUserMainModuleService implements INewUserMainModuleService {
    @Override // com.ss.android.ugc.aweme.journey.INewUserMainModuleService
    public final EFM LJIIIIZZ() {
        return new FeedPreloadRequest(1, null, null, null, null, null, null, 95);
    }

    @Override // com.ss.android.ugc.aweme.journey.INewUserMainModuleService
    public final Class<? extends Activity> getSplashActivityClass() {
        return SplashActivity.class;
    }

    public static INewUserMainModuleService LJIIJ() {
        Object LIZ = C58096Mr6.LIZ(INewUserMainModuleService.class, false);
        if (LIZ != null) {
            return (INewUserMainModuleService) LIZ;
        }
        if (C58096Mr6.LLILLIZIL == null) {
            synchronized (INewUserMainModuleService.class) {
                if (C58096Mr6.LLILLIZIL == null) {
                    C58096Mr6.LLILLIZIL = new NewUserMainModuleService();
                }
            }
        }
        return C58096Mr6.LLILLIZIL;
    }

    public NewUserMainModuleService() {
        C221108m2.LIZIZ(C39088FVs.LJLIL);
    }

    @Override // com.ss.android.ugc.aweme.journey.INewUserMainModuleService
    public final void LIZ() {
        ContentLanguageGuideServiceImpl.LIZIZ().LIZ();
    }

    @Override // com.ss.android.ugc.aweme.journey.INewUserMainModuleService
    public final Class<? extends Activity> LIZIZ() {
        IDeepLinkService LIZ = DeepLinkServiceImpl.LIZ();
        if (LIZ != null) {
            return LIZ.LJIIZILJ();
        }
        return null;
    }

    @Override // com.ss.android.ugc.aweme.journey.INewUserMainModuleService
    public final Class<? extends Activity> LJ() {
        IDeepLinkService LIZ = DeepLinkServiceImpl.LIZ();
        if (LIZ != null) {
            return LIZ.LJIIL();
        }
        return null;
    }

    @Override // com.ss.android.ugc.aweme.journey.INewUserMainModuleService
    public final boolean LJI() {
        return ContentLanguageGuideServiceImpl.LIZIZ().LJII();
    }

    @Override // com.ss.android.ugc.aweme.journey.INewUserMainModuleService
    public final ActivityC45651qj LJII() {
        return FQY.LIZ();
    }

    @Override // com.ss.android.ugc.aweme.journey.INewUserMainModuleService
    public final EFM LIZJ(EFN requestType) {
        o.LJIIIZ(requestType, "requestType");
        return new FetchComplianceSettingRequest(requestType);
    }

    @Override // com.ss.android.ugc.aweme.journey.INewUserMainModuleService
    public final void LJFF(String str) {
        ContentLanguageGuideServiceImpl.LIZIZ().LJFF(str);
    }

    @Override // com.ss.android.ugc.aweme.journey.INewUserMainModuleService
    public final void LJIIIZ(Context context) {
        ((InterfaceC39089FVt) C63081OpJ.LJJJJJ(context, InterfaceC39089FVt.class)).LIZ();
    }

    @Override // com.ss.android.ugc.aweme.journey.INewUserMainModuleService
    public final EE1 LIZLLL(int i, int i2) {
        return new FeedCachePreloadTask(i, i2);
    }
}
