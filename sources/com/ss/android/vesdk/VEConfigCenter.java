package com.ss.android.vesdk;

import X.C09580Ze;
import X.C16880lQ;
import X.C63862P4o;
import X.C65429Pm5;
import X.EnumC63861P4n;
import X.EnumC63863P4p;
import X.InterfaceC09240Xw;
import X.P4H;
import X.V0N;
import com.bytedance.android.livesdk.livesetting.broadcast.LiveMaxRetainAlogMessageSizeSetting;
import com.bytedance.android.livesdk.livesetting.broadcast.LiveTryModeCountDownThresholdSetting;
import com.bytedance.mt.protector.impl.JSONArrayProtectorUtils;
import com.bytedance.mt.protector.impl.JSONObjectProtectorUtils;
import com.ss.android.vesdk.runtime.TEConfigCenter;
import java.lang.reflect.Method;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.atomic.AtomicBoolean;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes12.dex */
public class VEConfigCenter {
    public static volatile VEConfigCenter sInstance;
    public boolean mIsInitByteBench;
    public final Map<String, ValuePkt> sConfigs = new HashMap();
    public final Map<String, ValuePkt> sModifiedConfigs = new HashMap();
    public static EnumC63863P4p mABSetType = EnumC63863P4p.VEABSetType_Default;
    public static final Object sByteBenchLock = new Object();
    public static boolean enablePreloadSo = false;

    /* loaded from: classes12.dex */
    public static class ValuePkt {
        public P4H abType;
        public EnumC63861P4n configType;
        public DataType dataType;
        public String description;
        public AtomicBoolean locked = new AtomicBoolean(false);
        public Object value;

        public <T> T getValueAndLock() {
            if (!this.locked.get()) {
                this.locked.set(true);
            }
            return (T) this.value;
        }

        public String toString() {
            Object obj = this.value;
            if (obj != null) {
                return obj.toString();
            }
            return "";
        }

        public P4H getABType() {
            return this.abType;
        }

        public EnumC63861P4n getConfigType() {
            return this.configType;
        }

        public DataType getDataType() {
            return this.dataType;
        }

        public <T> T getValue() {
            return (T) this.value;
        }

        public void setAbType(P4H p4h) {
            this.abType = p4h;
        }

        public ValuePkt updateValue(Object obj) {
            if (this.locked.get()) {
                return this;
            }
            this.value = obj;
            return this;
        }

        public ValuePkt(DataType dataType, Object obj, EnumC63861P4n enumC63861P4n, String str) {
            this.value = obj;
            this.dataType = dataType;
            this.configType = enumC63861P4n;
            this.description = str;
        }
    }

    public void initByteBench() {
    }

    private void addConfigsFromCamera() {
        ValuePkt valuePkt;
        JSONArray jSONArray = new JSONArray();
        try {
            JSONArray jSONArray2 = new JSONArray("[{\"key\" : \"ve_camera_type\",\"dataType\": 1,\"defaultVal\": 0,\"description\": \"camera type\"},{\"key\": \"ve_is_in_camera2_blocklist\",\"dataType\": 0,\"defaultVal\": true,\"description\": \"is in camera2 blocklist\"},{\"key\": \"ve_camera_wide_angle\",\"dataType\": 1,\"defaultVal\": -1,\"description\": \"wide angle\"},{\"key\": \"ve_camera_stablization\",\"dataType\": 1,\"defaultVal\": -1,\"description\": \"stablization\"},{\"key\": \"ve_camera_fps_range\",\"dataType\": 1,\"defaultVal\": 7,\"description\": \"camera lowest fps\"},{\"key\": \"ve_camera_focus_timeout\",\"dataType\": 1,\"defaultVal\": 2500,\"description\": \"camera focus timeout in ms\"},{\"key\": \"ve_camera_enable_previewing_fallback\",\"dataType\": 0,\"defaultVal\": false,\"description\": \"camera enable previewing fallback\"},{\"key\":\"ve_enable_wide_fov_for_samsung\",\"dataType\":0,\"defaultVal\": false,\"description\": \"enable wide fov\"},{\"key\": \"ve_camera_open_close_sync\",\"dataType\": 0,\"defaultVal\": true,\"description\": \"camera open close sync\"},{\"key\": \"ve_force_close_camera_when_timeout\",\"dataType\": 0,\"defaultVal\": false,\"description\": \"if force close camera when close time out\"},{\"key\": \"frame_rate_strategy\",\"dataType\": 1,\"defaultVal\": 0,\"description\": \"frame rate strategy\"},{\"key\": \"is_use_setrecordinghint\",\"dataType\": 0,\"defaultVal\": false,\"description\": \"is use setrecordinghint\"},{\"key\": \"ve_camera_fps_max\",\"dataType\": 1,\"defaultVal\": 30,\"description\": \"camera fps max limit\"},{\"key\": \"ve_enable_open_camera1_optimize\",\"dataType\": 0,\"defaultVal\": true,\"description\": \"enable open camera1 optimize\"},{\"key\": \"ve_enable_open_camera1_crs\",\"dataType\": 0,\"defaultVal\": false,\"description\": \"enable open camera1 crash\"},{\"key\": \"ve_enable_gc_for_camera_metadata\",\"dataType\": 1,\"defaultVal\": 0,\"description\": \"enable manual gc for camera metadata\"},{\"key\": \"ve_camera_scene_diff_fps_opt\",\"dataType\": 0,\"defaultVal\": false,\"description\": \"enable camera scene diff fps opt\"},{\"key\": \"ve_enable_refactor_camera_focus\",\"dataType\": 0,\"defaultVal\": false,\"description\": \"enable refactor camera focus\"},{\"key\": \"ve_enable_camera2_zsl_capture\",\"dataType\": 0,\"defaultVal\": false,\"description\": \"enable camera2 zsl capture\"},{\"key\": \"ve_enable_yuv_buffer_capture\",\"dataType\": 0,\"defaultVal\": false,\"description\": \"enable camera yuv buffer capture\"},{\"key\": \"ve_enable_camera_capture_stream\",\"dataType\": 0,\"defaultVal\": true,\"description\": \"enable take picture via camera capture stream\"},{\"key\": \"ve_enable_camera_devices_cache\",\"dataType\": 0,\"defaultVal\": false,\"description\": \"enable camera devices cache to optimize SelectCamera\"},{\"key\": \"ve_camera_ai_augmentation\",\"dataType\": 1,\"defaultVal\": 0,\"description\": \"ai augmentation\"},{\"key\": \"ve_enable_face_detection\",\"dataType\": 1,\"defaultVal\": 0,\"description\": \"enable face detection and strategy\"},{\"key\": \"ve_enable_camera_api2_detect\",\"dataType\": 0,\"defaultVal\": false,\"description\": \"enable camera api2 detection\"},{\"key\": \"ve_disable_camera_hdr\",\"dataType\": 0,\"defaultVal\": false,\"description\": \"disable camera hdr\"},{\"key\": \"ve_enable_camera_noise_reduce\",\"dataType\": 0,\"defaultVal\": false,\"description\": \"enable noise reduce for vendor camera\"},{\"key\": \"ve_support_camera_multicam_zoom\",\"dataType\": 0,\"defaultVal\": false,\"description\": \"enable camera2 multicam zoom\"},{\"key\": \"ve_camera_zoom_ratio_max\",\"dataType\": 2,\"defaultVal\": -1,\"description\": \"camera2 multicam zoom ratio max value\"},{\"key\": \"ve_camera_zoom_ratio_min\",\"dataType\": 2,\"defaultVal\": -1,\"description\": \"camera2 multicam zoom ratio min value\"},{\"key\": \"ve_enable_camera_preview_template\",\"dataType\": 0,\"defaultVal\": false,\"description\": \"camera session template of video mode\"},{\"key\": \"ve_enable_camera2_deferred_surface\",\"dataType\": 0,\"defaultVal\": false,\"description\": \"enable deferred surface to createCaptureSession\"},{\"key\": \"ve_enable_camera2_abort_session_capture\",\"dataType\": 0,\"defaultVal\": false,\"description\": \"enable camera2 abort session capture\"},{\"key\": \"ve_enable_camera2_monitor_gyroscope\",\"dataType\": 0,\"defaultVal\": false,\"description\": \"enable monitor gyroscope for camera2 focus\"},{\"key\": \"ve_enable_force_close_camera_opt\",\"dataType\": 0,\"defaultVal\": false,\"description\": \"trigger close camera double check\"},{\"key\": \"ve_enable_collect_camera_capbilities\",\"dataType\": 0,\"defaultVal\": false,\"description\": \"enable collect camera capbilities\"},{\"key\": \"ve_enable_camera_switch_camera1_optimize\",\"dataType\": 0,\"defaultVal\": false,\"description\": \"ve enable camera switch camera1 optimize\"},{\"key\": \"ve_camera_capture_hdr\",\"dataType\": 0,\"defaultVal\": false,\"description\": \"enable hdr when use capture mode\"},{\"key\": \"ve_support_dual_camera\",\"dataType\": 1,\"defaultVal\": 0,\"description\": \"Whether dual-camera is supported\"},{\"key\": \"ve_dual_camera_expansion_scheme\",\"dataType\": 0,\"defaultVal\": false,\"description\": \"Whether to use dual-camera expansion scheme\"},{\"key\": \"key_camera_capture_mfnr\",\"dataType\": 1,\"defaultVal\": 0,\"description\": \"vendor mfnr algorithm type\"},{\"key\": \"ve_camera_disable_rdhw_record\",\"dataType\": 0,\"defaultVal\": false,\"description\": \"disable huawei record\"}]");
            for (int i = 0; i < jSONArray2.length(); i++) {
                jSONArray.put(jSONArray2.get(i));
            }
        } catch (Exception e) {
            C16880lQ.LLLLIIL(e);
        }
        try {
            JSONArray jSONArray3 = new JSONArray(jSONArray.toString());
            for (int i2 = 0; i2 < jSONArray3.length(); i2++) {
                JSONObject jSONObject = JSONArrayProtectorUtils.getJSONObject(jSONArray3, i2);
                int i3 = JSONObjectProtectorUtils.getInt(jSONObject, "dataType");
                String string = JSONObjectProtectorUtils.getString(jSONObject, "description");
                if (i3 == 0) {
                    valuePkt = new ValuePkt(DataType.BOOLEAN, Boolean.valueOf(JSONObjectProtectorUtils.getBoolean(jSONObject, "defaultVal")), EnumC63861P4n.CONFIG_TYPE_AB, string);
                } else if (i3 != 1) {
                    if (i3 != 2) {
                        if (i3 == 3) {
                            valuePkt = new ValuePkt(DataType.STRING, JSONObjectProtectorUtils.getString(jSONObject, "defaultVal"), EnumC63861P4n.CONFIG_TYPE_AB, string);
                        }
                    } else {
                        valuePkt = new ValuePkt(DataType.FLOAT, Float.valueOf((float) JSONObjectProtectorUtils.getDouble(jSONObject, "defaultVal")), EnumC63861P4n.CONFIG_TYPE_AB, string);
                    }
                } else {
                    valuePkt = new ValuePkt(DataType.INTEGER, Integer.valueOf(JSONObjectProtectorUtils.getInt(jSONObject, "defaultVal")), EnumC63861P4n.CONFIG_TYPE_AB, string);
                }
                valuePkt.setAbType(P4H.FORCAMERA);
                addConfig(JSONObjectProtectorUtils.getString(jSONObject, "key"), valuePkt);
            }
        } catch (JSONException e2) {
            C16880lQ.LLLLIIL(e2);
        }
    }

