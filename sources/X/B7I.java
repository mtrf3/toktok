package X;

import Y.AfS0S0100200_5;
import com.bytedance.android.livesdk.chatroom.api.RoomRetrofitApi;
import com.bytedance.android.livesdk.livesetting.rank.OnlineAudienceShowNumberOptSetting;
import com.bytedance.android.livesdk.rank.api.IRankService;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.concurrent.TimeUnit;

/* loaded from: classes6.dex */
public final class B7I {
    public InterfaceC92693kP LIZ;
    public long LIZIZ;
    public C32201Oe LIZJ;
    public final ArrayList<B7J> LIZLLL = new ArrayList<>();

    public final void LIZIZ(C32201Oe c32201Oe) {
        if (!this.LIZLLL.isEmpty()) {
            Iterator<B7J> it = this.LIZLLL.iterator();
            while (it.hasNext()) {
                it.next().LIZ(c32201Oe);
            }
            this.LIZLLL.clear();
        }
        this.LIZJ = c32201Oe;
    }

    public final void LIZ(long j, long j2) {
        InterfaceC92693kP interfaceC92693kP = this.LIZ;
        if (interfaceC92693kP != null) {
            interfaceC92693kP.dispose();
        }
        this.LIZ = null;
        LIZIZ(null);
        this.LIZIZ = j;
        long j3 = 0;
        if (j != 0 && j2 != 0) {
            ((IRankService) CN1.LIZ(IRankService.class)).yE();
            C65814PsI.LIZ().getClass();
            RoomRetrofitApi roomRetrofitApi = (RoomRetrofitApi) C65814PsI.LIZJ(RoomRetrofitApi.class);
            if (OnlineAudienceShowNumberOptSetting.INSTANCE.getValue()) {
                j3 = 1;
            }
            this.LIZ = C1EW.LIZ(roomRetrofitApi.getRoomComponentsNew(j, j2, 1L, 1L, 1L, j3)).LJJLIIIJJI(10L, TimeUnit.SECONDS).LJJJLIIL(new AfS0S0100200_5(j, j2, this, 4), new AfS0S0100200_5(j, j2, this, 5));
        }
    }
}
