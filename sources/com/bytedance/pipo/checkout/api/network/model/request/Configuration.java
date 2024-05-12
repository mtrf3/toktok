package com.bytedance.pipo.checkout.api.network.model.request;

import X.InterfaceC65349Pkn;
import X.X1D;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.o;

/* loaded from: classes20.dex */
public final class Configuration {

    @InterfaceC65349Pkn("color_theme")
    public String colorTheme;

    @InterfaceC65349Pkn("environment")
    public String environment;

    @InterfaceC65349Pkn("flow")
    public String flow;

    @InterfaceC65349Pkn("locale")
    public String locale;

    @InterfaceC65349Pkn("origin_key")
    public String originKey;

    @InterfaceC65349Pkn("platform")
    public String platform;

    /* JADX WARN: Multi-variable type inference failed */
    public Configuration() {
        this(null, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 63, 0 == true ? 1 : 0);
    }

    public static /* synthetic */ Configuration copy$default(Configuration configuration, String str, String str2, String str3, String str4, String str5, String str6, int i, Object obj) {
        if ((i & 1) != 0) {
            str = configuration.environment;
        }
        if ((i & 2) != 0) {
            str2 = configuration.locale;
        }
        if ((i & 4) != 0) {
            str3 = configuration.originKey;
        }
        if ((i & 8) != 0) {
            str4 = configuration.platform;
        }
        if ((i & 16) != 0) {
            str5 = configuration.colorTheme;
        }
        if ((i & 32) != 0) {
            str6 = configuration.flow;
        }
        return configuration.copy(str, str2, str3, str4, str5, str6);
    }

    public final Configuration copy(String str, String str2, String str3, String str4, String str5, String str6) {
        return new Configuration(str, str2, str3, str4, str5, str6);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Configuration)) {
            return false;
        }
        Configuration configuration = (Configuration) obj;
        return o.LJ(this.environment, configuration.environment) && o.LJ(this.locale, configuration.locale) && o.LJ(this.originKey, configuration.originKey) && o.LJ(this.platform, configuration.platform) && o.LJ(this.colorTheme, configuration.colorTheme) && o.LJ(this.flow, configuration.flow);
    }

    public int hashCode() {
        String str = this.environment;
        int hashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.locale;
        int hashCode2 = (hashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.originKey;
        int hashCode3 = (hashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.platform;
        int hashCode4 = (hashCode3 + (str4 == null ? 0 : str4.hashCode())) * 31;
        String str5 = this.colorTheme;
        int hashCode5 = (hashCode4 + (str5 == null ? 0 : str5.hashCode())) * 31;
        String str6 = this.flow;
        return hashCode5 + (str6 != null ? str6.hashCode() : 0);
    }

    public String toString() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("Configuration(environment=");
        LIZ.append((Object) this.environment);
        LIZ.append(", locale=");
        LIZ.append((Object) this.locale);
        LIZ.append(", originKey=");
        LIZ.append((Object) this.originKey);
        LIZ.append(", platform=");
        LIZ.append((Object) this.platform);
        LIZ.append(", colorTheme=");
        LIZ.append((Object) this.colorTheme);
        LIZ.append(", flow=");
        LIZ.append((Object) this.flow);
        LIZ.append(')');
        return X1D.LIZIZ(LIZ);
    }

    public final String getColorTheme() {
        return this.colorTheme;
    }

    public final String getEnvironment() {
        return this.environment;
    }

    public final String getFlow() {
        return this.flow;
    }

    public final String getLocale() {
        return this.locale;
    }

    public final String getOriginKey() {
        return this.originKey;
    }

    public final String getPlatform() {
        return this.platform;
    }

    public final void setColorTheme(String str) {
        this.colorTheme = str;
    }

    public final void setEnvironment(String str) {
        this.environment = str;
    }

    public final void setFlow(String str) {
        this.flow = str;
    }

    public final void setLocale(String str) {
        this.locale = str;
    }

    public final void setOriginKey(String str) {
        this.originKey = str;
    }

    public final void setPlatform(String str) {
        this.platform = str;
    }

    public Configuration(String str, String str2, String str3, String str4, String str5, String str6) {
        this.environment = str;
        this.locale = str2;
        this.originKey = str3;
        this.platform = str4;
        this.colorTheme = str5;
        this.flow = str6;
    }

    public /* synthetic */ Configuration(String str, String str2, String str3, String str4, String str5, String str6, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : str, (i & 2) != 0 ? null : str2, (i & 4) != 0 ? null : str3, (i & 8) != 0 ? null : str4, (i & 16) != 0 ? null : str5, (i & 32) == 0 ? str6 : null);
    }
}
