package X;

import com.bytedance.mt.protector.impl.JSONArrayProtectorUtils;
import com.ss.android.ugc.aweme.services.BaseUserService;
import com.ss.android.ugc.aweme.setting.UpdateSettingServiceImpl;
import com.ss.android.ugc.aweme.setting.serverpush.model.PushSettings;
import kotlin.jvm.internal.o;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes7.dex */
public final class F92 extends AbstractC65781Prl implements InterfaceC65784Pro<C76800UCe> {
    public final /* synthetic */ String LJLIL;
    public final /* synthetic */ UpdateSettingServiceImpl LJLILLLLZI;
    public final /* synthetic */ int LJLJI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public F92(String str, UpdateSettingServiceImpl updateSettingServiceImpl, int i) {
        super(0);
        this.LJLIL = str;
        this.LJLILLLLZI = updateSettingServiceImpl;
        this.LJLJI = i;
    }

    @Override // X.InterfaceC65784Pro
    public final C76800UCe invoke() {
        JSONObject jSONObject;
        String str = this.LJLIL;
        if (str != null) {
            String currentUserID = BaseUserService.createIUserServicebyMonsterPlugin(false).getCurrentUserID();
            OSZ<String, ? extends JSONObject> osz = this.LJLILLLLZI.LIZ;
            if (osz != null && o.LJ(osz.getFirst(), currentUserID)) {
                JSONObject second = osz.getSecond();
                UpdateSettingServiceImpl updateSettingServiceImpl = this.LJLILLLLZI;
                int i = this.LJLJI;
                updateSettingServiceImpl.getClass();
                if (second.has(str)) {
                    second.putOpt(str, Integer.valueOf(i));
                } else {
                    JSONObject optJSONObject = second.optJSONObject("in_app_push_setting");
                    if (optJSONObject != null && optJSONObject.has(str)) {
                        optJSONObject.putOpt(str, Integer.valueOf(i));
                        second.putOpt("in_app_push_setting", optJSONObject);
                    } else {
                        JSONObject optJSONObject2 = second.optJSONObject("shop_push_setting");
                        if (optJSONObject2 != null && optJSONObject2.has(str)) {
                            optJSONObject2.putOpt(str, Integer.valueOf(i));
                            second.putOpt("shop_push_setting", optJSONObject2);
                        } else {
                            JSONArray optJSONArray = second.optJSONArray("push_settings");
                            if (optJSONArray != null) {
                                int length = optJSONArray.length();
                                for (int i2 = 0; i2 < length; i2++) {
                                    try {
                                        jSONObject = JSONArrayProtectorUtils.getJSONObject(optJSONArray, i2);
                                    } catch (JSONException e) {
                                        String msg = e.toString();
                                        o.LJIIIZ(msg, "msg");
                                    }
                                    if (jSONObject == null) {
                                        break;
                                    }
                                    if (o.LJ(str, jSONObject.optString("field"))) {
                                        jSONObject.putOpt("status", Integer.valueOf(i));
                                        optJSONArray.put(i2, jSONObject);
                                        second.putOpt("push_settings", optJSONArray);
                                    } else {
                                        continue;
                                    }
                                }
                            }
                        }
                    }
                }
                UpdateSettingServiceImpl updateSettingServiceImpl2 = this.LJLILLLLZI;
                updateSettingServiceImpl2.getClass();
                String userId = BaseUserService.createIUserServicebyMonsterPlugin(false).getCurrentUserID();
                if (userId != null && !ujb.o.LJJJJJL(userId)) {
                    o.LJIIIIZZ(userId, "userId");
                    updateSettingServiceImpl2.LIZ = new OSZ<>(userId, second);
                    try {
                        updateSettingServiceImpl2.LIZIZ = new OSZ<>(userId, C75792yF.LIZ(second.toString(), PushSettings.class));
                        E9W.LIZJ(second.toString());
                    } catch (JSONException e2) {
                        C36922EeM.LJFF(e2);
                    }
                }
            }
        }
        return C76800UCe.LIZ;
    }
}
