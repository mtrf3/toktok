package com.ss.android.ugc.aweme.setting.experiment;

import X.C113554cx;
import X.C59895Nf1;
import X.C62712d9;
import X.InterfaceC65784Pro;
import X.OSZ;
import X.SKD;
import X.SKE;
import X.SKF;
import X.SKG;
import X.X1D;
import android.content.Context;
import android.net.Uri;
import com.bytedance.router.RouteIntent;
import com.bytedance.router.interceptor.IInterceptor;
import java.util.HashMap;
import java.util.Set;
import kotlin.jvm.internal.o;

/* loaded from: classes13.dex */
public final class InboxMsgInterceptor implements IInterceptor {
    public final HashMap<String, InterfaceC65784Pro<String>> LJLIL;
    public final Set<String> LJLILLLLZI;

    @Override // com.bytedance.router.interceptor.IInterceptor
    public final /* synthetic */ boolean shouldHandleRoute(RouteIntent routeIntent) {
        return C62712d9.LIZ(this, routeIntent);
    }

    public InboxMsgInterceptor() {
        HashMap<String, InterfaceC65784Pro<String>> LJJJLZIJ = C113554cx.LJJJLZIJ(new OSZ("betaTesting/joinTester", SKD.LJLIL), new OSZ("betaTesting/joinSuccess", SKE.LJLIL), new OSZ("betaTesting/joinTasks", SKF.LJLIL), new OSZ("setting/beta_register", SKG.LJLIL));
        this.LJLIL = LJJJLZIJ;
        Set<String> keySet = LJJJLZIJ.keySet();
        o.LJIIIIZZ(keySet, "map.keys");
        this.LJLILLLLZI = keySet;
    }

    @Override // com.bytedance.router.interceptor.IInterceptor
    public final boolean matchInterceptRules(RouteIntent routeIntent) {
        Uri uri;
        if (routeIntent == null || (uri = routeIntent.getUri()) == null) {
            return false;
        }
        Set<String> set = this.LJLILLLLZI;
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append(uri.getHost());
        LIZ.append(uri.getPath());
        return set.contains(X1D.LIZIZ(LIZ));
    }

    @Override // com.bytedance.router.interceptor.IInterceptor
    public final boolean onInterceptRoute(Context context, RouteIntent routeIntent) {
        Uri uri;
        if (context == null || routeIntent == null || (uri = routeIntent.getUri()) == null) {
            return false;
        }
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append(uri.getHost());
        LIZ.append(uri.getPath());
        InterfaceC65784Pro<String> interfaceC65784Pro = this.LJLIL.get(X1D.LIZIZ(LIZ));
        if (interfaceC65784Pro == null) {
            return false;
        }
        C59895Nf1.LIZLLL(context, interfaceC65784Pro.invoke(), "enter_from", "inbox_notification");
        return true;
    }
}
