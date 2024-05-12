package com.bytedance.hmp;

import android.graphics.Bitmap;

/* loaded from: classes34.dex */
public class Frame extends Ptr {
    /* renamed from: clone, reason: merged with bridge method [inline-methods] */
    public Frame m67clone() {
        return wrap(Api.frame_clone(this.ptr), true);
    }

    public boolean defined() {
        return Api.frame_defined(this.ptr);
    }

    public int deviceIndex() {
        return Api.frame_device_index(this.ptr);
    }

    public DeviceType deviceType() {
        return (DeviceType) EnumUtil.fromValue(DeviceType.class, Integer.valueOf(Api.frame_device_type(this.ptr)));
    }

    public ScalarType dtype() {
        return (ScalarType) EnumUtil.fromValue(ScalarType.class, Integer.valueOf(Api.frame_dtype(this.ptr)));
    }

    public PixelFormat format() {
        return (PixelFormat) EnumUtil.fromValue(PixelFormat.class, Integer.valueOf(Api.frame_format(this.ptr)));
    }

    public void free() {
        if (this.own) {
            Api.frame_free(this.ptr);
        }
    }

    public int height() {
        return Api.frame_height(this.ptr);
    }

    public int nplanes() {
        return Api.frame_nplanes(this.ptr);
    }

    public PixelInfo pixInfo() {
        return PixelInfo.wrap(Api.frame_pix_info(this.ptr), false);
    }

    public String toString() {
        return Api.frame_stringfy(this.ptr);
    }

    public int width() {
        return Api.frame_width(this.ptr);
    }

    public Frame(Bitmap bitmap) {
        this.ptr = Api.frame_make(bitmap);
        this.own = true;
    }

    public void copyFrom(Frame frame) {
        Api.frame_copy_from(this.ptr, frame.getPtr());
    }

    public Tensor plane(int i) {
        return Tensor.wrap(Api.frame_plane(this.ptr, i), false);
    }

    public Image toImage(ChannelFormat channelFormat) {
        return Image.wrap(Api.frame_to_image(this.ptr, channelFormat.getValue()), true);
    }

    public void unlock(Bitmap bitmap) {
        Api.frame_unlock(bitmap);
    }

    public Frame(Tensor[] tensorArr, PixelInfo pixelInfo) {
        long[] jArr = new long[tensorArr.length];
        for (int i = 0; i < tensorArr.length; i++) {
            jArr[i] = tensorArr[i].getPtr();
        }
        this.ptr = Api.frame_make(jArr, pixelInfo.getPtr());
        this.own = true;
    }

    public static Frame fromImage(Image image, PixelInfo pixelInfo) {
        return wrap(Api.frame_from_image(image.getPtr(), pixelInfo.getPtr()), true);
    }

    public static Frame wrap(long j, boolean z) {
        return new Frame(j, z);
    }

    public Frame to(String str, boolean z) {
        return wrap(Api.frame_to_device(this.ptr, str, z), true);
    }

    public Frame(long j, boolean z) {
        this.ptr = j;
        this.own = z;
    }

    public Frame to(Device device, boolean z) {
        return to(device.toString(), z);
    }

    public Frame(Tensor[] tensorArr, int i, int i2, PixelInfo pixelInfo) {
        long[] jArr = new long[tensorArr.length];
        for (int i3 = 0; i3 < tensorArr.length; i3++) {
            jArr[i3] = tensorArr[i3].getPtr();
        }
        this.ptr = Api.frame_make(jArr, i, i2, pixelInfo.getPtr());
        this.own = true;
    }

    public Frame crop(int i, int i2, int i3, int i4) {
        return wrap(Api.frame_crop(this.ptr, i, i2, i3, i4), true);
    }

    public Frame(int i, int i2, PixelInfo pixelInfo, Device device) {
        this.ptr = Api.frame_make(i, i2, pixelInfo.getPtr(), device.toString());
        this.own = true;
    }

    public Frame(int i, int i2, PixelInfo pixelInfo, String str) {
        this.ptr = Api.frame_make(i, i2, pixelInfo.getPtr(), str);
        this.own = true;
    }
}
