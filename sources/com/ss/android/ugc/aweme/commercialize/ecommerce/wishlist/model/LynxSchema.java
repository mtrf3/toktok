package com.ss.android.ugc.aweme.commercialize.ecommerce.wishlist.model;

import X.C1NE;
import X.InterfaceC65349Pkn;
import X.X1D;
import java.io.Serializable;
import java.util.List;
import kotlin.jvm.internal.o;

/* loaded from: classes7.dex */
public final class LynxSchema implements Serializable {

    @InterfaceC65349Pkn("gecko_channel")
    public final List<String> geckoChannels;

    @InterfaceC65349Pkn("render_url")
    public final String renderUrl;

    @InterfaceC65349Pkn("web_url")
    public final String webUrl;

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ LynxSchema copy$default(LynxSchema lynxSchema, String str, String str2, List list, int i, Object obj) {
        if ((i & 1) != 0) {
            str = lynxSchema.renderUrl;
        }
        if ((i & 2) != 0) {
            str2 = lynxSchema.webUrl;
        }
        if ((i & 4) != 0) {
            list = lynxSchema.geckoChannels;
        }
        return lynxSchema.copy(str, str2, list);
    }

    public final LynxSchema copy(String str, String str2, List<String> list) {
        return new LynxSchema(str, str2, list);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof LynxSchema)) {
            return false;
        }
        LynxSchema lynxSchema = (LynxSchema) obj;
        return o.LJ(this.renderUrl, lynxSchema.renderUrl) && o.LJ(this.webUrl, lynxSchema.webUrl) && o.LJ(this.geckoChannels, lynxSchema.geckoChannels);
    }

    public int hashCode() {
        String str = this.renderUrl;
        int hashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.webUrl;
        int hashCode2 = (hashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        List<String> list = this.geckoChannels;
        return hashCode2 + (list != null ? list.hashCode() : 0);
    }

    public String toString() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("LynxSchema(renderUrl=");
        LIZ.append(this.renderUrl);
        LIZ.append(", webUrl=");
        LIZ.append(this.webUrl);
        LIZ.append(", geckoChannels=");
        return C1NE.LIZIZ(LIZ, this.geckoChannels, ')', LIZ);
    }

    public final List<String> getGeckoChannels() {
        return this.geckoChannels;
    }

    public final String getRenderUrl() {
        return this.renderUrl;
    }

    public final String getWebUrl() {
        return this.webUrl;
    }

    public LynxSchema(String str, String str2, List<String> list) {
        this.renderUrl = str;
        this.webUrl = str2;
        this.geckoChannels = list;
    }
}
