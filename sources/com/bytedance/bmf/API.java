package com.bytedance.bmf;

import X.C16880lQ;

/* loaded from: classes34.dex */
public class API {
    public static native void bmf_af_copy_props(long j, long j2);

    public static native boolean bmf_af_defined(long j);

    public static native int bmf_af_dtype(long j);

    public static native void bmf_af_free(long j);

    public static native long bmf_af_make(int i, int i2, boolean z, int i3);

    public static native long bmf_af_make_from_data(long[] jArr, int i, int i2, boolean z);

    public static native int bmf_af_nchannels(long j);

    public static native int bmf_af_nplanes(long j);

    public static native int bmf_af_nsamples(long j);

    public static native long bmf_af_plane(long j, int i);

    public static native boolean bmf_af_planer(long j);

    public static native long[] bmf_af_planes(long j);

    public static native void bmf_af_private_attach_json_param(long j, long j2);

    public static native long bmf_af_private_get_json_param(long j);

    public static native void bmf_af_private_merge(long j, long j2);

    public static native long bmf_af_pts(long j);

    public static native float bmf_af_sample_rate(long j);

    public static native void bmf_af_set_pts(long j, long j2);

    public static native void bmf_af_set_sample_rate(long j, float f);

    public static native void bmf_af_set_time_base(long j, int i, int i2);

    public static native int[] bmf_af_time_base(long j);

    public static native String bmf_json_dump(long j);

    public static native boolean bmf_json_erase(long j, String str);

    public static native void bmf_json_free(long j);

    public static native double bmf_json_get_double(long j, String str);

    public static native double[] bmf_json_get_double_list(long j, String str);

    public static native float bmf_json_get_float(long j, String str);

    public static native float[] bmf_json_get_float_list(long j, String str);

    public static native int bmf_json_get_int(long j, String str);

    public static native int[] bmf_json_get_int_list(long j, String str);

    public static native long bmf_json_get_long(long j, String str);

    public static native String bmf_json_get_string(long j, String str);

    public static native String[] bmf_json_get_string_list(long j, String str);

    public static native boolean bmf_json_has_key(long j, String str);

    public static native long bmf_json_make();

    public static native String bmf_json_param_dump(long j);

    public static native long bmf_json_param_parse(String str);

    public static native void bmf_json_set_double(long j, String str, double d);

    public static native void bmf_json_set_double_list(long j, String str, double[] dArr);

    public static native void bmf_json_set_float(long j, String str, float f);

    public static native void bmf_json_set_float_list(long j, String str, float[] fArr);

    public static native void bmf_json_set_int(long j, String str, int i);

    public static native void bmf_json_set_int_list(long j, String str, int[] iArr);

    public static native void bmf_json_set_long(long j, String str, long j2);

    public static native void bmf_json_set_string(long j, String str, String str2);

    public static native void bmf_json_set_string_list(long j, String str, String[] strArr);

    public static native long[] bmf_module_functor_call(long j, long[] jArr);

    public static native void bmf_module_functor_execute(long j, long[] jArr, boolean z);

    public static native long[] bmf_module_functor_fetch(long j, int i);

    public static native void bmf_module_functor_free(long j);

    public static native long bmf_module_functor_make(String str, String str2, String str3, String str4, String str5, int i, int i2, int i3);

    public static native int bmf_packet_defined(long j);

    public static native void bmf_packet_free(long j);

    public static native long bmf_packet_from_json_param(long j);

    public static native long bmf_packet_from_json_str(String str);

    public static native long bmf_packet_from_videoframe(long j);

    public static native long bmf_packet_generate_eof_packet();

    public static native long bmf_packet_generate_eos_packet();

    public static native long bmf_packet_get_json_param(long j);

    public static native long bmf_packet_get_videoframe(long j);

    public static native boolean bmf_packet_is_json_param(long j);

    public static native boolean bmf_packet_is_videoframe(long j);

    public static native void bmf_packet_set_timestamp(long j, long j2);

    public static native long bmf_packet_timestamp(long j);

    public static native String bmf_packet_to_json_str(long j);

    public static native void bmf_task_fill_input_packet(long j, int i, long j2);

    public static native void bmf_task_fill_output_packet(long j, int i, long j2);

    public static native void bmf_task_free(long j);

    public static native int[] bmf_task_get_input_stream_ids(long j);

    public static native int[] bmf_task_get_output_stream_ids(long j);

    public static native long bmf_task_make(int i, int[] iArr, int[] iArr2);

    public static native long bmf_task_pop_packet_from_input_queue(long j, int i);

    public static native long bmf_task_pop_packet_from_out_queue(long j, int i);

    public static native void bmf_task_set_timestamp(long j, long j2);

    public static native long bmf_task_timestamp(long j);

    public static native void bmf_vf_copy_from(long j, long j2);

    public static native void bmf_vf_copy_props(long j, long j2);

    public static native boolean bmf_vf_defined(long j);

    public static native int bmf_vf_device_index(long j);

    public static native int bmf_vf_device_type(long j);

    public static native int bmf_vf_dtype(long j);

    public static native long bmf_vf_frame(long j);

    public static native void bmf_vf_free(long j);

    public static native long bmf_vf_from_frame(long j);

    public static native long bmf_vf_from_image(long j);

    public static native int bmf_vf_height(long j);

    public static native long bmf_vf_image(long j);

    public static native boolean bmf_vf_is_image(long j);

    public static native long bmf_vf_make_frame(int i, int i2, long j, String str);

    public static native long bmf_vf_make_image(int i, int i2, int i3, int i4, int i5, String str, boolean z);

    public static native void bmf_vf_private_attach_json_param(long j, long j2);

    public static native long bmf_vf_private_get_json_param(long j);

    public static native void bmf_vf_private_merge(long j, long j2);

    public static native long bmf_vf_pts(long j);

    public static native boolean bmf_vf_ready(long j);

    public static native void bmf_vf_record(long j, boolean z);

    public static native void bmf_vf_set_pts(long j, long j2);

    public static native void bmf_vf_set_time_base(long j, int i, int i2);

    public static native void bmf_vf_synchronize(long j);

    public static native int[] bmf_vf_time_base(long j);

    public static native long bmf_vf_to_device(long j, String str, boolean z);

    public static native long bmf_vf_to_dtype(long j, int i);

    public static native long bmf_vf_to_frame(long j, long j2);

    public static native long bmf_vf_to_image(long j, int i, boolean z);

    public static native int bmf_vf_width(long j);

    static {
        C16880lQ.LLJJJIL("_jbmf");
    }
}