    private void emendCoconfig() {
        TEConfigCenter.LIZ("crossplat_glbase_fbo", new ValuePkt(DataType.BOOLEAN, Boolean.valueOf(C65429Pm5.LJFF("enable_render_lib", false)), EnumC63861P4n.CONFIG_TYPE_AB, "crossplat_glbase_fbo"));
    }

    public static VEConfigCenter getInstance() {
        if (sInstance == null) {
            synchronized (VEConfigCenter.class) {
                if (sInstance == null) {
                    sInstance = new VEConfigCenter();
                }
            }
        }
        return sInstance;
    }

    private void setConfigsDefaultValue() {
        int i = C63862P4o.LIZ[mABSetType.ordinal()];
        if (i != 1) {
            if (i != 2) {
                if (i != 3) {
                    if (i != 4) {
                        return;
                    }
                    Boolean bool = Boolean.TRUE;
                    updateValue("ve_enable_render_layer_effect_pre_init", bool);
                    updateValue("ve_enable_preview_size_change_opt1", bool);
                    updateValue("ve_titan_release_block_time_real", 0);
                    updateValue("ve_enable_recorder_photo_delay_opt", bool);
                    updateValue("ve_enable_readermanager_refactor", bool);
                    return;
                }
                updateValue("ve_enable_global_decoder_pool", 1);
                Boolean bool2 = Boolean.TRUE;
                updateValue("veabtest_enable_seek_noise_opt", bool2);
                updateValue("veabtest_hook_image_copy", bool2);
                updateValue("ve_enable_Renderlayer_PreloadCount_Opt", 2);
                updateValue("ve_enable_image_preload", bool2);
                updateValue("ve_enable_render_layer_effect_pre_init", bool2);
                updateValue("veabtest_get_media_info_optimization", bool2);
                updateValue("veabtest_find_stream_info_optimization", bool2);
                updateValue("ve_renderlayer_segment_max_cache", 8);
                updateValue("ve_enable_preview_size_change_opt1", bool2);
                updateValue("ve_enable_seek_parallel_decode", bool2);
                updateValue("ve_enable_seek_backward_drop_opt", bool2);
                updateValue("EnableImageTextureCache", bool2);
                updateValue("ve_enable_preview_sharpness_opt", bool2);
                updateValue("ve_anable_codec2_output_format_align_16", bool2);
                updateValue("ve_gif_decoder_cache", bool2);
                updateValue("ve_enable_encode_operating_rate", Integer.valueOf(LiveTryModeCountDownThresholdSetting.DEFAULT));
                updateValue("ve_enable_camera_switch_camera1_optimize", bool2);
                updateValue("ve_force_close_camera_when_timeout", bool2);
                updateValue("veabtest_hevc_seek_optimization", bool2);
                updateValue("ve_enable_decoder_schedule_opt_hw", 0);
                updateValue("ve_camera_output_and_update_strategy", 3);
                updateValue("ve_enable_titan_video_decode_opt", bool2);
                updateValue("ve_enable_decoder_dispatch", 2);
                updateValue("ve_enable_compile_hw_encoder_opt", bool2);
                updateValue("ve_enable_hw_decoder_support_rotate", bool2);
                updateValue("ve_enable_amazing_feature_handle_cache", bool2);
                updateValue("ve_enable_lv_audio_graph_refactor", bool2);
                updateValue("ve_enable_backend_dispatch", "{cpu: -1, gpu: -1, duration: 500}");
                updateValue("ve_enable_audio_reader_preload_reuse", bool2);
                updateValue("ve_enable_opt_hwencode_dts", bool2);
                updateValue("ve_camera_fps_range", 15);
                updateValue("ve_enable_forward_ongoingseek_opt", bool2);
                updateValue("use_byte264", bool2);
                updateValue("ve_enable_video_reader_hw_overload_fallback_opt", bool2);
                updateValue("ve_enable_seek_preload_drop_frame", bool2);
                updateValue("ve_titan_follow_shot_independent_thread", bool2);
                updateValue("ve_enable_effect_render_without_glreadpixels", bool2);
                updateValue("enable_android_hdr2sdr_support", bool2);
                updateValue("ve_enable_pip_resolution_opt", bool2);
                updateValue("ve_enable_render_encode_resolution_align4", bool2);
                updateValue("ve_enable_mpeg24vp89_hwdecoder2", bool2);
                updateValue("ve_enable_hwdecode_playback_dropframe_opt", bool2);
                updateValue("ve_small_window_double_thread_decode", bool2);
                updateValue("ve_enable_imageAlgorithmReuseAndOptForAmazing", bool2);
                updateValue("ve_retry_count", 50);
                updateValue("ve_enable_readermanager_refactor", bool2);
                updateValue("ve_enable_render_layer_effect_skip_opt", bool2);
                updateValue("ve_titan_release_block_time_real", 0);
                updateValue("ve_enable_recorder_photo_delay_opt", bool2);
                return;
            }
            Boolean bool3 = Boolean.TRUE;
            updateValue("ve_enable_titan_audio_graph_refactor", bool3);
            updateValue("ve_enable_readermanager_refactor", bool3);
            updateValue("ve_enable_global_decoder_pool", 1);
            return;
        }
        Boolean bool4 = Boolean.TRUE;
        updateValue("ve_enable_titan_audio_graph_refactor", bool4);
        updateValue("ve_enable_readermanager_refactor", bool4);
    }

    public void clear() {
        this.sConfigs.clear();
    }

    public String exportRecordToJson() {
        JSONObject jSONObject = new JSONObject();
        for (Map.Entry<String, ValuePkt> entry : this.sConfigs.entrySet()) {
            try {
                if (!entry.getValue().getABType().equals(P4H.FOREFFECT) && (entry.getKey().contains("camera") || entry.getKey().contains("record") || entry.getKey().equals("use_open_gl_three") || entry.getKey().equals("frame_rate_strategy") || entry.getKey().equals("video_duration_opt") || entry.getKey().equals("ve_enable_oes_texture_shot_screen") || entry.getKey().equals("ve_enable_wide_fov_for_samsung") || entry.getKey().equals("ve_enable_stop_preview_optimize") || entry.getKey().equals("ve_enable_refactor_audio"))) {
                    jSONObject.put(entry.getKey(), entry.getValue().value);
                }
            } catch (JSONException e) {
                C16880lQ.LLLLIIL(e);
            }
        }
        return jSONObject.toString();
    }

    public String exportToJson() {
        JSONArray jSONArray = new JSONArray();
        for (Map.Entry<String, ValuePkt> entry : this.sConfigs.entrySet()) {
            try {
                JSONObject jSONObject = new JSONObject();
                jSONObject.put("key", entry.getKey());
                if (entry.getValue() != null) {
                    jSONObject.put("description", entry.getValue().description);
                    jSONObject.put("dataType", entry.getValue().dataType);
                    jSONObject.put("value", entry.getValue().value);
                    jSONObject.put("configType", entry.getValue().configType);
                }
                jSONArray.put(jSONObject);
            } catch (JSONException e) {
                C16880lQ.LLLLIIL(e);
                return "";
            }
        }
        return jSONArray.toString();
    }

    public VEConfigCenter() {
        initConfigCenter();
    }

    private void addConfigsFromEffect() {
        String str;
        ValuePkt valuePkt;
        try {
            str = (String) Class.forName("com.bef.effectsdk.EffectABConfig").getDeclaredMethod("requestABInfoWithLicenseArray", String[].class, Boolean.TYPE).invoke(null, new String[]{"ve_record", "ve_enigma", "ve_edit", "ve_mv", "ve_detector", "ve_image"}, Boolean.TRUE);
        } catch (Exception e) {
            C16880lQ.LLLLIIL(e);
            str = "";
        }
        try {
            JSONArray jSONArray = new JSONArray(str);
            for (int i = 0; i < jSONArray.length(); i++) {
                JSONObject jSONObject = JSONArrayProtectorUtils.getJSONObject(jSONArray, i);
                int i2 = JSONObjectProtectorUtils.getInt(jSONObject, "dataType");
                String string = JSONObjectProtectorUtils.getString(jSONObject, "description");
                if (i2 == 0) {
                    valuePkt = new ValuePkt(DataType.BOOLEAN, Boolean.valueOf(JSONObjectProtectorUtils.getBoolean(jSONObject, "defaultVal")), EnumC63861P4n.CONFIG_TYPE_AB, string);
                } else if (i2 != 1) {
                    if (i2 != 2) {
                        if (i2 == 3) {
                            valuePkt = new ValuePkt(DataType.STRING, JSONObjectProtectorUtils.getString(jSONObject, "defaultVal"), EnumC63861P4n.CONFIG_TYPE_AB, string);
                        }
                    } else {
                        valuePkt = new ValuePkt(DataType.FLOAT, Float.valueOf((float) JSONObjectProtectorUtils.getDouble(jSONObject, "defaultVal")), EnumC63861P4n.CONFIG_TYPE_AB, string);
                    }
                } else {
                    valuePkt = new ValuePkt(DataType.INTEGER, Integer.valueOf(JSONObjectProtectorUtils.getInt(jSONObject, "defaultVal")), EnumC63861P4n.CONFIG_TYPE_AB, string);
                }
                valuePkt.setAbType(P4H.FOREFFECT);
                addConfig(JSONObjectProtectorUtils.getString(jSONObject, "key"), valuePkt);
            }
        } catch (JSONException e2) {
            C16880lQ.LLLLIIL(e2);
        }
    }

    public int syncConfigToNative() {
        Map<String, ValuePkt> map;
        if (getValue("ve_enable_ab_sync_opt", false).booleanValue()) {
            map = this.sModifiedConfigs;
        } else {
            map = this.sConfigs;
        }
        for (Map.Entry<String, ValuePkt> entry : map.entrySet()) {
            if (entry.getValue().abType == P4H.FOREFFECT) {
                updateEffectConfig(entry.getKey(), entry.getValue());
            } else if (entry.getValue().abType != P4H.FORCAMERA) {
                TEConfigCenter.LIZ(entry.getKey(), entry.getValue());
            }
        }
        emendCoconfig();
        return 0;
    }

