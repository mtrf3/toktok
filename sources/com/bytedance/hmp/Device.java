package com.bytedance.hmp;

/* loaded from: classes34.dex */
public class Device extends Ptr {

    /* loaded from: classes34.dex */
    public class Guard extends Ptr {
        public void free() {
            if (this.own) {
                Api.device_guard_free(this.ptr);
            }
        }

        public Guard() {
            this.ptr = Api.device_guard_make(Device.this.ptr);
            this.own = true;
        }
    }

    public static boolean hasCuda() {
        if (count(DeviceType.kCUDA) > 0) {
            return true;
        }
        return false;
    }

    public void free() {
        if (this.own) {
            Api.device_free(this.ptr);
        }
    }

    public int index() {
        return Api.device_index(this.ptr);
    }

    public String toString() {
        return Api.device_stringfy(this.ptr);
    }

    public DeviceType type() {
        return (DeviceType) EnumUtil.fromValue(DeviceType.class, Integer.valueOf(Api.device_type(this.ptr)));
    }

    public Device() {
        this.ptr = Api.device_make("");
        this.own = true;
    }

    public Device(String str) {
        this.ptr = Api.device_make(str);
        this.own = true;
    }

    public static int count(DeviceType deviceType) {
        return Api.device_count(deviceType.getValue());
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Device)) {
            return false;
        }
        Device device = (Device) obj;
        if (type() == device.type() && index() == device.index()) {
            return true;
        }
        return false;
    }

    public Device(DeviceType deviceType, int i) {
        this.ptr = Api.device_make(deviceType.getValue(), i);
        this.own = true;
    }

    public static Device wrap(long j, boolean z) {
        return new Device(j, z);
    }

    public Device(long j, boolean z) {
        this.ptr = j;
        this.own = z;
    }
}
