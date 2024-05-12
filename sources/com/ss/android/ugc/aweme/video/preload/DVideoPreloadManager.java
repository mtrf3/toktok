package com.ss.android.ugc.aweme.video.preload;

import X.C16880lQ;
import X.C26206AQg;
import X.C46556IOy;
import X.C46616IRg;
import X.C46664ITc;
import X.C46729IVp;
import X.C46734IVu;
import X.C46737IVx;
import X.C46865IaL;
import X.C46877IaX;
import X.C46982IcE;
import X.C46985IcH;
import X.C47320Ihg;
import X.C47335Ihv;
import X.C47337Ihx;
import X.C47338Ihy;
import X.C47339Ihz;
import X.C47340Ii0;
import X.C47341Ii1;
import X.C47343Ii3;
import X.C47344Ii4;
import X.C47421IjJ;
import X.C47462Ijy;
import X.C76800UCe;
import X.C77413UZt;
import X.C84862XSg;
import X.C87748YcC;
import X.EnumC47317Ihd;
import X.IZ8;
import X.IZA;
import X.InterfaceC46732IVs;
import X.InterfaceC47084Ids;
import X.InterfaceC47101Ie9;
import X.InterfaceC47342Ii2;
import X.InterfaceC65784Pro;
import X.RunnableC51614KNm;
import X.RunnableC51615KNn;
import Y.ARunnableS11S0201000_8;
import Y.ARunnableS8S0201000_5;
import android.app.Application;
import android.os.Handler;
import android.os.HandlerThread;
import android.text.TextUtils;
import com.ss.android.ugc.playerkit.radar.SimRadar;
import com.ss.android.ugc.playerkit.simapicommon.model.SimBitRate;
import com.ss.android.ugc.playerkit.simapicommon.model.SimVideoUrlModel;
import java.io.File;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.CountDownLatch;
import kotlin.jvm.internal.AqS155S0200000_8;
import kotlin.jvm.internal.AqS158S0100000_8;
import kotlin.jvm.internal.AqS64S0110000_8;
import kotlin.jvm.internal.AqS75S1100000_8;
import kotlin.jvm.internal.AqS97S0300000_8;
import kotlin.jvm.internal.o;

/* loaded from: classes9.dex */
public final class DVideoPreloadManager implements InterfaceC46732IVs {
    public static final Handler LJIIIIZZ;
    public static final C47320Ihg LJIIIZ;
    public final C47421IjJ LIZ;
    public final EnumC47317Ihd LIZIZ;
    public final C47320Ihg LIZJ;
    public final InterfaceC47342Ii2 LIZLLL;
    public boolean LJ;
    public final ConcurrentHashMap<String, Long> LJFF;
    public final CountDownLatch LJI;
    public final CountDownLatch LJII;

    @Override // X.InterfaceC46732IVs
    public final /* synthetic */ long getCacheSizeByCustomPath(String str, String str2) {
        return -1L;
    }

    @Override // X.InterfaceC46732IVs
    public final /* synthetic */ String getCacheTopDirPath() {
        return null;
    }

    @Override // X.InterfaceC46732IVs
    public final /* synthetic */ boolean isCachePure(SimVideoUrlModel simVideoUrlModel) {
        return false;
    }

    @Override // X.InterfaceC46732IVs
    public final /* synthetic */ void smartPreloadWeakNetBusinessEvent(String str) {
    }

    static {
        Handler handler;
        try {
            HandlerThread handlerThread = new HandlerThread("VideoPreloadHandlerThread");
            handlerThread.start();
            handler = new Handler(handlerThread.getLooper());
        } catch (Throwable unused) {
            handler = new Handler(C16880lQ.LLJJJJ());
        }
        LJIIIIZZ = handler;
        LJIIIZ = new C47320Ihg();
    }

    public final void LJIILJJIL() {
        this.LIZLLL.addPreloadCallback(C46616IRg.LIZJ);
    }

    @Override // X.InterfaceC46732IVs
    public final void cancelAll() {
        LJIILL(new AqS158S0100000_8(this, 360));
    }

