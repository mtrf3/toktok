package com.byted.cast.common.config;

import android.text.TextUtils;
import com.byted.cast.common.PreferenceUtils;
import com.byted.cast.common.UrlUtils;
import com.byted.cast.common.api.IAppCommonDataListener;
import com.byted.cast.common.api.IAudioRecordAdapter;
import com.byted.cast.common.api.IBindSdkInfoListener;
import com.byted.cast.common.api.ICameraAdapter;
import com.byted.cast.common.api.IHostAddressAdapter;
import com.byted.cast.common.api.IHttpNetWork;
import com.byted.cast.common.api.ILibraryLoader;
import com.byted.cast.common.api.ILogger;
import com.byted.cast.common.api.IMonitor;
import com.byted.cast.common.api.ISinkDataListener;
import com.byted.cast.common.bean.DeviceOfflineDetectSettings;
import com.bytedance.android.livesdk.livesetting.performance.LivePlayEnforceIntervalSetting;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes29.dex */
public class Config {
    public String aId;
    public String appId;
    public String appSecret;
    public IAudioRecordAdapter audioRecordAdapter;
    public boolean autoPlayAudio;
    public long bdlinkDiskCacheDetectIntervalMills;
    public int bdlinkSinkMessageTimeout = 5000;
    public List<WeakReference<IBindSdkInfoListener>> bindSdkInfoListenerRefs;
    public ICameraAdapter cameraAdapter;
    public int castProxyType;
    public int channelId;
    public String chromeCastId;
    public WeakReference<IAppCommonDataListener> commonDataListenerRef;
    public String deviceId;
    public DeviceOfflineDetectSettings deviceOfflineDetectSettings;
    public boolean dlnaLowPerformanceMode;
    public String dlnaSetManufacturer;
    public int dlnaSinkNotifyInterval;
    public String dlnaXMLParserKeys;
    public String domain;
    public Boolean enableBDLinkSSDPCycleSearch;
    public Boolean enableBDLinkSSDPSwitch;
    public Boolean enableBDLinkSinkBroadcast;
    public Boolean enableBDLinkSinkSSDPSwitch;
    public Boolean enableBDLinkSourceBroadcast;
    public Boolean enableBLE;
    public boolean enableCallbackData;
    public Boolean enableDLNABroadCast;
    public Boolean enableDLNACache;
    public Boolean enableDLNASearch;
    public boolean enableDebug;
    public Boolean enableDlnaNewDeviceOffline;
    public Boolean enableDlnaSinkCustomizedService;
    public Boolean enableDlnaSourceCustomizedService;
    public boolean enableFileLog;
    public boolean enablePlaying;
    public boolean enableVideoNativeDecode;
    public boolean enableWifiP2PSearch;
    public Boolean forceDnssd;
    public Boolean forceJmDNS;
    public boolean hasInitByteSync;
    public IHostAddressAdapter hostAddressAdapter;
    public String installId;
    public boolean isInitialModeBind;
    public String lelinkAppId;
    public String lelinkAppSecret;
    public ILibraryLoader libraryLoader;
    public String licensePath;
    public String localProtocols;
    public ILogger logger;
    public IMonitor monitor;
    public IHttpNetWork netAdapter;
    public String overseasGrayConfigDomain;
    public ArrayList<String> overseasMonitorConfigUrls;
    public String overseasTokenDomain;
    public String privateChannel;
    public String projectId;
    public int serviceId;
    public String serviceName;
    public WeakReference<ISinkDataListener> sinkDataListenerRef;
    public boolean startLocalServer;
    public boolean startProxyServer;
    public boolean startUsbServer;
    public boolean startVcastServer;
    public String toBDid;
    public String userId;
    public Object wsChannelService;

