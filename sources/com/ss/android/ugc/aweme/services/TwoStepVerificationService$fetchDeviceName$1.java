package com.ss.android.ugc.aweme.services;

import X.AbstractC65781Prl;
import X.C69075R9b;
import X.C76800UCe;
import X.InterfaceC88472Yns;
import com.bytedance.mt.protector.impl.JSONArrayProtectorUtils;
import com.bytedance.mt.protector.impl.JSONObjectProtectorUtils;
import com.ss.android.deviceregister.DeviceRegisterManager;
import kotlin.jvm.internal.o;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes16.dex */
public final class TwoStepVerificationService$fetchDeviceName$1 extends AbstractC65781Prl implements InterfaceC88472Yns<C69075R9b, C76800UCe> {
    public static final TwoStepVerificationService$fetchDeviceName$1 INSTANCE = new TwoStepVerificationService$fetchDeviceName$1();

    public TwoStepVerificationService$fetchDeviceName$1() {
        super(1);
    }

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final void invoke2(C69075R9b c69075R9b) {
        JSONArray jSONArray;
        if (c69075R9b != null) {
            try {
                JSONObject jSONObject = c69075R9b.LJIIIZ;
                if (jSONObject != null && (jSONArray = JSONObjectProtectorUtils.getJSONArray(jSONObject, "data")) != null && jSONArray.length() > 0) {
                    int length = jSONArray.length();
                    for (int i = 0; i < length; i++) {
                        JSONObject jSONObject2 = JSONArrayProtectorUtils.getJSONObject(jSONArray, i);
                        if (o.LJ(JSONObjectProtectorUtils.getString(jSONObject2, "StrDid"), DeviceRegisterManager.com_ss_android_deviceregister_DeviceRegisterManager_com_ss_android_ugc_aweme_feed_lancet_AppLogLancet_getDeviceId())) {
                            TwoStepVerificationService.keva.storeString("device_name", JSONObjectProtectorUtils.getString(jSONObject2, "DeviceName"));
                            return;
                        }
                    }
                }
            } catch (JSONException unused) {
            }
        }
    }

    @Override // X.InterfaceC88472Yns
    public /* bridge */ /* synthetic */ C76800UCe invoke(C69075R9b c69075R9b) {
        invoke2(c69075R9b);
        return C76800UCe.LIZ;
    }
}
