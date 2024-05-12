package com.byted.cast.common;

import X.X1D;
import android.text.TextUtils;
import com.byted.cast.common.auth.license.AuthManager;
import com.byted.cast.common.config.ConfigManager;
import java.util.concurrent.ConcurrentHashMap;

/* loaded from: classes29.dex */
public final class ContextManager {
    public static final ConcurrentHashMap<CastContext, AuthManager> sAuthManagerMap = new ConcurrentHashMap<>();
    public static final ConcurrentHashMap<CastContext, ConfigManager> sConfigManagerMap = new ConcurrentHashMap<>();
    public static final ConcurrentHashMap<CastContext, CastLogger> sLoggerMap = new ConcurrentHashMap<>();
    public static final ConcurrentHashMap<CastContext, CastMonitor> sMonitorMap = new ConcurrentHashMap<>();
    public static final ConcurrentHashMap<CastContext, TeaEventTrack> sTeaEventTrackMap = new ConcurrentHashMap<>();
    public static final ConcurrentHashMap<CastContext, DeviceInfoManager> sDeviceInfoManagerMap = new ConcurrentHashMap<>();
    public static final Object sAuthLock = new Object();
    public static final Object sConfigLock = new Object();
    public static final Object sLoggerLock = new Object();
    public static final Object sMonitorLock = new Object();
    public static final Object sTeaEventTrackLock = new Object();
    public static final Object sDeviceInfoManagerLock = new Object();

    /* loaded from: classes29.dex */
    public static final class CastContext {
        public int httpPort;
        public final String mContextId;
        public boolean mIsBleBrowse;
        public boolean mIsBlePublish;
        public String mProjectId;
        public final String mRealContextId;

        public int hashCode() {
            String str = this.mContextId;
            if (str != null) {
                return str.hashCode();
            }
            return 0;
        }

        public String toString() {
            StringBuilder LIZ = X1D.LIZ();
            LIZ.append("CastContext: ");
            LIZ.append(this.mContextId);
            return X1D.LIZIZ(LIZ);
        }

        public String getContextId() {
            return this.mContextId;
        }

        public int getHttpPort() {
            return this.httpPort;
        }

        public String getProjectId() {
            return this.mProjectId;
        }

        public String getRealContextId() {
            return this.mRealContextId;
        }

        public boolean isBleBrowse() {
            return this.mIsBleBrowse;
        }

        public boolean isBlePublish() {
            return this.mIsBlePublish;
        }

        public CastContext(String str) {
            String str2;
            if (!TextUtils.isEmpty(str)) {
                this.mContextId = str;
                String[] split = str.split("_");
                if (split.length > 1) {
                    str2 = split[1];
                } else {
                    str2 = "";
                }
                this.mRealContextId = str2;
                return;
            }
            throw new IllegalArgumentException("contextId couldn't be null");
        }

        public boolean equals(Object obj) {
            if ((obj instanceof CastContext) && TextUtils.equals(((CastContext) obj).mContextId, this.mContextId)) {
                return true;
            }
            return false;
        }

        public void setBleBrowse(boolean z) {
            this.mIsBleBrowse = z;
        }

        public void setBlePublish(boolean z) {
            this.mIsBlePublish = z;
        }

        public void setHttpPort(int i) {
            this.httpPort = i;
        }

        public void setProjectId(String str) {
            this.mProjectId = str;
        }
    }

    public static void clear(CastContext castContext) {
    }

    public static AuthManager getAuthManager(CastContext castContext) {
        if (castContext == null) {
            return AuthManager.getInstance();
        }
        ConcurrentHashMap<CastContext, AuthManager> concurrentHashMap = sAuthManagerMap;
        if (concurrentHashMap.get(castContext) == null) {
            synchronized (sAuthLock) {
                if (concurrentHashMap.get(castContext) == null) {
                    concurrentHashMap.put(castContext, AuthManager.createInstance(castContext));
                }
            }
        }
        return concurrentHashMap.get(castContext);
    }

    public static ConfigManager getConfigManager(CastContext castContext) {
        if (castContext == null) {
            return ConfigManager.getInstance();
        }
        ConcurrentHashMap<CastContext, ConfigManager> concurrentHashMap = sConfigManagerMap;
        if (concurrentHashMap.get(castContext) == null) {
            synchronized (sConfigLock) {
                if (concurrentHashMap.get(castContext) == null) {
                    concurrentHashMap.put(castContext, ConfigManager.createInstance(castContext));
                }
            }
        }
        return concurrentHashMap.get(castContext);
    }

    public static DeviceInfoManager getDeviceInfoManager(CastContext castContext) {
        if (castContext == null) {
            return DeviceInfoManager.getInstance();
        }
        ConcurrentHashMap<CastContext, DeviceInfoManager> concurrentHashMap = sDeviceInfoManagerMap;
        if (concurrentHashMap.get(castContext) == null) {
            synchronized (sDeviceInfoManagerLock) {
                if (concurrentHashMap.get(castContext) == null) {
                    concurrentHashMap.put(castContext, DeviceInfoManager.createInstance(castContext));
                }
            }
        }
        return concurrentHashMap.get(castContext);
    }

    public static CastLogger getLogger(CastContext castContext) {
        if (castContext == null) {
            return CastLogger.getInstance();
        }
        ConcurrentHashMap<CastContext, CastLogger> concurrentHashMap = sLoggerMap;
        if (concurrentHashMap.get(castContext) == null) {
            synchronized (sLoggerLock) {
                if (concurrentHashMap.get(castContext) == null) {
                    concurrentHashMap.put(castContext, CastLogger.createInstance(castContext));
                }
            }
        }
        return concurrentHashMap.get(castContext);
    }

    public static CastMonitor getMonitor(CastContext castContext) {
        if (castContext == null) {
            return CastMonitor.getInstance();
        }
        ConcurrentHashMap<CastContext, CastMonitor> concurrentHashMap = sMonitorMap;
        if (concurrentHashMap.get(castContext) == null) {
            synchronized (sMonitorLock) {
                if (concurrentHashMap.get(castContext) == null) {
                    concurrentHashMap.put(castContext, CastMonitor.createInstance(castContext));
                }
            }
        }
        return concurrentHashMap.get(castContext);
    }

    public static SourceMonitorUtils getSourceMonitor(CastContext castContext) {
        return getMonitor(castContext).getSourceMonitor();
    }

    public static TeaEventTrack getTeaEventTrack(CastContext castContext) {
        if (castContext == null) {
            return TeaEventTrack.getInstance();
        }
        ConcurrentHashMap<CastContext, TeaEventTrack> concurrentHashMap = sTeaEventTrackMap;
        if (concurrentHashMap.get(castContext) == null) {
            synchronized (sTeaEventTrackLock) {
                if (concurrentHashMap.get(castContext) == null) {
                    concurrentHashMap.put(castContext, TeaEventTrack.createInstance(castContext));
                }
            }
        }
        return concurrentHashMap.get(castContext);
    }
}
