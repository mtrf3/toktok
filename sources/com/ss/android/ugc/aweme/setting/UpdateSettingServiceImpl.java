package com.ss.android.ugc.aweme.setting;

import X.C75792yF;
import X.E9W;
import X.F92;
import X.MS5;
import X.OSZ;
import com.bytedance.keva.Keva;
import com.bytedance.mt.protector.impl.JSONArrayProtectorUtils;
import com.ss.android.ugc.aweme.services.BaseUserService;
import com.ss.android.ugc.aweme.setting.serverpush.model.PushSettings;
import com.ss.android.ugc.aweme.setting.services.IUpdateSettingService;
import kotlin.jvm.internal.AqS153S0200000_6;
import kotlin.jvm.internal.o;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes7.dex */
public final class UpdateSettingServiceImpl implements IUpdateSettingService {
    public OSZ<String, ? extends JSONObject> LIZ;
    public OSZ<String, ? extends PushSettings> LIZIZ;

    @Override // com.ss.android.ugc.aweme.setting.services.IUpdateSettingService
    public final PushSettings LJ() {
        String currentUserID = BaseUserService.createIUserServicebyMonsterPlugin(false).getCurrentUserID();
        OSZ<String, ? extends PushSettings> osz = this.LIZIZ;
        if (osz != null && o.LJ(osz.getFirst(), currentUserID) && osz.getSecond() != null) {
            return osz.getSecond();
        }
        String currentUserID2 = BaseUserService.createIUserServicebyMonsterPlugin(false).getCurrentUserID();
        Keva LIZ = E9W.LIZ();
        if (LIZ == null) {
            return null;
        }
        String string = LIZ.getString(E9W.LIZIZ(currentUserID2), "");
        if (string.isEmpty()) {
            return null;
        }
        return (PushSettings) C75792yF.LIZ(string, PushSettings.class);
    }

    @Override // com.ss.android.ugc.aweme.setting.services.IUpdateSettingService
    public final int LIZIZ(String str) {
        JSONObject jSONObject;
        try {
            String currentUserID = BaseUserService.createIUserServicebyMonsterPlugin(false).getCurrentUserID();
            Keva LIZ = E9W.LIZ();
            String str2 = "";
            if (LIZ != null) {
                str2 = LIZ.getString(E9W.LIZIZ(currentUserID), "");
            }
            JSONObject jSONObject2 = new JSONObject(str2);
            jSONObject = jSONObject2.optJSONObject("in_app_push_setting").put("live_inner_push", jSONObject2.optInt("live_inner_push", 0));
        } catch (JSONException unused) {
            jSONObject = new JSONObject();
        }
        return jSONObject.optInt(str, 1);
    }

    @Override // com.ss.android.ugc.aweme.setting.services.IUpdateSettingService
    public final void LIZJ(PushSettings settings) {
        o.LJIIIZ(settings, "settings");
        MS5.LIZ(new AqS153S0200000_6(this, settings, 7));
    }

    @Override // com.ss.android.ugc.aweme.setting.services.IUpdateSettingService
    public final int LIZLLL(String itemId) {
        o.LJIIIZ(itemId, "itemId");
        OSZ<String, ? extends JSONObject> osz = this.LIZ;
        if (osz == null) {
            return -1;
        }
        if (o.LJ(osz.getFirst(), BaseUserService.createIUserServicebyMonsterPlugin(false).getCurrentUserID())) {
            JSONObject second = osz.getSecond();
            if (second.has(itemId)) {
                return second.optInt(itemId, 0);
            }
            JSONObject optJSONObject = second.optJSONObject("in_app_push_setting");
            if (optJSONObject != null && optJSONObject.has(itemId)) {
                return optJSONObject.optInt(itemId, 0);
            }
            JSONObject optJSONObject2 = second.optJSONObject("shop_push_setting");
            if (optJSONObject2 != null && optJSONObject2.has(itemId)) {
                return optJSONObject2.optInt(itemId, 0);
            }
            JSONArray optJSONArray = second.optJSONArray("push_settings");
            if (optJSONArray == null) {
                return -1;
            }
            int length = optJSONArray.length();
            for (int i = 0; i < length; i++) {
                try {
                    JSONObject jSONObject = JSONArrayProtectorUtils.getJSONObject(optJSONArray, i);
                    if (jSONObject == null) {
                        return -1;
                    }
                    if (o.LJ(itemId, jSONObject.optString("field"))) {
                        return jSONObject.optInt("status", 0);
                    }
                } catch (JSONException unused) {
                }
            }
        }
        return -1;
    }

    @Override // com.ss.android.ugc.aweme.setting.services.IUpdateSettingService
    public final void LIZ(int i, String str) {
        MS5.LIZ(new F92(str, this, i));
    }
}
