package com.ss.android.ugc.aweme.commercialize.model;

import X.InterfaceC65349Pkn;
import java.io.Serializable;
import java.util.List;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.o;

/* loaded from: classes11.dex */
public final class AdProductTile implements Serializable {

    @InterfaceC65349Pkn("container_type")
    public String containerType;

    @InterfaceC65349Pkn("gecko_channel")
    public List<String> geckoChannel;

    @InterfaceC65349Pkn("lynx_scheme")
    public String lynxScheme;

    @InterfaceC65349Pkn("product_list")
    public List<AdNativeProduct> productList;

    @InterfaceC65349Pkn("show_seconds")
    public int showSeconds;

    /* JADX WARN: Multi-variable type inference failed */
    public AdProductTile() {
        this(null, 0 == true ? 1 : 0, 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 31, 0 == true ? 1 : 0);
    }

    public final String getContainerType() {
        return this.containerType;
    }

    public final List<String> getGeckoChannel() {
        return this.geckoChannel;
    }

    public final String getLynxScheme() {
        return this.lynxScheme;
    }

    public final List<AdNativeProduct> getProductList() {
        return this.productList;
    }

    public final int getShowSeconds() {
        return this.showSeconds;
    }

    public final void setContainerType(String str) {
        o.LJIIIZ(str, "<set-?>");
        this.containerType = str;
    }

    public final void setGeckoChannel(List<String> list) {
        this.geckoChannel = list;
    }

    public final void setLynxScheme(String str) {
        this.lynxScheme = str;
    }

    public final void setProductList(List<AdNativeProduct> list) {
        this.productList = list;
    }

    public final void setShowSeconds(int i) {
        this.showSeconds = i;
    }

    public AdProductTile(String str, List<String> list, int i, String containerType, List<AdNativeProduct> list2) {
        o.LJIIIZ(containerType, "containerType");
        this.lynxScheme = str;
        this.geckoChannel = list;
        this.showSeconds = i;
        this.containerType = containerType;
        this.productList = list2;
    }

    public /* synthetic */ AdProductTile(String str, List list, int i, String str2, List list2, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this((i2 & 1) != 0 ? null : str, (i2 & 2) != 0 ? null : list, (i2 & 4) != 0 ? 0 : i, (i2 & 8) != 0 ? "" : str2, (i2 & 16) == 0 ? list2 : null);
    }
}