    /* loaded from: classes29.dex */
    public static class Builder {
        public String aId;
        public String appId;
        public String appSecret;
        public IAudioRecordAdapter audioRecordAdapter;
        public boolean autoPlayAudio;
        public long bdlinkDiskCacheDetectIntervalMills = LivePlayEnforceIntervalSetting.DEFAULT;
        public int bdlinkSinkMessageTimeout = 5000;
        public List<IBindSdkInfoListener> bindSdkInfoListeners;
        public ICameraAdapter cameraAdapter;
        public int castProxyType;
        public int channelId;
        public String chromeCastId;
        public IAppCommonDataListener commonDataListener;
        public String deviceId;
        public DeviceOfflineDetectSettings deviceOfflineDetectSettings;
        public boolean dlnaLowPerformanceMode;
        public String dlnaSetManufacturer;
        public int dlnaSinkNotifyInterval;
        public String dlnaXMLParserKeys;
        public String domain;
        public Boolean enableBDLinkSSDPCycleSearch;
        public Boolean enableBDLinkSSDPSwitch;
        public Boolean enableBDLinkSinkBroadcast;
        public Boolean enableBDLinkSinkSSDPSwitch;
        public Boolean enableBDLinkSourceBroadcast;
        public Boolean enableBLE;
        public boolean enableCallbackData;
        public Boolean enableDLNABroadCast;
        public Boolean enableDLNACache;
        public Boolean enableDLNASearch;
        public boolean enableDebug;
        public Boolean enableDlnaNewDeviceOffline;
        public Boolean enableDlnaSinkCustomizedService;
        public Boolean enableDlnaSourceCustomizedService;
        public boolean enableFileLog;
        public boolean enablePlaying;
        public boolean enableVideoNativeDecode;
        public boolean enableWifiP2PSearch;
        public Boolean forceDnssd;
        public Boolean forceJmDNS;
        public boolean hasInitByteSync;
        public IHostAddressAdapter hostAddressAdapter;
        public String installId;
        public String lelinkAppId;
        public String lelinkAppSecret;
        public ILibraryLoader libraryLoader;
        public String licensePath;
        public String localProtocols;
        public ILogger logger;
        public IMonitor monitor;
        public IHttpNetWork netAdapter;
        public String overseasGrayConfigDomain;
        public ArrayList<String> overseasMonitorConfigUrls;
        public String overseasTokenDomain;
        public String privateChannel;
        public String projectId;
        public int serviceId;
        public String serviceName;
        public ISinkDataListener sinkDataListener;
        public boolean startLocalServer;
        public boolean startProxyServer;
        public boolean startUsbServer;
        public boolean startVcastServer;
        public String userId;
        public Object wsChannelService;

        public Config build() {
            Config config = new Config();
            config.appId = this.appId;
            config.appSecret = this.appSecret;
            config.deviceId = this.deviceId;
            config.projectId = this.projectId;
            config.enableDebug = this.enableDebug;
            config.monitor = this.monitor;
            config.logger = this.logger;
            config.libraryLoader = this.libraryLoader;
            config.hostAddressAdapter = this.hostAddressAdapter;
            config.audioRecordAdapter = this.audioRecordAdapter;
            config.cameraAdapter = this.cameraAdapter;
            config.netAdapter = this.netAdapter;
            config.lelinkAppId = this.lelinkAppId;
            config.lelinkAppSecret = this.lelinkAppSecret;
            config.privateChannel = this.privateChannel;
            config.bdlinkDiskCacheDetectIntervalMills = this.bdlinkDiskCacheDetectIntervalMills;
            config.bdlinkSinkMessageTimeout = this.bdlinkSinkMessageTimeout;
            config.dlnaXMLParserKeys = this.dlnaXMLParserKeys;
            config.dlnaSetManufacturer = this.dlnaSetManufacturer;
            config.commonDataListenerRef = new WeakReference<>(this.commonDataListener);
            config.sinkDataListenerRef = new WeakReference<>(this.sinkDataListener);
            config.enableFileLog = this.enableFileLog;
            config.autoPlayAudio = this.autoPlayAudio;
            config.enableCallbackData = this.enableCallbackData;
            config.enablePlaying = this.enablePlaying;
            config.enableVideoNativeDecode = this.enableVideoNativeDecode;
            config.startLocalServer = this.startLocalServer;
            config.startVcastServer = this.startVcastServer;
            config.startUsbServer = this.startUsbServer;
            config.startProxyServer = this.startProxyServer;
            config.domain = this.domain;
            config.castProxyType = this.castProxyType;
            config.chromeCastId = this.chromeCastId;
            config.wsChannelService = this.wsChannelService;
            config.channelId = this.channelId;
            config.aId = this.aId;
            config.installId = this.installId;
            config.serviceId = this.serviceId;
            config.hasInitByteSync = this.hasInitByteSync;
            config.localProtocols = this.localProtocols;
            config.licensePath = this.licensePath;
            config.forceDnssd = this.forceDnssd;
            config.forceJmDNS = this.forceJmDNS;
            config.enableBLE = this.enableBLE;
            config.enableDLNACache = this.enableDLNACache;
            config.enableDLNASearch = this.enableDLNASearch;
            config.enableDLNABroadCast = this.enableDLNABroadCast;
            config.enableBDLinkSinkBroadcast = this.enableBDLinkSinkBroadcast;
            config.enableBDLinkSourceBroadcast = this.enableBDLinkSourceBroadcast;
            config.enableBDLinkSSDPSwitch = this.enableBDLinkSSDPSwitch;
            config.enableBDLinkSinkSSDPSwitch = this.enableBDLinkSinkSSDPSwitch;
            config.enableBDLinkSSDPCycleSearch = this.enableBDLinkSSDPCycleSearch;
            config.addBindSdkInfoListeners(this.bindSdkInfoListeners);
            config.deviceOfflineDetectSettings = this.deviceOfflineDetectSettings;
            config.enableWifiP2PSearch = this.enableWifiP2PSearch;
            config.enableDlnaNewDeviceOffline = this.enableDlnaNewDeviceOffline;
            config.serviceName = this.serviceName;
            config.enableDlnaSourceCustomizedService = this.enableDlnaSourceCustomizedService;
            config.enableDlnaSinkCustomizedService = this.enableDlnaSinkCustomizedService;
            config.overseasTokenDomain = this.overseasTokenDomain;
            config.overseasGrayConfigDomain = this.overseasGrayConfigDomain;
            config.overseasMonitorConfigUrls = this.overseasMonitorConfigUrls;
            config.userId = this.userId;
            config.dlnaSinkNotifyInterval = this.dlnaSinkNotifyInterval;
            config.dlnaLowPerformanceMode = this.dlnaLowPerformanceMode;
            return config;
        }

