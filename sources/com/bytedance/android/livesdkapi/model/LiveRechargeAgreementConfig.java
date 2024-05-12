package com.bytedance.android.livesdkapi.model;

import X.InterfaceC65349Pkn;
import java.util.List;

/* loaded from: classes6.dex */
public class LiveRechargeAgreementConfig {

    @InterfaceC65349Pkn("live_room_recharge_agreement_for_global")
    public String agreementForGlobal;

    @InterfaceC65349Pkn("live_room_recharge_agreement_for_region")
    public List<AgreementForRegion> agreementsForRegion;

    @InterfaceC65349Pkn("is_show_recharge_rule_in_global")
    public boolean isShowRechargeLawInGlobal;

    @InterfaceC65349Pkn("is_show_recharge_rule_in_region")
    public boolean isShowRechargeLawInRegion;

    /* loaded from: classes6.dex */
    public static class AgreementForRegion {

        @InterfaceC65349Pkn("title")
        public String lawName;

        @InterfaceC65349Pkn("url")
        public String lawUrl;
    }
}
