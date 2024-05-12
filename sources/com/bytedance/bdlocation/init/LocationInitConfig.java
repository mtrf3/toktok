package com.bytedance.bdlocation.init;

import X.C16880lQ;
import android.app.Application;
import android.content.Context;
import com.bytedance.bdlocation.callback.BDRestrictedMode;
import com.bytedance.bdlocation.event.IEventManager;
import com.bytedance.bdlocation.log.Printer;
import com.bytedance.bdlocation.network.ICustomNetworkApi;
import com.bytedance.bdlocation.utils.background.BackgroundProvider;
import java.util.Locale;
import java.util.Map;

/* loaded from: classes16.dex */
public class LocationInitConfig {
    public static boolean mEnableH3 = true;
    public static int mH3Distance = 1;
    public static int mH3Resolution = 7;
    public static int mLatlngPrecision = 2;
    public boolean enableCoarseOpt;
    public boolean isPrivacyConfirmed;
    public BackgroundProvider mBackgroundProvider;
    public Map<String, Object> mBpeaCerts;
    public Context mContext;
    public boolean mDebug;
    public IEventManager mEventManager;
    public String mFinePermission;
    public String mGPSProvider;
    public boolean mIsLatLngEncrypt;
    public Locale mLocale;
    public ICustomNetworkApi mNetworkApi;
    public boolean mOverseas;
    public Printer mPrinter;
    public BDRestrictedMode mRestrictedMode;
    public String mWorldView;
    public String userRegion;
    public String mDid = "";
    public String mAppId = "";
    public String mChannel = "";
    public String mAppVersion = "";
    public String mUpdateVersionCode = "";
    public String mPackageName = "";
    public String mBaseUrl = "";
    public int mLocateType = 3;
    public long mOverseaUploadInterval = 86400;
    public long mOverseaUploadMaxDuration = 86400;
    public long mOverseaUploadMaxCount = 1;
    public boolean mIsNetworkBodyEncrypt = true;
    public String mPathPrefix = "";
    public String mMonitorConfigUrl = "";
    public String mMonitorReportUrl = "";

    /* loaded from: classes16.dex */
    public static class Builder {
        public static boolean mEnableH3 = true;
        public static int mH3Distance = 1;
        public static int mH3Resolution = 7;
        public static int mLatlngPrecision = 2;
        public boolean enableCoarseOpt;
        public BackgroundProvider mBackgroundProvider;
        public Map<String, Object> mBpeaCerts;
        public Context mContext;
        public boolean mDebug;
        public IEventManager mEventManager;
        public String mFinePermission;
        public String mGPSProvider;
        public boolean mIsLatLngEncrypt;
        public boolean mIsPrivacyConfirmed;
        public Locale mLocale;
        public ICustomNetworkApi mNetworkApi;
        public boolean mOverseas;
        public Printer mPrinter;
        public BDRestrictedMode mRestrictedMode;
        public String mUserRegion;
        public String mWorldView;
        public String mBaseUrl = "";
        public String mDid = "";
        public String mAppId = "";
        public String mChannel = "";
        public String mAppVersion = "";
        public String mUpdateVersionCode = "";
        public String mPackageName = "";
        public int mLocateType = 3;
        public long mOverseaUploadInterval = 86400;
        public long mOverseaUploadMaxDuration = 86400;
        public long mOverseaUploadMaxCount = 1;
        public boolean mIsNetworkBodyEncrypt = true;
        public String mPathPrefix = "";
        public String mMonitorConfigUrl = "";
        public String mMonitorReportUrl = "";