        public Builder addBindSdkInfoListener(IBindSdkInfoListener iBindSdkInfoListener) {
            if (this.bindSdkInfoListeners == null) {
                this.bindSdkInfoListeners = new ArrayList();
            }
            this.bindSdkInfoListeners.add(iBindSdkInfoListener);
            return this;
        }

        public Builder enableAutoPlayAudio(boolean z) {
            this.autoPlayAudio = z;
            return this;
        }

        public Builder enableBDLinkSSDPCycleSearch(Boolean bool) {
            this.enableBDLinkSSDPCycleSearch = bool;
            return this;
        }

        public Builder enableBDLinkSSDPSwitch(Boolean bool) {
            this.enableBDLinkSSDPSwitch = bool;
            return this;
        }

        public Builder enableBDLinkSinkBroadCast(Boolean bool) {
            this.enableBDLinkSinkBroadcast = bool;
            return this;
        }

        public Builder enableBDLinkSinkSSDPSwitch(Boolean bool) {
            this.enableBDLinkSinkSSDPSwitch = bool;
            return this;
        }

        public Builder enableBDLinkSourceBroadCast(Boolean bool) {
            this.enableBDLinkSourceBroadcast = bool;
            return this;
        }

        public Builder enableBLE(Boolean bool) {
            this.enableBLE = bool;
            return this;
        }

        public Builder enableCallbackMediaStream(boolean z) {
            this.enableCallbackData = z;
            return this;
        }

        public Builder enableDLNABroadCast(Boolean bool) {
            this.enableDLNABroadCast = bool;
            return this;
        }

        public Builder enableDLNACache(Boolean bool) {
            this.enableDLNACache = bool;
            return this;
        }

        public Builder enableDLNASearch(Boolean bool) {
            this.enableDLNASearch = bool;
            return this;
        }

        public Builder enableDebug(boolean z) {
            this.enableDebug = z;
            return this;
        }

        public Builder enableFileLog(boolean z) {
            this.enableFileLog = z;
            return this;
        }

        public Builder enableForceDnssd(Boolean bool) {
            this.forceDnssd = bool;
            return this;
        }

        public Builder enableForceJmDNS(Boolean bool) {
            this.forceJmDNS = bool;
            return this;
        }

        public Builder enablePlaying(boolean z) {
            this.enablePlaying = z;
            return this;
        }

        public Builder enableStartLocalServer(boolean z) {
            this.startLocalServer = z;
            return this;
        }

        public Builder enableStartProxyServer(boolean z) {
            this.startProxyServer = z;
            return this;
        }

        public Builder enableStartUsbServer(boolean z) {
            this.startUsbServer = z;
            return this;
        }

