package com.ss.android.socialbase.downloader.model;

import X.C65210PiY;
import X.EnumC84256X4y;
import X.InterfaceC84169X1p;
import X.InterfaceC84183X2d;
import X.InterfaceC84186X2g;
import X.InterfaceC84187X2h;
import X.InterfaceC84194X2o;
import X.VFA;
import X.X1C;
import X.X1D;
import X.X21;
import X.X27;
import X.X2C;
import X.X41;
import X.X4H;
import X.X4W;
import X.X5O;
import Y.ARunnableS34S0200000_15;
import android.util.SparseArray;
import com.ss.android.socialbase.downloader.depend.IDownloadDepend;
import com.ss.android.socialbase.downloader.depend.IDownloadListener;
import com.ss.android.socialbase.downloader.exception.BaseException;
import com.ss.android.socialbase.downloader.service.IDownloadComponentManagerService;
import com.ss.android.socialbase.downloader.service.IDownloadMonitorHelperService;
import com.ss.android.socialbase.downloader.service.IDownloadProcessDispatcherService;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import org.json.JSONObject;

/* loaded from: classes16.dex */
public class DownloadTask {
    public boolean autoRemoveCallback;
    public boolean autoSetHashCodeForSameTask;
    public IDownloadDepend depend;
    public X21 diskSpaceHandler;
    public final List<InterfaceC84183X2d> downloadCompleteHandlers;
    public DownloadInfo downloadInfo;
    public X4W downloadInfoBuilder;
    public X2C fileUriProvider;
    public X1C forbiddenHandler;
    public int hashCodeForSameTask;
    public InterfaceC84169X1p interceptor;
    public final SparseArray<IDownloadListener> mainThreadListeners;
    public InterfaceC84194X2o monitorDepend;
    public boolean needDelayForCacheSync;
    public InterfaceC84186X2g notificationClickCallback;
    public InterfaceC84187X2h notificationEventListener;
    public final SparseArray<IDownloadListener> notificationListeners;
    public X27 retryDelayTimeCalculator;
    public final SparseArray<EnumC84256X4y> singleListenerHashCodeMap;
    public final Map<EnumC84256X4y, IDownloadListener> singleListenerMap;
    public final SparseArray<IDownloadListener> subThreadListeners;

    public synchronized int autoCalAndGetHashCodeForSameTask() {
        IDownloadListener singleDownloadListener = getSingleDownloadListener(EnumC84256X4y.MAIN);
        if (singleDownloadListener != null || (singleDownloadListener = getSingleDownloadListener(EnumC84256X4y.SUB)) != null) {
            this.hashCodeForSameTask = singleDownloadListener.hashCode();
        }
        return this.hashCodeForSameTask;
    }

    public DownloadTask needChunkDowngradeRetry(boolean z) {
        return this;
    }

    public DownloadTask needReuseChunkRunnable(boolean z) {
        return this;
    }

    public DownloadTask newSaveTempFileEnable(boolean z) {
        return this;
    }

    private int downloadImpl() {
        this.downloadInfo = this.downloadInfoBuilder.LIZ();
        IDownloadProcessDispatcherService iDownloadProcessDispatcherService = (IDownloadProcessDispatcherService) X41.LIZ(IDownloadProcessDispatcherService.class);
        if (iDownloadProcessDispatcherService.getDownloadInfo(this.downloadInfo.getId()) == null) {
            ((IDownloadMonitorHelperService) X41.LIZ(IDownloadMonitorHelperService.class)).monitorSend(this, null, 0);
        }
        iDownloadProcessDispatcherService.tryDownload(this);
        DownloadInfo downloadInfo = this.downloadInfo;
        if (downloadInfo == null) {
            return 0;
        }
        return downloadInfo.getId();
    }

