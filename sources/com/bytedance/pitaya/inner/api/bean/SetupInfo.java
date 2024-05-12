package com.bytedance.pitaya.inner.api.bean;

import X.C16880lQ;
import X.C93278aOI;
import X.ORZ;
import android.content.Context;
import android.os.Build;
import android.os.Process;
import android.os.SystemClock;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.bytedance.mt.protector.impl.string2number.CastIntegerProtector;
import com.bytedance.pitaya.api.PTYCustomURLHost;
import com.bytedance.pitaya.api.PTYDIDCallback;
import com.bytedance.pitaya.api.PTYPackageFilterCallback;
import com.bytedance.pitaya.api.PTYPyBinderCallback;
import com.bytedance.pitaya.api.PTYSettingsCallback;
import com.bytedance.pitaya.api.PTYUIDCallback;
import com.bytedance.pitaya.api.bean.PTYSetupInfo;
import com.bytedance.pitaya.jniwrapper.ReflectionCall;
import com.bytedance.pitaya.thirdcomponent.featureevent.FeatureEventProducer;
import com.bytedance.pitaya.thirdcomponent.stddelegate.PitayaInnerServiceProvider;
import com.bytedance.pitaya.thirdcomponent.trace.TraceReport;
import java.io.File;
import java.util.List;
import kotlin.jvm.internal.o;
import org.json.JSONObject;
import ujb.s;

/* loaded from: classes30.dex */
public final class SetupInfo implements ReflectionCall {
    public static final C93278aOI Companion = new C93278aOI();
    public final String aid;
    public final String appVersion;
    public final String authURLHost;
    public final boolean autoRequestUpdate;
    public final String channel;
    public final String device;
    public final PTYDIDCallback didCallback;
    public final int downloadConcurrency;
    public final boolean flEnable;
    public final boolean idleDownloadEnable;
    public final boolean isDebugMode;
    public final boolean isLowStorage;
    public final boolean isTraceEnable;
    public final List<String> moduleList;
    public final String osVersion;
    public final PTYPackageFilterCallback packageFilterCallback;
    public final String pluginVersion;
    public final PTYPyBinderCallback pyBindCallback;
    public final int pyConcurrency;
    public final String rootPath;
    public final String sdkBuildVersion;
    public final PTYSettingsCallback settingsCallback;
    public final int setupMode;
    public final PTYUIDCallback uidCallback;
    public final String urlHost;
    public final String userProfileDevURL;

    private final int getLimitedPyConcurrency(int i) {
        if (i > 5) {
            return 5;
        }
        if (i < 0) {
            return 2;
        }
        return i;
    }

    private final int getConfigVMNum() {
        String settings = getSettings("pitaya_general_settings.content.pitaya_global.vm_num", 2);
        if (settings == null) {
            return -1;
        }
        try {
            String optString = new JSONObject(settings).optString("rst", "-1");
            o.LJFF(optString, "JSONObject(it).optString(\"rst\", \"-1\")");
            return CastIntegerProtector.parseInt(optString);
        } catch (Throwable unused) {
            return -1;
        }
    }

    public final void bind() {
        PTYPyBinderCallback pTYPyBinderCallback = this.pyBindCallback;
        if (pTYPyBinderCallback != null) {
            pTYPyBinderCallback.onBind();
        }
    }

    public final String getDid() {
        PTYDIDCallback pTYDIDCallback = this.didCallback;
        if (pTYDIDCallback != null) {
            return pTYDIDCallback.getDid();
        }
        return null;
    }

    public final String getFilterMap() {
        JSONObject filter;
        PTYPackageFilterCallback pTYPackageFilterCallback = this.packageFilterCallback;
        if (pTYPackageFilterCallback != null && (filter = pTYPackageFilterCallback.getFilter()) != null) {
            return filter.toString();
        }
        return null;
    }

    public final long getProcessStartDuration() {
        if (Build.VERSION.SDK_INT >= 24) {
            return SystemClock.elapsedRealtime() - Process.getStartElapsedRealtime();
        }
        return 0L;
    }

    public final String getSessionId() {
        FeatureEventProducer featureEventProducer = (FeatureEventProducer) PitayaInnerServiceProvider.getService(FeatureEventProducer.class);
        if (featureEventProducer != null) {
            return featureEventProducer.getSessionId();
        }
        return null;
    }

    public final String getUid() {
        PTYUIDCallback pTYUIDCallback = this.uidCallback;
        if (pTYUIDCallback != null) {
            return pTYUIDCallback.getUid();
        }
        return null;
    }

    public final String getAid() {
        return this.aid;
    }

    public final String getAppVersion() {
        return this.appVersion;
    }

    public final String getAuthURLHost() {
        return this.authURLHost;
    }

    public final boolean getAutoRequestUpdate() {
        return this.autoRequestUpdate;
    }

    public final String getChannel() {
        return this.channel;
    }

    public final String getDevice() {
        return this.device;
    }

    public final int getDownloadConcurrency() {
        return this.downloadConcurrency;
    }

    public final boolean getFlEnable() {
        return this.flEnable;
    }

    public final boolean getIdleDownloadEnable() {
        return this.idleDownloadEnable;
    }

    public final List<String> getModuleList() {
        return this.moduleList;
    }

    public final String getOsVersion() {
        return this.osVersion;
    }

