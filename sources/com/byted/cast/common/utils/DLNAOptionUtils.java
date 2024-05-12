package com.byted.cast.common.utils;

import X.C16880lQ;
import X.X1D;
import com.byted.cast.common.CastLogger;
import com.byted.cast.common.ContextManager;
import com.byted.cast.common.bean.DeviceOfflineDetectSettings;
import com.byted.cast.common.config.ConfigManager;
import com.bytedance.mt.protector.impl.string2number.CastIntegerProtector;

/* loaded from: classes29.dex */
public class DLNAOptionUtils {
    public static final String TAG = C16880lQ.LJLLJ(DLNAOptionUtils.class);

    public static long getBdlinkDeviceOfflineDetectInterval() {
        return getBdlinkDeviceOfflineDetectInterval(null);
    }

    public static int getDlnaOfflineInterval() {
        return getDlnaOfflineInterval(null);
    }

    public static boolean isEnableBdlinkDiskCache() {
        return isEnableBdlinkDiskCache(null);
    }

    public static boolean isEnableBdlinkQuickQuery() {
        return isEnableBdlinkQuickQuery(null);
    }

    public static boolean isEnableBroadcastSearch() {
        return isEnableBroadcastSearch(null);
    }

    public static boolean isEnableCache() {
        return isEnableCache(null);
    }

    public static boolean isEnableDeviceOffline() {
        return isEnableDeviceOffline(null);
    }

    public static boolean isEnableMdnsSearch() {
        return isEnableMdnsSearch(null);
    }

    public static boolean isEnableSearch() {
        return isEnableSearch(null);
    }

    public static boolean isEnableSinkSsdpServer() {
        return isEnableSinkSsdpServer(null);
    }

    public static boolean isEnableSsdpCycleSearch() {
        return isEnableSsdpCycleSearch(null);
    }

    public static boolean isEnableSsdpSearch() {
        return isEnableSsdpSearch(null);
    }

    public static int getDlnaSinkNotifyInterval() {
        int dlnaSinkNotifyInterval = ConfigManager.getInstance().getInitConfig().getDlnaSinkNotifyInterval();
        CastLogger logger = ContextManager.getLogger(null);
        String str = TAG;
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("dlnaSinkNotifyInterval is : ");
        LIZ.append(dlnaSinkNotifyInterval);
        logger.d(str, X1D.LIZIZ(LIZ));
        return dlnaSinkNotifyInterval;
    }

    public static boolean isOpenDlnaLowPerformanceMode() {
        boolean dlnaLowPerformanceMode = ConfigManager.getInstance().getInitConfig().getDlnaLowPerformanceMode();
        CastLogger logger = ContextManager.getLogger(null);
        String str = TAG;
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("isOpenDlnaLowPerformanceMode is : ");
        LIZ.append(dlnaLowPerformanceMode);
        logger.d(str, X1D.LIZIZ(LIZ));
        return dlnaLowPerformanceMode;
    }

    public static long getBdlinkDeviceOfflineDetectInterval(ContextManager.CastContext castContext) {
        ConfigManager configManager;
        if (castContext == null) {
            configManager = ConfigManager.getInstance();
        } else {
            configManager = ContextManager.getConfigManager(castContext);
        }
        DeviceOfflineDetectSettings deviceOfflineDetectSettings = configManager.getInitConfig().getDeviceOfflineDetectSettings();
        if (deviceOfflineDetectSettings != null) {
            long detectIntervalMills = deviceOfflineDetectSettings.getDetectIntervalMills();
            if (detectIntervalMills > 0) {
                return detectIntervalMills;
            }
        }
        try {
            if (configManager.getRemoteGrayConfig("ByteCast.BdlinkOfflineInterval") instanceof String) {
                return CastIntegerProtector.parseInt((String) r1) * 1000;
            }
            return 30000L;
        } catch (NumberFormatException e) {
            e.printStackTrace();
            return 30000L;
        }
    }

    public static int getDlnaOfflineInterval(ContextManager.CastContext castContext) {
        ConfigManager configManager;
        if (castContext == null) {
            configManager = ConfigManager.getInstance();
        } else {
            configManager = ContextManager.getConfigManager(castContext);
        }
        Object remoteGrayConfig = configManager.getRemoteGrayConfig("ByteCast.DlnaOfflineInterval");
        try {
            if (remoteGrayConfig instanceof String) {
                return CastIntegerProtector.parseInt((String) remoteGrayConfig);
            }
            return 60;
        } catch (NumberFormatException e) {
            e.printStackTrace();
            return 60;
        }
    }

