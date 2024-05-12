package com.ss.android.ugc.aweme.video.preload;

import X.AbstractC46738IVy;
import X.C0EH;
import X.C16880lQ;
import X.C1DI;
import X.C26206AQg;
import X.C46556IOy;
import X.C46639ISd;
import X.C46640ISe;
import X.C46641ISf;
import X.C46642ISg;
import X.C46643ISh;
import X.C46729IVp;
import X.C46737IVx;
import X.C46982IcE;
import X.C47111IeJ;
import X.C47335Ihv;
import X.C47448Ijk;
import X.C47449Ijl;
import X.C47450Ijm;
import X.C47455Ijr;
import X.C47456Ijs;
import X.C47457Ijt;
import X.C47458Iju;
import X.C47461Ijx;
import X.C47462Ijy;
import X.C47463Ijz;
import X.C47464Ik0;
import X.C47466Ik2;
import X.C47467Ik3;
import X.C47468Ik4;
import X.C47469Ik5;
import X.C47470Ik6;
import X.C47472Ik8;
import X.C47480IkG;
import X.C47935Irb;
import X.C47942Iri;
import X.C47961Is1;
import X.C48059Itb;
import X.C48066Iti;
import X.C48078Itu;
import X.C48082Ity;
import X.C48100IuG;
import X.C48111IuR;
import X.C48841JEv;
import X.C64504PTg;
import X.C77413UZt;
import X.C87748YcC;
import X.DXH;
import X.EnumC46736IVw;
import X.EnumC47317Ihd;
import X.EnumC47428IjQ;
import X.IFW;
import X.IUW;
import X.InterfaceC47084Ids;
import X.InterfaceC47101Ie9;
import X.InterfaceC47342Ii2;
import X.InterfaceC47346Ii6;
import X.InterfaceC47452Ijo;
import X.InterfaceC47474IkA;
import X.InterfaceC47475IkB;
import X.RunnableC47459Ijv;
import X.X1D;
import X.YE1;
import Y.ARunnableS9S1100000_8;
import android.app.Application;
import android.content.Context;
import android.net.Uri;
import android.os.Build;
import android.os.StatFs;
import android.text.TextUtils;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.ss.android.ugc.aweme.video.preload.model.PreloadStrategyConfig;
import com.ss.android.ugc.bytex.pthread.base.proxy.PthreadThread;
import com.ss.android.ugc.playerkit.model.CDNLog;
import com.ss.android.ugc.playerkit.radar.SimRadar;
import com.ss.android.ugc.playerkit.simapicommon.model.SimBitRate;
import com.ss.android.ugc.playerkit.simapicommon.model.SimVideoUrlModel;
import java.io.File;
import java.io.IOException;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.LinkedBlockingQueue;
import kotlin.jvm.internal.o;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes9.dex */
public class VideoCachePreloader implements InterfaceC47342Ii2 {
    public static File sCache;
    public static File sVideoCacheFile;
    public WeakReference<InterfaceC47452Ijo> completeListener;
    public WeakReference<InterfaceC47474IkA> downloadFinishListener;
    public boolean hasProxyInited;
    public boolean mLazyGetUrlsMode;
    public C47458Iju mPreLoadThread;
    public C47449Ijl mSpeedHandler;
    public long mTotalDownloadBytes;
    public static final String TAG = C16880lQ.LJLLJ(VideoCachePreloader.class);
    public static final String CACHE_FILE = EnumC47317Ihd.VideoCache.getCacheDirName();
    public double mRealtimeNetworkSpeedInBps = -1.0d;
    public Map<String, C87748YcC> requestModelMap = Collections.synchronizedMap(new C46640ISe());
    public Map<String, List<C87748YcC>> requestModelListMap = Collections.synchronizedMap(new C46639ISd());
    public Map<String, List<C47450Ijm>> readTimeInfoMap = Collections.synchronizedMap(new C46641ISf());
    public HashMap<String, List<C47462Ijy>> mSingleTimeReadTimeInfoMap = new C46643ISh();
    public HashMap<String, C47470Ik6> ioReadTimeInfoMap = new C46642ISg();
    public final List<WeakReference<InterfaceC47101Ie9>> downloadProgressListeners = new CopyOnWriteArrayList();
    public C47462Ijy mCurrentDownloadInfo = null;
    public final IVideoPreloadConfig config = C47335Ihv.LIZ();

    @Override // X.InterfaceC47342Ii2
    public void addMedias(List<SimVideoUrlModel> list, boolean z, boolean z2, String str) {
    }

    public /* bridge */ /* synthetic */ void addMediasOpt(InterfaceC47346Ii6 interfaceC47346Ii6, boolean z, boolean z2, String str) {
    }

    @Override // X.InterfaceC47342Ii2
    public void addPreloadCallback(IFW ifw) {
    }

    @Override // X.InterfaceC47342Ii2
    public /* bridge */ /* synthetic */ void addPreloadItem(SimVideoUrlModel simVideoUrlModel, C26206AQg c26206AQg) {
    }

    public /* bridge */ /* synthetic */ void addPreloadItemOrdered(SimVideoUrlModel simVideoUrlModel, C26206AQg c26206AQg) {
    }

