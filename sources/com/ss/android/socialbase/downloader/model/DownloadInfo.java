package com.ss.android.socialbase.downloader.model;

import X.C132805Jc;
import X.C16880lQ;
import X.C47261Igj;
import X.C65210PiY;
import X.C77800Ug8;
import X.C84238X4g;
import X.C84246X4o;
import X.C84248X4q;
import X.EnumC84255X4x;
import X.EnumC84257X4z;
import X.F9J;
import X.Q89;
import X.V10;
import X.VFA;
import X.VLG;
import X.X1D;
import X.X40;
import X.X41;
import X.X4H;
import X.X4Q;
import X.X4W;
import Y.IDCreatorS57S0000000_15;
import android.content.Context;
import android.content.pm.PackageInfo;
import android.database.Cursor;
import android.database.sqlite.SQLiteStatement;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.SystemClock;
import android.text.TextUtils;
import com.bytedance.android.livesdk.livesetting.linkmic.LivesdkLinkmicFloatWindowOptimizeSetting;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.ss.android.socialbase.downloader.downloader.Downloader;
import com.ss.android.socialbase.downloader.exception.BaseException;
import com.ss.android.socialbase.downloader.service.IDownloadComponentManagerService;
import com.ss.android.socialbase.downloader.service.IDownloadIdGeneratorService;
import com.ss.android.socialbase.downloader.service.IDownloadProcessDispatcherService;
import java.io.File;
import java.lang.ref.SoftReference;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.UUID;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicLong;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes16.dex */
public class DownloadInfo implements Parcelable {
    public static final Parcelable.Creator<DownloadInfo> CREATOR = new IDCreatorS57S0000000_15(5);
    public List<String> accessHttpHeaderKeys;
    public boolean addListenerToSameTask;
    public boolean addTTNetCommonParam;
    public AtomicLong allConnectTime;
    public int appVersionCode;
    public EnumC84255X4x asyncHandleStatus;
    public boolean autoResumed;
    public int backUpUrlRetryCount;
    public boolean backUpUrlUsed;
    public List<String> backUpUrls;
    public String backUpUrlsStr;
    public int bindValueCount;
    public VLG byteInvalidRetryStatus;
    public int chunkCount;
    public int curBackUpUrlIndex;
    public AtomicLong curBytes;
    public int curNetworkRetryCount;
    public int curRetryTime;
    public JSONObject dbJsonData;
    public String dbJsonDataString;
    public boolean deleteCacheIfCheckFailed;
    public long downloadFinishTimeStamp;
    public long downloadStartTimeStamp;
    public long downloadTime;
    public String eTag;
    public VFA enqueueType;
    public StringBuffer errorBytesLog;
    public boolean expiredHttpCheck;
    public boolean expiredRedownload;
    public String extra;
    public List<HttpHeader> extraHeaders;
    public int[] extraMonitorStatus;
    public BaseException failedException;
    public String filePackageName;
    public List<String> forbiddenBackupUrls;
    public boolean force;
    public boolean forceIgnoreRecommendSize;
    public boolean hasDoInstallation;
    public boolean headConnectionAvailable;
    public String headConnectionException;
    public Map<String, String> httpHeaders;
    public int httpStatusCode;
    public String httpStatusMessage;
    public boolean httpsToHttpRetryUsed;
    public String iconUrl;
    public int id;
    public boolean ignoreDataVerify;
    public Boolean ignoreInterceptor;
    public long installedTimeStamp;
    public int interceptFlag;
    public Boolean isAutoInstallWithoutNotification;
    public boolean isCacheExistsInDownloading;
    public boolean isFirstDownload;
    public boolean isFirstSuccess;
    public boolean isForbiddenRetryed;
    public volatile boolean isSaveTempFile;
    public AtomicLong lastNotifyProgressTime;
    public boolean mDownloadFromReserveWifi;
    public int maxBytes;
    public int maxProgressCount;
    public String md5;
    public String mimeType;
    public int minProgressTimeMsInterval;
    public String monitorScene;
    public String name;
    public boolean needDefaultHttpServiceBackUp;
    public boolean needHttpsToHttpRetry;
    public boolean needIndependentProcess;
    public boolean needPostProgress;
    public boolean needRetryDelay;
    public boolean needReuseFirstConnection;
    public boolean needSDKMonitor;
    public String networkQuality;
    public int notificationVisibility;
    public boolean onlyWifi;
    public boolean openLimitSpeed;
    public String[] outIp;
    public int[] outSize;
    public SoftReference<PackageInfo> packageInfoRef;
    public String packageName;
    public long realDownloadTime;
    public long realStartDownloadTime;
    public int retryCount;
    public EnumC84257X4z retryDelayStatus;
    public String retryDelayTimeArray;
    public int retryScheduleMinutes;
    public String savePath;
    public boolean showNotification;
    public boolean showNotificationForAutoResumed;
    public boolean showNotificationForNetworkResumed;
    public JSONObject spData;
    public long startDownloadTime;
    public AtomicInteger status;
    public int statusAtDbInit;
    public boolean successByCache;
    public boolean supportPartial;
    public String taskId;
    public ConcurrentHashMap<String, Object> tempCacheData;
    public String tempPath;
    public long throttleNetSpeed;
    public int throttleSmoothness;
    public String title;
    public long totalBytes;
    public long ttnetProtectTimeout;
    public String url;
    public long xTotalBytes;

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean isChunkDowngradeRetryUsed() {
        return false;
    }

    public boolean isDownloaded() {
        return X4Q.LJIJ(this, isForce(), getMd5());
    }

    public boolean isNeedChunkDowngradeRetry() {
        return false;
    }

    public boolean isNeedRetryDelay() {
        return false;
    }

    public boolean isNeedReuseChunkRunnable() {
        return false;
    }

    public void setDeleteCacheIfCheckFailed() {
        this.deleteCacheIfCheckFailed = true;
    }

    public void setForbiddenRetryed() {
        this.isForbiddenRetryed = true;
    }

    private void ensureDBJsonData() {
        if (this.dbJsonData == null) {
            synchronized (this) {
                if (this.dbJsonData == null) {
                    try {
                        if (!TextUtils.isEmpty(this.dbJsonDataString)) {
                            this.dbJsonData = new JSONObject(this.dbJsonDataString);
                            this.dbJsonDataString = null;
                        } else {
                            this.dbJsonData = new JSONObject();
                        }
                    } catch (Throwable unused) {
                        this.dbJsonData = new JSONObject();
                    }
                }
            }
        }
    }

    private void ensureSpData() {
        if (this.spData == null) {
            Context appContext = ((IDownloadComponentManagerService) X41.LIZ(IDownloadComponentManagerService.class)).getAppContext();
            if (appContext != null) {
                String string = F9J.LIZIZ(appContext, 0, "sp_download_info").getString(Long.toString(getId()), "");
                if (!TextUtils.isEmpty(string)) {
                    try {
                        this.spData = new JSONObject(string);
                    } catch (JSONException e) {
                        C16880lQ.LLLLIIL(e);
                    }
                }
            }
            if (this.spData == null) {
                this.spData = new JSONObject();
            }
        }
    }

    private void ensureTempCacheData() {
        if (this.tempCacheData == null) {
            synchronized (this) {
                if (this.tempCacheData == null) {
                    this.tempCacheData = new ConcurrentHashMap<>();
                }
            }
        }
    }

    private void putMonitorSetting() {
        safePutToDBJsonData("need_sdk_monitor", Boolean.valueOf(this.needSDKMonitor));
        safePutToDBJsonData("monitor_scene", this.monitorScene);
        try {
            JSONArray jSONArray = new JSONArray();
            int[] iArr = this.extraMonitorStatus;
            if (iArr != null && iArr.length > 0) {
                int i = 0;
                while (true) {
                    int[] iArr2 = this.extraMonitorStatus;
                    if (i >= iArr2.length) {
                        break;
                    }
                    jSONArray.put(iArr2[i]);
                    i++;
                }
            }
            safePutToDBJsonData("extra_monitor_status", jSONArray);
        } catch (Throwable unused) {
        }
    }

    public boolean canNotifyProgress() {
        long j = this.lastNotifyProgressTime.get();
        if (j == 0 || SystemClock.uptimeMillis() - j > 20) {
            return true;
        }
        return false;
    }

    public boolean canReplaceHttpForRetry() {
        if (!TextUtils.isEmpty(this.url) && this.url.startsWith("https") && this.needHttpsToHttpRetry && !this.httpsToHttpRetryUsed) {
            return true;
        }
        return false;
    }

    public boolean canShowNotification() {
        if (this.autoResumed ? !(this.showNotificationForAutoResumed || this.showNotificationForNetworkResumed) : !this.showNotification) {
            return false;
        }
        return true;
    }

    public int checkMd5Status() {
        return X4Q.LIZIZ(new C84238X4g(getSavePath(), getName(), true, true), this.md5);
    }

    public void clearSpData() {
        Context appContext = ((IDownloadComponentManagerService) X41.LIZ(IDownloadComponentManagerService.class)).getAppContext();
        if (appContext != null) {
            try {
                F9J.LIZIZ(appContext, 0, "sp_download_info").edit().remove(Integer.toString(getId())).apply();
            } catch (Throwable unused) {
            }
        }
    }

    public void erase() {
        setCurBytes(0L, true);
        this.totalBytes = 0L;
        this.chunkCount = 1;
        this.downloadTime = 0L;
        this.realStartDownloadTime = 0L;
        this.realDownloadTime = 0L;
        this.curRetryTime = 0;
        this.isFirstDownload = true;
        this.isFirstSuccess = true;
        this.backUpUrlUsed = false;
        this.httpsToHttpRetryUsed = false;
        this.eTag = null;
        this.failedException = null;
        this.tempCacheData = null;
        this.packageInfoRef = null;
    }

    public void generateTaskId() {
        if (TextUtils.isEmpty(this.taskId)) {
            this.taskId = UUID.randomUUID().toString();
        }
    }

    public String getBackUpUrl() {
        List<String> list;
        int i;
        if (this.backUpUrlUsed && (list = this.backUpUrls) != null && list.size() > 0 && (i = this.curBackUpUrlIndex) >= 0 && i < this.backUpUrls.size()) {
            String str = (String) ListProtector.get(this.backUpUrls, this.curBackUpUrlIndex);
            if (!TextUtils.isEmpty(str)) {
                return str;
            }
        }
        return "";
    }

    public String getBackUpUrlsStr() {
        List<String> list;
        if (this.backUpUrlsStr == null && (list = this.backUpUrls) != null && !list.isEmpty()) {
            try {
                JSONArray jSONArray = new JSONArray();
                for (String str : this.backUpUrls) {
                    if (!TextUtils.isEmpty(str)) {
                        jSONArray.put(str);
                    }
                }
                this.backUpUrlsStr = jSONArray.toString();
            } catch (Exception e) {
                C16880lQ.LLLLIIL(e);
            }
        }
        if (this.backUpUrlsStr == null) {
            this.backUpUrlsStr = "";
        }
        return this.backUpUrlsStr;
    }

    public String getConnectionUrl() {
        List<String> list;
        int i;
        List<String> list2;
        String str = this.url;
        if (getStatus() == 8 && (list2 = this.forbiddenBackupUrls) != null && !list2.isEmpty() && !this.backUpUrlUsed) {
            return (String) ListProtector.get(this.forbiddenBackupUrls, 0);
        }
        if (this.backUpUrlUsed && (list = this.backUpUrls) != null && list.size() > 0 && (i = this.curBackUpUrlIndex) >= 0 && i < this.backUpUrls.size()) {
            String str2 = (String) ListProtector.get(this.backUpUrls, this.curBackUpUrlIndex);
            if (TextUtils.isEmpty(str2)) {
                return str;
            }
            return str2;
        }
        if (TextUtils.isEmpty(this.url) || !this.url.startsWith("https") || !this.needHttpsToHttpRetry || !this.httpsToHttpRetryUsed) {
            return str;
        }
        return this.url.replaceFirst("https", "http");
    }

