package com.bytedance.android.livesdk.sei;

import X.InterfaceC65349Pkn;
import java.util.Objects;

/* loaded from: classes7.dex */
public class SeiLiveShowGuestInfo {

    @InterfaceC65349Pkn("order")
    public int show_order;

    @InterfaceC65349Pkn("status")
    public int show_status;

    @InterfaceC65349Pkn("time")
    public long start_time;

    public final int hashCode() {
        return Objects.hash(Integer.valueOf(this.show_order), Long.valueOf(this.start_time), Integer.valueOf(this.show_status));
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        SeiLiveShowGuestInfo seiLiveShowGuestInfo = (SeiLiveShowGuestInfo) obj;
        if (this.show_order == seiLiveShowGuestInfo.show_order && this.start_time == seiLiveShowGuestInfo.start_time && this.show_status == seiLiveShowGuestInfo.show_status) {
            return true;
        }
        return false;
    }
}