    private void initConfigCenter() {
        DataType dataType = DataType.STRING;
        EnumC63861P4n enumC63861P4n = EnumC63861P4n.CONFIG_TYPE_AB;
        addConfig("wide_camera_id", new ValuePkt(dataType, "-1", enumC63861P4n, "wide camera device id"));
        DataType dataType2 = DataType.BOOLEAN;
        Boolean bool = Boolean.FALSE;
        addConfig("enable_android_hdr2sdr_support", new ValuePkt(dataType2, bool, enumC63861P4n, "enable android hdr2sdr support"));
        addConfig("enable_android_hdr_preview_support", new ValuePkt(dataType2, bool, enumC63861P4n, "enable android hdr preview support"));
        addConfig("veabtest_enable_hdr_flag_supported", new ValuePkt(dataType2, bool, enumC63861P4n, "lv/cc hdr flag for export"));
        addConfig("enable_android_hw_hdr_compile_support", new ValuePkt(dataType2, bool, enumC63861P4n, "enable android hw hdr compile support"));
        addConfig("crossplat_glbase_fbo", new ValuePkt(dataType2, bool, enumC63861P4n, "enable crossplat glbase fbo"));
        addConfig("vboost_compile", new ValuePkt(dataType2, bool, enumC63861P4n, "enable vboost compile"));
        DataType dataType3 = DataType.INTEGER;
        addConfig("use_open_gl_three", new ValuePkt(dataType3, 1, enumC63861P4n, "use GLES3.0"));
        addConfig("vesdk_max_cache_count", new ValuePkt(dataType3, 0, enumC63861P4n, "config max cache count for input decode frame"));
        addConfig("gpu_syncobject_type", new ValuePkt(dataType3, 0, EnumC63861P4n.CONFIG_TYPE_DEFAULT, "GPU SyncObject type: 0-glFence; 1-eglFence; 2-glFinish"));
        Boolean bool2 = Boolean.TRUE;
        addConfig("compile_probe_use_byte264", new ValuePkt(dataType2, bool2, enumC63861P4n, "compile_probe use libbyte264"));
        addConfig("compile_probe_crf", new ValuePkt(dataType3, -1, enumC63861P4n, "compile probe use crf"));
        addConfig("compile_probe_interval_frame", new ValuePkt(dataType3, -1, enumC63861P4n, "compile probe interval frame"));
        addConfig("compile_probe_sleep_time", new ValuePkt(dataType3, -1, enumC63861P4n, "compile probe sleep time"));
        addConfig("use_byte264", new ValuePkt(dataType2, bool, enumC63861P4n, "use libbyte264"));
        addConfig("aeabtest_v2api", new ValuePkt(dataType2, bool, enumC63861P4n, "use new audiosdk api"));
        addConfig("color_space", new ValuePkt(dataType2, bool2, enumC63861P4n, "color space"));
        addConfig("vesdk_audiomix_replace", new ValuePkt(dataType2, bool2, enumC63861P4n, "vesdk_audiomix_replace"));
        addConfig("ve_enable_audio_clipping_protection_gain", new ValuePkt(dataType2, bool, enumC63861P4n, "Enable audio clipping protection gain to replace climiter. Code is in TEAudioComposeUnit. Use case is for video compilation."));
        addConfig("ve_enable_audio_clipping_protection_gain_experiment", new ValuePkt(dataType2, bool, enumC63861P4n, "Enable audio clipping protection gain experiment. Use case is for video compilation."));
        DataType dataType4 = DataType.FLOAT;
        addConfig("ve_audio_clipping_protection_gain", new ValuePkt(dataType4, Float.valueOf(1.0f), enumC63861P4n, "Audio clipping protection gain to replace climiter. The value should be less than 1.0f and greater than 0.f. Code is in TEAudioComposeUnit. Use case is for video compilation."));
        Float valueOf = Float.valueOf(0.0f);
        addConfig("ve_compilation_climiter_pre_gain_db", new ValuePkt(dataType4, valueOf, enumC63861P4n, "Add a pre-gain for climiter. The value should be in dB unit. Code is in TEAudioComposeUnit. Use case is for video compilation."));
        addConfig("enable_record_mpeg4", new ValuePkt(dataType2, bool, enumC63861P4n, "enable record mpeg4"));
        addConfig("ve_enable_record_hevc", new ValuePkt(dataType2, bool, enumC63861P4n, "enable record hevc"));
        addConfig("ve_record_codec_type", new ValuePkt(dataType3, 0, enumC63861P4n, "record codec type"));
        addConfig("vesdk_audio_hw_encoder", new ValuePkt(dataType2, bool, enumC63861P4n, "audio hw encoder"));
        Float valueOf2 = Float.valueOf(-1.0f);
        addConfig("ve_recorder_fps_downgrade", new ValuePkt(dataType4, valueOf2, enumC63861P4n, "Downgrading recorder fps."));
        addConfig("video_duration_opt", new ValuePkt(dataType2, bool, enumC63861P4n, "video_duration_opt"));
        addConfig("enable_render_lib", new ValuePkt(dataType2, bool, enumC63861P4n, "vesdk enable render lib"));
        addConfig("renderlib_fbo_opt", new ValuePkt(dataType2, bool, enumC63861P4n, "vesdk renderlib fbo opt"));
        addConfig("vesdk_use_agfxcontext", new ValuePkt(dataType2, bool, enumC63861P4n, "vesdk enable agfx ctx"));
        addConfig("ve_use_titan_recorder_engine", new ValuePkt(dataType2, bool, enumC63861P4n, "use titan recorder engine"));
        addConfig("enable_duet_gl_finish", new ValuePkt(dataType2, bool, enumC63861P4n, "enable duet glFinish"));
        addConfig("ve_enable_preload_effect_res", new ValuePkt(dataType2, bool, enumC63861P4n, "enable preload effect res"));
        addConfig("ve_disable_effect_internal_setting", new ValuePkt(dataType2, bool, enumC63861P4n, "disable effect internal setting"));
        addConfig("ve_enable_titan_auto_test_log", new ValuePkt(dataType2, bool, enumC63861P4n, "enable titan auto test log"));
        addConfig("ve_opt_first_frame", new ValuePkt(dataType2, bool, enumC63861P4n, "opt first frame"));
        addConfig("ve_opt_first_frame_bypass_effect_frame_cnt", new ValuePkt(dataType3, 3, enumC63861P4n, "opt first frame bypass effect frame cnt"));
        addConfig("ve_camera_frame_update_independent_thread", new ValuePkt(dataType2, bool, enumC63861P4n, "camera frame update independent thread"));
        addConfig("ve_set_camera_two_output", new ValuePkt(dataType2, bool, enumC63861P4n, "ve set camera two output"));
        addConfig("ve_enable_camera_metadata", new ValuePkt(dataType2, bool, enumC63861P4n, "enable camera metadata"));
        addConfig("ve_titan_gpu_render_opt", new ValuePkt(dataType2, bool, enumC63861P4n, "opt titan gpu render follow"));
        addConfig("ve_titan_init_and_start_opt", new ValuePkt(dataType2, bool, enumC63861P4n, "opt titan init and start follow"));
        addConfig("ve_downscale_render_and_record_origin_content", new ValuePkt(dataType3, 0, enumC63861P4n, "ve downscale render and record origin content"));
        addConfig("ve_camera_output_and_update_strategy", new ValuePkt(dataType3, 0, enumC63861P4n, "ve camera output and update strategy"));
        addConfig("ve_enable_three_buffer", new ValuePkt(dataType2, bool, enumC63861P4n, "enable 3 buffer"));
        addConfig("ve_async_detection", new ValuePkt(dataType2, bool, enumC63861P4n, "effect async detection"));
        addConfig("ve_retry_count", new ValuePkt(dataType3, 0, enumC63861P4n, "camera open retry"));
        addConfig("ve_retry_start_preview_count", new ValuePkt(dataType3, 0, enumC63861P4n, "start preview retry count"));
        addConfig("ve_enable_stop_preview_optimize", new ValuePkt(dataType2, bool, enumC63861P4n, "stop preview async optimize"));
        addConfig("ve_enable_compile_buffer_hw_encode", new ValuePkt(dataType2, bool, enumC63861P4n, "Android Hw encode compile "));
        addConfig("ve_enable_render_encode_resolution_align4", new ValuePkt(dataType2, bool, enumC63861P4n, "render and encode resolution can be align4"));
        addConfig("ve_small_window_double_thread_decode", new ValuePkt(dataType2, bool, enumC63861P4n, "ve small window double thread decode"));
        EnumC63861P4n enumC63861P4n2 = EnumC63861P4n.CONFIG_TYPE_SETTINGS;
        addConfig("ve_camera_enable_previewing_fallback", new ValuePkt(dataType2, bool, enumC63861P4n2, "camera enable previewing fallback"));
        addConfig("ve_enable_background_strategy", new ValuePkt(dataType2, bool2, enumC63861P4n2, "enable background strategy"));
        addConfig("ve_enable_pin_refactor", new ValuePkt(dataType2, bool, enumC63861P4n, "dmt take pin refactor"));
        addConfig("ve_enable_engine_monitor_report", new ValuePkt(dataType2, bool, enumC63861P4n, "enable engine monitor report"));
        addConfig("ve_enable_hwdecode_dequeue_inputbuffer_opt", new ValuePkt(dataType2, bool, enumC63861P4n, "MediaCodec dequeue video inputBuffer opt"));
        addConfig("ve_async_set_sensor_data", new ValuePkt(dataType2, bool, enumC63861P4n, "Send sensor data to effect asynchronously."));
        addConfig("enable_remux_color_info", new ValuePkt(dataType2, bool2, enumC63861P4n, "enable remux color info"));
        addConfig("remux_video_res", new ValuePkt(dataType3, -1, enumC63861P4n, "remux video res"));
        addConfig("ve_compile_report", new ValuePkt(dataType3, 0, enumC63861P4n, "compile report state"));
        addConfig("vesdk_gbu_trace_info", new ValuePkt(dataType3, 0, enumC63861P4n, "vesdk gbu pipeline trace info"));
        addConfig("ve_enable_compile_timeout_diagnosis", new ValuePkt(dataType2, bool, enumC63861P4n, "compile timeout diagnosis"));
        addConfig("ve_enable_refactor_audio", new ValuePkt(dataType2, bool, enumC63861P4n, "enable audio refactor"));
        addConfig("privacy_error_action", new ValuePkt(dataType3, 2, enumC63861P4n, "privacy_error_action"));
        addConfig("privacy_error_check_interval", new ValuePkt(dataType3, 1000, enumC63861P4n, "privacy_error_check_interval"));
        addConfig("privacy_error_check_threshold", new ValuePkt(dataType3, 3000, enumC63861P4n, "privacy_error_check_threshold"));
        addConfig("ve_enable_oes_texture_shot_screen", new ValuePkt(dataType2, bool, enumC63861P4n, "enable 2d texture shot screen"));
        addConfig("ve_enable_hwdecode_playback_dropframe_opt", new ValuePkt(dataType2, bool, enumC63861P4n, "hwdecode playback dropframe opt"));
        addConfig("ve_enable_upload_virtual_mem_size", new ValuePkt(dataType2, bool, enumC63861P4n, "enable upload virtual mem size"));
        addConfig("ve_enable_mpeg24vp89_hwdecoder2", new ValuePkt(dataType2, bool, enumC63861P4n, "enable mpeg24 vp89 hwdecoder"));
        addConfig("ve_enable_imageAlgorithmReuseAndOptForAmazing", new ValuePkt(dataType2, bool, enumC63861P4n, "imageAlgorithm Reuse and optForAmazing"));
        addConfig("byteVC1_10bit_hardware_encoder_timeout", new ValuePkt(dataType3, 10000, enumC63861P4n, "byteVC1 10bit hardware encoder timeout params"));
        addConfig("ve_enable_memory_mode", new ValuePkt(dataType2, bool, enumC63861P4n, "enable low memory mode"));
        addConfig("ve_low_memory_threshold", new ValuePkt(dataType3, 300, enumC63861P4n, "low memory mode threshold"));
        addConfig("ve_compile_codec_type", new ValuePkt(dataType3, 0, enumC63861P4n, "compile support bytevc1 encode"));
        addConfig("ve_compile_hw_bytevc1_max_pixel_count", new ValuePkt(dataType3, 8294400, enumC63861P4n, "compile bytevc1 max pixel count"));
        addConfig("ve_enable_sys_karaoke", new ValuePkt(dataType2, bool, enumC63861P4n2, "enable sys karaoke"));
        addConfig("ve_enable_common_earback", new ValuePkt(dataType2, bool2, enumC63861P4n2, "enable common earback"));
        addConfig("ve_enable_aaduio", new ValuePkt(dataType2, bool2, enumC63861P4n2, "enable aaudio"));
        addConfig("ve_enable_pip_resolution_opt", new ValuePkt(dataType2, bool, enumC63861P4n, "enable pip resolution opt"));
        addConfig("ve_hardware_encode_fallback", new ValuePkt(dataType3, 0, enumC63861P4n, "config for hardware encode fallback to soft, DO NOT set NON-ZERO ON LINE"));
        addConfig("ve_asf_amount", new ValuePkt(dataType4, valueOf2, enumC63861P4n, "ve_asf_amount"));
        addConfig("ve_asf_over_ratio", new ValuePkt(dataType4, valueOf2, enumC63861P4n, "ve_asf_over_ratio"));
        addConfig("ve_asf_gpu_power_level", new ValuePkt(dataType3, 4, enumC63861P4n, "ve_asf_gpu_power_level"));
        addConfig("ve_asf_init_delay_frame_cnt", new ValuePkt(dataType3, 0, enumC63861P4n, "ve_asf_init_delay_frame_cnt"));
        addConfig("ve_asf_process_delay_frame_cnt", new ValuePkt(dataType3, 0, enumC63861P4n, "ve_asf_process_delay_frame_cnt"));
        addConfig("ve_duet_audio_delay_mt_opt", new ValuePkt(dataType4, valueOf, enumC63861P4n, "Duet audio delay mt optimize. 0 is no opt."));
        addConfig("ve_enable_optimize_audio_delay", new ValuePkt(dataType3, 0, enumC63861P4n, "opt audio delay when stop record"));
        addConfig("ve_enable_vboost", new ValuePkt(dataType2, bool, enumC63861P4n, "opt performance when open/close camera and stop record"));
        addConfig("ve_vboost_timeout", new ValuePkt(dataType3, Integer.valueOf(LiveMaxRetainAlogMessageSizeSetting.DEFAULT), enumC63861P4n2, "VBoost timeout"));
        addConfig("ve_enable_effect_render_without_glreadpixels", new ValuePkt(dataType2, bool, enumC63861P4n, "enable effect render without glreadpixels"));
        addConfig("ve_enable_global_decoder_pool", new ValuePkt(dataType3, 0, enumC63861P4n, "enable global decoder pool"));
        addConfig("ve_enable_decoder_dispatch", new ValuePkt(dataType3, 0, enumC63861P4n, "enable global dispatch for decoder tasks"));
        addConfig("ve_enable_decoder_dispatch2", new ValuePkt(dataType3, 0, enumC63861P4n, "enable global dispatch "));
        addConfig("ve_disable_ffmpeg_command", new ValuePkt(dataType2, bool, enumC63861P4n, "ve_disable_ffmpeg_command "));
        addConfig("ve_enable_decoder_schedule_opt_hw", new ValuePkt(dataType3, 0, enumC63861P4n, "enable decoder schedule for hw"));
        addConfig("ve_enable_first_reader_preload", new ValuePkt(dataType2, bool, enumC63861P4n, "first frame reader preload"));
        addConfig("ve_enable_first_reader_preload_preview", new ValuePkt(dataType2, bool, enumC63861P4n, "first frame reader preload for preview"));
        addConfig("ve_enable_readermanager_refactor", new ValuePkt(dataType2, bool, enumC63861P4n, "description tevideoreader manager refactor"));
        addConfig("ve_enable_readermanager_global", new ValuePkt(dataType2, bool, enumC63861P4n, "description tevideoreader manager global"));
        addConfig("ve_enable_video_frame_cache", new ValuePkt(dataType3, 0, enumC63861P4n, "andorid support video frame cache"));
        addConfig("ve_enable_schdule_device_capability_opt", new ValuePkt(dataType3, 0, enumC63861P4n, "description enable  device monitor opt"));
        addConfig("ve_enable_schdule_preload", new ValuePkt(dataType3, 0, enumC63861P4n, "ve_enable_schdule_preload"));
        addConfig("ve_hwdecode_support_rt_and_or", new ValuePkt(dataType2, bool, enumC63861P4n, "hw decode support real-time and operating-rate"));
        addConfig("ve_camera_enable_preview_fake_frame", new ValuePkt(dataType2, bool, enumC63861P4n, "ve camera enable preview fake frame"));
        addConfig("ve_camera_enable_preview_fake_frame_gaussian_blur", new ValuePkt(dataType2, bool, enumC63861P4n, "ve camera enable preview fake frame gaussian_blur"));
        addConfig("ve_camera_enable_preview_pure_color_background", new ValuePkt(dataType2, bool, enumC63861P4n, "ve_camera_enable_preview_pure_color_background"));
        addConfig("ve_camera_preview_pure_color_background_rgba", new ValuePkt(dataType3, 0, enumC63861P4n, "ve_camera_preview_pure_color_background_rgba"));
        addConfig("ve_mediacodec_resource_reasonable_distribute", new ValuePkt(dataType2, bool, enumC63861P4n, "mediacodec resource reasonable distribute"));
        addConfig("ve_aec_sample_rate_opt", new ValuePkt(dataType2, bool, enumC63861P4n, "aec sample rate opt"));
        addConfig("vesdk_ffmpeg_enable_video_timestamp_monotonic", new ValuePkt(dataType2, bool, enumC63861P4n, "enable ffmpeg video timestamp monotonic"));
        addConfig("ve_titan_release_block_time_real", new ValuePkt(dataType3, -1, enumC63861P4n, "Titan release block time"));
        addConfig("ve_shotscreen_delay_max_frame", new ValuePkt(dataType3, 20, enumC63861P4n2, "shotscreen delay max frame"));
        addConfig("ve_shotscreen_delay_threshold", new ValuePkt(dataType3, 10, enumC63861P4n2, "shotscreen delay light frame num threshold"));
        addConfig("ve_enable_audio_reader_preload_reuse", new ValuePkt(dataType2, bool, enumC63861P4n, "support audioReader preload and reuse"));
        addConfig("ve_enable_cache_timestamp", new ValuePkt(dataType2, bool, enumC63861P4n2, "enable cache timestamp"));
        addConfig("ve_enable_veimage_optimize_quality", new ValuePkt(dataType2, bool, enumC63861P4n, "VEImage enable optimize quality"));
        addConfig("ve_titan_follow_shot_independent_thread", new ValuePkt(dataType2, bool, enumC63861P4n, "follow shot independent thread."));
        addConfig("ve_enable_seek_preload_drop_frame", new ValuePkt(dataType2, bool, enumC63861P4n, "seek and preload drop frame"));
        addConfig("ve_enable_amazing_feature_handle_cache", new ValuePkt(dataType2, bool, enumC63861P4n, "amazing feature handle cache"));
        addConfig("ve_enable_image_preload", new ValuePkt(dataType2, bool, enumC63861P4n, "enable image preload when display"));
        addConfig("ve_ban_hw_extra_data_loop", new ValuePkt(dataType2, bool, enumC63861P4n, "Ban mediacodec sps/pps loop & some opt"));
        addConfig("ve_titan_max_count_of_render_frame_buffer", new ValuePkt(dataType3, 30, enumC63861P4n, "Set max count of titan`s frame buffer cache"));
        addConfig("ve_enable_amazing_feature_handle_preload", new ValuePkt(dataType2, bool, enumC63861P4n, "amazing feature handle preload"));
        addConfig("ve_enable_titan_audio_graph_refactor", new ValuePkt(dataType2, bool, enumC63861P4n, "enable titan audio graph refactor."));
        addConfig("ve_enable_bgm_mic_delay_opt", new ValuePkt(dataType2, bool, enumC63861P4n, "enable bgm mic delay opt"));
        addConfig("ve_enable_luma_detect_ec", new ValuePkt(dataType2, bool, enumC63861P4n, "enable luma detect ec"));
        addConfig("ve_enable_luma_detect", new ValuePkt(dataType2, bool2, enumC63861P4n, "enable luma detect"));
        addConfig("ve_luma_detect_ec_exe_rate", new ValuePkt(dataType3, 15, enumC63861P4n, "luma detect ec execute rate"));
        addConfig("ve_titan_release_gpu_resource", new ValuePkt(dataType2, bool, enumC63861P4n, "titan release gpu resource."));
        addConfig("ve_enable_recorder_native_api", new ValuePkt(dataType2, bool, enumC63861P4n, "enable recorder native api"));
        addConfig("ve_anable_codec2_output_format_align_16", new ValuePkt(dataType2, bool, enumC63861P4n, "enable mediacodec output format align 16"));
        addConfig("ve_enable_render_layer", new ValuePkt(dataType2, bool, enumC63861P4n2, "enable render layer"));
        addConfig("ve_enable_sm_avsync", new ValuePkt(dataType2, bool, enumC63861P4n, "enable sm avsync"));
        addConfig("ve_enable_titan_engine_monitor", new ValuePkt(dataType2, bool, enumC63861P4n2, "enable titan engine monitor"));
        addConfig("vesdk_use_bytevcremux_in_publish", new ValuePkt(dataType2, bool, enumC63861P4n, "enable bytevc1 remux"));
        addConfig("ve_enable_forward_ongoingseek_opt", new ValuePkt(dataType2, bool, enumC63861P4n, "enable forward ongoingseek opt"));
        addConfig("ve_enable_video_reader_hw_overload_fallback_opt", new ValuePkt(dataType2, bool, enumC63861P4n, "enable video reader hw_overload fallback opt"));
        addConfig("enable_lens_smart_adjust", new ValuePkt(dataType2, bool2, enumC63861P4n, "enable lens smart adjust"));
        addConfig("enable_lens_edit_async_process", new ValuePkt(dataType2, bool, enumC63861P4n, "enable lens async process"));
        addConfig("enable_lens_edit_params", new ValuePkt(dataType, "", enumC63861P4n, "enable_lens_edit_params"));
        addConfig("EnableImageTextureCache", new ValuePkt(dataType2, bool, enumC63861P4n, "EnableImageTextureCache"));
        addConfig("enable_frame_texture_cache", new ValuePkt(dataType3, 0, enumC63861P4n, "enable_frame_texture_cache"));
        addConfig("ve_enable_adaptive_encode_level", new ValuePkt(dataType2, bool, enumC63861P4n, "enable adaptive encode level"));
        addConfig("ve_enable_limit_min_encode_fps", new ValuePkt(dataType2, bool2, enumC63861P4n, "enable limit min encode fps"));
        addConfig("ve_encoder_qp_range", new ValuePkt(dataType, "", enumC63861P4n, "encoder qp range"));
        addConfig("ve_encoder_qp_range_for_recorder", new ValuePkt(dataType, "", enumC63861P4n, "encoder qp range for recorder"));
        addConfig("ve_encoder_b_frame", new ValuePkt(dataType, "", enumC63861P4n, "encoder b frame"));
        addConfig("veabtest_hdr_effect_optimization", new ValuePkt(dataType2, bool, enumC63861P4n, "description hdr video effect optimization, hdr2sdr effect sdr2hdr"));
        addConfig("ve_encoder_initial_qp", new ValuePkt(dataType, "", enumC63861P4n, "encoder initial qp"));
        addConfig("ve_compile_remux_bitrate_json", new ValuePkt(dataType, "", enumC63861P4n, "compile remux bitrate json"));
        addConfig("veabtest_remuxerror_fix_1280", new ValuePkt(dataType2, bool2, enumC63861P4n, "veabtest remuxerror fix 1280"));
        addConfig("ve_enable_hw_decoder_support_rotate", new ValuePkt(dataType2, bool, enumC63861P4n, "enable hw decoder support rotate"));
        addConfig("ve_enable_uri_convert_android_q", new ValuePkt(dataType2, bool2, enumC63861P4n, "enable uri convert android q"));
        addConfig("ve_enable_uri_convert_android_q_cache", new ValuePkt(dataType2, bool2, enumC63861P4n, "enable uri convert android q cache"));
        addConfig("ve_titan_thread_pool_opt", new ValuePkt(dataType3, 0, enumC63861P4n, "enable titan thread pool opt."));
        addConfig("ve_compile_gl_fence_ab", new ValuePkt(dataType3, 0, enumC63861P4n, "compile glfence, 0 - glfinish; 1 - glfence & wait on server; 2 - glfence & wait on client"));
        addConfig("veabtest_enablePreviewQualityOpt", new ValuePkt(dataType2, bool, enumC63861P4n, "enable preview quality opt"));
        addConfig("veabtest_enableUpSamplingOpt", new ValuePkt(dataType2, bool, enumC63861P4n, "enable upsampling opt"));
        addConfig("veabtest_enableGradientCanvasOpt", new ValuePkt(dataType2, bool, enumC63861P4n, "enable gradient canvas opt"));
        addConfig("veabtest_enableCrossplatCanvasOpt", new ValuePkt(dataType2, bool, enumC63861P4n, "enable crossplat canvas opt"));
        addConfig("veabtest_enableCrossplatCanvasDownscaleOpt", new ValuePkt(dataType2, bool, enumC63861P4n, "enable crossplat canvas downscale opt"));
        addConfig("ve_enable_compile_hw_encoder_opt", new ValuePkt(dataType2, bool, enumC63861P4n, "enable hw compile encoder optimization"));
        addConfig("ve_onekey_cv_detect_frame", new ValuePkt(dataType3, 3, enumC63861P4n, "cv detect frame"));
        addConfig("ve_onekey_process_all_algo_params", new ValuePkt(dataType, "", enumC63861P4n, "lens onekey all algo params"));
        addConfig("ve_onekey_detect_denoise_result", new ValuePkt(dataType3, -1, enumC63861P4n, "the detect result of denoise"));
        addConfig("ve_onekey_detect_scene_case_result", new ValuePkt(dataType3, -1, enumC63861P4n, "the detect result of scene case"));
        addConfig("ve_audio_source_type", new ValuePkt(dataType3, 1, enumC63861P4n, "set recorder audio source type"));
        addConfig("ve_enable_lv_audio_graph_refactor", new ValuePkt(dataType2, bool, enumC63861P4n, "enable lv audio graph refactor"));
        addConfig("ve_enable_odd_display", new ValuePkt(dataType3, 0, enumC63861P4n, "ve enable odd display"));
        addConfig("ve_enable_img_downsample_calculate_opt", new ValuePkt(dataType2, bool, enumC63861P4n, "ve enable img downsample calculate opt"));
        addConfig("ve_enable_sys_image_decoder", new ValuePkt(dataType2, bool, enumC63861P4n, "ve enable sys image decoder"));
        addConfig("ve_enable_recorder_veperformance", new ValuePkt(dataType3, 0, enumC63861P4n, "ve_enable_recorder_veperformance"));
        addConfig("ve_enable_editor_veperformance_android", new ValuePkt(dataType3, 0, enumC63861P4n, "ve_enable_editor_veperformance_android"));
        addConfig("ve_enable_fastlanczos_edit_display", new ValuePkt(dataType2, bool, enumC63861P4n, "ve enable fastlanczos edit display"));
        addConfig("ve_enable_bytebench", new ValuePkt(dataType2, bool, enumC63861P4n, "ve enable get result from bytebench"));
        addConfig("ve_enable_model_hot_update", new ValuePkt(dataType2, bool, enumC63861P4n, "enable model hot update"));
        addConfig("ve_compile_hide_ve_metadata", new ValuePkt(dataType2, bool, enumC63861P4n, "hide ve metadata"));
        addConfig("ve_enable_part_remux", new ValuePkt(dataType2, bool, enumC63861P4n, "enable part remux optimization"));
        addConfig("ve_enable_seek_parallel_decode", new ValuePkt(dataType2, bool, enumC63861P4n, "ve enable seek parallel decode"));
        addConfig("ve_enable_seek_backward_drop_opt", new ValuePkt(dataType2, bool, enumC63861P4n, "ve enable seek backward opt"));
        addConfig("ve_enable_veimage_gl_nearst", new ValuePkt(dataType3, 0, enumC63861P4n, "ve enable veimage gl nearst"));
        addConfig("ve_enable_veimage_lanczos_resample", new ValuePkt(dataType3, 0, enumC63861P4n, "ve enable veimage lanczos resample"));
        addConfig("ve_enable_veimage_publish_dp", new ValuePkt(dataType2, bool, enumC63861P4n, "ve enable veimage publish dp"));
        addConfig("ve_enable_veimage_smart_composition", new ValuePkt(dataType2, bool, enumC63861P4n, "ve enable veimage smart composition"));
        addConfig("ve_enable_veimage_smart_composition_lens_para", new ValuePkt(dataType, "", enumC63861P4n, "ve enable veimage smart composition lens para"));
        addConfig("ve_enable_veimage_render_cache", new ValuePkt(dataType2, bool2, enumC63861P4n, "ve enable veimage render cache"));
        addConfig("ve_enable_veimage_open_contrast", new ValuePkt(dataType2, bool2, enumC63861P4n, "ve enable veimage open contrast"));
        addConfig("ve_enable_matting_optimize", new ValuePkt(dataType3, 0, enumC63861P4n, "ve enable matting optimize"));
        addConfig("ve_enable_veimage_compress_quality", new ValuePkt(dataType3, 100, enumC63861P4n, "ve nable veimage compress quality"));
        addConfig("ve_enable_fix_ve_image_event_track", new ValuePkt(dataType2, bool2, enumC63861P4n, "ve enable fix ve image event track"));
        addConfig("ve_enable_android_webp_encode_opt", new ValuePkt(dataType2, bool, enumC63861P4n, "ve enable webp encode optimization"));
        addConfig("ve_enable_matting_use_hw", new ValuePkt(dataType3, 0, enumC63861P4n, "ve enable matting use hw"));
        addConfig("ve_enable_backend_dispatch", new ValuePkt(dataType, "", enumC63861P4n, "ve_enable_backend_dispatch"));
        addConfig("ve_enable_matting_backend", new ValuePkt(dataType2, bool, enumC63861P4n, "ve_enable_matting_backend"));
        addConfig("ve_enable_high_gif_optimize", new ValuePkt(dataType3, 0, enumC63861P4n, "ve_enable_high_gif_optimize"));
        addConfig("ve_titan_hw_dec_res_min_side", new ValuePkt(dataType3, -1, enumC63861P4n, "If titan decode video`s min side >= this size will use hardware decoder"));
        addConfig("ve_enable_titan_multi_speed_opt", new ValuePkt(dataType2, bool, enumC63861P4n, "ve enable titan multi speed opt"));
        addConfig("ve_enable_audio_track_play", new ValuePkt(dataType2, bool, enumC63861P4n, "enable audio track fallback solution"));
        addConfig("ve_enable_audio_track_adjustment", new ValuePkt(dataType3, 0, enumC63861P4n, "enable audio track av sync adjustment"));
        addConfig("ve_max_supported_effect_video_players", new ValuePkt(dataType3, 2, enumC63861P4n, "maximum video players supported in VideoPlayerInterface"));
        addConfig("ve_enable_aaudio_unit", new ValuePkt(dataType2, bool, enumC63861P4n, "enable audio rendering using aaudio in the editor"));
        addConfig("ve_enable_aaudio_for_audio_track", new ValuePkt(dataType2, bool, enumC63861P4n, "enable audio rendering using aaudio in the recorder instead of audiotrack"));
        addConfig("ve_enable_aaudio_for_opensl", new ValuePkt(dataType2, bool, enumC63861P4n, "enable audio rendering using aaudio in the recorder instead of opensl"));
        addConfig("ve_override_recorder_buffer_size", new ValuePkt(dataType3, 0, enumC63861P4n, "buffer size for recorder audio playback"));
        addConfig("ve_override_recorder_sample_count", new ValuePkt(dataType3, 0, enumC63861P4n, "audio organize samples count for recorder audio playback"));
        addConfig("ve_enable_always_on_audio_stream", new ValuePkt(dataType2, bool, enumC63861P4n, "send silence in place of stopping audio stream for recorder audio playback"));
        addConfig("ve_report_frequency", new ValuePkt(dataType3, 3, enumC63861P4n, "ve report frequency"));
        addConfig("ve_enable_titan_nv21_buffer_render_chain", new ValuePkt(dataType2, bool, enumC63861P4n, "enable titan nv21 buffer render chain"));
        addConfig("ve_enable_titan_opt_lanczos_screen", new ValuePkt(dataType2, bool, enumC63861P4n, "ve enable titan opt lanczos for screen"));
        addConfig("ve_content_adaptive_coding_mode", new ValuePkt(dataType3, -1, enumC63861P4n, "ve set content adaptive coding mode"));
        addConfig("ve_ffmpeg_codec_mem_reuse", new ValuePkt(dataType2, bool, enumC63861P4n, "ve use ffmpeg codec buffer pool in bytevc1 decode"));
        addConfig("ve_camera_prop_cache", new ValuePkt(dataType2, bool, enumC63861P4n, "read camera prop in cache for next use"));
        addConfig("ve_camera_preload_effect_algo", new ValuePkt(dataType2, bool, enumC63861P4n, "ve camera preload effect algo"));
        addConfig("ve_shot_screen_two_frame_opt", new ValuePkt(dataType3, 0, enumC63861P4n, "shot screen two frame opt"));
        addConfig("ve_titan_camera_cpu_opt", new ValuePkt(dataType2, bool, enumC63861P4n, "opt TECameraServer thread cpu"));
        addConfig("ve_recorder_encode_gop_size", new ValuePkt(dataType3, 0, enumC63861P4n, "override recorder encode gop size"));
        addConfig("ve_editor_first_frame_with_surface_opt", new ValuePkt(dataType2, bool, enumC63861P4n, "draw first frame when surface is ready"));
        addConfig("ve_editor_fastcv_remove_glfinish", new ValuePkt(dataType2, bool, enumC63861P4n, "ve editor remove glfinish in fastcv"));
        addConfig("ve_titan_init_thread_pool_opt", new ValuePkt(dataType2, bool, enumC63861P4n, "opt opengl create message in initthreadpool"));
        addConfig("ve_titan_shot_screen_opt", new ValuePkt(dataType3, 0, enumC63861P4n, "shoot screen use bitmap but except shoot two frame"));
        addConfig("ve_enable_nth_preview_frame_callback", new ValuePkt(dataType3, -1, enumC63861P4n, "Enable the N-th preview frame callback"));
        addConfig("veabtest_reuse_diff_size_texture", new ValuePkt(dataType2, bool, enumC63861P4n, "reuse texture with different size (resolution) in verenderer, android only"));
        addConfig("veabtest_mediacodec_fix_powervr", new ValuePkt(dataType2, bool, enumC63861P4n, "fix mtk driver bugs in mediacodec api, android only"));
        addConfig("veabtest_gles_render_experiment", new ValuePkt(dataType3, 0, enumC63861P4n, "used for gles driver debugging while some bugs unable to be reproduced locally, android only"));
        addConfig("veabtest_destroy_gl_context_with_mutex", new ValuePkt(dataType2, bool, enumC63861P4n, "use mutex to avoid parallel glcontext destroy, android only"));
        addConfig("veabtest_reuse_diff_size_texture_del_and_new", new ValuePkt(dataType3, 0, enumC63861P4n, "reuse texture with different size by delete-new, android cc only"));
        addConfig("ve_enable_preview_sharpness_opt", new ValuePkt(dataType2, bool, enumC63861P4n, "ve enable preview sharpness opt"));
        addConfig("ve_enable_camera_fps_double_check_in_image_mode", new ValuePkt(dataType2, bool2, enumC63861P4n, "ve enable camera fps double check in image mode"));
        addConfig("ve_enable_encode_operating_rate", new ValuePkt(dataType3, 0, enumC63861P4n, "ve enable encode operating rate"));
        addConfig("ve_encode_support_operating_rate", new ValuePkt(dataType, "", enumC63861P4n, "ve encode support operating rate"));
        addConfig("ve_decode_support_operating_rate", new ValuePkt(dataType, "", enumC63861P4n, "ve decode support operating rate"));
        addConfig("ve_enable_record_encode_operating_rate", new ValuePkt(dataType3, 0, enumC63861P4n, "ve enable record encode operating rate"));
        addConfig("ve_enable_set_preview_surface_priority", new ValuePkt(dataType2, bool, enumC63861P4n, "ve enable set preview surface priority"));
        addConfig("ve_enable_editor_fake_frame_aspect", new ValuePkt(dataType2, bool, enumC63861P4n, "ve enable editor fake frame aspect"));
        addConfig("ve_enable_fix_detach_wav_format", new ValuePkt(dataType2, bool2, enumC63861P4n, "ve enable fix detach wav format for detachAudioFromVideos"));
        addConfig("ve_enable_pass_effect_when_no_effect_filter", new ValuePkt(dataType2, bool, enumC63861P4n, "ve enable pass effect when no effect filter"));
        addConfig("ve_encode_color_space_bt601", new ValuePkt(dataType2, bool, enumC63861P4n, "ve encode color space bt601"));
        addConfig("ve_smartcodec_video_json_setting", new ValuePkt(dataType, "", enumC63861P4n, "ve smartcodec video json setting"));
        addConfig("ve_crop_encode_operating_rate", new ValuePkt(dataType3, 0, enumC63861P4n, "ve crop encode operating rate"));
        addConfig("ve_enanle_titan_audio_decode_time_opt", new ValuePkt(dataType2, bool, enumC63861P4n, "ve enable titan audio decode time opt"));
        addConfig("ve_enable_recorder_bitratio_calibrate", new ValuePkt(dataType2, bool, enumC63861P4n, "ve enable recorder bitratio calibrate"));
        addConfig("ve_enable_encode_buffer_operating_rate", new ValuePkt(dataType2, bool2, enumC63861P4n, "ve enable encode buffer operating rate"));
        addConfig("ve_enable_opt_hwdecode_moire", new ValuePkt(dataType2, bool, enumC63861P4n, "ve enable opt hw decode moire"));
        addConfig("ve_enable_first_frame_opt_public", new ValuePkt(dataType2, bool, enumC63861P4n, "ve enable first frame opt of public api"));
        addConfig("ve_enable_opt_hwencode_dts", new ValuePkt(dataType2, bool, enumC63861P4n, "ve enable opt hw encode dts"));
        addConfig("ve_enable_preview_size_change_opt1", new ValuePkt(dataType2, bool, enumC63861P4n, "ve enable preview size change optimize solution 1"));
        addConfig("ve_gif_decoder_cache", new ValuePkt(dataType2, bool, enumC63861P4n, "ve gif decoder cache"));
        addConfig("ve_enable_titan_video_decode_opt", new ValuePkt(dataType2, bool, enumC63861P4n, "ve titan video decode opt"));
        addConfig("veabtest_enableFeaturePcmf32", new ValuePkt(dataType2, bool, enumC63861P4n, "ve set audio pipeline pcm format f32"));
        addConfig("ve_enable_export_pip_opt", new ValuePkt(dataType2, bool, enumC63861P4n, "ve enable export pip opt"));
        addConfig("veabtest_enableFeatureAudioEncodeSetCutOff", new ValuePkt(dataType2, bool, enumC63861P4n, "enable audio encode set cutoff 18k"));
        addConfig("veabtest_opt_canvas_by_check_filter", new ValuePkt(dataType2, bool, enumC63861P4n, "ve enable canvas by check filter"));
        addConfig("ve_enable_compile_param_dump", new ValuePkt(dataType2, bool, enumC63861P4n, "ve enable compile config dump"));
        addConfig("veabtest_enable_seek_noise_opt", new ValuePkt(dataType2, bool, enumC63861P4n, "enable seek noise opt"));
        addConfig("veabtest_enable_unifygraphstate", new ValuePkt(dataType2, bool2, enumC63861P4n, "ve enable unify graph state"));
        addConfig("ve_enable_titan_audio_chain_reader_init", new ValuePkt(dataType2, bool, enumC63861P4n, "ve enable titan audio chain reader init"));
        addConfig("veabtest_hevc_seek_optimization", new ValuePkt(dataType2, bool, enumC63861P4n, "ve hevc seek optimization"));
        addConfig("veabtest_aboffline_performance", new ValuePkt(dataType2, bool, enumC63861P4n, "ve enable the AB offline key for performance"));
        addConfig("veabtest_aboffline_jy_android", new ValuePkt(dataType2, bool, enumC63861P4n, "ve enable the LV Android AB offline key for performance"));
        addConfig("ve_enable_cache_file_info_opt", new ValuePkt(dataType2, bool, enumC63861P4n, "ve enable cache file info opt"));
        addConfig("ve_enable_operating_rate_support_2k4k", new ValuePkt(dataType2, bool, enumC63861P4n, "ve enable operating rate support 2k4k"));
        addConfig("ve_enable_titan_multitrack_decode", new ValuePkt(dataType2, bool, enumC63861P4n, "ve enable multitrack decode"));
        addConfig("ve_enable_titan_sw_encode", new ValuePkt(dataType2, bool, enumC63861P4n, "ve enable sw encode"));
        addConfig("veabtest_decode_av_sync", new ValuePkt(dataType2, bool, enumC63861P4n, "ve decode av sync"));
        addConfig("ve_enable_crossplat_logic_unify", new ValuePkt(dataType2, bool2, enumC63861P4n, "ve enable crossplat logic unify"));
        addConfig("veabtest_get_media_info_optimization", new ValuePkt(dataType2, bool, enumC63861P4n, "ve enable get media info optimization"));
        addConfig("veabtest_find_stream_info_optimization", new ValuePkt(dataType2, bool, enumC63861P4n, "ve enable find stream info optimization"));
        addConfig("veabtest_media_mime_type_opt", new ValuePkt(dataType2, bool, enumC63861P4n, "ve enable get media mime type opt"));
        addConfig("ve_enable_recorder_encode_glcontext_reuse", new ValuePkt(dataType2, bool2, enumC63861P4n, "ve enable recorder encode glcontext reuse"));
        addConfig("veabtest_enbale_readerunit_merge_fps_pts", new ValuePkt(dataType2, bool, enumC63861P4n, "ve enable merge byfps and bypts"));
        addConfig("ve_enable_realtime_camext_bin", new ValuePkt(dataType2, bool2, enumC63861P4n, "ve enable realtime camext bin"));
        addConfig("ve_enable_error_code_opt", new ValuePkt(dataType2, bool, enumC63861P4n, "ve enable error code opt"));
        addConfig("ve_unify_new_compile_strategy", new ValuePkt(dataType2, bool, enumC63861P4n, "ve unify new compile strategy"));
        addConfig("ve_enable_result_opt", new ValuePkt(dataType2, bool2, enumC63861P4n, "ve enable result opt"));
        addConfig("ve_enable_Renderlayer_CacheLimit_Opt", new ValuePkt(dataType3, 0, enumC63861P4n, "description renderlayer cachelimit opt"));
        addConfig("ve_enable_Renderlayer_MemoryManager_Opt", new ValuePkt(dataType2, bool, enumC63861P4n, "description renderlayer MemoryManage opt"));
        addConfig("ve_enable_Renderlayer_PreloadCount_Opt", new ValuePkt(dataType3, 0, enumC63861P4n, "description renderlayer PreloadCount opt"));
        addConfig("ve_enable_hw_decoder_use_surfacetexture_matrix", new ValuePkt(dataType2, bool, enumC63861P4n, "description hw decoder use surfacetexture matrix"));
        addConfig("veabtest_fixAudioDriveEOS", new ValuePkt(dataType2, bool, enumC63861P4n, "veabtest_fixAudioDriveEOS"));
        addConfig("ve_enable_renderlayer_buffer_algorithm", new ValuePkt(dataType2, bool, enumC63861P4n, "ve enable renderlayer buffer algorithm"));
        addConfig("veabtest_hook_image_copy", new ValuePkt(dataType2, bool, enumC63861P4n, "ve enable hook android::ImageCopy to fix crash on SM7325"));
        addConfig("ve_enable_resize_image_optimize", new ValuePkt(dataType2, bool, enumC63861P4n, "ve enable use libyuv::ARGBScale to scale rgba image"));
        addConfig("veabtest_matting_async_count", new ValuePkt(dataType3, 0, enumC63861P4n, "TEBachMattingProcessUnit async matting thread count"));
        addConfig("veabtest_matting_complete_segment", new ValuePkt(dataType2, bool, enumC63861P4n, "matting complete segment"));
        addConfig("ve_enable_algorithm_cache", new ValuePkt(dataType2, bool, enumC63861P4n, "ve enable algorithm pre cache"));
        addConfig("veabtest_opt_alg_las_opt", new ValuePkt(dataType2, bool, enumC63861P4n, "optimaize lvs algorithm"));
        addConfig("ve_enable_commit_opt", new ValuePkt(dataType2, bool, enumC63861P4n, "ve enable commit opt"));
        addConfig("ve_enable_transition_opt", new ValuePkt(dataType2, bool, enumC63861P4n, "ve enable transition opt"));
        addConfig("ve_enable_track_effect", new ValuePkt(dataType2, bool, enumC63861P4n, "ve enable track effect"));
        addConfig("ve_renderlayer_segment_max_cache", new ValuePkt(dataType3, -1, enumC63861P4n, "ve_renderlayer_segment_max_cache"));
        addConfig("ve_enable_swing_clear_texture", new ValuePkt(dataType2, bool2, enumC63861P4n, "ve_enable_swing_clear_texture"));
        addConfig("veabtest_report_predict_compile_file_info", new ValuePkt(dataType2, bool, enumC63861P4n, "veabtest_report_predict_compile_file_info"));
        addConfig("ve_enable_render_layer_effect_pre_init", new ValuePkt(dataType2, bool, enumC63861P4n, "ve_enable_render_layer_effect_pre_init"));
        addConfig("ve_enable_sw_encode_process_opt", new ValuePkt(dataType2, bool, enumC63861P4n, "ve_enable_editor_sw_encode_opt"));
        addConfig("veabtest_fix_anr_of_audio_player", new ValuePkt(dataType2, bool, enumC63861P4n, "fix anr of release engine"));
        addConfig("ve_enable_render_layer_effect_skip_opt", new ValuePkt(dataType2, bool, enumC63861P4n, "ve_enable_render_layer_effect_skip_opt"));
        addConfig("ve_enable_change_surface_opt", new ValuePkt(dataType2, bool, enumC63861P4n, "enable change surface optimize"));
        addConfig("veabtest_enbale_refresh_display_frame_opt", new ValuePkt(dataType2, bool, enumC63861P4n, "veabtest_enbale_refresh_display_frame_opt"));
        addConfig("ve_enable_seek_with_speed", new ValuePkt(dataType2, bool, enumC63861P4n, "ve_enable_seek_with_speed"));
        addConfig("ve_enable_hms_qr_scan", new ValuePkt(dataType2, bool, enumC63861P4n, "enable change hms qrcode scan"));
        addConfig("ve_enable_hms_scan_types", new ValuePkt(dataType3, 1, enumC63861P4n, "set hms scan types"));
        addConfig("ve_enable_hms_scan_zoom", new ValuePkt(dataType3, 5, enumC63861P4n, "enable hms scan zoom & reset max count"));
        addConfig("ve_enable_refresh_opt", new ValuePkt(dataType2, bool, enumC63861P4n, "ve refresh opt"));
        addConfig("veabtest_enable_switch_sticker", new ValuePkt(dataType2, bool, enumC63861P4n, "veabtest_enable_switch_sticker"));
        addConfig("ve_enable_render_layer_effect_editor_pre_init", new ValuePkt(dataType2, bool, enumC63861P4n, "ve_enable_render_layer_effect_editor_pre_init"));
        addConfig("veabtest_fix_large_audio_sample_anr", new ValuePkt(dataType2, bool2, enumC63861P4n, "fix large audio sample anr"));
        addConfig("veabtest_audio_gbu_refactor_1", new ValuePkt(dataType2, bool, enumC63861P4n, "audio gbu refactor 1"));
        addConfig("veabtest_adjust_audio_effect_order", new ValuePkt(dataType2, bool, enumC63861P4n, "apply audio effect in the specified order"));
        addConfig("veabtest_optimizeAudioDelayOpt", new ValuePkt(dataType2, bool, enumC63861P4n, "veabtest_optimizeAudioDelayOpt"));
        addConfig("veabtest_export_audio_quality_opt", new ValuePkt(dataType2, bool, enumC63861P4n, "enable audio quality option when export"));
        addConfig("veabtest_RemoveUnusedCanvasHandler", new ValuePkt(dataType2, bool, enumC63861P4n, "veabtest_RemoveUnusedCanvasHandler"));
        addConfig("ve_enable_effect_delay_init", new ValuePkt(dataType2, bool, enumC63861P4n, "enable effect delay init"));
        addConfig("ve_enable_record_effect_lazy_loading", new ValuePkt(dataType2, bool, enumC63861P4n, "record effect lazy loading"));
        addConfig("veabtest_asyncCopyAndConcat", new ValuePkt(dataType2, bool, enumC63861P4n, "veabtest_asyncCopyAndConcat"));
        addConfig("ve_enable_recorder_simply_project", new ValuePkt(dataType2, bool, enumC63861P4n, "Recorder simply project switch"));
        addConfig("ve_hwencode_detect_duration", new ValuePkt(dataType3, 0, enumC63861P4n, "ve hwencode detect duration"));
        addConfig("ve_enable_sync_withorigin_frame", new ValuePkt(dataType2, bool, enumC63861P4n, "ve enable sync with origin preview frame"));
        addConfig("ve_distinguish_camera_type_for_rdhw", new ValuePkt(dataType2, bool, enumC63861P4n, "ve distinguish camera type for RDHW"));
        addConfig("ve_enable_duet_resolution_down_grade", new ValuePkt(dataType2, bool, enumC63861P4n, "duet_resolution_down_grade"));
        addConfig("ve_enable_duet_resolution_down_grade_for_video_clip", new ValuePkt(dataType2, bool, enumC63861P4n, "ve_enable_duet_resolution_down_grade_for_video_clip"));
        addConfig("ve_enable_record_hw_decode", new ValuePkt(dataType3, 0, enumC63861P4n, "ve enable record hw decode"));
        addConfig("veabtest_enable_audio_skip_samples_opt", new ValuePkt(dataType2, bool, enumC63861P4n, "enable audio skip_samples opt"));
        addConfig("ve_enable_camera_first_frame_opt", new ValuePkt(dataType2, bool, enumC63861P4n, "ve enable camera first frame display opt"));
        addConfig("ve_enable_recorder_photo_delay_opt", new ValuePkt(dataType2, bool, enumC63861P4n, "ve enable recorder photo delay opt"));
        addConfig("veabtest_enable_imagereader_refactor", new ValuePkt(dataType2, bool, enumC63861P4n, "ve enable imagereader refactor"));
        addConfig("ve_clip_effect_bin_filter_time_interval_bugfix", new ValuePkt(dataType2, bool, enumC63861P4n, "ve_clip_effect_bin_filter_time_interval_bugfix"));
        addConfig("veabtest_compile_progress_update_json", new ValuePkt(dataType, "", enumC63861P4n, "veabtest_compile_progress_update_json"));
        addConfig("ve_enable_titan_audio_thread_opt", new ValuePkt(dataType2, bool, enumC63861P4n, "ve_enable_titan_audio_thread_opt"));
        addConfig("ve_enable_titan_gl_thread_delay", new ValuePkt(dataType2, bool, enumC63861P4n, "ve_enable_titan_gl_thread_delay_init"));
        addConfig("ve_enable_audioencode_cap_merge", new ValuePkt(dataType2, bool, enumC63861P4n, "ve enable audioencode cap merge"));
        addConfig("ve_titan_audio_opt", new ValuePkt(dataType2, bool, enumC63861P4n, "ve titan audio opt"));
        addConfig("ve_shared_egl_context_for_camera_texture_to_editor", new ValuePkt(dataType2, bool, enumC63861P4n, "ve_shared_egl_context_for_camera_texture_to_editor"));
        addConfig("ve_enable_ab_sync_opt", new ValuePkt(dataType2, bool, enumC63861P4n, "ve enable ab sync opt"));
        addConfig("ve_eanble_protect_track_context", new ValuePkt(dataType2, bool, enumC63861P4n, "ve_eanble_protect_track_context"));
        addConfig("ve_skip_lens_watermark_process", new ValuePkt(dataType2, bool, enumC63861P4n, "ve_skip_lens_watermark_process"));
        addConfig("ve_lens_invisible_watermark_opt", new ValuePkt(dataType3, 0, enumC63861P4n, "lens invisible watermark opt strategy"));
        addConfig("veabtest_enable_imagereader_refactor", new ValuePkt(dataType2, bool, enumC63861P4n, "ve enable imagereader refactor"));
        addConfig("ve_enable_record_canvas_size_opt", new ValuePkt(dataType2, bool, enumC63861P4n, "ve enable record canvas size opt"));
        addConfig("ve_enable_render_res_clear_when_editor_stop", new ValuePkt(dataType2, bool, enumC63861P4n, "ve_enable_render_res_clear_when_editor_stop"));
        addConfig("ve_sub_seq_opt", new ValuePkt(dataType2, bool, enumC63861P4n, "opt subsequence performance"));
        addConfig("ve_streaming_edit_undertake", new ValuePkt(dataType3, 1, enumC63861P4n, "ve streaming edit undertake"));
        addConfig("veabtest_heif_decode_by_libttheif", new ValuePkt(dataType2, bool, enumC63861P4n, "decode heif/heic use libttHeif"));
        addConfig("ve_enable_stream_edit_cache_bugfix", new ValuePkt(dataType2, bool, enumC63861P4n, "ve_enable_stream_edit_cache_bugfix"));
        addConfig("ve_enable_record_effect_filter_opt", new ValuePkt(dataType2, bool, enumC63861P4n, "ve_enable_record_effect_filter_opt"));
        addConfig("veabtest_audioBalancedGain", new ValuePkt(dataType2, bool, enumC63861P4n, "enable audio bgm balanced gain"));
        addConfig("ve_enable_image_decode_sharpness_opt", new ValuePkt(dataType2, bool, enumC63861P4n, "ve_enable_image_decode_sharpness_opt"));
        addConfig("ve_opensles_player_destroy_timeout_ms", new ValuePkt(dataType3, 0, enumC63861P4n, "ve_editor_open_sles_player_destroy_timeout_ms"));
        addConfig("veabtest_enable_jpeg_multi_thread_decode", new ValuePkt(dataType2, bool, enumC63861P4n, "ve enable jpeg multi-thread decode"));
        addConfig("veabtest_limit_android_os_version_for_powervr_gl_bugfix", new ValuePkt(dataType2, bool, enumC63861P4n, "trying to fix gl crash by limit some gl logic in vesdk"));
        addConfig("ve_enable_repair_decode_chain", new ValuePkt(dataType2, bool, enumC63861P4n, "ve enable repair decode chain"));
        addConfig("ve_enable_transform_unit_refactor", new ValuePkt(dataType2, bool, enumC63861P4n, "ve enable transform unit refactor"));
        addConfig("veabtest_jpeg_multi_thread_decode_count", new ValuePkt(dataType3, 0, enumC63861P4n, "ve jpeg multi-thread decode count"));
        addConfig("ve_enable_opt_avsyncunit_crash", new ValuePkt(dataType2, bool2, enumC63861P4n, "fix avsyncunit crash"));
        addConfig("ve_enable_video_hw_native_encode", new ValuePkt(dataType2, bool, enumC63861P4n, "ve enable video hw native encode"));
        addConfig("veabtest_enable_android_png_decode_opt", new ValuePkt(dataType2, bool, enumC63861P4n, "enable android png decode optimization"));
        addConfig("veabtest_set_effect_handle_message_callback", new ValuePkt(dataType2, bool, enumC63861P4n, "veabtest_set_effect_handle_message_callback"));
        addConfig("veabtest_enable_compilation_refactor", new ValuePkt(dataType2, bool, enumC63861P4n, "ve enable compilation module refactor"));
        addConfig("veabtest_enable_bytevc1sw_upgrade", new ValuePkt(dataType2, bool, enumC63861P4n, "ve enable bytevc1 sw encoder upgrade"));
        addConfig("ve_camera_enable_surface_sharing", new ValuePkt(dataType2, bool, enumC63861P4n, "ve camera enable surface sharing"));
        addConfig("ve_preset_effect_opt", new ValuePkt(dataType2, bool, enumC63861P4n, "ve preset effect opt"));
        addConfig("ve_enable_get_mediainfo_timeout", new ValuePkt(dataType3, -1, enumC63861P4n, "ve_enable_get_mediainfo_timeout"));
        addConfig("ve_enable_risky_video_detection", new ValuePkt(dataType2, bool, enumC63861P4n, "enable risky video detection"));
        addConfig("veabtest_opt_darSize", new ValuePkt(dataType2, bool, enumC63861P4n, "enable opt get video size"));
        addConfig("veabtest_aigc_effect_handle_old_fallback", new ValuePkt(dataType2, bool2, enumC63861P4n, "veabtest_aigc_effect_handle_old_fallback"));
        addConfig("ve_enable_enigma_optimization", new ValuePkt(dataType2, bool, enumC63861P4n, "enable enigma optimization"));
        addConfig("ve_enable_global_render_resource", new ValuePkt(dataType3, 0, enumC63861P4n, "enable global render resource"));
        addConfigsFromEffect();
        addConfigsFromCamera();
        initByteBench();
    }

