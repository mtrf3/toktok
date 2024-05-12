package com.bytedance.android.livesdk.model.message;

import X.InterfaceC65349Pkn;
import com.bytedance.android.live.base.model.user.User;
import java.util.ArrayList;
import java.util.List;

/* loaded from: classes14.dex */
public final class ReserveInfo {

    @InterfaceC65349Pkn("accept_appointment_cnts")
    public long acceptAppointmentCnts;

    @InterfaceC65349Pkn("display_user_list")
    public List<ReserveUser> displayUserList = new ArrayList();

    @InterfaceC65349Pkn("is_reservation_sender")
    public boolean isReservationSender;

    @InterfaceC65349Pkn("reservation_anchor_cnts")
    public long reservationAnchorCnts;

    @InterfaceC65349Pkn("reservation_id")
    public long reservationId;

    /* loaded from: classes14.dex */
    public static final class ReserveUser {

        @InterfaceC65349Pkn("room_id")
        public long roomId;

        @InterfaceC65349Pkn("user")
        public User user;
    }
}