    @Override // X.InterfaceC46732IVs
    public final boolean checkInit() {
        LJIILL(new AqS158S0100000_8(this, 361));
        return true;
    }

    @Override // X.InterfaceC46732IVs
    public final void clearCache() {
        LJIILL(new AqS158S0100000_8(this, 362));
    }

    @Override // X.InterfaceC46732IVs
    public final File getCacheDir() {
        Application application;
        if (this.LJ) {
            return this.LIZLLL.getCacheFile();
        }
        try {
            application = C46982IcE.LIZ;
        } catch (Throwable unused) {
        }
        if (application == null) {
            return null;
        }
        File cacheDir = application.getCacheDir();
        if (C46982IcE.LIZIZ().isDebug()) {
            cacheDir = C77413UZt.LJIIL(application);
        }
        if (TextUtils.equals("playback_simulator_test", C46982IcE.LIZIZ().getChannel())) {
            cacheDir = C77413UZt.LJIIL(application);
        }
        if (cacheDir != null) {
            if (!cacheDir.exists()) {
                cacheDir.mkdirs();
            }
            return new File(cacheDir, this.LIZIZ.LJLILLLLZI);
        }
        return null;
    }

    @Override // X.InterfaceC46732IVs
    public final String getNetworkLibName() {
        return this.LIZLLL.getNetworkLibName();
    }

    @Override // X.InterfaceC46732IVs
    public final int startMethodHook() {
        return this.LIZLLL.startMethodHook();
    }

    @Override // X.InterfaceC46732IVs
    public final boolean supportPreloadObservable() {
        if (this.LJ) {
            return this.LIZLLL.supportPreloadObservable();
        }
        if (this.LIZIZ == EnumC47317Ihd.MediaLoader) {
            return true;
        }
        return false;
    }

    public DVideoPreloadManager() {
        C47320Ihg c47320Ihg = LJIIIZ;
        this.LIZJ = c47320Ihg;
        this.LJFF = new ConcurrentHashMap<>(1024);
        this.LJI = new CountDownLatch(1);
        this.LJII = new CountDownLatch(1);
        C47421IjJ LIZ = C47335Ihv.LIZ();
        this.LIZ = LIZ;
        EnumC47317Ihd PreloadTypeExperiment = LIZ.getExperiment().PreloadTypeExperiment();
        o.LJIIIIZZ(PreloadTypeExperiment, "config.getExperiment().PreloadTypeExperiment()");
        this.LIZIZ = PreloadTypeExperiment;
        InterfaceC47342Ii2 LIZ2 = c47320Ihg.LIZ(PreloadTypeExperiment, LIZ);
        o.LJIIIIZZ(LIZ2, "factory.getPreloader(type, config)");
        this.LIZLLL = LIZ2;
        Object value = IZ8.LLLIIL.getValue();
        o.LJIIIIZZ(value, "<get-COLD_BOOT_MDL_RUNNABLE_DEGRADE>(...)");
        if (((Boolean) value).booleanValue() && !IZA.LIZLLL) {
            SimRadar.keyScan("CBOF", "cold boot mdl degrade: block task post", new Object[0]);
            LJIIIIZZ.post(new RunnableC51615KNn(7, this));
            IZA.LIZIZ(new C46985IcH("TASK_PRELOAD_MANAGER_SERVICE_IMPL_INIT", new RunnableC51614KNm(6, this)));
        }
        checkInit();
    }

    @Override // X.InterfaceC46732IVs
    public final InterfaceC47342Ii2 LJII() {
        return this.LIZLLL;
    }

    @Override // X.InterfaceC46732IVs
    public final void LJIILIIL() {
        LJIILJJIL();
    }

    @Override // X.InterfaceC46732IVs
    public final long LIZIZ(SimVideoUrlModel simVideoUrlModel) {
        if (this.LJ && simVideoUrlModel != null) {
            if (simVideoUrlModel.hasDashBitrateAndSelectAsMp4()) {
                return this.LIZLLL.getDashSize(simVideoUrlModel);
            }
            return this.LIZLLL.getVideoSize(simVideoUrlModel.getBitRatedRatioUri());
        }
        return -1L;
    }