    public static boolean isEnableBdlinkDiskCache(ContextManager.CastContext castContext) {
        ConfigManager configManager;
        if (castContext == null) {
            configManager = ConfigManager.getInstance();
        } else {
            configManager = ContextManager.getConfigManager(castContext);
        }
        return configManager.getRemoteGrayConfigByBoolean("ByteCast.BdlinkEnableDiskCache", false);
    }

    public static boolean isEnableBdlinkQuickQuery(ContextManager.CastContext castContext) {
        ConfigManager configManager;
        if (castContext == null) {
            configManager = ConfigManager.getInstance();
        } else {
            configManager = ContextManager.getConfigManager(castContext);
        }
        return configManager.getRemoteGrayConfigByBoolean("ByteCast.BdlinkEnableQuickQuery", false);
    }

    public static boolean isEnableBroadcastSearch(ContextManager.CastContext castContext) {
        ConfigManager configManager;
        if (castContext == null) {
            configManager = ConfigManager.getInstance();
        } else {
            configManager = ContextManager.getConfigManager(castContext);
        }
        Boolean isEnableDLNABroadCast = configManager.getInitConfig().isEnableDLNABroadCast();
        if (isEnableDLNABroadCast != null) {
            return isEnableDLNABroadCast.booleanValue();
        }
        Boolean optionByBoolean = configManager.getOptionByBoolean(10043);
        if (optionByBoolean == null) {
            return configManager.getRemoteGrayConfigByBoolean("ByteCast.EnableBroadCastSearch", false);
        }
        return optionByBoolean.booleanValue();
    }

    public static boolean isEnableCache(ContextManager.CastContext castContext) {
        ConfigManager configManager;
        if (castContext == null) {
            configManager = ConfigManager.getInstance();
        } else {
            configManager = ContextManager.getConfigManager(castContext);
        }
        Boolean isEnableDLNACache = configManager.getInitConfig().isEnableDLNACache();
        if (isEnableDLNACache != null) {
            return isEnableDLNACache.booleanValue();
        }
        Boolean optionByBoolean = configManager.getOptionByBoolean(10037);
        if (optionByBoolean == null) {
            return configManager.getRemoteGrayConfigByBoolean("ByteCast.DLNACache", false);
        }
        return optionByBoolean.booleanValue();
    }

    public static boolean isEnableDeviceOffline(ContextManager.CastContext castContext) {
        ConfigManager configManager;
        if (castContext == null) {
            configManager = ConfigManager.getInstance();
        } else {
            configManager = ContextManager.getConfigManager(castContext);
        }
        DeviceOfflineDetectSettings deviceOfflineDetectSettings = configManager.getInitConfig().getDeviceOfflineDetectSettings();
        if (deviceOfflineDetectSettings != null) {
            return deviceOfflineDetectSettings.isEnableDetect();
        }
        return configManager.getRemoteGrayConfigByBoolean("ByteCast.EnableDeviceOffline", false);
    }

    public static boolean isEnableDlnaSinkCustomizedService(ContextManager.CastContext castContext) {
        ConfigManager configManager;
        if (castContext == null) {
            configManager = ConfigManager.getInstance();
        } else {
            configManager = ContextManager.getConfigManager(castContext);
        }
        Boolean isEnableDlnaSinkCustomizedService = configManager.getInitConfig().isEnableDlnaSinkCustomizedService();
        CastLogger logger = ContextManager.getLogger(castContext);
        String str = TAG;
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("isEnableDlnaSinkCustomizedService is : ");
        LIZ.append(isEnableDlnaSinkCustomizedService);
        logger.d(str, X1D.LIZIZ(LIZ));
        if (isEnableDlnaSinkCustomizedService != null) {
            return isEnableDlnaSinkCustomizedService.booleanValue();
        }
        return false;
    }

    public static boolean isEnableDlnaSourceCustomizedService(ContextManager.CastContext castContext) {
        ConfigManager configManager;
        if (castContext == null) {
            configManager = ConfigManager.getInstance();
        } else {
            configManager = ContextManager.getConfigManager(castContext);
        }
        Boolean isEnableDlnaSourceCustomizedService = configManager.getInitConfig().isEnableDlnaSourceCustomizedService();
        CastLogger logger = ContextManager.getLogger(castContext);
        String str = TAG;
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("isEnableDlnaSourceCustomizedService is : ");
        LIZ.append(isEnableDlnaSourceCustomizedService);
        logger.d(str, X1D.LIZIZ(LIZ));
        if (isEnableDlnaSourceCustomizedService != null) {
            return isEnableDlnaSourceCustomizedService.booleanValue();
        }
        return false;
    }