        public LocationInitConfig build() {
            LocationInitConfig locationInitConfig = new LocationInitConfig();
            locationInitConfig.setBaseUrl(this.mBaseUrl);
            locationInitConfig.setRestrictedMode(this.mRestrictedMode);
            locationInitConfig.setCustomNetworkApi(this.mNetworkApi);
            locationInitConfig.setDid(this.mDid);
            locationInitConfig.setAppId(this.mAppId);
            locationInitConfig.setChannel(this.mChannel);
            locationInitConfig.setAppVersion(this.mAppVersion);
            locationInitConfig.setUpdateVersionCode(this.mUpdateVersionCode);
            locationInitConfig.setPackageName(this.mPackageName);
            locationInitConfig.setContext(this.mContext);
            locationInitConfig.setPrivacyConfirmed(this.mIsPrivacyConfirmed);
            locationInitConfig.setDebug(this.mDebug);
            locationInitConfig.setBpeaCerts(this.mBpeaCerts);
            locationInitConfig.setWorldView(this.mWorldView);
            locationInitConfig.setLocale(this.mLocale);
            locationInitConfig.setALogPrinter(this.mPrinter);
            locationInitConfig.setOverseas(this.mOverseas);
            locationInitConfig.setBackgroundProvider(this.mBackgroundProvider);
            locationInitConfig.setOverseaUploadInterval(this.mOverseaUploadInterval);
            locationInitConfig.setOverseaUploadMaxDuration(this.mOverseaUploadMaxDuration);
            locationInitConfig.setOverseaUploadMaxCount(this.mOverseaUploadMaxCount);
            locationInitConfig.setEnableH3(mEnableH3);
            locationInitConfig.setLatlngPrecision(mLatlngPrecision);
            locationInitConfig.setH3Resolution(mH3Resolution);
            locationInitConfig.setH3Distance(mH3Distance);
            locationInitConfig.setEventManager(this.mEventManager);
            locationInitConfig.setLocateType(this.mLocateType);
            locationInitConfig.setLatLngEncrypt(this.mIsLatLngEncrypt);
            locationInitConfig.setNetworkBodyEncrypt(this.mIsNetworkBodyEncrypt);
            locationInitConfig.setFinePermission(this.mFinePermission);
            locationInitConfig.setGPSProvider(this.mGPSProvider);
            locationInitConfig.setPathPrefix(this.mPathPrefix);
            locationInitConfig.setMonitorConfigUrl(this.mMonitorConfigUrl);
            locationInitConfig.setMonitorReportUrl(this.mMonitorReportUrl);
            locationInitConfig.setUserRegion(this.mUserRegion);
            locationInitConfig.setEnableCoarseOpt(this.enableCoarseOpt);
            return locationInitConfig;
        }

        public int getLocateType() {
            return this.mLocateType;
        }

        public boolean isEnableCoarseOpt() {
            return this.enableCoarseOpt;
        }

        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Type inference failed for: r0v5, types: [android.content.Context] */
        public Builder(Application application) {
            if (application != null) {
                ?? LLLLJI = C16880lQ.LLLLJI(application);
                this.mContext = LLLLJI != 0 ? LLLLJI : application;
                return;
            }
            throw new RuntimeException("context must not be null");
        }

        public Builder isPrivacyConfirmed(boolean z) {
            this.mIsPrivacyConfirmed = z;
            return this;
        }

        public Builder setALogPrinter(Printer printer) {
            this.mPrinter = printer;
            return this;
        }

        public Builder setAppId(String str) {
            this.mAppId = str;
            return this;
        }

        public Builder setAppVersion(String str) {
            this.mAppVersion = str;
            return this;
        }

        public Builder setBackgroundProvider(BackgroundProvider backgroundProvider) {
            this.mBackgroundProvider = backgroundProvider;
            return this;
        }

        public Builder setBaseUrl(String str) {
            this.mBaseUrl = str;
            return this;
        }

        public Builder setBpeaCerts(Map<String, Object> map) {
            this.mBpeaCerts = map;
            return this;
        }

        public Builder setChannel(String str) {
            this.mChannel = str;
            return this;
        }

        public Builder setCustomNetworkApi(ICustomNetworkApi iCustomNetworkApi) {
            this.mNetworkApi = iCustomNetworkApi;
            return this;
        }

        public Builder setDebug(boolean z) {
            this.mDebug = z;
            return this;
        }

        public Builder setDid(String str) {
            this.mDid = str;
            return this;
        }

        public Builder setEnableCoarseOpt(boolean z) {
            this.enableCoarseOpt = z;
            return this;
        }

        public Builder setEnableH3(boolean z) {
            mEnableH3 = z;
            return this;
        }

        public Builder setEventManager(IEventManager iEventManager) {
            this.mEventManager = iEventManager;
            return this;
        }

        public Builder setFinePermission(String str) {
            this.mFinePermission = str;
            return this;
        }

