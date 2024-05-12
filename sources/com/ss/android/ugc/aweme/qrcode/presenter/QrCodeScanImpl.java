package com.ss.android.ugc.aweme.qrcode.presenter;

import X.ActivityC86117Xqz;
import X.C1YZ;
import X.C58096Mr6;
import X.C62120OZo;
import android.content.Context;
import com.bytedance.router.SmartRoute;
import com.bytedance.router.SmartRouter;
import com.ss.android.ugc.aweme.mvtemplate.impl.MovieReuseServiceImpl;
import com.ss.android.ugc.aweme.services.MainServiceImpl;
import java.util.ArrayList;
import kotlin.jvm.internal.o;

/* loaded from: classes10.dex */
public final class QrCodeScanImpl implements QrCodeScanService {
    @Override // com.ss.android.ugc.aweme.qrcode.presenter.QrCodeScanService
    public final void LIZIZ() {
    }

    @Override // com.ss.android.ugc.aweme.qrcode.presenter.QrCodeScanService
    public final void LJFF() {
    }

    public static QrCodeScanService LJIIJ() {
        Object LIZ = C58096Mr6.LIZ(QrCodeScanService.class, false);
        if (LIZ != null) {
            return (QrCodeScanService) LIZ;
        }
        return new QrCodeScanImpl();
    }

    @Override // com.ss.android.ugc.aweme.qrcode.presenter.QrCodeScanService
    public final String getSecurityUrl(String url) {
        o.LJIIIZ(url, "url");
        String securityUrl = MainServiceImpl.createIMainServicebyMonsterPlugin(false).getSecurityUrl(url);
        o.LJI(securityUrl);
        return securityUrl;
    }

    @Override // com.ss.android.ugc.aweme.qrcode.presenter.QrCodeScanService
    public final void LIZLLL(ActivityC86117Xqz activityC86117Xqz, ArrayList arrayList) {
        SmartRoute buildRoute = SmartRouter.buildRoute(activityC86117Xqz, "//stickers/detail");
        buildRoute.withParam("extra_stickers", arrayList);
        buildRoute.withParam("extra_sticker_from", "reuse");
        buildRoute.open();
    }

    @Override // com.ss.android.ugc.aweme.qrcode.presenter.QrCodeScanService
    public final void LJ(ActivityC86117Xqz activityC86117Xqz, String objectId) {
        o.LJIIIZ(objectId, "objectId");
        SmartRoute buildRoute = SmartRouter.buildRoute(activityC86117Xqz, "//music/detail");
        buildRoute.withParam("id", objectId);
        buildRoute.withParam("extra_music_from", "scan");
        buildRoute.open();
    }

    @Override // com.ss.android.ugc.aweme.qrcode.presenter.QrCodeScanService
    public final void LJI(ActivityC86117Xqz activityC86117Xqz, String objectId) {
        o.LJIIIZ(objectId, "objectId");
        SmartRoute buildRoute = SmartRouter.buildRoute(activityC86117Xqz, "//aweme/detail");
        buildRoute.withParam("id", objectId);
        buildRoute.withParam("refer", "scan");
        buildRoute.open();
    }

    @Override // com.ss.android.ugc.aweme.qrcode.presenter.QrCodeScanService
    public final void LJII(Context context, String url) {
        o.LJIIIZ(url, "url");
        MainServiceImpl.createIMainServicebyMonsterPlugin(false).openDeepLinkActivity(context, url, "QrCode");
    }

    @Override // com.ss.android.ugc.aweme.qrcode.presenter.QrCodeScanService
    public final void LJIIIIZZ(ActivityC86117Xqz context, String objectId) {
        o.LJIIIZ(context, "context");
        o.LJIIIZ(objectId, "objectId");
        SmartRoute buildRoute = SmartRouter.buildRoute(context, "//challenge/detail");
        buildRoute.withParam("id", objectId);
        buildRoute.withParam("extra_challenge_from", "scan");
        buildRoute.open();
    }

    @Override // com.ss.android.ugc.aweme.qrcode.presenter.QrCodeScanService
    public final void LIZ(String objectId, ActivityC86117Xqz activity, C1YZ c1yz) {
        o.LJIIIZ(objectId, "objectId");
        o.LJIIIZ(activity, "activity");
        MovieReuseServiceImpl.LJ().LIZ(objectId, activity, c1yz);
    }

    @Override // com.ss.android.ugc.aweme.qrcode.presenter.QrCodeScanService
    public final boolean LIZJ(ActivityC86117Xqz activity, String str, String uriToGo) {
        o.LJIIIZ(activity, "activity");
        o.LJIIIZ(uriToGo, "uriToGo");
        return MainServiceImpl.createIMainServicebyMonsterPlugin(false).checkIsMinAppVersionNotSatisfied(activity, str, uriToGo);
    }

    @Override // com.ss.android.ugc.aweme.qrcode.presenter.QrCodeScanService
    public final void LJIIIZ(String objectId, String str, ActivityC86117Xqz activity, boolean z, C62120OZo c62120OZo) {
        o.LJIIIZ(objectId, "objectId");
        o.LJIIIZ(activity, "activity");
        MainServiceImpl.createIMainServicebyMonsterPlugin(false).downloadStickerHelper(objectId, str, activity, z, c62120OZo);
    }
}
