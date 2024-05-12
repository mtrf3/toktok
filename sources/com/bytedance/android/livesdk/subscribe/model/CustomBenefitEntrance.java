package com.bytedance.android.livesdk.subscribe.model;

import X.C61878OQg;
import X.InterfaceC65349Pkn;
import com.bytedance.android.livesdk.chatroom.api.Perk;
import java.util.List;

/* loaded from: classes6.dex */
public final class CustomBenefitEntrance {

    @InterfaceC65349Pkn("enabled_perks")
    public List<Perk> enabledPerks = C61878OQg.INSTANCE;

    @InterfaceC65349Pkn("figures")
    public long figures;

    @InterfaceC65349Pkn("last_audit_status")
    public int lastAuditStatus;

    @InterfaceC65349Pkn("last_benefit_id")
    public long lastBenefitId;

    @InterfaceC65349Pkn("max_perks_cnt")
    public long maxPerksCnt;

    @InterfaceC65349Pkn("show_entrance")
    public boolean showEntrance;
}