        public Builder setGPSProvider(String str) {
            this.mGPSProvider = str;
            return this;
        }

        public Builder setH3Distance(int i) {
            mH3Distance = i;
            return this;
        }

        public Builder setH3Resolution(int i) {
            mH3Resolution = i;
            return this;
        }

        public Builder setLatLngEncrypt(boolean z) {
            this.mIsLatLngEncrypt = z;
            return this;
        }

        public Builder setLatlngPrecision(int i) {
            mLatlngPrecision = i;
            return this;
        }

        public Builder setLocal(Locale locale) {
            this.mLocale = locale;
            return this;
        }

        public Builder setLocateType(int i) {
            this.mLocateType = i;
            return this;
        }

        public Builder setMonitorConfigUrl(String str) {
            this.mMonitorConfigUrl = str;
            return this;
        }

        public Builder setMonitorReportUrl(String str) {
            this.mMonitorReportUrl = str;
            return this;
        }

        public Builder setNetworkBodyEncrypt(boolean z) {
            this.mIsNetworkBodyEncrypt = z;
            return this;
        }

        public Builder setOverseaUploadInterval(long j) {
            this.mOverseaUploadInterval = j;
            return this;
        }

        public Builder setOverseaUploadMaxCount(long j) {
            this.mOverseaUploadMaxCount = j;
            return this;
        }

        public Builder setOverseaUploadMaxDuration(long j) {
            this.mOverseaUploadMaxDuration = j;
            return this;
        }

        public Builder setOverseas(boolean z) {
            this.mOverseas = z;
            return this;
        }

        public Builder setPackageName(String str) {
            this.mPackageName = str;
            return this;
        }

        public Builder setPathPrefix(String str) {
            this.mPathPrefix = str;
            return this;
        }

        public Builder setRestrictedMode(BDRestrictedMode bDRestrictedMode) {
            this.mRestrictedMode = bDRestrictedMode;
            return this;
        }

        public Builder setUpdateVersionCode(String str) {
            this.mUpdateVersionCode = str;
            return this;
        }

        public Builder setUserRegion(String str) {
            this.mUserRegion = str;
            return this;
        }

        public Builder setWorldView(String str) {
            this.mWorldView = str;
            return this;
        }
    }

    public Printer getALogPrinter() {
        return this.mPrinter;
    }

    public String getAppId() {
        return this.mAppId;
    }

    public String getAppVersion() {
        return this.mAppVersion;
    }

    public BackgroundProvider getBackgroundProvider() {
        return this.mBackgroundProvider;
    }

    public String getBaseUrl() {
        return this.mBaseUrl;
    }

    public Map<String, Object> getBpeaCerts() {
        return this.mBpeaCerts;
    }

    public String getChannel() {
        return this.mChannel;
    }

    public Context getContext() {
        return this.mContext;
    }

    public ICustomNetworkApi getCustomNetworkApi() {
        return this.mNetworkApi;
    }

    public boolean getDebug() {
        return this.mDebug;
    }

    public String getDid() {
        return this.mDid;
    }

    public IEventManager getEventManager() {
        return this.mEventManager;
    }

    public String getFinePermission() {
        return this.mFinePermission;
    }

    public String getGPSProvider() {
        return this.mGPSProvider;
    }

    public int getH3Distance() {
        return mH3Distance;
    }

    public int getH3Resolution() {
        return mH3Resolution;
    }

    public int getLatlngPrecision() {
        return mLatlngPrecision;
    }

    public Locale getLocale() {
        return this.mLocale;
    }

    public int getLocateType() {
        return this.mLocateType;
    }

    public String getMonitorConfigUrl() {
        return this.mMonitorConfigUrl;
    }

    public String getMonitorReportUrl() {
        return this.mMonitorReportUrl;
    }

    public long getOverseaUploadInterval() {
        return this.mOverseaUploadInterval;
    }

    public long getOverseaUploadMaxCount() {
        return this.mOverseaUploadMaxCount;
    }

    public long getOverseaUploadMaxDuration() {
        return this.mOverseaUploadMaxDuration;
    }

    public String getPackageName() {
        return this.mPackageName;
    }

    public String getPathPrefix() {
        return this.mPathPrefix;
    }

