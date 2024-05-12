package com.ss.android.ugc.aweme.placediscovery2.js;

import X.C01R;
import X.C199097rd;
import X.C72818Shy;
import X.C76800UCe;
import X.C78528Urs;
import X.InterfaceC72822Si2;
import X.InterfaceC78280Uns;
import X.InterfaceC88472Yns;
import androidx.lifecycle.GenericLifecycleObserver;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.OnLifecycleEvent;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import org.json.JSONObject;

/* loaded from: classes4.dex */
public final class JSEventCenter implements GenericLifecycleObserver, InterfaceC72822Si2 {
    public final Map<String, InterfaceC88472Yns<InterfaceC78280Uns, C76800UCe>> LJLIL = new LinkedHashMap();

    @Override // androidx.lifecycle.LifecycleEventObserver
    public final void onStateChanged(LifecycleOwner lifecycleOwner, Lifecycle.Event event) {
        if (event == Lifecycle.Event.ON_DESTROY) {
            onDestroy$nearby_release();
        }
    }

    @OnLifecycleEvent(Lifecycle.Event.ON_DESTROY)
    public final void onDestroy$nearby_release() {
        Iterator it = ((LinkedHashMap) this.LJLIL).entrySet().iterator();
        while (it.hasNext()) {
            C72818Shy.LJII((String) ((Map.Entry) it.next()).getKey(), this);
        }
        ((LinkedHashMap) this.LJLIL).clear();
    }

    @Override // X.InterfaceC72822Si2
    public final void onReceiveJsEvent(C199097rd c199097rd) {
        InterfaceC88472Yns interfaceC88472Yns = (InterfaceC88472Yns) ((LinkedHashMap) this.LJLIL).get(c199097rd.LJLIL);
        if (interfaceC88472Yns != null) {
            interfaceC88472Yns.invoke(c199097rd.LJLILLLLZI);
        }
    }

    public static void LIZIZ(String str, JSONObject jSONObject) {
        C01R.LIZIZ(System.currentTimeMillis(), new C78528Urs(jSONObject), str);
    }

    public final void LIZ(String str, InterfaceC88472Yns interfaceC88472Yns) {
        if (this.LJLIL.containsKey(str)) {
            return;
        }
        this.LJLIL.put(str, interfaceC88472Yns);
        C72818Shy.LIZLLL(str, this);
    }
}