    public String adjustToMdlUrl(String str) {
        return str;
    }

    @Override // X.InterfaceC47342Ii2
    public boolean checkInit() {
        SimRadar.keyScan("VideoCachePreloader", "checkInit-start", new Object[0]);
        if (this.mPreLoadThread != null) {
            return true;
        }
        initProxy();
        try {
            C47458Iju c47458Iju = new C47458Iju(this);
            this.mPreLoadThread = c47458Iju;
            c47458Iju.start();
            SimRadar.keyScan("VideoCachePreloader", "checkInit-end", new Object[0]);
            return true;
        } catch (Exception unused) {
            return false;
        }
    }

    public /* bridge */ /* synthetic */ void cleanSpecifiedCacheDir(EnumC46736IVw enumC46736IVw, int i) {
    }

    public /* bridge */ /* synthetic */ void clearCache(SimVideoUrlModel simVideoUrlModel) {
    }

    public /* bridge */ /* synthetic */ void clearCacheByForce() {
    }

    public /* bridge */ /* synthetic */ void clearNetInfoCache() {
    }

    @Override // X.InterfaceC47342Ii2
    public /* bridge */ /* synthetic */ void createScene(String str, String str2) {
    }

    public /* bridge */ /* synthetic */ void createSceneWithBriefId(String str, String str2, String str3) {
    }

    @Override // X.InterfaceC47342Ii2
    public /* bridge */ /* synthetic */ void destroyScene(String str) {
    }

    public /* bridge */ /* synthetic */ String getCacheDirPath(EnumC46736IVw enumC46736IVw) {
        return "";
    }

    public String getCachePath(SimVideoUrlModel simVideoUrlModel) {
        return "";
    }

    @Override // X.InterfaceC47342Ii2
    public /* bridge */ /* synthetic */ long getCacheSizeByCustomPath(String str, String str2) {
        return -1L;
    }

    @Override // X.InterfaceC47342Ii2
    public /* bridge */ /* synthetic */ String getCacheTopDirPath() {
        return null;
    }

    public long getContinueCacheSize(SimVideoUrlModel simVideoUrlModel, int i, long j) {
        return 0L;
    }

    @Override // X.InterfaceC47342Ii2
    public /* bridge */ /* synthetic */ long getDashSize(SimVideoUrlModel simVideoUrlModel) {
        return -1L;
    }

    public /* bridge */ /* synthetic */ long getDownloadCountByVid(String str) {
        return -1L;
    }

    @Override // X.InterfaceC47342Ii2
    public /* bridge */ /* synthetic */ void initAppInfo() {
    }

    public /* bridge */ /* synthetic */ boolean isCacheAboveOrComplete(SimVideoUrlModel simVideoUrlModel, int i) {
        return false;
    }

    @Override // X.InterfaceC47342Ii2
    public /* bridge */ /* synthetic */ boolean isCachePure(SimVideoUrlModel simVideoUrlModel) {
        return false;
    }

    public boolean isSupportDash() {
        return false;
    }

    public /* bridge */ /* synthetic */ void loadVerifyLib() {
    }

    @Override // X.InterfaceC47342Ii2
    public /* bridge */ /* synthetic */ void makeCurrentScene(String str) {
    }

    public void onProxyUrl(SimVideoUrlModel simVideoUrlModel, String str) {
    }

    public /* bridge */ /* synthetic */ void removeCacheFileByKeyAndPath(String str, String str2) {
    }

    public /* bridge */ /* synthetic */ void removeOfflineFilePath(boolean z, String str) {
    }

    public void removePlayTaskDownloadProgressListener(InterfaceC47475IkB interfaceC47475IkB) {
    }

    public void removePreloadCallback(IFW ifw) {
    }

    @Override // X.InterfaceC47342Ii2
    public /* bridge */ /* synthetic */ void removePriorityTaskByContextKey(String str) {
    }

    public /* bridge */ /* synthetic */ void resetConcurrentNum() {
    }

    public /* bridge */ /* synthetic */ void setConcurrentNum(int i) {
    }

    public /* bridge */ /* synthetic */ void setPeakAlgoInfo(String str) {
    }

    public void setPlayTaskDownloadProgressListener(InterfaceC47475IkB interfaceC47475IkB) {
    }

    public void setPreloadCallback(IFW ifw) {
    }

    public /* bridge */ /* synthetic */ void setPreloadStrategyConfig(PreloadStrategyConfig preloadStrategyConfig) {
    }

    @Override // X.InterfaceC47342Ii2
    public /* bridge */ /* synthetic */ void setSmartPreloadAlgorithmJson(String str) {
    }

    @Override // X.InterfaceC47342Ii2
    public /* bridge */ /* synthetic */ void setSmartPreloadPlayTaskAlgorithmJson(String str) {
    }

    @Override // X.InterfaceC47342Ii2
    public /* bridge */ /* synthetic */ void setTimelinessAlgorithmJson(String str) {
    }

    @Override // X.InterfaceC47342Ii2
    public /* bridge */ /* synthetic */ void smartPreloadBusinessEvent(String str) {
    }

