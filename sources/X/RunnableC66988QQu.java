package X;

import Y.ARunnableS30S0200000_11;
import android.content.Context;
import android.os.Looper;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: X.QQu, reason: case insensitive filesystem */
/* loaded from: classes12.dex */
public final class RunnableC66988QQu implements Runnable {
    public final JSONObject LJLIL;
    public final Context LJLILLLLZI;
    public final boolean LJLJI;

    public final void LIZ() {
        JSONObject jSONObject = this.LJLIL;
        if (jSONObject == null) {
            return;
        }
        if (jSONObject.has("sdk_key_PushSDK") && (jSONObject = this.LJLIL.optJSONObject("sdk_key_PushSDK")) == null) {
            if (!QSB.LIZ()) {
                return;
            } else {
                throw new IllegalArgumentException("settings missing sdk_key_PushSDK");
            }
        }
        if (this.LJLJI) {
            Context context = this.LJLILLLLZI;
            try {
                JSONObject jSONObject2 = new JSONObject(jSONObject.toString());
                jSONObject2.remove("ttpush_is_notify_service_stick");
                jSONObject2.remove("ttpush_i18n_allow_push_daemon_monitor");
                jSONObject2.remove("ttpush_is_close_alarm_wakeup");
                jSONObject2.remove("ttpush_allow_push_job_service");
                ARunnableS30S0200000_11 aRunnableS30S0200000_11 = new ARunnableS30S0200000_11(context, jSONObject2, 39);
                if (Looper.myLooper() == C16880lQ.LLJJJJ()) {
                    RunnableC39007FSp.LIZIZ(aRunnableS30S0200000_11);
                } else {
                    aRunnableS30S0200000_11.run();
                }
                return;
            } catch (JSONException e) {
                C16880lQ.LLLLIIL(e);
                return;
            }
        }
        ARunnableS30S0200000_11 aRunnableS30S0200000_112 = new ARunnableS30S0200000_11(this.LJLILLLLZI, jSONObject, 39);
        if (Looper.myLooper() == C16880lQ.LLJJJJ()) {
            RunnableC39007FSp.LIZIZ(aRunnableS30S0200000_112);
        } else {
            aRunnableS30S0200000_112.run();
        }
    }

    @Override // java.lang.Runnable
    public final void run() {
        boolean LIZ;
        try {
            LIZ();
        } finally {
            if (LIZ) {
            }
        }
    }

    public RunnableC66988QQu(Context context, JSONObject jSONObject, boolean z) {
        this.LJLILLLLZI = context;
        this.LJLIL = jSONObject;
        this.LJLJI = z;
    }
}
