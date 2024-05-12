package X;

import android.util.SparseIntArray;
import com.ss.android.ugc.playerkit.radar.IRadarTransmitter;
import com.ss.ttvideoengine.TTVideoEngine;
import com.ss.ttvideoengine.utils.TTVideoEngineLog;
import kotlin.jvm.internal.o;

/* renamed from: X.IZy, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C46842IZy extends C46742IWc {
    public XXB LJLJI;

    @Override // X.C46742IWc, X.IZT
    public final void LJIJJ() {
        SparseIntArray s7 = this.LJLILLLLZI.s7();
        TTVideoEngineLog.turnOn(1, s7.get(6));
        int i = s7.get(80);
        Object value = IZ8.LLLZZ.getValue();
        o.LJIIIIZZ(value, "<get-disableEngineInfoLog>(...)");
        if (((Boolean) value).booleanValue()) {
            TTVideoEngineLog.setLogNotifyLevel(2, i);
        }
        IRadarTransmitter LJII = C46982IcE.LJII();
        if (LJII != null && LJII.sdkTransmitEnabled()) {
            if (LJII.ttSDKALogOptEnabled()) {
                TTVideoEngine.LJLLLLLL(1501, LJII.kernelLogLeverPrecise());
            } else {
                TTVideoEngine.LJLLLLLL(702, LJII.kernelLogLever());
            }
            long aLogSimpleWriteFuncAddr = LJII.getALogSimpleWriteFuncAddr();
            if (aLogSimpleWriteFuncAddr != -1 && LJII.aLogWriteFuncAddrEnabled()) {
                TTVideoEngine.LLFFF(217, aLogSimpleWriteFuncAddr);
            }
            TTVideoEngineLog.setLogNotifyLevel(LJII.logNotifyLevel(), 1);
        }
    }

    @Override // X.C46742IWc, X.IZT
    public final void LJJIJ() {
        C46882Iac player = this.LJLILLLLZI.getPlayer();
        if (player == null) {
            return;
        }
        player.LJLLLL(206, this.LJLILLLLZI.s7().get(5));
    }

    public C46842IZy(InterfaceC46804IYm interfaceC46804IYm) {
        super(interfaceC46804IYm);
    }

    @Override // X.C46742IWc, X.IZT
    public final void LJIIZILJ(java.util.Map<String, Object> map) {
        C46882Iac player = this.LJLILLLLZI.getPlayer();
        if (player == null) {
            return;
        }
        IRadarTransmitter LJII = C46982IcE.LJII();
        if (LJII != null && LJII.ttSDKALogOptEnabled()) {
            player.LJLLLL(1502, 1);
            return;
        }
        if (map.get("enable_alog") != null && (map.get("enable_alog") instanceof Integer)) {
            player.LJLLLL(320, ((Integer) map.get("enable_alog")).intValue());
        }
        if (LJII == null || !LJII.enabled() || !LJII.sdkTransmitEnabled()) {
            return;
        }
        player.LJLLLL(320, 1);
    }
}
