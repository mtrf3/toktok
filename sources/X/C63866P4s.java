package X;

import java.util.HashSet;

/* renamed from: X.P4s, reason: case insensitive filesystem */
/* loaded from: classes12.dex */
public final class C63866P4s {
    public static final java.util.Set<String> LIZ;
    public static final java.util.Set<String> LIZIZ;
    public static final java.util.Set<String> LIZJ;
    public static final java.util.Set<String> LIZLLL;

    static {
        HashSet hashSet = new HashSet();
        LIZ = hashSet;
        HashSet hashSet2 = new HashSet();
        LIZIZ = hashSet2;
        HashSet hashSet3 = new HashSet();
        LIZJ = hashSet3;
        HashSet hashSet4 = new HashSet();
        LIZLLL = hashSet4;
        hashSet3.add("te_preview_camera_resolution");
        hashSet2.add("te_preview_camera_zoom");
        hashSet.add("te_record_camera_direction");
        hashSet.add("te_record_camera_type");
        C012403c.LJFF(hashSet, "te_record_switch_camera_time", "te_record_start_preview_ret", "te_record_preview_init_ret", "te_record_preview_init_time");
        C48263Iwt.LIZJ(hashSet, "te_record_preview_destroy_time", "te_preview_first_frame_render_time", hashSet3, "te_preview_video_preview_resolution");
        C012403c.LJFF(hashSet2, "te_preview_first_frame_screen_time", "te_preview_switch_camera_screen_time", "te_record_preview_frame_rate", "te_record_camera_frame_rate");
        hashSet2.add("te_preview_preview_frame_rate");
        hashSet.add("te_record_init_egl_delay_camera_time");
        hashSet.add("te_record_effect_render");
        C012403c.LJFF(hashSet, "te_record_lag_scene", "te_record_is_hw_decoder", "te_record_decoder_codec_id", "te_record_generate_extra_data_cost");
        C012403c.LJFF(hashSet, "te_record_packet_count_before_extra_data", "te_record_is_stop_before_extra_data", "te_record_start_record_ret", "te_record_extract_frame_num");
        hashSet3.add("te_record_resolution");
        hashSet2.add("te_preview_preview2_frame_rate");
        hashSet2.add("te_record_frame_rate");
        C48263Iwt.LIZJ(hashSet2, "te_record_start_time", "te_record_stop_time", hashSet, "te_record_lag_max_num");
        C48263Iwt.LIZJ(hashSet, "te_record_lag_count", "te_record_type", hashSet2, "te_record_speed");
        C48263Iwt.LIZJ(hashSet2, "te_record_export_time", "te_record_segment_time", hashSet, "te_record_err_code");
        hashSet.add("te_record_gl_err_code");
        hashSet3.add("te_record_video_soft_encode_acc_eglimage");
        hashSet.add("te_record_video_use_eglimage");
        C48263Iwt.LIZJ(hashSet, "te_record_instance_type", "te_record_sync_ret", hashSet3, "te_record_sync_detail");
        C48263Iwt.LIZJ(hashSet, "te_record_low_latency", "te_record_hard_encode_init_ret", hashSet2, "te_record_hard_encode_init_time");
        hashSet2.add("te_record_hard_encode_destroy_time");
        hashSet3.add("te_record_video_encode_type");
        hashSet.add("te_record_video_encode_mode");
        hashSet.add("te_record_audio_encode_mode");
        hashSet2.add("te_record_video_frame_encode_time");
        hashSet.add("te_record_video_encode_gop");
        hashSet.add("te_record_video_encode_codec_type");
        hashSet2.add("te_record_all_frame_rate");
        hashSet.add("te_mediacodec_profile");
        hashSet.add("te_record_mediacodec_rate_control");
        hashSet.add("te_record_hard_encode_ret");
        hashSet.add("te_record_hard_encode_bitrate");
        hashSet.add("te_record_beauty_type");
        C48263Iwt.LIZJ(hashSet2, "te_record_smooth_intensity", "te_record_brighten_intensity", hashSet3, "te_record_filter_id1");
        C48263Iwt.LIZJ(hashSet3, "te_record_filter_id2", "te_record_sticker_id", hashSet2, "te_record_eye_intensity");
        hashSet2.add("te_record_cheek_intensity");
        hashSet.add("te_record_lab_algorithm");
        hashSet2.add("te_record_render_average_time");
        C012403c.LJFF(hashSet, "te_record_hd_capture_time", "te_record_shot_hd_screen_time", "te_record_shot_screen_time", "te_record_preview_radio_switch_time");
        C48263Iwt.LIZJ(hashSet, "te_record_shot_screen_without_effect_ret", "te_record_shot_screen_with_effect_ret", hashSet3, "te_record_audio_mic_start_info");
        C48263Iwt.LIZJ(hashSet, "te_record_audio_mic_start_ret", "te_record_audio_latency", hashSet3, "te_record_play_first_timestamp");
        C012403c.LJFF(hashSet, "te_record_audio_start_record_ret", "te_record_audio_start_play_ret", "te_record_audio_start_record_time", "te_record_audio_stop_record_time");
        C48263Iwt.LIZJ(hashSet, "te_record_audio_release_record_time", "te_record_audio_first_frame", hashSet3, "te_record_audio_play_time_strs");
        C012403c.LJFF(hashSet, "te_record_audio_mic_type", "te_record_audio_mic_init_ret", "te_record_audio_mic_running_err", "te_record_audio_mic_sample_rate");
        C48263Iwt.LIZJ(hashSet, "te_record_audio_mic_frame_per_buffer", "te_record_audio_earback_type", hashSet2, "te_record_audio_earback_stable_est");
        C012403c.LJFF(hashSet, "te_record_audio_earback_continuity_est", "te_record_audio_mic_delay", "te_record_audio_mic_delay_ret", "te_record_mode");
        hashSet.add("te_record_audio_device");
        hashSet2.add("te_record_camera_sensor_interval_variance");
        hashSet2.add("te_record_camera_sensor_interval_mean");
        C012403c.LJFF(hashSet2, "te_record_camera_sensor_interval_range", "te_record_camera_frame_interval_variance", "te_record_camera_frame_interval_mean", "te_record_camera_frame_interval_range");
        C012403c.LJFF(hashSet2, "te_record_preview_frame_interval_variance", "te_record_preview_frame_interval_mean", "te_record_preview_frame_interval_range", "te_record_encode_frame_interval_variance");
        C012403c.LJFF(hashSet2, "te_record_encode_frame_interval_mean", "te_record_encode_frame_interval_range", "te_record_preencode_frame_interval_variance", "te_record_preencode_frame_interval_mean");
        hashSet2.add("te_record_preencode_frame_interval_range");
        hashSet.add("te_titan_engine");
        hashSet.add("te_iso_status");
        C48263Iwt.LIZJ(hashSet, "te_record_concat_ret", "te_record_concat_time", hashSet3, "te_record_compose_vid");
        C012403c.LJFF(hashSet2, "te_record_camera_sharpness", "te_record_camera_sharpness_difference", "te_record_enter_virtual_memory_size", "te_record_leave_virtual_memory_size");
        C48263Iwt.LIZJ(hashSet, "te_record_lens_onekey_enhance_scene", "te_record_lens_onekey_enhance_result", hashSet2, "te_record_lens_onekey_enhance_iso");
        C48263Iwt.LIZJ(hashSet2, "te_record_lens_onekey_enhance_maxiso", "te_record_lens_onekey_enhance_miniso", hashSet4, "te_sensor_type_gyroscope_exist");
        C012403c.LJFF(hashSet4, "te_sensor_type_game_rotation_vector_exist", "te_sensor_type_rotation_vector_exist", "te_sensor_type_gravity_exist", "te_sensor_type_accelerometer_exist");
        C012403c.LJFF(hashSet3, "te_sensor_type_gyroscope_name", "te_sensor_type_game_rotation_vector_name", "te_sensor_type_rotation_vector_name", "te_sensor_type_gravity_name");
        hashSet3.add("te_sensor_type_accelerometer_name");
        hashSet.add("te_edit_first_frame_time");
        hashSet.add("te_edit_reverse_time");
        hashSet2.add("te_edit_video_decode_average_time");
        hashSet.add("te_edit_video_decode_mode");
        hashSet2.add("te_edit_audio_decode_average_time");
        hashSet.add("te_edit_audio_decode_mode");
        hashSet.add("te_edit_err_code");
        hashSet.add("te_edit_import_generate_thumbnail_time");
        C48263Iwt.LIZJ(hashSet3, "te_edit_thumbnail_resolution", "te_composition_resolution", hashSet2, "te_composition_fps");
        hashSet2.add("te_composition_bit_rate");
        hashSet2.add("te_composition_file_duration");
        hashSet2.add("te_composition_file_size");
        hashSet.add("te_composition_time");
        hashSet2.add("te_composition_video_encode_time");
        hashSet2.add("te_composition_audio_encode_time");
        C48263Iwt.LIZJ(hashSet2, "te_composition_video_decode_time", "te_composition_audio_decode_time", hashSet, "te_composition_video_encode_mode");
        C012403c.LJFF(hashSet, "te_composition_video_decode_mode", "te_composition_audio_encode_mode", "te_composition_audio_decode_mode", "te_composition_page_mode");
        C48263Iwt.LIZJ(hashSet, "te_composition_effect_add", "te_composition_info_sticker_add", hashSet3, "te_composition_effect_json");
        hashSet3.add("te_composition_info_sticker_json");
        hashSet.add("te_composition_text_add");
        hashSet.add("te_composition_brush_add");
        hashSet3.add("te_composition_filter_id");
        hashSet.add("te_composition_watermark_add");
        hashSet.add("te_composition_end_watermark_add");
        C012403c.LJFF(hashSet, "te_composition_time_filter_type", "te_composition_err_code", "te_composition_video_sw_crf", "te_composition_video_sw_maxrate");
        C012403c.LJFF(hashSet, "te_composition_video_sw_preset", "te_composition_video_gop", "te_composition_tran_type", "te_composition_gif_ret");
        C48263Iwt.LIZJ(hashSet, "te_composition_audio_ret", "te_enable_titan_auto_test_log", hashSet2, "te_edit_playback_fps");
        C012403c.LJFF(hashSet2, "te_edit_enter_virtual_memory_size", "te_edit_leave_virtual_memory_size", "te_composition_enter_virtual_memory_size", "te_composition_leave_virtual_memory_size");
        C48263Iwt.LIZJ(hashSet3, "te_record_resolution", "te_record_video_encode_type", hashSet, "te_record_video_encode_mode");
        hashSet.add("te_record_audio_encode_mode");
        hashSet2.add("te_record_frame_rate");
        hashSet2.add("te_record_video_frame_encode_time");
        C48263Iwt.LIZJ(hashSet2, "te_record_start_time", "te_record_stop_time", hashSet, "te_record_camera_type");
        C48263Iwt.LIZJ(hashSet2, "te_record_switch_camera_time", "te_record_render_average_time", hashSet3, "te_record_video_preview_resolution");
        hashSet2.add("te_record_preview_frame_rate");
        hashSet2.add("te_record_camera_frame_rate");
        hashSet2.add("te_record_concat_time");
        C012403c.LJFF(hashSet, "te_record_frame_cnt_bef_enq", "te_record_frame_cnt_aft_enq", "te_record_frame_cnt_bef_enc", "te_record_frame_cnt_aft_wrt");
        hashSet.add("te_record_sys_best_codec");
        hashSet2.add("te_video_decode_average_time");
        hashSet2.add("te_audio_decode_average_time");
        C48263Iwt.LIZJ(hashSet, "te_video_decode_mode", "te_audio_decode_mode", hashSet2, "te_editor_drop_frame_rate");
        hashSet2.add("te_editor_preview_frame_rate");
        hashSet.add("te_editor_skip_processor");
        hashSet3.add("te_editor_engine_type");
        hashSet3.add("te_editor_graph_trace_info");
        C48263Iwt.LIZJ(hashSet3, "te_editor_device_monitor_info", "te_composition_resolution", hashSet2, "te_composition_fps");
        C012403c.LJFF(hashSet2, "te_composition_bit_rate", "te_composition_file_duration", "te_composition_file_size", "te_composition_time");
        C012403c.LJFF(hashSet2, "te_composition_video_encode_time", "te_composition_audio_encode_time", "te_composition_video_decode_time", "te_composition_audio_decode_time");
        C012403c.LJFF(hashSet, "te_composition_video_encode_mode", "te_composition_video_decode_mode", "te_composition_audio_encode_mode", "te_composition_audio_decode_mode");
        C012403c.LJFF(hashSet, "te_composition_pixel_format", "te_composition_page_mode", "te_composition_audio_hw_encoder_extradata", "te_composition_audio_create_hw_encoder");
        C48263Iwt.LIZJ(hashSet, "te_composition_audio_hw_switch_sw", "te_composition_audio_dual_asc_distribution", hashSet3, "te_import_source_file_resolution");
        hashSet3.add("te_import_crop_file_resolution");
        hashSet2.add("te_import_generate_thumbnail_time");
        hashSet2.add("te_import_crop_time");
        C012403c.LJFF(hashSet2, "te_import_crop_file_duration", "te_import_source_file_bitrate", "te_import_crop_file_bitrate", "te_import_source_file_duration");
        C012403c.LJFF(hashSet, "te_composition_video_sw_crf", "te_composition_video_sw_maxrate", "te_composition_video_sw_preset", "te_composition_video_gop");
        hashSet.add("completed");
    }

    public static int LIZ(String str) {
        if (((HashSet) LIZ).contains(str)) {
            return 1;
        }
        if (((HashSet) LIZLLL).contains(str)) {
            return 3;
        }
        if (((HashSet) LIZIZ).contains(str)) {
            return 2;
        }
        return 0;
    }
}