    public void addListenerToDownloadingSameTask() {
        if (this.downloadInfo != null) {
            if (C65210PiY.LIZ()) {
                C65210PiY.LIZLLL(this.downloadInfo.getId(), "DownloadTask", "addListenerToDownloadingSameTask", "Same task just tryDownloading, so add listener in last task instead of tryDownload");
            }
            if (!this.downloadInfo.isAddListenerToSameTask()) {
                this.downloadInfo.setAddListenerToSameTask(true);
            }
        }
        addListenerToDownloadingSameTask(EnumC84256X4y.MAIN);
        addListenerToDownloadingSameTask(EnumC84256X4y.SUB);
        ((IDownloadMonitorHelperService) X41.LIZ(IDownloadMonitorHelperService.class)).monitorSendWithTaskMonitor(this.monitorDepend, this.downloadInfo, new BaseException(1003, "has another same task, add Listener to old task"), 0);
    }

    public DownloadInfo buildDownloadInfo() {
        return this.downloadInfoBuilder.LIZ();
    }

    public boolean canShowNotification() {
        DownloadInfo downloadInfo = this.downloadInfo;
        if (downloadInfo != null) {
            return downloadInfo.canShowNotification();
        }
        return false;
    }

    public int download() {
        if (X4H.LJFF.LJIIIIZZ("fix_anr_remove_report_idle_status", 0) <= 0) {
            return downloadImpl();
        }
        this.downloadInfo = this.downloadInfoBuilder.LIZ();
        ((IDownloadProcessDispatcherService) X41.LIZ(IDownloadProcessDispatcherService.class)).tryDownload(this);
        return this.downloadInfo.getId();
    }

    public int getDownloadId() {
        DownloadInfo downloadInfo = this.downloadInfo;
        if (downloadInfo == null) {
            return 0;
        }
        return downloadInfo.getId();
    }

    public DownloadTask() {
        this.singleListenerMap = new ConcurrentHashMap();
        this.singleListenerHashCodeMap = new SparseArray<>();
        this.needDelayForCacheSync = false;
        this.downloadCompleteHandlers = new ArrayList();
        this.autoRemoveCallback = false;
        this.autoSetHashCodeForSameTask = true;
        this.downloadInfoBuilder = new X4W();
        this.mainThreadListeners = new SparseArray<>();
        this.subThreadListeners = new SparseArray<>();
        this.notificationListeners = new SparseArray<>();
    }

    public IDownloadDepend getDepend() {
        return this.depend;
    }

    public X21 getDiskSpaceHandler() {
        return this.diskSpaceHandler;
    }

    public List<InterfaceC84183X2d> getDownloadCompleteHandlers() {
        return this.downloadCompleteHandlers;
    }

    public DownloadInfo getDownloadInfo() {
        return this.downloadInfo;
    }

    public X2C getFileUriProvider() {
        return this.fileUriProvider;
    }

    public X1C getForbiddenHandler() {
        return this.forbiddenHandler;
    }

    public int getHashCodeForSameTask() {
        return this.hashCodeForSameTask;
    }

    public InterfaceC84169X1p getInterceptor() {
        return this.interceptor;
    }

    public InterfaceC84194X2o getMonitorDepend() {
        return this.monitorDepend;
    }

    public InterfaceC84186X2g getNotificationClickCallback() {
        return this.notificationClickCallback;
    }

    public InterfaceC84187X2h getNotificationEventListener() {
        return this.notificationEventListener;
    }

    public X27 getRetryDelayTimeCalculator() {
        return this.retryDelayTimeCalculator;
    }

    public boolean isAutoSetHashCodeForSameTask() {
        return this.autoSetHashCodeForSameTask;
    }

    public boolean isNeedDelayForCacheSync() {
        return this.needDelayForCacheSync;
    }

    public DownloadTask(DownloadInfo downloadInfo) {
        this();
        this.downloadInfo = downloadInfo;
    }

