package com.ss.android.ugc.aweme.global.config.settings.pojo;

import X.C158056If;
import X.InterfaceC65349Pkn;

/* loaded from: classes13.dex */
public class WatermarkStruct {

    @InterfaceC65349Pkn("end_watermark_string")
    public String endWatermarkString;

    @InterfaceC65349Pkn("end_watermark_substring")
    public String endWatermarkSubstring;

    @InterfaceC65349Pkn("fps")
    public String fps;

    @InterfaceC65349Pkn("md5")
    public String md5;

    @InterfaceC65349Pkn("resource_url")
    public UrlModel resourceUrl;

    public String getEndWatermarkString() {
        String str = this.endWatermarkString;
        if (str != null) {
            return str;
        }
        throw new C158056If();
    }

    public String getEndWatermarkSubstring() {
        String str = this.endWatermarkSubstring;
        if (str != null) {
            return str;
        }
        throw new C158056If();
    }

    public String getFps() {
        String str = this.fps;
        if (str != null) {
            return str;
        }
        throw new C158056If();
    }

    public String getMd5() {
        String str = this.md5;
        if (str != null) {
            return str;
        }
        throw new C158056If();
    }

    public UrlModel getResourceUrl() {
        UrlModel urlModel = this.resourceUrl;
        if (urlModel != null) {
            return urlModel;
        }
        throw new C158056If();
    }
}
