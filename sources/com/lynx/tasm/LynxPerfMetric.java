package com.lynx.tasm;

import X.C39942Fly;
import X.VMD;
import X.X1D;
import com.bytedance.android.livesdk.livesetting.linkmic.LiveAudienceLinkmicLowestAgeSetting;
import com.bytedance.android.livesdk.livesetting.linkmic.LivesdkLinkmicFloatWindowOptimizeSetting;
import com.bytedance.mt.protector.impl.string2number.CastDoubleProtector;
import com.bytedance.mt.protector.impl.string2number.CastIntegerProtector;
import com.bytedance.mt.protector.impl.string2number.CastLongProtector;
import com.bytedance.vcloud.abrmodule.ABRConfig;
import com.lynx.react.bridge.ReadableMap;
import com.lynx.react.bridge.ReadableMapKeySetIterator;
import com.lynx.tasm.base.LLog;
import defpackage.i0;
import java.util.HashMap;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes15.dex */
public final class LynxPerfMetric {
    public static String[] PERF_POINTS = {"tasm_binary_decode", "tasm_end_decode_finish_load_template", "tasm_finish_load_template", "diff_root_create", "js_finish_load_core", "js_finish_load_app", "js_and_tasm_all_ready", "tti", "js_runtime_type", "corejs_size", "source_js_size", "first_page_layout", "FIRST_SEP", "layout", "BOTH_SEP", "render_page", "diff_same_root", "UPDATE_SEP", "SSR_START_SEP", "ssr_fmp", "ssr_dispatch", "ssr_generate_dom", "ssr_source_size", "SSR_END_SEP"};
    public static String[] PERF_STAMP_POINTS = {"init_start", "init_end", "load_template_start", "load_template_end", "decode_binary_start", "decode_binary_end", "render_template_start", "render_template_end", "diff_root_start", "diff_root_end", "layout_start", "layout_end", "load_corejs_start", "load_corejs_end", "load_appjs_start", "load_appjs_end", "start_diff", "end_diff", "update_page_start", "update_page_end"};
    public double actual_first_screen_end_timestamp;
    public Double actual_fmp_duration;
    public double corejs_size;
    public double diff_root_create;
    public double diff_same_root;
    public double first_page_layout;
    public boolean is_ssr_hydrate;
    public double js_and_tasm_all_ready;
    public double js_finish_load_app;
    public double js_finish_load_core;
    public double js_runtime_type;
    public double layout;
    public VMD mConfig;
    public boolean mIsColdBoot;
    public final HashMap<String, Double> mMetricMap;
    public final HashMap<String, Object> mMetricTimingMap;
    public double render_page;
    public double rk_average_time_per_frame;
    public double rk_build_frame;
    public double rk_layout;
    public double rk_max_time_per_frame;
    public double rk_paint;
    public double rk_raster;
    public double source_js_size;
    public double ssr_dispatch;
    public double ssr_fmp;
    public double ssr_generate_dom;
    public double ssr_source_size;
    public double tasm_binary_decode;
    public double tasm_end_decode_finish_load_template;
    public double tasm_finish_load_template;
    public double tti;
    public String url;

    public double getActualFMPDuration() {
        Double d = this.actual_fmp_duration;
        if (d != null) {
            return d.doubleValue();
        }
        return LivesdkLinkmicFloatWindowOptimizeSetting.CORNER_RADIUS_PX;
    }

    public boolean isHasActualFMP() {
        if (this.actual_fmp_duration != null) {
            return true;
        }
        return false;
    }

    public JSONObject toJSONObject() {
        JSONObject jSONObject = new JSONObject(this.mMetricMap);
        try {
            String str = this.url;
            if (str != null) {
                jSONObject.put("url", str);
                jSONObject.put("cold_boot", this.mIsColdBoot);
            }
            VMD vmd = this.mConfig;
            if (vmd != null) {
                jSONObject.put("page_type", vmd.LIZIZ);
                jSONObject.put("react_version", this.mConfig.LJIIJJI);
            }
            if (this.mMetricTimingMap.size() > 0) {
                jSONObject.put("timing", new JSONObject(this.mMetricTimingMap));
            }
        } catch (JSONException unused) {
        }
        return jSONObject;
    }

