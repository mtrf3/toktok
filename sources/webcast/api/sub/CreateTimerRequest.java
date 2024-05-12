package webcast.api.sub;

import X.InterfaceC65349Pkn;

/* loaded from: classes6.dex */
public final class CreateTimerRequest {

    @InterfaceC65349Pkn("room_id")
    public long roomId;

    @InterfaceC65349Pkn("start_countdown_time_s")
    public long startCountdownTimeS;

    @InterfaceC65349Pkn("time_increase_cap_s")
    public long timeIncreaseCapS;

    @InterfaceC65349Pkn("time_increase_per_sub_s")
    public long timeIncreasePerSubS;

    @InterfaceC65349Pkn("timer_status")
    public int timerStatus;

    @InterfaceC65349Pkn("title")
    public String title = "";
}