    public static boolean isEnableMdnsSearch(ContextManager.CastContext castContext) {
        ConfigManager configManager;
        if (castContext == null) {
            configManager = ConfigManager.getInstance();
        } else {
            configManager = ContextManager.getConfigManager(castContext);
        }
        Boolean optionByBoolean = configManager.getOptionByBoolean(10082);
        CastLogger logger = ContextManager.getLogger(castContext);
        String str = TAG;
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("localEnableMdnsSearch is : ");
        LIZ.append(optionByBoolean);
        logger.d(str, X1D.LIZIZ(LIZ));
        if (optionByBoolean == null) {
            return true;
        }
        return optionByBoolean.booleanValue();
    }

    public static boolean isEnableNewDlnaDeviceOffline(ContextManager.CastContext castContext) {
        ConfigManager configManager;
        if (castContext == null) {
            configManager = ConfigManager.getInstance();
        } else {
            configManager = ContextManager.getConfigManager(castContext);
        }
        Boolean isEnableNewDlnaDeviceOffline = configManager.getInitConfig().isEnableNewDlnaDeviceOffline();
        CastLogger logger = ContextManager.getLogger(castContext);
        String str = TAG;
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("localEnableNewDlnaDeviceOffline is : ");
        LIZ.append(isEnableNewDlnaDeviceOffline);
        logger.d(str, X1D.LIZIZ(LIZ));
        if (isEnableNewDlnaDeviceOffline != null) {
            return isEnableNewDlnaDeviceOffline.booleanValue();
        }
        return configManager.getRemoteGrayConfigByBoolean("ByteCast.EnableDlnaNewDeviceOffline", false);
    }

    public static boolean isEnableSearch(ContextManager.CastContext castContext) {
        ConfigManager configManager;
        if (castContext == null) {
            configManager = ConfigManager.getInstance();
        } else {
            configManager = ContextManager.getConfigManager(castContext);
        }
        Boolean isEnableDLNASearch = configManager.getInitConfig().isEnableDLNASearch();
        if (isEnableDLNASearch != null) {
            return isEnableDLNASearch.booleanValue();
        }
        Boolean optionByBoolean = configManager.getOptionByBoolean(10038);
        if (optionByBoolean == null) {
            return configManager.getRemoteGrayConfigByBoolean("ByteCast.DLNASearch", false);
        }
        return optionByBoolean.booleanValue();
    }

    public static boolean isEnableSinkBDLinkSSDPBroadcast(ContextManager.CastContext castContext) {
        ConfigManager configManager;
        if (castContext == null) {
            configManager = ConfigManager.getInstance();
        } else {
            configManager = ContextManager.getConfigManager(castContext);
        }
        Boolean isEnableBDLinkSinkBroadcast = configManager.getInitConfig().isEnableBDLinkSinkBroadcast();
        CastLogger logger = ContextManager.getLogger(castContext);
        String str = TAG;
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("sink localEnableBroadcast is : ");
        LIZ.append(isEnableBDLinkSinkBroadcast);
        logger.d(str, X1D.LIZIZ(LIZ));
        if (isEnableBDLinkSinkBroadcast != null) {
            return isEnableBDLinkSinkBroadcast.booleanValue();
        }
        return configManager.getRemoteGrayConfigByBoolean("ByteCast.EnableSinkBDLinkSsdpBroadcast", false);
    }

    public static boolean isEnableSinkSsdpServer(ContextManager.CastContext castContext) {
        ConfigManager configManager;
        if (castContext == null) {
            configManager = ConfigManager.getInstance();
        } else {
            configManager = ContextManager.getConfigManager(castContext);
        }
        Boolean isEnableBDLinkSinkSSDPSwitch = configManager.getInitConfig().isEnableBDLinkSinkSSDPSwitch();
        CastLogger logger = ContextManager.getLogger(castContext);
        String str = TAG;
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("localEnableSsdpServer is : ");
        LIZ.append(isEnableBDLinkSinkSSDPSwitch);
        logger.d(str, X1D.LIZIZ(LIZ));
        if (isEnableBDLinkSinkSSDPSwitch == null) {
            return configManager.getRemoteGrayConfigByBoolean("ByteCast.EnableSinkSsdp", false);
        }
        return isEnableBDLinkSinkSSDPSwitch.booleanValue();
    }

