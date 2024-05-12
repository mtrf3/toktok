package com.ss.android.ugc.aweme.video.preload;

import X.AbstractRunnableC47386Iik;
import X.C13870gZ;
import X.C26206AQg;
import X.C46556IOy;
import X.C46616IRg;
import X.C46664ITc;
import X.C46729IVp;
import X.C46734IVu;
import X.C46737IVx;
import X.C46982IcE;
import X.C47242IgQ;
import X.C47321Ihh;
import X.C47335Ihv;
import X.C47347Ii7;
import X.C47350IiA;
import X.C47352IiC;
import X.C47353IiD;
import X.C47354IiE;
import X.C47360IiK;
import X.C47361IiL;
import X.C47362IiM;
import X.C47363IiN;
import X.C47364IiO;
import X.C47365IiP;
import X.C47366IiQ;
import X.C47367IiR;
import X.C47368IiS;
import X.C47369IiT;
import X.C47370IiU;
import X.C47371IiV;
import X.C47372IiW;
import X.C47373IiX;
import X.C47374IiY;
import X.C47375IiZ;
import X.C47376Iia;
import X.C47377Iib;
import X.C47387Iil;
import X.C47421IjJ;
import X.C47462Ijy;
import X.C48693J9d;
import X.C84862XSg;
import X.C87748YcC;
import X.EnumC47317Ihd;
import X.IZ8;
import X.InterfaceC46732IVs;
import X.InterfaceC47084Ids;
import X.InterfaceC47101Ie9;
import X.InterfaceC47319Ihf;
import X.InterfaceC47342Ii2;
import android.os.Handler;
import android.os.HandlerThread;
import android.text.TextUtils;
import android.util.LruCache;
import com.ss.android.ugc.playerkit.simapicommon.model.SimBitRate;
import com.ss.android.ugc.playerkit.simapicommon.model.SimVideoUrlModel;
import java.io.File;
import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.o;

/* loaded from: classes9.dex */
public class VideoPreloadManager implements InterfaceC46732IVs {
    public InterfaceC47342Ii2 LIZ;
    public Map<String, String> LIZJ;
    public C47321Ihh LIZLLL;
    public Handler LJFF;
    public final LruCache<String, Long> LJ = new LruCache<>(1048576);
    public final C47421IjJ LIZIZ = C47335Ihv.LIZ();

    public final synchronized InterfaceC47319Ihf LJIIZILJ() {
        if (this.LIZLLL == null) {
            this.LIZLLL = new C47321Ihh();
        }
        return this.LIZLLL;
    }

    public final synchronized Handler LJIJ() {
        if (this.LJFF == null) {
            HandlerThread handlerThread = new HandlerThread("VideoPreloadHandlerThread");
            handlerThread.start();
            this.LJFF = new Handler(handlerThread.getLooper());
        }
        return this.LJFF;
    }

    @Override // X.InterfaceC46732IVs
    public final /* synthetic */ int startMethodHook() {
        return -1;
    }

    public static InterfaceC46732IVs LJIILJJIL() {
        if (C47242IgQ.LIZIZ == null) {
            synchronized (C47242IgQ.LIZ) {
                if (C47242IgQ.LIZIZ == null) {
                    C47242IgQ.LIZIZ = C13870gZ.LIZ();
                    C46982IcE.LJI().ensureNotReachHere(new Exception(), "VideoPreloadManagerService getInstance NULL.");
                    if (C46982IcE.LIZIZ().isDebug()) {
                        throw new RuntimeException("VideoPreloadManagerService getInstance NULL.");
                    }
                }
            }
        }
        return C47242IgQ.LIZIZ;
    }

    public final void LJIILL() {
        LJIJJLI().addPreloadCallback(C46616IRg.LIZJ);
    }

    public final InterfaceC47342Ii2 LJIJJLI() {
        InterfaceC47342Ii2 interfaceC47342Ii2 = this.LIZ;
        if (interfaceC47342Ii2 != null) {
            return interfaceC47342Ii2;
        }
        synchronized (this) {
            if (this.LIZ == null) {
                InterfaceC47342Ii2 LIZ = ((C47321Ihh) LJIIZILJ()).LIZ(this.LIZIZ.getExperiment().PreloadTypeExperiment(), this.LIZIZ);
                this.LIZ = LIZ;
                LIZ.getNetworkLibName();
                Map<String, String> map = this.LIZJ;
                if (map != null) {
                    this.LIZ.updateDnsBackupIpMap(map);
                }
            }
        }
        return this.LIZ;
    }