        public Builder enableStartVcastServer(boolean z) {
            this.startVcastServer = z;
            return this;
        }

        public Builder enableVideoNativeDecode(boolean z) {
            this.enableVideoNativeDecode = z;
            return this;
        }

        public Builder enableWifiP2P(boolean z) {
            this.enableWifiP2PSearch = z;
            return this;
        }

        public Builder modifyOverseasGrayConfigDomain(String str) {
            this.overseasGrayConfigDomain = str;
            UrlUtils.setGrayConfigDomain(str);
            return this;
        }

        public Builder modifyOverseasMonitorConfigUrls(ArrayList<String> arrayList) {
            this.overseasMonitorConfigUrls = arrayList;
            UrlUtils.setDefaultMonitorConfigUrl(arrayList);
            return this;
        }

        public Builder modifyOverseasTokenDomain(String str) {
            this.overseasTokenDomain = str;
            UrlUtils.modifyOverseasTokenDomain(str);
            return this;
        }

        public Builder setAppCommonDataListener(IAppCommonDataListener iAppCommonDataListener) {
            this.commonDataListener = iAppCommonDataListener;
            return this;
        }

        public Builder setAppId(String str) {
            this.appId = str;
            return this;
        }

        public Builder setAppSecret(String str) {
            this.appSecret = str;
            return this;
        }

        public Builder setAudioRecordAdapter(IAudioRecordAdapter iAudioRecordAdapter) {
            this.audioRecordAdapter = iAudioRecordAdapter;
            return this;
        }

        public Builder setBDLinkDiskCacheDetectIntervalMills(long j) {
            this.bdlinkDiskCacheDetectIntervalMills = j;
            return this;
        }

        public Builder setBDLinkSinkMessageTimeout(int i) {
            this.bdlinkSinkMessageTimeout = i;
            return this;
        }

        public Builder setCameraAdapter(ICameraAdapter iCameraAdapter) {
            this.cameraAdapter = iCameraAdapter;
            return this;
        }

        public Builder setCastProxyType(int i) {
            this.castProxyType = i;
            return this;
        }

        public Builder setChannelId(int i) {
            this.channelId = i;
            return this;
        }

        public Builder setChromeCastId(String str) {
            this.chromeCastId = str;
            return this;
        }

        public Builder setDeviceId(String str) {
            this.deviceId = str;
            return this;
        }

        public Builder setDeviceOfflineDetectSettings(DeviceOfflineDetectSettings deviceOfflineDetectSettings) {
            this.deviceOfflineDetectSettings = deviceOfflineDetectSettings;
            return this;
        }

        public Builder setDlnaLowPerformanceMode(boolean z) {
            this.dlnaLowPerformanceMode = z;
            return this;
        }

        public Builder setDlnaSetManufacturer(String str) {
            this.dlnaSetManufacturer = str;
            return this;
        }

        public Builder setDlnaSinkNotifyInterval(int i) {
            this.dlnaSinkNotifyInterval = i;
            return this;
        }

        public Builder setDlnaXMLParserKeys(String str) {
            this.dlnaXMLParserKeys = str;
            return this;
        }

        public Builder setDomain(String str) {
            this.domain = str;
            return this;
        }

        public Builder setEnableDlnaNewDeviceOffline(Boolean bool) {
            this.enableDlnaNewDeviceOffline = bool;
            return this;
        }

        public Builder setEnableDlnaSinkCustomizedService(Boolean bool) {
            this.enableDlnaSinkCustomizedService = bool;
            return this;
        }

        public Builder setEnableDlnaSourceCustomizedService(Boolean bool) {
            this.enableDlnaSourceCustomizedService = bool;
            return this;
        }

        public Builder setHasInitByteSync(boolean z) {
            this.hasInitByteSync = z;
            return this;
        }

        public Builder setHostAddressAdapter(IHostAddressAdapter iHostAddressAdapter) {
            this.hostAddressAdapter = iHostAddressAdapter;
            return this;
        }

        public Builder setInstallId(String str) {
            this.installId = str;
            return this;
        }

        public Builder setLelinkAppId(String str) {
            this.lelinkAppId = str;
            return this;
        }

        public Builder setLelinkAppSecret(String str) {
            this.lelinkAppSecret = str;
            return this;
        }

        public Builder setLibraryLoader(ILibraryLoader iLibraryLoader) {
            this.libraryLoader = iLibraryLoader;
            return this;
        }