    @Override // X.InterfaceC47342Ii2
    public /* bridge */ /* synthetic */ void smartPreloadPlayTaskBusinessEvent(String str) {
    }

    @Override // X.InterfaceC47342Ii2
    public /* bridge */ /* synthetic */ void smartPreloadWeakNetBusinessEvent(String str) {
    }

    @Override // X.InterfaceC47342Ii2
    public /* bridge */ /* synthetic */ void smartTimelinessPreloadBusinessEvent(String str) {
    }

    @Override // X.InterfaceC47342Ii2
    public /* bridge */ /* synthetic */ int startMethodHook() {
        return -1;
    }

    @Override // X.InterfaceC47342Ii2
    public boolean supportPreloadObservable() {
        return false;
    }

    @Override // X.InterfaceC47342Ii2
    public /* bridge */ /* synthetic */ long tryToClearAndGetCachesByUsedTime(long j, boolean z) {
        return -1L;
    }

    @Override // X.InterfaceC47342Ii2
    public /* bridge */ /* synthetic */ void updateAppState(boolean z) {
    }

    @Override // X.InterfaceC47342Ii2
    public void updateDnsBackupIpMap(Map<String, String> map) {
    }

    public void writeDataToFile(String str, long j, long j2, int i, byte[] bArr) {
    }

    private C47935Irb initDiskLruCache() {
        File videoCacheDir;
        long j;
        long j2;
        long j3;
        C47935Irb c47935Irb;
        File file;
        Application application = C46982IcE.LIZ;
        C47935Irb c47935Irb2 = null;
        if (application == null || (videoCacheDir = getVideoCacheDir(application)) == null) {
            return null;
        }
        int VideoCacheMaxCacheSizeExperiment = this.config.getExperiment().VideoCacheMaxCacheSizeExperiment();
        if (VideoCacheMaxCacheSizeExperiment > 0) {
            j = VideoCacheMaxCacheSizeExperiment * 1048576;
        } else {
            j = 104857600;
        }
        if (Build.VERSION.SDK_INT >= 23) {
            j3 = j;
        } else {
            try {
                StatFs statFs = new StatFs(C16880lQ.LLLLLLLLLL().getAbsolutePath());
                j2 = statFs.getAvailableBlocksLong() * statFs.getBlockSizeLong();
            } catch (IllegalArgumentException unused) {
                j2 = 0;
            }
            j3 = (((j2 / 1024) / 1024) * 1048576) / 8;
        }
        if (this.config.getStorageManager().LIZIZ() && (file = sVideoCacheFile) != null) {
            j3 = file.getFreeSpace() / 8;
        }
        if (j3 <= j) {
            j = 10485760;
            if (j3 >= 10485760) {
                j = j3;
            }
        }
        sCache = videoCacheDir;
        try {
            c47935Irb = new C47935Irb(videoCacheDir);
        } catch (IOException e) {
            e = e;
        }
        try {
            c47935Irb.LJFF = j;
            c47935Irb.LJFF();
            return c47935Irb;
        } catch (IOException e2) {
            e = e2;
            c47935Irb2 = c47935Irb;
            C16880lQ.LLLLIIL(e);
            return c47935Irb2;
        }
    }

    private void setPreloadTimeout() {
        int i;
        if (C47455Ijr.LJIIIZ) {
            i = this.config.getExperiment().VideoCacheTTnetPreloadTimeoutExperiment();
        } else {
            i = 30000;
        }
        C48059Itb LIZIZ = C48059Itb.LIZIZ();
        LIZIZ.LJII = i;
        LIZIZ.LJIIIIZZ = 30000L;
        LIZIZ.LJIIIZ = 30000L;
    }

    private void setProxyTimeout() {
        int i;
        if (C47455Ijr.LJIIIZ) {
            i = this.config.getExperiment().VideoCacheTTnetProxyTimeoutExperiment();
        } else {
            i = 10000;
        }
        C48066Iti LIZJ = C48066Iti.LIZJ();
        LIZJ.LJIIIIZZ = i;
        LIZJ.LJIIIZ = 10000L;
        LIZJ.LJIIJ = 10000L;
    }

    @Override // X.InterfaceC47342Ii2
    public String getNetworkLibName() {
        if (C47455Ijr.LJIIIZ) {
            return "ttnet";
        }
        return "okhttp";
    }

    public C47111IeJ getTotalPreloadIoReadTimeInfo() {
        C47111IeJ c47111IeJ = new C47111IeJ();
        Iterator<String> it = this.ioReadTimeInfoMap.keySet().iterator();
        while (it.hasNext()) {
            this.ioReadTimeInfoMap.get(it.next());
        }
        return c47111IeJ;
    }

