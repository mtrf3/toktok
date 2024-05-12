package com.ss.android.ugc.aweme.bullet.bridge.common;

import X.C16880lQ;
import X.C188727au;
import X.C47135Ieh;
import X.C60547NpX;
import X.F3T;
import X.FMX;
import X.InterfaceC37146Ehy;
import X.InterfaceC60276NlA;
import X.OT3;
import X.OT6;
import X.QD3;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwner;
import com.bytedance.mt.protector.impl.JSONObjectProtectorUtils;
import com.ss.android.ugc.aweme.bullet.bridge.BaseBridgeMethod;
import com.ss.android.ugc.aweme.share.OpenPlatformServiceImpl;
import kotlin.jvm.internal.o;
import org.greenrobot.eventbus.EventBus;
import org.json.JSONObject;

/* loaded from: classes11.dex */
public final class OpenAuthPageMethod extends BaseBridgeMethod {
    public InterfaceC37146Ehy LJLIL;
    public String LJLILLLLZI;
    public String LJLJI;
    public JSONObject LJLJJI;

    @Override // X.InterfaceC38217EzF
    public final String getName() {
        return "jumpOpenAuthPage";
    }

    @Override // com.ss.android.ugc.aweme.bullet.bridge.BaseBridgeMethod, androidx.lifecycle.LifecycleEventObserver
    public final void onStateChanged(LifecycleOwner lifecycleOwner, Lifecycle.Event event) {
        super.onStateChanged(lifecycleOwner, event);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public OpenAuthPageMethod(F3T contextProviderFactory) {
        super(contextProviderFactory);
        o.LJIIIZ(contextProviderFactory, "contextProviderFactory");
    }

    public final String LIZJ(String str) {
        JSONObject jSONObject = this.LJLJJI;
        if (jSONObject != null) {
            if (!jSONObject.has(str)) {
                return null;
            }
            JSONObject jSONObject2 = this.LJLJJI;
            if (jSONObject2 != null) {
                return JSONObjectProtectorUtils.getString(jSONObject2, str);
            }
            o.LJIJI("params");
            throw null;
        }
        o.LJIJI("params");
        throw null;
    }

    @QD3
    public final void onEvent$main_release(OT3 event) {
        boolean z;
        int i;
        o.LJIIIZ(event, "event");
        EventBus.LIZJ().LJIJ(this);
        C188727au c188727au = new C188727au();
        String str = this.LJLILLLLZI;
        if (str != null) {
            c188727au.LJI("channel", str);
        }
        String str2 = this.LJLJI;
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
            InterfaceC37146Ehy interfaceC37146Ehy = this.LJLIL;
            if (interfaceC37146Ehy != null) {
                Integer num2 = event.LJLILLLLZI;
                if (num2 != null) {
                    i2 = num2.intValue();
                }
                interfaceC37146Ehy.LIZ(i2, event.LJLJI);
                return;
            }
            return;
        }
        c188727au.LIZLLL(0, "code");
        FMX.LJIIL("jump_open_auth_page", c188727au.LIZ);
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("auth_code", event.LJLIL);
        InterfaceC37146Ehy interfaceC37146Ehy2 = this.LJLIL;
        if (interfaceC37146Ehy2 == null) {
            return;
        }
        interfaceC37146Ehy2.LIZJ(0, null, jSONObject);
    }

    @Override // com.ss.android.ugc.aweme.bullet.bridge.BaseBridgeMethod
    public final void handle(JSONObject params, InterfaceC37146Ehy iReturn) {
        o.LJIIIZ(params, "params");
        o.LJIIIZ(iReturn, "iReturn");
        this.LJLIL = iReturn;
        this.LJLJJI = params;
        Context context = getContext();
        if (context != null) {
            JSONObject LJ = C47135Ieh.LJ("type", "jsb", "bridge_name", "jumpOpenAuthPage");
            LJ.put("bridge_access", "true");
            LJ.put("stage", "open_jsb_auth");
            C60547NpX c60547NpX = new C60547NpX("jumpOpenAuthPage", "lynx", LJ, 242);
            InterfaceC60276NlA monitorService = getMonitorService();
            if (monitorService != null) {
                monitorService.LJ(c60547NpX);
            }
            this.LJLILLLLZI = LIZJ("client_key");
            this.LJLJI = LIZJ("scope");
            String LIZJ = LIZJ("state");
            String LIZJ2 = LIZJ("redirect_uri");
            String LIZJ3 = LIZJ("package_name");
            OT6 ot6 = new OT6();
            ot6.LJII = this.LJLJI;
            ot6.LIZ = LIZJ;
            ot6.LJFF = "wap_to_native";
            ot6.LIZIZ = LIZJ2;
            Bundle bundle = new Bundle();
            ot6.toBundle(bundle);
            bundle.putString("_bytedance_params_client_key", this.LJLILLLLZI);
            bundle.putString("__bytedance_base_caller_version", "1");
            if (LIZJ3 == null) {
                LIZJ3 = context.getPackageName();
            }
            bundle.putString("_bytedance_params_type_caller_package", LIZJ3);
            bundle.putString("_aweme_params_enter_from_flag", "ENTER_FROM_INNER_WEB");
            Intent LIZ = OpenPlatformServiceImpl.LJ().LIZ(context);
            if (LIZ != null) {
                LIZ.addFlags(67108864);
                LIZ.putExtras(bundle);
                EventBus.LIZJ().LJIILJJIL(this);
                C16880lQ.LIZJ(context, LIZ);
            }
        }
    }
}
