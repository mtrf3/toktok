package com.bytedance.android.livesdk.watch;

import X.BCW;
import X.C29306Beo;
import X.CN1;
import com.bytedance.android.live.microom.IMicRoomService;
import com.bytedance.android.live.programmedlive.IProgrammedLiveService;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import kotlin.jvm.internal.o;

/* loaded from: classes6.dex */
public class DisplayOptService implements IDisplayOptService {
    @Override // X.InterfaceC06390Mx
    public final /* synthetic */ void onInit() {
    }

    @Override // com.bytedance.android.livesdk.watch.IDisplayOptService
    public final boolean bq(DataChannel dataChannel) {
        Boolean bool;
        IProgrammedLiveService iProgrammedLiveService = (IProgrammedLiveService) CN1.LIZ(IProgrammedLiveService.class);
        Object obj = null;
        if (iProgrammedLiveService != null) {
            bool = Boolean.valueOf(iProgrammedLiveService.lj());
        } else {
            bool = null;
        }
        boolean rk = ((IMicRoomService) CN1.LIZ(IMicRoomService.class)).rk();
        boolean Rb = ((IWatchLiveService) CN1.LIZ(IWatchLiveService.class)).Rb(Long.valueOf(C29306Beo.LJJIZ(dataChannel)));
        if (dataChannel != null) {
            obj = dataChannel.kv0(BCW.class);
        }
        if (o.LJ(bool, Boolean.FALSE) && !rk && !Rb && o.LJ(obj, Boolean.TRUE)) {
            return true;
        }
        return false;
    }
}