    public Map<String, ValuePkt> getConfigs() {
        return this.sConfigs;
    }

    /* loaded from: classes12.dex */
    public enum DataType {
        BOOLEAN,
        INTEGER,
        LONG,
        FLOAT,
        STRING;

        public static DataType valueOf(String str) {
            return (DataType) V0N.LJJJ(DataType.class, str);
        }
    }

    private int importFromJson(String str) {
        try {
            new JSONArray(str);
            this.sConfigs.clear();
            return 0;
        } catch (JSONException e) {
            C16880lQ.LLLLIIL(e);
            return 0;
        }
    }

    public static void setEnablePreloadSo(boolean z) {
        enablePreloadSo = z;
    }

    public ValuePkt getValue(String str) {
        InterfaceC09240Xw LIZ;
        ValuePkt valuePkt = this.sConfigs.get(str);
        if (((Boolean) this.sConfigs.get("ve_enable_bytebench").getValue()).booleanValue() && (LIZ = C09580Ze.LIZJ().LIZ()) != null && LIZ.LJIIIZ(str)) {
            int i = C63862P4o.LIZIZ[valuePkt.dataType.ordinal()];
            if (i != 1) {
                if (i != 2) {
                    if (i != 3) {
                        if (i != 4) {
                            if (i != 5) {
                                return valuePkt;
                            }
                            return new ValuePkt(DataType.BOOLEAN, Integer.valueOf(getValue(str, 0)), EnumC63861P4n.CONFIG_TYPE_AB, "");
                        }
                        return new ValuePkt(DataType.BOOLEAN, Long.valueOf(getValue(str, 0)), EnumC63861P4n.CONFIG_TYPE_AB, "");
                    }
                    return new ValuePkt(DataType.BOOLEAN, Float.valueOf(getValue(str, 0.0f)), EnumC63861P4n.CONFIG_TYPE_AB, "");
                }
                return new ValuePkt(DataType.BOOLEAN, getValue(str, ""), EnumC63861P4n.CONFIG_TYPE_AB, "");
            }
            return new ValuePkt(DataType.BOOLEAN, Boolean.valueOf(getValue(str, false).booleanValue()), EnumC63861P4n.CONFIG_TYPE_AB, "");
        }
        return valuePkt;
    }