    @Override // X.InterfaceC46732IVs
    public final int LIZLLL(SimVideoUrlModel simVideoUrlModel) {
        return cacheSize(simVideoUrlModel);
    }

    @Override // X.InterfaceC46732IVs
    public final void LJ(SimVideoUrlModel simVideoUrlModel) {
        if (IZ8.LJIIIZ() || simVideoUrlModel == null || simVideoUrlModel.getUri() == null) {
            return;
        }
        C46982IcE.LIZLLL.execute(new ARunnableS11S0201000_8(3, this, new AqS155S0200000_8(this, simVideoUrlModel, 18), 4));
    }

    @Override // X.InterfaceC46732IVs
    public final void LJFF(String str) {
        LJIILL(new AqS75S1100000_8(this, str, 6));
    }

    @Override // X.InterfaceC46732IVs
    public final C46556IOy LJIIIIZZ(SimVideoUrlModel simVideoUrlModel) {
        if (!this.LJ || simVideoUrlModel == null) {
            return null;
        }
        return this.LIZLLL.readTimeInfo(simVideoUrlModel);
    }

    @Override // X.InterfaceC46732IVs
    public final boolean LJIIJ(List list) {
        LJIILL(new C47339Ihz(this, list));
        return true;
    }

    @Override // X.InterfaceC46732IVs
    public final boolean LJIIJJI(SimVideoUrlModel simVideoUrlModel) {
        return preload(simVideoUrlModel, 0);
    }

    @Override // X.InterfaceC46732IVs
    public final InterfaceC47342Ii2 LJIIL(EnumC47317Ihd enumC47317Ihd) {
        InterfaceC47342Ii2 LIZ = this.LIZJ.LIZ(enumC47317Ihd, this.LIZ);
        LIZ.checkInit();
        return LIZ;
    }

    public final void LJIILL(InterfaceC65784Pro<C76800UCe> interfaceC65784Pro) {
        LJIIIIZZ.post(new ARunnableS8S0201000_5(4, this, interfaceC65784Pro, 8));
    }

