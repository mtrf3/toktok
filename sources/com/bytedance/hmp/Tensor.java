package com.bytedance.hmp;

/* loaded from: classes34.dex */
public class Tensor extends Ptr {
    public Tensor alias() {
        return wrap(Api.tensor_alias(this.ptr), true);
    }

    /* renamed from: clone, reason: merged with bridge method [inline-methods] */
    public Tensor m69clone() {
        return wrap(Api.tensor_clone(this.ptr), true);
    }

    public long dataPtr() {
        return Api.tensor_data_ptr(this.ptr);
    }

    public boolean defined() {
        return Api.tensor_defined(this.ptr);
    }

    public int deviceIndex() {
        return Api.tensor_device_index(this.ptr);
    }

    public DeviceType deviceType() {
        return (DeviceType) EnumUtil.fromValue(DeviceType.class, Integer.valueOf(Api.tensor_device_type(this.ptr)));
    }

    public long dim() {
        return Api.tensor_dim(this.ptr);
    }

    public ScalarType dtype() {
        return (ScalarType) EnumUtil.fromValue(ScalarType.class, Integer.valueOf(Api.tensor_dtype(this.ptr)));
    }

    public void free() {
        if (this.own) {
            Api.tensor_free(this.ptr);
        }
    }

    public boolean isContiguous() {
        return Api.tensor_is_contiguous(this.ptr);
    }

    public long itemsize() {
        return Api.tensor_itemsize(this.ptr);
    }

    public long nbytes() {
        return Api.tensor_nbytes(this.ptr);
    }

    public long nitems() {
        return Api.tensor_nitems(this.ptr);
    }

    public String toString() {
        return Api.tensor_stringfy(this.ptr);
    }

    public void copyFrom(Tensor tensor) {
        Api.tensor_copy_from(this.ptr, tensor.getPtr());
    }

    public void fill(double d) {
        Scalar scalar = new Scalar(d);
        Api.tensor_fill(this.ptr, scalar.getPtr());
        scalar.free();
    }

    public Tensor permute(long[] jArr) {
        return wrap(Api.tensor_permute(this.ptr, jArr), true);
    }

    public Tensor reshape(long[] jArr) {
        return wrap(Api.tensor_reshape(this.ptr, jArr), true);
    }

    public long size(long j) {
        return Api.tensor_size(this.ptr, j);
    }

    public Tensor squeeze(long j) {
        return wrap(Api.tensor_squeeze(this.ptr, j), true);
    }

    public long stride(long j) {
        return Api.tensor_stride(this.ptr, j);
    }

    public Tensor to(ScalarType scalarType) {
        return wrap(Api.tensor_to_dtype(this.ptr, scalarType.getValue()), true);
    }

    public void toFile(String str) {
        Api.tensor_to_file(this.ptr, str);
    }

    public Tensor unsqueeze(long j) {
        return wrap(Api.tensor_unsqueeze(this.ptr, j), true);
    }

    public Tensor view(long[] jArr) {
        return wrap(Api.tensor_view(this.ptr, jArr), true);
    }

    public void fill(long j) {
        Scalar scalar = new Scalar(j);
        Api.tensor_fill(this.ptr, scalar.getPtr());
        scalar.free();
    }

    public void fill(boolean z) {
        Scalar scalar = new Scalar(z);
        Api.tensor_fill(this.ptr, scalar.getPtr());
        scalar.free();
    }

    public Tensor(long j, boolean z) {
        this.ptr = j;
        this.own = z;
    }

    public static Tensor wrap(long j, boolean z) {
        return new Tensor(j, z);
    }

    public Tensor select(long j, long j2) {
        return wrap(Api.tensor_select(this.ptr, j, j2), true);
    }

    public Tensor to(String str, boolean z) {
        return wrap(Api.tensor_to_device(this.ptr, str, z), true);
    }

    public Tensor to(Device device, boolean z) {
        return to(device.toString(), z);
    }

    public static Tensor empty(long[] jArr, ScalarType scalarType, String str, boolean z) {
        return wrap(Api.tensor_empty(jArr, scalarType.getValue(), str, z), true);
    }

    public static Tensor fromFile(String str, ScalarType scalarType, long j, long j2) {
        return wrap(Api.tensor_from_file(str, scalarType.getValue(), j, j2), true);
    }

    public Tensor slice(long j, long j2, long j3, long j4) {
        return wrap(Api.tensor_slice(this.ptr, j, j2, j3, j4), true);
    }

    public static Tensor empty(long[] jArr, ScalarType scalarType, Device device, boolean z) {
        return empty(jArr, scalarType, device.toString(), z);
    }

    public static Tensor arange(long j, long j2, long j3, ScalarType scalarType, String str, boolean z) {
        return wrap(Api.tensor_arange(j, j2, j3, scalarType.getValue(), str, z), true);
    }

    public static Tensor arange(long j, long j2, long j3, ScalarType scalarType, Device device, boolean z) {
        return arange(j, j2, j3, scalarType, device.toString(), z);
    }
}
