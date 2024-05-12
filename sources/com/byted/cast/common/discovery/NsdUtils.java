package com.byted.cast.common.discovery;

import X.C16880lQ;
import X.X1D;
import com.byted.cast.common.ContextManager;
import com.byted.cast.common.Logger;
import com.byted.cast.common.config.ConfigManager;
import com.byted.cast.common.discovery.NsdFactory;

/* loaded from: classes29.dex */
public class NsdUtils {
    public static final String TAG = C16880lQ.LJLLJ(NsdUtils.class);
    public static Boolean sIsDNSSDClassExists = null;
    public static Boolean sIsJmDNSClassExists = null;

    public static NsdFactory.Type getNsdType() {
        return getNsdType(null);
    }

    public static boolean isDnssdEnabledFromGrayConfig() {
        return isDnssdEnabledFromGrayConfig(null);
    }

    public static boolean isDnssdEnabledFromLocalConfig() {
        return isDnssdEnabledFromLocalConfig(null);
    }

    public static boolean isEnableDnssd() {
        return isEnableDnssd(null);
    }

    public static boolean isEnableJmDNS() {
        return isEnableJmDNS(null);
    }

    public static boolean isJmDNSEnabledFromGrayConfig() {
        return isJmDNSEnabledFromGrayConfig(null);
    }

    public static boolean isJmDNSEnabledFromLocalConfig() {
        return isJmDNSEnabledFromLocalConfig(null);
    }

    public static NsdFactory.Type getNsdType(ContextManager.CastContext castContext) {
        boolean isDnssdEnabledFromGrayConfig = isDnssdEnabledFromGrayConfig(castContext);
        boolean isDnssdEnabledFromLocalConfig = isDnssdEnabledFromLocalConfig(castContext);
        if (sIsDNSSDClassExists == null) {
            try {
                Class.forName("com.byted.cast.dnssd.DNSSD");
                sIsDNSSDClassExists = Boolean.TRUE;
            } catch (Exception e) {
                String str = TAG;
                StringBuilder LIZ = X1D.LIZ();
                LIZ.append("can't find class DNSSD: ");
                LIZ.append(e.getMessage());
                Logger.w(str, X1D.LIZIZ(LIZ));
                sIsDNSSDClassExists = Boolean.FALSE;
            }
        }
        String str2 = TAG;
        StringBuilder LIZ2 = X1D.LIZ();
        LIZ2.append("getNsdType enableDnssd=");
        LIZ2.append(isDnssdEnabledFromGrayConfig);
        LIZ2.append(", forceDnssd=");
        LIZ2.append(isDnssdEnabledFromLocalConfig);
        LIZ2.append(", sIsDNSSDClassExists=");
        LIZ2.append(sIsDNSSDClassExists);
        Logger.e(str2, X1D.LIZIZ(LIZ2));
        boolean isJmDNSEnabledFromGrayConfig = isJmDNSEnabledFromGrayConfig(castContext);
        boolean isJmDNSEnabledFromLocalConfig = isJmDNSEnabledFromLocalConfig(castContext);
        if (sIsJmDNSClassExists == null) {
            try {
                Class.forName("javax.jmdns.JmDNS");
                Logger.i(str2, "JmDNS exists");
                sIsJmDNSClassExists = Boolean.TRUE;
            } catch (Exception e2) {
                String str3 = TAG;
                StringBuilder LIZ3 = X1D.LIZ();
                LIZ3.append("can't find class JmDNS: ");
                LIZ3.append(e2.getMessage());
                Logger.w(str3, X1D.LIZIZ(LIZ3));
                sIsJmDNSClassExists = Boolean.FALSE;
            }
        }
        String str4 = TAG;
        StringBuilder LIZ4 = X1D.LIZ();
        LIZ4.append("getNsdType enableJmDNS=");
        LIZ4.append(isJmDNSEnabledFromGrayConfig);
        LIZ4.append(", forceJmDNS=");
        LIZ4.append(isJmDNSEnabledFromLocalConfig);
        LIZ4.append(", sIsJmDNSClassExists=");
        LIZ4.append(sIsJmDNSClassExists);
        Logger.e(str4, X1D.LIZIZ(LIZ4));
        if (sIsJmDNSClassExists.booleanValue() && (isJmDNSEnabledFromGrayConfig || isJmDNSEnabledFromLocalConfig)) {
            return NsdFactory.Type.TypeJmDNS;
        }
        if (sIsDNSSDClassExists.booleanValue() && (isDnssdEnabledFromGrayConfig || isDnssdEnabledFromLocalConfig)) {
            return NsdFactory.Type.TypeDnssd;
        }
        return NsdFactory.Type.TypeNsdManager;
    }

    public static boolean isDnssdEnabledFromGrayConfig(ContextManager.CastContext castContext) {
        ConfigManager configManager;
        if (castContext == null) {
            configManager = ConfigManager.getInstance();
        } else {
            configManager = ContextManager.getConfigManager(castContext);
        }
        return configManager.getRemoteGrayConfigByBoolean("ByteCast.EnableDnssd", false);
    }

    public static boolean isDnssdEnabledFromLocalConfig(ContextManager.CastContext castContext) {
        ConfigManager configManager;
        if (castContext == null) {
            configManager = ConfigManager.getInstance();
        } else {
            configManager = ContextManager.getConfigManager(castContext);
        }
        if (!Boolean.TRUE.equals(configManager.getInitConfig().isForceDnssd()) && !configManager.getOptionByBoolean(10033, false)) {
            return false;
        }
        return true;
    }

    public static boolean isEnableDnssd(ContextManager.CastContext castContext) {
        if (getNsdType(castContext) == NsdFactory.Type.TypeDnssd) {
            return true;
        }
        return false;
    }

    public static boolean isEnableJmDNS(ContextManager.CastContext castContext) {
        if (getNsdType(castContext) == NsdFactory.Type.TypeJmDNS) {
            return true;
        }
        return false;
    }

    public static boolean isJmDNSEnabledFromGrayConfig(ContextManager.CastContext castContext) {
        ConfigManager configManager;
        if (castContext == null) {
            configManager = ConfigManager.getInstance();
        } else {
            configManager = ContextManager.getConfigManager(castContext);
        }
        return configManager.getRemoteGrayConfigByBoolean("ByteCast.EnableJmDNS", false);
    }

    public static boolean isJmDNSEnabledFromLocalConfig(ContextManager.CastContext castContext) {
        ConfigManager configManager;
        if (castContext == null) {
            configManager = ConfigManager.getInstance();
        } else {
            configManager = ContextManager.getConfigManager(castContext);
        }
        if (!Boolean.TRUE.equals(configManager.getInitConfig().isForceJmDNS()) && !configManager.getOptionByBoolean(10074, false)) {
            return false;
        }
        return true;
    }
}