    public final void LJIILLIIL(SimVideoUrlModel simVideoUrlModel) {
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
    public final void addDownloadProgressListener(InterfaceC47101Ie9 interfaceC47101Ie9) {
        if (interfaceC47101Ie9 == null) {
            return;
        }
        this.LIZLLL.addDownloadProgressListener(interfaceC47101Ie9);
    }

    @Override // X.InterfaceC46732IVs
    public final int cacheSize(SimVideoUrlModel simVideoUrlModel) {
        if (this.LJ) {
            LJIILLIIL(simVideoUrlModel);
            return this.LIZLLL.cacheSize(simVideoUrlModel);
        }
        return 0;
    }

    @Override // X.InterfaceC46732IVs
    public final void cancelPreload(SimVideoUrlModel simVideoUrlModel) {
        LJIILL(new AqS155S0200000_8(this, simVideoUrlModel, 17));
    }

    @Override // X.InterfaceC46732IVs
    public final void destroyScene(String str) {
        LJIILL(new AqS75S1100000_8(this, str, 1));
    }

    @Override // X.InterfaceC46732IVs
    public final C87748YcC getRequestInfo(SimVideoUrlModel simVideoUrlModel) {
        if (!this.LJ || simVideoUrlModel == null) {
            return null;
        }
        return this.LIZLLL.getRequestInfo(simVideoUrlModel);
    }

    @Override // X.InterfaceC46732IVs
    public final List<C87748YcC> getRequestInfoList(SimVideoUrlModel simVideoUrlModel) {
        if (!this.LJ || simVideoUrlModel == null) {
            return null;
        }
        return this.LIZLLL.getRequestInfoList(simVideoUrlModel);
    }

    @Override // X.InterfaceC46732IVs
    public final List<C47462Ijy> getSingleTimeDownloadList(SimVideoUrlModel simVideoUrlModel) {
        if (this.LJ) {
            return this.LIZLLL.getSingleTimeDownloadList(simVideoUrlModel);
        }
        return null;
    }

    @Override // X.InterfaceC46732IVs
    public final boolean isCache(SimVideoUrlModel simVideoUrlModel) {
        if (this.LJ) {
            LJIILLIIL(simVideoUrlModel);
            return this.LIZLLL.isCache(simVideoUrlModel);
        }
        return false;
    }

    @Override // X.InterfaceC46732IVs
    public final boolean isCacheCompleted(SimVideoUrlModel simVideoUrlModel) {
        if (this.LJ && isCache(simVideoUrlModel) && this.LIZLLL.isCacheCompleted(simVideoUrlModel)) {
            return true;
        }
        return false;
    }

    @Override // X.InterfaceC46732IVs
    public final void makeCurrentScene(String str) {
        C46865IaL c46865IaL = C46877IaX.LIZ;
        c46865IaL.getClass();
        if (!TextUtils.isEmpty(str)) {
            c46865IaL.LIZJ = str;
            if (c46865IaL.LIZIZ == null) {
                c46865IaL.LIZIZ = str;
            }
        }
        LJIILL(new AqS75S1100000_8(this, str, 2));
    }

    @Override // X.InterfaceC46732IVs
    public final void removeDownloadProgressListener(InterfaceC47101Ie9 interfaceC47101Ie9) {
        if (interfaceC47101Ie9 == null) {
            return;
        }
        this.LIZLLL.removeDownloadProgressListener(interfaceC47101Ie9);
    }

    @Override // X.InterfaceC46732IVs
    public final void removePriorityTaskByContextKey(String str) {
        LJIILL(new AqS75S1100000_8(this, str, 3));
    }

    @Override // X.InterfaceC46732IVs
    public final void setSmartPreloadAlgorithmJson(String str) {
        LJIILL(new AqS75S1100000_8(this, str, 4));
    }

    @Override // X.InterfaceC46732IVs
    public final void setSmartPreloadPlayTaskAlgorithmJson(String str) {
        LJIILL(new AqS75S1100000_8(this, str, 5));
    }

    @Override // X.InterfaceC46732IVs
    public final void smartPreloadBusinessEvent(String str) {
        LJIILL(new AqS75S1100000_8(this, str, 7));
    }

    @Override // X.InterfaceC46732IVs
    public final void smartPreloadPlayTaskBusinessEvent(String str) {
        LJIILL(new AqS75S1100000_8(this, str, 8));
    }

    @Override // X.InterfaceC46732IVs
    public final void smartTimelinessPreloadBusinessEvent(String str) {
        LJIILL(new AqS75S1100000_8(this, str, 9));
    }

    @Override // X.InterfaceC46732IVs
    public final void updateAppState(boolean z) {
        LJIILL(new AqS64S0110000_8(this, z, 3));
    }

    @Override // X.InterfaceC46732IVs
    public final void updateDnsBackupIpMap(Map<String, String> map) {
        LJIILL(new AqS155S0200000_8(this, (DVideoPreloadManager) map, (Map<String, String>) 19));
    }

    @Override // X.InterfaceC46732IVs
    public final void addPreloadItem(SimVideoUrlModel simVideoUrlModel, C26206AQg c26206AQg) {
        LJIILL(new AqS97S0300000_8(this, simVideoUrlModel, c26206AQg, 3));
    }

    @Override // X.InterfaceC46732IVs
    public final void createScene(String str, String str2) {
        LJIILL(new C47343Ii3(this, str, str2));
    }

    @Override // X.InterfaceC46732IVs
    public final long getPreloadedSize(SimBitRate simBitRate, boolean z) {
        if (this.LJ) {
            return this.LIZLLL.getPreloadedSize(simBitRate, z);
        }
        return 0L;
    }

    @Override // X.InterfaceC46732IVs
    public final long getVideoSize(SimBitRate simBitRate, boolean z) {
        if (this.LJ) {
            return this.LIZLLL.getVideoSize(simBitRate, z);
        }
        return 0L;
    }

    @Override // X.InterfaceC46732IVs
    public final boolean preload(SimVideoUrlModel simVideoUrlModel, int i) {
        return LJIIZILJ(simVideoUrlModel, i, C46737IVx.LIZIZ);
    }

    @Override // X.InterfaceC46732IVs
    public final long tryToClearAndGetCachesByUsedTime(long j, boolean z) {
        LJIILL(new C47344Ii4(this, j, z));
        return -1L;
    }

    @Override // X.InterfaceC46732IVs
    public final void LIZ(String str, String str2, C84862XSg c84862XSg) {
        LJIILL(new C47341Ii1(this, str, str2, c84862XSg));
    }

    public final boolean LJIIZILJ(SimVideoUrlModel simVideoUrlModel, int i, C46737IVx c46737IVx) {
        return LJIJ(simVideoUrlModel, i, c46737IVx);
    }

    public final boolean LJIJ(SimVideoUrlModel simVideoUrlModel, int i, C46737IVx c46737IVx) {
        return LJI(simVideoUrlModel, i, c46737IVx, null, null, 0, null, 0);
    }

    @Override // X.InterfaceC46732IVs
    public final String proxyUrl(SimVideoUrlModel simVideoUrlModel, String str, String[] strArr) {
        boolean z;
        boolean z2;
        Object value = IZ8.LLLIIL.getValue();
        o.LJIIIIZZ(value, "<get-COLD_BOOT_MDL_RUNNABLE_DEGRADE>(...)");
        boolean booleanValue = ((Boolean) value).booleanValue();
        boolean z3 = true;
        if (!booleanValue || IZA.LIZLLL) {
            z = false;
        } else {
            z = true;
        }
        if (!z) {
            if (!IZ8.LJFF() || IZA.LIZLLL) {
                z2 = false;
            } else {
                z2 = true;
            }
            if (!z2) {
                if (this.LJ) {
                    return this.LIZLLL.proxyUrl(simVideoUrlModel, str, strArr);
                }
                try {
                    new AqS158S0100000_8(this, 363).invoke();
                } catch (Throwable unused) {
                }
                if (this.LJ) {
                    return this.LIZLLL.proxyUrl(simVideoUrlModel, str, strArr);
                }
                if (strArr == null) {
                    return null;
                }
                return strArr[0];
            }
        }
        if (strArr != null) {
            if (strArr.length != 0) {
                z3 = false;
            }
            if (!z3) {
                SimRadar.keyScan("CBOF", o.LJIILLIIL(strArr[0], "cold boot mdl degrade: return raw url "), new Object[0]);
                return strArr[0];
            }
        }
        return null;
    }

    @Override // X.InterfaceC46732IVs
    public final void LIZJ(SimVideoUrlModel simVideoUrlModel, String str, boolean z, InterfaceC47084Ids interfaceC47084Ids) {
        LJIILL(new C47340Ii0(this, simVideoUrlModel, str, z, interfaceC47084Ids));
    }

    @Override // X.InterfaceC46732IVs
    public final void addMedias(List<SimVideoUrlModel> list, boolean z, boolean z2, String str) {
        LJIILL(new C47338Ihy(this, list, z, z2, str));
    }

    @Override // X.InterfaceC46732IVs
    public final boolean LJIIIZ(SimVideoUrlModel simVideoUrlModel, int i, List list, int i2, List list2, int i3) {
        return LJI(simVideoUrlModel, i, C46737IVx.LIZIZ, null, list, i2, list2, i3);
    }

    @Override // X.InterfaceC46732IVs
    public final boolean LJI(SimVideoUrlModel simVideoUrlModel, int i, C46737IVx c46737IVx, C46729IVp c46729IVp, List list, int i2, List list2, int i3) {
        String dashVideoModelStr;
        if (!C46734IVu.LIZIZ(simVideoUrlModel)) {
            Boolean isEnableCallPreloadByViewModel = (Boolean) IZ8.LJLJL.getValue();
            o.LJIIIIZZ(isEnableCallPreloadByViewModel, "isEnableCallPreloadByViewModel");
            if (!isEnableCallPreloadByViewModel.booleanValue() || simVideoUrlModel == null || (dashVideoModelStr = simVideoUrlModel.getDashVideoModelStr()) == null || dashVideoModelStr.length() <= 0) {
                return false;
            }
        }
        LJIILL(new C47337Ihx(i, this, simVideoUrlModel, c46737IVx, c46729IVp, list, i2, list2, i3));
        return true;
    }
}
