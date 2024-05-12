package X;

import android.os.Bundle;
import com.bytedance.lynx.spark.schema.model.SparkCardSchemaParam;
import com.bytedance.lynx.spark.schema.model.SparkSchemaParam;
import com.bytedance.lynx.spark.schema.model.SparkXrSchemaParam;
import java.util.LinkedHashMap;
import kotlin.jvm.internal.o;
import ujb.s;

/* renamed from: X.NvG, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class C60902NvG {
    public static final /* synthetic */ int LIZ = 0;

    public static SparkCardSchemaParam LIZ(String url, java.util.Map map, Bundle bundle, String containerId) {
        EnumC39924Flg enumC39924Flg;
        o.LJIIJ(url, "url");
        o.LJIIJ(containerId, "containerId");
        android.net.Uri LJJJJIZL = C17N.LJJJJIZL(url);
        java.util.Map<String, String> LIZ2 = C75252xN.LIZ(LJJJJIZL, map, bundle);
        SparkCardSchemaParam sparkCardSchemaParam = new SparkCardSchemaParam(null, 1, null);
        C75252xN.LIZLLL(containerId, LIZ2);
        LinkedHashMap linkedHashMap = (LinkedHashMap) LIZ2;
        String str = (String) linkedHashMap.get("__use_ttnet");
        if (str != null) {
            sparkCardSchemaParam.set_useTtnet(C60906NvK.LIZIZ("__use_ttnet", str, LIZ2, LJJJJIZL, false));
        }
        String str2 = (String) linkedHashMap.get("accessKey");
        if (str2 != null) {
            sparkCardSchemaParam.setAccessKey(str2);
        }
        String str3 = (String) linkedHashMap.get("access_key");
        if (str3 != null) {
            sparkCardSchemaParam.setAccessKeyBp(str3);
        }
        Object obj = linkedHashMap.get("append_common_params");
        if (obj != null) {
            sparkCardSchemaParam.setAppendCommonParams(o.LJ(obj, "1"));
        }
        String str4 = (String) linkedHashMap.get("auto_play_bgm");
        if (str4 != null) {
            sparkCardSchemaParam.setAutoPlayBgm(C60906NvK.LIZIZ("auto_play_bgm", str4, LIZ2, LJJJJIZL, false));
        }
        String str5 = (String) linkedHashMap.get("bid");
        if (str5 != null) {
            sparkCardSchemaParam.setBid(str5);
        }
        Object obj2 = linkedHashMap.get("block_back_press");
        if (obj2 != null) {
            sparkCardSchemaParam.setBlockBackPress(o.LJ(obj2, "1"));
        }
        String str6 = (String) linkedHashMap.get("bundle");
        if (str6 != null) {
            sparkCardSchemaParam.setBundle(str6);
        }
        Object obj3 = linkedHashMap.get("redirect_cdn_by_region");
        if (obj3 != null) {
            sparkCardSchemaParam.setCdnRegionRedirect(o.LJ(obj3, "1"));
        }
        String str7 = (String) linkedHashMap.get("channel");
        if (str7 != null) {
            sparkCardSchemaParam.setChannel(str7);
        }
        String str8 = (String) linkedHashMap.get("click_time");
        if (str8 != null) {
            sparkCardSchemaParam.setClickTime(str8);
        }
        String str9 = (String) linkedHashMap.get("container_bg_color");
        Object obj4 = linkedHashMap.get("container_bg_color_dark");
        Object obj5 = linkedHashMap.get("container_bg_color_light");
        if (str9 != null || obj4 != null || obj5 != null) {
            sparkCardSchemaParam.setContainerBgColor(C60906NvK.LIZJ("container_bg_color", str9, LIZ2, LJJJJIZL));
        }
        Object obj6 = linkedHashMap.get("disable_auto_remove_loading");
        if (obj6 != null) {
            sparkCardSchemaParam.setDisableAutoRemoveLoading(o.LJ(obj6, "1"));
        }
        Object obj7 = linkedHashMap.get("disable_back_press");
        if (obj7 != null) {
            sparkCardSchemaParam.setDisableBackPress(o.LJ(obj7, "1"));
        }
        Object obj8 = linkedHashMap.get("disable_builtin");
        if (obj8 != null) {
            sparkCardSchemaParam.setDisableBuiltin(Boolean.valueOf(o.LJ(obj8, "1")));
        }
        Object obj9 = linkedHashMap.get("disable_cdn");
        if (obj9 != null) {
            sparkCardSchemaParam.setDisableCDN(Boolean.valueOf(o.LJ(obj9, "1")));
        }
        Object obj10 = linkedHashMap.get("disable_event_cache");
        if (obj10 != null) {
            sparkCardSchemaParam.setDisableEventCache(o.LJ(obj10, "1"));
        }
        Object obj11 = linkedHashMap.get("disable_gecko");
        if (obj11 != null) {
            sparkCardSchemaParam.setDisableGecko(Boolean.valueOf(o.LJ(obj11, "1")));
        }
        Object obj12 = linkedHashMap.get("disable_gecko_update");
        if (obj12 != null) {
            sparkCardSchemaParam.setDisableGeckoUpdate(Boolean.valueOf(o.LJ(obj12, "1")));
        }
        Object obj13 = linkedHashMap.get("disable_hardware_accelerate");
        if (obj13 != null) {
            sparkCardSchemaParam.setDisableHardwareAccelerate(o.LJ(obj13, "1"));
        }
        Object obj14 = linkedHashMap.get("disable_offline");
        if (obj14 != null) {
            sparkCardSchemaParam.setDisableOffline(Boolean.valueOf(o.LJ(obj14, "1")));
        }
        Object obj15 = linkedHashMap.get("disable_save_image");
        if (obj15 != null) {
            sparkCardSchemaParam.setDisableSaveImage(o.LJ(obj15, "1"));
        }
        String str10 = (String) linkedHashMap.get("dynamic");
        if (str10 != null) {
            sparkCardSchemaParam.setDynamic(C60906NvK.LIZIZ("dynamic", str10, LIZ2, LJJJJIZL, false));
        }
        Object obj16 = linkedHashMap.get("enable_canvas");
        if (obj16 != null) {
            sparkCardSchemaParam.setEnableCanvas(o.LJ(obj16, "1"));
        }
        Object obj17 = linkedHashMap.get("enable_canvas_optimize");
        if (obj17 != null) {
            sparkCardSchemaParam.setEnableCanvasOptimization(Boolean.valueOf(o.LJ(obj17, "1")));
        }
        String str11 = (String) linkedHashMap.get("enable_code_cache");
        if (str11 != null) {
            sparkCardSchemaParam.setEnableCodeCache(C60906NvK.LIZIZ("enable_code_cache", str11, LIZ2, LJJJJIZL, false));
        }
        Object obj18 = linkedHashMap.get("enable_dynamic_v8");
        if (obj18 != null) {
            sparkCardSchemaParam.setEnableDynamicV8(o.LJ(obj18, "1"));
        }
        String str12 = (String) linkedHashMap.get("enable_extra_info");
        if (str12 != null) {
            sparkCardSchemaParam.setEnableExtraInfo(C60906NvK.LIZIZ("enable_extra_info", str12, LIZ2, LJJJJIZL, false));
        }
        Object obj19 = linkedHashMap.get("enable_js_runtime");
        if (obj19 != null) {
            sparkCardSchemaParam.setEnableJSRuntime(o.LJ(obj19, "1"));
        }
        Object obj20 = linkedHashMap.get("enable_memory_cache");
        if (obj20 != null) {
            sparkCardSchemaParam.setEnableMemoryCache(Boolean.valueOf(o.LJ(obj20, "1")));
        }
        Object obj21 = linkedHashMap.get("enable_pending_js_task");
        if (obj21 != null) {
            sparkCardSchemaParam.setEnablePendingJsTask(o.LJ(obj21, "1"));
        }
        String str13 = (String) linkedHashMap.get("enable_pre_code_cache");
        if (str13 != null) {
            sparkCardSchemaParam.setEnablePreCodeCache(C60906NvK.LIZIZ("enable_pre_code_cache", str13, LIZ2, LJJJJIZL, false));
        }
        String str14 = (String) linkedHashMap.get("enable_prefetch");
        if (str14 != null) {
            sparkCardSchemaParam.setEnablePrefetch(C60906NvK.LIZIZ("enable_prefetch", str14, LIZ2, LJJJJIZL, false));
        }
        Object obj22 = linkedHashMap.get("enable_scroll_web_view");
        if (obj22 != null) {
            sparkCardSchemaParam.setEnableScrollWebView(o.LJ(obj22, "1"));
        }
        Object obj23 = linkedHashMap.get("enable_spark_live_opt");
        if (obj23 != null) {
            sparkCardSchemaParam.setEnableSparkLiveOpt(o.LJ(obj23, "1"));
        }
        String str15 = (String) linkedHashMap.get("fallback_url");
        if (str15 != null) {
            sparkCardSchemaParam.setFallbackUrl(str15);
        }
        Object obj24 = linkedHashMap.get("forbidden_anim");
        if (obj24 != null) {
            sparkCardSchemaParam.setForbiddenAnim(o.LJ(obj24, "1"));
        }
        Object obj25 = linkedHashMap.get("force_h5");
        if (obj25 != null) {
            sparkCardSchemaParam.setForceH5(o.LJ(obj25, "1"));
        }
        String str16 = (String) linkedHashMap.get("force_theme_style");
        if (str16 != null) {
            sparkCardSchemaParam.setForceThemeStyle(str16);
        }
        Object obj26 = linkedHashMap.get("gecko_url_redirection");
        if (obj26 != null) {
            sparkCardSchemaParam.setGeckoUrlRedirection(o.LJ(obj26, "1"));
        }
        String str17 = (String) linkedHashMap.get("group");
        if (str17 != null) {
            sparkCardSchemaParam.setGroup(str17);
        }
        Object obj27 = linkedHashMap.get("hide_error");
        if (obj27 != null) {
            sparkCardSchemaParam.setHideError(o.LJ(obj27, "1"));
        }
        Object obj28 = linkedHashMap.get("hide_loading");
        if (obj28 != null) {
            sparkCardSchemaParam.setHideLoading(o.LJ(obj28, "1"));
        }
        Object obj29 = linkedHashMap.get("hide_system_video_poster");
        if (obj29 != null) {
            sparkCardSchemaParam.setHideSystemVideoPoster(o.LJ(obj29, "1"));
        }
        String str18 = (String) linkedHashMap.get("ignore_cache_policy");
        if (str18 != null) {
            sparkCardSchemaParam.setIgnoreCachePolicy(C60906NvK.LIZIZ("ignore_cache_policy", str18, LIZ2, LJJJJIZL, false));
        }
        Object obj30 = linkedHashMap.get("ignore_cached_theme");
        if (obj30 != null) {
            sparkCardSchemaParam.setIgnoreCachedTheme(o.LJ(obj30, "1"));
        }
        String str19 = (String) linkedHashMap.get("initial_data");
        if (str19 != null) {
            sparkCardSchemaParam.setInitialData(str19);
        }
        String str20 = (String) linkedHashMap.get("keyboard_adjust");
        if (str20 != null) {
            sparkCardSchemaParam.setKeyboardAdjust(C60906NvK.LIZIZ("keyboard_adjust", str20, LIZ2, LJJJJIZL, false));
        }
        Object obj31 = linkedHashMap.get("keyboard_compat");
        if (obj31 != null) {
            sparkCardSchemaParam.setKeyboardCompat(o.LJ(obj31, "1"));
        }
        Object obj32 = linkedHashMap.get("landscape_screen_size_as_portrait");
        if (obj32 != null) {
            sparkCardSchemaParam.setLandscapeScreenSizeAsPortrait(o.LJ(obj32, "1"));
        }
        String str21 = (String) linkedHashMap.get("loading_bg_color");
        Object obj33 = linkedHashMap.get("loading_bg_color_dark");
        Object obj34 = linkedHashMap.get("loading_bg_color_light");
        if (str21 != null || obj33 != null || obj34 != null) {
            sparkCardSchemaParam.setLoadingBgColor(C60906NvK.LIZJ("loading_bg_color", str21, LIZ2, LJJJJIZL));
        }
        Object obj35 = linkedHashMap.get("lock_resource");
        if (obj35 != null) {
            sparkCardSchemaParam.setLockResource(o.LJ(obj35, "1"));
        }
        String str22 = (String) linkedHashMap.get("lynxview_height");
        if (str22 != null) {
            sparkCardSchemaParam.setLynxviewHeight(Integer.valueOf(C60906NvK.LIZIZ("lynxview_height", str22, LIZ2, LJJJJIZL, true)));
        }
        String str23 = (String) linkedHashMap.get("lynxview_width");
        if (str23 != null) {
            sparkCardSchemaParam.setLynxviewWidth(Integer.valueOf(C60906NvK.LIZIZ("lynxview_width", str23, LIZ2, LJJJJIZL, true)));
        }
        Object obj36 = linkedHashMap.get("need_sec_link");
        if (obj36 != null) {
            sparkCardSchemaParam.setNeedSecLink(o.LJ(obj36, "1"));
        }
        String str24 = (String) linkedHashMap.get("net_worker");
        if (str24 != null) {
            sparkCardSchemaParam.setNetWorker(Integer.valueOf(C60906NvK.LIZIZ("net_worker", str24, LIZ2, LJJJJIZL, false)));
        }
        Object obj37 = linkedHashMap.get("only_local");
        if (obj37 != null) {
            sparkCardSchemaParam.setOnlyLocal(Boolean.valueOf(o.LJ(obj37, "1")));
        }
        Object obj38 = linkedHashMap.get("parallel_fetch_resource");
        if (obj38 != null) {
            sparkCardSchemaParam.setParallelFetchResource(o.LJ(obj38, "1"));
        }
        String str25 = (String) linkedHashMap.get("preloadFonts");
        if (str25 != null) {
            sparkCardSchemaParam.setPreloadFonts(str25);
        }
        String str26 = (String) linkedHashMap.get("preload_setting_keys");
        if (str26 != null) {
            sparkCardSchemaParam.setPreloadSettingsKeys(str26);
        }
        String str27 = (String) linkedHashMap.get("preload_storage_keys");
        if (str27 != null) {
            sparkCardSchemaParam.setPreloadStorageKeys(str27);
        }
        String str28 = (String) linkedHashMap.get("preset_height");
        if (str28 != null) {
            sparkCardSchemaParam.setPresetHeight(C60906NvK.LIZIZ("preset_height", str28, LIZ2, LJJJJIZL, true));
        }
        Object obj39 = linkedHashMap.get("preset_safe_point");
        if (obj39 != null) {
            sparkCardSchemaParam.setPresetSafePoint(o.LJ(obj39, "1"));
        }
        String str29 = (String) linkedHashMap.get("preset_width");
        if (str29 != null) {
            sparkCardSchemaParam.setPresetWidth(C60906NvK.LIZIZ("preset_width", str29, LIZ2, LJJJJIZL, true));
        }
        Object obj40 = linkedHashMap.get("proxy_enabled_runtime_type");
        if (obj40 != null) {
            sparkCardSchemaParam.setProxyEnabledRuntimeType(o.LJ(obj40, "1"));
        }
        String str30 = (String) linkedHashMap.get("redirect_regions");
        if (str30 != null) {
            sparkCardSchemaParam.setRedirectRegions(str30);
        }
        Object obj41 = linkedHashMap.get("resource_dynamic");
        if (obj41 != null) {
            sparkCardSchemaParam.setResourceDynamic(Boolean.valueOf(o.LJ(obj41, "1")));
        }
        String str31 = (String) linkedHashMap.get("sec_link_scene");
        if (str31 != null) {
            sparkCardSchemaParam.setSecLinkScene(str31);
        }
        String str32 = (String) linkedHashMap.get("session_id");
        if (str32 != null) {
            sparkCardSchemaParam.setSessionId(str32);
        }
        Object obj42 = linkedHashMap.get("share_group");
        if (obj42 != null) {
            sparkCardSchemaParam.setShareGroup(o.LJ(obj42, "1"));
        }
        Object obj43 = linkedHashMap.get("show_progress_bar_in_all_page");
        if (obj43 != null) {
            sparkCardSchemaParam.setShowProgressBarInAllPage(o.LJ(obj43, "1"));
        }
        String str33 = (String) linkedHashMap.get("skeleton_duration");
        if (str33 != null) {
            sparkCardSchemaParam.setSkeletonDuration(Integer.valueOf(C60906NvK.LIZIZ("skeleton_duration", str33, LIZ2, LJJJJIZL, true)));
        }
        String str34 = (String) linkedHashMap.get("skeleton_from_alpha");
        if (str34 != null) {
            sparkCardSchemaParam.setSkeletonFromAlpha(str34);
        }
        String str35 = (String) linkedHashMap.get("skeleton_path");
        if (str35 != null) {
            sparkCardSchemaParam.setSkeletonPath(str35);
        }
        String str36 = (String) linkedHashMap.get("skeleton_to_alpha");
        if (str36 != null) {
            sparkCardSchemaParam.setSkeletonToAlpha(str36);
        }
        Object obj44 = linkedHashMap.get("skeleton_with_animation");
        if (obj44 != null) {
            sparkCardSchemaParam.setSkeletonWithAnimation(o.LJ(obj44, "1"));
        }
        String str37 = (String) linkedHashMap.get("spark_perf_bid");
        if (str37 != null) {
            sparkCardSchemaParam.setSparkPerfBid(str37);
        }
        String str38 = (String) linkedHashMap.get("spark_perf_biz");
        if (str38 != null) {
            sparkCardSchemaParam.setSparkPerfBiz(str38);
        }
        String str39 = (String) linkedHashMap.get("ssp_config");
        if (str39 != null) {
            sparkCardSchemaParam.setSspConfig(C60906NvK.LIZIZ("ssp_config", str39, LIZ2, LJJJJIZL, false));
        }
        String str40 = (String) linkedHashMap.get("starling_channel");
        if (str40 != null) {
            sparkCardSchemaParam.setStarlingChannel(str40);
        }
        Object obj45 = linkedHashMap.get("starling_fallback");
        if (obj45 != null) {
            sparkCardSchemaParam.setStarlingFallback(o.LJ(obj45, "1"));
        }
        Object obj46 = linkedHashMap.get("subscribe_network_level");
        if (obj46 != null) {
            sparkCardSchemaParam.setSubscribeNetworkLevel(o.LJ(obj46, "1"));
        }
        String str41 = (String) linkedHashMap.get("surl");
        if (str41 != null) {
            sparkCardSchemaParam.setSurl(str41);
        }
        String str42 = (String) linkedHashMap.get("thread_strategy");
        if (str42 != null) {
            sparkCardSchemaParam.setThreadStrategy(C60906NvK.LIZIZ("thread_strategy", str42, LIZ2, LJJJJIZL, false));
        }
        Object obj47 = linkedHashMap.get("ui_running_mode");
        if (obj47 != null) {
            sparkCardSchemaParam.setUiRunningMode(o.LJ(obj47, "1"));
        }
        String str43 = (String) linkedHashMap.get("url");
        if (str43 != null) {
            sparkCardSchemaParam.setUrl(str43);
        }
        Object obj48 = linkedHashMap.get("use_forest");
        if (obj48 != null) {
            sparkCardSchemaParam.setUseForest(o.LJ(obj48, "1"));
        }
        Object obj49 = linkedHashMap.get("use_mutable_context");
        if (obj49 != null) {
            sparkCardSchemaParam.setUseMutableContext(o.LJ(obj49, "1"));
        }
        Object obj50 = linkedHashMap.get("use_preload");
        if (obj50 != null) {
            sparkCardSchemaParam.setUsePreload(o.LJ(obj50, "1"));
        }
        Object obj51 = linkedHashMap.get("use_preload_resource_h5");
        if (obj51 != null) {
            sparkCardSchemaParam.setUsePreloadResourceH5(o.LJ(obj51, "1"));
        }
        Object obj52 = linkedHashMap.get("wait_gecko_update");
        if (obj52 != null) {
            sparkCardSchemaParam.setWaitGeckoUpdate(Boolean.valueOf(o.LJ(obj52, "1")));
        }
        Object obj53 = linkedHashMap.get("wait_low_storage_update");
        if (obj53 != null) {
            sparkCardSchemaParam.setWaitLowStorageUpdate(o.LJ(obj53, "1"));
        }
        Object obj54 = linkedHashMap.get("webview_progress_bar");
        if (obj54 != null) {
            sparkCardSchemaParam.setWebviewProgressBar(o.LJ(obj54, "1"));
        }
        String host = LJJJJIZL.getHost();
        if (host != null) {
            if (s.LJJJLZIJ(host, "webview", false)) {
                enumC39924Flg = EnumC39924Flg.WEB;
            } else if (s.LJJJLZIJ(host, "lynxview", false)) {
                enumC39924Flg = EnumC39924Flg.LYNX;
            }
            sparkCardSchemaParam.setEngineType(enumC39924Flg);
            sparkCardSchemaParam.adjustValues();
            return sparkCardSchemaParam;
        }
        enumC39924Flg = EnumC39924Flg.UNKNOWN;
        sparkCardSchemaParam.setEngineType(enumC39924Flg);
        sparkCardSchemaParam.adjustValues();
        return sparkCardSchemaParam;
    }

    public static SparkSchemaParam LIZIZ(String url, java.util.Map map, Bundle bundle, String containerId) {
        EnumC39924Flg enumC39924Flg;
        o.LJIIJ(url, "url");
        o.LJIIJ(containerId, "containerId");
        android.net.Uri LJJJJIZL = C17N.LJJJJIZL(url);
        java.util.Map<String, String> LIZ2 = C75252xN.LIZ(LJJJJIZL, map, bundle);
        SparkSchemaParam sparkSchemaParam = new SparkSchemaParam(null, 1, null);
        C75252xN.LIZLLL(containerId, LIZ2);
        LinkedHashMap linkedHashMap = (LinkedHashMap) LIZ2;
        String str = (String) linkedHashMap.get("__use_ttnet");
        if (str != null) {
            sparkSchemaParam.set_useTtnet(C60906NvK.LIZIZ("__use_ttnet", str, LIZ2, LJJJJIZL, false));
        }
        String str2 = (String) linkedHashMap.get("accessKey");
        if (str2 != null) {
            sparkSchemaParam.setAccessKey(str2);
        }
        String str3 = (String) linkedHashMap.get("access_key");
        if (str3 != null) {
            sparkSchemaParam.setAccessKeyBp(str3);
        }
        Object obj = linkedHashMap.get("append_common_params");
        if (obj != null) {
            sparkSchemaParam.setAppendCommonParams(o.LJ(obj, "1"));
        }
        String str4 = (String) linkedHashMap.get("auto_play_bgm");
        if (str4 != null) {
            sparkSchemaParam.setAutoPlayBgm(C60906NvK.LIZIZ("auto_play_bgm", str4, LIZ2, LJJJJIZL, false));
        }
        String str5 = (String) linkedHashMap.get("bid");
        if (str5 != null) {
            sparkSchemaParam.setBid(str5);
        }
        Object obj2 = linkedHashMap.get("block_back_press");
        if (obj2 != null) {
            sparkSchemaParam.setBlockBackPress(o.LJ(obj2, "1"));
        }
        String str6 = (String) linkedHashMap.get("bundle");
        if (str6 != null) {
            sparkSchemaParam.setBundle(str6);
        }
        Object obj3 = linkedHashMap.get("redirect_cdn_by_region");
        if (obj3 != null) {
            sparkSchemaParam.setCdnRegionRedirect(o.LJ(obj3, "1"));
        }
        String str7 = (String) linkedHashMap.get("channel");
        if (str7 != null) {
            sparkSchemaParam.setChannel(str7);
        }
        String str8 = (String) linkedHashMap.get("click_time");
        if (str8 != null) {
            sparkSchemaParam.setClickTime(str8);
        }
        String str9 = (String) linkedHashMap.get("container_bg_color");
        Object obj4 = linkedHashMap.get("container_bg_color_dark");
        Object obj5 = linkedHashMap.get("container_bg_color_light");
        if (str9 != null || obj4 != null || obj5 != null) {
            sparkSchemaParam.setContainerBgColor(C60906NvK.LIZJ("container_bg_color", str9, LIZ2, LJJJJIZL));
        }
        Object obj6 = linkedHashMap.get("disable_auto_remove_loading");
        if (obj6 != null) {
            sparkSchemaParam.setDisableAutoRemoveLoading(o.LJ(obj6, "1"));
        }
        Object obj7 = linkedHashMap.get("disable_back_press");
        if (obj7 != null) {
            sparkSchemaParam.setDisableBackPress(o.LJ(obj7, "1"));
        }
        Object obj8 = linkedHashMap.get("disable_builtin");
        if (obj8 != null) {
            sparkSchemaParam.setDisableBuiltin(Boolean.valueOf(o.LJ(obj8, "1")));
        }
        Object obj9 = linkedHashMap.get("disable_cdn");
        if (obj9 != null) {
            sparkSchemaParam.setDisableCDN(Boolean.valueOf(o.LJ(obj9, "1")));
        }
        Object obj10 = linkedHashMap.get("disable_event_cache");
        if (obj10 != null) {
            sparkSchemaParam.setDisableEventCache(o.LJ(obj10, "1"));
        }
        Object obj11 = linkedHashMap.get("disable_gecko");
        if (obj11 != null) {
            sparkSchemaParam.setDisableGecko(Boolean.valueOf(o.LJ(obj11, "1")));
        }
        Object obj12 = linkedHashMap.get("disable_gecko_update");
        if (obj12 != null) {
            sparkSchemaParam.setDisableGeckoUpdate(Boolean.valueOf(o.LJ(obj12, "1")));
        }
        Object obj13 = linkedHashMap.get("disable_hardware_accelerate");
        if (obj13 != null) {
            sparkSchemaParam.setDisableHardwareAccelerate(o.LJ(obj13, "1"));
        }
        Object obj14 = linkedHashMap.get("disable_offline");
        if (obj14 != null) {
            sparkSchemaParam.setDisableOffline(Boolean.valueOf(o.LJ(obj14, "1")));
        }
        Object obj15 = linkedHashMap.get("disable_save_image");
        if (obj15 != null) {
            sparkSchemaParam.setDisableSaveImage(o.LJ(obj15, "1"));
        }
        String str10 = (String) linkedHashMap.get("dynamic");
        if (str10 != null) {
            sparkSchemaParam.setDynamic(C60906NvK.LIZIZ("dynamic", str10, LIZ2, LJJJJIZL, false));
        }
        Object obj16 = linkedHashMap.get("enable_canvas");
        if (obj16 != null) {
            sparkSchemaParam.setEnableCanvas(o.LJ(obj16, "1"));
        }
        Object obj17 = linkedHashMap.get("enable_canvas_optimize");
        if (obj17 != null) {
            sparkSchemaParam.setEnableCanvasOptimization(Boolean.valueOf(o.LJ(obj17, "1")));
        }
        String str11 = (String) linkedHashMap.get("enable_code_cache");
        if (str11 != null) {
            sparkSchemaParam.setEnableCodeCache(C60906NvK.LIZIZ("enable_code_cache", str11, LIZ2, LJJJJIZL, false));
        }
        Object obj18 = linkedHashMap.get("enable_dynamic_v8");
        if (obj18 != null) {
            sparkSchemaParam.setEnableDynamicV8(o.LJ(obj18, "1"));
        }
        String str12 = (String) linkedHashMap.get("enable_extra_info");
        if (str12 != null) {
            sparkSchemaParam.setEnableExtraInfo(C60906NvK.LIZIZ("enable_extra_info", str12, LIZ2, LJJJJIZL, false));
        }
        Object obj19 = linkedHashMap.get("enable_js_runtime");
        if (obj19 != null) {
            sparkSchemaParam.setEnableJSRuntime(o.LJ(obj19, "1"));
        }
        Object obj20 = linkedHashMap.get("enable_memory_cache");
        if (obj20 != null) {
            sparkSchemaParam.setEnableMemoryCache(Boolean.valueOf(o.LJ(obj20, "1")));
        }
        Object obj21 = linkedHashMap.get("enable_pending_js_task");
        if (obj21 != null) {
            sparkSchemaParam.setEnablePendingJsTask(o.LJ(obj21, "1"));
        }
        String str13 = (String) linkedHashMap.get("enable_pre_code_cache");
        if (str13 != null) {
            sparkSchemaParam.setEnablePreCodeCache(C60906NvK.LIZIZ("enable_pre_code_cache", str13, LIZ2, LJJJJIZL, false));
        }
        String str14 = (String) linkedHashMap.get("enable_prefetch");
        if (str14 != null) {
            sparkSchemaParam.setEnablePrefetch(C60906NvK.LIZIZ("enable_prefetch", str14, LIZ2, LJJJJIZL, false));
        }
        Object obj22 = linkedHashMap.get("enable_scroll_web_view");
        if (obj22 != null) {
            sparkSchemaParam.setEnableScrollWebView(o.LJ(obj22, "1"));
        }
        Object obj23 = linkedHashMap.get("enable_spark_live_opt");
        if (obj23 != null) {
            sparkSchemaParam.setEnableSparkLiveOpt(o.LJ(obj23, "1"));
        }
        String str15 = (String) linkedHashMap.get("fallback_url");
        if (str15 != null) {
            sparkSchemaParam.setFallbackUrl(str15);
        }
        Object obj24 = linkedHashMap.get("forbidden_anim");
        if (obj24 != null) {
            sparkSchemaParam.setForbiddenAnim(o.LJ(obj24, "1"));
        }
        Object obj25 = linkedHashMap.get("force_h5");
        if (obj25 != null) {
            sparkSchemaParam.setForceH5(o.LJ(obj25, "1"));
        }
        String str16 = (String) linkedHashMap.get("force_theme_style");
        if (str16 != null) {
            sparkSchemaParam.setForceThemeStyle(str16);
        }
        Object obj26 = linkedHashMap.get("gecko_url_redirection");
        if (obj26 != null) {
            sparkSchemaParam.setGeckoUrlRedirection(o.LJ(obj26, "1"));
        }
        String str17 = (String) linkedHashMap.get("group");
        if (str17 != null) {
            sparkSchemaParam.setGroup(str17);
        }
        Object obj27 = linkedHashMap.get("hide_error");
        if (obj27 != null) {
            sparkSchemaParam.setHideError(o.LJ(obj27, "1"));
        }
        Object obj28 = linkedHashMap.get("hide_loading");
        if (obj28 != null) {
            sparkSchemaParam.setHideLoading(o.LJ(obj28, "1"));
        }
        Object obj29 = linkedHashMap.get("hide_system_video_poster");
        if (obj29 != null) {
            sparkSchemaParam.setHideSystemVideoPoster(o.LJ(obj29, "1"));
        }
        String str18 = (String) linkedHashMap.get("ignore_cache_policy");
        if (str18 != null) {
            sparkSchemaParam.setIgnoreCachePolicy(C60906NvK.LIZIZ("ignore_cache_policy", str18, LIZ2, LJJJJIZL, false));
        }
        Object obj30 = linkedHashMap.get("ignore_cached_theme");
        if (obj30 != null) {
            sparkSchemaParam.setIgnoreCachedTheme(o.LJ(obj30, "1"));
        }
        String str19 = (String) linkedHashMap.get("initial_data");
        if (str19 != null) {
            sparkSchemaParam.setInitialData(str19);
        }
        String str20 = (String) linkedHashMap.get("keyboard_adjust");
        if (str20 != null) {
            sparkSchemaParam.setKeyboardAdjust(C60906NvK.LIZIZ("keyboard_adjust", str20, LIZ2, LJJJJIZL, false));
        }
        Object obj31 = linkedHashMap.get("keyboard_compat");
        if (obj31 != null) {
            sparkSchemaParam.setKeyboardCompat(o.LJ(obj31, "1"));
        }
        Object obj32 = linkedHashMap.get("landscape_screen_size_as_portrait");
        if (obj32 != null) {
            sparkSchemaParam.setLandscapeScreenSizeAsPortrait(o.LJ(obj32, "1"));
        }
        String str21 = (String) linkedHashMap.get("loading_bg_color");
        Object obj33 = linkedHashMap.get("loading_bg_color_dark");
        Object obj34 = linkedHashMap.get("loading_bg_color_light");
        if (str21 != null || obj33 != null || obj34 != null) {
            sparkSchemaParam.setLoadingBgColor(C60906NvK.LIZJ("loading_bg_color", str21, LIZ2, LJJJJIZL));
        }
        Object obj35 = linkedHashMap.get("lock_resource");
        if (obj35 != null) {
            sparkSchemaParam.setLockResource(o.LJ(obj35, "1"));
        }
        String str22 = (String) linkedHashMap.get("lynxview_height");
        if (str22 != null) {
            sparkSchemaParam.setLynxviewHeight(Integer.valueOf(C60906NvK.LIZIZ("lynxview_height", str22, LIZ2, LJJJJIZL, true)));
        }
        String str23 = (String) linkedHashMap.get("lynxview_width");
        if (str23 != null) {
            sparkSchemaParam.setLynxviewWidth(Integer.valueOf(C60906NvK.LIZIZ("lynxview_width", str23, LIZ2, LJJJJIZL, true)));
        }
        Object obj36 = linkedHashMap.get("need_sec_link");
        if (obj36 != null) {
            sparkSchemaParam.setNeedSecLink(o.LJ(obj36, "1"));
        }
        String str24 = (String) linkedHashMap.get("net_worker");
        if (str24 != null) {
            sparkSchemaParam.setNetWorker(Integer.valueOf(C60906NvK.LIZIZ("net_worker", str24, LIZ2, LJJJJIZL, false)));
        }
        Object obj37 = linkedHashMap.get("only_local");
        if (obj37 != null) {
            sparkSchemaParam.setOnlyLocal(Boolean.valueOf(o.LJ(obj37, "1")));
        }
        Object obj38 = linkedHashMap.get("parallel_fetch_resource");
        if (obj38 != null) {
            sparkSchemaParam.setParallelFetchResource(o.LJ(obj38, "1"));
        }
        String str25 = (String) linkedHashMap.get("preloadFonts");
        if (str25 != null) {
            sparkSchemaParam.setPreloadFonts(str25);
        }
        String str26 = (String) linkedHashMap.get("preload_setting_keys");
        if (str26 != null) {
            sparkSchemaParam.setPreloadSettingsKeys(str26);
        }
        String str27 = (String) linkedHashMap.get("preload_storage_keys");
        if (str27 != null) {
            sparkSchemaParam.setPreloadStorageKeys(str27);
        }
        String str28 = (String) linkedHashMap.get("preset_height");
        if (str28 != null) {
            sparkSchemaParam.setPresetHeight(C60906NvK.LIZIZ("preset_height", str28, LIZ2, LJJJJIZL, true));
        }
        Object obj39 = linkedHashMap.get("preset_safe_point");
        if (obj39 != null) {
            sparkSchemaParam.setPresetSafePoint(o.LJ(obj39, "1"));
        }
        String str29 = (String) linkedHashMap.get("preset_width");
        if (str29 != null) {
            sparkSchemaParam.setPresetWidth(C60906NvK.LIZIZ("preset_width", str29, LIZ2, LJJJJIZL, true));
        }
        Object obj40 = linkedHashMap.get("proxy_enabled_runtime_type");
        if (obj40 != null) {
            sparkSchemaParam.setProxyEnabledRuntimeType(o.LJ(obj40, "1"));
        }
        String str30 = (String) linkedHashMap.get("redirect_regions");
        if (str30 != null) {
            sparkSchemaParam.setRedirectRegions(str30);
        }
        Object obj41 = linkedHashMap.get("resource_dynamic");
        if (obj41 != null) {
            sparkSchemaParam.setResourceDynamic(Boolean.valueOf(o.LJ(obj41, "1")));
        }
        String str31 = (String) linkedHashMap.get("sec_link_scene");
        if (str31 != null) {
            sparkSchemaParam.setSecLinkScene(str31);
        }
        String str32 = (String) linkedHashMap.get("session_id");
        if (str32 != null) {
            sparkSchemaParam.setSessionId(str32);
        }
        Object obj42 = linkedHashMap.get("share_group");
        if (obj42 != null) {
            sparkSchemaParam.setShareGroup(o.LJ(obj42, "1"));
        }
        Object obj43 = linkedHashMap.get("show_progress_bar_in_all_page");
        if (obj43 != null) {
            sparkSchemaParam.setShowProgressBarInAllPage(o.LJ(obj43, "1"));
        }
        String str33 = (String) linkedHashMap.get("skeleton_duration");
        if (str33 != null) {
            sparkSchemaParam.setSkeletonDuration(Integer.valueOf(C60906NvK.LIZIZ("skeleton_duration", str33, LIZ2, LJJJJIZL, true)));
        }
        String str34 = (String) linkedHashMap.get("skeleton_from_alpha");
        if (str34 != null) {
            sparkSchemaParam.setSkeletonFromAlpha(str34);
        }
        String str35 = (String) linkedHashMap.get("skeleton_path");
        if (str35 != null) {
            sparkSchemaParam.setSkeletonPath(str35);
        }
        String str36 = (String) linkedHashMap.get("skeleton_to_alpha");
        if (str36 != null) {
            sparkSchemaParam.setSkeletonToAlpha(str36);
        }
        Object obj44 = linkedHashMap.get("skeleton_with_animation");
        if (obj44 != null) {
            sparkSchemaParam.setSkeletonWithAnimation(o.LJ(obj44, "1"));
        }
        String str37 = (String) linkedHashMap.get("spark_perf_bid");
        if (str37 != null) {
            sparkSchemaParam.setSparkPerfBid(str37);
        }
        String str38 = (String) linkedHashMap.get("spark_perf_biz");
        if (str38 != null) {
            sparkSchemaParam.setSparkPerfBiz(str38);
        }
        String str39 = (String) linkedHashMap.get("ssp_config");
        if (str39 != null) {
            sparkSchemaParam.setSspConfig(C60906NvK.LIZIZ("ssp_config", str39, LIZ2, LJJJJIZL, false));
        }
        String str40 = (String) linkedHashMap.get("starling_channel");
        if (str40 != null) {
            sparkSchemaParam.setStarlingChannel(str40);
        }
        Object obj45 = linkedHashMap.get("starling_fallback");
        if (obj45 != null) {
            sparkSchemaParam.setStarlingFallback(o.LJ(obj45, "1"));
        }
        Object obj46 = linkedHashMap.get("subscribe_network_level");
        if (obj46 != null) {
            sparkSchemaParam.setSubscribeNetworkLevel(o.LJ(obj46, "1"));
        }
        String str41 = (String) linkedHashMap.get("surl");
        if (str41 != null) {
            sparkSchemaParam.setSurl(str41);
        }
        String str42 = (String) linkedHashMap.get("thread_strategy");
        if (str42 != null) {
            sparkSchemaParam.setThreadStrategy(C60906NvK.LIZIZ("thread_strategy", str42, LIZ2, LJJJJIZL, false));
        }
        Object obj47 = linkedHashMap.get("ui_running_mode");
        if (obj47 != null) {
            sparkSchemaParam.setUiRunningMode(o.LJ(obj47, "1"));
        }
        String str43 = (String) linkedHashMap.get("url");
        if (str43 != null) {
            sparkSchemaParam.setUrl(str43);
        }
        Object obj48 = linkedHashMap.get("use_forest");
        if (obj48 != null) {
            sparkSchemaParam.setUseForest(o.LJ(obj48, "1"));
        }
        Object obj49 = linkedHashMap.get("use_mutable_context");
        if (obj49 != null) {
            sparkSchemaParam.setUseMutableContext(o.LJ(obj49, "1"));
        }
        Object obj50 = linkedHashMap.get("use_preload");
        if (obj50 != null) {
            sparkSchemaParam.setUsePreload(o.LJ(obj50, "1"));
        }
        Object obj51 = linkedHashMap.get("use_preload_resource_h5");
        if (obj51 != null) {
            sparkSchemaParam.setUsePreloadResourceH5(o.LJ(obj51, "1"));
        }
        Object obj52 = linkedHashMap.get("wait_gecko_update");
        if (obj52 != null) {
            sparkSchemaParam.setWaitGeckoUpdate(Boolean.valueOf(o.LJ(obj52, "1")));
        }
        Object obj53 = linkedHashMap.get("wait_low_storage_update");
        if (obj53 != null) {
            sparkSchemaParam.setWaitLowStorageUpdate(o.LJ(obj53, "1"));
        }
        Object obj54 = linkedHashMap.get("webview_progress_bar");
        if (obj54 != null) {
            sparkSchemaParam.setWebviewProgressBar(o.LJ(obj54, "1"));
        }
        String host = LJJJJIZL.getHost();
        if (host != null) {
            if (s.LJJJLZIJ(host, "webview", false)) {
                enumC39924Flg = EnumC39924Flg.WEB;
            } else if (s.LJJJLZIJ(host, "lynxview", false)) {
                enumC39924Flg = EnumC39924Flg.LYNX;
            }
            sparkSchemaParam.setEngineType(enumC39924Flg);
            sparkSchemaParam.adjustValues();
            return sparkSchemaParam;
        }
        enumC39924Flg = EnumC39924Flg.UNKNOWN;
        sparkSchemaParam.setEngineType(enumC39924Flg);
        sparkSchemaParam.adjustValues();
        return sparkSchemaParam;
    }

    public static SparkXrSchemaParam LIZJ(String url, java.util.Map map, Bundle bundle, String containerId) {
        EnumC39924Flg enumC39924Flg;
        o.LJIIJ(url, "url");
        o.LJIIJ(containerId, "containerId");
        android.net.Uri LJJJJIZL = C17N.LJJJJIZL(url);
        java.util.Map<String, String> LIZ2 = C75252xN.LIZ(LJJJJIZL, map, bundle);
        SparkXrSchemaParam sparkXrSchemaParam = new SparkXrSchemaParam(null, 1, null);
        C75252xN.LIZLLL(containerId, LIZ2);
        LinkedHashMap linkedHashMap = (LinkedHashMap) LIZ2;
        String str = (String) linkedHashMap.get("__use_ttnet");
        if (str != null) {
            sparkXrSchemaParam.set_useTtnet(C60906NvK.LIZIZ("__use_ttnet", str, LIZ2, LJJJJIZL, false));
        }
        String str2 = (String) linkedHashMap.get("accessKey");
        if (str2 != null) {
            sparkXrSchemaParam.setAccessKey(str2);
        }
        String str3 = (String) linkedHashMap.get("access_key");
        if (str3 != null) {
            sparkXrSchemaParam.setAccessKeyBp(str3);
        }
        Object obj = linkedHashMap.get("append_common_params");
        if (obj != null) {
            sparkXrSchemaParam.setAppendCommonParams(o.LJ(obj, "1"));
        }
        String str4 = (String) linkedHashMap.get("auto_play_bgm");
        if (str4 != null) {
            sparkXrSchemaParam.setAutoPlayBgm(C60906NvK.LIZIZ("auto_play_bgm", str4, LIZ2, LJJJJIZL, false));
        }
        String str5 = (String) linkedHashMap.get("bid");
        if (str5 != null) {
            sparkXrSchemaParam.setBid(str5);
        }
        Object obj2 = linkedHashMap.get("block_back_press");
        if (obj2 != null) {
            sparkXrSchemaParam.setBlockBackPress(o.LJ(obj2, "1"));
        }
        String str6 = (String) linkedHashMap.get("bundle");
        if (str6 != null) {
            sparkXrSchemaParam.setBundle(str6);
        }
        Object obj3 = linkedHashMap.get("redirect_cdn_by_region");
        if (obj3 != null) {
            sparkXrSchemaParam.setCdnRegionRedirect(o.LJ(obj3, "1"));
        }
        String str7 = (String) linkedHashMap.get("channel");
        if (str7 != null) {
            sparkXrSchemaParam.setChannel(str7);
        }
        String str8 = (String) linkedHashMap.get("click_time");
        if (str8 != null) {
            sparkXrSchemaParam.setClickTime(str8);
        }
        String str9 = (String) linkedHashMap.get("container_bg_color");
        Object obj4 = linkedHashMap.get("container_bg_color_dark");
        Object obj5 = linkedHashMap.get("container_bg_color_light");
        if (str9 != null || obj4 != null || obj5 != null) {
            sparkXrSchemaParam.setContainerBgColor(C60906NvK.LIZJ("container_bg_color", str9, LIZ2, LJJJJIZL));
        }
        Object obj6 = linkedHashMap.get("disable_auto_remove_loading");
        if (obj6 != null) {
            sparkXrSchemaParam.setDisableAutoRemoveLoading(o.LJ(obj6, "1"));
        }
        Object obj7 = linkedHashMap.get("disable_back_press");
        if (obj7 != null) {
            sparkXrSchemaParam.setDisableBackPress(o.LJ(obj7, "1"));
        }
        Object obj8 = linkedHashMap.get("disable_builtin");
        if (obj8 != null) {
            sparkXrSchemaParam.setDisableBuiltin(Boolean.valueOf(o.LJ(obj8, "1")));
        }
        Object obj9 = linkedHashMap.get("disable_cdn");
        if (obj9 != null) {
            sparkXrSchemaParam.setDisableCDN(Boolean.valueOf(o.LJ(obj9, "1")));
        }
        Object obj10 = linkedHashMap.get("disable_event_cache");
        if (obj10 != null) {
            sparkXrSchemaParam.setDisableEventCache(o.LJ(obj10, "1"));
        }
        Object obj11 = linkedHashMap.get("disable_gecko");
        if (obj11 != null) {
            sparkXrSchemaParam.setDisableGecko(Boolean.valueOf(o.LJ(obj11, "1")));
        }
        Object obj12 = linkedHashMap.get("disable_gecko_update");
        if (obj12 != null) {
            sparkXrSchemaParam.setDisableGeckoUpdate(Boolean.valueOf(o.LJ(obj12, "1")));
        }
        Object obj13 = linkedHashMap.get("disable_hardware_accelerate");
        if (obj13 != null) {
            sparkXrSchemaParam.setDisableHardwareAccelerate(o.LJ(obj13, "1"));
        }
        Object obj14 = linkedHashMap.get("disable_offline");
        if (obj14 != null) {
            sparkXrSchemaParam.setDisableOffline(Boolean.valueOf(o.LJ(obj14, "1")));
        }
        Object obj15 = linkedHashMap.get("disable_save_image");
        if (obj15 != null) {
            sparkXrSchemaParam.setDisableSaveImage(o.LJ(obj15, "1"));
        }
        String str10 = (String) linkedHashMap.get("dynamic");
        if (str10 != null) {
            sparkXrSchemaParam.setDynamic(C60906NvK.LIZIZ("dynamic", str10, LIZ2, LJJJJIZL, false));
        }
        Object obj16 = linkedHashMap.get("enable_canvas");
        if (obj16 != null) {
            sparkXrSchemaParam.setEnableCanvas(o.LJ(obj16, "1"));
        }
        Object obj17 = linkedHashMap.get("enable_canvas_optimize");
        if (obj17 != null) {
            sparkXrSchemaParam.setEnableCanvasOptimization(Boolean.valueOf(o.LJ(obj17, "1")));
        }
        String str11 = (String) linkedHashMap.get("enable_code_cache");
        if (str11 != null) {
            sparkXrSchemaParam.setEnableCodeCache(C60906NvK.LIZIZ("enable_code_cache", str11, LIZ2, LJJJJIZL, false));
        }
        Object obj18 = linkedHashMap.get("enable_dynamic_v8");
        if (obj18 != null) {
            sparkXrSchemaParam.setEnableDynamicV8(o.LJ(obj18, "1"));
        }
        String str12 = (String) linkedHashMap.get("enable_extra_info");
        if (str12 != null) {
            sparkXrSchemaParam.setEnableExtraInfo(C60906NvK.LIZIZ("enable_extra_info", str12, LIZ2, LJJJJIZL, false));
        }
        Object obj19 = linkedHashMap.get("enable_js_runtime");
        if (obj19 != null) {
            sparkXrSchemaParam.setEnableJSRuntime(o.LJ(obj19, "1"));
        }
        Object obj20 = linkedHashMap.get("enable_memory_cache");
        if (obj20 != null) {
            sparkXrSchemaParam.setEnableMemoryCache(Boolean.valueOf(o.LJ(obj20, "1")));
        }
        Object obj21 = linkedHashMap.get("enable_pending_js_task");
        if (obj21 != null) {
            sparkXrSchemaParam.setEnablePendingJsTask(o.LJ(obj21, "1"));
        }
        String str13 = (String) linkedHashMap.get("enable_pre_code_cache");
        if (str13 != null) {
            sparkXrSchemaParam.setEnablePreCodeCache(C60906NvK.LIZIZ("enable_pre_code_cache", str13, LIZ2, LJJJJIZL, false));
        }
        String str14 = (String) linkedHashMap.get("enable_prefetch");
        if (str14 != null) {
            sparkXrSchemaParam.setEnablePrefetch(C60906NvK.LIZIZ("enable_prefetch", str14, LIZ2, LJJJJIZL, false));
        }
        Object obj22 = linkedHashMap.get("enable_scroll_web_view");
        if (obj22 != null) {
            sparkXrSchemaParam.setEnableScrollWebView(o.LJ(obj22, "1"));
        }
        Object obj23 = linkedHashMap.get("enable_spark_live_opt");
        if (obj23 != null) {
            sparkXrSchemaParam.setEnableSparkLiveOpt(o.LJ(obj23, "1"));
        }
        Object obj24 = linkedHashMap.get("exit_on_activity_finish");
        if (obj24 != null) {
            sparkXrSchemaParam.setExitOnActivityFinish(o.LJ(obj24, "1"));
        }
        String str15 = (String) linkedHashMap.get("fallback_url");
        if (str15 != null) {
            sparkXrSchemaParam.setFallbackUrl(str15);
        }
        Object obj25 = linkedHashMap.get("forbidden_anim");
        if (obj25 != null) {
            sparkXrSchemaParam.setForbiddenAnim(o.LJ(obj25, "1"));
        }
        Object obj26 = linkedHashMap.get("force_h5");
        if (obj26 != null) {
            sparkXrSchemaParam.setForceH5(o.LJ(obj26, "1"));
        }
        String str16 = (String) linkedHashMap.get("force_theme_style");
        if (str16 != null) {
            sparkXrSchemaParam.setForceThemeStyle(str16);
        }
        Object obj27 = linkedHashMap.get("gecko_url_redirection");
        if (obj27 != null) {
            sparkXrSchemaParam.setGeckoUrlRedirection(o.LJ(obj27, "1"));
        }
        String str17 = (String) linkedHashMap.get("group");
        if (str17 != null) {
            sparkXrSchemaParam.setGroup(str17);
        }
        Object obj28 = linkedHashMap.get("hide_error");
        if (obj28 != null) {
            sparkXrSchemaParam.setHideError(o.LJ(obj28, "1"));
        }
        Object obj29 = linkedHashMap.get("hide_loading");
        if (obj29 != null) {
            sparkXrSchemaParam.setHideLoading(o.LJ(obj29, "1"));
        }
        Object obj30 = linkedHashMap.get("hide_system_video_poster");
        if (obj30 != null) {
            sparkXrSchemaParam.setHideSystemVideoPoster(o.LJ(obj30, "1"));
        }
        String str18 = (String) linkedHashMap.get("ignore_cache_policy");
        if (str18 != null) {
            sparkXrSchemaParam.setIgnoreCachePolicy(C60906NvK.LIZIZ("ignore_cache_policy", str18, LIZ2, LJJJJIZL, false));
        }
        Object obj31 = linkedHashMap.get("ignore_cached_theme");
        if (obj31 != null) {
            sparkXrSchemaParam.setIgnoreCachedTheme(o.LJ(obj31, "1"));
        }
        String str19 = (String) linkedHashMap.get("initial_data");
        if (str19 != null) {
            sparkXrSchemaParam.setInitialData(str19);
        }
        String str20 = (String) linkedHashMap.get("keyboard_adjust");
        if (str20 != null) {
            sparkXrSchemaParam.setKeyboardAdjust(C60906NvK.LIZIZ("keyboard_adjust", str20, LIZ2, LJJJJIZL, false));
        }
        Object obj32 = linkedHashMap.get("keyboard_compat");
        if (obj32 != null) {
            sparkXrSchemaParam.setKeyboardCompat(o.LJ(obj32, "1"));
        }
        Object obj33 = linkedHashMap.get("landscape_screen_size_as_portrait");
        if (obj33 != null) {
            sparkXrSchemaParam.setLandscapeScreenSizeAsPortrait(o.LJ(obj33, "1"));
        }
        String str21 = (String) linkedHashMap.get("loading_bg_color");
        Object obj34 = linkedHashMap.get("loading_bg_color_dark");
        Object obj35 = linkedHashMap.get("loading_bg_color_light");
        if (str21 != null || obj34 != null || obj35 != null) {
            sparkXrSchemaParam.setLoadingBgColor(C60906NvK.LIZJ("loading_bg_color", str21, LIZ2, LJJJJIZL));
        }
        Object obj36 = linkedHashMap.get("lock_resource");
        if (obj36 != null) {
            sparkXrSchemaParam.setLockResource(o.LJ(obj36, "1"));
        }
        String str22 = (String) linkedHashMap.get("lynxview_height");
        if (str22 != null) {
            sparkXrSchemaParam.setLynxviewHeight(Integer.valueOf(C60906NvK.LIZIZ("lynxview_height", str22, LIZ2, LJJJJIZL, true)));
        }
        String str23 = (String) linkedHashMap.get("lynxview_width");
        if (str23 != null) {
            sparkXrSchemaParam.setLynxviewWidth(Integer.valueOf(C60906NvK.LIZIZ("lynxview_width", str23, LIZ2, LJJJJIZL, true)));
        }
        Object obj37 = linkedHashMap.get("need_sec_link");
        if (obj37 != null) {
            sparkXrSchemaParam.setNeedSecLink(o.LJ(obj37, "1"));
        }
        String str24 = (String) linkedHashMap.get("net_worker");
        if (str24 != null) {
            sparkXrSchemaParam.setNetWorker(Integer.valueOf(C60906NvK.LIZIZ("net_worker", str24, LIZ2, LJJJJIZL, false)));
        }
        Object obj38 = linkedHashMap.get("only_local");
        if (obj38 != null) {
            sparkXrSchemaParam.setOnlyLocal(Boolean.valueOf(o.LJ(obj38, "1")));
        }
        Object obj39 = linkedHashMap.get("parallel_fetch_resource");
        if (obj39 != null) {
            sparkXrSchemaParam.setParallelFetchResource(o.LJ(obj39, "1"));
        }
        String str25 = (String) linkedHashMap.get("preloadFonts");
        if (str25 != null) {
            sparkXrSchemaParam.setPreloadFonts(str25);
        }
        String str26 = (String) linkedHashMap.get("preload_setting_keys");
        if (str26 != null) {
            sparkXrSchemaParam.setPreloadSettingsKeys(str26);
        }
        String str27 = (String) linkedHashMap.get("preload_storage_keys");
        if (str27 != null) {
            sparkXrSchemaParam.setPreloadStorageKeys(str27);
        }
        String str28 = (String) linkedHashMap.get("preset_height");
        if (str28 != null) {
            sparkXrSchemaParam.setPresetHeight(C60906NvK.LIZIZ("preset_height", str28, LIZ2, LJJJJIZL, true));
        }
        Object obj40 = linkedHashMap.get("preset_safe_point");
        if (obj40 != null) {
            sparkXrSchemaParam.setPresetSafePoint(o.LJ(obj40, "1"));
        }
        String str29 = (String) linkedHashMap.get("preset_width");
        if (str29 != null) {
            sparkXrSchemaParam.setPresetWidth(C60906NvK.LIZIZ("preset_width", str29, LIZ2, LJJJJIZL, true));
        }
        Object obj41 = linkedHashMap.get("proxy_enabled_runtime_type");
        if (obj41 != null) {
            sparkXrSchemaParam.setProxyEnabledRuntimeType(o.LJ(obj41, "1"));
        }
        String str30 = (String) linkedHashMap.get("redirect_regions");
        if (str30 != null) {
            sparkXrSchemaParam.setRedirectRegions(str30);
        }
        Object obj42 = linkedHashMap.get("resource_dynamic");
        if (obj42 != null) {
            sparkXrSchemaParam.setResourceDynamic(Boolean.valueOf(o.LJ(obj42, "1")));
        }
        String str31 = (String) linkedHashMap.get("sec_link_scene");
        if (str31 != null) {
            sparkXrSchemaParam.setSecLinkScene(str31);
        }
        String str32 = (String) linkedHashMap.get("session_id");
        if (str32 != null) {
            sparkXrSchemaParam.setSessionId(str32);
        }
        Object obj43 = linkedHashMap.get("share_group");
        if (obj43 != null) {
            sparkXrSchemaParam.setShareGroup(o.LJ(obj43, "1"));
        }
        Object obj44 = linkedHashMap.get("show_progress_bar_in_all_page");
        if (obj44 != null) {
            sparkXrSchemaParam.setShowProgressBarInAllPage(o.LJ(obj44, "1"));
        }
        String str33 = (String) linkedHashMap.get("skeleton_duration");
        if (str33 != null) {
            sparkXrSchemaParam.setSkeletonDuration(Integer.valueOf(C60906NvK.LIZIZ("skeleton_duration", str33, LIZ2, LJJJJIZL, true)));
        }
        String str34 = (String) linkedHashMap.get("skeleton_from_alpha");
        if (str34 != null) {
            sparkXrSchemaParam.setSkeletonFromAlpha(str34);
        }
        String str35 = (String) linkedHashMap.get("skeleton_path");
        if (str35 != null) {
            sparkXrSchemaParam.setSkeletonPath(str35);
        }
        String str36 = (String) linkedHashMap.get("skeleton_to_alpha");
        if (str36 != null) {
            sparkXrSchemaParam.setSkeletonToAlpha(str36);
        }
        Object obj45 = linkedHashMap.get("skeleton_with_animation");
        if (obj45 != null) {
            sparkXrSchemaParam.setSkeletonWithAnimation(o.LJ(obj45, "1"));
        }
        String str37 = (String) linkedHashMap.get("spark_perf_bid");
        if (str37 != null) {
            sparkXrSchemaParam.setSparkPerfBid(str37);
        }
        String str38 = (String) linkedHashMap.get("spark_perf_biz");
        if (str38 != null) {
            sparkXrSchemaParam.setSparkPerfBiz(str38);
        }
        String str39 = (String) linkedHashMap.get("splash_drawable");
        if (str39 != null) {
            sparkXrSchemaParam.setSplashDrawable(str39);
        }
        String str40 = (String) linkedHashMap.get("splash_title");
        if (str40 != null) {
            sparkXrSchemaParam.setSplashTitle(str40);
        }
        String str41 = (String) linkedHashMap.get("ssp_config");
        if (str41 != null) {
            sparkXrSchemaParam.setSspConfig(C60906NvK.LIZIZ("ssp_config", str41, LIZ2, LJJJJIZL, false));
        }
        String str42 = (String) linkedHashMap.get("starling_channel");
        if (str42 != null) {
            sparkXrSchemaParam.setStarlingChannel(str42);
        }
        Object obj46 = linkedHashMap.get("starling_fallback");
        if (obj46 != null) {
            sparkXrSchemaParam.setStarlingFallback(o.LJ(obj46, "1"));
        }
        Object obj47 = linkedHashMap.get("subscribe_network_level");
        if (obj47 != null) {
            sparkXrSchemaParam.setSubscribeNetworkLevel(o.LJ(obj47, "1"));
        }
        String str43 = (String) linkedHashMap.get("surl");
        if (str43 != null) {
            sparkXrSchemaParam.setSurl(str43);
        }
        String str44 = (String) linkedHashMap.get("thread_strategy");
        if (str44 != null) {
            sparkXrSchemaParam.setThreadStrategy(C60906NvK.LIZIZ("thread_strategy", str44, LIZ2, LJJJJIZL, false));
        }
        Object obj48 = linkedHashMap.get("ui_running_mode");
        if (obj48 != null) {
            sparkXrSchemaParam.setUiRunningMode(o.LJ(obj48, "1"));
        }
        String str45 = (String) linkedHashMap.get("url");
        if (str45 != null) {
            sparkXrSchemaParam.setUrl(str45);
        }
        Object obj49 = linkedHashMap.get("use_forest");
        if (obj49 != null) {
            sparkXrSchemaParam.setUseForest(o.LJ(obj49, "1"));
        }
        Object obj50 = linkedHashMap.get("use_mutable_context");
        if (obj50 != null) {
            sparkXrSchemaParam.setUseMutableContext(o.LJ(obj50, "1"));
        }
        Object obj51 = linkedHashMap.get("use_preload");
        if (obj51 != null) {
            sparkXrSchemaParam.setUsePreload(o.LJ(obj51, "1"));
        }
        Object obj52 = linkedHashMap.get("use_preload_resource_h5");
        if (obj52 != null) {
            sparkXrSchemaParam.setUsePreloadResourceH5(o.LJ(obj52, "1"));
        }
        Object obj53 = linkedHashMap.get("wait_gecko_update");
        if (obj53 != null) {
            sparkXrSchemaParam.setWaitGeckoUpdate(Boolean.valueOf(o.LJ(obj53, "1")));
        }
        Object obj54 = linkedHashMap.get("wait_low_storage_update");
        if (obj54 != null) {
            sparkXrSchemaParam.setWaitLowStorageUpdate(o.LJ(obj54, "1"));
        }
        Object obj55 = linkedHashMap.get("webview_progress_bar");
        if (obj55 != null) {
            sparkXrSchemaParam.setWebviewProgressBar(o.LJ(obj55, "1"));
        }
        String host = LJJJJIZL.getHost();
        if (host != null) {
            if (s.LJJJLZIJ(host, "webview", false)) {
                enumC39924Flg = EnumC39924Flg.WEB;
            } else if (s.LJJJLZIJ(host, "lynxview", false)) {
                enumC39924Flg = EnumC39924Flg.LYNX;
            }
            sparkXrSchemaParam.setEngineType(enumC39924Flg);
            sparkXrSchemaParam.adjustValues();
            return sparkXrSchemaParam;
        }
        enumC39924Flg = EnumC39924Flg.UNKNOWN;
        sparkXrSchemaParam.setEngineType(enumC39924Flg);
        sparkXrSchemaParam.adjustValues();
        return sparkXrSchemaParam;
    }
}