    @Override // X.InterfaceC46732IVs
    public void cancelAll() {
        LJIL(new C47366IiQ(this));
    }

    @Override // X.InterfaceC46732IVs
    public void clearCache() {
        LJIL(new C47367IiR(this));
    }

    @Override // X.InterfaceC46732IVs
    public final InterfaceC47342Ii2 LJII() {
        return LJIJJLI();
    }

    @Override // X.InterfaceC46732IVs
    public final boolean checkInit() {
        return LJIJJLI().checkInit();
    }

    @Override // X.InterfaceC46732IVs
    public final File getCacheDir() {
        return LJIJJLI().getCacheFile();
    }

    @Override // X.InterfaceC46732IVs
    public final String getCacheTopDirPath() {
        return LJIJJLI().getCacheTopDirPath();
    }

    @Override // X.InterfaceC46732IVs
    public final String getNetworkLibName() {
        return LJIJJLI().getNetworkLibName();
    }

    @Override // X.InterfaceC46732IVs
    public final boolean supportPreloadObservable() {
        return LJIJJLI().supportPreloadObservable();
    }

    @Override // X.InterfaceC46732IVs
    public final void LJIILIIL() {
        LJIILL();
    }

    public static void LJIILLIIL(SimVideoUrlModel simVideoUrlModel) {
        if (simVideoUrlModel != null) {
            if (simVideoUrlModel.getHitBitrate() == null) {
                simVideoUrlModel.setHitBitrate(C46664ITc.LJIJ.LJIIJJI(simVideoUrlModel.getSourceId()));
            }
            if (simVideoUrlModel.getHitDashVideoBitrate() == null) {
                simVideoUrlModel.setHitDashVideoBitrate(C46664ITc.LJIJ.LJIILIIL(simVideoUrlModel.getSourceId()));
            }
            if (simVideoUrlModel.getHitDashAudioBitrate() == null) {
                simVideoUrlModel.setHitDashAudioBitrate(C46664ITc.LJIJ.LJIIL(simVideoUrlModel.getSourceId()));
            }
            if (TextUtils.isEmpty(simVideoUrlModel.getDashVideoId())) {
                simVideoUrlModel.setDashVideoId(C46664ITc.LJIJ.LJI(simVideoUrlModel.getSourceId()));
            }
        }
    }

    @Override // X.InterfaceC46732IVs
    public final long LIZIZ(SimVideoUrlModel simVideoUrlModel) {
        if (simVideoUrlModel != null) {
            if (simVideoUrlModel.hasDashBitrateAndSelectAsMp4()) {
                return LJIJJLI().getDashSize(simVideoUrlModel);
            }
            return LJIJJLI().getVideoSize(simVideoUrlModel.getBitRatedRatioUri());
        }
        return -1L;
    }

    @Override // X.InterfaceC46732IVs
    public final int LIZLLL(SimVideoUrlModel simVideoUrlModel) {
        return cacheSize(simVideoUrlModel);
    }

    @Override // X.InterfaceC46732IVs
    public final void LJ(SimVideoUrlModel simVideoUrlModel) {
        if (IZ8.LJIIIZ()) {
            return;
        }
        LJIL(new C47350IiA(this, simVideoUrlModel));
    }

    @Override // X.InterfaceC46732IVs
    public final void LJFF(String str) {
        LJIL(new C47373IiX(this, str));
    }

    @Override // X.InterfaceC46732IVs
    public final C46556IOy LJIIIIZZ(SimVideoUrlModel simVideoUrlModel) {
        if (simVideoUrlModel != null) {
            return LJIJJLI().readTimeInfo(simVideoUrlModel);
        }
        return null;
    }

    @Override // X.InterfaceC46732IVs
    public final boolean LJIIJ(List list) {
        return LJIL(new C47387Iil(this, list));
    }

    @Override // X.InterfaceC46732IVs
    public final boolean LJIIJJI(SimVideoUrlModel simVideoUrlModel) {
        return preload(simVideoUrlModel, 0);
    }

    @Override // X.InterfaceC46732IVs
    public final InterfaceC47342Ii2 LJIIL(EnumC47317Ihd enumC47317Ihd) {
        return ((C47321Ihh) LJIIZILJ()).LIZ(enumC47317Ihd, this.LIZIZ);
    }