    public BDRestrictedMode getRestrictedMode() {
        return this.mRestrictedMode;
    }

    public String getUpdateVersionCode() {
        return this.mUpdateVersionCode;
    }

    public String getUserRegion() {
        return this.userRegion;
    }

    public String getWorldView() {
        return this.mWorldView;
    }

    public boolean isEnableCoarseOpt() {
        return this.enableCoarseOpt;
    }

    public boolean isEnableH3() {
        return mEnableH3;
    }

    public boolean isLatLngEncrypt() {
        return this.mIsLatLngEncrypt;
    }

    public boolean isNetworkBodyEncrypt() {
        return this.mIsNetworkBodyEncrypt;
    }

    public boolean isOverseas() {
        return this.mOverseas;
    }

    public boolean isPrivacyConfirmed() {
        return this.isPrivacyConfirmed;
    }

    public void setALogPrinter(Printer printer) {
        this.mPrinter = printer;
    }

    public void setAppId(String str) {
        this.mAppId = str;
    }

    public void setAppVersion(String str) {
        this.mAppVersion = str;
    }

    public void setBackgroundProvider(BackgroundProvider backgroundProvider) {
        this.mBackgroundProvider = backgroundProvider;
    }

    public void setBaseUrl(String str) {
        this.mBaseUrl = str;
    }

    public void setBpeaCerts(Map<String, Object> map) {
        this.mBpeaCerts = map;
    }

    public void setChannel(String str) {
        this.mChannel = str;
    }

    public void setContext(Context context) {
        this.mContext = context;
    }

    public void setCustomNetworkApi(ICustomNetworkApi iCustomNetworkApi) {
        this.mNetworkApi = iCustomNetworkApi;
    }

    public void setDebug(boolean z) {
        this.mDebug = z;
    }

    public void setDid(String str) {
        this.mDid = str;
    }

    public void setEnableCoarseOpt(boolean z) {
        this.enableCoarseOpt = z;
    }

    public void setEnableH3(boolean z) {
        mEnableH3 = z;
    }

    public void setEventManager(IEventManager iEventManager) {
        this.mEventManager = iEventManager;
    }

    public void setFinePermission(String str) {
        this.mFinePermission = str;
    }

    public void setGPSProvider(String str) {
        this.mGPSProvider = str;
    }

    public void setH3Distance(int i) {
        mH3Distance = i;
    }

    public void setH3Resolution(int i) {
        mH3Resolution = i;
    }

    public void setLatLngEncrypt(boolean z) {
        this.mIsLatLngEncrypt = z;
    }

    public void setLatlngPrecision(int i) {
        mLatlngPrecision = i;
    }

    public void setLocale(Locale locale) {
        this.mLocale = locale;
    }

    public void setLocateType(int i) {
        this.mLocateType = i;
    }

    public void setMonitorConfigUrl(String str) {
        this.mMonitorConfigUrl = str;
    }

    public void setMonitorReportUrl(String str) {
        this.mMonitorReportUrl = str;
    }

    public void setNetworkBodyEncrypt(boolean z) {
        this.mIsNetworkBodyEncrypt = z;
    }

    public void setOverseaUploadInterval(long j) {
        this.mOverseaUploadInterval = j;
    }

    public void setOverseaUploadMaxCount(long j) {
        this.mOverseaUploadMaxCount = j;
    }

    public void setOverseaUploadMaxDuration(long j) {
        this.mOverseaUploadMaxDuration = j;
    }

    public void setOverseas(boolean z) {
        this.mOverseas = z;
    }

    public void setPackageName(String str) {
        this.mPackageName = str;
    }

    public void setPathPrefix(String str) {
        this.mPathPrefix = str;
    }

    public void setPrivacyConfirmed(boolean z) {
        this.isPrivacyConfirmed = z;
    }

    public void setRestrictedMode(BDRestrictedMode bDRestrictedMode) {
        this.mRestrictedMode = bDRestrictedMode;
    }

    public void setUpdateVersionCode(String str) {
        this.mUpdateVersionCode = str;
    }

    public void setUserRegion(String str) {
        this.userRegion = str;
    }

    public void setWorldView(String str) {
        this.mWorldView = str;
    }
}
