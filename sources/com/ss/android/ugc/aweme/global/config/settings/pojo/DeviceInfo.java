package com.ss.android.ugc.aweme.global.config.settings.pojo;

import X.C158056If;
import X.InterfaceC65349Pkn;

/* loaded from: classes7.dex */
public class DeviceInfo {

    @InterfaceC65349Pkn("brand")
    public String brand;

    @InterfaceC65349Pkn("device")
    public String device;

    @InterfaceC65349Pkn("model")
    public String model;

    public String getBrand() {
        String str = this.brand;
        if (str != null) {
            return str;
        }
        throw new C158056If();
    }

    public String getDevice() {
        String str = this.device;
        if (str != null) {
            return str;
        }
        throw new C158056If();
    }

    public String getModel() {
        String str = this.model;
        if (str != null) {
            return str;
        }
        throw new C158056If();
    }
}
