package X;

/* renamed from: X.Owi, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class C63540Owi {
    public volatile long LIZ;
    public volatile long LIZIZ;
    public volatile long LIZJ;
    public volatile long LIZLLL;
    public volatile long LJ;
    public volatile long LJFF;
    public volatile long LJI;
    public volatile long LJII;
    public volatile long LJIIIIZZ;
    public volatile long LJIIIZ;
    public volatile long LJIIJ;
    public volatile long LJIIJJI;
    public volatile long LJIIL;
    public volatile long LJIILIIL;
    public volatile long LJIILJJIL;
    public volatile long LJIILL;
    public volatile long LJIILLIIL;
    public volatile long LJIIZILJ;
    public volatile long LJIJ;
    public volatile long LJIJI;
    public volatile long LJIJJ;
    public volatile long LJIJJLI;
    public volatile long LJIL;
    public volatile long LJJ;
    public volatile boolean LJJI;
    public volatile int LJJII;
    public volatile boolean LJJIIJ;
    public String LJJIIZ;
    public volatile boolean LJJIFFI = true;
    public volatile C63607Oxn LJJIII = new C63607Oxn();
    public long LJJIIJZLJL = -1;
    public int LJJIIZI = -1;
    public int LJJIJ = -1;
    public int LJJIJIIJI = -1;
    public boolean LJJIJIIJIL = false;
    public String LJJIJIL = "";

    public final EnumC106744Gw LIZ() {
        int i = this.LJJIJIIJI;
        int i2 = AbstractC63551Owt.LIZ;
        if (i != i2) {
            return EnumC106744Gw.CLIENT_ERROR;
        }
        int i3 = this.LJJIJ;
        if (i3 != i2 && i3 != 200) {
            return EnumC106744Gw.SERVER_ERROR;
        }
        if (this.LJJIIZI != EnumC63549Owr.SEND_SUCCEED.getValue()) {
            return EnumC106744Gw.CHECK_CODE_ERROR;
        }
        return EnumC106744Gw.SUCCESS;
    }

    public final String toString() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("SendMsgMetrics:{sdk_start_time=");
        LIZ.append(this.LIZ);
        LIZ.append(", bs_save_switch_thread_cost_time=");
        LIZ.append(this.LIZIZ);
        LIZ.append(", bs_db_operation_finish_time");
        LIZ.append(this.LIZJ);
        LIZ.append(", bs_save_switch_thread_cost_time_2=");
        LIZ.append(this.LIZLLL);
        LIZ.append(", bs_save_cost_time=");
        LIZ.append(this.LJ);
        LIZ.append(", bs_notify_conversation_cost_time=");
        LIZ.append(this.LJFF);
        LIZ.append(", bs_notify_msg_sending_start_time=");
        V1I.LIZJ(LIZ, this.LJI, ", bs_has_fetch_conversation_info=", false);
        C0MT.LIZLLL(LIZ, ", bs_fetch_conversation_info_cost_time=", 0L, ", bs_cost_time=");
        LIZ.append(this.LJII);
        LIZ.append(", handler_send_request_start_time=");
        LIZ.append(this.LJIIIIZZ);
        LIZ.append(", handler_response_start_time=");
        LIZ.append(this.LJIIJ);
        LIZ.append(", handler_send_request_start_ntp_time=");
        LIZ.append(this.LJIIIZ);
        LIZ.append(", handler_response_start_ntp_time=");
        LIZ.append(this.LJIIJJI);
        LIZ.append(", handler_send_request_cost_time=");
        LIZ.append(this.LJIIL);
        LIZ.append(", server_request_arrived_time=");
        LIZ.append(this.LJIILIIL);
        LIZ.append(", server_execution_end_time=");
        LIZ.append(this.LJIILJJIL);
        LIZ.append(", send_request_uplink_cost_time=");
        LIZ.append(this.LJIILLIIL);
        LIZ.append(", send_request_downlink_cost_time=");
        LIZ.append(this.LJIIZILJ);
        LIZ.append(", send_request_arrived_cost_time=");
        LIZ.append(this.LJIILL);
        LIZ.append(", afs_switch_thread_cost_time=");
        LIZ.append(this.LJIJ);
        LIZ.append(", afs_update_msg_cost_time=");
        LIZ.append(this.LJIJI);
        LIZ.append(", afs_notify_conversation_cost_time=");
        LIZ.append(this.LJIJJ);
        LIZ.append(", afs_cost_time=");
        LIZ.append(this.LJIJJLI);
        LIZ.append(", sdk_end_time=");
        LIZ.append(this.LJIL);
        LIZ.append(", sdk_cost_time=");
        LIZ.append(this.LJJ);
        LIZ.append(", push_before_response=");
        C76965UIn.LIZJ(LIZ, this.LJJI, ", from_push=", false, ", is_ws=");
        LIZ.append(this.LJJIFFI);
        LIZ.append(", result_code=");
        LIZ.append(LIZ());
        LIZ.append(", check_code=");
        LIZ.append(this.LJJIIJZLJL);
        LIZ.append(", server_status_code=");
        LIZ.append(this.LJJIJ);
        LIZ.append(", client_status_code=");
        LIZ.append(this.LJJIJIIJI);
        LIZ.append(", send_message_status_code=");
        LIZ.append(this.LJJIIZI);
        LIZ.append(", check_message=");
        LIZ.append(this.LJJIIZ);
        LIZ.append(", filter_reason=");
        LIZ.append(this.LJJII);
        LIZ.append(", received_error_ack=");
        LIZ.append(this.LJJIJIIJIL);
        LIZ.append(", log_id=");
        return JBR.LJFF(LIZ, this.LJJIJIL, "}", LIZ);
    }
}