    public final boolean LJIL(AbstractRunnableC47386Iik abstractRunnableC47386Iik) {
        if (!C48693J9d.LJLJI) {
            Object value = IZ8.o0.getValue();
            o.LJIIIIZZ(value, "<get-asyncPreloadAtColdStages>(...)");
            if (((Boolean) value).booleanValue()) {
                if (LJIJ() == null) {
                    return true;
                }
                LJIJ().post(abstractRunnableC47386Iik);
                return true;
            }
        }
        C47421IjJ c47421IjJ = this.LIZIZ;
        if (c47421IjJ != null && c47421IjJ.useSyncPreloadStyle()) {
            if (LJIJ() == null) {
                return true;
            }
            LJIJ().post(abstractRunnableC47386Iik);
            return true;
        }
        return abstractRunnableC47386Iik.LIZ();
    }

    @Override // X.InterfaceC46732IVs
    public final void addDownloadProgressListener(InterfaceC47101Ie9 interfaceC47101Ie9) {
        if (interfaceC47101Ie9 == null) {
            return;
        }
        checkInit();
        if (this.LIZ != null) {
            LJIJJLI().addDownloadProgressListener(interfaceC47101Ie9);
        }
    }

    @Override // X.InterfaceC46732IVs
    public final int cacheSize(SimVideoUrlModel simVideoUrlModel) {
        LJIILLIIL(simVideoUrlModel);
        return LJIJJLI().cacheSize(simVideoUrlModel);
    }

    @Override // X.InterfaceC46732IVs
    public final void cancelPreload(SimVideoUrlModel simVideoUrlModel) {
        LJIL(new C47354IiE(this, simVideoUrlModel));
    }

    @Override // X.InterfaceC46732IVs
    public final void destroyScene(String str) {
        LJIL(new C47364IiO(this, str));
    }

    @Override // X.InterfaceC46732IVs
    public final C87748YcC getRequestInfo(SimVideoUrlModel simVideoUrlModel) {
        return LJIJJLI().getRequestInfo(simVideoUrlModel);
    }

    @Override // X.InterfaceC46732IVs
    public final List<C87748YcC> getRequestInfoList(SimVideoUrlModel simVideoUrlModel) {
        return LJIJJLI().getRequestInfoList(simVideoUrlModel);
    }

    @Override // X.InterfaceC46732IVs
    public final List<C47462Ijy> getSingleTimeDownloadList(SimVideoUrlModel simVideoUrlModel) {
        return LJIJJLI().getSingleTimeDownloadList(simVideoUrlModel);
    }

    @Override // X.InterfaceC46732IVs
    public final boolean isCache(SimVideoUrlModel simVideoUrlModel) {
        LJIILLIIL(simVideoUrlModel);
        return LJIJJLI().isCache(simVideoUrlModel);
    }

    @Override // X.InterfaceC46732IVs
    public final boolean isCacheCompleted(SimVideoUrlModel simVideoUrlModel) {
        if (isCache(simVideoUrlModel) && LJIJJLI().isCacheCompleted(simVideoUrlModel)) {
            return true;
        }
        return false;
    }

    @Override // X.InterfaceC46732IVs
    public final boolean isCachePure(SimVideoUrlModel simVideoUrlModel) {
        LJIILLIIL(simVideoUrlModel);
        return LJIJJLI().isCachePure(simVideoUrlModel);
    }

    @Override // X.InterfaceC46732IVs
    public final void makeCurrentScene(String str) {
        LJIL(new C47365IiP(this, str));
    }

    @Override // X.InterfaceC46732IVs
    public final void removeDownloadProgressListener(InterfaceC47101Ie9 interfaceC47101Ie9) {
        if (interfaceC47101Ie9 == null) {
            return;
        }
        checkInit();
        if (this.LIZ != null) {
            LJIJJLI().removeDownloadProgressListener(interfaceC47101Ie9);
        }
    }

    @Override // X.InterfaceC46732IVs
    public final void removePriorityTaskByContextKey(String str) {
        LJIL(new C47362IiM(this, str));
    }

    @Override // X.InterfaceC46732IVs
    public final void setSmartPreloadAlgorithmJson(String str) {
        LJIL(new C47368IiS(this, str));
    }

    @Override // X.InterfaceC46732IVs
    public final void setSmartPreloadPlayTaskAlgorithmJson(String str) {
        LJIL(new C47371IiV(this, str));
    }

    @Override // X.InterfaceC46732IVs
    public final void smartPreloadBusinessEvent(String str) {
        LJIL(new C47370IiU(this, str));
    }

    @Override // X.InterfaceC46732IVs
    public final void smartPreloadPlayTaskBusinessEvent(String str) {
        LJIL(new C47372IiW(this, str));
    }

