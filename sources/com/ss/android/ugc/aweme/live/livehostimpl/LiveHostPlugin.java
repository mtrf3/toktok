package com.ss.android.ugc.aweme.live.livehostimpl;

import X.C09900aA;
import X.C16880lQ;
import X.C37131Ehj;
import X.C37132Ehk;
import X.C39647FhD;
import X.F5Q;
import X.F5R;
import X.F6P;
import X.F6R;
import X.F6S;
import X.F6T;
import X.OSZ;
import android.content.Context;
import com.bytedance.android.livesdkapi.host.IHostPlugin;
import com.bytedance.ies.ugc.aweme.plugin.service.IPluginService;
import com.bytedance.librarian.Librarian;
import com.ss.android.ugc.aweme.plugin.aab.AabPluginServiceImpl;
import kotlin.jvm.internal.o;
import org.json.JSONObject;

/* loaded from: classes7.dex */
public final class LiveHostPlugin implements IHostPlugin {
    @Override // com.bytedance.android.livesdkapi.host.IHostPlugin, X.InterfaceC06390Mx
    public final /* bridge */ /* synthetic */ void onInit() {
        F6R.LIZ(this);
    }

    @Override // com.bytedance.android.livesdkapi.host.IHostPlugin
    public final boolean checkPluginInstalled(String packageName) {
        o.LJIIIZ(packageName, "packageName");
        IPluginService LIZLLL = AabPluginServiceImpl.LIZLLL();
        if (LIZLLL != null) {
            return LIZLLL.checkPluginInstalled(packageName);
        }
        return false;
    }

    @Override // com.bytedance.android.livesdkapi.host.IHostPlugin
    public final void install(F6P config) {
        o.LJIIIZ(config, "config");
        IPluginService LIZLLL = AabPluginServiceImpl.LIZLLL();
        if (LIZLLL != null) {
            C37132Ehk c37132Ehk = new C37132Ehk();
            c37132Ehk.LIZ = config.LIZ;
            c37132Ehk.LIZIZ = config.LIZIZ;
            F5Q f5q = new F5Q();
            f5q.LIZ = false;
            f5q.LIZIZ = config.LIZLLL;
            f5q.LIZJ = config.LJ;
            f5q.LIZLLL = config.LJFF;
            f5q.LJIIJ = config.LJII;
            f5q.LJIIJJI = config.LJIIIIZZ;
            f5q.LJII = config.LJI;
            c37132Ehk.LJ = new F5R(f5q);
            F6T f6t = config.LIZJ;
            if (f6t != null) {
                c37132Ehk.LIZLLL = new F6S(f6t);
            }
            LIZLLL.LIZ(new C37131Ehj(c37132Ehk));
        }
    }

    @Override // com.bytedance.android.livesdkapi.host.IHostPlugin
    public final OSZ<Boolean, String> splitCompatInstall(Context context) {
        o.LJIIIZ(context, "context");
        IPluginService LIZLLL = AabPluginServiceImpl.LIZLLL();
        if (LIZLLL != null && LIZLLL.LIZJ() != null) {
            return new OSZ<>(Boolean.valueOf(C39647FhD.LIZLLL(C16880lQ.LLLLL(context))), "");
        }
        return new OSZ<>(Boolean.FALSE, "aabService is null");
    }

    @Override // com.bytedance.android.livesdkapi.host.IHostPlugin
    public final boolean loadLibrary(int i, Context context, String packageName, String library, ClassLoader classLoader) {
        o.LJIIIZ(context, "context");
        o.LJIIIZ(packageName, "packageName");
        o.LJIIIZ(library, "library");
        o.LJIIIZ(classLoader, "classLoader");
        try {
            Librarian.LJ(library);
            return true;
        } catch (Throwable th) {
            JSONObject jSONObject = new JSONObject();
            try {
                jSONObject.put("package_name", packageName);
                jSONObject.put("library_name", library);
                jSONObject.put("reason", th.getMessage());
                jSONObject.put("event_belong", "live");
                jSONObject.put("event_type", "plugin_load_library_failed");
            } catch (Throwable unused) {
            }
            C09900aA.LJIIJJI("plugin_bug_track", 1, jSONObject);
            return false;
        }
    }
}
