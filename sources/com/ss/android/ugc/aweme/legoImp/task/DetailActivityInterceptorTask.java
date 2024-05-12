package com.ss.android.ugc.aweme.legoImp.task;

import X.C00F;
import X.C0RN;
import X.C16880lQ;
import X.C54502LaE;
import X.C62712d9;
import X.C98923uS;
import X.EE1;
import X.EFK;
import X.EnumC36092EEm;
import X.EnumC36103EEx;
import X.IWF;
import X.X1D;
import android.content.Context;
import android.content.Intent;
import com.bytedance.router.RouteIntent;
import com.bytedance.router.SmartRouter;
import com.bytedance.router.interceptor.IInterceptor;
import com.ss.android.ugc.aweme.awemeservice.AwemeService;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import java.util.List;
import ujb.o;

/* loaded from: classes2.dex */
public final class DetailActivityInterceptorTask implements EE1 {
    @Override // X.EEY
    public final String key() {
        return "DetailActivityInterceptorTask";
    }

    @Override // X.EEY
    public final /* synthetic */ boolean meetTrigger() {
        return true;
    }

    @Override // X.EEY
    public final /* synthetic */ String prefix() {
        return "task_";
    }

    @Override // X.EE1
    public final /* synthetic */ boolean serialExecute() {
        return false;
    }

    @Override // X.EEY
    public final /* synthetic */ int targetProcess() {
        return C0RN.LIZ();
    }

    @Override // X.EEY
    public final /* synthetic */ List triggerOtherLegoComponents() {
        return null;
    }

    @Override // X.EEY
    public final /* synthetic */ EnumC36103EEx triggerType() {
        return C0RN.LIZIZ(this);
    }

    @Override // X.EEY
    public final EnumC36092EEm scenesType() {
        return EnumC36092EEm.DEFAULT;
    }

    @Override // X.EE1
    public final EFK type() {
        return EFK.BOOT_FINISH;
    }

    /* loaded from: classes2.dex */
    public static final class DetailPageRouterInterceptor implements IInterceptor {
        @Override // com.bytedance.router.interceptor.IInterceptor
        public final /* synthetic */ boolean shouldHandleRoute(RouteIntent routeIntent) {
            return C62712d9.LIZ(this, routeIntent);
        }

        @Override // com.bytedance.router.interceptor.IInterceptor
        public final boolean matchInterceptRules(RouteIntent routeIntent) {
            String path;
            String str = null;
            if (routeIntent != null) {
                str = routeIntent.getHost();
            }
            String str2 = "";
            if (str == null) {
                str = "";
            }
            if (routeIntent != null && (path = routeIntent.getPath()) != null) {
                str2 = path;
            }
            StringBuilder LIZ = X1D.LIZ();
            LIZ.append(str);
            LIZ.append(str2);
            boolean LJJJLIIL = o.LJJJLIIL(X1D.LIZIZ(LIZ), "aweme/detail", false);
            if (LJJJLIIL) {
                C54502LaE.LIZ("detail_page_loading");
            }
            return LJJJLIIL;
        }

        @Override // com.bytedance.router.interceptor.IInterceptor
        public final boolean onInterceptRoute(Context context, RouteIntent routeIntent) {
            String str;
            Intent extra;
            if (!C98923uS.LIZ()) {
                return false;
            }
            if (routeIntent != null && (extra = routeIntent.getExtra()) != null) {
                str = C16880lQ.LLJJIJIIJIL(extra, "id");
            } else {
                str = null;
            }
            Aweme i6 = AwemeService.LIZ().i6(str);
            if (i6 != null) {
                IWF.LJJLIIIIJ().LJJJJJ(i6, true, false);
            }
            return false;
        }
    }

    @Override // X.EEY
    public final void run(Context context) {
        if (context != null && C00F.LIZ(31744, 0, "detailActivity_add_interceptor", true) == 1) {
            SmartRouter.addInterceptor(new DetailPageRouterInterceptor());
        }
    }
}
