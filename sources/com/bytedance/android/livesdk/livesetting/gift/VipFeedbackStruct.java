package com.bytedance.android.livesdk.livesetting.gift;

import X.HH1;
import X.InterfaceC65349Pkn;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* loaded from: classes6.dex */
public final class VipFeedbackStruct {

    @InterfaceC65349Pkn("enabled")
    public boolean enabled;

    @InterfaceC65349Pkn("gift_schema")
    public String giftSchema;

    @InterfaceC65349Pkn("recharge_schema")
    public String rechargeSchema;

    @InterfaceC65349Pkn("withdraw_schema")
    public String withdrawSchema;

    /* JADX WARN: Multi-variable type inference failed */
    public VipFeedbackStruct() {
        this(false, null, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 15, 0 == true ? 1 : 0);
    }

    public VipFeedbackStruct(boolean z, String str, String str2, String str3) {
        HH1.LIZ(str, "giftSchema", str2, "withdrawSchema", str3, "rechargeSchema");
        this.enabled = z;
        this.giftSchema = str;
        this.withdrawSchema = str2;
        this.rechargeSchema = str3;
    }

    public /* synthetic */ VipFeedbackStruct(boolean z, String str, String str2, String str3, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? false : z, (i & 2) != 0 ? "aweme://webview/?url=https%3a%2f%2fwww.tiktok.com%2ffalcon%2ffe_tiktok_common%2ffaq%2ffeedback%2f%3Fhide_nav_bar%3D1%26feedback_id%3D15889&hide_nav_bar=1" : str, (i & 4) != 0 ? "" : str2, (i & 8) != 0 ? "" : str3);
    }
}