    public void initProxy() {
        C47935Irb initDiskLruCache;
        boolean z;
        boolean z2;
        boolean z3;
        if (this.hasProxyInited || (initDiskLruCache = initDiskLruCache()) == null) {
            return;
        }
        if (this.config.getExperiment().PlayerPreloadLazyGetUrlsExperiment().booleanValue() || C46982IcE.LIZIZ().isDebug()) {
            z = true;
        } else {
            z = false;
        }
        this.mLazyGetUrlsMode = z;
        int VideoSpeedQueueSizeExperiment = this.config.getExperiment().VideoSpeedQueueSizeExperiment();
        if (this.config.getSpeedManager().LJ() != VideoSpeedQueueSizeExperiment && VideoSpeedQueueSizeExperiment > 0) {
            this.config.getSpeedManager().LIZIZ(VideoSpeedQueueSizeExperiment);
            this.config.getSpeedManager().setSpeedQueueSize(VideoSpeedQueueSizeExperiment);
        }
        C47463Ijz.LIZJ = 1;
        C48059Itb.LJIIJJI.LIZIZ = new LinkedBlockingQueue();
        C47455Ijr.LJJIII = C46982IcE.LIZIZ().isDebug();
        C47455Ijr.LJIILIIL = 10;
        C47455Ijr.LJJII = this.config.getExperiment().VideoCacheWriteAsynchronousExperiment().booleanValue();
        C47455Ijr.LJJ = 1;
        C47455Ijr.LJJIFFI = this.config.getExperiment().UseVideoCacheHttpDnsExperiment().booleanValue();
        C47455Ijr.LJIIJJI = this.config.getPlayerCommonParamManager().LIZ();
        C47455Ijr.LJIJJLI = this.config.getPlayerCommonParamManager().LIZJ();
        C47455Ijr.LJIILJJIL = this.config.getExperiment().CheckVideoCacheRequestHeaderExperiment().booleanValue();
        C47455Ijr.LJIILL = this.config.getExperiment().PreloadLocalCachePathVideoPlayExperiment().booleanValue();
        C47455Ijr.LJIJ = this.config.getExperiment().VideoCacheAutoAdjustPreloadMaxExperiment().booleanValue();
        C47455Ijr.LJIIL = this.config.getExperiment().VideoCacheReadBuffersizeExperiment();
        C47455Ijr.LJIILLIIL = this.config.getExperiment().PlayerAbUseLastIf403Exp().booleanValue();
        if (this.config.getExperiment().PlayUse2UrlExperiment() == 1) {
            z2 = true;
        } else {
            z2 = false;
        }
        C47455Ijr.LJIIZILJ = z2;
        if (this.config.getExperiment().PlayeAbUserHttp2Exp() == 1 || C46982IcE.LIZIZ().isDebug()) {
            z3 = true;
        } else {
            z3 = false;
        }
        C47455Ijr.LJIJI = z3;
        C48078Itu.LJII = 300L;
        if (this.config.getExperiment().UseTTNetExperiment() == 1) {
            C47455Ijr.LJIIIZ = true;
        } else {
            C47455Ijr.LJIIIZ = false;
        }
        C47455Ijr.LJIIJ = this.config.getExperiment().VideoCacheMonitorNetStatus().booleanValue();
        C47455Ijr.LJIJJ = this.config.getMusicService().LIZIZ();
        C48841JEv.LJLILLLLZI = new C47466Ik2(this);
        C47455Ijr.LJJI = new C47467Ik3();
        C48841JEv.LJLJI = true;
        C47455Ijr.LJI = new IUW();
        C47455Ijr.LJII = new C47468Ik4();
        C47455Ijr.LJFF = new C47464Ik0(this);
        C47455Ijr.LJ = new C47448Ijk(this);
        C48066Iti LIZJ = C48066Iti.LIZJ();
        if (LIZJ.LJIIL.compareAndSet(false, true)) {
            new PthreadThread(LIZJ.LJIIJJI, "r/ProxyServer").start();
        }
        Application application = C46982IcE.LIZ;
        if (application != null) {
            C47455Ijr.LIZJ = C16880lQ.LLLLL(application);
            if (C47455Ijr.LIZ == null) {
                C47455Ijr.LIZ = initDiskLruCache;
                if (C47961Is1.LJ == null) {
                    synchronized (C47961Is1.class) {
                        if (C47961Is1.LJ == null) {
                            C47961Is1.LJ = new C47961Is1(application);
                        }
                    }
                }
                C47455Ijr.LIZIZ = C47961Is1.LJ;
                C47455Ijr.LIZ.LJ.add(new C47942Iri());
                C48066Iti LIZJ2 = C48066Iti.LIZJ();
                LIZJ2.LJFF = initDiskLruCache;
                LIZJ2.LJ = C47455Ijr.LIZIZ;
                C48059Itb LIZIZ = C48059Itb.LIZIZ();
                LIZIZ.LJ = initDiskLruCache;
                LIZIZ.LIZLLL = C47455Ijr.LIZIZ;
            }
            setPreloadTimeout();
            setProxyTimeout();
            this.hasProxyInited = true;
            return;
        }
        throw new IllegalArgumentException("DiskLruCache and Context can't be null !!!");
    }

