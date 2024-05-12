package com.ss.android.ugc.aweme.video.preload;

import X.AbstractRunnableC47385Iij;
import X.C26206AQg;
import X.C46556IOy;
import X.C46616IRg;
import X.C46664ITc;
import X.C46729IVp;
import X.C46734IVu;
import X.C46737IVx;
import X.C47318Ihe;
import X.C47335Ihv;
import X.C47348Ii8;
import X.C47349Ii9;
import X.C47351IiB;
import X.C47355IiF;
import X.C47356IiG;
import X.C47357IiH;
import X.C47358IiI;
import X.C47359IiJ;
import X.C47378Iic;
import X.C47379Iid;
import X.C47380Iie;
import X.C47381Iif;
import X.C47382Iig;
import X.C47383Iih;
import X.C47384Iii;
import X.C47388Iim;
import X.C47421IjJ;
import X.C47462Ijy;
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

/* loaded from: classes9.dex */
public class VideoPreloadManagerV2 implements InterfaceC46732IVs {
    public InterfaceC47342Ii2 LIZ;
    public Map<String, String> LIZJ;
    public C47318Ihe LIZLLL;
    public Handler LJFF;
    public boolean LJI;
    public final LruCache<String, Long> LJ = new LruCache<>(1048576);
    public String LJII = null;
    public String LJIIIIZZ = null;
    public String LJIIIZ = null;
    public String LJIIJ = null;
    public String LJIIJJI = null;
    public String LJIIL = null;
    public final C47421IjJ LIZIZ = C47335Ihv.LIZ();

    public final synchronized InterfaceC47319Ihf LJIILLIIL() {
        if (this.LIZLLL == null) {
            this.LIZLLL = new C47318Ihe();
        }
        return this.LIZLLL;
    }

    public final synchronized Handler LJIIZILJ() {
        C47421IjJ c47421IjJ;
        if (this.LJFF == null && (c47421IjJ = this.LIZIZ) != null && c47421IjJ.useSyncPreloadStyle()) {
            HandlerThread handlerThread = new HandlerThread("VideoPreloadHandlerThread");
            handlerThread.start();
            this.LJFF = new Handler(handlerThread.getLooper());
        }
        return this.LJFF;
    }

    @Override // X.InterfaceC46732IVs
    public final /* synthetic */ void addPreloadItem(SimVideoUrlModel simVideoUrlModel, C26206AQg c26206AQg) {
    }

    @Override // X.InterfaceC46732IVs
    public final /* synthetic */ long getCacheSizeByCustomPath(String str, String str2) {
        return -1L;
    }

    @Override // X.InterfaceC46732IVs
    public final /* synthetic */ String getCacheTopDirPath() {
        return null;
    }

    @Override // X.InterfaceC46732IVs
    public final /* synthetic */ void removePriorityTaskByContextKey(String str) {
    }

    @Override // X.InterfaceC46732IVs
    public final /* synthetic */ void smartPreloadWeakNetBusinessEvent(String str) {
    }

    public final void LJIILJJIL() {
        LJIJJ().addPreloadCallback(C46616IRg.LIZJ);
    }

    public final InterfaceC47342Ii2 LJIJJ() {
        InterfaceC47342Ii2 interfaceC47342Ii2 = this.LIZ;
        if (interfaceC47342Ii2 != null) {
            return interfaceC47342Ii2;
        }
        synchronized (this) {
            if (this.LIZ == null) {
                InterfaceC47342Ii2 LIZ = ((C47318Ihe) LJIILLIIL()).LIZ(this.LIZIZ.getExperiment().PreloadTypeExperiment(), this.LIZIZ);
                this.LIZ = LIZ;
                LIZ.getNetworkLibName();
            }
        }
        return this.LIZ;
    }

    @Override // X.InterfaceC46732IVs
    public final int startMethodHook() {
        if (this.LIZ != null) {
            return LJIJJ().startMethodHook();
        }
        return -1;
    }

    @Override // X.InterfaceC46732IVs
    public final InterfaceC47342Ii2 LJII() {
        return LJIJJ();
    }

