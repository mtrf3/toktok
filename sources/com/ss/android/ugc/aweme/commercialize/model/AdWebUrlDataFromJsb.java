package com.ss.android.ugc.aweme.commercialize.model;

import X.InterfaceC65349Pkn;
import java.io.Serializable;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.o;

/* loaded from: classes11.dex */
public final class AdWebUrlDataFromJsb implements Serializable {

    @InterfaceC65349Pkn("is_from_jsb")
    public final boolean isFromJsb;

    @InterfaceC65349Pkn("is_from_lynx_land_page")
    public final boolean isFromLynxLandPage;

    @InterfaceC65349Pkn("refer")
    public final String refer;

    @InterfaceC65349Pkn("use_web_url")
    public final int useWebUrl;

    @InterfaceC65349Pkn("web_title")
    public final String webTitle;

    @InterfaceC65349Pkn("web_url")
    public final String webUrl;

    /* JADX WARN: Illegal instructions before constructor call */
    /* JADX WARN: Multi-variable type inference failed */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public AdWebUrlDataFromJsb() {
        /*
            r9 = this;
            r1 = 0
            r3 = 0
            r7 = 63
            r0 = r9
            r2 = r1
            r4 = r3
            r5 = r1
            r6 = r3
            r8 = r1
            r0.<init>(r1, r2, r3, r4, r5, r6, r7, r8)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.commercialize.model.AdWebUrlDataFromJsb.<init>():void");
    }

    public final String getRefer() {
        return this.refer;
    }

    public final int getUseWebUrl() {
        return this.useWebUrl;
    }

    public final String getWebTitle() {
        return this.webTitle;
    }

    public final String getWebUrl() {
        return this.webUrl;
    }

    public final boolean isFromJsb() {
        return this.isFromJsb;
    }

    public final boolean isFromLynxLandPage() {
        return this.isFromLynxLandPage;
    }

    public AdWebUrlDataFromJsb(String webUrl, String webTitle, boolean z, boolean z2, String str, int i) {
        o.LJIIIZ(webUrl, "webUrl");
        o.LJIIIZ(webTitle, "webTitle");
        this.webUrl = webUrl;
        this.webTitle = webTitle;
        this.isFromLynxLandPage = z;
        this.isFromJsb = z2;
        this.refer = str;
        this.useWebUrl = i;
    }

    public /* synthetic */ AdWebUrlDataFromJsb(String str, String str2, boolean z, boolean z2, String str3, int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this((i2 & 1) != 0 ? "" : str, (i2 & 2) != 0 ? "" : str2, (i2 & 4) != 0 ? false : z, (i2 & 8) != 0 ? true : z2, (i2 & 16) == 0 ? str3 : "", (i2 & 32) != 0 ? 0 : i);
    }
}
