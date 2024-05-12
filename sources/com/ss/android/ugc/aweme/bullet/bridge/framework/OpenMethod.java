package com.ss.android.ugc.aweme.bullet.bridge.framework;

import X.C38281F0r;
import X.F3T;
import android.app.Activity;
import android.content.Context;
import android.content.ContextWrapper;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwner;
import com.ss.android.ugc.aweme.bullet.bridge.BaseBridgeMethod;
import java.util.Iterator;
import kotlin.jvm.internal.o;
import org.json.JSONObject;

/* loaded from: classes7.dex */
public abstract class OpenMethod extends BaseBridgeMethod {
    @Override // com.ss.android.ugc.aweme.bullet.bridge.BaseBridgeMethod, androidx.lifecycle.LifecycleEventObserver
    public void onStateChanged(LifecycleOwner lifecycleOwner, Lifecycle.Event event) {
        super.onStateChanged(lifecycleOwner, event);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public OpenMethod(F3T contextProviderFactory) {
        super(contextProviderFactory);
        o.LJIIIZ(contextProviderFactory, "contextProviderFactory");
    }

    public static Activity LIZJ(Context context) {
        if (context == null) {
            return null;
        }
        if (context instanceof Activity) {
            return (Activity) context;
        }
        if (!(context instanceof ContextWrapper)) {
            return null;
        }
        return LIZJ(((ContextWrapper) context).getBaseContext());
    }

    public static void LIZLLL(JSONObject jSONObject, C38281F0r c38281F0r) {
        if (jSONObject != null && jSONObject.length() > 0) {
            Iterator<String> keys = jSONObject.keys();
            while (keys.hasNext()) {
                String next = keys.next();
                Object obj = jSONObject.get(next);
                if (obj instanceof Integer) {
                    c38281F0r.LIZ(((Number) obj).intValue(), next);
                } else if (obj instanceof Long) {
                    c38281F0r.LIZIZ(((Number) obj).longValue(), next);
                } else if (obj instanceof Double) {
                    c38281F0r.LIZJ(next, ((Number) obj).doubleValue());
                } else if (obj instanceof String) {
                    c38281F0r.LIZLLL(next, (String) obj);
                } else if (obj instanceof Boolean) {
                    c38281F0r.LIZLLL(next, obj.toString());
                } else if (obj instanceof JSONObject) {
                    LIZLLL((JSONObject) obj, c38281F0r);
                }
            }
        }
    }
}