    @Override // X.InterfaceC46732IVs
    public final void cancelAll() {
        if (LJIJJ().isInited()) {
            LJIJJ().cancelAll();
        }
    }

    @Override // X.InterfaceC46732IVs
    public final boolean checkInit() {
        if (LJIJJ().isInited()) {
            return true;
        }
        synchronized (this) {
            if (LJIJJ().isInited()) {
                return true;
            }
            LJIJJ().checkInit();
            LJIJJLI(new C47349Ii9(this));
            return true;
        }
    }

    @Override // X.InterfaceC46732IVs
    public final void clearCache() {
        if (LJIJJ().isInited()) {
            LJIJJLI(new C47378Iic(this));
        }
    }

    @Override // X.InterfaceC46732IVs
    public final File getCacheDir() {
        if (LJIJJ().isInited()) {
            return LJIJJ().getCacheFile();
        }
        return null;
    }

    @Override // X.InterfaceC46732IVs
    public final String getNetworkLibName() {
        return LJIJJ().getNetworkLibName();
    }

    @Override // X.InterfaceC46732IVs
    public final boolean supportPreloadObservable() {
        return LJIJJ().supportPreloadObservable();
    }

    @Override // X.InterfaceC46732IVs
    public final void LJIILIIL() {
        LJIILJJIL();
    }