        public Builder setLicensePath(String str) {
            this.licensePath = str;
            return this;
        }

        public Builder setLocalProtocols(String str) {
            this.localProtocols = str;
            return this;
        }

        public Builder setLogger(ILogger iLogger) {
            this.logger = iLogger;
            return this;
        }

        public Builder setMonitor(IMonitor iMonitor) {
            this.monitor = iMonitor;
            return this;
        }

        public Builder setNetAdapter(IHttpNetWork iHttpNetWork) {
            this.netAdapter = iHttpNetWork;
            return this;
        }

        public Builder setPrivateChannel(String str) {
            this.privateChannel = str;
            return this;
        }

        public Builder setProjectId(String str) {
            this.projectId = str;
            return this;
        }

        public Builder setServiceId(int i) {
            this.serviceId = i;
            return this;
        }

        public Builder setServiceName(String str) {
            this.serviceName = str;
            return this;
        }

        public Builder setSinkDataListener(ISinkDataListener iSinkDataListener) {
            this.sinkDataListener = iSinkDataListener;
            return this;
        }

        public Builder setUserId(String str) {
            this.userId = str;
            return this;
        }

        public Builder setWsChannelService(Object obj) {
            this.wsChannelService = obj;
            return this;
        }

        public Builder setaId(String str) {
            this.aId = str;
            return this;
        }
    }

    public List<IBindSdkInfoListener> getBindSdkInfoListeners() {
        IBindSdkInfoListener iBindSdkInfoListener;
        ArrayList arrayList = new ArrayList();
        List<WeakReference<IBindSdkInfoListener>> list = this.bindSdkInfoListenerRefs;
        if (list != null && list.size() > 0) {
            for (WeakReference<IBindSdkInfoListener> weakReference : this.bindSdkInfoListenerRefs) {
                if (weakReference != null && (iBindSdkInfoListener = weakReference.get()) != null) {
                    arrayList.add(iBindSdkInfoListener);
                }
            }
        }
        return arrayList;
    }

    public IAppCommonDataListener getCommonDataListener() {
        WeakReference<IAppCommonDataListener> weakReference = this.commonDataListenerRef;
        if (weakReference != null) {
            return weakReference.get();
        }
        return null;
    }

    public String getDeviceId() {
        String str = this.deviceId;
        if (PreferenceUtils.isByteUserToB()) {
            return getToBDid();
        }
        return str;
    }

    public ISinkDataListener getSinkDataListener() {
        WeakReference<ISinkDataListener> weakReference = this.sinkDataListenerRef;
        if (weakReference != null) {
            return weakReference.get();
        }
        return null;
    }

    public String getToBDid() {
        if (TextUtils.isEmpty(this.toBDid) || TextUtils.equals("1234567890", this.toBDid)) {
            this.toBDid = PreferenceUtils.getToBCastDid("1234567890");
        }
        return this.toBDid;
    }

