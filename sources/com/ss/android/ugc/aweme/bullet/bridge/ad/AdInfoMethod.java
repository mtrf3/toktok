package com.ss.android.ugc.aweme.bullet.bridge.ad;

import X.AbstractC59475NVv;
import X.C36922EeM;
import X.C78983UzD;
import X.F3T;
import X.InterfaceC37146Ehy;
import X.InterfaceC40516FvE;
import X.NOV;
import X.NP1;
import X.NP6;
import android.os.BaseBundle;
import android.os.Bundle;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwner;
import com.ss.android.ugc.aweme.bullet.bridge.BaseBridgeMethod;
import kotlin.jvm.internal.o;
import org.json.JSONArray;
import org.json.JSONObject;

/* loaded from: classes11.dex */
public final class AdInfoMethod extends BaseBridgeMethod {
    @Override // X.InterfaceC38217EzF
    public final String getName() {
        return "adInfo";
    }

    @Override // com.ss.android.ugc.aweme.bullet.bridge.BaseBridgeMethod, androidx.lifecycle.LifecycleEventObserver
    public final void onStateChanged(LifecycleOwner lifecycleOwner, Lifecycle.Event event) {
        super.onStateChanged(lifecycleOwner, event);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AdInfoMethod(F3T contextProviderFactory) {
        super(contextProviderFactory);
        o.LJIIIZ(contextProviderFactory, "contextProviderFactory");
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.ss.android.ugc.aweme.bullet.bridge.BaseBridgeMethod
    public final void handle(JSONObject params, InterfaceC37146Ehy iReturn) {
        AbstractC59475NVv abstractC59475NVv;
        NP1 np1;
        int i;
        int i2;
        int i3;
        o.LJIIIZ(params, "params");
        o.LJIIIZ(iReturn, "iReturn");
        JSONObject jSONObject = new JSONObject(params.toString());
        InterfaceC40516FvE kitContainerApi = getKitContainerApi();
        NOV nov = null;
        if (kitContainerApi != null) {
            abstractC59475NVv = kitContainerApi.h6();
        } else {
            abstractC59475NVv = null;
        }
        if (abstractC59475NVv instanceof NP1) {
            np1 = (NP1) abstractC59475NVv;
        } else {
            np1 = null;
        }
        InterfaceC40516FvE kitContainerApi2 = getKitContainerApi();
        if (kitContainerApi2 != null) {
            nov = (NOV) kitContainerApi2.tf(NOV.class);
        }
        String str = "";
        if (np1 != null) {
            jSONObject.put("cid", np1.LJJZ.getValue());
            Object value = np1.LJJJLL.getValue();
            if (value != 0) {
                str = value;
            }
            jSONObject.put("group_id", str);
            jSONObject.put("ad_type", np1.LJJZZIII.getValue());
            jSONObject.put("log_extra", np1.LJII());
            jSONObject.put("download_url", np1.LJLJJL.getValue());
            jSONObject.put("package_name", np1.LJLJL.getValue());
            jSONObject.put("app_name", np1.LJLJJLL.getValue());
            Long value2 = np1.LJJZ.getValue();
            if (value2 == null || value2.longValue() != 0) {
                i3 = 1;
            } else {
                i3 = 0;
            }
            jSONObject.put("code", i3);
            jSONObject.put("land_page_data", np1.LLFFF);
            jSONObject.put("extra_param", np1.LLFII);
            NP6 np6 = NP6.LIZ;
            Long value3 = np1.LJJZ.getValue();
            if (value3 != null) {
                value3.longValue();
            }
            np1.LJII();
            np6.getClass();
        } else if (nov != null) {
            jSONObject.put("cid", nov.LIZLLL());
            jSONObject.put("group_id", nov.LJ());
            jSONObject.put("ad_type", nov.LJJJJJL.getValue());
            jSONObject.put("log_extra", nov.LJFF());
            Object value4 = nov.LJJJJLL.getValue();
            if (value4 == null) {
                value4 = "";
            }
            jSONObject.put("download_url", value4);
            Object value5 = nov.LJJJJZ.getValue();
            if (value5 == null) {
                value5 = "";
            }
            jSONObject.put("package_name", value5);
            Object value6 = nov.LJJJJZI.getValue();
            if (value6 == null) {
                value6 = "";
            }
            jSONObject.put("app_name", value6);
            if (nov.LIZLLL() == 0) {
                i2 = 0;
            } else {
                i2 = 1;
            }
            jSONObject.put("code", i2);
            jSONObject.put("land_page_data", nov.LJL);
            jSONObject.put("extra_param", nov.LJLILLLLZI);
            try {
                String str2 = (String) nov.LJJLIIIJLLLLLLLZ.getValue();
                if (str2 != null) {
                    str = str2;
                }
                jSONObject.put("track_url_list", new JSONArray(str));
            } catch (Exception e) {
                C78983UzD.LJIIZILJ(e);
            }
            NP6 np62 = NP6.LIZ;
            nov.LIZLLL();
            nov.LJFF();
            np62.getClass();
        } else if (this.contextProviderFactory.LIZJ(Bundle.class) != null) {
            BaseBundle baseBundle = (BaseBundle) this.contextProviderFactory.LIZJ(Bundle.class);
            if (baseBundle == null) {
                return;
            }
            jSONObject.put("cid", baseBundle.getLong("ad_id"));
            jSONObject.put("group_id", baseBundle.getString("aweme_group_id"));
            jSONObject.put("ad_type", baseBundle.getInt("ad_system_origin"));
            jSONObject.put("log_extra", baseBundle.getString("bundle_download_app_log_extra"));
            jSONObject.put("download_url", baseBundle.getString("bundle_download_url"));
            jSONObject.put("package_name", baseBundle.getString("aweme_package_name"));
            jSONObject.put("app_name", baseBundle.getString("bundle_download_app_name"));
            if (baseBundle.getLong("ad_id") == 0) {
                i = 0;
            } else {
                i = 1;
            }
            jSONObject.put("code", i);
            jSONObject.put("land_page_data", baseBundle.getString("landing_page_info"));
            jSONObject.put("extra_param", baseBundle.getString("bundle_extra_param"));
            try {
                jSONObject.put("track_url_list", new JSONArray(baseBundle.getString("track_url_list")));
            } catch (Exception e2) {
                C78983UzD.LJIIZILJ(e2);
            }
        } else {
            C36922EeM.LJ("It is illegal to call adInfo in non-commercialized scenarios, please chat with zhangxiang.aaron privately");
        }
        iReturn.LIZIZ(jSONObject);
    }
}
