package com.ss.android.ugc.effectmanager.common.utils;

import android.content.Context;
import android.os.Build;
import android.text.TextUtils;
import com.bytedance.android.livesdk.livesetting.wallet.LiveWalletRechargeExchangeStrengthen;
import com.bytedance.mt.protector.impl.string2number.CastFloatProtector;
import com.ss.android.ugc.effectmanager.EffectConfiguration;
import com.ss.android.ugc.effectmanager.common.utils.DeviceUtil;
import java.util.HashMap;
import kotlin.jvm.internal.o;
import org.json.JSONObject;
import ujb.s;

/* loaded from: classes16.dex */
public final class EffectRequestUtil {
    public static final EffectRequestUtil INSTANCE = new EffectRequestUtil();

    private final String buildDeviceInfo(Context context) {
        HashMap hashMap = new HashMap();
        hashMap.put("platform", 1);
        try {
            hashMap.put("gl_version", Float.valueOf(CastFloatProtector.parseFloat(GPUUtils.INSTANCE.getVersion())));
        } catch (Exception unused) {
        }
        GPUUtils gPUUtils = GPUUtils.INSTANCE;
        hashMap.put("gl_vendor", gPUUtils.getVendor());
        hashMap.put("gl_renderer", gPUUtils.getRenderer());
        hashMap.put("gl_extension", gPUUtils.getGlExtension());
        if (context != null) {
            DeviceUtil.MemoryInfo memoryInfo = DeviceUtil.getMemoryInfo(context);
            o.LJFF(memoryInfo, "DeviceUtil.getMemoryInfo(context)");
            long totalSize = memoryInfo.getTotalSize();
            if (totalSize > 0) {
                hashMap.put("memory_total_size", Long.valueOf(totalSize));
            }
        }
        String cpuModel = DeviceUtil.getCpuModel();
        o.LJFF(cpuModel, "DeviceUtil.getCpuModel()");
        hashMap.put("cpu_vendor", cpuModel);
        String str = Build.VERSION.RELEASE;
        o.LJFF(str, "Build.VERSION.RELEASE");
        hashMap.put("os_version", str);
        String jSONObject = new JSONObject(hashMap).toString();
        o.LJFF(jSONObject, "JSONObject(deviceInfoMap).toString()");
        return jSONObject;
    }

    public static final boolean isOnlineEnv(EffectConfiguration effectConfiguration) {
        o.LJIIJ(effectConfiguration, "effectConfiguration");
        String channel = effectConfiguration.getChannel();
        if (channel == null) {
            return false;
        }
        return s.LJJJLZIJ(channel, LiveWalletRechargeExchangeStrengthen.DEFAULT, false);
    }

    public final HashMap<String, String> addCommonParams(EffectConfiguration configuration) {
        o.LJIIJ(configuration, "configuration");
        HashMap<String, String> hashMap = new HashMap<>();
        if (!TextUtils.isEmpty(configuration.getAccessKey())) {
            String accessKey = configuration.getAccessKey();
            o.LJFF(accessKey, "configuration.accessKey");
            hashMap.put("access_key", accessKey);
        }
        if (!TextUtils.isEmpty(configuration.getDeviceId())) {
            String deviceId = configuration.getDeviceId();
            o.LJFF(deviceId, "configuration.deviceId");
            hashMap.put("device_id", deviceId);
        }
        if (!TextUtils.isEmpty(configuration.getDeviceType())) {
            String deviceType = configuration.getDeviceType();
            o.LJFF(deviceType, "configuration.deviceType");
            hashMap.put("device_type", deviceType);
        }
        if (!TextUtils.isEmpty(configuration.getPlatform())) {
            String platform = configuration.getPlatform();
            o.LJFF(platform, "configuration.platform");
            hashMap.put("device_platform", platform);
        }
        if (!TextUtils.isEmpty(configuration.getRegion())) {
            String region = configuration.getRegion();
            o.LJFF(region, "configuration.region");
            hashMap.put("region", region);
        }
        if (!TextUtils.isEmpty(configuration.getSdkVersion())) {
            String sdkVersion = configuration.getSdkVersion();
            o.LJFF(sdkVersion, "configuration.sdkVersion");
            hashMap.put("sdk_version", sdkVersion);
        }
        if (!TextUtils.isEmpty(configuration.getAppVersion())) {
            String appVersion = configuration.getAppVersion();
            o.LJFF(appVersion, "configuration.appVersion");
            hashMap.put("app_version", appVersion);
        }
        if (!TextUtils.isEmpty(configuration.getChannel())) {
            String channel = configuration.getChannel();
            o.LJFF(channel, "configuration.channel");
            hashMap.put("channel", channel);
        }
        if (!TextUtils.isEmpty(configuration.getAppID())) {
            String appID = configuration.getAppID();
            o.LJFF(appID, "configuration.appID");
            hashMap.put("aid", appID);
        }
        if (!TextUtils.isEmpty(configuration.getAppLanguage())) {
            String appLanguage = configuration.getAppLanguage();
            o.LJFF(appLanguage, "configuration.appLanguage");
            hashMap.put("app_language", appLanguage);
        }
        if (!CollectionUtil.isMapEmpty(configuration.getIopInfo())) {
            hashMap.putAll(configuration.getIopInfo());
        }
        if (!TextUtils.isEmpty(configuration.getGpuVersion())) {
            String gpuVersion = configuration.getGpuVersion();
            o.LJFF(gpuVersion, "configuration.gpuVersion");
            hashMap.put("gpu", gpuVersion);
        }
        if (configuration.getFilterType() > 0) {
            hashMap.put("filter_type", String.valueOf(configuration.getFilterType()));
        }
        hashMap.put("platform_ab_params", String.valueOf(configuration.getRequestStrategy()));
        hashMap.put("platform_sdk_version", EPUtils.getPlatformSDKVersion());
        hashMap.put("device_info", buildDeviceInfo(configuration.getContext()));
        return hashMap;
    }
}
