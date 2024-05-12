package com.ss.android.ugc.aweme.story.route;

import X.C16880lQ;
import X.C221018lt;
import X.C222978p3;
import X.C224068qo;
import X.C47261Igj;
import X.C53578L1a;
import X.C55480Lq0;
import X.C62712d9;
import X.InterfaceC88472Yns;
import X.ORZ;
import X.X1D;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import com.bytedance.router.RouteIntent;
import com.bytedance.router.interceptor.IInterceptor;
import com.ss.android.ugc.aweme.feed.model.CardStruct;
import java.io.Serializable;
import java.util.HashMap;
import ujb.o;

/* loaded from: classes4.dex */
public final class StoryDetailInterceptor implements IInterceptor {
    public final String[] LJLIL = {"aweme/detail", "tuwen/detail", "aweme/detaillist", "detail", "user/video", "story/detail"};

    @Override // com.bytedance.router.interceptor.IInterceptor
    public final /* synthetic */ boolean shouldHandleRoute(RouteIntent routeIntent) {
        return C62712d9.LIZ(this, routeIntent);
    }

    @Override // com.bytedance.router.interceptor.IInterceptor
    public final boolean matchInterceptRules(RouteIntent routeIntent) {
        Uri uri;
        String str;
        String str2;
        Intent extra;
        boolean z;
        String str3;
        C53578L1a.LIZ.getClass();
        if (!C53578L1a.LIZ()) {
            return false;
        }
        String str4 = null;
        if (routeIntent != null) {
            uri = routeIntent.getUri();
        } else {
            uri = null;
        }
        StringBuilder LIZ = X1D.LIZ();
        if (uri != null) {
            str = uri.getHost();
        } else {
            str = null;
        }
        LIZ.append(str);
        if (uri != null) {
            str2 = uri.getPath();
        } else {
            str2 = null;
        }
        LIZ.append(str2);
        String LIZIZ = X1D.LIZIZ(LIZ);
        if (o.LJJJLIIL(LIZIZ, "story/detail", false)) {
            return true;
        }
        for (String str5 : this.LJLIL) {
            if (o.LJJJLIIL(LIZIZ, str5, false)) {
                if (routeIntent == null || (extra = routeIntent.getExtra()) == null) {
                    return false;
                }
                if (extra.getBooleanExtra("is_from_story_client_share", false)) {
                    return true;
                }
                if (extra == null) {
                    return false;
                }
                String LLJJIJIIJIL = C16880lQ.LLJJIJIIJIL(extra, "refer");
                if (extra.getIntExtra("video_type", -1) == 0 && ORZ.LJLJJI(LLJJIJIIJIL, C47261Igj.LJJIJIIJI("personal_homepage", "others_homepage"))) {
                    z = true;
                } else {
                    z = false;
                }
                if (extra != null) {
                    str3 = C16880lQ.LLJJIJIIJIL(extra, "id");
                    str4 = C16880lQ.LLJJIJIIJIL(extra, "userid");
                } else {
                    str3 = null;
                }
                if (!z || !kotlin.jvm.internal.o.LJ(str3, str4)) {
                    return false;
                }
                return true;
            }
        }
        return false;
    }

    @Override // com.bytedance.router.interceptor.IInterceptor
    public final boolean onInterceptRoute(Context context, RouteIntent routeIntent) {
        HashMap hashMap;
        Intent extra;
        String LLJJIJIIJIL;
        C221018lt.LIZ("StoryDetailInterceptor", "onInterceptRoute");
        C55480Lq0 c55480Lq0 = C55480Lq0.LIZIZ;
        c55480Lq0.LIZIZ(249372176);
        if (routeIntent != null && (extra = routeIntent.getExtra()) != null && (LLJJIJIIJIL = C16880lQ.LLJJIJIIJIL(extra, "video_from")) != null) {
            c55480Lq0.LIZJ(249372176, "video_from", LLJJIJIIJIL);
        }
        Intent intent = null;
        if (routeIntent != null) {
            intent = routeIntent.getExtra();
        }
        if (intent != null && (C222978p3.LIZ().preCreateCellEnabled || C222978p3.LIZ().prefetchEnabled)) {
            String LLJJIJIIJIL2 = C16880lQ.LLJJIJIIJIL(intent, "video_from");
            InterfaceC88472Yns<Intent, String> interfaceC88472Yns = C224068qo.LIZ.get(LLJJIJIIJIL2);
            if (interfaceC88472Yns != null) {
                String invoke = interfaceC88472Yns.invoke(intent);
                if (!kotlin.jvm.internal.o.LJ(invoke, CardStruct.IStatusCode.DEFAULT)) {
                    Serializable serializableExtra = intent.getSerializableExtra("feed_param_extra");
                    if (serializableExtra == null) {
                        serializableExtra = new HashMap();
                        intent.putExtra("feed_param_extra", serializableExtra);
                    }
                    if ((serializableExtra instanceof HashMap) && (hashMap = (HashMap) serializableExtra) != null) {
                        hashMap.put("story_extra_cell_preload_type", invoke);
                    }
                }
                StringBuilder LIZ = X1D.LIZ();
                LIZ.append("processed for ");
                LIZ.append(LLJJIJIIJIL2);
                C221018lt.LIZ("STORY-Preloader", X1D.LIZIZ(LIZ));
            } else {
                StringBuilder LIZ2 = X1D.LIZ();
                LIZ2.append("missing processor for: ");
                LIZ2.append(LLJJIJIIJIL2);
                C221018lt.LIZIZ("STORY-Preloader", X1D.LIZIZ(LIZ2));
            }
        }
        return false;
    }
}
