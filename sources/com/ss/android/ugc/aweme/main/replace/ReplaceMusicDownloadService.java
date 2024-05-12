package com.ss.android.ugc.aweme.main.replace;

import X.C58096Mr6;
import X.C72602t6;
import android.app.Activity;
import android.content.Context;
import com.bytedance.router.SmartRoute;
import com.bytedance.router.SmartRouter;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.port.in.IReplaceMusicDownloadService;
import kotlin.jvm.internal.o;

/* loaded from: classes8.dex */
public final class ReplaceMusicDownloadService implements IReplaceMusicDownloadService {
    public static IReplaceMusicDownloadService LIZJ() {
        Object LIZ = C58096Mr6.LIZ(IReplaceMusicDownloadService.class, false);
        if (LIZ != null) {
            return (IReplaceMusicDownloadService) LIZ;
        }
        if (C58096Mr6.F2 == null) {
            synchronized (IReplaceMusicDownloadService.class) {
                if (C58096Mr6.F2 == null) {
                    C58096Mr6.F2 = new ReplaceMusicDownloadService();
                }
            }
        }
        return C58096Mr6.F2;
    }

    @Override // com.ss.android.ugc.aweme.port.in.IReplaceMusicDownloadService
    public final void LIZ(Context context, Aweme aweme) {
        o.LJIIIZ(context, "context");
        o.LJIIIZ(aweme, "aweme");
        if (aweme.isPhotoMode()) {
            C72602t6.LIZ(context, aweme, "photomode_copyrighted", "change_ban_music");
        }
    }

    @Override // com.ss.android.ugc.aweme.port.in.IReplaceMusicDownloadService
    public final void LIZIZ(Activity context, String str, String str2) {
        o.LJIIIZ(context, "context");
        SmartRoute buildRoute = SmartRouter.buildRoute(context, "//replace_music/download");
        buildRoute.withParam("aweme_id", str);
        buildRoute.withParam("type", "ban_music");
        buildRoute.withParam("enter_from", str2);
        buildRoute.open();
    }
}