    @Override // X.InterfaceC46732IVs
    public final void smartPreloadWeakNetBusinessEvent(String str) {
        LJIL(new C47369IiT(this, str));
    }

    @Override // X.InterfaceC46732IVs
    public final void smartTimelinessPreloadBusinessEvent(String str) {
        LJIL(new C47374IiY(this, str));
    }

    @Override // X.InterfaceC46732IVs
    public final void updateAppState(boolean z) {
        LJIL(new C47375IiZ(this, z));
    }

    @Override // X.InterfaceC46732IVs
    public final void updateDnsBackupIpMap(Map<String, String> map) {
        LJIL(new C47352IiC(this, map));
    }

    @Override // X.InterfaceC46732IVs
    public final void addPreloadItem(SimVideoUrlModel simVideoUrlModel, C26206AQg c26206AQg) {
        LJIL(new C47353IiD(this, simVideoUrlModel, c26206AQg));
    }

    @Override // X.InterfaceC46732IVs
    public final void createScene(String str, String str2) {
        LJIL(new C47363IiN(this, str, str2));
    }

    @Override // X.InterfaceC46732IVs
    public final long getCacheSizeByCustomPath(String str, String str2) {
        return LJIJJLI().getCacheSizeByCustomPath(str, str2);
    }

    @Override // X.InterfaceC46732IVs
    public final long getPreloadedSize(SimBitRate simBitRate, boolean z) {
        return LJIJJLI().getPreloadedSize(simBitRate, z);
    }

    @Override // X.InterfaceC46732IVs
    public final long getVideoSize(SimBitRate simBitRate, boolean z) {
        return LJIJJLI().getVideoSize(simBitRate, z);
    }

    @Override // X.InterfaceC46732IVs
    public final boolean preload(SimVideoUrlModel simVideoUrlModel, int i) {
        return LJIJI(simVideoUrlModel, i, C46737IVx.LIZIZ);
    }

    @Override // X.InterfaceC46732IVs
    public final long tryToClearAndGetCachesByUsedTime(long j, boolean z) {
        if (z) {
            LJIL(new C47376Iia(this, j));
            return -1L;
        }
        return LJIJJLI().tryToClearAndGetCachesByUsedTime(j, false);
    }

    @Override // X.InterfaceC46732IVs
    public final void LIZ(String str, String str2, C84862XSg c84862XSg) {
        LJIL(new C47361IiL(this, str, str2, c84862XSg));
    }

    public final boolean LJIJI(SimVideoUrlModel simVideoUrlModel, int i, C46737IVx c46737IVx) {
        return LJIJJ(simVideoUrlModel, i, c46737IVx);
    }

    public final boolean LJIJJ(SimVideoUrlModel simVideoUrlModel, int i, C46737IVx c46737IVx) {
        return LJI(simVideoUrlModel, i, c46737IVx, null, null, 0, null, 0);
    }

    @Override // X.InterfaceC46732IVs
    public final String proxyUrl(SimVideoUrlModel simVideoUrlModel, String str, String[] strArr) {
        return LJIJJLI().proxyUrl(simVideoUrlModel, str, strArr);
    }

    @Override // X.InterfaceC46732IVs
    public final void LIZJ(SimVideoUrlModel simVideoUrlModel, String str, boolean z, InterfaceC47084Ids interfaceC47084Ids) {
        LJIL(new C47360IiK(this, simVideoUrlModel, str, z, interfaceC47084Ids));
    }

    @Override // X.InterfaceC46732IVs
    public final void addMedias(List<SimVideoUrlModel> list, boolean z, boolean z2, String str) {
        LJIL(new C47377Iib(this, list, z, z2, str));
    }

    @Override // X.InterfaceC46732IVs
    public final boolean LJIIIZ(SimVideoUrlModel simVideoUrlModel, int i, List list, int i2, List list2, int i3) {
        return LJI(simVideoUrlModel, i, C46737IVx.LIZIZ, null, list, i2, list2, i3);
    }

    @Override // X.InterfaceC46732IVs
    public final boolean LJI(SimVideoUrlModel simVideoUrlModel, int i, C46737IVx c46737IVx, C46729IVp c46729IVp, List list, int i2, List list2, int i3) {
        if (!C46734IVu.LIZIZ(simVideoUrlModel)) {
            return false;
        }
        return LJIL(new C47347Ii7(this, i, simVideoUrlModel, c46737IVx, c46729IVp, list, i2, list2, i3));
    }
}
