package com.ss.android.ugc.aweme.ecommerce.fashionmall.bean;

import X.InterfaceC65349Pkn;
import X.X1D;
import defpackage.q;
import kotlin.jvm.internal.o;

/* loaded from: classes2.dex */
public final class Module {

    @InterfaceC65349Pkn("config")
    public final Config config;

    @InterfaceC65349Pkn("desc")
    public final String desc;

    @InterfaceC65349Pkn("type")
    public final String type;

    public static /* synthetic */ Module copy$default(Module module, Config config, String str, String str2, int i, Object obj) {
        if ((i & 1) != 0) {
            config = module.config;
        }
        if ((i & 2) != 0) {
            str = module.desc;
        }
        if ((i & 4) != 0) {
            str2 = module.type;
        }
        return module.copy(config, str, str2);
    }

    public final Module copy(Config config, String str, String str2) {
        return new Module(config, str, str2);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Module)) {
            return false;
        }
        Module module = (Module) obj;
        return o.LJ(this.config, module.config) && o.LJ(this.desc, module.desc) && o.LJ(this.type, module.type);
    }

    public int hashCode() {
        Config config = this.config;
        int hashCode = (config == null ? 0 : config.hashCode()) * 31;
        String str = this.desc;
        int hashCode2 = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.type;
        return hashCode2 + (str2 != null ? str2.hashCode() : 0);
    }

    public String toString() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("Module(config=");
        LIZ.append(this.config);
        LIZ.append(", desc=");
        LIZ.append(this.desc);
        LIZ.append(", type=");
        return q.LIZIZ(LIZ, this.type, ')', LIZ);
    }

    public final Config getConfig() {
        return this.config;
    }

    public final String getDesc() {
        return this.desc;
    }

    public final String getType() {
        return this.type;
    }

    public Module(Config config, String str, String str2) {
        this.config = config;
        this.desc = str;
        this.type = str2;
    }
}
