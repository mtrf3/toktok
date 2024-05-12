package com.ss.android.ugc.aweme.services;

import X.AbstractC65781Prl;
import X.InterfaceC65784Pro;
import com.ss.android.ugc.aweme.services.TrafficStatisticsServiceImpl;
import java.util.concurrent.ConcurrentLinkedQueue;

/* loaded from: classes9.dex */
public final class TrafficStatisticsServiceImpl$cacheQueue$2 extends AbstractC65781Prl implements InterfaceC65784Pro<ConcurrentLinkedQueue<TrafficStatisticsServiceImpl.TrafficData>> {
    public static final TrafficStatisticsServiceImpl$cacheQueue$2 INSTANCE = new TrafficStatisticsServiceImpl$cacheQueue$2();

    public TrafficStatisticsServiceImpl$cacheQueue$2() {
        super(0);
    }

    @Override // X.InterfaceC65784Pro
    public final ConcurrentLinkedQueue<TrafficStatisticsServiceImpl.TrafficData> invoke() {
        return new ConcurrentLinkedQueue<>();
    }
}
