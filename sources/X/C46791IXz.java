package X;

import com.ss.android.ugc.playerkit.simapicommon.model.SimBitRate;
import com.ss.android.ugc.playerkit.simapicommon.model.SimVideoUrlModel;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.o;

/* renamed from: X.IXz, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C46791IXz {
    public static final /* synthetic */ int LIZ = 0;

    public static IY0 LIZ(IY4 urlHook, List list, SimVideoUrlModel simVideoUrlModel, SimBitRate simBitRate) {
        boolean z;
        String urlKey;
        Integer valueOf;
        int intValue;
        String checksum;
        int qualityType;
        int codecType;
        boolean z2;
        o.LJIIIZ(urlHook, "urlHook");
        int i = 0;
        if (list == null || list.isEmpty()) {
            z = true;
        } else {
            z = false;
        }
        String str = null;
        if (z) {
            return null;
        }
        Object[] array = list.toArray(new String[0]);
        if (array != null) {
            Object[] array2 = ((ArrayList) C46788IXw.LJIIIZ((String[]) array, simVideoUrlModel.getCreateTime(), simVideoUrlModel.getCdnUrlExpired())).toArray(new String[0]);
            if (array2 != null) {
                String[] strArr = (String[]) array2;
                if (simBitRate == null || (urlKey = simBitRate.getUrlKey()) == null) {
                    urlKey = simVideoUrlModel.getUrlKey();
                }
                IY1 iy1 = new IY1();
                iy1.LIZ = strArr;
                if (simBitRate == null || (valueOf = Integer.valueOf(simBitRate.getCodecType())) == null) {
                    intValue = simVideoUrlModel.getCodecType();
                } else {
                    intValue = valueOf.intValue();
                }
                iy1.LIZIZ = intValue;
                iy1.LIZJ = urlKey;
                iy1.LIZLLL = simBitRate;
                if (simBitRate == null || (checksum = simBitRate.getChecksum()) == null) {
                    checksum = simVideoUrlModel.getFileCheckSum();
                }
                iy1.LJ = checksum;
                C46632IRw c46632IRw = C46633IRx.LIZ;
                String sourceId = simVideoUrlModel.getSourceId();
                long duration = (long) simVideoUrlModel.getDuration();
                if (simBitRate == null) {
                    qualityType = -1;
                } else {
                    qualityType = simBitRate.getQualityType();
                    str = simBitRate.getGearName();
                }
                float aspectRatio = simVideoUrlModel.getAspectRatio();
                if (simBitRate == null) {
                    codecType = 0;
                } else {
                    codecType = simBitRate.getCodecType();
                    i = (int) simBitRate.getFps();
                }
                if (c46632IRw.LIZIZ(sourceId, false, duration, qualityType, str, aspectRatio, codecType, i) == 100) {
                    z2 = true;
                } else {
                    z2 = false;
                }
                iy1.LJFF = z2;
                iy1.LJI = -1;
                C46664ITc.LJIJ.LJIIZILJ(iy1.LIZJ, iy1.LJ);
                simVideoUrlModel.setHitBitrate(simBitRate);
                IY0 iy0 = new IY0(C13870gZ.LIZ().proxyUrl(simVideoUrlModel, iy1.LIZJ, iy1.LIZ), urlHook);
                iy0.LIZJ = iy1;
                return iy0;
            }
            throw new NullPointerException("null cannot be cast to non-null type kotlin.Array<T>");
        }
        throw new NullPointerException("null cannot be cast to non-null type kotlin.Array<T>");
    }
}