    public void quit() {
        C47458Iju c47458Iju = this.mPreLoadThread;
        if (c47458Iju != null) {
            c47458Iju.LJ(4);
            this.mPreLoadThread = null;
        }
        C47449Ijl c47449Ijl = this.mSpeedHandler;
        if (c47449Ijl != null && !((Boolean) DXH.LIZIZ.getValue()).booleanValue()) {
            c47449Ijl.LJLJI.removeCallbacks(c47449Ijl);
            c47449Ijl.LJLJJI = false;
            c47449Ijl.LJLJJL = false;
        }
    }

    @Override // X.InterfaceC47342Ii2
    public void cancelAll() {
        if (checkInit()) {
            this.mPreLoadThread.LJ(2);
        }
    }

    @Override // X.InterfaceC47342Ii2
    public void clearCache() {
        if (checkInit()) {
            this.mPreLoadThread.LJ(3);
        }
    }

    public static VideoCachePreloader getInstance() {
        return C47469Ik5.LIZ;
    }

    @Override // X.InterfaceC47342Ii2
    public File getCacheFile() {
        return sCache;
    }

    public double getRealtimeNetworkSpeedInBps() {
        return this.mRealtimeNetworkSpeedInBps;
    }

    public long getTotalDownloadBytes() {
        return this.mTotalDownloadBytes;
    }

    public EnumC47317Ihd getType() {
        return EnumC47317Ihd.VideoCache;
    }

    @Override // X.InterfaceC47342Ii2
    public boolean isInited() {
        return this.hasProxyInited;
    }

    public static String getKey(SimVideoUrlModel simVideoUrlModel) {
        return simVideoUrlModel.getBitRatedRatioUri();
    }

    private File getVideoCacheDir(Context context) {
        File file = sVideoCacheFile;
        if (file != null) {
            return file;
        }
        File LLIIIL = C16880lQ.LLIIIL(context);
        if (this.config.getStorageManager().LIZIZ()) {
            LLIIIL = this.config.getStorageManager().LIZ(context, EnumC47428IjQ.PREFER_PRIVATE);
        }
        if (C46982IcE.LIZIZ().isDebug()) {
            LLIIIL = C77413UZt.LJIIL(context);
        }
        if (LLIIIL == null) {
            return null;
        }
        File file2 = new File(LLIIIL, CACHE_FILE);
        if (!file2.exists()) {
            file2.mkdirs();
        }
        sVideoCacheFile = file2;
        return file2;
    }

    @Override // X.InterfaceC47342Ii2
    public void addDownloadProgressListener(InterfaceC47101Ie9 interfaceC47101Ie9) {
        Iterator<WeakReference<InterfaceC47101Ie9>> it = this.downloadProgressListeners.iterator();
        if (it.hasNext() && it.next().get() == interfaceC47101Ie9) {
            return;
        }
        this.downloadProgressListeners.add(new WeakReference<>(interfaceC47101Ie9));
    }

    @Override // X.InterfaceC47342Ii2
    public int cacheSize(SimVideoUrlModel simVideoUrlModel) {
        if (simVideoUrlModel != null) {
            return (int) C47480IkG.LIZ.LIZ(simVideoUrlModel.getBitRatedRatioUri());
        }
        return 0;
    }

    public void cancelAll(int i) {
        cancelAll();
    }

    @Override // X.InterfaceC47342Ii2
    public void cancelPreload(SimVideoUrlModel simVideoUrlModel) {
        if (checkInit()) {
            C47458Iju c47458Iju = this.mPreLoadThread;
            C47461Ijx LJII = c47458Iju.LJII(1, simVideoUrlModel, -1);
            C47457Ijt c47457Ijt = c47458Iju.LJLJJL;
            c47457Ijt.LIZ.post(new RunnableC47459Ijv(c47457Ijt.LIZIZ, LJII));
        }
    }

    public void cancelProxy(SimVideoUrlModel simVideoUrlModel) {
        C48066Iti.LIZJ().LIZ(simVideoUrlModel.getBitRatedRatioUri());
    }

    public C47472Ik8 convertReadTimeInfo(C47450Ijm c47450Ijm) {
        if (c47450Ijm == null) {
            return null;
        }
        C47472Ik8 c47472Ik8 = new C47472Ik8();
        c47472Ik8.LIZ = c47450Ijm.LIZIZ;
        c47472Ik8.LIZIZ = c47450Ijm.LIZJ;
        return c47472Ik8;
    }

    public CDNLog convertToCDNLog(C47456Ijs c47456Ijs) {
        if (c47456Ijs == null) {
            return null;
        }
        CDNLog cDNLog = new CDNLog();
        cDNLog.LIZ = 2;
        cDNLog.fileKey = c47456Ijs.LIZ;
        cDNLog.host = c47456Ijs.LIZIZ;
        cDNLog.LIZIZ = c47456Ijs.LIZJ;
        cDNLog.LIZJ = c47456Ijs.LIZLLL;
        cDNLog.LIZLLL = c47456Ijs.LJ;
        cDNLog.LJ = c47456Ijs.LJFF;
        cDNLog.serverIp = c47456Ijs.LJI;
        cDNLog.LJFF = c47456Ijs.LJII;
        cDNLog.LJI = c47456Ijs.LJIIIIZZ;
        cDNLog.LJII = c47456Ijs.LJIIIZ;
        cDNLog.LJIIIIZZ = c47456Ijs.LJIIJ;
        cDNLog.statusCode = c47456Ijs.LJIIJJI;
        cDNLog.LJIIIZ = c47456Ijs.LJIIL;
        cDNLog.LJIIJ = c47456Ijs.LJIILIIL;
        return cDNLog;
    }

