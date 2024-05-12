package com.bytedance.android.livesdk.actionhandler;

import X.AbstractC73672Svk;
import X.C28467BFf;
import X.E8L;
import X.E8M;
import X.EnumC29608Bjg;
import X.InterfaceC195757mF;
import X.InterfaceC37276Ek4;
import X.InterfaceC64985Pev;
import X.InterfaceC64986Pew;
import X.InterfaceC65131PhH;
import com.bytedance.android.livesdkapi.depend.model.live.Room;
import com.bytedance.android.livesdkapi.depend.model.report.ReportCommitData;

/* loaded from: classes6.dex */
public interface ActionHandlerApi {
    @InterfaceC65131PhH(EnumC29608Bjg.ROOM)
    @E8L("/webcast/room/info/")
    InterfaceC37276Ek4<C28467BFf<Room>> getRoomStats(@InterfaceC64986Pew("is_anchor") boolean z, @InterfaceC64986Pew("room_id") long j, @InterfaceC64986Pew("pack_level") int i);

    @E8M("/webcast/user/report/commit/")
    @InterfaceC65131PhH(EnumC29608Bjg.REPORT)
    @InterfaceC195757mF
    AbstractC73672Svk<C28467BFf<ReportCommitData>> postReportReasons(@InterfaceC64985Pev("target_room_id") long j, @InterfaceC64985Pev("target_anchor_id") long j2, @InterfaceC64985Pev("reason") long j3, @InterfaceC64985Pev("report_record_extra") String str);
}
