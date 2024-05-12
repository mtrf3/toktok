package X;

import android.app.Activity;
import android.app.Application;
import android.os.Bundle;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: X.QNs, reason: case insensitive filesystem */
/* loaded from: classes12.dex */
public final class C66908QNs implements Application.ActivityLifecycleCallbacks {
    public final Activity LJLIL;
    public int LJLILLLLZI = 1;

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityCreated(Activity activity, Bundle bundle) {
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityDestroyed(Activity activity) {
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityPaused(Activity activity) {
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivitySaveInstanceState(Activity activity, Bundle bundle) {
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityStarted(Activity activity) {
    }

    public C66908QNs(Activity activity) {
        this.LJLIL = activity;
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityResumed(Activity activity) {
        if (activity == this.LJLIL) {
            this.LJLILLLLZI++;
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityStopped(Activity activity) {
        if (activity == this.LJLIL) {
            int i = this.LJLILLLLZI - 1;
            this.LJLILLLLZI = i;
            if (i == 0) {
                JSONObject jSONObject = new JSONObject();
                try {
                    jSONObject.put("key", "background");
                } catch (JSONException e) {
                    C16880lQ.LLLLIIL(e);
                }
                QN2.LIZJ("turing_verify_sdk", jSONObject);
            }
        }
    }
}
