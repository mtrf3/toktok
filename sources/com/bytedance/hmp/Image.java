package com.bytedance.hmp;

/* loaded from: classes34.dex */
public class Image extends Ptr {
    public int cdim() {
        return Api.image_cdim(this.ptr);
    }

    /* renamed from: clone, reason: merged with bridge method [inline-methods] */
    public Image m68clone() {
        return wrap(Api.image_clone(this.ptr), true);
    }

    public ColorModel colorModel() {
        return ColorModel.wrap(Api.image_color_model(this.ptr), false);
    }

    public Tensor data() {
        return Tensor.wrap(Api.image_data(this.ptr), false);
    }

    public boolean defined() {
        return Api.image_defined(this.ptr);
    }

    public int deviceIndex() {
        return Api.image_device_index(this.ptr);
    }

    public DeviceType deviceType() {
        return (DeviceType) EnumUtil.fromValue(DeviceType.class, Integer.valueOf(Api.image_device_type(this.ptr)));
    }

    public ScalarType dtype() {
        return (ScalarType) EnumUtil.fromValue(ScalarType.class, Integer.valueOf(Api.image_dtype(this.ptr)));
    }

    public void free() {
        if (this.own) {
            Api.image_free(this.ptr);
        }
    }

    public int hdim() {
        return Api.image_hdim(this.ptr);
    }

    public int height() {
        return Api.image_height(this.ptr);
    }

    public int nchannels() {
        return Api.image_nchannels(this.ptr);
    }

    public String toString() {
        return Api.image_stringfy(this.ptr);
    }

    public int wdim() {
        return Api.image_wdim(this.ptr);
    }

    public int width() {
        return Api.image_width(this.ptr);
    }

    public void copyFrom(Image image) {
        Api.image_copy_from(this.ptr, image.getPtr());
    }

    public void setColorModel(ColorModel colorModel) {
        Api.image_set_color_model(this.ptr, colorModel.getPtr());
    }

    public Image(Tensor tensor, ChannelFormat channelFormat) {
        this.ptr = Api.image_make(tensor.getPtr(), channelFormat.getValue());
        this.own = true;
    }

    public static Image wrap(long j, boolean z) {
        return new Image(j, z);
    }

    public Image to(String str, boolean z) {
        return wrap(Api.image_to_device(this.ptr, str, z), true);
    }

    public Image(long j, boolean z) {
        this.ptr = j;
        this.own = z;
    }

    public Image to(Device device, boolean z) {
        return to(device.toString(), z);
    }

    public Image(Tensor tensor, ChannelFormat channelFormat, ColorModel colorModel) {
        this.ptr = Api.image_make(tensor.getPtr(), channelFormat.getValue(), colorModel.getPtr());
        this.own = true;
    }

    public Image crop(int i, int i2, int i3, int i4) {
        return wrap(Api.image_crop(this.ptr, i, i2, i3, i4), true);
    }

    public Image(int i, int i2, int i3, ChannelFormat channelFormat, ScalarType scalarType, String str, boolean z) {
        this.ptr = Api.image_make(i, i2, i3, channelFormat.getValue(), scalarType.getValue(), str, z);
        this.own = true;
    }
}