    private void addListenerToDownloadingSameTask(EnumC84256X4y enumC84256X4y) {
        SparseArray<IDownloadListener> downloadListeners = getDownloadListeners(enumC84256X4y);
        if (downloadListeners == null) {
            C65210PiY.LJ(getDownloadId(), "DownloadTask", "addListenerToDownloadingSameTask", "ListenerType is null");
            return;
        }
        synchronized (downloadListeners) {
            for (int i = 0; i < downloadListeners.size(); i++) {
                IDownloadListener iDownloadListener = downloadListeners.get(downloadListeners.keyAt(i));
                if (iDownloadListener != null) {
                    ((IDownloadProcessDispatcherService) X41.LIZ(IDownloadProcessDispatcherService.class)).addDownloadListener(getDownloadId(), iDownloadListener, enumC84256X4y, false);
                }
            }
        }
    }

    public DownloadTask accessHttpHeaderKeys(List<String> list) {
        this.downloadInfoBuilder.LJJJZ = list;
        return this;
    }

    public DownloadTask addDownloadCompleteHandler(InterfaceC84183X2d interfaceC84183X2d) {
        synchronized (this.downloadCompleteHandlers) {
            if (interfaceC84183X2d != null) {
                if (!this.downloadCompleteHandlers.contains(interfaceC84183X2d)) {
                    this.downloadCompleteHandlers.add(interfaceC84183X2d);
                    return this;
                }
            }
            return this;
        }
    }

    public DownloadTask addListenerToSameTask(boolean z) {
        this.downloadInfoBuilder.LJJJIL = z;
        return this;
    }

    public DownloadTask addTTNetCommonParam(boolean z) {
        this.downloadInfoBuilder.LJJJJZI = z;
        return this;
    }

    public void asyncDownload(X5O x5o) {
        ((IDownloadComponentManagerService) X41.LIZ(IDownloadComponentManagerService.class)).submitSingleTask(new ARunnableS34S0200000_15(x5o, this, 13));
    }

    public DownloadTask autoRemoveCallback(boolean z) {
        this.autoRemoveCallback = z;
        return this;
    }

    public DownloadTask autoResumed(boolean z) {
        this.downloadInfoBuilder.LJIL = z;
        return this;
    }

    public DownloadTask autoSetHashCodeForSameTask(boolean z) {
        this.autoSetHashCodeForSameTask = z;
        return this;
    }

    public DownloadTask backUpUrlRetryCount(int i) {
        this.downloadInfoBuilder.LJIIL = i;
        return this;
    }

    public DownloadTask backUpUrls(List<String> list) {
        this.downloadInfoBuilder.LJIIZILJ = list;
        return this;
    }

    public void copyInterfaceFromNewTask(DownloadTask downloadTask) {
        this.singleListenerMap.clear();
        this.singleListenerMap.putAll(downloadTask.singleListenerMap);
        synchronized (this.mainThreadListeners) {
            this.mainThreadListeners.clear();
            addAll(downloadTask.mainThreadListeners, this.mainThreadListeners);
        }
        synchronized (this.subThreadListeners) {
            this.subThreadListeners.clear();
            addAll(downloadTask.subThreadListeners, this.subThreadListeners);
        }
        synchronized (this.notificationListeners) {
            this.notificationListeners.clear();
            addAll(downloadTask.notificationListeners, this.notificationListeners);
        }
        this.notificationEventListener = downloadTask.notificationEventListener;
        this.interceptor = downloadTask.interceptor;
        this.depend = downloadTask.depend;
        this.monitorDepend = downloadTask.monitorDepend;
        this.forbiddenHandler = downloadTask.forbiddenHandler;
        this.diskSpaceHandler = downloadTask.diskSpaceHandler;
        this.retryDelayTimeCalculator = downloadTask.retryDelayTimeCalculator;
        this.notificationClickCallback = downloadTask.notificationClickCallback;
        this.fileUriProvider = downloadTask.fileUriProvider;
        synchronized (this.downloadCompleteHandlers) {
            this.downloadCompleteHandlers.clear();
            this.downloadCompleteHandlers.addAll(downloadTask.downloadCompleteHandlers);
        }
    }

