package com.byted.cast.common.config;

import X.C16880lQ;
import X.X1D;
import android.text.TextUtils;
import com.byted.cast.common.CastLogger;
import com.byted.cast.common.ContextManager;
import com.byted.cast.common.Dispatcher;
import com.byted.cast.common.api.IHttpNetWork;
import com.byted.cast.common.config.ConfigManager;
import com.byted.cast.common.network.DefaultHttpNetWork;
import java.util.Map;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.TimeUnit;

/* loaded from: classes29.dex */
public final class ConfigManager {
    public static final String TAG = C16880lQ.LJLLJ(ConfigManager.class);
    public static volatile ConfigManager sInstance;
    public final ConfigCache mConfigCache;
    public final GrayConfigManager mGrayConfigManager;
    public CountDownLatch mLatch;
    public CastLogger mLogger;

    public static ConfigManager getInstance() {
        if (sInstance == null) {
            synchronized (ConfigManager.class) {
                if (sInstance == null) {
                    sInstance = new ConfigManager(null);
                }
            }
        }
        return sInstance;
    }

    public void destroy() {
        GrayConfigManager grayConfigManager = this.mGrayConfigManager;
        if (grayConfigManager != null) {
            grayConfigManager.destroy();
        }
        this.mConfigCache.clearInitConfig();
    }

    public Config getInitConfig() {
        return this.mConfigCache.getInitConfig();
    }

    public Map<String, Object> getRemoteGrayConfig() {
        GrayConfigManager grayConfigManager = this.mGrayConfigManager;
        if (grayConfigManager != null) {
            return ConfigUtils.castMap(grayConfigManager.getConfig(0), String.class, Object.class);
        }
        return null;
    }

    public ConfigManager(ContextManager.CastContext castContext) {
        this.mLogger = ContextManager.getLogger(castContext);
        ConfigCache configCache = new ConfigCache(castContext);
        this.mConfigCache = configCache;
        this.mGrayConfigManager = new GrayConfigManager(castContext, configCache);
    }