    public static boolean isEnableSourceBDLinkIpv6(ContextManager.CastContext castContext) {
        Boolean optionByBoolean = ConfigManager.getInstance().getOptionByBoolean(10084);
        CastLogger logger = ContextManager.getLogger(castContext);
        String str = TAG;
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("localEnableBDLinkIpv6 is : ");
        LIZ.append(optionByBoolean);
        logger.d(str, X1D.LIZIZ(LIZ));
        if (optionByBoolean == null) {
            return ConfigManager.getInstance().getRemoteGrayConfigByBoolean("ByteCast.EnableSourceBDLinkIPv6", true);
        }
        return optionByBoolean.booleanValue();
    }

    public static boolean isEnableSourceBDLinkSSDPBroadcast(ContextManager.CastContext castContext) {
        ConfigManager configManager;
        if (castContext == null) {
            configManager = ConfigManager.getInstance();
        } else {
            configManager = ContextManager.getConfigManager(castContext);
        }
        Boolean isEnableBDLinkSourceBroadcast = configManager.getInitConfig().isEnableBDLinkSourceBroadcast();
        CastLogger logger = ContextManager.getLogger(castContext);
        String str = TAG;
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("source localEnableBroadcast is : ");
        LIZ.append(isEnableBDLinkSourceBroadcast);
        logger.d(str, X1D.LIZIZ(LIZ));
        if (isEnableBDLinkSourceBroadcast != null) {
            return isEnableBDLinkSourceBroadcast.booleanValue();
        }
        return configManager.getRemoteGrayConfigByBoolean("ByteCast.EnableSourceBDLinkSsdpBroadcast", false);
    }

    public static boolean isEnableSourceDlnaIpv6(ContextManager.CastContext castContext) {
        Boolean optionByBoolean = ConfigManager.getInstance().getOptionByBoolean(10084);
        CastLogger logger = ContextManager.getLogger(castContext);
        String str = TAG;
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("localEnableDlnaIpv6 is : ");
        LIZ.append(optionByBoolean);
        logger.d(str, X1D.LIZIZ(LIZ));
        if (optionByBoolean == null) {
            return ConfigManager.getInstance().getRemoteGrayConfigByBoolean("ByteCast.EnableSourceDlnaIPv6", false);
        }
        return optionByBoolean.booleanValue();
    }

    public static boolean isEnableSsdpCycleSearch(ContextManager.CastContext castContext) {
        ConfigManager configManager;
        if (castContext == null) {
            configManager = ConfigManager.getInstance();
        } else {
            configManager = ContextManager.getConfigManager(castContext);
        }
        Boolean isEnableBDLinkSSDPCycleSearch = configManager.getInitConfig().isEnableBDLinkSSDPCycleSearch();
        CastLogger logger = ContextManager.getLogger(castContext);
        String str = TAG;
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("localEnableSsdpCycleSearch is : ");
        LIZ.append(isEnableBDLinkSSDPCycleSearch);
        logger.d(str, X1D.LIZIZ(LIZ));
        if (isEnableBDLinkSSDPCycleSearch == null) {
            return configManager.getRemoteGrayConfigByBoolean("ByteCast.EnableSsdpCycleSearch", false);
        }
        return isEnableBDLinkSSDPCycleSearch.booleanValue();
    }

    public static boolean isEnableSsdpSearch(ContextManager.CastContext castContext) {
        ConfigManager configManager;
        if (castContext == null) {
            configManager = ConfigManager.getInstance();
        } else {
            configManager = ContextManager.getConfigManager(castContext);
        }
        Boolean isEnableBDLinkSSDPSwitch = configManager.getInitConfig().isEnableBDLinkSSDPSwitch();
        CastLogger logger = ContextManager.getLogger(castContext);
        String str = TAG;
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("localEnableSsdpSearch is : ");
        LIZ.append(isEnableBDLinkSSDPSwitch);
        logger.d(str, X1D.LIZIZ(LIZ));
        if (isEnableBDLinkSSDPSwitch == null) {
            return configManager.getRemoteGrayConfigByBoolean("ByteCast.EnableSsdpSearch", false);
        }
        return isEnableBDLinkSSDPSwitch.booleanValue();
    }
}