    public final String getPluginVersion() {
        return this.pluginVersion;
    }

    public final int getPyConcurrency() {
        return this.pyConcurrency;
    }

    public final String getRootPath() {
        return this.rootPath;
    }

    public final String getSdkBuildVersion() {
        return this.sdkBuildVersion;
    }

    public final PTYSettingsCallback getSettingsCallback() {
        return this.settingsCallback;
    }

    public final int getSetupMode() {
        return this.setupMode;
    }

    public final String getUrlHost() {
        return this.urlHost;
    }

    public final String getUserProfileDevURL() {
        return this.userProfileDevURL;
    }

    public final boolean isDebugMode() {
        return this.isDebugMode;
    }

    public final boolean isLowStorage() {
        return this.isLowStorage;
    }

    public final boolean isTraceEnable() {
        return this.isTraceEnable;
    }

    private final int getVMNum(int i) {
        int configVMNum = getConfigVMNum();
        if (configVMNum > 0) {
            return getLimitedPyConcurrency(configVMNum);
        }
        return getLimitedPyConcurrency(i);
    }

    public SetupInfo(Context context, PTYSetupInfo ptySetupInfo) {
        boolean z;
        String authURLHost;
        String urlHost;
        o.LJIIJ(context, "context");
        o.LJIIJ(ptySetupInfo, "ptySetupInfo");
        this.aid = ptySetupInfo.getAid();
        this.appVersion = ptySetupInfo.getAppVersion();
        this.pluginVersion = ptySetupInfo.getPluginVersion();
        this.osVersion = String.valueOf(Build.VERSION.SDK_INT);
        this.channel = ptySetupInfo.getChannel();
        String str = Build.MODEL;
        this.device = str == null ? "" : str;
        this.sdkBuildVersion = "2.8.0.i18ntob-rc.58";
        this.flEnable = ptySetupInfo.getFlEnable();
        this.isLowStorage = ptySetupInfo.isLowStorage();
        this.didCallback = ptySetupInfo.getDidCallback();
        this.uidCallback = ptySetupInfo.getUidCallback();
        this.packageFilterCallback = ptySetupInfo.getPackageFilterCallback();
        this.pyBindCallback = ptySetupInfo.getPyBinder();
        this.settingsCallback = ptySetupInfo.getSettingsCallback();
        this.downloadConcurrency = ptySetupInfo.getDownloadConcurrency();
        this.idleDownloadEnable = ptySetupInfo.getIdleDownloadEnable();
        File LLIIJLIL = C16880lQ.LLIIJLIL(context);
        o.LJFF(LLIIJLIL, "context.filesDir");
        String absolutePath = LLIIJLIL.getAbsolutePath();
        this.rootPath = absolutePath == null ? "" : absolutePath;
        boolean isDebugMode = ptySetupInfo.isDebugMode();
        this.isDebugMode = isDebugMode;
        PTYCustomURLHost customURLHost = ptySetupInfo.getCustomURLHost();
        String str2 = "https://pitaya.tiktokv.com";
        this.urlHost = (customURLHost == null || (urlHost = customURLHost.getUrlHost()) == null) ? "https://pitaya.tiktokv.com" : urlHost;
        PTYCustomURLHost customURLHost2 = ptySetupInfo.getCustomURLHost();
        if (customURLHost2 != null && (authURLHost = customURLHost2.getAuthURLHost()) != null) {
            str2 = authURLHost;
        } else if (!isDebugMode) {
            str2 = "https://pitaya-task.tiktokv.com";
        }
        this.authURLHost = str2;
        TraceReport traceReport = (TraceReport) PitayaInnerServiceProvider.getService(TraceReport.class);
        if (traceReport != null) {
            z = traceReport.isTraceEnable();
        } else {
            z = false;
        }
        this.isTraceEnable = z;
        this.userProfileDevURL = "";
        this.autoRequestUpdate = ptySetupInfo.getAutoRequestUpdate();
        this.pyConcurrency = getVMNum(ptySetupInfo.getPyConcurrency());
        this.moduleList = ptySetupInfo.getModuleList();
        this.setupMode = ptySetupInfo.getSetupMode().getCode();
    }

    public final String getSettings(String key, int i) {
        JSONObject jSONObject;
        o.LJIIJ(key, "key");
        List LJLJJL = s.LJLJJL(key, new String[]{"."}, 0, 6);
        Object obj = null;
        if (LJLJJL.isEmpty()) {
            return null;
        }
        PTYSettingsCallback pTYSettingsCallback = this.settingsCallback;
        if (pTYSettingsCallback != null) {
            jSONObject = pTYSettingsCallback.getSettings((String) ListProtector.get(LJLJJL, 0));
        } else {
            jSONObject = null;
        }
        int size = LJLJJL.size() - 1;
        for (int i2 = 1; i2 < size; i2++) {
            if (jSONObject == null) {
                return null;
            }
            jSONObject = jSONObject.optJSONObject((String) ListProtector.get(LJLJJL, i2));
        }
        if (jSONObject != null && jSONObject.has((String) ORZ.LLFF(LJLJJL))) {
            obj = jSONObject.opt((String) ORZ.LLFF(LJLJJL));
        }
        return new JSONObject().put("rst", obj).toString();
    }
}
