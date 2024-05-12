package X;

import android.view.View;
import com.bytedance.android.monitorV2.jsworker.JsWorkerModule;
import com.bytedance.vmsdk.jsbridge.JSModule;
import com.bytedance.vmsdk.jsbridge.JSModuleManager;
import com.bytedance.vmsdk.jsbridge.JSModuleWrapper;
import kotlin.jvm.internal.o;

/* renamed from: X.Er7, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C37713Er7 {
    public static final /* synthetic */ int LIZ = 0;

    public static void LIZ(View view, JSModuleManager manager) {
        JSModule module;
        JsWorkerModule jsWorkerModule;
        o.LJIIJ(view, "view");
        o.LJIIJ(manager, "manager");
        try {
            JSModuleWrapper LIZ2 = manager.LIZ("hybridMonitor");
            if (LIZ2 != null && (module = LIZ2.getModule()) != null && (module instanceof JsWorkerModule) && (jsWorkerModule = (JsWorkerModule) module) != null) {
                jsWorkerModule.onAttachView(view);
            }
        } catch (Throwable th) {
            C77117UOj.LJIIZILJ(th);
        }
    }
}
