package X;

import com.ss.android.ugc.playerkit.simapicommon.model.SimBitRate;
import com.ss.android.ugc.playerkit.simapicommon.model.SimVideoUrlModel;
import java.io.File;
import java.util.List;

/* renamed from: X.IVs, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public interface InterfaceC46732IVs {
    void LIZ(String str, String str2, C84862XSg c84862XSg);

    long LIZIZ(SimVideoUrlModel simVideoUrlModel);

    void LIZJ(SimVideoUrlModel simVideoUrlModel, String str, boolean z, InterfaceC47084Ids interfaceC47084Ids);

    int LIZLLL(SimVideoUrlModel simVideoUrlModel);

    void LJ(SimVideoUrlModel simVideoUrlModel);

    void LJFF(String str);

    boolean LJI(SimVideoUrlModel simVideoUrlModel, int i, C46737IVx c46737IVx, C46729IVp c46729IVp, List list, int i2, List list2, int i3);

    InterfaceC47342Ii2 LJII();

    C46556IOy LJIIIIZZ(SimVideoUrlModel simVideoUrlModel);

    boolean LJIIIZ(SimVideoUrlModel simVideoUrlModel, int i, List<SimVideoUrlModel> list, int i2, List<SimVideoUrlModel> list2, int i3);

    boolean LJIIJ(List list);

    boolean LJIIJJI(SimVideoUrlModel simVideoUrlModel);

    InterfaceC47342Ii2 LJIIL(EnumC47317Ihd enumC47317Ihd);

    void LJIILIIL();

    void addDownloadProgressListener(InterfaceC47101Ie9 interfaceC47101Ie9);

    void addMedias(List<SimVideoUrlModel> list, boolean z, boolean z2, String str);

    void addPreloadItem(SimVideoUrlModel simVideoUrlModel, C26206AQg c26206AQg);

    int cacheSize(SimVideoUrlModel simVideoUrlModel);

    void cancelAll();

    void cancelPreload(SimVideoUrlModel simVideoUrlModel);

    boolean checkInit();

    void clearCache();

    void createScene(String str, String str2);

    void destroyScene(String str);

    File getCacheDir();

    long getCacheSizeByCustomPath(String str, String str2);

    String getCacheTopDirPath();

    String getNetworkLibName();

    long getPreloadedSize(SimBitRate simBitRate, boolean z);

    C87748YcC getRequestInfo(SimVideoUrlModel simVideoUrlModel);

    List<C87748YcC> getRequestInfoList(SimVideoUrlModel simVideoUrlModel);

    List<C47462Ijy> getSingleTimeDownloadList(SimVideoUrlModel simVideoUrlModel);

    long getVideoSize(SimBitRate simBitRate, boolean z);

    boolean isCache(SimVideoUrlModel simVideoUrlModel);

    boolean isCacheCompleted(SimVideoUrlModel simVideoUrlModel);

    boolean isCachePure(SimVideoUrlModel simVideoUrlModel);

    void makeCurrentScene(String str);

    boolean preload(SimVideoUrlModel simVideoUrlModel, int i);

    String proxyUrl(SimVideoUrlModel simVideoUrlModel, String str, String[] strArr);

    void removeDownloadProgressListener(InterfaceC47101Ie9 interfaceC47101Ie9);

    void removePriorityTaskByContextKey(String str);

    void setSmartPreloadAlgorithmJson(String str);

    void setSmartPreloadPlayTaskAlgorithmJson(String str);

    void smartPreloadBusinessEvent(String str);

    void smartPreloadPlayTaskBusinessEvent(String str);

    void smartPreloadWeakNetBusinessEvent(String str);

    void smartTimelinessPreloadBusinessEvent(String str);

    int startMethodHook();

    boolean supportPreloadObservable();

    long tryToClearAndGetCachesByUsedTime(long j, boolean z);

    void updateAppState(boolean z);

    void updateDnsBackupIpMap(java.util.Map<String, String> map);
}
