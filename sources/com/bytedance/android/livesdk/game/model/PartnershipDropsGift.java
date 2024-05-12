package com.bytedance.android.livesdk.game.model;

import X.InterfaceC65349Pkn;
import java.util.ArrayList;
import java.util.List;

/* loaded from: classes17.dex */
public final class PartnershipDropsGift {

    @InterfaceC65349Pkn("gift")
    public PartnershipGiftInfo gift;

    @InterfaceC65349Pkn("total_available_num")
    public long totalAvailableNum;

    @InterfaceC65349Pkn("total_num")
    public long totalNum;

    @InterfaceC65349Pkn("unique")
    public boolean unique;

    @InterfaceC65349Pkn("task_config")
    public List<PartnershipDropsTaskConfig> taskConfig = new ArrayList();

    @InterfaceC65349Pkn("total_num_config")
    public List<Long> totalNumConfig = new ArrayList();
}
