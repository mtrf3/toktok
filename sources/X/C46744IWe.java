package X;

import android.text.TextUtils;
import com.ss.android.ugc.playerkit.radar.IRadarTransmitter;
import com.ss.android.ugc.playerkit.simapicommon.model.SimBitRate;
import com.ss.android.ugc.playerkit.simapicommon.model.SimUrlModel;
import com.ss.android.ugc.playerkit.simapicommon.model.SimVideo;
import com.ss.android.ugc.playerkit.simapicommon.model.SimVideoUrlModel;
import java.util.List;
import kotlin.jvm.internal.o;

/* renamed from: X.IWe, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C46744IWe {
    public final C46745IWf LIZ = new C46745IWf();

    public final C46745IWf LIZ() {
        IZG metaInfo;
        C46745IWf c46745IWf = this.LIZ;
        if (c46745IWf.LJJLIIIJJIZ == null) {
            SimVideo simVideo = c46745IWf.LIZJ;
            if (simVideo == null) {
                metaInfo = null;
            } else {
                metaInfo = simVideo.getMetaInfo();
            }
            c46745IWf.LJJLIIIJJIZ = metaInfo;
        }
        return this.LIZ;
    }

    public final void LIZIZ(boolean z) {
        if (z) {
            C46745IWf c46745IWf = this.LIZ;
            c46745IWf.LJIILIIL = null;
            c46745IWf.LJJJJZ = false;
        }
    }

    public final void LIZJ(String str) {
        String substring;
        IRadarTransmitter LJII = C46982IcE.LJII();
        if ((LJII != null && !LJII.enabled()) || TextUtils.isEmpty(str)) {
            return;
        }
        if (str == null) {
            substring = null;
        } else {
            int length = str.length();
            if (6 <= length) {
                length = 6;
            }
            substring = str.substring(0, length);
            o.LJIIIIZZ(substring, "(this as java.lang.Strin…ing(startIndex, endIndex)");
        }
        C46745IWf c46745IWf = this.LIZ;
        c46745IWf.LJJLIIIJJI = substring;
        SimVideo simVideo = c46745IWf.LIZJ;
        if (simVideo == null) {
            return;
        }
        SimVideoUrlModel playAddr = simVideo.getPlayAddr();
        if (playAddr != null) {
            playAddr.setLogLabel(substring);
        }
        SimVideoUrlModel playAddrH264 = simVideo.getPlayAddrH264();
        if (playAddrH264 != null) {
            playAddrH264.setLogLabel(substring);
        }
        SimVideoUrlModel playAddrBytevc1 = simVideo.getPlayAddrBytevc1();
        if (playAddrBytevc1 != null) {
            playAddrBytevc1.setLogLabel(substring);
        }
        List<SimBitRate> bitRate = simVideo.getBitRate();
        if (bitRate == null) {
            return;
        }
        for (SimBitRate simBitRate : bitRate) {
            SimUrlModel simUrlModel = simBitRate.playAddrBytevc1;
            if (simUrlModel != null) {
                simUrlModel.setLogLabel(substring);
            }
            SimUrlModel playAddr2 = simBitRate.getPlayAddr();
            if (playAddr2 != null) {
                playAddr2.setLogLabel(substring);
            }
        }
    }

    public final void LIZLLL(String str) {
        if (str != null) {
            C46745IWf c46745IWf = this.LIZ;
            c46745IWf.getClass();
            c46745IWf.LJIILLIIL = str;
        }
    }
}
