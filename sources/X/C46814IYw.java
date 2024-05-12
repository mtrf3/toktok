package X;

import android.text.TextUtils;
import com.ss.android.ugc.playerkit.radar.SimRadar;
import com.ss.android.ugc.playerkit.simapicommon.model.SimBitRate;
import com.ss.android.ugc.playerkit.simapicommon.model.SimVideo;
import java.util.ArrayList;
import java.util.List;

/* renamed from: X.IYw, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public class C46814IYw extends C47153Iez {
    public final /* synthetic */ C46815IYx LJLIL;

    public C46814IYw(C46815IYx c46815IYx) {
        this.LJLIL = c46815IYx;
    }

    @Override // X.C47153Iez, X.InterfaceC46540IOi
    public final void onPlayFailed(String str, IPG ipg) {
        InterfaceC46811IYt interfaceC46811IYt;
        C46745IWf LIZ;
        SimVideo simVideo;
        C46815IYx c46815IYx = this.LJLIL;
        c46815IYx.getClass();
        if (TextUtils.isEmpty(str) || (interfaceC46811IYt = c46815IYx.LJ) == null || !TextUtils.equals(interfaceC46811IYt.getKey(), str) || 1 != ipg.LIZJ || (simVideo = (LIZ = C46810IYs.LIZ(this.LJLIL.LJ, null)).LIZJ) == null) {
            return;
        }
        simVideo.setPlayAddrBytevc1(null);
        List<SimBitRate> bitRate = simVideo.getBitRate();
        ArrayList arrayList = new ArrayList();
        if (bitRate != null) {
            for (SimBitRate simBitRate : bitRate) {
                if (simBitRate.isBytevc1() == 0) {
                    arrayList.add(simBitRate);
                }
            }
        }
        simVideo.setBitRate(arrayList);
        if (simVideo.getPlayAddrH264() != null && simVideo.getPlayAddrH264().getHitBitrate() != null && simVideo.getPlayAddrH264().getHitBitrate().isBytevc1() == 1) {
            simVideo.getPlayAddrH264().setHitBitrate(null);
            C46664ITc c46664ITc = C46664ITc.LJIJ;
            String sourceId = simVideo.getPlayAddrH264().getSourceId();
            c46664ITc.getClass();
            if (!TextUtils.isEmpty(sourceId)) {
                c46664ITc.LIZLLL.remove(sourceId);
            }
        }
        if (simVideo.getPlayAddrH264() == null && (simVideo.getBitRate() == null || simVideo.getBitRate().size() == 0)) {
            return;
        }
        LIZ.LIZJ = simVideo;
        SimRadar.keyScan("ByteVC1RetryPlayHook", "onPlayFailed-retry-with-264", new Object[0]);
        this.LJLIL.LJFF.LJIIL(LIZ);
    }
}