    public Object removeConfig(String str) {
        return this.sConfigs.remove(str);
    }

    public void setABSetType(EnumC63863P4p enumC63863P4p) {
        mABSetType = enumC63863P4p;
        TEConfigCenter.nativeSetABSetType(enumC63863P4p.ordinal());
        setConfigsDefaultValue();
    }

    public void updateConfigToNative(String str) {
        ValuePkt valuePkt = this.sConfigs.get(str);
        if (valuePkt == null) {
            return;
        }
        TEConfigCenter.LIZ(str, valuePkt);
    }

    private void updateEffectConfig(String str, ValuePkt valuePkt) {
        if (valuePkt.getABType() != P4H.FOREFFECT) {
            return;
        }
        try {
            Method declaredMethod = Class.forName("com.ss.android.vesdk.runtime.VEEffectConfig").getDeclaredMethod("setABConfigValue", String.class, Object.class, Integer.TYPE);
            int i = C63862P4o.LIZIZ[valuePkt.getDataType().ordinal()];
            if (i == 1) {
                declaredMethod.invoke(null, str, valuePkt.getValue(), 0);
            } else if (i != 2) {
                if (i != 3) {
                    if (i == 4 || i == 5) {
                        declaredMethod.invoke(null, str, valuePkt.getValue(), 1);
                    }
                } else {
                    declaredMethod.invoke(null, str, valuePkt.getValue(), 2);
                }
            } else {
                declaredMethod.invoke(null, str, valuePkt.getValue(), 3);
            }
        } catch (Exception e) {
            C16880lQ.LLLLIIL(e);
        }
    }