    public long getCurBytes() {
        AtomicLong atomicLong = this.curBytes;
        if (atomicLong != null) {
            return atomicLong.get();
        }
        return 0L;
    }

    public int getCurRetryTimeInTotal() {
        int i = this.curRetryTime;
        if (this.backUpUrlUsed) {
            int i2 = i + this.retryCount;
            int i3 = this.curBackUpUrlIndex;
            if (i3 > 0) {
                return i2 + (i3 * this.backUpUrlRetryCount);
            }
            return i2;
        }
        return i;
    }

    public String getDBJsonDataString() {
        String jSONObject;
        String str = this.dbJsonDataString;
        if (str != null) {
            return str;
        }
        ensureDBJsonData();
        synchronized (this.dbJsonData) {
            jSONObject = this.dbJsonData.toString();
            this.dbJsonDataString = jSONObject;
        }
        return jSONObject;
    }

    public int getDownloadProcess() {
        if (this.totalBytes <= 0) {
            return 0;
        }
        if (getCurBytes() > this.totalBytes) {
            return 100;
        }
        return (int) ((getCurBytes() * 100) / this.totalBytes);
    }

    public String getErrorBytesLog() {
        StringBuffer stringBuffer = this.errorBytesLog;
        if (stringBuffer == null || stringBuffer.length() == 0) {
            return "";
        }
        return this.errorBytesLog.toString();
    }

    public int getId() {
        if (this.id == 0) {
            this.id = ((IDownloadIdGeneratorService) X41.LIZ(IDownloadIdGeneratorService.class)).generate(this);
        }
        return this.id;
    }

    public int getMinProgressTimeMsInterval() {
        int i = this.minProgressTimeMsInterval;
        if (i < 1000) {
            return 1000;
        }
        return i;
    }

    public PackageInfo getPackageInfo() {
        SoftReference<PackageInfo> softReference = this.packageInfoRef;
        if (softReference == null) {
            return null;
        }
        return softReference.get();
    }

    public long getRealDownloadTime() {
        return TimeUnit.NANOSECONDS.toMillis(this.realDownloadTime);
    }

    public int getRealStatus() {
        AtomicInteger atomicInteger = this.status;
        if (atomicInteger != null) {
            return atomicInteger.get();
        }
        return 0;
    }

    public long getRetryScheduleMinutes() {
        return this.retryScheduleMinutes;
    }

    public int getStatus() {
        AtomicInteger atomicInteger = this.status;
        if (atomicInteger != null) {
            int i = atomicInteger.get();
            if (i == -5) {
                return -2;
            }
            return i;
        }
        return 0;
    }

    public String getTargetFilePath() {
        return X4Q.LJIILL(this.savePath, this.name);
    }

    public String getTempFilePath() {
        String LJIILL;
        String str = this.savePath;
        String str2 = this.tempPath;
        String str3 = this.name;
        if ((TextUtils.isEmpty(str) && TextUtils.isEmpty(str2)) || TextUtils.isEmpty(str3)) {
            return null;
        }
        if (!TextUtils.isEmpty(str2)) {
            LJIILL = X4Q.LJIILL(str2, str3);
        } else {
            LJIILL = X4Q.LJIILL(str, str3);
        }
        if (TextUtils.isEmpty(LJIILL)) {
            return null;
        }
        return C16880lQ.LLLZ("%s.tp", new Object[]{LJIILL});
    }

    public String getTempName() {
        String str = this.name;
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        return C16880lQ.LLLZ("%s.tp", new Object[]{str});
    }

    public String getTempPath() {
        String str = this.savePath;
        String str2 = this.tempPath;
        if (TextUtils.isEmpty(str) && TextUtils.isEmpty(str2)) {
            return null;
        }
        if (TextUtils.isEmpty(str2)) {
            return str;
        }
        return str2;
    }

    public String getTitle() {
        if (TextUtils.isEmpty(this.title)) {
            return this.name;
        }
        return this.title;
    }

    public int getTotalRetryCount() {
        int i = this.retryCount;
        List<String> list = this.backUpUrls;
        if (list != null && !list.isEmpty()) {
            return i + (this.backUpUrls.size() * this.backUpUrlRetryCount);
        }
        return i;
    }

    public boolean hasNextBackupUrl() {
        List<String> list = this.backUpUrls;
        if (list != null && list.size() > 0) {
            if (!this.backUpUrlUsed) {
                return true;
            }
            int i = this.curBackUpUrlIndex;
            if (i >= 0 && i < this.backUpUrls.size() - 1) {
                return true;
            }
        }
        return false;
    }

    public boolean isAutoInstallWithoutNotification() {
        if (this.isAutoInstallWithoutNotification == null) {
            if (!TextUtils.isEmpty(this.extra)) {
                try {
                    this.isAutoInstallWithoutNotification = Boolean.valueOf(new JSONObject(this.extra).optBoolean("auto_install_without_notification", false));
                } catch (JSONException unused) {
                    this.isAutoInstallWithoutNotification = Boolean.FALSE;
                }
            } else {
                this.isAutoInstallWithoutNotification = Boolean.FALSE;
            }
        }
        return this.isAutoInstallWithoutNotification.booleanValue();
    }

    public boolean isChunked() {
        if (this.totalBytes == -1) {
            return true;
        }
        return false;
    }

    public boolean isEntityInvalid() {
        if (TextUtils.isEmpty(this.url) || TextUtils.isEmpty(this.name) || TextUtils.isEmpty(this.savePath)) {
            return true;
        }
        return false;
    }

    public boolean isExpiredRedownload() {
        if (X4H.LJFF.LJIIIIZZ("force_close_download_cache_check", 0) == 1) {
            if (C65210PiY.LIZ()) {
                int i = this.id;
                StringBuilder LIZ = X1D.LIZ();
                LIZ.append("IsExpiredRedownload Force to false, reason(global setting) id=");
                LIZ.append(getId());
                LIZ.append(" name=");
                LIZ.append(getName());
                C65210PiY.LIZLLL(i, "DownloadInfo", "isExpiredRedownload", X1D.LIZIZ(LIZ));
            }
            return false;
        }
        return this.expiredRedownload;
    }

    public boolean isFirstDownload() {
        if (!this.isFirstDownload || TextUtils.isEmpty(getTempPath()) || TextUtils.isEmpty(getTempName())) {
            return false;
        }
        return !new File(getTempPath(), getTempName()).exists();
    }

    public boolean isIgnoreInterceptor() {
        if (this.ignoreInterceptor == null) {
            ensureDBJsonData();
            boolean z = false;
            if (this.dbJsonData.optInt("ignore_intercept", 0) == 1) {
                z = true;
            }
            this.ignoreInterceptor = Boolean.valueOf(z);
        }
        return this.ignoreInterceptor.booleanValue();
    }

    public boolean isPauseReserveWithWifiValid() {
        if (!this.mDownloadFromReserveWifi) {
            return true;
        }
        if (isPauseReserveOnWifi() && X4Q.LJJI(((IDownloadComponentManagerService) X41.LIZ(IDownloadComponentManagerService.class)).getAppContext())) {
            return true;
        }
        return false;
    }

    public boolean isWaitingWifiStatus() {
        BaseException baseException = this.failedException;
        if (baseException != null && baseException.getErrorCode() == 1013) {
            return true;
        }
        return false;
    }

    public void reset() {
        setCurBytes(0L, true);
        this.totalBytes = 0L;
        this.chunkCount = 1;
        this.downloadTime = 0L;
        this.realStartDownloadTime = 0L;
        this.realDownloadTime = 0L;
    }

    public void resetRealStartDownloadTime() {
        this.realStartDownloadTime = 0L;
    }

    public void setLastNotifyProgressTime() {
        this.lastNotifyProgressTime.set(SystemClock.uptimeMillis());
    }

    public boolean trySwitchToNextBackupUrl() {
        if (this.backUpUrlUsed) {
            this.curBackUpUrlIndex++;
        }
        List<String> list = this.backUpUrls;
        if (list != null && list.size() != 0 && this.curBackUpUrlIndex >= 0) {
            while (this.curBackUpUrlIndex < this.backUpUrls.size()) {
                if (!TextUtils.isEmpty((String) ListProtector.get(this.backUpUrls, this.curBackUpUrlIndex))) {
                    this.backUpUrlUsed = true;
                    return true;
                }
                this.curBackUpUrlIndex++;
            }
        }
        return false;
    }

    public void updateDownloadTime() {
        if (this.startDownloadTime == 0) {
            return;
        }
        long uptimeMillis = SystemClock.uptimeMillis() - this.startDownloadTime;
        if (this.downloadTime < 0) {
            this.downloadTime = 0L;
        }
        if (uptimeMillis > 0) {
            this.downloadTime = uptimeMillis;
        }
    }

    public void updateRealStartDownloadTime() {
        if (this.realStartDownloadTime == 0) {
            this.realStartDownloadTime = System.nanoTime();
        }
    }

    public void updateSpData() {
        Context appContext;
        if (this.spData != null && (appContext = ((IDownloadComponentManagerService) X41.LIZ(IDownloadComponentManagerService.class)).getAppContext()) != null) {
            F9J.LIZIZ(appContext, 0, "sp_download_info").edit().putString(Integer.toString(getId()), this.spData.toString()).apply();
        }
    }

    public DownloadInfo() {
        this.needDefaultHttpServiceBackUp = true;
        this.retryDelayStatus = EnumC84257X4z.DELAY_RETRY_NONE;
        this.asyncHandleStatus = EnumC84255X4x.ASYNC_HANDLE_NONE;
        this.supportPartial = true;
        this.needSDKMonitor = true;
        this.interceptFlag = -1;
        this.chunkCount = 1;
        this.isFirstDownload = true;
        this.isFirstSuccess = true;
        this.byteInvalidRetryStatus = VLG.BYTE_INVALID_RETRY_STATUS_NONE;
        this.enqueueType = VFA.ENQUEUE_NONE;
        this.lastNotifyProgressTime = new AtomicLong(0L);
        this.isAutoInstallWithoutNotification = null;
    }

    private int getReserveWifiStatus() {
        ensureSpData();
        try {
            return this.spData.optInt("pause_reserve_on_wifi", 0);
        } catch (Exception unused) {
            return 0;
        }
    }

    private void parseMonitorSetting() {
        ensureDBJsonData();
        this.needSDKMonitor = this.dbJsonData.optBoolean("need_sdk_monitor", false);
        this.monitorScene = this.dbJsonData.optString("monitor_scene", "");
        JSONArray optJSONArray = this.dbJsonData.optJSONArray("extra_monitor_status");
        if (optJSONArray != null && optJSONArray.length() > 0) {
            this.extraMonitorStatus = new int[optJSONArray.length()];
            for (int i = 0; i < optJSONArray.length(); i++) {
                this.extraMonitorStatus[i] = optJSONArray.optInt(i);
            }
        }
    }

    public boolean cacheExpierd() {
        if (!isDownloaded()) {
            return true;
        }
        return X4Q.LIZ(this, false);
    }

    public boolean canReStartAsyncTask() {
        if (getStatus() != -3 && this.asyncHandleStatus == EnumC84255X4x.ASYNC_HANDLE_WAITING) {
            return true;
        }
        return false;
    }

