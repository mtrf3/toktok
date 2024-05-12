package com.ss.android.ugc.network.observer.bean;

import X.InterfaceC65349Pkn;
import com.bytedance.android.livesdk.livesetting.pullstream.LiveNetAdaptiveHurryTimeSetting;
import com.bytedance.android.livesdk.livesetting.watchlive.player.LivePlayerResourceReleaseSetting;
import kotlin.jvm.internal.o;

/* loaded from: classes15.dex */
public final class DetectorParam {

    @InterfaceC65349Pkn("black_timeout")
    public int blackTimeout;

    @InterfaceC65349Pkn("dns_timeout")
    public int dnsTimeout;

    @InterfaceC65349Pkn("frequency_limit")
    public int frequencyLimit;

    @InterfaceC65349Pkn("ping_timeout")
    public int pingTimeout;

    @InterfaceC65349Pkn("start_timeout")
    public int startTimeout;

    @InterfaceC65349Pkn("target_list")
    public String[] targetList;

    @InterfaceC65349Pkn("tcp_timeout")
    public int tcpTimeout;

    public DetectorParam() {
        this.startTimeout = 5000;
        this.dnsTimeout = LiveNetAdaptiveHurryTimeSetting.DEFAULT;
        this.pingTimeout = 3000;
        this.tcpTimeout = LivePlayerResourceReleaseSetting.ENABLE;
        this.blackTimeout = 300000;
        this.frequencyLimit = 4;
        this.targetList = new String[]{"8.8.8.8:443", "35.244.141.111:443", "graph.facebook.com:443"};
    }

    public DetectorParam(String[] targetList) {
        o.LJIIJ(targetList, "targetList");
        this.startTimeout = 5000;
        this.dnsTimeout = LiveNetAdaptiveHurryTimeSetting.DEFAULT;
        this.pingTimeout = 3000;
        this.tcpTimeout = LivePlayerResourceReleaseSetting.ENABLE;
        this.blackTimeout = 300000;
        this.frequencyLimit = 4;
        this.targetList = targetList;
    }
}