    @Override // X.InterfaceC46732IVs
    public final long LIZIZ(SimVideoUrlModel simVideoUrlModel) {
        if (simVideoUrlModel != null && LJIJJ().isInited()) {
            if (simVideoUrlModel.hasDashBitrateAndSelectAsMp4()) {
                return LJIJJ().getDashSize(simVideoUrlModel);
            }
            return LJIJJ().getVideoSize(simVideoUrlModel.getBitRatedRatioUri());
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
        LJIJJLI(new C47351IiB(this, simVideoUrlModel));
    }

    @Override // X.InterfaceC46732IVs
    public final void LJFF(String str) {
        if (LJIJJ().isInited()) {
            LJIJJLI(new C47382Iig(this, str));
        } else {
            this.LJIIJJI = str;
        }
    }

    @Override // X.InterfaceC46732IVs
    public final C46556IOy LJIIIIZZ(SimVideoUrlModel simVideoUrlModel) {
        if (simVideoUrlModel != null && LJIJJ().isInited()) {
            return LJIJJ().readTimeInfo(simVideoUrlModel);
        }
        return null;
    }

    @Override // X.InterfaceC46732IVs
    public final boolean LJIIJ(List list) {
        return LJIJJLI(new C47388Iim(this, list));
    }

    @Override // X.InterfaceC46732IVs
    public final boolean LJIIJJI(SimVideoUrlModel simVideoUrlModel) {
        return preload(simVideoUrlModel, 0);
    }

    @Override // X.InterfaceC46732IVs
    public final InterfaceC47342Ii2 LJIIL(EnumC47317Ihd enumC47317Ihd) {
        return ((C47318Ihe) LJIILLIIL()).LIZ(enumC47317Ihd, this.LIZIZ);
    }

    public final void LJIILL(SimVideoUrlModel simVideoUrlModel) {
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

    public final boolean LJIJJLI(AbstractRunnableC47385Iij abstractRunnableC47385Iij) {
        C47421IjJ c47421IjJ = this.LIZIZ;
        if (c47421IjJ != null && c47421IjJ.useSyncPreloadStyle()) {
            if (LJIIZILJ() == null) {
                return true;
            }
            LJIIZILJ().post(abstractRunnableC47385Iij);
            return true;
        }
        return abstractRunnableC47385Iij.LIZ();
    }

    @Override // X.InterfaceC46732IVs
    public final void addDownloadProgressListener(InterfaceC47101Ie9 interfaceC47101Ie9) {
        if (interfaceC47101Ie9 != null && this.LIZ != null) {
            LJIJJ().addDownloadProgressListener(interfaceC47101Ie9);
        }
    }

    @Override // X.InterfaceC46732IVs
    public final int cacheSize(SimVideoUrlModel simVideoUrlModel) {
        if (LJIJJ().isInited()) {
            LJIILL(simVideoUrlModel);
            return LJIJJ().cacheSize(simVideoUrlModel);
        }
        return -1;
    }

    @Override // X.InterfaceC46732IVs
    public final void cancelPreload(SimVideoUrlModel simVideoUrlModel) {
        if (LJIJJ().isInited()) {
            LJIJJ().cancelPreload(simVideoUrlModel);
        }
    }

    @Override // X.InterfaceC46732IVs
    public final void destroyScene(String str) {
        LJIJJLI(new C47356IiG(this, str));
    }

    @Override // X.InterfaceC46732IVs
    public final C87748YcC getRequestInfo(SimVideoUrlModel simVideoUrlModel) {
        if (LJIJJ().isInited()) {
            return LJIJJ().getRequestInfo(simVideoUrlModel);
        }
        return null;
    }

    @Override // X.InterfaceC46732IVs
    public final List<C87748YcC> getRequestInfoList(SimVideoUrlModel simVideoUrlModel) {
        if (LJIJJ().isInited()) {
            return LJIJJ().getRequestInfoList(simVideoUrlModel);
        }
        return null;
    }

    @Override // X.InterfaceC46732IVs
    public final List<C47462Ijy> getSingleTimeDownloadList(SimVideoUrlModel simVideoUrlModel) {
        if (LJIJJ().isInited()) {
            return LJIJJ().getSingleTimeDownloadList(simVideoUrlModel);
        }
        return null;
    }

    @Override // X.InterfaceC46732IVs
    public final boolean isCache(SimVideoUrlModel simVideoUrlModel) {
        if (LJIJJ().isInited()) {
            LJIILL(simVideoUrlModel);
            return LJIJJ().isCache(simVideoUrlModel);
        }
        return false;
    }

    @Override // X.InterfaceC46732IVs
    public final boolean isCacheCompleted(SimVideoUrlModel simVideoUrlModel) {
        if (LJIJJ().isInited() && isCache(simVideoUrlModel) && LJIJJ().isCacheCompleted(simVideoUrlModel)) {
            return true;
        }
        return false;
    }

    @Override // X.InterfaceC46732IVs
    public final boolean isCachePure(SimVideoUrlModel simVideoUrlModel) {
        if (LJIJJ().isInited()) {
            LJIILL(simVideoUrlModel);
            return LJIJJ().isCachePure(simVideoUrlModel);
        }
        return false;
    }

    @Override // X.InterfaceC46732IVs
    public final void makeCurrentScene(String str) {
        LJIJJLI(new C47357IiH(this, str));
    }

    @Override // X.InterfaceC46732IVs
    public final void removeDownloadProgressListener(InterfaceC47101Ie9 interfaceC47101Ie9) {
        if (interfaceC47101Ie9 != null && this.LIZ != null) {
            LJIJJ().removeDownloadProgressListener(interfaceC47101Ie9);
        }
    }

    @Override // X.InterfaceC46732IVs
    public final void setSmartPreloadAlgorithmJson(String str) {
        if (LJIJJ().isInited()) {
            LJIJJ().setSmartPreloadAlgorithmJson(str);
        } else {
            this.LJII = str;
        }
    }

    @Override // X.InterfaceC46732IVs
    public final void setSmartPreloadPlayTaskAlgorithmJson(String str) {
        if (LJIJJ().isInited()) {
            LJIJJLI(new C47380Iie(this, str));
        } else {
            this.LJIIIZ = str;
        }
    }

    @Override // X.InterfaceC46732IVs
    public final void smartPreloadBusinessEvent(String str) {
        if (LJIJJ().isInited()) {
            LJIJJLI(new C47379Iid(this, str));
        } else {
            this.LJIIIIZZ = str;
        }
    }

    @Override // X.InterfaceC46732IVs
    public final void smartPreloadPlayTaskBusinessEvent(String str) {
        if (LJIJJ().isInited()) {
            LJIJJLI(new C47381Iif(this, str));
        } else {
            this.LJIIJ = str;
        }
    }

    @Override // X.InterfaceC46732IVs
    public final void smartTimelinessPreloadBusinessEvent(String str) {
        if (LJIJJ().isInited()) {
            LJIJJLI(new C47383Iih(this, str));
        } else {
            this.LJIIL = str;
        }
    }

    @Override // X.InterfaceC46732IVs
    public final void updateAppState(boolean z) {
        if (LJIJJ().isInited()) {
            LJIJJ().updateAppState(z);
        } else {
            this.LJI = z;
        }
    }

    @Override // X.InterfaceC46732IVs
    public final void updateDnsBackupIpMap(Map<String, String> map) {
        if (LJIJJ().isInited()) {
            LJIJJLI(new C47358IiI(this, map));
        } else {
            this.LIZJ = map;
        }
    }

    @Override // X.InterfaceC46732IVs
    public final void createScene(String str, String str2) {
        LJIJJLI(new C47355IiF(this, str, str2));
    }

    @Override // X.InterfaceC46732IVs
    public final long getPreloadedSize(SimBitRate simBitRate, boolean z) {
        if (LJIJJ().isInited()) {
            return LJIJJ().getPreloadedSize(simBitRate, z);
        }
        return -1L;
    }

    @Override // X.InterfaceC46732IVs
    public final long getVideoSize(SimBitRate simBitRate, boolean z) {
        if (LJIJJ().isInited()) {
            return LJIJJ().getVideoSize(simBitRate, z);
        }
        return -1L;
    }

    @Override // X.InterfaceC46732IVs
    public final boolean preload(SimVideoUrlModel simVideoUrlModel, int i) {
        return LJIJ(simVideoUrlModel, i, C46737IVx.LIZIZ);
    }

    @Override // X.InterfaceC46732IVs
    public final long tryToClearAndGetCachesByUsedTime(long j, boolean z) {
        if (z) {
            LJIJJLI(new C47384Iii(this, j));
            return -1L;
        }
        return LJIJJ().tryToClearAndGetCachesByUsedTime(j, false);
    }

    @Override // X.InterfaceC46732IVs
    public final void LIZ(String str, String str2, C84862XSg c84862XSg) {
        if (LJIJJ().isInited()) {
            LJIJJ().copyCache(str, str2, true, false, (InterfaceC47084Ids) c84862XSg);
        }
    }

    public final boolean LJIJ(SimVideoUrlModel simVideoUrlModel, int i, C46737IVx c46737IVx) {
        return LJIJI(simVideoUrlModel, i, c46737IVx);
    }

    public final boolean LJIJI(SimVideoUrlModel simVideoUrlModel, int i, C46737IVx c46737IVx) {
        return LJI(simVideoUrlModel, i, c46737IVx, null, null, 0, null, 0);
    }

    @Override // X.InterfaceC46732IVs
    public final String proxyUrl(SimVideoUrlModel simVideoUrlModel, String str, String[] strArr) {
        return LJIJJ().proxyUrl(simVideoUrlModel, str, strArr);
    }

    @Override // X.InterfaceC46732IVs
    public final void LIZJ(SimVideoUrlModel simVideoUrlModel, String str, boolean z, InterfaceC47084Ids interfaceC47084Ids) {
        if (LJIJJ().isInited()) {
            LJIJJ().copyCache(simVideoUrlModel, str, z, false, interfaceC47084Ids);
        }
    }

    @Override // X.InterfaceC46732IVs
    public final void addMedias(List<SimVideoUrlModel> list, boolean z, boolean z2, String str) {
        LJIJJLI(new C47359IiJ(this, list, z, z2, str));
    }

    @Override // X.InterfaceC46732IVs
    public final boolean LJIIIZ(SimVideoUrlModel simVideoUrlModel, int i, List list, int i2, List list2, int i3) {
        return LJI(simVideoUrlModel, i, C46737IVx.LIZIZ, null, list, i2, list2, i3);
    }

    @Override // X.InterfaceC46732IVs
    public final boolean LJI(SimVideoUrlModel simVideoUrlModel, int i, C46737IVx c46737IVx, C46729IVp c46729IVp, List list, int i2, List list2, int i3) {
        if (!C46734IVu.LIZIZ(simVideoUrlModel) || !LJIJJ().isInited()) {
            return false;
        }
        return LJIJJLI(new C47348Ii8(this, i, simVideoUrlModel, c46737IVx, c46729IVp, list, i2, list2, i3));
    }
}