    public boolean canSkipStatusHandler() {
        EnumC84255X4x enumC84255X4x;
        int status = getStatus();
        if (status == 7 || this.retryDelayStatus == EnumC84257X4z.DELAY_RETRY_WAITING || status == 8 || (enumC84255X4x = this.asyncHandleStatus) == EnumC84255X4x.ASYNC_HANDLE_WAITING || enumC84255X4x == EnumC84255X4x.ASYNC_HANDLE_RESTART || this.byteInvalidRetryStatus == VLG.BYTE_INVALID_RETRY_STATUS_RESTART) {
            return true;
        }
        return false;
    }

    public boolean canStartRetryDelayTask() {
        if (isNeedRetryDelay() && getStatus() != -3 && this.retryDelayStatus == EnumC84257X4z.DELAY_RETRY_WAITING) {
            return true;
        }
        return false;
    }

    public void changeSkipStatus() {
        EnumC84255X4x enumC84255X4x;
        int status = getStatus();
        if (status == 7 || this.retryDelayStatus == EnumC84257X4z.DELAY_RETRY_WAITING) {
            setRetryDelayStatus(EnumC84257X4z.DELAY_RETRY_DOWNLOADING);
        }
        if (status == 8 || (enumC84255X4x = this.asyncHandleStatus) == EnumC84255X4x.ASYNC_HANDLE_WAITING || enumC84255X4x == EnumC84255X4x.ASYNC_HANDLE_RESTART) {
            setAsyncHandleStatus(EnumC84255X4x.ASYNC_HANDLE_DOWNLOADING);
        }
        if (this.byteInvalidRetryStatus == VLG.BYTE_INVALID_RETRY_STATUS_RESTART) {
            setByteInvalidRetryStatus(VLG.BYTE_INVALID_RETRY_STATUS_DOWNLOADING);
        }
    }

    public boolean checkMd5Valid() {
        String savePath = getSavePath();
        String name = getName();
        int LIZIZ = X4Q.LIZIZ(new C84238X4g(savePath, name, true, true), this.md5);
        if (LIZIZ == 0 || LIZIZ == 2) {
            return true;
        }
        return false;
    }

    public long getAllConnectTime() {
        ensureDBJsonData();
        if (this.allConnectTime == null) {
            this.allConnectTime = new AtomicLong(this.dbJsonData.optLong("dbjson_key_all_connect_time"));
        }
        return this.allConnectTime.get();
    }

    public String getCacheControl() {
        ensureSpData();
        try {
            return this.spData.optString("cache-control", null);
        } catch (Exception unused) {
            return null;
        }
    }

    public long getCacheExpiredTime() {
        ensureSpData();
        try {
            return this.spData.optLong("cache-control/expired_time", -1L);
        } catch (Exception unused) {
            return -1L;
        }
    }

    public long getDownloadPrepareTime() {
        ensureDBJsonData();
        return this.dbJsonData.optLong("dbjson_key_download_prepare_time");
    }

    public String getDownloadSettingString() {
        ensureDBJsonData();
        return this.dbJsonData.optString("download_setting");
    }

    public double getDownloadSpeed() {
        double curBytes = getCurBytes() / 1048576.0d;
        double realDownloadTime = getRealDownloadTime() / 1000.0d;
        if (curBytes > LivesdkLinkmicFloatWindowOptimizeSetting.CORNER_RADIUS_PX && realDownloadTime > LivesdkLinkmicFloatWindowOptimizeSetting.CORNER_RADIUS_PX) {
            return curBytes / realDownloadTime;
        }
        return -1.0d;
    }

    public long getEndOffset() {
        ensureDBJsonData();
        return this.dbJsonData.optLong("end_offset", -1L);
    }

    public int getExecutorGroup() {
        ensureDBJsonData();
        return this.dbJsonData.optInt("executor_group", 2);
    }

    public long getExpectFileLength() {
        ensureDBJsonData();
        return this.dbJsonData.optLong("dbjson_key_expect_file_length");
    }

    public int getFailedResumeCount() {
        ensureSpData();
        return this.spData.optInt("failed_resume_count", 0);
    }

    public long getFirstSpeedTime() {
        ensureDBJsonData();
        return this.dbJsonData.optLong("dbjson_key_first_speed_time");
    }

    public long getLastDownloadTime() {
        ensureDBJsonData();
        return this.dbJsonData.optLong("dbjson_last_start_download_time", 0L);
    }

    public long getLastFailedResumeTime() {
        ensureSpData();
        return this.spData.optLong("last_failed_resume_time", 0L);
    }

    public String getLastModified() {
        ensureSpData();
        try {
            return this.spData.optString("last-modified", null);
        } catch (Exception unused) {
            return null;
        }
    }

    public long getLastUninstallResumeTime() {
        ensureSpData();
        return this.spData.optLong("last_unins_resume_time", 0L);
    }

    public int getLinkMode() {
        ensureDBJsonData();
        return this.dbJsonData.optInt("link_mode");
    }

    public int getPausedResumeCount() {
        ensureSpData();
        return this.spData.optInt("paused_resume_count", 0);
    }

    public int getPreconnectLevel() {
        ensureDBJsonData();
        return this.dbJsonData.optInt("dbjson_key_preconnect_level", 0);
    }

    public String getRedirectPartialUrlResults() {
        ensureDBJsonData();
        return this.dbJsonData.optString("redirect_partial_url_results");
    }

    public int getRetryScheduleCount() {
        ensureDBJsonData();
        return this.dbJsonData.optInt("retry_schedule_count", 0);
    }

    public long getStartOffset() {
        ensureDBJsonData();
        return this.dbJsonData.optLong("start_offset");
    }

    public int getTTMd5CheckStatus() {
        ensureDBJsonData();
        return this.dbJsonData.optInt("ttmd5_check_status", -1);
    }

    public String getTaskKey() {
        ensureDBJsonData();
        return this.dbJsonData.optString("task_key");
    }

    public ConcurrentHashMap<String, Object> getTempCacheData() {
        ensureTempCacheData();
        return this.tempCacheData;
    }

    public int getUninstallResumeCount() {
        ensureSpData();
        return this.spData.optInt("unins_resume_count", 0);
    }

    public boolean hasPauseReservedOnWifi() {
        if ((getReserveWifiStatus() & 1) > 0) {
            return true;
        }
        return false;
    }

    public boolean isAutoInstall() {
        ensureDBJsonData();
        if (this.dbJsonData.optInt("auto_install", 1) == 1) {
            return true;
        }
        return false;
    }

    public boolean isCanResumeFromBreakPointStatus() {
        int status = getStatus();
        if (status == 4 || status == 3 || status == -1 || status == 5 || status == 8) {
            return true;
        }
        if ((status == 1 || status == 2) && getCurBytes() > 0) {
            return true;
        }
        return false;
    }

    public boolean isDownloadOverStatus() {
        int status = getStatus();
        if (status < 0 && status != -2 && status != -5) {
            return true;
        }
        return false;
    }

    public boolean isDownloadWithWifiValid() {
        if (!isOnlyWifi() || X4Q.LJJI(((IDownloadComponentManagerService) X41.LIZ(IDownloadComponentManagerService.class)).getAppContext())) {
            return true;
        }
        return false;
    }

    public boolean isDownloadingStatus() {
        return C47261Igj.LJJIIJZLJL(getStatus());
    }

    public boolean isFileDataExists() {
        if (isEntityInvalid()) {
            return false;
        }
        File file = new File(getTempPath(), getTempName());
        boolean exists = file.exists();
        boolean isDirectory = file.isDirectory();
        if (!exists || isDirectory) {
            return false;
        }
        return true;
    }

    public boolean isFileDataValid() {
        if (isEntityInvalid()) {
            return false;
        }
        File file = new File(getTempPath(), getTempName());
        boolean exists = file.exists();
        boolean isDirectory = file.isDirectory();
        if (exists && !isDirectory) {
            long length = file.length();
            long curBytes = getCurBytes();
            if (X4H.LJFF.LJI("fix_file_data_valid", false)) {
                if (curBytes > 0) {
                    long j = this.totalBytes;
                    if (j > 0 && this.chunkCount > 0 && length >= curBytes && length <= j) {
                        return true;
                    }
                }
                if (C65210PiY.LIZ()) {
                    int i = this.id;
                    StringBuilder LIZJ = V10.LIZJ("Cur = ", curBytes, ",totalBytes =");
                    LIZJ.append(this.totalBytes);
                    C65210PiY.LIZLLL(i, "DownloadInfo", "isFileDataValid", C132805Jc.LIZLLL(LIZJ, ",fileLength=", length, LIZJ));
                }
                return false;
            }
            if (length > 0 && curBytes > 0) {
                long j2 = this.totalBytes;
                if (j2 > 0 && this.chunkCount > 0 && length >= curBytes && length <= j2 && curBytes < j2) {
                    return true;
                }
            }
            if (C65210PiY.LIZ()) {
                int i2 = this.id;
                StringBuilder LIZJ2 = V10.LIZJ("Cur = ", curBytes, ",totalBytes =");
                LIZJ2.append(this.totalBytes);
                C65210PiY.LIZLLL(i2, "DownloadInfo", "isFileDataValid", C132805Jc.LIZLLL(LIZJ2, ",fileLength=", length, LIZJ2));
            }
        }
        return false;
    }

    public boolean isNewTask() {
        if (getStatus() == 0) {
            return true;
        }
        return false;
    }

    public boolean isPauseReserveOnWifi() {
        if ((getReserveWifiStatus() & 2) > 0) {
            return true;
        }
        return false;
    }

    public boolean isRwConcurrent() {
        ensureDBJsonData();
        if (this.dbJsonData.optInt("rw_concurrent", 0) != 1) {
            return false;
        }
        return true;
    }

    public boolean isSavePathRedirected() {
        ensureDBJsonData();
        return this.dbJsonData.optBoolean("is_save_path_redirected", false);
    }

    public void startPauseReserveOnWifi() {
        ensureSpData();
        try {
            this.spData.put("pause_reserve_on_wifi", 3);
            updateSpData();
        } catch (Exception unused) {
        }
    }

    public boolean statusInPause() {
        if (getRealStatus() == -2 || getRealStatus() == -5) {
            return true;
        }
        return false;
    }

    public void stopPauseReserveOnWifi() {
        ensureSpData();
        try {
            this.spData.put("pause_reserve_on_wifi", 1);
            updateSpData();
        } catch (Exception unused) {
        }
    }

