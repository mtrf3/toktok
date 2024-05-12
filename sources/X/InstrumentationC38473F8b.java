package X;

import android.app.Activity;
import android.app.Instrumentation;
import android.content.Intent;
import android.os.Bundle;
import android.os.Looper;
import com.bytedance.common.utility.reflect.Reflect;
import com.bytedance.ies.abmock.SettingsManager;
import com.bytedance.router.SmartRoute;
import com.bytedance.router.SmartRouter;
import java.lang.reflect.Field;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* renamed from: X.F8b, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class InstrumentationC38473F8b extends Instrumentation {
    public static final List<InterfaceC38474F8c> LIZ = new ArrayList();
    public static boolean LIZIZ;

    public static void LIZ(InterfaceC38474F8c interfaceC38474F8c) {
        if (!F8X.LIZIZ || Looper.myLooper() == C16880lQ.LLJJJJ()) {
            interfaceC38474F8c.registerCondition();
            ArrayList arrayList = (ArrayList) LIZ;
            if (!arrayList.contains(interfaceC38474F8c)) {
                arrayList.add(interfaceC38474F8c);
                return;
            }
            return;
        }
        throw new RuntimeException("register only in UI thread.");
    }

    @Override // android.app.Instrumentation
    public final void callActivityOnCreate(Activity activity, Bundle bundle) {
        if (C38476F8e.LIZ) {
            C38476F8e.LIZ = false;
            try {
                SettingsManager.LIZLLL().getClass();
                if (SettingsManager.LJ("fix_on_restore_create", 0) == 1 && bundle != null) {
                    Field declaredField = C64256PJs.class.getDeclaredField("LJ");
                    declaredField.setAccessible(true);
                    int intValue = ((Integer) declaredField.get(C64256PJs.LIZIZ())).intValue();
                    if (intValue == -1) {
                        System.err.println("Npth is not init completely, report abort");
                    } else if (intValue == 1) {
                        System.err.println(activity + " onRestoreInstanceState with FIRST_LAUNCH_UPDATE");
                        C38476F8e.LIZ(bundle);
                        bundle = null;
                        Intent intent = activity.getIntent();
                        if (intent != null) {
                            C38476F8e.LIZ((Bundle) Reflect.on(intent).field("mExtras", new Class[0]).get());
                            Reflect.on(intent).set("mExtras", null);
                        }
                        SmartRoute buildRoute = SmartRouter.buildRoute(activity, "aweme://main");
                        buildRoute.addFlags(268468224);
                        buildRoute.open();
                        activity.finish();
                    }
                }
            } catch (Throwable unused) {
            }
        }
        super.callActivityOnCreate(activity, bundle);
    }

    @Override // android.app.Instrumentation
    public final boolean onException(Object obj, Throwable th) {
        Iterator it = ((ArrayList) LIZ).iterator();
        while (it.hasNext()) {
            if (((InterfaceC38474F8c) it.next()).LIZ(obj, th)) {
                return true;
            }
        }
        return super.onException(obj, th);
    }
}
