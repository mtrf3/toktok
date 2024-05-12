package X;

import android.os.SystemClock;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.ss.android.ugc.playerkit.session.Session;
import com.ss.android.ugc.playerkit.simapicommon.model.SimBitRate;
import com.ss.android.ugc.playerkit.simapicommon.model.SimVideoUrlModel;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

/* renamed from: X.IXw, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C46788IXw implements IY2 {
    public final List<IY4> LIZ = new ArrayList();
    public final List<IY4> LIZIZ;

    public C46788IXw(List list) {
        ArrayList arrayList = new ArrayList();
        this.LIZIZ = arrayList;
        list = ((ArrayList) list).isEmpty() ? Collections.singletonList(IY4.LIZ) : list;
        if (list == null) {
            return;
        }
        if (((Boolean) IZ8.LJJL.getValue()).booleanValue()) {
            for (IY4 iy4 : list) {
                if (iy4.LIZ()) {
                    ((ArrayList) this.LIZ).add(iy4);
                } else {
                    ((ArrayList) this.LIZIZ).add(iy4);
                }
            }
            return;
        }
        arrayList.addAll(list);
    }

    public static void LJI(SimVideoUrlModel simVideoUrlModel) {
        List<SimBitRate> bitRate = simVideoUrlModel.getBitRate();
        ArrayList arrayList = new ArrayList();
        if (bitRate != null) {
            for (int i = 0; i < bitRate.size(); i++) {
                if (ListProtector.get(bitRate, i) != null && ((SimBitRate) ListProtector.get(bitRate, i)).getHdrType() == 0) {
                    arrayList.add(ListProtector.get(bitRate, i));
                }
            }
            if (arrayList.size() != 0) {
                simVideoUrlModel.setBitRate(arrayList);
            }
        }
    }

    @Override // X.IY2
    public final IXW LIZIZ(IXT ixt) {
        SimVideoUrlModel simVideoUrlModel = ixt.LIZ;
        if (simVideoUrlModel == null) {
            return null;
        }
        boolean z = ixt.LIZIZ;
        boolean z2 = ixt.LIZJ;
        C1DG.LIZ().LJFF();
        IXW ixw = new IXW();
        if (!IZ8.LJIILL()) {
            if (IXN.LIZJ.isDynamicBitrateEnable()) {
                return C46790IXy.LIZ(simVideoUrlModel, ixt.LJ, z2);
            }
            return ixw;
        }
        String urlKey = simVideoUrlModel.getUrlKey();
        String fileCheckSum = simVideoUrlModel.getFileCheckSum();
        if (IXN.LIZJ.isDynamicBitrateEnable() && !z) {
            ixw = C46790IXy.LIZ(simVideoUrlModel, ixt.LJ, z2);
        } else {
            Session LIZIZ = C46664ITc.LJIJ.LIZIZ(simVideoUrlModel.getUri());
            if (LIZIZ != null) {
                LIZIZ.preSuperResolution = 5;
            }
        }
        C46664ITc.LJIJ.LJIIZILJ(urlKey, fileCheckSum);
        return ixw;
    }

    /* JADX WARN: Removed duplicated region for block: B:101:0x01d5  */
    /* JADX WARN: Removed duplicated region for block: B:108:0x01ed  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x0231  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x027a  */
    /* JADX WARN: Removed duplicated region for block: B:95:0x018b  */
    /* JADX WARN: Removed duplicated region for block: B:98:0x01b3  */
    @Override // X.IY2
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final X.IXY LJFF(X.IXT r10) {
        /*
            Method dump skipped, instructions count: 782
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C46788IXw.LJFF(X.IXT):X.IXY");
    }

    public static IXX LJII(IYN iyn, SimVideoUrlModel simVideoUrlModel) {
        IVV ivv;
        List<SimBitRate> bitRate;
        int bitRate2 = iyn.getBitRate();
        String gearName = iyn.getGearName();
        int qualityType = iyn.getQualityType();
        int isBytevc1 = iyn.isBytevc1();
        String urlKey = iyn.getUrlKey();
        List<String> urlList = iyn.urlList();
        String checksum = iyn.getChecksum();
        int size = iyn.getSize();
        if (iyn instanceof SimBitRate) {
            ivv = ((SimBitRate) iyn).getSimVideoExtra();
        } else {
            ivv = null;
            if (simVideoUrlModel != null && (bitRate = simVideoUrlModel.getBitRate()) != null && bitRate.size() != 0) {
                Iterator<SimBitRate> it = bitRate.iterator();
                while (true) {
                    if (!it.hasNext()) {
                        break;
                    }
                    SimBitRate next = it.next();
                    if (next.getBitRate() == iyn.getBitRate()) {
                        ivv = next.getSimVideoExtra();
                        break;
                    }
                }
            }
        }
        return new IXX(bitRate2, gearName, qualityType, isBytevc1, urlKey, urlList, checksum, size, ivv, iyn.getHdrType(), iyn.getHdrBit());
    }

    @Override // X.IY2
    public final IY1 LIZ(SimVideoUrlModel simVideoUrlModel, ITZ itz) {
        return LJ(simVideoUrlModel, false, IZ8.LJJIJLIJ(), false);
    }

    public static List<String> LJIIIZ(String[] strArr, long j, long j2) {
        long defaultCDNTimeoutTime = C1DG.LIZ().getConfig().getCommonConfig().getDefaultCDNTimeoutTime();
        boolean enableCdnUrlExpiredExperiment = C1DG.LIZ().getConfig().getSimPlayerExperiment().enableCdnUrlExpiredExperiment();
        long cdnUrlExpiredOffset = C1DG.LIZ().getConfig().getSimPlayerExperiment().cdnUrlExpiredOffset();
        if (IXN.LIZJ.forceHttps()) {
            for (int i = 0; i < strArr.length; i++) {
                String str = strArr[i];
                if (str != null && str.startsWith("http") && !str.startsWith("https")) {
                    str = str.replaceFirst("http", "https");
                }
                strArr[i] = str;
            }
        }
        ArrayList arrayList = new ArrayList();
        InterfaceC46878IaY LIZ = C1DG.LIZ();
        for (int i2 = 0; i2 < strArr.length; i2++) {
            String str2 = strArr[i2];
            if (str2 != null) {
                if ((str2.contains("aweme/v1/play") || strArr[i2].contains("aweme/v2/play")) && LIZ.getConfig().getCommonConfig().getCommonParamsProcessor() != null) {
                    IPC commonParamsProcessor = LIZ.getConfig().getCommonConfig().getCommonParamsProcessor();
                    String str3 = strArr[i2];
                    commonParamsProcessor.getClass();
                    arrayList.add(C78983UzD.LJI(str3).LJ());
                } else if (j2 > 0 && enableCdnUrlExpiredExperiment) {
                    if (System.currentTimeMillis() / 1000 < j2 + cdnUrlExpiredOffset) {
                        arrayList.add(strArr[i2]);
                    }
                } else if (SystemClock.elapsedRealtime() - j < defaultCDNTimeoutTime) {
                    arrayList.add(strArr[i2]);
                }
            }
        }
        return arrayList;
    }

    @Override // X.IY2
    public final IXY LIZJ(SimVideoUrlModel simVideoUrlModel, ITZ itz, boolean z) {
        return LJIIIIZZ(simVideoUrlModel, itz, z, IZ8.LJJIJLIJ());
    }

    @Override // X.IY2
    public final List<String> LIZLLL(String[] strArr, long j, long j2) {
        return LJIIIZ(strArr, j, j2);
    }

    /* JADX WARN: Removed duplicated region for block: B:22:0x008e  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x00be  */
    @Override // X.IY2
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final X.IY1 LJ(com.ss.android.ugc.playerkit.simapicommon.model.SimVideoUrlModel r12, boolean r13, boolean r14, boolean r15) {
        /*
            Method dump skipped, instructions count: 384
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C46788IXw.LJ(com.ss.android.ugc.playerkit.simapicommon.model.SimVideoUrlModel, boolean, boolean, boolean):X.IY1");
    }

    public final IXY LJIIIIZZ(SimVideoUrlModel simVideoUrlModel, ITZ itz, boolean z, boolean z2) {
        IXT ixt = new IXT();
        ixt.LIZ = simVideoUrlModel;
        ixt.LIZIZ = z;
        ixt.LIZJ = z2;
        return LJFF(ixt);
    }
}
