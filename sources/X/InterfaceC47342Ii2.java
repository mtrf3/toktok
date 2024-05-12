package X;

import com.ss.android.ugc.playerkit.simapicommon.model.SimBitRate;
import com.ss.android.ugc.playerkit.simapicommon.model.SimVideoUrlModel;
import java.io.File;
import java.util.List;

/* renamed from: X.Ii2, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public interface InterfaceC47342Ii2 {
    void addDownloadProgressListener(InterfaceC47101Ie9 interfaceC47101Ie9);

    void addMedias(List<SimVideoUrlModel> list, boolean z, boolean z2, String str);

    void addPreloadCallback(IFW ifw);

    void addPreloadItem(SimVideoUrlModel simVideoUrlModel, C26206AQg c26206AQg);

    int cacheSize(SimVideoUrlModel simVideoUrlModel);

    void cancelAll();

    void cancelPreload(SimVideoUrlModel simVideoUrlModel);

    boolean checkInit();

    void clearCache();

    void copyCache(SimVideoUrlModel simVideoUrlModel, String str, boolean z, boolean z2, InterfaceC47084Ids interfaceC47084Ids);

    void copyCache(String str, String str2, boolean z, boolean z2, InterfaceC47084Ids interfaceC47084Ids);

    void createScene(String str, String str2);

    void destroyScene(String str);

    File getCacheFile();

    long getCacheSizeByCustomPath(String str, String str2);

    String getCacheTopDirPath();

    long getDashSize(SimVideoUrlModel simVideoUrlModel);

    String getNetworkLibName();

    long getPreloadedSize(SimBitRate simBitRate, boolean z);

    long getPreloadedSize(String str);

    C87748YcC getRequestInfo(SimVideoUrlModel simVideoUrlModel);

    List<C87748YcC> getRequestInfoList(SimVideoUrlModel simVideoUrlModel);

    List<C47462Ijy> getSingleTimeDownloadList(SimVideoUrlModel simVideoUrlModel);

    long getVideoSize(SimBitRate simBitRate, boolean z);

    long getVideoSize(String str);

    void initAppInfo();

    boolean isCache(SimVideoUrlModel simVideoUrlModel);

    boolean isCacheCompleted(SimVideoUrlModel simVideoUrlModel);

    boolean isCachePure(SimVideoUrlModel simVideoUrlModel);

    boolean isInited();

    void makeCurrentScene(String str);

    boolean preload(SimVideoUrlModel simVideoUrlModel, int i);

    boolean preload(SimVideoUrlModel simVideoUrlModel, int i, AbstractC46738IVy abstractC46738IVy, C46729IVp c46729IVp);

    boolean preload(String str, String str2, int i, long j, AbstractC46738IVy abstractC46738IVy, C46729IVp c46729IVp);

    boolean preload(String str, String str2, int i, AbstractC46738IVy abstractC46738IVy, C46729IVp c46729IVp);

    boolean preloadAudio(List<SimVideoUrlModel> list, int i);

    boolean preloadSub(List<SimVideoUrlModel> list, int i);

    String proxyUrl(SimVideoUrlModel simVideoUrlModel, String str, String[] strArr);

    C46556IOy readTimeInfo(SimVideoUrlModel simVideoUrlModel);

    void removeDownloadProgressListener(InterfaceC47101Ie9 interfaceC47101Ie9);

    void removePriorityTaskByContextKey(String str);

    void setSmartPreloadAlgorithmJson(String str);

    void setSmartPreloadPlayTaskAlgorithmJson(String str);

    void setTimelinessAlgorithmJson(String str);

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
