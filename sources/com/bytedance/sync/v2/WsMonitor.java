package com.bytedance.sync.v2;

import X.C16880lQ;
import X.C66629QCz;
import X.PV6;
import androidx.lifecycle.GenericLifecycleObserver;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.OnLifecycleEvent;
import java.util.concurrent.atomic.AtomicBoolean;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes12.dex */
public class WsMonitor implements GenericLifecycleObserver {
    public long LJLIL;
    public final AtomicBoolean LJLILLLLZI = new AtomicBoolean(false);
    public boolean LJLJI;

    @Override // androidx.lifecycle.LifecycleEventObserver
    public final void onStateChanged(LifecycleOwner lifecycleOwner, Lifecycle.Event event) {
        if (event == Lifecycle.Event.ON_START) {
            onAnyActivityStart();
            return;
        }
        if (event == Lifecycle.Event.ON_RESUME) {
            onAnyActivityResume();
        } else if (event == Lifecycle.Event.ON_PAUSE) {
            onAnyActivityPause();
        } else if (event == Lifecycle.Event.ON_STOP) {
            onAnyActivityStop();
        }
    }

    @OnLifecycleEvent(Lifecycle.Event.ON_PAUSE)
    private void onAnyActivityPause() {
        C66629QCz.LIZ("WsMonitor ON_PAUSE");
        this.LJLJI = true;
    }

    @OnLifecycleEvent(Lifecycle.Event.ON_RESUME)
    private void onAnyActivityResume() {
        C66629QCz.LIZ("WsMonitor ON_RESUME");
        this.LJLJI = true;
    }

    @OnLifecycleEvent(Lifecycle.Event.ON_START)
    private void onAnyActivityStart() {
        C66629QCz.LIZ("WsMonitor ON_START");
        this.LJLJI = true;
    }

    @OnLifecycleEvent(Lifecycle.Event.ON_STOP)
    private void onAnyActivityStop() {
        C66629QCz.LIZ("WsMonitor ON_STOP");
        this.LJLJI = true;
    }

    public final void LIZ(long j) {
        boolean z = false;
        if (this.LJLILLLLZI.compareAndSet(false, true)) {
            JSONObject jSONObject = new JSONObject();
            if (j <= 0) {
                z = true;
            }
            try {
                jSONObject.put("socket_connected_when_start", z);
                jSONObject.put("foreground_may_launch", this.LJLJI);
            } catch (JSONException e) {
                C16880lQ.LLLLIIL(e);
            }
            JSONObject jSONObject2 = new JSONObject();
            try {
                jSONObject2.put("time", j);
            } catch (JSONException e2) {
                C16880lQ.LLLLIIL(e2);
            }
            PV6.LIZ("sync_sdk_ws_connect_ts", jSONObject, jSONObject2, null);
        }
    }
}