    public String toString() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("DownloadInfo{id=");
        LIZ.append(this.id);
        LIZ.append(", name='");
        Q89.LIZIZ(LIZ, this.name, '\'', ", title='");
        Q89.LIZIZ(LIZ, this.title, '\'', ", url='");
        Q89.LIZIZ(LIZ, this.url, '\'', ", savePath='");
        return C77800Ug8.LIZJ(LIZ, this.savePath, '\'', '}', LIZ);
    }

    public void updateStartDownloadTime() {
        this.startDownloadTime = SystemClock.uptimeMillis();
        safePutToDBJsonData("dbjson_last_start_download_time", Long.valueOf(System.currentTimeMillis()));
    }

    public List<String> getAccessHttpHeaderKeys() {
        return this.accessHttpHeaderKeys;
    }

    public int getAppVersionCode() {
        return this.appVersionCode;
    }

    public EnumC84255X4x getAsyncHandleStatus() {
        return this.asyncHandleStatus;
    }

    public int getBackUpUrlRetryCount() {
        return this.backUpUrlRetryCount;
    }

    public List<String> getBackUpUrls() {
        return this.backUpUrls;
    }

    public int getBindValueCount() {
        return this.bindValueCount;
    }

    public VLG getByteInvalidRetryStatus() {
        return this.byteInvalidRetryStatus;
    }

    public int getChunkCount() {
        return this.chunkCount;
    }

    public int getCurBackUpUrlIndex() {
        return this.curBackUpUrlIndex;
    }

    public int getCurNetworkRetryCount() {
        return this.curNetworkRetryCount;
    }

    public int getCurRetryTime() {
        return this.curRetryTime;
    }

    public long getDownloadFinishTimeStamp() {
        return this.downloadFinishTimeStamp;
    }

    public long getDownloadStartTimeStamp() {
        return this.downloadStartTimeStamp;
    }

    public long getDownloadTime() {
        return this.downloadTime;
    }

    public VFA getEnqueueType() {
        return this.enqueueType;
    }

    public String getExtra() {
        return this.extra;
    }

    public List<HttpHeader> getExtraHeaders() {
        return this.extraHeaders;
    }

    public int[] getExtraMonitorStatus() {
        return this.extraMonitorStatus;
    }

    public BaseException getFailedException() {
        return this.failedException;
    }

    public String getFilePackageName() {
        return this.filePackageName;
    }

    public List<String> getForbiddenBackupUrls() {
        return this.forbiddenBackupUrls;
    }

    public String getHeadConnectionException() {
        return this.headConnectionException;
    }

    public Map<String, String> getHttpHeaders() {
        return this.httpHeaders;
    }

    public int getHttpStatusCode() {
        return this.httpStatusCode;
    }

    public String getHttpStatusMessage() {
        return this.httpStatusMessage;
    }

    public String getIconUrl() {
        return this.iconUrl;
    }

    public long getInstalledTimeStamp() {
        return this.installedTimeStamp;
    }

    public int getInterceptFlag() {
        return this.interceptFlag;
    }

    public boolean getIsFirstDownload() {
        return this.isFirstDownload;
    }

    public int getMaxBytes() {
        return this.maxBytes;
    }

    public int getMaxProgressCount() {
        return this.maxProgressCount;
    }

    public String getMd5() {
        return this.md5;
    }

    public String getMimeType() {
        return this.mimeType;
    }

    public String getMonitorScene() {
        return this.monitorScene;
    }

    public String getName() {
        return this.name;
    }

    public String getNetworkQuality() {
        return this.networkQuality;
    }

    public int getNotificationVisibility() {
        return this.notificationVisibility;
    }

    public boolean getOpenLimitSpeed() {
        return this.openLimitSpeed;
    }

    public String[] getOutIp() {
        return this.outIp;
    }

    public int[] getOutSize() {
        return this.outSize;
    }

    public String getPackageName() {
        return this.packageName;
    }

    public int getRawId() {
        return this.id;
    }

    public long getRawRealDownloadTime() {
        return this.realDownloadTime;
    }

    public String getRawTempPath() {
        return this.tempPath;
    }

    public String getRawTitle() {
        return this.title;
    }

    public int getRetryCount() {
        return this.retryCount;
    }

    public EnumC84257X4z getRetryDelayStatus() {
        return this.retryDelayStatus;
    }

    public String getRetryDelayTimeArray() {
        return this.retryDelayTimeArray;
    }

    public String getSavePath() {
        return this.savePath;
    }

    public int getStatusAtDbInit() {
        return this.statusAtDbInit;
    }

    public String getTaskId() {
        return this.taskId;
    }

    public long getThrottleNetSpeed() {
        return this.throttleNetSpeed;
    }

    public int getThrottleSmoothness() {
        return this.throttleSmoothness;
    }

    public long getTotalBytes() {
        return this.totalBytes;
    }

    public long getTtnetProtectTimeout() {
        return this.ttnetProtectTimeout;
    }

    public String getUrl() {
        return this.url;
    }

    public long getXTotalBytes() {
        return this.xTotalBytes;
    }

    public String geteTag() {
        return this.eTag;
    }

    public boolean isAddListenerToSameTask() {
        return this.addListenerToSameTask;
    }

    public boolean isAddTTNetCommonParam() {
        return this.addTTNetCommonParam;
    }

    public boolean isAutoResumed() {
        return this.autoResumed;
    }

    public boolean isBackUpUrlUsed() {
        return this.backUpUrlUsed;
    }

    public boolean isCacheExistsInDownloading() {
        return this.isCacheExistsInDownloading;
    }

    public boolean isDeleteCacheIfCheckFailed() {
        return this.deleteCacheIfCheckFailed;
    }

    public boolean isDownloadFromReserveWifi() {
        return this.mDownloadFromReserveWifi;
    }

    public boolean isExpiredHttpCheck() {
        return this.expiredHttpCheck;
    }

    public boolean isFirstSuccess() {
        return this.isFirstSuccess;
    }

    public boolean isForbiddenRetryed() {
        return this.isForbiddenRetryed;
    }

    public boolean isForce() {
        return this.force;
    }

    public boolean isForceIgnoreRecommendSize() {
        return this.forceIgnoreRecommendSize;
    }

    public boolean isHasDoInstallation() {
        return this.hasDoInstallation;
    }

    public boolean isHeadConnectionAvailable() {
        return this.headConnectionAvailable;
    }

    public boolean isHttpsToHttpRetryUsed() {
        return this.httpsToHttpRetryUsed;
    }

    public boolean isIgnoreDataVerify() {
        return this.ignoreDataVerify;
    }

    public boolean isNeedDefaultHttpServiceBackUp() {
        return this.needDefaultHttpServiceBackUp;
    }

    public boolean isNeedHttpsToHttpRetry() {
        return this.needHttpsToHttpRetry;
    }

    public boolean isNeedIndependentProcess() {
        return this.needIndependentProcess;
    }

    public boolean isNeedPostProgress() {
        return this.needPostProgress;
    }

    public boolean isNeedReuseFirstConnection() {
        return this.needReuseFirstConnection;
    }

    public boolean isNeedSDKMonitor() {
        return this.needSDKMonitor;
    }

    public boolean isOnlyWifi() {
        return this.onlyWifi;
    }

    public boolean isSaveTempFile() {
        return this.isSaveTempFile;
    }

    public boolean isShowNotification() {
        return this.showNotification;
    }

    public boolean isShowNotificationForAutoResumed() {
        return this.showNotificationForAutoResumed;
    }

    public boolean isShowNotificationForNetworkResumed() {
        return this.showNotificationForNetworkResumed;
    }

    public boolean isSuccessByCache() {
        return this.successByCache;
    }

    public boolean isSupportPartial() {
        return this.supportPartial;
    }

    public DownloadInfo(X4W x4w) {
        this.needDefaultHttpServiceBackUp = true;
        this.retryDelayStatus = EnumC84257X4z.DELAY_RETRY_NONE;
        this.asyncHandleStatus = EnumC84255X4x.ASYNC_HANDLE_NONE;
        this.supportPartial = true;
        this.needSDKMonitor = true;
        this.interceptFlag = -1;
        this.chunkCount = 1;
        this.isFirstDownload = true;
        this.isFirstSuccess = true;
        this.byteInvalidRetryStatus = VLG.BYTE_INVALID_RETRY_STATUS_NONE;
        this.enqueueType = VFA.ENQUEUE_NONE;
        this.lastNotifyProgressTime = new AtomicLong(0L);
        this.isAutoInstallWithoutNotification = null;
        if (x4w == null) {
            return;
        }
        this.name = x4w.LIZ;
        this.title = x4w.LIZIZ;
        this.url = x4w.LIZJ;
        String str = x4w.LIZLLL;
        if (TextUtils.isEmpty(str)) {
            try {
                str = C84246X4o.LIZ(Downloader.getInstance(((IDownloadComponentManagerService) X41.LIZ(IDownloadComponentManagerService.class)).getAppContext()).getGlobalSaveDir());
            } catch (Throwable unused) {
            }
        }
        this.savePath = str;
        this.tempPath = x4w.LJ;
        safePutToDBJsonData("task_key", x4w.LJJJLL);
        if (TextUtils.isEmpty(this.tempPath) && !C84246X4o.LIZIZ(str)) {
            this.tempPath = C84246X4o.LIZ(Downloader.getInstance(((IDownloadComponentManagerService) X41.LIZ(IDownloadComponentManagerService.class)).getAppContext()).getGlobalSaveTempDir());
        }
        if (x4w.LJJJLIIL && ((IDownloadProcessDispatcherService) X41.LIZ(IDownloadProcessDispatcherService.class)).getDownloadInfo(getId()) == null) {
            this.savePath = X4Q.LJII(this.savePath, this.url);
            this.tempPath = X4Q.LJII(this.tempPath, this.url);
        }
        this.status = new AtomicInteger(0);
        this.curBytes = new AtomicLong(0L);
        this.extra = x4w.LJI;
        this.onlyWifi = x4w.LJFF;
        this.extraHeaders = x4w.LJII;
        this.maxBytes = x4w.LJIIIIZZ;
        this.retryCount = x4w.LJIIJJI;
        this.backUpUrlRetryCount = x4w.LJIIL;
        this.force = x4w.LJIILIIL;
        this.outIp = x4w.LJIIIZ;
        this.outSize = x4w.LJIIJ;
        this.needPostProgress = x4w.LJIILJJIL;
        this.maxProgressCount = x4w.LJIILL;
        this.minProgressTimeMsInterval = x4w.LJIILLIIL;
        this.backUpUrls = x4w.LJIIZILJ;
        this.showNotification = x4w.LJIJ;
        this.mimeType = x4w.LJIJJ;
        this.needHttpsToHttpRetry = x4w.LJIJJLI;
        this.needRetryDelay = x4w.LJJIIJ;
        this.retryDelayTimeArray = x4w.LJJIIJZLJL;
        this.autoResumed = x4w.LJIL;
        this.showNotificationForAutoResumed = x4w.LJJ;
        this.needDefaultHttpServiceBackUp = x4w.LJJI;
        this.packageName = x4w.LJJIFFI;
        this.md5 = x4w.LJJII;
        this.needReuseFirstConnection = x4w.LJJIIZ;
        this.needIndependentProcess = x4w.LJJIIZI;
        this.enqueueType = x4w.LJJIJ;
        this.headConnectionAvailable = x4w.LJJIJIIJI;
        this.ignoreDataVerify = x4w.LJJIJIIJIL;
        this.addListenerToSameTask = x4w.LJJJIL;
        this.iconUrl = x4w.LJJIJIL;
        this.throttleNetSpeed = x4w.LJJIZ;
        this.throttleSmoothness = x4w.LJJJ;
        this.openLimitSpeed = x4w.LJJJI;
        getId();
        JSONObject jSONObject = x4w.LJJJJ;
        if (jSONObject != null) {
            int id = getId();
            if (jSONObject != X4H.LIZIZ() && !X4H.LJIIIZ) {
                X40<Integer, X4H> x40 = X4H.LJ;
                synchronized (x40) {
                    X4H x4h = X4H.LJIIJ;
                    if (x4h != null && x4h.LIZ == jSONObject) {
                        x4h.LIZLLL = id;
                    } else {
                        Iterator<X4H> it = x40.values().iterator();
                        while (true) {
                            if (it.hasNext()) {
                                x4h = it.next();
                                if (x4h.LIZ == jSONObject) {
                                    x4h.LIZLLL = id;
                                    break;
                                }
                            } else {
                                x4h = new X4H(jSONObject);
                                x4h.LIZLLL = id;
                                break;
                            }
                        }
                        X4H.LJIIJ = x4h;
                    }
                    X4H.LJ.put(Integer.valueOf(id), x4h);
                }
            }
            safePutToDBJsonData("download_setting", jSONObject.toString());
        }
        safePutToDBJsonData("dbjson_key_expect_file_length", Long.valueOf(x4w.LJJIII));
        safePutToDBJsonData("executor_group", Integer.valueOf(x4w.LJJJJJL));
        safePutToDBJsonData("auto_install", Integer.valueOf(x4w.LJIJI ? 1 : 0));
        this.needSDKMonitor = x4w.LJJJJI;
        this.monitorScene = x4w.LJJJJIZL;
        this.extraMonitorStatus = x4w.LJJJJJ;
        boolean z = x4w.LJJJJL;
        this.expiredRedownload = z;
        this.expiredHttpCheck = x4w.LJJJJLI;
        this.deleteCacheIfCheckFailed = x4w.LJJJJLL;
        this.ttnetProtectTimeout = x4w.LJJJJZ;
        this.addTTNetCommonParam = x4w.LJJJJZI;
        if (z && this.retryCount <= 0) {
            this.retryCount = 1;
        }
        Boolean valueOf = Boolean.valueOf(x4w.LJJJLZIJ);
        this.ignoreInterceptor = valueOf;
        if (valueOf.booleanValue() || ((IDownloadComponentManagerService) X41.LIZ(IDownloadComponentManagerService.class)).getDownloadInterceptor() == null) {
            this.interceptFlag = 0;
        }
        this.accessHttpHeaderKeys = x4w.LJJJZ;
        safePutToDBJsonData("ignore_intercept", Integer.valueOf(x4w.LJJJLZIJ ? 1 : 0));
        safePutToDBJsonData("start_offset", Long.valueOf(x4w.LJJIJLIJ));
        safePutToDBJsonData("end_offset", Long.valueOf(x4w.LJJIL));
        putMonitorSetting();
    }

    private void convertEnqueueType(int i) {
        VFA vfa = VFA.ENQUEUE_HEAD;
        if (i == vfa.ordinal()) {
            this.enqueueType = vfa;
            return;
        }
        VFA vfa2 = VFA.ENQUEUE_TAIL;
        if (i == vfa2.ordinal()) {
            this.enqueueType = vfa2;
        } else {
            this.enqueueType = VFA.ENQUEUE_NONE;
        }
    }

    private void convertRetryDelayStatus(int i) {
        EnumC84257X4z enumC84257X4z = EnumC84257X4z.DELAY_RETRY_WAITING;
        if (i == enumC84257X4z.ordinal()) {
            this.retryDelayStatus = enumC84257X4z;
            return;
        }
        EnumC84257X4z enumC84257X4z2 = EnumC84257X4z.DELAY_RETRY_DOWNLOADING;
        if (i == enumC84257X4z2.ordinal()) {
            this.retryDelayStatus = enumC84257X4z2;
            return;
        }
        EnumC84257X4z enumC84257X4z3 = EnumC84257X4z.DELAY_RETRY_DOWNLOADED;
        if (i == enumC84257X4z3.ordinal()) {
            this.retryDelayStatus = enumC84257X4z3;
        } else {
            this.retryDelayStatus = EnumC84257X4z.DELAY_RETRY_NONE;
        }
    }

    private JSONObject convertStrToJson(String str) {
        try {
            if (!TextUtils.isEmpty(str)) {
                return new JSONObject(str);
            }
            return null;
        } catch (Throwable unused) {
            return null;
        }
    }

    private void mergeAuxiliaryJSONObject(JSONObject jSONObject) {
        if (jSONObject == null) {
            return;
        }
        ensureDBJsonData();
        synchronized (this.dbJsonData) {
            try {
                Iterator<String> keys = jSONObject.keys();
                while (keys.hasNext()) {
                    String next = keys.next();
                    Object opt = jSONObject.opt(next);
                    if (!this.dbJsonData.has(next) && opt != null) {
                        this.dbJsonData.put(next, opt);
                    }
                }
            } catch (Exception unused) {
            }
            this.dbJsonDataString = null;
        }
        parseMonitorSetting();
    }

    /* JADX WARN: Multi-variable type inference failed */
    private void refreshBackupUrls(boolean z) {
        List<String> list = this.forbiddenBackupUrls;
        if (list != null && list.size() > z) {
            List<String> list2 = this.backUpUrls;
            if (list2 == null) {
                this.backUpUrls = new ArrayList();
            } else {
                list2.clear();
            }
            this.backUpUrlUsed = false;
            this.curBackUpUrlIndex = 0;
            for (int i = z; i < this.forbiddenBackupUrls.size(); i++) {
                this.backUpUrls.add(ListProtector.get(this.forbiddenBackupUrls, i));
            }
        }
    }

    private void setBackUpUrlsStr(String str) {
        if (TextUtils.isEmpty(str) || getStatus() == -3) {
            return;
        }
        this.backUpUrlsStr = str;
        try {
            JSONArray jSONArray = new JSONArray(str);
            if (jSONArray.length() <= 0) {
                return;
            }
            ArrayList arrayList = new ArrayList();
            for (int i = 0; i < jSONArray.length(); i++) {
                String optString = jSONArray.optString(i);
                if (!TextUtils.isEmpty(optString)) {
                    arrayList.add(optString);
                }
            }
            this.backUpUrls = arrayList;
        } catch (Exception e) {
            C16880lQ.LLLLIIL(e);
        }
    }

    public void bindValue(SQLiteStatement sQLiteStatement) {
        long j;
        long j2;
        long j3;
        long j4;
        long j5;
        long j6;
        long j7;
        long j8;
        long j9;
        if (sQLiteStatement == null) {
            return;
        }
        this.bindValueCount = 0;
        sQLiteStatement.clearBindings();
        int i = this.bindValueCount + 1;
        this.bindValueCount = i;
        sQLiteStatement.bindLong(i, this.id);
        int i2 = this.bindValueCount + 1;
        this.bindValueCount = i2;
        String str = this.url;
        String str2 = "";
        if (str == null) {
            str = "";
        }
        sQLiteStatement.bindString(i2, str);
        int i3 = this.bindValueCount + 1;
        this.bindValueCount = i3;
        String str3 = this.savePath;
        if (str3 == null) {
            str3 = "";
        }
        sQLiteStatement.bindString(i3, str3);
        int i4 = this.bindValueCount + 1;
        this.bindValueCount = i4;
        String str4 = this.tempPath;
        if (str4 == null) {
            str4 = "";
        }
        sQLiteStatement.bindString(i4, str4);
        int i5 = this.bindValueCount + 1;
        this.bindValueCount = i5;
        String str5 = this.name;
        if (str5 == null) {
            str5 = "";
        }
        sQLiteStatement.bindString(i5, str5);
        int i6 = this.bindValueCount + 1;
        this.bindValueCount = i6;
        sQLiteStatement.bindLong(i6, this.chunkCount);
        int i7 = this.bindValueCount + 1;
        this.bindValueCount = i7;
        sQLiteStatement.bindLong(i7, getStatus());
        int i8 = this.bindValueCount + 1;
        this.bindValueCount = i8;
        sQLiteStatement.bindLong(i8, getCurBytes());
        int i9 = this.bindValueCount + 1;
        this.bindValueCount = i9;
        sQLiteStatement.bindLong(i9, this.totalBytes);
        int i10 = this.bindValueCount + 1;
        this.bindValueCount = i10;
        String str6 = this.eTag;
        if (str6 == null) {
            str6 = "";
        }
        sQLiteStatement.bindString(i10, str6);
        int i11 = this.bindValueCount + 1;
        this.bindValueCount = i11;
        long j10 = 1;
        if (this.onlyWifi) {
            j = 1;
        } else {
            j = 0;
        }
        sQLiteStatement.bindLong(i11, j);
        int i12 = this.bindValueCount + 1;
        this.bindValueCount = i12;
        if (this.force) {
            j2 = 1;
        } else {
            j2 = 0;
        }
        sQLiteStatement.bindLong(i12, j2);
        int i13 = this.bindValueCount + 1;
        this.bindValueCount = i13;
        sQLiteStatement.bindLong(i13, this.retryCount);
        int i14 = this.bindValueCount + 1;
        this.bindValueCount = i14;
        String str7 = this.extra;
        if (str7 == null) {
            str7 = "";
        }
        sQLiteStatement.bindString(i14, str7);
        int i15 = this.bindValueCount + 1;
        this.bindValueCount = i15;
        String str8 = this.mimeType;
        if (str8 == null) {
            str8 = "";
        }
        sQLiteStatement.bindString(i15, str8);
        int i16 = this.bindValueCount + 1;
        this.bindValueCount = i16;
        String str9 = this.title;
        if (str9 == null) {
            str9 = "";
        }
        sQLiteStatement.bindString(i16, str9);
        int i17 = this.bindValueCount + 1;
        this.bindValueCount = i17;
        if (this.showNotification) {
            j3 = 1;
        } else {
            j3 = 0;
        }
        sQLiteStatement.bindLong(i17, j3);
        int i18 = this.bindValueCount + 1;
        this.bindValueCount = i18;
        sQLiteStatement.bindLong(i18, this.notificationVisibility);
        int i19 = this.bindValueCount + 1;
        this.bindValueCount = i19;
        if (this.isFirstDownload) {
            j4 = 1;
        } else {
            j4 = 0;
        }
        sQLiteStatement.bindLong(i19, j4);
        int i20 = this.bindValueCount + 1;
        this.bindValueCount = i20;
        if (this.isFirstSuccess) {
            j5 = 1;
        } else {
            j5 = 0;
        }
        sQLiteStatement.bindLong(i20, j5);
        int i21 = this.bindValueCount + 1;
        this.bindValueCount = i21;
        if (this.needHttpsToHttpRetry) {
            j6 = 1;
        } else {
            j6 = 0;
        }
        sQLiteStatement.bindLong(i21, j6);
        int i22 = this.bindValueCount + 1;
        this.bindValueCount = i22;
        sQLiteStatement.bindLong(i22, this.downloadTime);
        int i23 = this.bindValueCount + 1;
        this.bindValueCount = i23;
        String str10 = this.packageName;
        if (str10 == null) {
            str10 = "";
        }
        sQLiteStatement.bindString(i23, str10);
        int i24 = this.bindValueCount + 1;
        this.bindValueCount = i24;
        String str11 = this.md5;
        if (str11 == null) {
            str11 = "";
        }
        sQLiteStatement.bindString(i24, str11);
        int i25 = this.bindValueCount + 1;
        this.bindValueCount = i25;
        if (this.needRetryDelay) {
            j7 = 1;
        } else {
            j7 = 0;
        }
        sQLiteStatement.bindLong(i25, j7);
        int i26 = this.bindValueCount + 1;
        this.bindValueCount = i26;
        sQLiteStatement.bindLong(i26, this.curRetryTime);
        int i27 = this.bindValueCount + 1;
        this.bindValueCount = i27;
        sQLiteStatement.bindLong(i27, this.retryDelayStatus.ordinal());
        int i28 = this.bindValueCount + 1;
        this.bindValueCount = i28;
        if (this.needDefaultHttpServiceBackUp) {
            j8 = 1;
        } else {
            j8 = 0;
        }
        sQLiteStatement.bindLong(i28, j8);
        int i29 = this.bindValueCount + 1;
        this.bindValueCount = i29;
        sQLiteStatement.bindLong(i29, 0L);
        int i30 = this.bindValueCount + 1;
        this.bindValueCount = i30;
        String str12 = this.retryDelayTimeArray;
        if (str12 == null) {
            str12 = "";
        }
        sQLiteStatement.bindString(i30, str12);
        int i31 = this.bindValueCount + 1;
        this.bindValueCount = i31;
        sQLiteStatement.bindLong(i31, 0L);
        int i32 = this.bindValueCount + 1;
        this.bindValueCount = i32;
        sQLiteStatement.bindString(i32, getBackUpUrlsStr());
        int i33 = this.bindValueCount + 1;
        this.bindValueCount = i33;
        sQLiteStatement.bindLong(i33, this.backUpUrlRetryCount);
        int i34 = this.bindValueCount + 1;
        this.bindValueCount = i34;
        sQLiteStatement.bindLong(i34, this.realDownloadTime);
        int i35 = this.bindValueCount + 1;
        this.bindValueCount = i35;
        sQLiteStatement.bindLong(i35, this.retryScheduleMinutes);
        int i36 = this.bindValueCount + 1;
        this.bindValueCount = i36;
        if (this.needIndependentProcess) {
            j9 = 1;
        } else {
            j9 = 0;
        }
        sQLiteStatement.bindLong(i36, j9);
        int i37 = this.bindValueCount + 1;
        this.bindValueCount = i37;
        sQLiteStatement.bindString(i37, getDBJsonDataString());
        int i38 = this.bindValueCount + 1;
        this.bindValueCount = i38;
        String str13 = this.iconUrl;
        if (str13 == null) {
            str13 = "";
        }
        sQLiteStatement.bindString(i38, str13);
        int i39 = this.bindValueCount + 1;
        this.bindValueCount = i39;
        sQLiteStatement.bindLong(i39, this.appVersionCode);
        int i40 = this.bindValueCount + 1;
        this.bindValueCount = i40;
        String str14 = this.taskId;
        if (str14 != null) {
            str2 = str14;
        }
        sQLiteStatement.bindString(i40, str2);
        int i41 = this.bindValueCount + 1;
        this.bindValueCount = i41;
        sQLiteStatement.bindLong(i41, this.downloadStartTimeStamp);
        int i42 = this.bindValueCount + 1;
        this.bindValueCount = i42;
        sQLiteStatement.bindLong(i42, this.downloadFinishTimeStamp);
        int i43 = this.bindValueCount + 1;
        this.bindValueCount = i43;
        sQLiteStatement.bindLong(i43, this.installedTimeStamp);
        int i44 = this.bindValueCount + 1;
        this.bindValueCount = i44;
        if (!this.hasDoInstallation) {
            j10 = 0;
        }
        sQLiteStatement.bindLong(i44, j10);
    }

    public boolean equalsTask(DownloadInfo downloadInfo) {
        String str;
        String str2;
        if (downloadInfo == null || (str = this.url) == null || !str.equals(downloadInfo.getUrl()) || (str2 = this.savePath) == null || !str2.equals(downloadInfo.getSavePath())) {
            return false;
        }
        return true;
    }

    public int getAntiHijackErrorCode(int i) {
        ensureDBJsonData();
        return this.dbJsonData.optInt("anti_hijack_error_code", i);
    }

    public int getDBJsonInt(String str) {
        ensureDBJsonData();
        return this.dbJsonData.optInt(str);
    }

    public String getDBJsonString(String str) {
        ensureDBJsonData();
        return this.dbJsonData.optString(str);
    }

    public long getMinByteIntervalForPostToMainThread(long j) {
        int i = this.maxProgressCount;
        if (i <= 0) {
            i = 100;
        }
        long j2 = j / (i + 1);
        if (j2 <= 0) {
            return 1048576L;
        }
        return j2;
    }

    public int getSpIntVal(String str) {
        ensureSpData();
        return this.spData.optInt(str, 0);
    }

    public long getSpLongVal(String str) {
        ensureSpData();
        return this.spData.optLong(str, 0L);
    }

    public String getSpStringVal(String str) {
        ensureSpData();
        return this.spData.optString(str, null);
    }

    public void increaseAllConnectTime(long j) {
        if (j > 0) {
            getAllConnectTime();
            safePutToDBJsonData("dbjson_key_all_connect_time", Long.valueOf(this.allConnectTime.addAndGet(j)));
        }
    }

    public void increaseCurBytes(long j) {
        this.curBytes.addAndGet(j);
    }

    public void increaseDownloadPrepareTime(long j) {
        if (j > 0) {
            safePutToDBJsonData("dbjson_key_download_prepare_time", Long.valueOf(getDownloadPrepareTime() + j));
        }
    }

    public void readFromParcel(Parcel parcel) {
        boolean z;
        boolean z2;
        boolean z3;
        boolean z4;
        boolean z5;
        boolean z6;
        boolean z7;
        boolean z8;
        boolean z9;
        boolean z10;
        boolean z11;
        boolean z12;
        boolean z13;
        boolean z14;
        boolean z15;
        boolean z16;
        boolean z17;
        boolean z18;
        boolean z19;
        boolean z20;
        boolean z21;
        boolean z22;
        boolean z23;
        boolean z24;
        boolean z25;
        this.id = parcel.readInt();
        this.name = parcel.readString();
        this.title = parcel.readString();
        this.url = parcel.readString();
        this.savePath = parcel.readString();
        this.tempPath = parcel.readString();
        boolean z26 = true;
        if (parcel.readByte() != 0) {
            z = true;
        } else {
            z = false;
        }
        this.onlyWifi = z;
        this.extra = parcel.readString();
        this.extraHeaders = parcel.createTypedArrayList(HttpHeader.CREATOR);
        this.maxBytes = parcel.readInt();
        this.outIp = parcel.createStringArray();
        this.outSize = parcel.createIntArray();
        this.retryCount = parcel.readInt();
        this.backUpUrlRetryCount = parcel.readInt();
        if (parcel.readByte() != 0) {
            z2 = true;
        } else {
            z2 = false;
        }
        this.force = z2;
        if (parcel.readByte() != 0) {
            z3 = true;
        } else {
            z3 = false;
        }
        this.needPostProgress = z3;
        this.maxProgressCount = parcel.readInt();
        this.minProgressTimeMsInterval = parcel.readInt();
        this.backUpUrls = parcel.createStringArrayList();
        if (parcel.readByte() != 0) {
            z4 = true;
        } else {
            z4 = false;
        }
        this.showNotification = z4;
        this.mimeType = parcel.readString();
        if (parcel.readByte() != 0) {
            z5 = true;
        } else {
            z5 = false;
        }
        this.needHttpsToHttpRetry = z5;
        this.packageName = parcel.readString();
        this.md5 = parcel.readString();
        if (parcel.readByte() != 0) {
            z6 = true;
        } else {
            z6 = false;
        }
        this.needRetryDelay = z6;
        if (parcel.readByte() != 0) {
            z7 = true;
        } else {
            z7 = false;
        }
        this.needDefaultHttpServiceBackUp = z7;
        this.retryDelayTimeArray = parcel.readString();
        this.eTag = parcel.readString();
        this.curRetryTime = parcel.readInt();
        convertRetryDelayStatus(parcel.readInt());
        if (parcel.readByte() != 0) {
            z8 = true;
        } else {
            z8 = false;
        }
        this.needReuseFirstConnection = z8;
        if (parcel.readByte() != 0) {
            z9 = true;
        } else {
            z9 = false;
        }
        this.forceIgnoreRecommendSize = z9;
        this.networkQuality = parcel.readString();
        this.curBackUpUrlIndex = parcel.readInt();
        this.notificationVisibility = parcel.readInt();
        this.chunkCount = parcel.readInt();
        setCurBytes(parcel.readLong());
        this.totalBytes = parcel.readLong();
        setStatus(parcel.readInt());
        this.downloadTime = parcel.readLong();
        this.realDownloadTime = parcel.readLong();
        if (parcel.readByte() != 0) {
            z10 = true;
        } else {
            z10 = false;
        }
        this.backUpUrlUsed = z10;
        if (parcel.readByte() != 0) {
            z11 = true;
        } else {
            z11 = false;
        }
        this.httpsToHttpRetryUsed = z11;
        try {
            StringBuffer stringBuffer = this.errorBytesLog;
            if (stringBuffer == null) {
                this.errorBytesLog = new StringBuffer(parcel.readString());
            } else {
                stringBuffer.delete(0, stringBuffer.length());
                stringBuffer.append(parcel.readString());
            }
        } catch (Exception e) {
            C16880lQ.LLLLIIL(e);
        }
        if (parcel.readByte() != 0) {
            z12 = true;
        } else {
            z12 = false;
        }
        this.autoResumed = z12;
        if (parcel.readByte() != 0) {
            z13 = true;
        } else {
            z13 = false;
        }
        this.showNotificationForAutoResumed = z13;
        if (parcel.readByte() != 0) {
            z14 = true;
        } else {
            z14 = false;
        }
        this.showNotificationForNetworkResumed = z14;
        this.forbiddenBackupUrls = parcel.createStringArrayList();
        if (parcel.readByte() != 0) {
            z15 = true;
        } else {
            z15 = false;
        }
        this.needIndependentProcess = z15;
        convertEnqueueType(parcel.readInt());
        if (parcel.readByte() != 0) {
            z16 = true;
        } else {
            z16 = false;
        }
        this.headConnectionAvailable = z16;
        this.httpStatusCode = parcel.readInt();
        this.httpStatusMessage = parcel.readString();
        if (parcel.readByte() != 0) {
            z17 = true;
        } else {
            z17 = false;
        }
        this.isSaveTempFile = z17;
        if (parcel.readByte() != 0) {
            z18 = true;
        } else {
            z18 = false;
        }
        this.isForbiddenRetryed = z18;
        if (parcel.readByte() != 0) {
            z19 = true;
        } else {
            z19 = false;
        }
        this.addListenerToSameTask = z19;
        this.failedException = (BaseException) parcel.readParcelable(BaseException.class.getClassLoader());
        this.retryScheduleMinutes = parcel.readInt();
        this.dbJsonDataString = parcel.readString();
        if (parcel.readByte() != 0) {
            z20 = true;
        } else {
            z20 = false;
        }
        this.supportPartial = z20;
        this.iconUrl = parcel.readString();
        this.appVersionCode = parcel.readInt();
        this.taskId = parcel.readString();
        if (parcel.readByte() != 0) {
            z21 = true;
        } else {
            z21 = false;
        }
        this.expiredRedownload = z21;
        if (parcel.readByte() != 0) {
            z22 = true;
        } else {
            z22 = false;
        }
        this.deleteCacheIfCheckFailed = z22;
        if (parcel.readByte() != 0) {
            z23 = true;
        } else {
            z23 = false;
        }
        this.successByCache = z23;
        if (parcel.readByte() != 0) {
            z24 = true;
        } else {
            z24 = false;
        }
        this.expiredHttpCheck = z24;
        this.xTotalBytes = parcel.readLong();
        this.interceptFlag = parcel.readInt();
        this.accessHttpHeaderKeys = parcel.createStringArrayList();
        this.httpHeaders = parcel.readHashMap(getClass().getClassLoader());
        this.downloadStartTimeStamp = parcel.readLong();
        this.downloadFinishTimeStamp = parcel.readLong();
        this.installedTimeStamp = parcel.readLong();
        if (parcel.readByte() != 0) {
            z25 = true;
        } else {
            z25 = false;
        }
        this.hasDoInstallation = z25;
        if (parcel.readByte() == 0) {
            z26 = false;
        }
        this.isCacheExistsInDownloading = z26;
        parseMonitorSetting();
    }

    public void resetDataForEtagEndure(String str) {
        setCurBytes(0L, true);
        setTotalBytes(0L);
        seteTag(str);
        setChunkCount(1);
        setLastModified(null);
        this.downloadTime = 0L;
        this.realStartDownloadTime = 0L;
        this.realDownloadTime = 0L;
    }

    public void setAddListenerToSameTask(boolean z) {
        this.addListenerToSameTask = z;
    }

    public void setAntiHijackErrorCode(int i) {
        safePutToDBJsonData("anti_hijack_error_code", Integer.valueOf(i));
    }

    public void setAppVersionCode(int i) {
        this.appVersionCode = i;
    }

    public void setAsyncHandleStatus(EnumC84255X4x enumC84255X4x) {
        this.asyncHandleStatus = enumC84255X4x;
    }

    public void setAutoResumed(boolean z) {
        this.autoResumed = z;
    }

    public void setByteInvalidRetryStatus(VLG vlg) {
        this.byteInvalidRetryStatus = vlg;
    }

    public void setCacheControl(String str) {
        ensureSpData();
        try {
            this.spData.put("cache-control", str);
            updateSpData();
        } catch (Exception unused) {
        }
    }

    public void setCacheExistsInDownloading(boolean z) {
        this.isCacheExistsInDownloading = z;
    }

    public void setCacheExpiredTime(long j) {
        ensureSpData();
        try {
            this.spData.put("cache-control/expired_time", j);
            updateSpData();
        } catch (Exception unused) {
        }
    }

    public void setChunkCount(int i) {
        this.chunkCount = i;
    }

    public void setCurBytes(long j) {
        AtomicLong atomicLong = this.curBytes;
        if (atomicLong != null) {
            atomicLong.set(j);
        } else {
            this.curBytes = new AtomicLong(j);
        }
    }

    public void setCurNetworkRetryCount(int i) {
        this.curNetworkRetryCount = i;
    }

    public void setDownloadFinishTimeStamp(long j) {
        this.downloadFinishTimeStamp = j;
    }

    public void setDownloadFromReserveWifi(boolean z) {
        this.mDownloadFromReserveWifi = z;
    }

    public void setDownloadStartTimeStamp(long j) {
        this.downloadStartTimeStamp = j;
    }

    public void setDownloadTime(long j) {
        if (j >= 0) {
            this.downloadTime = j;
        }
    }

    public void setExtra(String str) {
        this.extra = str;
    }

    public void setFailedException(BaseException baseException) {
        this.failedException = baseException;
    }

    public void setFailedResumeCount(int i) {
        ensureSpData();
        try {
            this.spData.put("failed_resume_count", i);
        } catch (Exception e) {
            C16880lQ.LLLLIIL(e);
        }
    }

    public void setFilePackageName(String str) {
        this.filePackageName = str;
    }

    public void setFirstDownload(boolean z) {
        this.isFirstDownload = z;
    }

    public void setFirstSpeedTime(long j) {
        safePutToDBJsonData("dbjson_key_first_speed_time", Long.valueOf(j));
    }

    public void setFirstSuccess(boolean z) {
        this.isFirstSuccess = z;
    }

    public void setForceIgnoreRecommendSize(boolean z) {
        this.forceIgnoreRecommendSize = z;
    }

    public void setHasDoInstallation(boolean z) {
        this.hasDoInstallation = z;
    }

    public void setHeadConnectionException(String str) {
        this.headConnectionException = str;
    }

    public void setHttpHeaders(Map<String, String> map) {
        this.httpHeaders = map;
    }

    public void setHttpStatusCode(int i) {
        this.httpStatusCode = i;
    }

    public void setHttpStatusMessage(String str) {
        this.httpStatusMessage = str;
    }

    public void setHttpsToHttpRetryUsed(boolean z) {
        this.httpsToHttpRetryUsed = z;
    }

    public void setIconUrl(String str) {
        this.iconUrl = str;
    }

    public void setId(int i) {
        this.id = i;
    }

    public void setInstalledTimeStamp(long j) {
        this.installedTimeStamp = j;
    }

    public void setInterceptFlag(int i) {
        this.interceptFlag = i;
    }

    public void setIsRwConcurrent(boolean z) {
        safePutToDBJsonData("rw_concurrent", Integer.valueOf(z ? 1 : 0));
    }

    public void setIsSaveTempFile(boolean z) {
        this.isSaveTempFile = z;
    }

    public void setLastFailedResumeTime(long j) {
        ensureSpData();
        try {
            this.spData.put("last_failed_resume_time", j);
        } catch (Exception e) {
            C16880lQ.LLLLIIL(e);
        }
    }

    public void setLastModified(String str) {
        ensureSpData();
        try {
            this.spData.put("last-modified", str);
            updateSpData();
        } catch (Exception unused) {
        }
    }

    public void setLastUninstallResumeTime(long j) {
        ensureSpData();
        try {
            this.spData.put("last_unins_resume_time", j);
        } catch (Exception e) {
            C16880lQ.LLLLIIL(e);
        }
    }

    public void setLinkMode(int i) {
        safePutToDBJsonData("link_mode", Integer.valueOf(i));
    }

    public void setMd5(String str) {
        this.md5 = str;
    }

    public void setMimeType(String str) {
        this.mimeType = str;
    }

    public void setName(String str) {
        this.name = str;
    }

    public void setNetworkQuality(String str) {
        this.networkQuality = str;
    }

    public void setNotificationVisibility(int i) {
        this.notificationVisibility = i;
    }

    public void setOnlyWifi(boolean z) {
        this.onlyWifi = z;
    }

    public void setOpenLimitSpeed(boolean z) {
        this.openLimitSpeed = z;
    }

    public void setPackageInfo(PackageInfo packageInfo) {
        this.packageInfoRef = new SoftReference<>(packageInfo);
    }

    public void setPackageName(String str) {
        this.packageName = str;
    }

    public void setPausedResumeCount(int i) {
        ensureSpData();
        try {
            this.spData.put("paused_resume_count", i);
        } catch (Exception e) {
            C16880lQ.LLLLIIL(e);
        }
    }

    public void setPreconnectLevel(int i) {
        ensureDBJsonData();
        safePutToDBJsonData("dbjson_key_preconnect_level", Integer.valueOf(i));
    }

    public void setRedirectPartialUrlResults(String str) {
        safePutToDBJsonData("redirect_partial_url_results", str);
    }

    public void setRetryDelayStatus(EnumC84257X4z enumC84257X4z) {
        this.retryDelayStatus = enumC84257X4z;
    }

    public void setRetryScheduleCount(int i) {
        safePutToDBJsonData("retry_schedule_count", Integer.valueOf(i));
    }

    public void setSavePath(String str) {
        this.savePath = str;
    }

    public void setSavePathRedirected(boolean z) {
        safePutToDBJsonData("is_save_path_redirected", Boolean.valueOf(z));
    }

    public void setShowNotification(boolean z) {
        this.showNotification = z;
    }

    public void setShowNotificationForAutoResumed(boolean z) {
        this.showNotificationForAutoResumed = z;
    }

    public void setShowNotificationForNetworkResumed(boolean z) {
        this.showNotificationForNetworkResumed = z;
    }

    public void setStatus(int i) {
        AtomicInteger atomicInteger = this.status;
        if (atomicInteger != null) {
            atomicInteger.set(i);
        } else {
            this.status = new AtomicInteger(i);
        }
    }

    public void setStatusAtDbInit(int i) {
        this.statusAtDbInit = i;
    }

    public void setSuccessByCache(boolean z) {
        this.successByCache = z;
    }

    public void setSupportPartial(boolean z) {
        this.supportPartial = z;
    }

    public void setTTMd5CheckStatus(int i) {
        safePutToDBJsonData("ttmd5_check_status", Integer.valueOf(i));
    }

    public void setThrottleNetSpeed(long j) {
        setThrottleNetSpeed(j, -1);
    }

    public void setTotalBytes(long j) {
        this.totalBytes = j;
    }

    public void setUninstallResumeCount(int i) {
        ensureSpData();
        try {
            this.spData.put("unins_resume_count", i);
        } catch (Exception e) {
            C16880lQ.LLLLIIL(e);
        }
    }

    public void setUrl(String str) {
        this.url = str;
    }

    public void setXTotalBytes(long j) {
        this.xTotalBytes = j;
    }

    public void seteTag(String str) {
        this.eTag = str;
    }

    public void updateCurRetryTime(int i) {
        int i2;
        if (this.backUpUrlUsed) {
            i2 = this.backUpUrlRetryCount;
        } else {
            i2 = this.retryCount;
        }
        int i3 = i2 - i;
        this.curRetryTime = i3;
        if (i3 < 0) {
            this.curRetryTime = 0;
        }
    }

    public void updateRealDownloadTime(boolean z) {
        long nanoTime = System.nanoTime();
        long j = this.realStartDownloadTime;
        if (j <= 0) {
            if (z) {
                this.realStartDownloadTime = nanoTime;
                return;
            }
            return;
        }
        long j2 = nanoTime - j;
        if (z) {
            this.realStartDownloadTime = nanoTime;
        } else {
            this.realStartDownloadTime = 0L;
        }
        if (j2 > 0) {
            this.realDownloadTime += j2;
        }
    }

    public DownloadInfo(C84248X4q c84248X4q) {
        this.needDefaultHttpServiceBackUp = true;
        this.retryDelayStatus = EnumC84257X4z.DELAY_RETRY_NONE;
        this.asyncHandleStatus = EnumC84255X4x.ASYNC_HANDLE_NONE;
        this.supportPartial = true;
        this.needSDKMonitor = true;
        this.interceptFlag = -1;
        this.chunkCount = 1;
        this.isFirstDownload = true;
        this.isFirstSuccess = true;
        this.byteInvalidRetryStatus = VLG.BYTE_INVALID_RETRY_STATUS_NONE;
        this.enqueueType = VFA.ENQUEUE_NONE;
        this.lastNotifyProgressTime = new AtomicLong(0L);
        this.isAutoInstallWithoutNotification = null;
        this.id = c84248X4q.LJJL;
        this.name = c84248X4q.LIZ;
        this.title = c84248X4q.LIZIZ;
        this.url = c84248X4q.LIZJ;
        this.savePath = c84248X4q.LIZLLL;
        this.tempPath = c84248X4q.LJ;
        this.chunkCount = c84248X4q.LJJLI;
        setStatus(c84248X4q.LJJLIIIIJ);
        setCurBytes(c84248X4q.LJJLIIIJ);
        this.totalBytes = c84248X4q.LJJLIIIJILLIZJL;
        this.eTag = c84248X4q.LJJZ;
        this.onlyWifi = c84248X4q.LJFF;
        this.force = c84248X4q.LJIILIIL;
        this.retryCount = c84248X4q.LJIIJJI;
        this.extra = c84248X4q.LJI;
        this.mimeType = c84248X4q.LJIJJ;
        this.showNotification = c84248X4q.LJIJ;
        this.notificationVisibility = c84248X4q.LJJLIIIJJI;
        this.isFirstDownload = c84248X4q.LJJLIIIJJIZ;
        this.isFirstSuccess = c84248X4q.LJJLIIIJL;
        this.needHttpsToHttpRetry = c84248X4q.LJIJJLI;
        this.downloadTime = c84248X4q.LJJLIIIJLJLI;
        this.packageName = c84248X4q.LJJIFFI;
        this.md5 = c84248X4q.LJJII;
        this.needRetryDelay = c84248X4q.LJJIIJ;
        this.curRetryTime = c84248X4q.LJJLIIIJLLLLLLLZ;
        this.retryDelayStatus = c84248X4q.LJJLIIJ;
        this.needDefaultHttpServiceBackUp = c84248X4q.LJJI;
        this.retryDelayTimeArray = c84248X4q.LJJIIJZLJL;
        this.backUpUrlsStr = c84248X4q.LJJLIL;
        this.backUpUrlRetryCount = c84248X4q.LJIIL;
        this.realDownloadTime = c84248X4q.LJJLJ;
        this.retryScheduleMinutes = c84248X4q.LJJLJLI;
        this.needIndependentProcess = c84248X4q.LJJIIZI;
        this.dbJsonDataString = c84248X4q.LJJLL;
        this.iconUrl = c84248X4q.LJJIJIL;
        this.appVersionCode = c84248X4q.LJJIJL;
        this.taskId = c84248X4q.LJJZZI;
        this.downloadStartTimeStamp = c84248X4q.LJJZZIII;
        this.downloadFinishTimeStamp = c84248X4q.LJL;
        this.installedTimeStamp = c84248X4q.LJLI;
        this.hasDoInstallation = c84248X4q.LJLIIIL;
        try {
            parseMonitorSetting();
        } catch (Throwable unused) {
        }
    }

    public DownloadInfo(Parcel parcel) {
        this.needDefaultHttpServiceBackUp = true;
        this.retryDelayStatus = EnumC84257X4z.DELAY_RETRY_NONE;
        this.asyncHandleStatus = EnumC84255X4x.ASYNC_HANDLE_NONE;
        this.supportPartial = true;
        this.needSDKMonitor = true;
        this.interceptFlag = -1;
        this.chunkCount = 1;
        this.isFirstDownload = true;
        this.isFirstSuccess = true;
        this.byteInvalidRetryStatus = VLG.BYTE_INVALID_RETRY_STATUS_NONE;
        this.enqueueType = VFA.ENQUEUE_NONE;
        this.lastNotifyProgressTime = new AtomicLong(0L);
        this.isAutoInstallWithoutNotification = null;
        readFromParcel(parcel);
    }

    public DownloadInfo(Cursor cursor) {
        this.needDefaultHttpServiceBackUp = true;
        this.retryDelayStatus = EnumC84257X4z.DELAY_RETRY_NONE;
        this.asyncHandleStatus = EnumC84255X4x.ASYNC_HANDLE_NONE;
        this.supportPartial = true;
        this.needSDKMonitor = true;
        this.interceptFlag = -1;
        this.chunkCount = 1;
        this.isFirstDownload = true;
        this.isFirstSuccess = true;
        this.byteInvalidRetryStatus = VLG.BYTE_INVALID_RETRY_STATUS_NONE;
        this.enqueueType = VFA.ENQUEUE_NONE;
        this.lastNotifyProgressTime = new AtomicLong(0L);
        this.isAutoInstallWithoutNotification = null;
    }

    public /* synthetic */ DownloadInfo(X4W x4w, IDCreatorS57S0000000_15 iDCreatorS57S0000000_15) {
        this(x4w);
    }

    public void copyFromCacheData(DownloadInfo downloadInfo, boolean z) {
        if (downloadInfo == null) {
            return;
        }
        setChunkCount(downloadInfo.getChunkCount());
        setTotalBytes(downloadInfo.getTotalBytes());
        setCurBytes(downloadInfo.getCurBytes(), true);
        this.realDownloadTime = downloadInfo.realDownloadTime;
        if (!downloadInfo.canSkipStatusHandler() && !canSkipStatusHandler()) {
            this.curRetryTime = 0;
            this.isForbiddenRetryed = false;
            this.backUpUrlUsed = false;
            this.curBackUpUrlIndex = 0;
            this.httpsToHttpRetryUsed = false;
        } else {
            this.curRetryTime = downloadInfo.getCurRetryTime();
        }
        seteTag(downloadInfo.geteTag());
        if (z) {
            setStatus(downloadInfo.getStatus());
        }
        this.isFirstDownload = downloadInfo.getIsFirstDownload();
        this.isFirstSuccess = downloadInfo.isFirstSuccess();
        this.retryDelayStatus = downloadInfo.getRetryDelayStatus();
        this.downloadStartTimeStamp = downloadInfo.getDownloadStartTimeStamp();
        this.downloadFinishTimeStamp = downloadInfo.getDownloadFinishTimeStamp();
        this.installedTimeStamp = downloadInfo.getInstalledTimeStamp();
        this.hasDoInstallation = downloadInfo.hasDoInstallation;
        this.taskId = downloadInfo.getTaskId();
        mergeAuxiliaryJSONObject(downloadInfo.dbJsonData);
    }

    public void safePutToDBJsonData(String str, Object obj) {
        ensureDBJsonData();
        synchronized (this.dbJsonData) {
            try {
                this.dbJsonData.put(str, obj);
            } catch (Exception unused) {
            }
            this.dbJsonDataString = null;
        }
    }

    public void setCurBytes(long j, boolean z) {
        if (z) {
            setCurBytes(j);
        } else {
            if (j <= getCurBytes()) {
                return;
            }
            setCurBytes(j);
        }
    }

    public void setForbiddenBackupUrls(List<String> list, boolean z) {
        this.forbiddenBackupUrls = list;
        refreshBackupUrls(z);
    }

    public void setSpValue(String str, String str2) {
        ensureSpData();
        try {
            this.spData.put(str, str2);
            updateSpData();
        } catch (Exception e) {
            C16880lQ.LLLLIIL(e);
        }
    }

    public void setThrottleNetSpeed(long j, int i) {
        this.throttleNetSpeed = j;
        this.throttleSmoothness = i;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        String str;
        parcel.writeInt(this.id);
        parcel.writeString(this.name);
        parcel.writeString(this.title);
        parcel.writeString(this.url);
        parcel.writeString(this.savePath);
        parcel.writeString(this.tempPath);
        parcel.writeByte(this.onlyWifi ? (byte) 1 : (byte) 0);
        parcel.writeString(this.extra);
        parcel.writeTypedList(this.extraHeaders);
        parcel.writeInt(this.maxBytes);
        parcel.writeStringArray(this.outIp);
        parcel.writeIntArray(this.outSize);
        parcel.writeInt(this.retryCount);
        parcel.writeInt(this.backUpUrlRetryCount);
        parcel.writeByte(this.force ? (byte) 1 : (byte) 0);
        parcel.writeByte(this.needPostProgress ? (byte) 1 : (byte) 0);
        parcel.writeInt(this.maxProgressCount);
        parcel.writeInt(this.minProgressTimeMsInterval);
        parcel.writeStringList(this.backUpUrls);
        parcel.writeByte(this.showNotification ? (byte) 1 : (byte) 0);
        parcel.writeString(this.mimeType);
        parcel.writeByte(this.needHttpsToHttpRetry ? (byte) 1 : (byte) 0);
        parcel.writeString(this.packageName);
        parcel.writeString(this.md5);
        parcel.writeByte(this.needRetryDelay ? (byte) 1 : (byte) 0);
        parcel.writeByte(this.needDefaultHttpServiceBackUp ? (byte) 1 : (byte) 0);
        parcel.writeString(this.retryDelayTimeArray);
        parcel.writeString(this.eTag);
        parcel.writeInt(this.curRetryTime);
        parcel.writeInt(this.retryDelayStatus.ordinal());
        parcel.writeByte(this.needReuseFirstConnection ? (byte) 1 : (byte) 0);
        parcel.writeByte(this.forceIgnoreRecommendSize ? (byte) 1 : (byte) 0);
        parcel.writeString(this.networkQuality);
        parcel.writeInt(this.curBackUpUrlIndex);
        parcel.writeInt(this.notificationVisibility);
        parcel.writeInt(this.chunkCount);
        parcel.writeLong(getCurBytes());
        parcel.writeLong(this.totalBytes);
        parcel.writeInt(getRealStatus());
        parcel.writeLong(this.downloadTime);
        parcel.writeLong(this.realDownloadTime);
        parcel.writeByte(this.backUpUrlUsed ? (byte) 1 : (byte) 0);
        parcel.writeByte(this.httpsToHttpRetryUsed ? (byte) 1 : (byte) 0);
        StringBuffer stringBuffer = this.errorBytesLog;
        if (stringBuffer != null) {
            str = stringBuffer.toString();
        } else {
            str = "";
        }
        parcel.writeString(str);
        parcel.writeByte(this.autoResumed ? (byte) 1 : (byte) 0);
        parcel.writeByte(this.showNotificationForAutoResumed ? (byte) 1 : (byte) 0);
        parcel.writeByte(this.showNotificationForNetworkResumed ? (byte) 1 : (byte) 0);
        parcel.writeStringList(this.forbiddenBackupUrls);
        parcel.writeByte(this.needIndependentProcess ? (byte) 1 : (byte) 0);
        parcel.writeInt(this.enqueueType.ordinal());
        parcel.writeByte(this.headConnectionAvailable ? (byte) 1 : (byte) 0);
        parcel.writeInt(this.httpStatusCode);
        parcel.writeString(this.httpStatusMessage);
        parcel.writeByte(this.isSaveTempFile ? (byte) 1 : (byte) 0);
        parcel.writeByte(this.isForbiddenRetryed ? (byte) 1 : (byte) 0);
        parcel.writeByte(this.addListenerToSameTask ? (byte) 1 : (byte) 0);
        parcel.writeParcelable(this.failedException, i);
        parcel.writeInt(this.retryScheduleMinutes);
        parcel.writeString(getDBJsonDataString());
        parcel.writeByte(this.supportPartial ? (byte) 1 : (byte) 0);
        parcel.writeString(this.iconUrl);
        parcel.writeInt(this.appVersionCode);
        parcel.writeString(this.taskId);
        parcel.writeByte(this.expiredRedownload ? (byte) 1 : (byte) 0);
        parcel.writeByte(this.deleteCacheIfCheckFailed ? (byte) 1 : (byte) 0);
        parcel.writeByte(this.successByCache ? (byte) 1 : (byte) 0);
        parcel.writeByte(this.expiredHttpCheck ? (byte) 1 : (byte) 0);
        parcel.writeLong(this.xTotalBytes);
        parcel.writeInt(this.interceptFlag);
        parcel.writeStringList(this.accessHttpHeaderKeys);
        parcel.writeMap(this.httpHeaders);
        parcel.writeLong(this.downloadStartTimeStamp);
        parcel.writeLong(this.downloadFinishTimeStamp);
        parcel.writeLong(this.installedTimeStamp);
        parcel.writeByte(this.hasDoInstallation ? (byte) 1 : (byte) 0);
        parcel.writeByte(this.isCacheExistsInDownloading ? (byte) 1 : (byte) 0);
    }

    public /* synthetic */ DownloadInfo(C84248X4q c84248X4q, IDCreatorS57S0000000_15 iDCreatorS57S0000000_15) {
        this(c84248X4q);
    }

    public void addErrorBytesLog(long j, int i, String str) {
        try {
            if (C65210PiY.LIZ()) {
                if (this.errorBytesLog == null) {
                    this.errorBytesLog = new StringBuffer();
                }
                if (this.errorBytesLog.length() != 0) {
                    this.errorBytesLog.append(",");
                }
                StringBuffer stringBuffer = this.errorBytesLog;
                stringBuffer.append("[type:");
                stringBuffer.append(i);
                stringBuffer.append(",bytes:");
                stringBuffer.append(j);
                stringBuffer.append(",method:");
                stringBuffer.append(str);
                stringBuffer.append("]");
            }
        } catch (Exception e) {
            C16880lQ.LLLLIIL(e);
        }
    }
}