    public void copyListenerFromPendingTask(DownloadTask downloadTask) {
        for (Map.Entry<EnumC84256X4y, IDownloadListener> entry : downloadTask.singleListenerMap.entrySet()) {
            if (entry != null && !this.singleListenerMap.containsKey(entry.getKey())) {
                this.singleListenerMap.put(entry.getKey(), entry.getValue());
            }
        }
        try {
            if (downloadTask.mainThreadListeners.size() != 0) {
                synchronized (this.mainThreadListeners) {
                    removeAll(this.mainThreadListeners, downloadTask.mainThreadListeners);
                    addAll(downloadTask.mainThreadListeners, this.mainThreadListeners);
                }
            }
            if (downloadTask.subThreadListeners.size() != 0) {
                synchronized (this.subThreadListeners) {
                    removeAll(this.subThreadListeners, downloadTask.subThreadListeners);
                    addAll(downloadTask.subThreadListeners, this.subThreadListeners);
                }
            }
            if (downloadTask.notificationListeners.size() != 0) {
                synchronized (this.notificationListeners) {
                    removeAll(this.notificationListeners, downloadTask.notificationListeners);
                    addAll(downloadTask.notificationListeners, this.notificationListeners);
                }
            }
        } catch (Throwable unused) {
        }
    }

    public DownloadTask deleteCacheIfCheckFailed(boolean z) {
        this.downloadInfoBuilder.LJJJJLL = z;
        return this;
    }

    public DownloadTask depend(IDownloadDepend iDownloadDepend) {
        this.depend = iDownloadDepend;
        return this;
    }

    public DownloadTask diskSpaceHandler(X21 x21) {
        this.diskSpaceHandler = x21;
        return this;
    }

    public DownloadTask distinctDirectory(boolean z) {
        this.downloadInfoBuilder.LJJJLIIL = z;
        return this;
    }

    public DownloadTask downloadSetting(JSONObject jSONObject) {
        this.downloadInfoBuilder.LJJJJ = jSONObject;
        return this;
    }

    public DownloadTask endOffset(long j) {
        this.downloadInfoBuilder.LJJIL = j;
        return this;
    }

    public DownloadTask enqueueType(VFA vfa) {
        this.downloadInfoBuilder.LJJIJ = vfa;
        return this;
    }

    public DownloadTask executorGroup(int i) {
        this.downloadInfoBuilder.LJJJJJL = i;
        return this;
    }

    public DownloadTask expectFileLength(long j) {
        this.downloadInfoBuilder.LJJIII = j;
        return this;
    }

    public DownloadTask expiredHttpCheck(boolean z) {
        this.downloadInfoBuilder.LJJJJLI = z;
        return this;
    }

    public DownloadTask expiredRedownload(boolean z) {
        this.downloadInfoBuilder.LJJJJL = z;
        return this;
    }

    public DownloadTask extra(String str) {
        this.downloadInfoBuilder.LJI = str;
        return this;
    }

    public DownloadTask extraHeaders(List<HttpHeader> list) {
        this.downloadInfoBuilder.LJII = list;
        return this;
    }

    public DownloadTask extraMonitorStatus(int[] iArr) {
        this.downloadInfoBuilder.LJJJJJ = iArr;
        return this;
    }

    public DownloadTask fileUriProvider(X2C x2c) {
        this.fileUriProvider = x2c;
        return this;
    }

    public DownloadTask forbiddenHandler(X1C x1c) {
        this.forbiddenHandler = x1c;
        return this;
    }

    public DownloadTask force(boolean z) {
        this.downloadInfoBuilder.LJIILIIL = z;
        return this;
    }

    public InterfaceC84183X2d getDownloadCompleteHandlerByIndex(int i) {
        synchronized (this.downloadCompleteHandlers) {
            if (i < this.downloadCompleteHandlers.size()) {
                return this.downloadCompleteHandlers.get(i);
            }
            return null;
        }
    }

    public int getDownloadListenerSize(EnumC84256X4y enumC84256X4y) {
        int size;
        SparseArray<IDownloadListener> downloadListeners = getDownloadListeners(enumC84256X4y);
        if (downloadListeners == null) {
            return 0;
        }
        synchronized (downloadListeners) {
            size = downloadListeners.size();
        }
        return size;
    }

