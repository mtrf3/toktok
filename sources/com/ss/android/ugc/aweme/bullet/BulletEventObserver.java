package com.ss.android.ugc.aweme.bullet;

import X.C16880lQ;
import X.C40264FrA;
import X.C59576NZs;
import X.C59577NZt;
import X.C71367Rzf;
import X.C71396S0i;
import X.F0S;
import X.F21;
import X.F3T;
import X.InterfaceC40516FvE;
import X.QD3;
import X.X1D;
import android.app.Activity;
import android.text.TextUtils;
import androidx.lifecycle.GenericLifecycleObserver;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.OnLifecycleEvent;
import com.bytedance.mt.protector.impl.JSONObjectProtectorUtils;
import com.bytedance.mt.protector.impl.string2number.CastLongProtector;
import com.ss.android.ugc.aweme.commerce.service.ICommerceService;
import org.greenrobot.eventbus.EventBus;
import org.greenrobot.eventbus.ThreadMode;
import org.json.JSONObject;
import ujb.o;

/* loaded from: classes11.dex */
public final class BulletEventObserver implements GenericLifecycleObserver {
    public final F3T LJLIL;
    public final Activity LJLILLLLZI;
    public boolean LJLJI;

    @OnLifecycleEvent(Lifecycle.Event.ON_PAUSE)
    public final void onPause() {
        F0S f0s;
        this.LJLJI = false;
        InterfaceC40516FvE LIZ = LIZ();
        if (LIZ != null) {
            f0s = LIZ.LLLIZZ();
        } else {
            f0s = null;
        }
        if (f0s == F0S.WEB) {
            LIZIZ("viewDisappeared", null);
            LIZIZ("invisible", null);
        }
    }

    @OnLifecycleEvent(Lifecycle.Event.ON_RESUME)
    public final void onResume() {
        F0S f0s;
        this.LJLJI = true;
        InterfaceC40516FvE LIZ = LIZ();
        if (LIZ != null) {
            f0s = LIZ.LLLIZZ();
        } else {
            f0s = null;
        }
        if (f0s == F0S.WEB) {
            LIZIZ("viewAppeared", null);
        }
    }

    @Override // androidx.lifecycle.LifecycleEventObserver
    public final void onStateChanged(LifecycleOwner lifecycleOwner, Lifecycle.Event event) {
        if (event == Lifecycle.Event.ON_CREATE) {
            onCreate();
            return;
        }
        if (event == Lifecycle.Event.ON_RESUME) {
            onResume();
        } else if (event == Lifecycle.Event.ON_PAUSE) {
            onPause();
        } else if (event == Lifecycle.Event.ON_DESTROY) {
            onDestroy();
        }
    }

    public final InterfaceC40516FvE LIZ() {
        F3T f3t = this.LJLIL;
        if (f3t != null) {
            return (InterfaceC40516FvE) f3t.LIZJ(InterfaceC40516FvE.class);
        }
        return null;
    }

    @OnLifecycleEvent(Lifecycle.Event.ON_CREATE)
    public final void onCreate() {
        EventBus.LIZJ().LJIILJJIL(this);
        System.currentTimeMillis();
    }

    @OnLifecycleEvent(Lifecycle.Event.ON_DESTROY)
    public final void onDestroy() {
        EventBus.LIZJ().LJIJ(this);
    }

    @QD3
    public final void onEvent(C40264FrA c40264FrA) {
        String str;
        String str2;
        Activity activity;
        F21 LLLLLLJ;
        if (c40264FrA == null || (str = c40264FrA.LJLIL) == null || str.length() == 0) {
            return;
        }
        String str3 = c40264FrA.LJLIL;
        InterfaceC40516FvE LIZ = LIZ();
        if (LIZ == null || (LLLLLLJ = LIZ.LLLLLLJ()) == null || (str2 = LLLLLLJ.LJLIL) == null) {
            str2 = "";
        }
        if (!o.LJJJJIZL(str3, str2, true) || 1 == 0 || (activity = this.LJLILLLLZI) == null || !(!activity.isFinishing())) {
            return;
        }
        activity.finish();
    }

    @QD3(threadMode = ThreadMode.MAIN)
    public final void onJsBroadcastEvent(C59576NZs event) {
        String str;
        JSONObject jSONObject;
        kotlin.jvm.internal.o.LJIIIZ(event, "event");
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("BulletEventObserver onJsBroadcastEvent event:");
        JSONObject jSONObject2 = event.LJLIL;
        String str2 = null;
        if (jSONObject2 != null) {
            str = jSONObject2.optString("eventName");
        } else {
            str = null;
        }
        LIZ.append(str);
        X1D.LIZIZ(LIZ);
        if (this.LJLJI) {
            JSONObject jSONObject3 = event.LJLIL;
            if (jSONObject3 != null) {
                str2 = jSONObject3.optString("eventName");
            }
            if (TextUtils.equals("goods_rn_page_monitor", str2)) {
                try {
                    JSONObject jSONObject4 = event.LJLIL;
                    if (jSONObject4 != null && (jSONObject = JSONObjectProtectorUtils.getJSONObject(jSONObject4, "data")) != null) {
                        ICommerceService LIZ2 = C71396S0i.LIZ();
                        C71367Rzf c71367Rzf = new C71367Rzf();
                        CastLongProtector.valueOf(jSONObject.optString("interact_render_ts")).longValue();
                        jSONObject.optString("page_id");
                        CastLongProtector.valueOf(jSONObject.optString("ender_render_ts")).longValue();
                        jSONObject.optString("session_id");
                        LIZ2.logCommerceEvents("commerce_page_render_time", c71367Rzf);
                    }
                } catch (Exception e) {
                    C16880lQ.LLLLIIL(e);
                }
            }
        }
        LIZIZ("notification", event.LJLIL);
    }

    public BulletEventObserver(F3T f3t, Activity activity) {
        this.LJLIL = f3t;
        this.LJLILLLLZI = activity;
    }

    public final void LIZIZ(String str, JSONObject jSONObject) {
        InterfaceC40516FvE LIZ = LIZ();
        if (LIZ != null) {
            LIZ.onEvent(new C59577NZt(str, jSONObject));
        }
    }
}
