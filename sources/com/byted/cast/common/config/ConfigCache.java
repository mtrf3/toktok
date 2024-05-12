package com.byted.cast.common.config;

import X.C16880lQ;
import X.X1D;
import android.text.TextUtils;
import com.byted.cast.common.CastLogger;
import com.byted.cast.common.ContextManager;
import com.byted.cast.common.PreferenceUtils;
import java.util.HashMap;
import java.util.Map;

/* loaded from: classes29.dex */
public class ConfigCache {
    public static final String TAG = C16880lQ.LJLLJ(ConfigCache.class);
    public ContextManager.CastContext mCastContext;
    public volatile Config mConfig;
    public final Object mConfigLock = new Object();
    public CastLogger mLogger;
    public Map<Integer, Object[]> sLocalConfig;
    public Map<String, Object> sRemoteGrayConfig;

    public void clearInitConfig() {
        this.mLogger.i(TAG, "clearInitConfig");
        synchronized (this.mConfigLock) {
            if (this.mConfig != null && !this.mConfig.isInitialModeBind()) {
                this.mConfig = new Config();
            }
        }
    }

    public Config getInitConfig() {
        if (this.mConfig == null) {
            synchronized (this.mConfigLock) {
                if (this.mConfig == null) {
                    this.mConfig = new Config();
                }
            }
        }
        return this.mConfig;
    }

    public Map<String, Object> getRemoteGrayConfig() {
        String projectId;
        HashMap hashMap = new HashMap();
        if (getInitConfig().isInitialModeBind()) {
            Map<String, Object> map = this.sRemoteGrayConfig;
            if (map != null) {
                hashMap.putAll(map);
            }
        } else {
            ContextManager.CastContext castContext = this.mCastContext;
            if (castContext == null) {
                projectId = "";
            } else {
                projectId = castContext.getProjectId();
            }
            String serverGrayConfig = PreferenceUtils.getServerGrayConfig(projectId);
            if (!TextUtils.isEmpty(serverGrayConfig)) {
                for (String str : serverGrayConfig.substring(1, serverGrayConfig.length() - 1).split(",")) {
                    String[] split = str.split("=");
                    hashMap.put(split[0], split[1]);
                }
            }
        }
        return hashMap;
    }

    public boolean isRemoteGrayConfigAvailable() {
        Map<String, Object> map = this.sRemoteGrayConfig;
        if (map != null && map.size() > 0) {
            return true;
        }
        return false;
    }

    public ConfigCache(ContextManager.CastContext castContext) {
        this.mCastContext = castContext;
        this.mLogger = ContextManager.getLogger(castContext);
    }

    public void cacheInitConfig(Config config) {
        CastLogger castLogger = this.mLogger;
        String str = TAG;
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("cacheInitConfig: ");
        LIZ.append(config);
        castLogger.i(str, X1D.LIZIZ(LIZ));
        synchronized (this.mConfigLock) {
            if (config == null) {
                return;
            }
            this.mConfig = config;
        }
    }

    public void cacheRemoteGrayConfig(Map<String, Object> map) {
        String projectId;
        CastLogger castLogger = this.mLogger;
        String str = TAG;
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("cacheRemoteGrayConfig: remoteGrayConfig: ");
        LIZ.append(map);
        castLogger.i(str, X1D.LIZIZ(LIZ));
        if (map == null || map.size() == 0) {
            return;
        }
        if (this.sRemoteGrayConfig == null) {
            this.sRemoteGrayConfig = new HashMap();
        }
        this.sRemoteGrayConfig.clear();
        this.sRemoteGrayConfig.putAll(map);
        ContextManager.CastContext castContext = this.mCastContext;
        if (castContext == null) {
            projectId = "";
        } else {
            projectId = castContext.getProjectId();
        }
        PreferenceUtils.setServerGrayConfig(projectId, map.toString());
    }

    public Object getRemoteGrayConfig(String str) {
        String projectId;
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        if (getInitConfig().isInitialModeBind()) {
            Map<String, Object> map = this.sRemoteGrayConfig;
            if (map == null) {
                return null;
            }
            return map.get(str);
        }
        ContextManager.CastContext castContext = this.mCastContext;
        String str2 = "";
        if (castContext == null) {
            projectId = "";
        } else {
            projectId = castContext.getProjectId();
        }
        String serverGrayConfig = PreferenceUtils.getServerGrayConfig(projectId);
        if (!TextUtils.isEmpty(serverGrayConfig)) {
            for (String str3 : serverGrayConfig.substring(1, serverGrayConfig.length() - 1).split(",")) {
                if (!TextUtils.isEmpty(str3) && str3.contains(str)) {
                    try {
                        str2 = str3.split("=")[1];
                        return str2;
                    } catch (Exception e) {
                        e.printStackTrace();
                        return str2;
                    }
                }
            }
        }
        return null;
    }

    public Object getLocalConfig(int i, Object... objArr) {
        if (this.sLocalConfig == null) {
            this.sLocalConfig = new HashMap();
        }
        return this.sLocalConfig.get(Integer.valueOf(i));
    }

    public void setLocalConfig(int i, Object... objArr) {
        Object obj;
        if (objArr != null) {
            obj = objArr[0];
        } else {
            obj = null;
        }
        CastLogger castLogger = this.mLogger;
        String str = TAG;
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("setLocalConfig: option: ");
        LIZ.append(i);
        LIZ.append(", objects: ");
        LIZ.append(objArr);
        LIZ.append(", obj[0]: ");
        LIZ.append(obj);
        castLogger.i(str, X1D.LIZIZ(LIZ));
        if (this.sLocalConfig == null) {
            this.sLocalConfig = new HashMap();
        }
        this.sLocalConfig.put(Integer.valueOf(i), objArr);
    }
}