    public SparseArray<IDownloadListener> getDownloadListeners(EnumC84256X4y enumC84256X4y) {
        if (enumC84256X4y == EnumC84256X4y.MAIN) {
            return this.mainThreadListeners;
        }
        if (enumC84256X4y == EnumC84256X4y.SUB) {
            return this.subThreadListeners;
        }
        if (enumC84256X4y == EnumC84256X4y.NOTIFICATION) {
            return this.notificationListeners;
        }
        return null;
    }

    public IDownloadListener getSingleDownloadListener(EnumC84256X4y enumC84256X4y) {
        return this.singleListenerMap.get(enumC84256X4y);
    }

    public DownloadTask hashCodeForSameTask(int i) {
        this.hashCodeForSameTask = i;
        return this;
    }

    public DownloadTask headConnectionAvailable(boolean z) {
        this.downloadInfoBuilder.LJJIJIIJI = z;
        return this;
    }

    public DownloadTask iconUrl(String str) {
        this.downloadInfoBuilder.LJJIJIL = str;
        return this;
    }

    public DownloadTask ignoreDataVerify(boolean z) {
        this.downloadInfoBuilder.LJJIJIIJIL = z;
        return this;
    }

    public DownloadTask ignoreInterceptor(boolean z) {
        this.downloadInfoBuilder.LJJJLZIJ = z;
        return this;
    }

    public DownloadTask interceptor(InterfaceC84169X1p interfaceC84169X1p) {
        this.interceptor = interfaceC84169X1p;
        return this;
    }

    public DownloadTask isOpenLimitSpeed(boolean z) {
        this.downloadInfoBuilder.LJJJI = z;
        return this;
    }

    public DownloadTask mainThreadListener(IDownloadListener iDownloadListener) {
        if (iDownloadListener == null) {
            return this;
        }
        mainThreadListenerWithHashCode(iDownloadListener.hashCode(), iDownloadListener);
        return this;
    }

    public DownloadTask maxBytes(int i) {
        this.downloadInfoBuilder.LJIIIIZZ = i;
        return this;
    }

    public DownloadTask maxProgressCount(int i) {
        this.downloadInfoBuilder.LJIILL = i;
        return this;
    }

    public DownloadTask md5(String str) {
        this.downloadInfoBuilder.LJJII = str;
        return this;
    }

    public DownloadTask mimeType(String str) {
        this.downloadInfoBuilder.LJIJJ = str;
        return this;
    }

    public DownloadTask minProgressTimeMsInterval(int i) {
        this.downloadInfoBuilder.LJIILLIIL = i;
        return this;
    }

    public DownloadTask monitorDepend(InterfaceC84194X2o interfaceC84194X2o) {
        this.monitorDepend = interfaceC84194X2o;
        return this;
    }

    public DownloadTask monitorScene(String str) {
        this.downloadInfoBuilder.LJJJJIZL = str;
        return this;
    }

    public DownloadTask name(String str) {
        this.downloadInfoBuilder.LIZ = str;
        return this;
    }

    public DownloadTask needDefaultHttpServiceBackUp(boolean z) {
        this.downloadInfoBuilder.LJJI = z;
        return this;
    }

    public DownloadTask needHttpsToHttpRetry(boolean z) {
        this.downloadInfoBuilder.LJIJJLI = z;
        return this;
    }

    public DownloadTask needIndependentProcess(boolean z) {
        this.downloadInfoBuilder.LJJIIZI = z;
        return this;
    }

    public DownloadTask needPostProgress(boolean z) {
        this.downloadInfoBuilder.LJIILJJIL = z;
        return this;
    }

    public DownloadTask needRetryDelay(boolean z) {
        this.downloadInfoBuilder.LJJIIJ = z;
        return this;
    }

    public DownloadTask needReuseFirstConnection(boolean z) {
        this.downloadInfoBuilder.LJJIIZ = z;
        return this;
    }

