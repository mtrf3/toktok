package com.ss.android.ugc.aweme.global.config.settings.pojo;

import X.C158056If;
import X.InterfaceC65349Pkn;

/* loaded from: classes5.dex */
public class IMUseOkHttpClientConfig {

    @InterfaceC65349Pkn("downloader_use_okhttpclient")
    public Boolean downloaderUseOkhttpclient;

    @InterfaceC65349Pkn("gif_manager_use_okhttpclient")
    public Boolean gifManagerUseOkhttpclient;

    @InterfaceC65349Pkn("uploader_use_okhttpclient")
    public Boolean uploaderUseOkhttpclient;

    public Boolean getDownloaderUseOkhttpclient() {
        Boolean bool = this.downloaderUseOkhttpclient;
        if (bool != null) {
            return bool;
        }
        throw new C158056If();
    }

    public Boolean getGifManagerUseOkhttpclient() {
        Boolean bool = this.gifManagerUseOkhttpclient;
        if (bool != null) {
            return bool;
        }
        throw new C158056If();
    }

    public Boolean getUploaderUseOkhttpclient() {
        Boolean bool = this.uploaderUseOkhttpclient;
        if (bool != null) {
            return bool;
        }
        throw new C158056If();
    }
}