    public String toString() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("LynxPerfMetric");
        LIZ.append(this.mMetricMap);
        LIZ.append(this.mMetricTimingMap);
        LIZ.append("\nurl=");
        LIZ.append(this.url);
        LIZ.append("\npage_type=");
        LIZ.append(this.mConfig.LIZIZ);
        LIZ.append("\nreact_version=");
        LIZ.append(this.mConfig.LJIIJJI);
        return X1D.LIZIZ(LIZ);
    }

    public double getActualFirstScreenEndTimeStamp() {
        return this.actual_first_screen_end_timestamp;
    }

    public VMD getConfigInfo() {
        return this.mConfig;
    }

    public double getCoreJSSize() {
        return this.corejs_size;
    }

    public double getDiffRootCreate() {
        return this.diff_root_create;
    }

    public double getDiffSameRoot() {
        return this.diff_same_root;
    }

    public double getFirsPageLayout() {
        return this.first_page_layout;
    }

    public boolean getIsSsrHydrate() {
        return this.is_ssr_hydrate;
    }

    public double getJsAndTasmAllReady() {
        return this.js_and_tasm_all_ready;
    }

    public double getJsFinishLoadApp() {
        return this.js_finish_load_app;
    }

    public double getJsFinishLoadCore() {
        return this.js_finish_load_core;
    }

    public double getJsRuntimeType() {
        return this.js_runtime_type;
    }

    public double getLayout() {
        return this.layout;
    }

    public double getRenderPage() {
        return this.render_page;
    }

    public double getSsrDispatch() {
        return this.ssr_dispatch;
    }

    public double getSsrFmp() {
        return this.ssr_fmp;
    }

    public double getSsrGenerateDom() {
        return this.ssr_generate_dom;
    }

    public double getSsrSourceSize() {
        return this.ssr_source_size;
    }

    public double getTasmBinaryDecode() {
        return this.tasm_binary_decode;
    }

    public double getTasmEndDecodeFinishLoadTemplate() {
        return this.tasm_end_decode_finish_load_template;
    }

    public double getTasmFinishLoadTemplate() {
        return this.tasm_finish_load_template;
    }

    public double getTti() {
        return this.tti;
    }

    private void convert(ReadableMap readableMap) {
        if (readableMap.hasKey(Integer.toString(20220425))) {
            this.is_ssr_hydrate = readableMap.getBoolean(Integer.toString(20220425));
        }
        ReadableMapKeySetIterator keySetIterator = readableMap.keySetIterator();
        while (keySetIterator.hasNextKey()) {
            String nextKey = keySetIterator.nextKey();
            int parseInt = CastIntegerProtector.parseInt(nextKey);
            if (parseInt == 20211216) {
                this.actual_fmp_duration = Double.valueOf(readableMap.getDouble(nextKey));
            } else if (parseInt != 20220425) {
                fillIn(parseInt, readableMap.getDouble(nextKey));
            }
        }
    }

    private void convertTiming(ReadableMap readableMap) {
        ReadableMapKeySetIterator keySetIterator = readableMap.keySetIterator();
        while (keySetIterator.hasNextKey()) {
            String nextKey = keySetIterator.nextKey();
            int parseInt = CastIntegerProtector.parseInt(nextKey);
            if (parseInt == 20211216) {
                try {
                    this.actual_first_screen_end_timestamp = CastDoubleProtector.parseDouble(readableMap.getString(nextKey));
                } catch (Exception e) {
                    StringBuilder LIZ = X1D.LIZ();
                    LIZ.append("get actual_first_screen_end_timestamp failed:");
                    LIZ.append(e.getMessage());
                    LLog.LIZLLL(4, "lynx_LynxPerfMetric", X1D.LIZIZ(LIZ));
                }
            } else {
                this.mMetricTimingMap.put(PERF_STAMP_POINTS[parseInt], readableMap.getString(nextKey));
            }
        }
    }

    public void correctFirstPageLayout(long j) {
        Object obj = this.mMetricTimingMap.get("load_template_start");
        if ((obj instanceof String) && j != 0) {
            try {
                long longValue = j - CastLongProtector.valueOf((String) obj).longValue();
                if (longValue > 0) {
                    double d = longValue;
                    if (d < this.first_page_layout) {
                        this.first_page_layout = d;
                        this.mMetricMap.put("first_page_layout", Double.valueOf(d));
                    }
                }
            } catch (Throwable unused) {
            }
        }
    }

    public void setIsColdBoot(boolean z) {
        this.mIsColdBoot = z;
    }

    private void fillIn(int i, double d) {
        switch (i) {
            case 0:
                this.tasm_binary_decode = d;
                break;
            case 1:
                this.tasm_end_decode_finish_load_template = d;
                break;
            case 2:
                this.tasm_finish_load_template = d;
                break;
            case 3:
                this.diff_root_create = d;
                break;
            case 4:
                this.js_finish_load_core = d;
                break;
            case 5:
                this.js_finish_load_app = d;
                break;
            case 6:
                this.js_and_tasm_all_ready = d;
                break;
            case 7:
                this.tti = d;
                break;
            case 8:
                this.js_runtime_type = d;
                break;
            case 9:
                this.corejs_size = d;
                break;
            case 10:
                this.source_js_size = d;
                break;
            case ABRConfig.ABR_BANDWIDTH_PARAMETER_KEY /* 11 */:
                this.first_page_layout = d;
                break;
            case 12:
            case 14:
            case 17:
            case 18:
            default:
                if (C39942Fly.LIZJ.booleanValue()) {
                    switch (i) {
                        case 25:
                            this.rk_layout = d;
                            break;
                        case 26:
                            this.rk_paint = d;
                            break;
                        case 27:
                            this.rk_build_frame = d;
                            break;
                        case 28:
                            this.rk_raster = d;
                            break;
                        case 29:
                        default:
                            StringBuilder LIZ = X1D.LIZ();
                            LIZ.append("no such perf key=");
                            LIZ.append(i);
                            LLog.LIZLLL(4, "lynx_LynxPerfMetric", X1D.LIZIZ(LIZ));
                            return;
                        case 30:
                            this.rk_max_time_per_frame = d;
                            break;
                        case 31:
                            this.rk_average_time_per_frame = d;
                            break;
                    }
                } else {
                    StringBuilder LIZ2 = X1D.LIZ();
                    LIZ2.append("no such perf key=");
                    LIZ2.append(i);
                    LLog.LIZLLL(4, "lynx_LynxPerfMetric", X1D.LIZIZ(LIZ2));
                    return;
                }
            case ABRConfig.ABR_STARTUP_MAX_BITRATE /* 13 */:
                this.layout = d;
                break;
            case 15:
                this.render_page = d;
                break;
            case LiveAudienceLinkmicLowestAgeSetting.DEFAULT /* 16 */:
                this.diff_same_root = d;
                break;
            case 19:
                this.ssr_fmp = d;
                break;
            case 20:
                this.ssr_dispatch = d;
                break;
            case 21:
                this.ssr_generate_dom = d;
                break;
            case 22:
                this.ssr_source_size = d;
                break;
        }
        String str = PERF_POINTS[i];
        if (this.is_ssr_hydrate) {
            str = i0.LJFF(str, "_hydrate");
        }
        this.mMetricMap.put(str, Double.valueOf(d));
    }

    public void setInitTiming(long j, long j2) {
        this.mMetricTimingMap.put("init_start", Long.valueOf(j));
        this.mMetricTimingMap.put("init_end", Long.valueOf(j2));
    }

    public LynxPerfMetric(ReadableMap readableMap, ReadableMap readableMap2, String str, VMD vmd) {
        this.url = str;
        this.mConfig = vmd;
        this.mMetricMap = new HashMap<>(readableMap.size());
        this.mMetricTimingMap = new HashMap<>(readableMap2.size());
        if (C39942Fly.LIZJ.booleanValue() && PERF_POINTS.length == 24 && PERF_STAMP_POINTS.length == 20) {
            PERF_POINTS = new String[]{"tasm_binary_decode", "tasm_end_decode_finish_load_template", "tasm_finish_load_template", "diff_root_create", "js_finish_load_core", "js_finish_load_app", "js_and_tasm_all_ready", "tti", "js_runtime_type", "corejs_size", "source_js_size", "first_page_layout", "FIRST_SEP", "layout", "BOTH_SEP", "render_page", "diff_same_root", "UPDATE_SEP", "SSR_START_SEP", "ssr_fmp", "ssr_dispatch", "ssr_generate_dom", "ssr_source_size", "SSR_END_SEP", "RK_SEP", "rk_layout", "rk_paint", "rk_build_frame", "rk_raster", "RK_FIRST_SEP", "rk_max_time_per_frame", "rk_average_time_per_frame", "RK_UPDATE_SEP"};
            PERF_STAMP_POINTS = new String[]{"init_start", "init_end", "load_template_start", "load_template_end", "decode_binary_start", "decode_binary_end", "render_template_start", "render_template_end", "diff_root_start", "diff_root_end", "layout_start", "layout_end", "load_corejs_start", "load_corejs_end", "load_appjs_start", "load_appjs_end", "start_diff", "end_diff", "update_page_start", "update_page_end", "rk_layout_start", "rk_layout_end", "rk_paint_start", "rk_paint_end", "rk_build_frame_start", "rk_build_frame_end", "rk_raster_start", "rk_raster_end"};
        }
        convert(readableMap);
        convertTiming(readableMap2);
    }
}
