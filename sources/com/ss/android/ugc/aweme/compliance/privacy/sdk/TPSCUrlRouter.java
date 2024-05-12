package com.ss.android.ugc.aweme.compliance.privacy.sdk;

import android.content.Context;
import android.os.Bundle;
import com.bytedance.router.SmartRoute;
import com.bytedance.router.SmartRouter;
import com.bytedance.router.route.IRouteAction;
import defpackage.t1;
import kotlin.jvm.internal.o;
import ujb.s;

/* loaded from: classes13.dex */
public final class TPSCUrlRouter implements IRouteAction {
    @Override // com.bytedance.router.route.IRouteAction
    public Object open(Context context, String url, Bundle bundle) {
        String str;
        o.LJIIIZ(context, "context");
        o.LJIIIZ(url, "url");
        if (s.LJJJLZIJ(url, "privacy/setting", false)) {
            if (t1.LJI()) {
                str = "main";
            } else {
                str = "unlogin";
            }
        } else if (s.LJJJLZIJ(url, "chatcontrol/setting", false)) {
            str = "chat";
        } else if (s.LJJJLZIJ(url, "commentcontrol/setting", false) || s.LJJJLZIJ(url, "filtercomments", false)) {
            str = "comment";
        } else if (s.LJJJLZIJ(url, "setting/download", false)) {
            str = "downloads";
        } else if (s.LJJJLZIJ(url, "duetcontrol/setting", false)) {
            str = "duet";
        } else if (s.LJJJLZIJ(url, "privacy/following_visibility", false)) {
            str = "following_list_sheet";
        } else if (s.LJJJLZIJ(url, "mylikelistcontrol/setting", false)) {
            str = "liked_list_sheet";
        } else if (s.LJJJLZIJ(url, "profileviewhistory/settings", false)) {
            str = "profile_view_history";
        } else if (s.LJJJLZIJ(url, "stitchcontrol/setting", false)) {
            str = "stitch";
        } else if (s.LJJJLZIJ(url, "privacy/suggest_account", false)) {
            str = "sug_to_others";
        } else if (s.LJJJLZIJ(url, "mentioncontrol/setting", false)) {
            str = "tag_mention";
        } else {
            if (s.LJJJLZIJ(url, "videoviewhistory/settings", false)) {
                str = "video_view_history";
            }
            return null;
        }
        SmartRoute buildRoute = SmartRouter.buildRoute(context, "//privacy/setting/page");
        buildRoute.withParam("target", str);
        buildRoute.withParam(bundle);
        buildRoute.open();
        return null;
    }
}