    public String toString() {
        return "Config[deviceId: " + this.deviceId + ", projectId: " + this.projectId + ", isInitialModeBind: " + this.isInitialModeBind + ", enableDebug: " + this.enableDebug + ", startLocalServer: " + this.startLocalServer + ", startVcastServer: " + this.startVcastServer + ", startUsbServer: " + this.startUsbServer + ", startProxyServer: " + this.startProxyServer + ", localProtocols: " + this.localProtocols + ", domain: " + this.domain + ", castProxyType: " + this.castProxyType + ", chromeCastId: " + this.chromeCastId + ", localProtocols: " + this.localProtocols + ", licensePath: " + this.licensePath + ", lelinkAppId: " + this.lelinkAppId + ", lelinkAppSecret: " + this.lelinkAppSecret + ", privateChannel: " + this.privateChannel + ", bdlinkSinkMessageTimeout: " + this.bdlinkSinkMessageTimeout + ", dlnaXMLParserKeys: " + this.dlnaXMLParserKeys + ", dlnaSetManufacturer: " + this.dlnaSetManufacturer + ", enableFileLog: " + this.enableFileLog + ", autoPlayAudio: " + this.autoPlayAudio + ", enableCallbackData: " + this.enableCallbackData + ", enablePlaying: " + this.enablePlaying + ", enableVideoNativeDecode: " + this.enableVideoNativeDecode + ", appId: " + this.appId + ", appSecret: " + this.appSecret + ", forceDnssd: " + this.forceDnssd + ", forceJmDNS: " + this.forceJmDNS + ", enableBLE: " + this.enableBLE + ", enableDLNACache: " + this.enableDLNACache + ", enableDLNASearch: " + this.enableDLNASearch + ", enableDLNABroadCast: " + this.enableDLNABroadCast + ", enableBDLinkSinkBroadcast: " + this.enableBDLinkSinkBroadcast + ", enableBDLinkSourceBroadcast: " + this.enableBDLinkSourceBroadcast + ", enableBDLinkSSDPSwitch: " + this.enableBDLinkSSDPSwitch + ", enableBDLinkSinkSSDPSwitch: " + this.enableBDLinkSinkSSDPSwitch + ", enableBDLinkSSDPCycleSearch: " + this.enableBDLinkSSDPCycleSearch + ", deviceOfflineDetectSettings: " + this.deviceOfflineDetectSettings + ", enableWifiP2PSearch: " + this.enableWifiP2PSearch + ", enableDlnaNewDeviceOffline: " + this.enableDlnaNewDeviceOffline + ", overseasTokenDomain: " + this.overseasTokenDomain + ", overseasGrayConfigDomain: " + this.overseasGrayConfigDomain + ", overseasMonitorConfigUrls: " + this.overseasMonitorConfigUrls + ", enableDlnaSourceCustomizedService: " + this.enableDlnaSourceCustomizedService + ", enableDlnaSinkCustomizedService: " + this.enableDlnaSinkCustomizedService + ", dlnaSinkNotifyInterval: " + this.dlnaSinkNotifyInterval + ", dlnaLowPerformanceMode: " + this.dlnaLowPerformanceMode + "]";
    }

    public String getAppId() {
        return this.appId;
    }

    public String getAppSecret() {
        return this.appSecret;
    }

    public IAudioRecordAdapter getAudioRecordAdapter() {
        return this.audioRecordAdapter;
    }

    public long getBDLinkDiskCacheDetectIntervalMills() {
        return this.bdlinkDiskCacheDetectIntervalMills;
    }

    public int getBdlinkSinkMessageTimeout() {
        return this.bdlinkSinkMessageTimeout;
    }

    public ICameraAdapter getCameraAdapter() {
        return this.cameraAdapter;
    }

    public int getCastProxyType() {
        return this.castProxyType;
    }

    public int getChannelId() {
        return this.channelId;
    }

    public String getChromeCastId() {
        return this.chromeCastId;
    }

    public DeviceOfflineDetectSettings getDeviceOfflineDetectSettings() {
        return this.deviceOfflineDetectSettings;
    }

    public boolean getDlnaLowPerformanceMode() {
        return this.dlnaLowPerformanceMode;
    }

    public String getDlnaSetManufacturer() {
        return this.dlnaSetManufacturer;
    }

    public int getDlnaSinkNotifyInterval() {
        return this.dlnaSinkNotifyInterval;
    }

    public String getDlnaXMLParserKeys() {
        return this.dlnaXMLParserKeys;
    }

    public String getDomain() {
        return this.domain;
    }

    public IHostAddressAdapter getHostAddressAdapter() {
        return this.hostAddressAdapter;
    }

    public String getInstallId() {
        return this.installId;
    }

    public String getLelinkAppId() {
        return this.lelinkAppId;
    }

    public String getLelinkAppSecret() {
        return this.lelinkAppSecret;
    }

    public ILibraryLoader getLibraryLoader() {
        return this.libraryLoader;
    }

    public String getLicensePath() {
        return this.licensePath;
    }

    public String getLocalProtocols() {
        return this.localProtocols;
    }

    public ILogger getLogger() {
        return this.logger;
    }

    public IMonitor getMonitor() {
        return this.monitor;
    }

    public IHttpNetWork getNetAdapter() {
        return this.netAdapter;
    }

    public String getOriginDeviceId() {
        return this.deviceId;
    }

    public String getPrivateChannel() {
        return this.privateChannel;
    }

    public String getProjectId() {
        return this.projectId;
    }

    public int getServiceId() {
        return this.serviceId;
    }

    public String getServiceName() {
        return this.serviceName;
    }

    public String getUserId() {
        return this.userId;
    }

    public Object getWsChannelService() {
        return this.wsChannelService;
    }

    public String getaId() {
        return this.aId;
    }

