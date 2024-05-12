package com.bytedance.android.livesdk.model;

import X.InterfaceC65349Pkn;
import java.util.HashMap;

/* loaded from: classes6.dex */
public class LiveEventInfo {

    @InterfaceC65349Pkn("is_paid_event")
    public Boolean isPaidEvent;

    @InterfaceC65349Pkn("pay_method")
    public int payMethod;

    @InterfaceC65349Pkn("has_subscribed")
    public Boolean subscribed;

    @InterfaceC65349Pkn("ticket_amount")
    public Long ticketAmount;

    @InterfaceC65349Pkn("wallet_pkg_dict")
    public HashMap<String, WalletPackage> walletPkgDict;

    @InterfaceC65349Pkn("event_id")
    public Long eventId = 0L;

    @InterfaceC65349Pkn("start_time")
    public Long startTime = 0L;

    @InterfaceC65349Pkn("duration")
    public Long duration = 0L;

    @InterfaceC65349Pkn("title")
    public String title = "";

    @InterfaceC65349Pkn("description")
    public String description = "";

    public LiveEventInfo() {
        Boolean bool = Boolean.FALSE;
        this.subscribed = bool;
        this.isPaidEvent = bool;
        this.walletPkgDict = new HashMap<>();
    }
}
