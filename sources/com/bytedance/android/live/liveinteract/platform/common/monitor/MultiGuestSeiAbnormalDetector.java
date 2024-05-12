package com.bytedance.android.live.liveinteract.platform.common.monitor;

import X.C28272B7s;
import X.C8E;
import X.InterfaceC75441TjB;
import X.InterfaceC75560Tl6;
import X.InterfaceC75973Trl;
import com.bytedance.android.livesdk.comp.api.linkcore.model.LinkUser;
import com.bytedance.android.livesdk.livesetting.linkmic.multilive.MultiGuestSeiAbnormalDetectorSwitch;
import com.bytedance.android.livesdk.sei.SeiAppData;
import java.util.List;

@InterfaceC75560Tl6(name = "MULTI_GUEST_SEI_ABNORMAL_DETECTOR")
/* loaded from: classes14.dex */
public final class MultiGuestSeiAbnormalDetector {
    public static final /* synthetic */ int LJIIIIZZ = 0;
    public boolean LIZ;
    public boolean LIZIZ;
    public C28272B7s LIZJ;
    public SeiAppData LIZLLL;
    public int LJ;
    public final int LJFF;
    public int LJI;
    public final int LJII;

    public MultiGuestSeiAbnormalDetector() {
        MultiGuestSeiAbnormalDetectorSwitch multiGuestSeiAbnormalDetectorSwitch = MultiGuestSeiAbnormalDetectorSwitch.INSTANCE;
        this.LJFF = multiGuestSeiAbnormalDetectorSwitch.getValue().noSeiAppDataThreshold;
        this.LJII = multiGuestSeiAbnormalDetectorSwitch.getValue().maxUploadTimes;
    }

    public static int LIZ() {
        InterfaceC75973Trl LLIIJI;
        List<LinkUser> LJJIIZI;
        InterfaceC75441TjB R6 = C8E.LJ().R6();
        if (R6 != null && (LLIIJI = R6.LLIIJI()) != null && (LJJIIZI = LLIIJI.LJJIIZI()) != null) {
            return LJJIIZI.size();
        }
        return -1;
    }
}
