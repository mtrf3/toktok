package X;

import com.byted.cast.common.CastLogger;
import com.byted.cast.common.ContextManager;
import com.byted.cast.common.Logger;
import com.byted.cast.common.api.ICastSource;
import kotlin.jvm.internal.o;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: X.ZYh, reason: case insensitive filesystem */
/* loaded from: classes29.dex */
public final class C90115ZYh {
    public final ICastSource LIZ;
    public final CastLogger LIZIZ;

    public final String LIZ() {
        String str;
        JSONObject jSONObject = new JSONObject();
        try {
            ICastSource iCastSource = this.LIZ;
            if (iCastSource != null) {
                str = iCastSource.getVersion();
            } else {
                str = null;
            }
            jSONObject.put("com.ss.cast:vast_cast", str);
        } catch (JSONException e) {
            CastLogger castLogger = this.LIZIZ;
            StringBuilder LIZ = X1D.LIZ();
            LIZ.append("getVersion error: ");
            LIZ.append(e);
            castLogger.w("CastRelay", X1D.LIZIZ(LIZ));
        }
        String jSONObject2 = jSONObject.toString();
        o.LJFF(jSONObject2, "json.toString()");
        return jSONObject2;
    }

    public C90115ZYh(ContextManager.CastContext castContext) {
        o.LJIIJ(castContext, "castContext");
        CastLogger logger = ContextManager.getLogger(castContext);
        o.LJFF(logger, "ContextManager.getLogger(castContext)");
        this.LIZIZ = logger;
        o.LJFF(ContextManager.getMonitor(castContext), "ContextManager.getMonitor(castContext)");
        try {
            Object newInstance = Class.forName("com.byted.cast.vcast.VastCastSourceWrapper").getDeclaredConstructor(ContextManager.CastContext.class).newInstance(castContext);
            if (newInstance != null) {
                ICastSource iCastSource = (ICastSource) newInstance;
                this.LIZ = iCastSource;
                StringBuilder LIZ = X1D.LIZ();
                LIZ.append("vastcast:");
                LIZ.append(iCastSource);
                Logger.i("CastRelay", X1D.LIZIZ(LIZ));
                return;
            }
            throw new C37692Eqm("null cannot be cast to non-null type com.byted.cast.common.api.ICastSource");
        } catch (Throwable th) {
            StringBuilder LIZ2 = X1D.LIZ();
            LIZ2.append("vastcast: init error: ");
            LIZ2.append(th.getMessage());
            Logger.e("CastRelay", X1D.LIZIZ(LIZ2));
        }
    }
}
