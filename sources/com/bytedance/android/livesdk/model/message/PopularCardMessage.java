package com.bytedance.android.livesdk.model.message;

import X.CR6;
import X.EnumC31509CYf;
import X.InterfaceC65349Pkn;

/* loaded from: classes6.dex */
public class PopularCardMessage extends CR6 {

    @InterfaceC65349Pkn("popular_card_info")
    public PopularCardInfo popularCardInfo;

    /* loaded from: classes6.dex */
    public static class PopularCardInfo {

        @InterfaceC65349Pkn("end_time")
        public long endTime;

        @InterfaceC65349Pkn("enter_number")
        public int enterNumber;

        @InterfaceC65349Pkn("startTime")
        public long startTime;

        @InterfaceC65349Pkn("status")
        public int status;
    }

    public PopularCardMessage() {
        this.type = EnumC31509CYf.POPULAR_CARD_MESSAGE;
    }
}