    public int addConfig(String str, ValuePkt valuePkt) {
        if (this.sConfigs.containsKey(str)) {
            return -100;
        }
        setValue(str, valuePkt);
        return 0;
    }

    public Boolean getValue(String str, boolean z) {
        InterfaceC09240Xw LIZ;
        ValuePkt valuePkt = this.sConfigs.get(str);
        if (((Boolean) this.sConfigs.get("ve_enable_bytebench").getValue()).booleanValue() && (LIZ = C09580Ze.LIZJ().LIZ()) != null && LIZ.LJIIIZ(str)) {
            return Boolean.valueOf(LIZ.LJIIIIZZ(str, z));
        }
        if (valuePkt != null && valuePkt.getValue() != null) {
            return (Boolean) valuePkt.getValue();
        }
        return Boolean.valueOf(z);
    }

    public ValuePkt setValue(String str, ValuePkt valuePkt) {
        ValuePkt put = this.sConfigs.put(str, valuePkt);
        if (valuePkt.abType == P4H.FOREFFECT && str.equals("enable_jnionload_pthreadonce")) {
            try {
                Class.forName("com.bef.effectsdk.EffectABConfig").getDeclaredMethod("enableJniOnloadThreadOnce", Boolean.TYPE).invoke(null, valuePkt.getValue());
            } catch (Exception e) {
                C16880lQ.LLLLIIL(e);
            }
        }
        return put;
    }

