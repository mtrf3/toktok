package com.ss.android.ugc.aweme.account.login.twostep;

import X.InterfaceC65349Pkn;
import X.JBR;
import X.X1D;
import java.io.Serializable;
import kotlin.jvm.internal.o;

/* loaded from: classes8.dex */
public final class Device implements Serializable {

    @InterfaceC65349Pkn("device_id")
    public final Long device_id;

    @InterfaceC65349Pkn("device_name")
    public final String device_name;

    public static /* synthetic */ Device copy$default(Device device, String str, Long l, int i, Object obj) {
        if ((i & 1) != 0) {
            str = device.device_name;
        }
        if ((i & 2) != 0) {
            l = device.device_id;
        }
        return device.copy(str, l);
    }

    public final Device copy(String str, Long l) {
        return new Device(str, l);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Device)) {
            return false;
        }
        Device device = (Device) obj;
        return o.LJ(this.device_name, device.device_name) && o.LJ(this.device_id, device.device_id);
    }

    public int hashCode() {
        String str = this.device_name;
        int hashCode = (str == null ? 0 : str.hashCode()) * 31;
        Long l = this.device_id;
        return hashCode + (l != null ? l.hashCode() : 0);
    }

    public String toString() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("Device(device_name=");
        LIZ.append(this.device_name);
        LIZ.append(", device_id=");
        return JBR.LJ(LIZ, this.device_id, ')', LIZ);
    }

    public final Long getDevice_id() {
        return this.device_id;
    }

    public final String getDevice_name() {
        return this.device_name;
    }

    public Device(String str, Long l) {
        this.device_name = str;
        this.device_id = l;
    }
}
