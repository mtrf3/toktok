package com.ss.android.ugc.aweme.router;

import X.C16880lQ;
import X.C45804HyK;
import X.C62712d9;
import X.EnumC44013HPd;
import X.HVB;
import X.HVC;
import X.HVI;
import X.X1D;
import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import com.bytedance.router.RouteIntent;
import com.bytedance.router.SmartRouter;
import com.bytedance.router.interceptor.IInterceptor;
import com.ss.android.ugc.aweme.album.ToolsAlbumServiceImpl;
import kotlin.jvm.internal.o;

/* loaded from: classes8.dex */
public final class UploadActionInterceptor implements IInterceptor {
    public final String LJLIL = "createPhoto";

    @Override // com.bytedance.router.interceptor.IInterceptor
    public final /* synthetic */ boolean shouldHandleRoute(RouteIntent routeIntent) {
        return C62712d9.LIZ(this, routeIntent);
    }

    @Override // com.bytedance.router.interceptor.IInterceptor
    public final boolean matchInterceptRules(RouteIntent routeIntent) {
        String str;
        Uri uri;
        Uri uri2;
        StringBuilder LIZ = X1D.LIZ();
        String str2 = null;
        if (routeIntent != null && (uri2 = routeIntent.getUri()) != null) {
            str = uri2.getHost();
        } else {
            str = null;
        }
        LIZ.append(str);
        if (routeIntent != null && (uri = routeIntent.getUri()) != null) {
            str2 = uri.getPath();
        }
        LIZ.append(str2);
        return o.LJ(X1D.LIZIZ(LIZ), this.LJLIL);
    }

    @Override // com.bytedance.router.interceptor.IInterceptor
    public final boolean onInterceptRoute(Context context, RouteIntent routeIntent) {
        String str;
        String str2;
        Activity LJIJJ;
        Intent extra;
        Bundle LLJJIJI;
        String string;
        Intent extra2;
        Bundle LLJJIJI2;
        Intent extra3;
        Bundle LLJJIJI3;
        String str3 = "";
        if (routeIntent == null || (extra3 = routeIntent.getExtra()) == null || (LLJJIJI3 = C16880lQ.LLJJIJI(extra3)) == null || (str = LLJJIJI3.getString("enter_from")) == null) {
            str = "";
        }
        if (routeIntent == null || (extra2 = routeIntent.getExtra()) == null || (LLJJIJI2 = C16880lQ.LLJJIJI(extra2)) == null || (str2 = LLJJIJI2.getString("shoot_way")) == null) {
            str2 = "";
        }
        if (routeIntent != null && (extra = routeIntent.getExtra()) != null && (LLJJIJI = C16880lQ.LLJJIJI(extra)) != null && (string = LLJJIJI.getString("enter_method")) != null) {
            str3 = string;
        }
        if (HVI.LIZ()) {
            Uri.Builder builder = new Uri.Builder();
            builder.scheme("aweme");
            builder.authority("openShoot");
            builder.appendQueryParameter("shoot_way", str2);
            builder.appendQueryParameter("enter_from", str);
            builder.appendQueryParameter("enter_method", str3);
            builder.appendQueryParameter("tab", "album_tab");
            builder.appendQueryParameter("target_sub_tab_for_upload_page", "photo");
            builder.appendQueryParameter("upload_page_multiselect", "true");
            builder.build();
            String builder2 = builder.toString();
            o.LJIIIIZZ(builder2, "Builder().apply {\n      …ld()\n        }.toString()");
            SmartRouter.buildRoute(context, builder2).open();
            return true;
        }
        if (context == null || (LJIJJ = C45804HyK.LJIJJ(context)) == null) {
            return true;
        }
        HVB LIZ = ToolsAlbumServiceImpl.LIZIZ().LIZ(new HVC(str2, str, str3));
        LIZ.LIZ(EnumC44013HPd.PHOTO);
        LIZ.LIZIZ();
        LIZ.LIZLLL(LJIJJ);
        return true;
    }
}
