package com.ss.android.ugc.aweme.utils.gecko;

import X.InterfaceC65349Pkn;
import java.util.ArrayList;
import java.util.List;

/* loaded from: classes11.dex */
public final class GeckoLiveOpt {

    @InterfaceC65349Pkn("block_polling")
    public boolean blockPolling;

    @InterfaceC65349Pkn("use_gecko_live_normal")
    public boolean isEnable;

    @InterfaceC65349Pkn("gecko_pause_on_destroy")
    public boolean isPause;

    @InterfaceC65349Pkn("gecko_load_strategy")
    public int strategy;

    @InterfaceC65349Pkn("gecko_channel_list")
    public List<String> channelList = new ArrayList();

    @InterfaceC65349Pkn("gecko_fail_retry_time")
    public int retryTime = 3;
}