    public DownloadTask needSDKMonitor(boolean z) {
        this.downloadInfoBuilder.LJJJJI = z;
        return this;
    }

    public DownloadTask notificationClickCallback(InterfaceC84186X2g interfaceC84186X2g) {
        this.notificationClickCallback = interfaceC84186X2g;
        return this;
    }

    public DownloadTask notificationEventListener(InterfaceC84187X2h interfaceC84187X2h) {
        this.notificationEventListener = interfaceC84187X2h;
        return this;
    }

    public DownloadTask notificationListener(IDownloadListener iDownloadListener) {
        if (iDownloadListener == null) {
            return this;
        }
        notificationListenerWithHashCode(iDownloadListener.hashCode(), iDownloadListener);
        return this;
    }

    public DownloadTask onlyWifi(boolean z) {
        this.downloadInfoBuilder.LJFF = z;
        return this;
    }

    public DownloadTask outIp(String[] strArr) {
        this.downloadInfoBuilder.LJIIIZ = strArr;
        return this;
    }

    public DownloadTask outSize(int[] iArr) {
        this.downloadInfoBuilder.LJIIJ = iArr;
        return this;
    }

    public DownloadTask packageName(String str) {
        this.downloadInfoBuilder.LJJIFFI = str;
        return this;
    }

    public DownloadTask retryCount(int i) {
        this.downloadInfoBuilder.LJIIJJI = i;
        return this;
    }

    public DownloadTask retryDelayTimeArray(String str) {
        this.downloadInfoBuilder.LJJIIJZLJL = str;
        return this;
    }

    public DownloadTask retryDelayTimeCalculator(X27 x27) {
        this.retryDelayTimeCalculator = x27;
        return this;
    }

    public DownloadTask savePath(String str) {
        this.downloadInfoBuilder.LIZLLL = str;
        return this;
    }

    public DownloadTask setAutoInstall(boolean z) {
        this.downloadInfoBuilder.LJIJI = z;
        return this;
    }

    public DownloadTask setDownloadCompleteHandlers(List<InterfaceC84183X2d> list) {
        if (list != null && !list.isEmpty()) {
            Iterator<InterfaceC84183X2d> it = list.iterator();
            while (it.hasNext()) {
                addDownloadCompleteHandler(it.next());
            }
        }
        return this;
    }

    public void setNeedDelayForCacheSync(boolean z) {
        this.needDelayForCacheSync = z;
    }

    public void setNotificationEventListener(InterfaceC84187X2h interfaceC84187X2h) {
        this.notificationEventListener = interfaceC84187X2h;
    }

    public DownloadTask showNotification(boolean z) {
        this.downloadInfoBuilder.LJIJ = z;
        return this;
    }

    public DownloadTask showNotificationForAutoResumed(boolean z) {
        this.downloadInfoBuilder.LJJ = z;
        return this;
    }

    public DownloadTask startOffset(long j) {
        X4W x4w = this.downloadInfoBuilder;
        if (j > 0) {
            x4w.LJJIJLIJ = j;
        } else {
            x4w.getClass();
        }
        return this;
    }

    public DownloadTask subThreadListener(IDownloadListener iDownloadListener) {
        if (iDownloadListener == null) {
            return this;
        }
        subThreadListenerWithHashCode(iDownloadListener.hashCode(), iDownloadListener);
        return this;
    }

    public DownloadTask taskKey(String str) {
        this.downloadInfoBuilder.LJJJLL = str;
        return this;
    }

    public DownloadTask tempPath(String str) {
        this.downloadInfoBuilder.LJ = str;
        return this;
    }

    public DownloadTask throttleNetSpeed(long j) {
        this.downloadInfoBuilder.LJJIZ = j;
        return this;
    }

    public DownloadTask throttleSmoothness(int i) {
        this.downloadInfoBuilder.LJJJ = i;
        return this;
    }

    public DownloadTask title(String str) {
        this.downloadInfoBuilder.LIZIZ = str;
        return this;
    }

