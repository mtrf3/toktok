package com.ss.android.ugc.aweme.web.jsbridge;

import X.C16880lQ;
import X.C188727au;
import X.C38049EwX;
import X.C47135Ieh;
import X.C59866NeY;
import X.F0E;
import X.FMX;
import X.InterfaceC36488ETs;
import X.InterfaceC59585Na1;
import X.OT3;
import X.OT4;
import X.OT5;
import X.OT6;
import X.QD3;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwner;
import com.bytedance.mt.protector.impl.JSONObjectProtectorUtils;
import com.ss.android.ugc.aweme.fe.base.BaseCommonJavaMethod;
import com.ss.android.ugc.aweme.opensdkservice.IOpenPlatformService;
import com.ss.android.ugc.aweme.share.OpenPlatformServiceImpl;
import java.lang.ref.WeakReference;
import kotlin.jvm.internal.o;
import org.greenrobot.eventbus.EventBus;
import org.json.JSONObject;

/* loaded from: classes11.dex */
public final class OpenAuthPageMethod extends BaseCommonJavaMethod implements OT5 {
    public InterfaceC36488ETs LJLJI;
    public String LJLJJI;
    public String LJLJJL;
    public JSONObject LJLJJLL;
    public static final OT4 Companion = new OT4();
    public static final int $stable = 8;

    @Override // com.ss.android.ugc.aweme.fe.base.BaseCommonJavaMethod, androidx.lifecycle.LifecycleEventObserver
    public void onStateChanged(LifecycleOwner lifecycleOwner, Lifecycle.Event event) {
        super.onStateChanged(lifecycleOwner, event);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public OpenAuthPageMethod(C38049EwX jsBridge) {
        super(jsBridge);
        o.LJIIIZ(jsBridge, "jsBridge");
    }

    public final String LIZIZ(String str) {
        JSONObject jSONObject;
        JSONObject jSONObject2 = this.LJLJJLL;
        if (jSONObject2 != null && jSONObject2.has(str) && (jSONObject = this.LJLJJLL) != null) {
            return JSONObjectProtectorUtils.getString(jSONObject, str);
        }
        return null;
    }

    @Override // X.OT5
    public void onClick(String str) {
        JSONObject jSONObject = new JSONObject();
        JSONObject jSONObject2 = new JSONObject();
        jSONObject2.put("ticket", str);
        jSONObject.put("code", 1);
        jSONObject.put("response", jSONObject2);
        InterfaceC36488ETs interfaceC36488ETs = this.LJLJI;
        if (interfaceC36488ETs != null) {
            interfaceC36488ETs.LIZIZ(jSONObject);
        }
    }

    @QD3
    public final void onEvent$main_release(OT3 event) {
        boolean z;
        int i;
        o.LJIIIZ(event, "event");
        EventBus.LIZJ().LJIJ(this);
        C188727au c188727au = new C188727au();
        String str = this.LJLJJI;
        if (str != null) {
            c188727au.LJI("channel", str);
        }
        String str2 = this.LJLJJL;
        if (str2 != null) {
            c188727au.LJI("scopes", str2);
        }
        String str3 = event.LJLIL;
        int i2 = 1;
        if (str3 == null || str3.length() == 0) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            String str4 = event.LJLJI;
            if (str4 != null) {
                c188727au.LJI("msg", str4);
            }
            Integer num = event.LJLILLLLZI;
            if (num != null) {
                i = num.intValue();
            } else {
                i = 1;
            }
            c188727au.LIZLLL(i, "code");
            FMX.LJIIL("jump_open_auth_page", c188727au.LIZ);
            InterfaceC36488ETs interfaceC36488ETs = this.LJLJI;
            if (interfaceC36488ETs != null) {
                Integer num2 = event.LJLILLLLZI;
                if (num2 != null) {
                    i2 = num2.intValue();
                }
                interfaceC36488ETs.LIZ(i2, event.LJLJI);
                return;
            }
            return;
        }
        c188727au.LIZLLL(0, "code");
        FMX.LJIIL("jump_open_auth_page", c188727au.LIZ);
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("auth_code", event.LJLIL);
        InterfaceC36488ETs interfaceC36488ETs2 = this.LJLJI;
        if (interfaceC36488ETs2 == null) {
            return;
        }
        interfaceC36488ETs2.LIZJ(0, null, jSONObject);
    }

    @Override // com.ss.android.ugc.aweme.fe.base.BaseCommonJavaMethod
    public void handle(JSONObject jSONObject, InterfaceC36488ETs interfaceC36488ETs) {
        F0E f0e;
        this.LJLJI = interfaceC36488ETs;
        this.LJLJJLL = jSONObject;
        WeakReference<F0E> weakReference = this.LJLIL;
        C59866NeY c59866NeY = null;
        if (weakReference != null && (f0e = weakReference.get()) != null) {
            c59866NeY = (C59866NeY) f0e.LIZ(C59866NeY.class);
        }
        InterfaceC59585Na1 interfaceC59585Na1 = (InterfaceC59585Na1) c59866NeY.LJJIJIIJI(InterfaceC59585Na1.class);
        if (interfaceC59585Na1 != null) {
            JSONObject LJ = C47135Ieh.LJ("type", "jsb", "bridge_name", "jumpOpenAuthPage");
            LJ.put("bridge_access", "true");
            LJ.put("stage", "open_jsb_auth");
            interfaceC59585Na1.LJIILJJIL("open_jsb_monitor", "open_jsb_invoke", LJ, null, null);
        }
        this.LJLJJI = LIZIZ("client_key");
        this.LJLJJL = LIZIZ("scope");
        String LIZIZ = LIZIZ("state");
        String LIZIZ2 = LIZIZ("redirect_uri");
        String LIZIZ3 = LIZIZ("package_name");
        OT6 ot6 = new OT6();
        ot6.LJII = this.LJLJJL;
        ot6.LIZ = LIZIZ;
        ot6.LJFF = "wap_to_native";
        ot6.LIZIZ = LIZIZ2;
        Bundle bundle = new Bundle();
        ot6.toBundle(bundle);
        bundle.putString("_bytedance_params_client_key", this.LJLJJI);
        bundle.putString("__bytedance_base_caller_version", "1");
        if (LIZIZ3 == null) {
            LIZIZ3 = getActContext().getPackageName();
        }
        bundle.putString("_bytedance_params_type_caller_package", LIZIZ3);
        bundle.putString("_aweme_params_enter_from_flag", "ENTER_FROM_INNER_WEB");
        IOpenPlatformService LJ2 = OpenPlatformServiceImpl.LJ();
        Context actContext = getActContext();
        o.LJIIIIZZ(actContext, "actContext");
        Intent LIZ = LJ2.LIZ(actContext);
        if (LIZ != null) {
            LIZ.addFlags(67108864);
            LIZ.putExtras(bundle);
            EventBus.LIZJ().LJIILJJIL(this);
            C16880lQ.LIZJ(getActContext(), LIZ);
        }
    }

    @Override // X.OT5
    public void onError(String str, String str2) {
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("code", 0);
        jSONObject.put("errorCode", str);
        jSONObject.put("errorMsg", str2);
        InterfaceC36488ETs interfaceC36488ETs = this.LJLJI;
        if (interfaceC36488ETs != null) {
            interfaceC36488ETs.LIZIZ(jSONObject);
        }
    }
}
