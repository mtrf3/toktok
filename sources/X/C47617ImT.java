package X;

import com.bytedance.mt.protector.impl.string2number.CastFloatProtector;
import com.bytedance.mt.protector.impl.string2number.CastIntegerProtector;
import com.bytedance.vcloud.abrmodule.ABRBufferInfo;
import com.bytedance.vcloud.abrmodule.IABRModuleSpeedRecord;
import com.bytedance.vcloud.abrmodule.IBufferInfo;
import com.bytedance.vcloud.abrmodule.IPlayStateSupplier;
import com.bytedance.vcloud.abrmodule.ISegmentInfo;
import com.bytedance.vcloud.networkpredictor.DefaultSpeedPredictor;
import com.ss.ttvideoengine.TTVideoEngine;
import com.ss.ttvideoengine.TTVideoEngineImpl;
import com.ss.ttvideoengine.utils.TTVideoEngineLog;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Queue;

/* renamed from: X.ImT, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public class C47617ImT implements IPlayStateSupplier {
    public final WeakReference<TTVideoEngineImpl> LIZ;
    public int LIZIZ = -1;
    public int LIZJ = -1;

    @Override // com.bytedance.vcloud.abrmodule.IPlayStateSupplier
    public final Queue<IABRModuleSpeedRecord> getTimelineNetworkSpeed() {
        return null;
    }

    @Override // com.bytedance.vcloud.abrmodule.IPlayStateSupplier
    public final java.util.Map<String, IBufferInfo> getAudioBufferInfo() {
        InterfaceC47616ImS interfaceC47616ImS;
        List<C47160If6> LIZLLL;
        HashMap hashMap = new HashMap();
        TTVideoEngineImpl tTVideoEngineImpl = this.LIZ.get();
        if (tTVideoEngineImpl != null && (interfaceC47616ImS = tTVideoEngineImpl.LLZZZZ) != null && (LIZLLL = interfaceC47616ImS.LIZLLL()) != null && LIZLLL.size() != 0) {
            for (C47160If6 c47160If6 : LIZLLL) {
                if (c47160If6 != null && c47160If6.LIZ() == 1) {
                    ABRBufferInfo aBRBufferInfo = new ABRBufferInfo();
                    String LIZIZ = c47160If6.LIZIZ(15);
                    aBRBufferInfo.setStreamId(LIZIZ);
                    aBRBufferInfo.setFileAvailSize(TTVideoEngine.LJIILJJIL(LIZIZ));
                    if (c47160If6.LIZJ() != null) {
                        aBRBufferInfo.setHeadSize(r0.LIZIZ);
                    }
                    StringBuilder LIZ = X1D.LIZ();
                    LIZ.append("");
                    LIZ.append(c47160If6.LIZLLL(3));
                    hashMap.put(X1D.LIZIZ(LIZ), aBRBufferInfo);
                }
            }
        }
        return hashMap;
    }

    @Override // com.bytedance.vcloud.abrmodule.IPlayStateSupplier
    public final int getCurrentDownloadAudioBitrate() {
        TTVideoEngineImpl tTVideoEngineImpl = this.LIZ.get();
        if (tTVideoEngineImpl == null) {
            return -1;
        }
        return tTVideoEngineImpl.Z3;
    }

    @Override // com.bytedance.vcloud.abrmodule.IPlayStateSupplier
    public final int getCurrentDownloadAudioSegmentIndex() {
        InterfaceC47775Ip1 interfaceC47775Ip1;
        TTVideoEngineImpl tTVideoEngineImpl = this.LIZ.get();
        if (tTVideoEngineImpl == null || (interfaceC47775Ip1 = tTVideoEngineImpl.LJ) == null) {
            return -1;
        }
        return interfaceC47775Ip1.LJIIJJI(519, -1);
    }

    @Override // com.bytedance.vcloud.abrmodule.IPlayStateSupplier
    public final int getCurrentDownloadVideoBitrate() {
        InterfaceC47775Ip1 interfaceC47775Ip1;
        TTVideoEngineImpl tTVideoEngineImpl = this.LIZ.get();
        if (tTVideoEngineImpl == null || (interfaceC47775Ip1 = tTVideoEngineImpl.LJ) == null) {
            return -1;
        }
        return interfaceC47775Ip1.LJIIJJI(601, -1);
    }

    @Override // com.bytedance.vcloud.abrmodule.IPlayStateSupplier
    public final int getCurrentDownloadVideoSegmentIndex() {
        InterfaceC47775Ip1 interfaceC47775Ip1;
        TTVideoEngineImpl tTVideoEngineImpl = this.LIZ.get();
        if (tTVideoEngineImpl == null || (interfaceC47775Ip1 = tTVideoEngineImpl.LJ) == null) {
            return -1;
        }
        return interfaceC47775Ip1.LJIIJJI(520, -1);
    }

    @Override // com.bytedance.vcloud.abrmodule.IPlayStateSupplier
    public final int getCurrentPlaybackTime() {
        InterfaceC47775Ip1 interfaceC47775Ip1;
        TTVideoEngineImpl tTVideoEngineImpl = this.LIZ.get();
        if (tTVideoEngineImpl == null || (interfaceC47775Ip1 = tTVideoEngineImpl.LJ) == null) {
            return -1;
        }
        return interfaceC47775Ip1.getCurrentPosition();
    }

    @Override // com.bytedance.vcloud.abrmodule.IPlayStateSupplier
    public final float getDownloadSpeed() {
        java.util.Map<String, String> downloadSpeed;
        DefaultSpeedPredictor defaultSpeedPredictor = C78966Uyw.LJLL;
        if (defaultSpeedPredictor != null && (downloadSpeed = defaultSpeedPredictor.getDownloadSpeed(0)) != null && downloadSpeed.get("download_speed") != null) {
            return CastFloatProtector.parseFloat(downloadSpeed.get("download_speed"));
        }
        return -1.0f;
    }

    @Override // com.bytedance.vcloud.abrmodule.IPlayStateSupplier
    public final int getLoaderType() {
        InterfaceC47775Ip1 interfaceC47775Ip1;
        TTVideoEngineImpl tTVideoEngineImpl = this.LIZ.get();
        if (tTVideoEngineImpl == null || (interfaceC47775Ip1 = tTVideoEngineImpl.LJ) == null) {
            return -1;
        }
        try {
            return CastIntegerProtector.parseInt(interfaceC47775Ip1.LIZIZ(200));
        } catch (Exception e) {
            TTVideoEngineLog.d(e);
            return -1;
        }
    }

    @Override // com.bytedance.vcloud.abrmodule.IPlayStateSupplier
    public final int getMaxCacheAudioTime() {
        InterfaceC47775Ip1 interfaceC47775Ip1;
        int LJIIJJI;
        TTVideoEngineImpl tTVideoEngineImpl = this.LIZ.get();
        if (tTVideoEngineImpl == null || (interfaceC47775Ip1 = tTVideoEngineImpl.LJ) == null || (LJIIJJI = interfaceC47775Ip1.LJIIJJI(24, -1)) <= 0) {
            return 30000;
        }
        return LJIIJJI * 1000;
    }

    @Override // com.bytedance.vcloud.abrmodule.IPlayStateSupplier
    public final int getMaxCacheVideoTime() {
        InterfaceC47775Ip1 interfaceC47775Ip1;
        int LJIIJJI;
        TTVideoEngineImpl tTVideoEngineImpl = this.LIZ.get();
        if (tTVideoEngineImpl == null || (interfaceC47775Ip1 = tTVideoEngineImpl.LJ) == null || (LJIIJJI = interfaceC47775Ip1.LJIIJJI(24, -1)) <= 0) {
            return 30000;
        }
        return LJIIJJI * 1000;
    }

    @Override // com.bytedance.vcloud.abrmodule.IPlayStateSupplier
    public final float getNetworkSpeed() {
        DefaultSpeedPredictor defaultSpeedPredictor = C78966Uyw.LJLL;
        if (defaultSpeedPredictor != null) {
            float predictSpeed = defaultSpeedPredictor.getPredictSpeed(0);
            StringBuilder LIZ = X1D.LIZ();
            LIZ.append("[ABR] get network speed:");
            LIZ.append(predictSpeed);
            TTVideoEngineLog.d("TTVideoEngine", X1D.LIZIZ(LIZ));
            return predictSpeed;
        }
        return -1.0f;
    }

    @Override // com.bytedance.vcloud.abrmodule.IPlayStateSupplier
    public final float getPlaySpeed() {
        C46886Iag c46886Iag;
        TTVideoEngineImpl tTVideoEngineImpl = this.LIZ.get();
        if (tTVideoEngineImpl == null || (c46886Iag = tTVideoEngineImpl.LJIILJJIL) == null) {
            return 1.0f;
        }
        return c46886Iag.LIZLLL;
    }

    @Override // com.bytedance.vcloud.abrmodule.IPlayStateSupplier
    public final int getPlayerAudioCacheTime() {
        InterfaceC47775Ip1 interfaceC47775Ip1;
        TTVideoEngineImpl tTVideoEngineImpl = this.LIZ.get();
        if (tTVideoEngineImpl == null || (interfaceC47775Ip1 = tTVideoEngineImpl.LJ) == null) {
            return -1;
        }
        return (int) interfaceC47775Ip1.getLongOption(73, -1L);
    }

    @Override // com.bytedance.vcloud.abrmodule.IPlayStateSupplier
    public final int getPlayerVideoCacheTime() {
        InterfaceC47775Ip1 interfaceC47775Ip1;
        TTVideoEngineImpl tTVideoEngineImpl = this.LIZ.get();
        if (tTVideoEngineImpl == null || (interfaceC47775Ip1 = tTVideoEngineImpl.LJ) == null) {
            return -1;
        }
        return (int) interfaceC47775Ip1.getLongOption(72, -1L);
    }

    @Override // com.bytedance.vcloud.abrmodule.IPlayStateSupplier
    public final float getSpeedConfidence() {
        DefaultSpeedPredictor defaultSpeedPredictor = C78966Uyw.LJLL;
        if (defaultSpeedPredictor != null) {
            float lastPredictConfidence = defaultSpeedPredictor.getLastPredictConfidence();
            StringBuilder LIZ = X1D.LIZ();
            LIZ.append("[ABR] get network confidence:");
            LIZ.append(lastPredictConfidence);
            TTVideoEngineLog.d("TTVideoEngine", X1D.LIZIZ(LIZ));
            return lastPredictConfidence;
        }
        return -1.0f;
    }

    @Override // com.bytedance.vcloud.abrmodule.IPlayStateSupplier
    public final java.util.Map<String, IBufferInfo> getVideoBufferInfo() {
        InterfaceC47616ImS interfaceC47616ImS;
        List<C47160If6> LIZLLL;
        HashMap hashMap = new HashMap();
        TTVideoEngineImpl tTVideoEngineImpl = this.LIZ.get();
        if (tTVideoEngineImpl != null && (interfaceC47616ImS = tTVideoEngineImpl.LLZZZZ) != null && (LIZLLL = interfaceC47616ImS.LIZLLL()) != null && LIZLLL.size() != 0) {
            for (C47160If6 c47160If6 : LIZLLL) {
                if (c47160If6 != null && c47160If6.LIZ() == 0) {
                    ABRBufferInfo aBRBufferInfo = new ABRBufferInfo();
                    String LIZIZ = c47160If6.LIZIZ(15);
                    aBRBufferInfo.setStreamId(LIZIZ);
                    aBRBufferInfo.setFileAvailSize(TTVideoEngine.LJIILJJIL(LIZIZ));
                    if (c47160If6.LIZJ() != null) {
                        aBRBufferInfo.setHeadSize(r0.LIZIZ);
                    }
                    StringBuilder LIZ = X1D.LIZ();
                    LIZ.append("");
                    LIZ.append(c47160If6.LIZLLL(3));
                    hashMap.put(X1D.LIZIZ(LIZ), aBRBufferInfo);
                }
            }
        }
        return hashMap;
    }

    @Override // com.bytedance.vcloud.abrmodule.IPlayStateSupplier
    public final int getNetworkState() {
        return C47906Ir8.LIZLLL().LIZ;
    }

    public C47617ImT(TTVideoEngineImpl tTVideoEngineImpl) {
        this.LIZ = new WeakReference<>(tTVideoEngineImpl);
    }

    @Override // com.bytedance.vcloud.abrmodule.IPlayStateSupplier
    public final List<? extends ISegmentInfo> getSegmentInfoList(int i, int i2) {
        InterfaceC47775Ip1 interfaceC47775Ip1;
        AbstractC48434Ize abstractC48434Ize;
        Object objectOption;
        TTVideoEngineImpl tTVideoEngineImpl = this.LIZ.get();
        if (tTVideoEngineImpl == null || (interfaceC47775Ip1 = tTVideoEngineImpl.LJ) == null) {
            return null;
        }
        ArrayList arrayList = new ArrayList();
        if (i != this.LIZIZ) {
            this.LIZIZ = i;
            interfaceC47775Ip1.LJ(522, i);
        }
        if (i2 != this.LIZJ) {
            this.LIZJ = i2;
            interfaceC47775Ip1.LJ(523, i2);
        }
        if ((interfaceC47775Ip1 instanceof C48433Izd) && (abstractC48434Ize = ((C48433Izd) interfaceC47775Ip1).LIZ) != null && (objectOption = abstractC48434Ize.getObjectOption(521)) != null) {
            for (Object obj : (Object[]) objectOption) {
                arrayList.add(new EXN(obj));
            }
        }
        return arrayList;
    }

    @Override // com.bytedance.vcloud.abrmodule.IPlayStateSupplier
    public final float getAverageDownloadSpeed(int i, int i2, boolean z) {
        DefaultSpeedPredictor defaultSpeedPredictor = C78966Uyw.LJLL;
        if (defaultSpeedPredictor != null) {
            return defaultSpeedPredictor.getAverageDownloadSpeed(i, i2, z);
        }
        return -1.0f;
    }
}