    public Object updateValue(String str, Object obj) {
        ValuePkt valuePkt = this.sConfigs.get(str);
        if (valuePkt == null) {
            return null;
        }
        Object obj2 = valuePkt.value;
        valuePkt.updateValue(obj);
        if (valuePkt.abType == P4H.FOREFFECT && str.equals("enable_jnionload_pthreadonce")) {
            try {
                Class.forName("com.bef.effectsdk.EffectABConfig").getDeclaredMethod("enableJniOnloadThreadOnce", Boolean.TYPE).invoke(null, obj);
            } catch (Exception e) {
                C16880lQ.LLLLIIL(e);
            }
        }
        if (!obj2.equals(valuePkt.value)) {
            this.sModifiedConfigs.put(str, valuePkt);
        }
        return obj2;
    }

    public float getValue(String str, float f) {
        InterfaceC09240Xw LIZ;
        ValuePkt valuePkt = this.sConfigs.get(str);
        if (((Boolean) this.sConfigs.get("ve_enable_bytebench").getValue()).booleanValue() && (LIZ = C09580Ze.LIZJ().LIZ()) != null && LIZ.LJIIIZ(str)) {
            return LIZ.LIZLLL(f, str);
        }
        if (valuePkt != null && valuePkt.getValue() != null) {
            return ((Float) valuePkt.getValue()).floatValue();
        }
        return f;
    }