    public DownloadTask ttnetProtectTimeout(long j) {
        this.downloadInfoBuilder.LJJJJZ = j;
        return this;
    }

    public DownloadTask url(String str) {
        this.downloadInfoBuilder.LIZJ = str;
        return this;
    }

    private void addAll(SparseArray sparseArray, SparseArray sparseArray2) {
        if (sparseArray == null || sparseArray2 == null) {
            return;
        }
        int size = sparseArray.size();
        for (int i = 0; i < size; i++) {
            int keyAt = sparseArray.keyAt(i);
            sparseArray2.put(keyAt, sparseArray.get(keyAt));
        }
    }

    private void copyListeners(SparseArray<IDownloadListener> sparseArray, SparseArray<IDownloadListener> sparseArray2) {
        sparseArray.clear();
        for (int i = 0; i < sparseArray2.size(); i++) {
            int keyAt = sparseArray2.keyAt(i);
            IDownloadListener iDownloadListener = sparseArray2.get(keyAt);
            if (iDownloadListener != null) {
                sparseArray.put(keyAt, iDownloadListener);
            }
        }
    }

    private void removeAll(SparseArray sparseArray, SparseArray sparseArray2) {
        if (sparseArray == null || sparseArray2 == null) {
            return;
        }
        int size = sparseArray2.size();
        for (int i = 0; i < size; i++) {
            sparseArray.remove(sparseArray2.keyAt(i));
        }
    }

    public IDownloadListener getDownloadListenerByIndex(EnumC84256X4y enumC84256X4y, int i) {
        SparseArray<IDownloadListener> downloadListeners = getDownloadListeners(enumC84256X4y);
        if (downloadListeners == null || i < 0) {
            return null;
        }
        synchronized (downloadListeners) {
            if (i >= downloadListeners.size()) {
                return null;
            }
            return downloadListeners.get(downloadListeners.keyAt(i));
        }
    }

    public DownloadTask mainThreadListenerWithHashCode(int i, IDownloadListener iDownloadListener) {
        if (iDownloadListener != null) {
            synchronized (this.mainThreadListeners) {
                this.mainThreadListeners.put(i, iDownloadListener);
            }
            Map<EnumC84256X4y, IDownloadListener> map = this.singleListenerMap;
            EnumC84256X4y enumC84256X4y = EnumC84256X4y.MAIN;
            map.put(enumC84256X4y, iDownloadListener);
            synchronized (this.singleListenerHashCodeMap) {
                this.singleListenerHashCodeMap.put(i, enumC84256X4y);
            }
        }
        return this;
    }

    public DownloadTask notificationListenerWithHashCode(int i, IDownloadListener iDownloadListener) {
        if (iDownloadListener != null) {
            synchronized (this.notificationListeners) {
                this.notificationListeners.put(i, iDownloadListener);
            }
            Map<EnumC84256X4y, IDownloadListener> map = this.singleListenerMap;
            EnumC84256X4y enumC84256X4y = EnumC84256X4y.NOTIFICATION;
            map.put(enumC84256X4y, iDownloadListener);
            synchronized (this.singleListenerHashCodeMap) {
                this.singleListenerHashCodeMap.put(i, enumC84256X4y);
            }
        }
        return this;
    }

    public void removeCallback(EnumC84256X4y enumC84256X4y, IDownloadListener iDownloadListener) {
        int hashCode;
        if (!this.autoRemoveCallback || enumC84256X4y == EnumC84256X4y.NONE) {
            return;
        }
        if (C65210PiY.LIZ()) {
            int id = this.downloadInfo.getId();
            StringBuilder LIZ = X1D.LIZ();
            LIZ.append("ListenerType:");
            LIZ.append(enumC84256X4y);
            LIZ.append(" listener:");
            LIZ.append(iDownloadListener);
            C65210PiY.LIZLLL(id, "DownloadTask", "removeCallback", X1D.LIZIZ(LIZ));
        }
        if (iDownloadListener == null) {
            hashCode = 0;
        } else {
            hashCode = iDownloadListener.hashCode();
        }
        removeDownloadListener(hashCode, iDownloadListener, enumC84256X4y, false);
    }