    public void createCurrentDownloadInfo(C47456Ijs c47456Ijs) {
        if (c47456Ijs == null || TextUtils.isEmpty(c47456Ijs.LIZ)) {
            return;
        }
        List<C47462Ijy> list = this.mSingleTimeReadTimeInfoMap.get(c47456Ijs.LIZ);
        if (list == null) {
            list = new ArrayList<>();
            this.mSingleTimeReadTimeInfoMap.put(c47456Ijs.LIZ, list);
        }
        C47462Ijy c47462Ijy = new C47462Ijy();
        String str = c47456Ijs.LIZ;
        o.LJIIIZ(str, "<set-?>");
        c47462Ijy.LIZ = str;
        list.size();
        list.add(c47462Ijy);
        this.mCurrentDownloadInfo = c47462Ijy;
    }

    public C47462Ijy getLastSingleTimeInfo(String str) {
        List<C47462Ijy> list;
        if (TextUtils.isEmpty(str) || (list = this.mSingleTimeReadTimeInfoMap.get(str)) == null || list.size() <= 0) {
            return null;
        }
        return (C47462Ijy) C64504PTg.LIZIZ(list, -1, list);
    }

    public C47111IeJ getPreloadIoReadTimeInfo(SimVideoUrlModel simVideoUrlModel) {
        String bitRatedRatioUri = simVideoUrlModel.getBitRatedRatioUri();
        if (this.ioReadTimeInfoMap.containsKey(bitRatedRatioUri)) {
            this.ioReadTimeInfoMap.get(bitRatedRatioUri);
            return new C47111IeJ();
        }
        return null;
    }

    @Override // X.InterfaceC47342Ii2
    public long getPreloadedSize(String str) {
        File LJ;
        C47935Irb c47935Irb = C48059Itb.LIZIZ().LJ;
        if (c47935Irb == null || TextUtils.isEmpty(str) || (LJ = c47935Irb.LJ(C48082Ity.LIZ(str))) == null) {
            return 0L;
        }
        long length = LJ.length();
        if (length <= 0) {
            return 0L;
        }
        return length;
    }

    @Override // X.InterfaceC47342Ii2
    public C87748YcC getRequestInfo(SimVideoUrlModel simVideoUrlModel) {
        try {
            return this.requestModelMap.get(simVideoUrlModel.getBitRatedRatioUri());
        } catch (Exception e) {
            C16880lQ.LLLLIIL(e);
            return null;
        }
    }

    @Override // X.InterfaceC47342Ii2
    public List<C87748YcC> getRequestInfoList(SimVideoUrlModel simVideoUrlModel) {
        List<C87748YcC> list = this.requestModelListMap.get(simVideoUrlModel.getBitRatedRatioUri());
        if (list == null) {
            return null;
        }
        return new ArrayList(list);
    }

    @Override // X.InterfaceC47342Ii2
    public List<C47462Ijy> getSingleTimeDownloadList(SimVideoUrlModel simVideoUrlModel) {
        return this.mSingleTimeReadTimeInfoMap.get(simVideoUrlModel.getBitRatedRatioUri());
    }

    @Override // X.InterfaceC47342Ii2
    public long getVideoSize(String str) {
        C48111IuR LIZ;
        C47961Is1 c47961Is1 = C48059Itb.LIZIZ().LIZLLL;
        if (c47961Is1 == null || TextUtils.isEmpty(str) || (LIZ = c47961Is1.LIZ(0, C48082Ity.LIZ(str))) == null) {
            return 0L;
        }
        return LIZ.LIZJ;
    }

    @Override // X.InterfaceC47342Ii2
    public boolean isCache(SimVideoUrlModel simVideoUrlModel) {
        if (simVideoUrlModel == null || C47480IkG.LIZ.LIZ(simVideoUrlModel.getBitRatedRatioUri()) <= 0) {
            return false;
        }
        return true;
    }

    @Override // X.InterfaceC47342Ii2
    public boolean isCacheCompleted(SimVideoUrlModel simVideoUrlModel) {
        if (simVideoUrlModel == null) {
            return false;
        }
        return isCache(simVideoUrlModel);
    }

    public boolean preload(SimVideoUrlModel simVideoUrlModel) {
        return preload(simVideoUrlModel, 0);
    }

    @Override // X.InterfaceC47342Ii2
    public C46556IOy readTimeInfo(SimVideoUrlModel simVideoUrlModel) {
        try {
            List<C47450Ijm> list = this.readTimeInfoMap.get(simVideoUrlModel.getBitRatedRatioUri());
            if (list != null && list.size() > 0) {
                C46556IOy c46556IOy = new C46556IOy();
                c46556IOy.LIZJ = list.size();
                for (C47450Ijm c47450Ijm : list) {
                    if (c47450Ijm != null) {
                        c46556IOy.LIZ += c47450Ijm.LIZJ;
                        c46556IOy.LIZIZ += c47450Ijm.LIZIZ;
                    }
                }
                return c46556IOy;
            }
            return null;
        } catch (Exception e) {
            C16880lQ.LLLLIIL(e);
            return null;
        }
    }