    public int getValue(String str, int i) {
        InterfaceC09240Xw LIZ;
        ValuePkt valuePkt = this.sConfigs.get(str);
        if (((Boolean) this.sConfigs.get("ve_enable_bytebench").getValue()).booleanValue() && (LIZ = C09580Ze.LIZJ().LIZ()) != null && LIZ.LJIIIZ(str)) {
            return LIZ.LJIIJJI(i, str);
        }
        if (valuePkt != null && valuePkt.getValue() != null) {
            return ((Integer) valuePkt.getValue()).intValue();
        }
        return i;
    }

    public long getValue(String str, long j) {
        InterfaceC09240Xw LIZ;
        ValuePkt valuePkt = this.sConfigs.get(str);
        if (((Boolean) this.sConfigs.get("ve_enable_bytebench").getValue()).booleanValue() && (LIZ = C09580Ze.LIZJ().LIZ()) != null && LIZ.LJIIIZ(str)) {
            return LIZ.LJIIL(j, str);
        }
        if (valuePkt != null && valuePkt.getValue() != null) {
            return ((Long) valuePkt.getValue()).longValue();
        }
        return j;
    }

    public String getValue(String str, String str2) {
        InterfaceC09240Xw LIZ;
        ValuePkt valuePkt = this.sConfigs.get(str);
        if (((Boolean) this.sConfigs.get("ve_enable_bytebench").getValue()).booleanValue() && (LIZ = C09580Ze.LIZJ().LIZ()) != null && LIZ.LJIIIZ(str)) {
            return LIZ.LIZ(str, str2);
        }
        if (valuePkt != null && valuePkt.getValue() != null) {
            return (String) valuePkt.getValue();
        }
        return str2;
    }
}
