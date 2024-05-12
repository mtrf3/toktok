package com.bytedance.hmp;

/* loaded from: classes34.dex */
public class ColorModel extends Ptr {
    public ColorTransferCharacteristic colorTransferCharacteristic() {
        return (ColorTransferCharacteristic) EnumUtil.fromValue(ColorTransferCharacteristic.class, Integer.valueOf(Api.color_model_ctc(this.ptr)));
    }

    public void free() {
        if (this.own) {
            Api.color_model_free(this.ptr);
        }
    }

    public ColorPrimaries primaries() {
        return (ColorPrimaries) EnumUtil.fromValue(ColorPrimaries.class, Integer.valueOf(Api.color_model_primaries(this.ptr)));
    }

    public ColorRange range() {
        return (ColorRange) EnumUtil.fromValue(ColorRange.class, Integer.valueOf(Api.color_model_range(this.ptr)));
    }

    public ColorSpace space() {
        return (ColorSpace) EnumUtil.fromValue(ColorSpace.class, Integer.valueOf(Api.color_model_space(this.ptr)));
    }

    public ColorModel(long j, boolean z) {
        this.ptr = j;
        this.own = z;
    }

    public static ColorModel wrap(long j, boolean z) {
        return new ColorModel(j, z);
    }

    public ColorModel(ColorSpace colorSpace, ColorRange colorRange, ColorPrimaries colorPrimaries, ColorTransferCharacteristic colorTransferCharacteristic) {
        this.ptr = Api.color_model_make(colorSpace.getValue(), colorRange.getValue(), colorPrimaries.getValue(), colorTransferCharacteristic.getValue());
        this.own = true;
    }
}