    public void removeDownloadFinishListener(InterfaceC47474IkA interfaceC47474IkA) {
        WeakReference<InterfaceC47474IkA> weakReference = this.downloadFinishListener;
        if (weakReference != null && weakReference.get() == interfaceC47474IkA) {
            this.downloadFinishListener = null;
        }
    }

    @Override // X.InterfaceC47342Ii2
    public void removeDownloadProgressListener(InterfaceC47101Ie9 interfaceC47101Ie9) {
        ArrayList arrayList = new ArrayList();
        for (WeakReference<InterfaceC47101Ie9> weakReference : this.downloadProgressListeners) {
            if (weakReference.get() == interfaceC47101Ie9) {
                arrayList.add(weakReference);
            }
        }
        this.downloadProgressListeners.removeAll(arrayList);
    }

    public void setDownloadFinishListener(InterfaceC47474IkA interfaceC47474IkA) {
        this.downloadFinishListener = new WeakReference<>(interfaceC47474IkA);
    }

    public void setMaxPreloadSize(int i) {
        C48059Itb.LJIIJJI.LIZ = i;
    }

    @Override // X.InterfaceC47342Ii2
    public long getPreloadedSize(SimBitRate simBitRate, boolean z) {
        if (simBitRate != null) {
            return getPreloadedSize(simBitRate.getUrlKey());
        }
        return -1L;
    }

    @Override // X.InterfaceC47342Ii2
    public long getVideoSize(SimBitRate simBitRate, boolean z) {
        if (simBitRate != null) {
            return getVideoSize(simBitRate.getUrlKey());
        }
        return -1L;
    }

    @Override // X.InterfaceC47342Ii2
    public boolean preload(SimVideoUrlModel simVideoUrlModel, int i) {
        return preload(simVideoUrlModel, i, C46737IVx.LIZIZ, (C46729IVp) null);
    }

    @Override // X.InterfaceC47342Ii2
    public boolean preloadAudio(List<SimVideoUrlModel> list, int i) {
        if (!checkInit()) {
            return false;
        }
        if (this.config.isPlayerPreferchTtsAudio() && list != null && !list.isEmpty()) {
            if (this.config.playerPreferchTtsAudioSize() > 0.0f) {
                i = (int) (this.config.playerPreferchTtsAudioSize() * 1024.0f);
            }
            for (SimVideoUrlModel simVideoUrlModel : list) {
                if (simVideoUrlModel != null) {
                    C47458Iju c47458Iju = this.mPreLoadThread;
                    C47461Ijx LJII = c47458Iju.LJII(0, simVideoUrlModel, i);
                    C47457Ijt c47457Ijt = c47458Iju.LJLJJL;
                    c47457Ijt.LIZ.post(new RunnableC47459Ijv(c47457Ijt.LIZIZ, LJII));
                }
            }
            return true;
        }
        return true;
    }

    @Override // X.InterfaceC47342Ii2
    public boolean preloadSub(List<SimVideoUrlModel> list, int i) {
        if (!checkInit()) {
            return false;
        }
        if (this.config.isPlayerPreferchCaption() && list != null && !list.isEmpty()) {
            if (i > 0 && this.config.playerPreferchCaptionSize() > 0.0f) {
                i = (int) (this.config.playerPreferchCaptionSize() * 1024.0f);
            }
            for (SimVideoUrlModel simVideoUrlModel : list) {
                if (simVideoUrlModel != null) {
                    SimRadar.keyScan("VideoCachePreloader", "preload-1", simVideoUrlModel.getLogLabel());
                    C47458Iju c47458Iju = this.mPreLoadThread;
                    C47461Ijx LJII = c47458Iju.LJII(0, simVideoUrlModel, i);
                    C47457Ijt c47457Ijt = c47458Iju.LJLJJL;
                    c47457Ijt.LIZ.post(new RunnableC47459Ijv(c47457Ijt.LIZIZ, LJII));
                }
            }
        }
        return true;
    }

    public JSONObject genAlogJSON(String str, String str2, String str3) {
        if (!C46982IcE.LIZ().isEnabled()) {
            return null;
        }
        JSONObject jSONObject = new JSONObject();
        try {
            try {
                jSONObject.put("tag", str);
                jSONObject.put("msg", str2);
                jSONObject.put("vid", str3);
                return jSONObject;
            } catch (JSONException e) {
                C16880lQ.LLLLIIL(e);
                return jSONObject;
            }
        } catch (Throwable unused) {
            return jSONObject;
        }
    }

    public boolean preload(String str, String str2, int i) {
        return preload(str, str2, i, C46737IVx.LIZIZ, null);
    }

