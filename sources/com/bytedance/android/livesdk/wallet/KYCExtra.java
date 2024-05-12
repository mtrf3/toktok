package com.bytedance.android.livesdk.wallet;

import X.C09650Zl;
import X.C29401Dk;
import X.InterfaceC65349Pkn;
import com.bytedance.android.livesdk.model.Extra;
import com.bytedance.mt.protector.impl.GsonProtectorUtils;
import com.google.gson.s;

/* loaded from: classes14.dex */
public class KYCExtra extends Extra {

    @InterfaceC65349Pkn("amount_limit")
    public String amountLimit;

    @InterfaceC65349Pkn("is_within_period")
    public boolean isWithinPeriod;

    @InterfaceC65349Pkn("user_type")
    public String userType = "";

    public String getAmountLimit() {
        return this.amountLimit;
    }

    public String getUserType() {
        return this.userType;
    }

    public boolean isWithinPeriod() {
        return this.isWithinPeriod;
    }

    public static KYCExtra getKYCExtra(Exception exc) {
        if (exc instanceof C29401Dk) {
            try {
                return (KYCExtra) GsonProtectorUtils.fromJson(C09650Zl.LIZIZ, ((C29401Dk) exc).getExtra(), KYCExtra.class);
            } catch (s unused) {
            }
        }
        return null;
    }

    public void setUserType(String str) {
        this.userType = str;
    }
}
