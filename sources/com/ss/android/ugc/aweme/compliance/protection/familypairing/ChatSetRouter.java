package com.ss.android.ugc.aweme.compliance.protection.familypairing;

import X.C45804HyK;
import X.C62712d9;
import X.InterfaceC61208O0m;
import android.app.Activity;
import android.content.Context;
import com.bytedance.router.RouteIntent;
import com.bytedance.router.interceptor.IInterceptor;
import kotlin.jvm.internal.o;
import ujb.s;

/* loaded from: classes10.dex */
public final class ChatSetRouter implements InterfaceC61208O0m, IInterceptor {
    @Override // com.bytedance.router.interceptor.IInterceptor
    public final /* synthetic */ boolean shouldHandleRoute(RouteIntent routeIntent) {
        return C62712d9.LIZ(this, routeIntent);
    }

    @Override // com.bytedance.router.interceptor.IInterceptor
    public final boolean matchInterceptRules(RouteIntent routeIntent) {
        o.LJIIIZ(routeIntent, "routeIntent");
        String originUrl = routeIntent.getOriginUrl();
        o.LJIIIIZZ(originUrl, "routeIntent.originUrl");
        return s.LJJJLZIJ(originUrl, "privacy/setting/modify", false);
    }

    @Override // X.InterfaceC61208O0m
    public final boolean open(String url) {
        o.LJIIIZ(url, "url");
        return LIZ(null, url);
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code restructure failed: missing block: B:53:0x0114, code lost:
    
        if (r6.equals("chat_set") == false) goto L29;
     */
    /* JADX WARN: Code restructure failed: missing block: B:54:0x0138, code lost:
    
        r3 = "aweme://lynxview?channel=tns_familypairing&bundle=direct_message_setting/template.js&hide_nav_bar=1&should_full_screen=1&dynamic=1&use_spark=1&wait_gecko_update=1&useForest=1&type=chat_set&digital_wellbeing_dark_mode_reload=1&show_mask=1&trans_status_bar=1";
     */
    /* JADX WARN: Code restructure failed: missing block: B:62:0x0134, code lost:
    
        if (r6.equals("chat_privacy") == false) goto L29;
     */
    /* JADX WARN: Code restructure failed: missing block: B:64:0x0140, code lost:
    
        if (r6.equals("chat_set") == false) goto L18;
     */
    /* JADX WARN: Code restructure failed: missing block: B:65:0x0164, code lost:
    
        r1 = "aweme://chatcontrol/setting/familypairing";
     */
    /* JADX WARN: Code restructure failed: missing block: B:73:0x0160, code lost:
    
        if (r6.equals("chat_privacy") == false) goto L18;
     */
    /* JADX WARN: Code restructure failed: missing block: B:75:0x016c, code lost:
    
        if (r6.equals("dm_permission_set") == false) goto L18;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r14v2, types: [android.content.Context] */
    @Override // X.InterfaceC61208O0m
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean LIZ(android.app.Activity r14, java.lang.String r15) {
        /*
            Method dump skipped, instructions count: 412
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.compliance.protection.familypairing.ChatSetRouter.LIZ(android.app.Activity, java.lang.String):boolean");
    }

    @Override // com.bytedance.router.interceptor.IInterceptor
    public final boolean onInterceptRoute(Context context, RouteIntent routeIntent) {
        o.LJIIIZ(context, "context");
        o.LJIIIZ(routeIntent, "routeIntent");
        Activity LJIJJ = C45804HyK.LJIJJ(context);
        String originUrl = routeIntent.getOriginUrl();
        o.LJIIIIZZ(originUrl, "routeIntent.originUrl");
        LIZ(LJIJJ, originUrl);
        return true;
    }
}