    public boolean isAutoPlayAudio() {
        return this.autoPlayAudio;
    }

    public Boolean isEnableBDLinkSSDPCycleSearch() {
        return this.enableBDLinkSSDPCycleSearch;
    }

    public Boolean isEnableBDLinkSSDPSwitch() {
        return this.enableBDLinkSSDPSwitch;
    }

    public Boolean isEnableBDLinkSinkBroadcast() {
        return this.enableBDLinkSinkBroadcast;
    }

    public Boolean isEnableBDLinkSinkSSDPSwitch() {
        return this.enableBDLinkSinkSSDPSwitch;
    }

    public Boolean isEnableBDLinkSourceBroadcast() {
        return this.enableBDLinkSourceBroadcast;
    }

    public Boolean isEnableBLE() {
        return this.enableBLE;
    }

    public boolean isEnableCallbackData() {
        return this.enableCallbackData;
    }

    public Boolean isEnableDLNABroadCast() {
        return this.enableDLNABroadCast;
    }

    public Boolean isEnableDLNACache() {
        return this.enableDLNACache;
    }

    public Boolean isEnableDLNASearch() {
        return this.enableDLNASearch;
    }

    public boolean isEnableDebug() {
        return this.enableDebug;
    }

    public Boolean isEnableDlnaSinkCustomizedService() {
        return this.enableDlnaSinkCustomizedService;
    }

    public Boolean isEnableDlnaSourceCustomizedService() {
        return this.enableDlnaSourceCustomizedService;
    }

    public boolean isEnableFileLog() {
        return this.enableFileLog;
    }

    public Boolean isEnableNewDlnaDeviceOffline() {
        return this.enableDlnaNewDeviceOffline;
    }

    public boolean isEnablePlaying() {
        return this.enablePlaying;
    }

    public boolean isEnableVideoNativeDecode() {
        return this.enableVideoNativeDecode;
    }

    public boolean isEnableWifiP2PSearch() {
        return this.enableWifiP2PSearch;
    }

    public Boolean isForceDnssd() {
        return this.forceDnssd;
    }

    public Boolean isForceJmDNS() {
        return this.forceJmDNS;
    }

    public boolean isHasInitByteSync() {
        return this.hasInitByteSync;
    }

    public boolean isInitialModeBind() {
        return this.isInitialModeBind;
    }

    public boolean isStartLocalServer() {
        return this.startLocalServer;
    }

    public boolean isStartProxyServer() {
        return this.startProxyServer;
    }

    public boolean isStartUsbServer() {
        return this.startUsbServer;
    }

    public boolean isStartVcastServer() {
        return this.startVcastServer;
    }

    public void addBindSdkInfoListener(IBindSdkInfoListener iBindSdkInfoListener) {
        if (this.bindSdkInfoListenerRefs == null) {
            this.bindSdkInfoListenerRefs = new ArrayList();
        }
        this.bindSdkInfoListenerRefs.add(new WeakReference<>(iBindSdkInfoListener));
    }

    public void addBindSdkInfoListeners(List<IBindSdkInfoListener> list) {
        if (list == null || list.isEmpty()) {
            return;
        }
        Iterator<IBindSdkInfoListener> it = list.iterator();
        while (it.hasNext()) {
            addBindSdkInfoListener(it.next());
        }
    }

    public void enableWifiP2PSearch(boolean z) {
        this.enableWifiP2PSearch = z;
    }

    public void setAppId(String str) {
        this.appId = str;
    }

    public void setAppSecret(String str) {
        this.appSecret = str;
    }

    public void setAudioRecordAdapter(IAudioRecordAdapter iAudioRecordAdapter) {
        this.audioRecordAdapter = iAudioRecordAdapter;
    }

    public void setAutoPlayAudio(boolean z) {
        this.autoPlayAudio = z;
    }

    public void setCameraAdapter(ICameraAdapter iCameraAdapter) {
        this.cameraAdapter = iCameraAdapter;
    }

    public void setChannelId(int i) {
        this.channelId = i;
    }

    public void setChromeCastId(String str) {
        this.chromeCastId = str;
    }

    public void setCommonDataListener(IAppCommonDataListener iAppCommonDataListener) {
        this.commonDataListenerRef = new WeakReference<>(iAppCommonDataListener);
    }

    public void setDebugMode(boolean z) {
        this.enableDebug = z;
    }

    public void setDeviceId(String str) {
        this.deviceId = str;
    }

