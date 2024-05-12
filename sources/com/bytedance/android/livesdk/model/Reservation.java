package com.bytedance.android.livesdk.model;

import X.F9E;
import X.InterfaceC65349Pkn;
import java.util.List;

/* loaded from: classes17.dex */
public final class Reservation extends F9E {

    @InterfaceC65349Pkn("anchor_id")
    public Long anchorId;

    @InterfaceC65349Pkn("appointment_id")
    public Long appointmentId;

    @InterfaceC65349Pkn("btn_color")
    public String btnColor;

    @InterfaceC65349Pkn("btn_rect")
    public List<Long> btnRect;

    @InterfaceC65349Pkn("end_time")
    public Long endTime;

    @InterfaceC65349Pkn("is_reserved")
    public Boolean isReserved;

    @InterfaceC65349Pkn("room_id")
    public Long roomId;

    @InterfaceC65349Pkn("start_time")
    public Long startTime;

    @Override // X.F9E
    public final Object[] getObjects() {
        Long l = this.appointmentId;
        Long l2 = this.anchorId;
        Long l3 = this.roomId;
        Long l4 = this.startTime;
        Long l5 = this.endTime;
        List<Long> list = this.btnRect;
        String str = this.btnColor;
        Boolean bool = this.isReserved;
        return new Object[]{l, l, l2, l2, l3, l3, l4, l4, l5, l5, list, list, list, str, str, bool, bool};
    }
}