    public void setDownloadListeners(SparseArray<IDownloadListener> sparseArray, EnumC84256X4y enumC84256X4y) {
        if (sparseArray == null) {
            return;
        }
        try {
            if (enumC84256X4y == EnumC84256X4y.MAIN) {
                synchronized (this.mainThreadListeners) {
                    copyListeners(this.mainThreadListeners, sparseArray);
                }
            } else if (enumC84256X4y == EnumC84256X4y.SUB) {
                synchronized (this.subThreadListeners) {
                    copyListeners(this.subThreadListeners, sparseArray);
                }
            } else if (enumC84256X4y == EnumC84256X4y.NOTIFICATION) {
                synchronized (this.notificationListeners) {
                    copyListeners(this.notificationListeners, sparseArray);
                }
            }
        } catch (Throwable unused) {
        }
    }

    public DownloadTask subThreadListenerWithHashCode(int i, IDownloadListener iDownloadListener) {
        if (iDownloadListener != null) {
            synchronized (this.subThreadListeners) {
                this.subThreadListeners.put(i, iDownloadListener);
            }
            Map<EnumC84256X4y, IDownloadListener> map = this.singleListenerMap;
            EnumC84256X4y enumC84256X4y = EnumC84256X4y.SUB;
            map.put(enumC84256X4y, iDownloadListener);
            synchronized (this.singleListenerHashCodeMap) {
                this.singleListenerHashCodeMap.put(i, enumC84256X4y);
            }
        }
        return this;
    }

    public void addDownloadListener(int i, IDownloadListener iDownloadListener, EnumC84256X4y enumC84256X4y, boolean z) {
        Map<EnumC84256X4y, IDownloadListener> map;
        if (iDownloadListener == null) {
            return;
        }
        if (z && (map = this.singleListenerMap) != null) {
            map.put(enumC84256X4y, iDownloadListener);
            synchronized (this.singleListenerHashCodeMap) {
                this.singleListenerHashCodeMap.put(i, enumC84256X4y);
            }
        }
        SparseArray<IDownloadListener> downloadListeners = getDownloadListeners(enumC84256X4y);
        if (downloadListeners == null) {
            return;
        }
        synchronized (downloadListeners) {
            downloadListeners.put(i, iDownloadListener);
        }
    }

    public void removeDownloadListener(int i, IDownloadListener iDownloadListener, EnumC84256X4y enumC84256X4y, boolean z) {
        int indexOfValue;
        SparseArray<IDownloadListener> downloadListeners = getDownloadListeners(enumC84256X4y);
        if (downloadListeners == null) {
            if (z && this.singleListenerMap.containsKey(enumC84256X4y)) {
                this.singleListenerMap.remove(enumC84256X4y);
                return;
            }
            return;
        }
        synchronized (downloadListeners) {
            if (z) {
                if (this.singleListenerMap.containsKey(enumC84256X4y)) {
                    iDownloadListener = this.singleListenerMap.get(enumC84256X4y);
                    this.singleListenerMap.remove(enumC84256X4y);
                }
                if (iDownloadListener != null && (indexOfValue = downloadListeners.indexOfValue(iDownloadListener)) >= 0 && indexOfValue < downloadListeners.size()) {
                    downloadListeners.removeAt(indexOfValue);
                }
            } else {
                downloadListeners.remove(i);
                synchronized (this.singleListenerHashCodeMap) {
                    EnumC84256X4y enumC84256X4y2 = this.singleListenerHashCodeMap.get(i);
                    if (enumC84256X4y2 != null && this.singleListenerMap.containsKey(enumC84256X4y2)) {
                        this.singleListenerMap.remove(enumC84256X4y2);
                        this.singleListenerHashCodeMap.remove(i);
                    }
                }
            }
        }
    }
}
