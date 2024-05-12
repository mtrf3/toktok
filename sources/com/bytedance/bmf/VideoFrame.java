package com.bytedance.bmf;

import com.bytedance.hmp.ChannelFormat;
import com.bytedance.hmp.DeviceType;
import com.bytedance.hmp.EnumUtil;
import com.bytedance.hmp.Frame;
import com.bytedance.hmp.Image;
import com.bytedance.hmp.PixelInfo;
import com.bytedance.hmp.Ptr;
import com.bytedance.hmp.ScalarType;
import com.bytedance.mt.protector.impl.GsonProtectorUtils;
import com.google.gson.Gson;
import com.google.gson.j;
import com.google.gson.m;

/* loaded from: classes34.dex */
public class VideoFrame extends Ptr {

    /* renamed from: com.bytedance.bmf.VideoFrame$1, reason: invalid class name */
    /* loaded from: classes34.dex */
    public static /* synthetic */ class AnonymousClass1 {
        public static final /* synthetic */ int[] $SwitchMap$com$bytedance$bmf$OpaqueDataKey;

        static {
            int[] iArr = new int[OpaqueDataKey.values().length];
            $SwitchMap$com$bytedance$bmf$OpaqueDataKey = iArr;
            try {
                iArr[OpaqueDataKey.kJsonParam.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
        }
    }

    public boolean defined() {
        return API.bmf_vf_defined(this.ptr);
    }

    public int deviceIndex() {
        return API.bmf_vf_device_index(this.ptr);
    }

    public DeviceType deviceType() {
        int bmf_vf_device_type = API.bmf_vf_device_type(this.ptr);
        DeviceType deviceType = DeviceType.kCPU;
        if (bmf_vf_device_type == 0 || bmf_vf_device_type != 1) {
            return deviceType;
        }
        return DeviceType.kCUDA;
    }

    public ScalarType dtype() {
        return (ScalarType) EnumUtil.fromValue(ScalarType.class, Integer.valueOf(API.bmf_vf_dtype(this.ptr)));
    }

    public Frame frame() {
        return Frame.wrap(API.bmf_vf_frame(this.ptr), false);
    }

    public void free() {
        if (this.own) {
            API.bmf_vf_free(this.ptr);
        }
    }

    public int height() {
        return API.bmf_vf_height(this.ptr);
    }

    public Image image() {
        return Image.wrap(API.bmf_vf_image(this.ptr), false);
    }

    public boolean isImage() {
        return API.bmf_vf_is_image(this.ptr);
    }

    public long pts() {
        return API.bmf_vf_pts(this.ptr);
    }

    public boolean ready() {
        return API.bmf_vf_ready(this.ptr);
    }

    public void synchronize() {
        API.bmf_vf_synchronize(this.ptr);
    }

    public Rational timeBase() {
        int[] bmf_vf_time_base = API.bmf_vf_time_base(this.ptr);
        return new Rational(bmf_vf_time_base[0], bmf_vf_time_base[1]);
    }

    public int width() {
        return API.bmf_vf_width(this.ptr);
    }

    public VideoFrame(Frame frame) {
        this.ptr = API.bmf_vf_from_frame(frame.getPtr());
        this.own = true;
    }

    public void copyFrom(VideoFrame videoFrame) {
        API.bmf_vf_copy_from(this.ptr, videoFrame.getPtr());
    }

    public void copyProps(VideoFrame videoFrame) {
        API.bmf_vf_copy_props(this.ptr, videoFrame.ptr);
    }

    public Object privateGet(OpaqueDataKey opaqueDataKey) {
        if (AnonymousClass1.$SwitchMap$com$bytedance$bmf$OpaqueDataKey[opaqueDataKey.ordinal()] == 1) {
            return GsonProtectorUtils.fromJson(new Gson(), API.bmf_json_param_dump(API.bmf_vf_private_get_json_param(this.ptr)), m.class);
        }
        throw new IllegalArgumentException("Unknown opaque data key in PrivateGet");
    }

    public void privateMerge(VideoFrame videoFrame) {
        API.bmf_vf_private_merge(this.ptr, videoFrame.ptr);
    }

    public void record(boolean z) {
        API.bmf_vf_record(this.ptr, z);
    }

    public void setPts(long j) {
        API.bmf_vf_set_pts(this.ptr, j);
    }

    public void setTimeBase(Rational rational) {
        API.bmf_vf_set_time_base(this.ptr, rational.num, rational.den);
    }

    public VideoFrame to(ScalarType scalarType) {
        return wrap(API.bmf_vf_to_dtype(this.ptr, scalarType.getValue()), true);
    }

    public VideoFrame toFrame(PixelInfo pixelInfo) {
        return wrap(API.bmf_vf_to_frame(this.ptr, pixelInfo.getPtr()), true);
    }

    public VideoFrame(Image image) {
        this.ptr = API.bmf_vf_from_image(image.getPtr());
        this.own = true;
    }

    public VideoFrame(long j, boolean z) {
        this.ptr = j;
        this.own = z;
    }

    public static VideoFrame wrap(long j, boolean z) {
        return new VideoFrame(j, z);
    }

    public void privateAttach(OpaqueDataKey opaqueDataKey, Object obj) {
        if (AnonymousClass1.$SwitchMap$com$bytedance$bmf$OpaqueDataKey[opaqueDataKey.ordinal()] == 1) {
            API.bmf_vf_private_attach_json_param(this.ptr, API.bmf_json_param_parse(((j) obj).toString()));
            return;
        }
        throw new IllegalArgumentException("Unknown opaque data key in PrivateAttach");
    }

    public VideoFrame to(String str, boolean z) {
        return wrap(API.bmf_vf_to_device(this.ptr, str, z), true);
    }

    public VideoFrame toImage(ChannelFormat channelFormat, boolean z) {
        return wrap(API.bmf_vf_to_image(this.ptr, channelFormat.getValue(), z), true);
    }

    public VideoFrame(int i, int i2, PixelInfo pixelInfo, String str) {
        this.ptr = API.bmf_vf_make_frame(i, i2, pixelInfo.getPtr(), str);
        this.own = true;
    }

    public VideoFrame(int i, int i2, int i3, ChannelFormat channelFormat, ScalarType scalarType, String str, boolean z) {
        this.ptr = API.bmf_vf_make_image(i, i2, i3, channelFormat.getValue(), scalarType.getValue(), str, z);
        this.own = true;
    }
}
