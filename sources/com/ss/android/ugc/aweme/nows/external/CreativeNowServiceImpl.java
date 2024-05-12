package com.ss.android.ugc.aweme.nows.external;

import X.C05040Hs;
import X.C221108m2;
import X.C41368GLk;
import X.C41370GLm;
import X.C41371GLn;
import X.C41372GLo;
import X.C41374GLq;
import X.C58096Mr6;
import X.C62822Ol8;
import android.app.Activity;
import com.bytedance.router.SmartRoute;
import com.bytedance.router.SmartRouter;
import com.ss.android.ugc.aweme.services.now.ICreativeNowDataConverter;
import com.ss.android.ugc.aweme.services.now.ICreativeNowDraftService;
import com.ss.android.ugc.aweme.services.now.ICreativeNowPublishService;
import com.ss.android.ugc.aweme.services.now.ICreativeNowService;
import defpackage.e1;
import kotlin.jvm.internal.o;

/* loaded from: classes8.dex */
public final class CreativeNowServiceImpl implements ICreativeNowService {
    public final C62822Ol8 LIZ = C221108m2.LIZIZ(C41372GLo.LJLIL);
    public final C62822Ol8 LIZIZ = C221108m2.LIZIZ(C41370GLm.LJLIL);

    public static ICreativeNowService LIZ() {
        Object LIZ = C58096Mr6.LIZ(ICreativeNowService.class, false);
        if (LIZ != null) {
            return (ICreativeNowService) LIZ;
        }
        if (C58096Mr6.w3 == null) {
            synchronized (ICreativeNowService.class) {
                if (C58096Mr6.w3 == null) {
                    C58096Mr6.w3 = new CreativeNowServiceImpl();
                }
            }
        }
        return C58096Mr6.w3;
    }

    @Override // com.ss.android.ugc.aweme.services.now.ICreativeNowService
    public final ICreativeNowDraftService draftService() {
        return (C41368GLk) this.LIZIZ.getValue();
    }

    @Override // com.ss.android.ugc.aweme.services.now.ICreativeNowService
    public final boolean isUnder18() {
        return e1.LIZ(31744, "enable_tt_now_camera_disable_public", true, false);
    }

    @Override // com.ss.android.ugc.aweme.services.now.ICreativeNowService
    public final ICreativeNowPublishService publishService() {
        return (C41371GLn) this.LIZ.getValue();
    }

    @Override // com.ss.android.ugc.aweme.services.now.ICreativeNowService
    public final ICreativeNowDataConverter dataConverter() {
        return C41374GLq.LIZ;
    }

    @Override // com.ss.android.ugc.aweme.services.now.ICreativeNowService
    public final void startNowRecordActivity(Activity activity, String enterFrom, String enterMethod, String str, String str2, String str3) {
        o.LJIIIZ(activity, "activity");
        o.LJIIIZ(enterFrom, "enterFrom");
        o.LJIIIZ(enterMethod, "enterMethod");
        SmartRoute buildRoute = SmartRouter.buildRoute(activity, "//studio/tiktoknow");
        buildRoute.withParam("enter_method", enterMethod);
        buildRoute.withParam("enter_from", enterFrom);
        buildRoute.withParam("enter_position", str);
        C05040Hs.LJ(buildRoute, "shoot_way", "now", "shoot_enter_scene", "profile_avatar_plus_icon");
    }
}