    public void setDeviceOfflineDetectSettings(DeviceOfflineDetectSettings deviceOfflineDetectSettings) {
        this.deviceOfflineDetectSettings = deviceOfflineDetectSettings;
    }

    public void setDlnaSetManufacturer(String str) {
        this.dlnaSetManufacturer = str;
    }

    public void setDlnaXMLParserKeys(String str) {
        this.dlnaXMLParserKeys = str;
    }

    public void setEnableBDLinkSSDPCycleSearch(Boolean bool) {
        this.enableBDLinkSSDPCycleSearch = bool;
    }

    public void setEnableBDLinkSSDPSwitch(Boolean bool) {
        this.enableBDLinkSSDPSwitch = bool;
    }

    public void setEnableBDLinkSinkBroadcast(Boolean bool) {
        this.enableBDLinkSinkBroadcast = bool;
    }

    public void setEnableBDLinkSinkSSDPSwitch(Boolean bool) {
        this.enableBDLinkSinkSSDPSwitch = bool;
    }

    public void setEnableBDLinkSourceBroadcast(Boolean bool) {
        this.enableBDLinkSourceBroadcast = bool;
    }

    public void setEnableBLE(Boolean bool) {
        this.enableBLE = bool;
    }

    public void setEnableCallbackData(boolean z) {
        this.enableCallbackData = z;
    }

    public void setEnableDLNABroadCast(Boolean bool) {
        this.enableDLNABroadCast = bool;
    }

    public void setEnableDLNACache(Boolean bool) {
        this.enableDLNACache = bool;
    }

    public void setEnableDLNASearch(Boolean bool) {
        this.enableDLNASearch = bool;
    }

    public void setEnableDlnaNewDeviceOffline(Boolean bool) {
        this.enableDlnaNewDeviceOffline = bool;
    }

    public void setEnableFileLog(boolean z) {
        this.enableFileLog = z;
    }

    public void setEnablePlaying(boolean z) {
        this.enablePlaying = z;
    }

    public void setEnableVideoNativeDecode(boolean z) {
        this.enableVideoNativeDecode = z;
    }

    public void setForceDnssd(Boolean bool) {
        this.forceDnssd = bool;
    }

    public void setForceJmDNS(Boolean bool) {
        this.forceJmDNS = bool;
    }

    public void setHasInitByteSync(boolean z) {
        this.hasInitByteSync = z;
    }

    public void setHostAddressAdapter(IHostAddressAdapter iHostAddressAdapter) {
        this.hostAddressAdapter = iHostAddressAdapter;
    }

    public void setInitialMode(boolean z) {
        this.isInitialModeBind = z;
    }

    public void setInstallId(String str) {
        this.installId = str;
    }

    public void setLelinkAppId(String str) {
        this.lelinkAppId = str;
    }

    public void setLelinkAppSecret(String str) {
        this.lelinkAppSecret = str;
    }

    public void setLibraryLoader(ILibraryLoader iLibraryLoader) {
        this.libraryLoader = iLibraryLoader;
    }

    public void setLocalProtocols(String str) {
        this.localProtocols = str;
    }

    public void setLogger(ILogger iLogger) {
        this.logger = iLogger;
    }

    public void setMonitor(IMonitor iMonitor) {
        this.monitor = iMonitor;
    }

    public void setNetAdapter(IHttpNetWork iHttpNetWork) {
        this.netAdapter = iHttpNetWork;
    }

    public void setPrivateChannel(String str) {
        this.privateChannel = str;
    }

    public void setProjectId(String str) {
        this.projectId = str;
    }

    public void setServiceId(int i) {
        this.serviceId = i;
    }

    public void setServiceName(String str) {
        this.serviceName = str;
    }

    public void setSinkDataListener(ISinkDataListener iSinkDataListener) {
        this.sinkDataListenerRef = new WeakReference<>(iSinkDataListener);
    }

    public void setStartLocalServer(boolean z) {
        this.startLocalServer = z;
    }

    public void setStartProxyServer(boolean z) {
        this.startProxyServer = z;
    }

    public void setStartUsbServer(boolean z) {
        this.startUsbServer = z;
    }

    public void setStartVcastServer(boolean z) {
        this.startVcastServer = z;
    }

    public void setWsChannelService(Object obj) {
        this.wsChannelService = obj;
    }

    public void setaId(String str) {
        this.aId = str;
    }
}
