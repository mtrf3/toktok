package com.bytedance.android.livesdk.comp.api.subscription.base.flashcomponent;

import X.C09G;
import X.C0NB;
import X.C199097rd;
import X.C29306Beo;
import X.C63016OoG;
import X.C72818Shy;
import X.C76052yf;
import X.C78528Urs;
import X.InterfaceC65784Pro;
import X.InterfaceC72822Si2;
import X.InterfaceC78280Uns;
import X.X1D;
import androidx.lifecycle.DefaultLifecycleObserver;
import androidx.lifecycle.GenericLifecycleObserver;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwner;
import com.google.android.play.core.appupdate.u;
import java.util.LinkedHashSet;
import java.util.Set;
import kotlin.jvm.internal.o;
import org.json.JSONObject;

/* loaded from: classes11.dex */
public class FlashDataProvider implements GenericLifecycleObserver, InterfaceC72822Si2, DefaultLifecycleObserver {
    public static final Set<String> LJLJJI = new LinkedHashSet();
    public String LJLIL;
    public final InterfaceC65784Pro<JSONObject> LJLILLLLZI;
    public JSONObject LJLJI;

    @Override // androidx.lifecycle.DefaultLifecycleObserver, androidx.lifecycle.FullLifecycleObserver
    public final /* synthetic */ void onCreate(LifecycleOwner lifecycleOwner) {
        C09G.LIZ(this, lifecycleOwner);
    }

    @Override // androidx.lifecycle.DefaultLifecycleObserver, androidx.lifecycle.FullLifecycleObserver
    public final /* synthetic */ void onDestroy(LifecycleOwner lifecycleOwner) {
        C09G.LIZIZ(this, lifecycleOwner);
    }

    @Override // androidx.lifecycle.DefaultLifecycleObserver, androidx.lifecycle.FullLifecycleObserver
    public final /* synthetic */ void onPause(LifecycleOwner lifecycleOwner) {
        C09G.LIZJ(this, lifecycleOwner);
    }

    @Override // androidx.lifecycle.DefaultLifecycleObserver, androidx.lifecycle.FullLifecycleObserver
    public final /* synthetic */ void onResume(LifecycleOwner lifecycleOwner) {
        C09G.LIZLLL(this, lifecycleOwner);
    }

    @Override // androidx.lifecycle.DefaultLifecycleObserver, androidx.lifecycle.FullLifecycleObserver
    public final /* synthetic */ void onStart(LifecycleOwner lifecycleOwner) {
        C09G.LJ(this, lifecycleOwner);
    }

    @Override // androidx.lifecycle.LifecycleEventObserver
    public void onStateChanged(LifecycleOwner lifecycleOwner, Lifecycle.Event event) {
    }

    @Override // androidx.lifecycle.DefaultLifecycleObserver, androidx.lifecycle.FullLifecycleObserver
    public final /* synthetic */ void onStop(LifecycleOwner lifecycleOwner) {
        C09G.LJFF(this, lifecycleOwner);
    }

    public FlashDataProvider(C63016OoG provideData) {
        o.LJIIIZ(provideData, "provideData");
        this.LJLIL = "";
        this.LJLILLLLZI = provideData;
    }

    @Override // X.InterfaceC72822Si2
    public void onReceiveJsEvent(C199097rd c199097rd) {
        String str;
        if (o.LJ(c199097rd.LJLIL, "fetch_flash_component_data")) {
            InterfaceC78280Uns interfaceC78280Uns = c199097rd.LJLILLLLZI;
            if (interfaceC78280Uns != null) {
                str = u.LJJIJIL(interfaceC78280Uns, "flash_component_id", "");
            } else {
                str = null;
            }
            if (o.LJ(str, this.LJLIL)) {
                try {
                    JSONObject invoke = this.LJLILLLLZI.invoke();
                    if (o.LJ(invoke, this.LJLJI)) {
                        invoke = this.LJLJI;
                        if (invoke == null) {
                            invoke = new JSONObject();
                        }
                    } else {
                        this.LJLJI = invoke;
                        if (invoke == null) {
                            invoke = new JSONObject();
                        }
                    }
                    LIZ("", 0, invoke);
                } catch (Exception e) {
                    LIZ("data_illegal", 1, new JSONObject());
                    StringBuilder LIZ = X1D.LIZ();
                    LIZ.append("return data error ");
                    LIZ.append(this.LJLIL);
                    C0NB.LJFF("FlashDataProvider", X1D.LIZIZ(LIZ), e);
                }
            }
        }
    }

    public final void LIZ(String errorMsg, int i, JSONObject jSONObject) {
        o.LJIIIZ(errorMsg, "errorMsg");
        try {
            JSONObject jSONObject2 = new JSONObject();
            jSONObject2.put("data", jSONObject);
            jSONObject2.put("status_code", i);
            jSONObject2.put("flash_component_id", this.LJLIL);
            if (C29306Beo.LJIJJLI(errorMsg)) {
                jSONObject2.put("error_message", errorMsg);
            }
            C72818Shy.LIZ(new C76052yf(System.currentTimeMillis(), new C78528Urs(jSONObject2), "return_flash_component_data"));
        } catch (Exception e) {
            StringBuilder LIZ = X1D.LIZ();
            LIZ.append("pushDataToFE ");
            LIZ.append(this.LJLIL);
            C0NB.LJFF("FlashDataProvider", X1D.LIZIZ(LIZ), e);
        }
    }
}
