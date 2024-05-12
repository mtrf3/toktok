package com.ss.android.ugc.aweme.influencer.ecommercelive.business.highlights.repo;

import X.F9E;
import X.InterfaceC65349Pkn;
import kotlin.jvm.internal.o;

/* loaded from: classes2.dex */
public final class ReportPinCardClickRequest extends F9E {

    @InterfaceC65349Pkn("event")
    public final HighLightReportEvent event;

    @InterfaceC65349Pkn("room_id")
    public final String roomId;

    @InterfaceC65349Pkn("type")
    public final int type;

    public static /* synthetic */ ReportPinCardClickRequest copy$default(ReportPinCardClickRequest reportPinCardClickRequest, String str, int i, HighLightReportEvent highLightReportEvent, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            str = reportPinCardClickRequest.roomId;
        }
        if ((i2 & 2) != 0) {
            i = reportPinCardClickRequest.type;
        }
        if ((i2 & 4) != 0) {
            highLightReportEvent = reportPinCardClickRequest.event;
        }
        return reportPinCardClickRequest.copy(str, i, highLightReportEvent);
    }

    public final ReportPinCardClickRequest copy(String roomId, int i, HighLightReportEvent event) {
        o.LJIIIZ(roomId, "roomId");
        o.LJIIIZ(event, "event");
        return new ReportPinCardClickRequest(roomId, i, event);
    }

    @Override // X.F9E
    public Object[] getObjects() {
        return new Object[]{this.roomId, Integer.valueOf(this.type), this.event};
    }

    public final HighLightReportEvent getEvent() {
        return this.event;
    }

    public final String getRoomId() {
        return this.roomId;
    }

    public final int getType() {
        return this.type;
    }

    public ReportPinCardClickRequest(String roomId, int i, HighLightReportEvent event) {
        o.LJIIIZ(roomId, "roomId");
        o.LJIIIZ(event, "event");
        this.roomId = roomId;
        this.type = i;
        this.event = event;
    }
}
