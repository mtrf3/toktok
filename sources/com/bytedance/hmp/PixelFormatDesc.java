package com.bytedance.hmp;

/* loaded from: classes34.dex */
public class PixelFormatDesc extends Ptr {
    public ScalarType dtype() {
        return (ScalarType) EnumUtil.fromValue(ScalarType.class, Integer.valueOf(Api.pixel_format_desc_dtype(this.ptr)));
    }

    public int format() {
        return Api.pixel_format_desc_format(this.ptr);
    }

    public void free() {
        if (this.own) {
            Api.pixel_format_desc_free(this.ptr);
        }
    }

    public int nplanes() {
        return Api.pixel_format_desc_nplanes(this.ptr);
    }

    public PixelFormatDesc(PixelFormat pixelFormat) {
        this.ptr = Api.pixel_format_desc_make(pixelFormat.getValue());
        this.own = true;
    }

    public int channels(int i) {
        return Api.pixel_format_desc_channels(this.ptr, i);
    }

    public PixelFormatDesc(long j, boolean z) {
        this.ptr = j;
        this.own = z;
    }

    public static PixelFormatDesc wrap(long j, boolean z) {
        return new PixelFormatDesc(j, z);
    }

    public int infer_height(int i, int i2) {
        return Api.pixel_format_desc_infer_height(this.ptr, i, i2);
    }

    public int infer_nitems(int i, int i2) {
        return Api.pixel_format_desc_infer_nitems(this.ptr, i, i2);
    }

    public int infer_width(int i, int i2) {
        return Api.pixel_format_desc_infer_width(this.ptr, i, i2);
    }

    public int infer_nitems(int i, int i2, int i3) {
        return Api.pixel_format_desc_infer_nitems(this.ptr, i, i2, i3);
    }
}
