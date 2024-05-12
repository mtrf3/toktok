package com.bytedance.android.livesdk.liveroom;

import X.AbstractC73672Svk;
import X.B57;
import X.BMP;
import X.C38354F3m;
import X.C73969T1h;
import X.CN1;
import X.InterfaceC92693kP;
import Y.AfS57S0100000_5;
import com.bytedance.android.livesdkapi.host.IHostAction;
import com.bytedance.android.livesdkapi.session.EnterRoomConfig;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.TimeUnit;

/* loaded from: classes6.dex */
public class RoomTaskController implements ISubController {
    public List<InterfaceC92693kP> taskDisposable = new ArrayList();

    @Override // com.bytedance.android.livesdk.liveroom.ISubController
    public void init() {
    }

    @Override // com.bytedance.android.livesdk.liveroom.ISubController
    public void onPause() {
    }

    @Override // com.bytedance.android.livesdk.liveroom.ISubController
    public void onResume() {
    }

    @Override // com.bytedance.android.livesdk.liveroom.ISubController
    public void onCreate() {
        EnterRoomConfig.RoomsData roomsData;
        List<BMP> liveActivityTasksSetting = ((IHostAction) CN1.LIZ(IHostAction.class)).getLiveActivityTasksSetting();
        EnterRoomConfig enterRoomConfig = B57.LIZ.LIZ().mEnterRoomConfig;
        if (liveActivityTasksSetting != null && liveActivityTasksSetting.size() > 0 && enterRoomConfig != null && (roomsData = enterRoomConfig.mRoomsData) != null && C38354F3m.LIZJ("referral_task", roomsData.enterFromMerge)) {
            for (BMP bmp : liveActivityTasksSetting) {
                if (bmp.LIZ.intValue() == 2) {
                    this.taskDisposable.add(AbstractC73672Svk.LJJLIIIJLLLLLLLZ(bmp.LIZIZ.longValue(), TimeUnit.SECONDS, C73969T1h.LIZIZ()).LJJJJZI(new AfS57S0100000_5(bmp, 137)));
                }
            }
        }
    }

    @Override // com.bytedance.android.livesdk.liveroom.ISubController
    public void onDestroy() {
        Iterator<InterfaceC92693kP> it = this.taskDisposable.iterator();
        while (it.hasNext()) {
            it.next().dispose();
        }
    }
}
