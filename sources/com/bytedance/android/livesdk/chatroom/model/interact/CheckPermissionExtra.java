package com.bytedance.android.livesdk.chatroom.model.interact;

import X.InterfaceC65349Pkn;
import com.bytedance.android.livesdk.model.Extra;
import java.util.List;

/* loaded from: classes14.dex */
public class CheckPermissionExtra extends Extra {

    @InterfaceC65349Pkn("link_mic_pay_hint")
    public String payHint;

    @InterfaceC65349Pkn("pay_options")
    public List<LinkPayPlan> payPlans;
}
