package com.ss.android.ugc.aweme.legoImpl.task;

import X.C0RN;
import X.C16880lQ;
import X.C56419MCh;
import X.C56662Kg;
import X.C61197O0b;
import X.C61200O0e;
import X.C61210O0o;
import X.C88074YhS;
import X.EE1;
import X.EF7;
import X.EFK;
import X.EU2;
import X.EnumC36092EEm;
import X.EnumC36103EEx;
import X.FKM;
import X.OHZ;
import android.content.Context;
import com.bytedance.ies.ugc.aweme.smartanchor_declaration.RouterAnchorPoint;
import com.bytedance.router.RouteManager;
import com.bytedance.router.SmartRouter;
import com.bytedance.router.monitor.RouterMonitor;
import com.bytedance.router.util.Logger;
import com.google.gson.internal.b;
import com.ss.android.ugc.aweme.app.host.AwemeHostApplication;
import com.ss.android.ugc.aweme.router.RouterOpen;
import java.util.Iterator;
import java.util.List;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes11.dex */
public class InitRouter implements EE1 {
    @Override // X.EEY
    public final String key() {
        return "InitRouter";
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
    public final int targetProcess() {
        return 1;
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
        return EFK.MAIN;
    }

    @Override // X.EEY
    public final void run(Context context) {
        C56662Kg.LIZ().LIZJ("method_init_smart_router_duration", false);
        C61200O0e.LIZLLL.add(new C56419MCh());
        AwemeHostApplication LIZ = FKM.LIZ();
        if (C61200O0e.LJI == null) {
            synchronized (C61200O0e.class) {
                if (C61200O0e.LJI == null) {
                    C61200O0e.LJI = new C61200O0e(LIZ);
                }
            }
        }
        C61200O0e LIZLLL = C61200O0e.LIZLLL();
        RouterOpen routerOpen = new RouterOpen();
        LIZLLL.getClass();
        C61200O0e.LJ = routerOpen;
        SmartRouter.init(EF7.LIZIZ());
        Logger.setDebug(false);
        SmartRouter.configRouter("snssdk1233").withOtherSchemes(new String[]{"aweme", "sslocal"});
        RouteManager.getInstance().setRouteIntentInterceptor(new b());
        if (!((Boolean) C88074YhS.LJIIIZ.getValue()).booleanValue()) {
            RouterAnchorPoint.getPoint().run(new Object());
            if (EU2.LIZ()) {
                C61210O0o.LIZ.LIZIZ();
            }
            SmartRouter.canOpen(null);
        } else {
            SmartRouter.injectInitializer(new OHZ());
        }
        RouterMonitor.INSTANCE.setRouterMonitorListener(new C61197O0b());
        C56662Kg.LIZ().LJFF("method_init_smart_router_duration", false);
    }

    public static void LIZLLL(JSONObject jSONObject, JSONObject jSONObject2) {
        Iterator<String> keys = jSONObject.keys();
        while (keys.hasNext()) {
            String next = keys.next();
            try {
                jSONObject2.putOpt(next, jSONObject.opt(next));
            } catch (JSONException e) {
                C16880lQ.LLLLIIL(e);
            }
        }
    }
}
