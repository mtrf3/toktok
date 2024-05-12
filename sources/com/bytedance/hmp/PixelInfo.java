package com.bytedance.hmp;

/* loaded from: classes34.dex */
public class PixelInfo extends Ptr {
    public ColorModel colorModel() {
        return ColorModel.wrap(Api.pixel_info_color_model(this.ptr), false);
    }

    public ColorTransferCharacteristic colorTransferCharacteristic() {
        return (ColorTransferCharacteristic) EnumUtil.fromValue(ColorTransferCharacteristic.class, Integer.valueOf(Api.pixel_info_primaries(this.ptr)));
    }

    public PixelFormat format() {
        return (PixelFormat) EnumUtil.fromValue(PixelFormat.class, Integer.valueOf(Api.pixel_info_format(this.ptr)));
    }

    public void free() {
        if (this.own) {
            Api.pixel_info_free(this.ptr);
        }
    }

    public ColorSpace inferSpace() {
        return (ColorSpace) EnumUtil.fromValue(ColorSpace.class, Integer.valueOf(Api.pixel_info_infer_space(this.ptr)));
    }

    public boolean isRgbx() {
        return Api.pixel_info_is_rgbx(this.ptr);
    }

    public ColorPrimaries primaries() {
        return (ColorPrimaries) EnumUtil.fromValue(ColorPrimaries.class, Integer.valueOf(Api.pixel_info_primaries(this.ptr)));
    }

    public ColorRange range() {
        return (ColorRange) EnumUtil.fromValue(ColorRange.class, Integer.valueOf(Api.pixel_info_range(this.ptr)));
    }

    public ColorSpace space() {
        return (ColorSpace) EnumUtil.fromValue(ColorSpace.class, Integer.valueOf(Api.pixel_info_space(this.ptr)));
    }

    public String toString() {
        return Api.pixel_info_stringfy(this.ptr);
    }

    public PixelInfo(PixelFormat pixelFormat) {
        this.ptr = Api.pixel_info_make(pixelFormat.getValue(), ColorSpace.CS_UNSPECIFIED.getValue(), ColorRange.CR_UNSPECIFIED.getValue());
        this.own = true;
    }

    public PixelInfo(PixelFormat pixelFormat, ColorModel colorModel) {
        this.ptr = Api.pixel_info_make(pixelFormat.getValue(), colorModel.getPtr());
        this.own = true;
    }

    public static PixelInfo wrap(long j, boolean z) {
        return new PixelInfo(j, z);
    }

    public PixelInfo(long j, boolean z) {
        this.ptr = j;
        this.own = z;
    }

    public PixelInfo(PixelFormat pixelFormat, ColorSpace colorSpace, ColorRange colorRange) {
        this.ptr = Api.pixel_info_make(pixelFormat.getValue(), colorSpace.getValue(), colorRange.getValue());
        this.own = true;
    }
}
