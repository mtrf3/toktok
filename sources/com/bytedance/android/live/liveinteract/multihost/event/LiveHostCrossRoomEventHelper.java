package com.bytedance.android.live.liveinteract.multihost.event;

import X.C221108m2;
import X.C38354F3m;
import X.C5H3;
import X.EnumC221088m0;
import X.YF2;
import X.YF3;
import X.YF4;
import com.bytedance.android.livesdkapi.host.ILiveHostCrossRoomEventHelper;
import kotlin.jvm.internal.o;

/* loaded from: classes16.dex */
public class LiveHostCrossRoomEventHelper implements ILiveHostCrossRoomEventHelper {
    public static final YF2 LJLJI = new YF2();
    public static final C5H3<LiveHostCrossRoomEventHelper> LJLJJI = C221108m2.LIZ(EnumC221088m0.SYNCHRONIZED, YF3.LJLIL);
    public String LJLIL = "";
    public String LJLILLLLZI = "";

    @Override // com.bytedance.android.livesdkapi.host.ILiveHostCrossRoomEventHelper, X.InterfaceC06390Mx
    public final /* bridge */ /* synthetic */ void onInit() {
        YF4.LIZ(this);
    }

    @Override // com.bytedance.android.livesdkapi.host.ILiveHostCrossRoomEventHelper
    public final void clearId() {
        LJLJI.getClass();
        YF2.LIZ().LJLIL = "";
        YF2.LIZ().LJLILLLLZI = "";
    }

    @Override // com.bytedance.android.livesdkapi.host.ILiveHostCrossRoomEventHelper
    public final String getFromRequestId() {
        LJLJI.getClass();
        return YF2.LIZ().LJLILLLLZI;
    }

    @Override // com.bytedance.android.livesdkapi.host.ILiveHostCrossRoomEventHelper
    public final String getFromRoomId() {
        LJLJI.getClass();
        return YF2.LIZ().LJLIL;
    }

    @Override // com.bytedance.android.livesdkapi.host.ILiveHostCrossRoomEventHelper
    public final void setFromRoomIdAndFromRequestId(String fromRoomId, String fromRequestId) {
        o.LJIIIZ(fromRoomId, "fromRoomId");
        o.LJIIIZ(fromRequestId, "fromRequestId");
        LJLJI.getClass();
        if (C38354F3m.LJ(YF2.LIZ().LJLILLLLZI) && C38354F3m.LJ(YF2.LIZ().LJLIL)) {
            YF2.LIZ().LJLIL = fromRoomId;
            YF2.LIZ().LJLILLLLZI = fromRequestId;
        }
    }
}