    @Override // X.InterfaceC47342Ii2
    public String proxyUrl(SimVideoUrlModel simVideoUrlModel, String str, String[] strArr) {
        C48111IuR LIZ;
        if (this.config.getCacheHelper().isEnabled()) {
            String LIZIZ = this.config.getCacheHelper().LIZIZ(simVideoUrlModel.getSourceId());
            if (this.config.getCacheHelper().LIZJ(LIZIZ)) {
                return LIZIZ;
            }
        }
        C48066Iti LIZJ = C48066Iti.LIZJ();
        LIZJ.getClass();
        if (TextUtils.isEmpty(str) || strArr == null || strArr.length <= 0) {
            return null;
        }
        C47935Irb c47935Irb = LIZJ.LJFF;
        if (c47935Irb == null || LIZJ.LJ == null) {
            return strArr[0];
        }
        String LIZ2 = C48082Ity.LIZ(str);
        C47480IkG.LIZ.LIZJ(str, LIZ2);
        if (C47455Ijr.LJIILL) {
            File LIZJ2 = c47935Irb.LIZJ(LIZ2);
            if (LIZJ2.exists() && LIZJ2.isFile() && (LIZ = LIZJ.LJ.LIZ(0, LIZ2)) != null && LIZJ2.length() >= LIZ.LIZJ) {
                if (C47455Ijr.LJ != null) {
                    C48100IuG.LJIIIIZZ(new ARunnableS9S1100000_8(LIZ, str, 12));
                }
                return LIZJ2.getAbsolutePath();
            }
        }
        List<String> LJFF = C48100IuG.LJFF(strArr);
        if (LIZJ.LIZJ.get() == 1 && LJFF != null) {
            StringBuilder sb = new StringBuilder(512);
            while (true) {
                sb.delete(0, sb.length());
                sb.append("rk");
                sb.append("=");
                sb.append(Uri.encode(str));
                sb.append("&");
                sb.append("k");
                sb.append("=");
                sb.append(LIZ2);
                if (!TextUtils.isEmpty("")) {
                    YE1.LIZLLL(sb, "&", "s", "=", "");
                }
                int size = LJFF.size();
                for (int i = 0; i < size; i++) {
                    C0EH.LIZLLL(sb, "&", "u", i, "=");
                    sb.append(Uri.encode((String) ListProtector.get(LJFF, i)));
                }
                C1DI.LIZIZ(sb, "&", "ah", "=");
                sb.append(C47455Ijr.LIZ(str, LIZ2, "", LJFF));
                String sb2 = sb.toString();
                if (sb2.length() <= 3072) {
                    StringBuilder LIZ3 = X1D.LIZ();
                    LIZ3.append("http://127.0.0.1:");
                    LIZ3.append(LIZJ.LIZIZ);
                    LIZ3.append("?");
                    LIZ3.append(sb2);
                    return X1D.LIZIZ(LIZ3);
                }
                if (LJFF.size() == 1) {
                    return strArr[0];
                }
                ListProtector.remove(LJFF, LJFF.size() - 1);
            }
        } else {
            return strArr[0];
        }
    }

    @Override // X.InterfaceC47342Ii2
    public boolean preload(SimVideoUrlModel simVideoUrlModel, int i, AbstractC46738IVy abstractC46738IVy, C46729IVp c46729IVp) {
        if (!checkInit()) {
            return false;
        }
        SimRadar.keyScan("VideoCachePreloader", "preload-1", simVideoUrlModel.getLogLabel());
        C47458Iju c47458Iju = this.mPreLoadThread;
        C47461Ijx LJII = c47458Iju.LJII(0, simVideoUrlModel, i);
        C47457Ijt c47457Ijt = c47458Iju.LJLJJL;
        c47457Ijt.LIZ.post(new RunnableC47459Ijv(c47457Ijt.LIZIZ, LJII));
        return true;
    }

    public boolean preload(String str, String str2, int i, long j) {
        return preload(str, str2, i, j, C46737IVx.LIZIZ, null);
    }

    @Override // X.InterfaceC47342Ii2
    public void copyCache(SimVideoUrlModel simVideoUrlModel, String str, boolean z, boolean z2, InterfaceC47084Ids interfaceC47084Ids) {
        if (interfaceC47084Ids != null) {
            interfaceC47084Ids.LJIILJJIL(1);
        }
    }

    @Override // X.InterfaceC47342Ii2
    public boolean preload(String str, String str2, int i, AbstractC46738IVy abstractC46738IVy, C46729IVp c46729IVp) {
        SimRadar.keyScan("VideoCachePreloader", "preload-3", new Object[0]);
        return false;
    }

    @Override // X.InterfaceC47342Ii2
    public void copyCache(String str, String str2, boolean z, boolean z2, InterfaceC47084Ids interfaceC47084Ids) {
        if (interfaceC47084Ids != null) {
            interfaceC47084Ids.LJIILJJIL(1);
        }
    }

    @Override // X.InterfaceC47342Ii2
    public boolean preload(String str, String str2, int i, long j, AbstractC46738IVy abstractC46738IVy, C46729IVp c46729IVp) {
        SimRadar.keyScan("VideoCachePreloader", "preload-4", new Object[0]);
        return false;
    }
}
