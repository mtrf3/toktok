package com.bytedance.hmp;

/* loaded from: classes34.dex */
public class Stream extends Ptr {

    /* loaded from: classes34.dex */
    public class Guard extends Ptr {
        public void free() {
            if (this.own) {
                Api.stream_guard_free(this.ptr);
            }
        }

        public Guard() {
            this.ptr = Api.stream_guard_create(Stream.this.ptr);
            this.own = true;
        }
    }

    public int deviceIndex() {
        return Api.stream_device_index(this.ptr);
    }

    public DeviceType deviceType() {
        return (DeviceType) EnumUtil.fromValue(DeviceType.class, Integer.valueOf(Api.stream_device_type(this.ptr)));
    }

    public void free() {
        if (this.own) {
            Api.stream_free(this.ptr);
        }
    }

    public long handle() {
        return Api.stream_handle(this.ptr);
    }

    public boolean query() {
        return Api.stream_query(this.ptr);
    }

    public void synchronize() {
        Api.stream_synchronize(this.ptr);
    }

    public static Stream current(DeviceType deviceType) {
        return wrap(Api.stream_current(deviceType.getValue()), true);
    }

    public static void setCurrent(Stream stream) {
        Api.stream_set_current(stream.ptr);
    }

    public Stream(DeviceType deviceType, long j) {
        this.ptr = Api.stream_make(deviceType.getValue(), j);
        this.own = true;
    }

    public static Stream wrap(long j, boolean z) {
        return new Stream(j, z);
    }

    public Stream(long j, boolean z) {
        this.ptr = j;
        this.own = z;
    }
}