    public static ConfigManager createInstance(ContextManager.CastContext castContext) {
        if (castContext == null) {
            return getInstance();
        }
        return new ConfigManager(castContext);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$fetchGrayConfig$0(IConfigListener iConfigListener) {
        if (iConfigListener != null) {
            this.mLogger.i(TAG, "onFetchResultCallback: gray");
            iConfigListener.onFetchResult();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$fetchGrayConfig$2(final IConfigListener iConfigListener) {
        this.mLogger.i(TAG, "onFetchConfigFinished: gray");
        this.mLatch.countDown();
        Dispatcher.getInstance().runOnByteCastThread(new Runnable() { // from class: X.ZZm
            @Override // java.lang.Runnable
            public final void run() {
                ConfigManager.this.lambda$null$1(iConfigListener);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$fetchGrayConfig$3(IConfigListener iConfigListener) {
        if (iConfigListener != null) {
            this.mLogger.i(TAG, "onFetchResultCallback: gray");
            iConfigListener.onFetchResult();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$null$1(IConfigListener iConfigListener) {
        if (iConfigListener != null) {
            this.mLogger.i(TAG, "onFetchResultCallback: gray");
            iConfigListener.onFetchResult();
        }
    }

    public Boolean getOptionByBoolean(int i) {
        Object option = getOption(i, new Object[0]);
        if (option instanceof Object[]) {
            Object[] objArr = (Object[]) option;
            if (objArr.length > 0) {
                Object obj = objArr[0];
                if (obj instanceof Boolean) {
                    return (Boolean) obj;
                }
            }
        }
        return null;
    }

    public Object getRemoteGrayConfig(String str) {
        if (this.mGrayConfigManager != null && !TextUtils.isEmpty(str)) {
            return this.mGrayConfigManager.getConfig(str);
        }
        return null;
    }

    public void init(Config config) {
        IHttpNetWork netAdapter;
        if (config == null) {
            return;
        }
        this.mConfigCache.cacheInitConfig(config);
        if (config.getNetAdapter() == null) {
            netAdapter = new DefaultHttpNetWork();
        } else {
            netAdapter = config.getNetAdapter();
        }
        this.mGrayConfigManager.init(netAdapter);
    }

    private void fetchGrayConfig(ConfigParam configParam, final IConfigListener iConfigListener) {
        CastLogger castLogger = this.mLogger;
        String str = TAG;
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("fetchGrayConfig: grayConfigParam: ");
        LIZ.append(configParam);
        LIZ.append(", listener: ");
        LIZ.append(iConfigListener);
        castLogger.i(str, X1D.LIZIZ(LIZ));
        if (configParam == null) {
            this.mLatch = null;
            return;
        }
        CountDownLatch countDownLatch = this.mLatch;
        if (countDownLatch == null || countDownLatch.getCount() == 0) {
            this.mLatch = new CountDownLatch(1);
            if (this.mGrayConfigManager.isConfigAvailable()) {
                this.mLogger.i(str, "grayConfig is valid");
                this.mLatch.countDown();
                Dispatcher.getInstance().runOnByteCastThread(new Runnable() { // from class: X.ZZk
                    @Override // java.lang.Runnable
                    public final void run() {
                        ConfigManager.this.lambda$fetchGrayConfig$0(iConfigListener);
                    }
                });
                return;
            }
            this.mGrayConfigManager.fetchConfig(configParam, new IConfigListener() { // from class: X.Zhs
                @Override // com.byted.cast.common.config.IConfigListener
                public final void onFetchResult() {
                    ConfigManager.this.lambda$fetchGrayConfig$2(iConfigListener);
                }
            });
            return;
        }
        try {
            boolean await = this.mLatch.await(3000L, TimeUnit.MILLISECONDS);
            CastLogger castLogger2 = this.mLogger;
            StringBuilder LIZ2 = X1D.LIZ();
            LIZ2.append("fetch grayConfig: latch result: ");
            LIZ2.append(await);
            castLogger2.i(str, X1D.LIZIZ(LIZ2));
        } catch (InterruptedException e) {
            this.mLogger.w(TAG, e.getMessage());
        }
        Dispatcher.getInstance().runOnByteCastThread(new Runnable() { // from class: X.ZZl
            @Override // java.lang.Runnable
            public final void run() {
                ConfigManager.this.lambda$fetchGrayConfig$3(iConfigListener);
            }
        });
    }

    public void fetchConfig(ConfigParam configParam, IConfigListener iConfigListener) {
        this.mLogger.i(TAG, "fetchConfig");
        fetchGrayConfig(configParam, iConfigListener);
    }

    public Object getOption(int i, Object... objArr) {
        return this.mConfigCache.getLocalConfig(i, objArr);
    }

    public boolean getOptionByBoolean(int i, boolean z) {
        Boolean optionByBoolean = getOptionByBoolean(i);
        if (optionByBoolean != null) {
            return optionByBoolean.booleanValue();
        }
        return z;
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x001e A[ORIG_RETURN, RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:12:0x001f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.String getOptionByString(int r4, java.lang.String r5) {
        /*
            r3 = this;
            r2 = 0
            java.lang.Object[] r0 = new java.lang.Object[r2]
            java.lang.Object r1 = r3.getOption(r4, r0)
            boolean r0 = r1 instanceof java.lang.Object[]
            if (r0 == 0) goto L21
            java.lang.Object[] r1 = (java.lang.Object[]) r1
            int r0 = r1.length
            if (r0 <= 0) goto L21
            r1 = r1[r2]
            boolean r0 = r1 instanceof java.lang.String
            if (r0 == 0) goto L21
            java.lang.String r1 = (java.lang.String) r1
        L18:
            boolean r0 = android.text.TextUtils.isEmpty(r1)
            if (r0 == 0) goto L1f
        L1e:
            return r5
        L1f:
            r5 = r1
            goto L1e
        L21:
            r1 = 0
            goto L18
        */
        throw new UnsupportedOperationException("Method not decompiled: com.byted.cast.common.config.ConfigManager.getOptionByString(int, java.lang.String):java.lang.String");
    }

    public boolean getRemoteGrayConfigByBoolean(String str, boolean z) {
        Object remoteGrayConfig = getRemoteGrayConfig(str);
        if (remoteGrayConfig instanceof String) {
            return Boolean.parseBoolean((String) remoteGrayConfig);
        }
        return z;
    }

    public void setOption(int i, Object... objArr) {
        this.mConfigCache.setLocalConfig(i, objArr);
    }
}
