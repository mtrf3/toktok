package com.ss.android.ugc.aweme.commercialize.model;

import X.InterfaceC65349Pkn;
import android.text.TextUtils;
import com.ss.android.ugc.aweme.base.model.UrlModel;
import java.io.Serializable;

/* loaded from: classes13.dex */
public class CommerceStickerInfo implements Serializable {

    @InterfaceC65349Pkn("commerce_sticker_id")
    public long commerceStickerId;

    @InterfaceC65349Pkn("icon_url")
    public UrlModel iconUrl;

    @InterfaceC65349Pkn("letters")
    public String letters;

    @InterfaceC65349Pkn("open_url")
    public String openUrl;

    @InterfaceC65349Pkn("web_url")
    public String webUrl;

    @InterfaceC65349Pkn("web_url_title")
    public String webUrlTitle;

    public boolean enable() {
        if (this.iconUrl != null && !TextUtils.isEmpty(this.letters)) {
            if (TextUtils.isEmpty(this.webUrl) && TextUtils.isEmpty(this.openUrl)) {
                return false;
            }
            return true;
        }
        return false;
    }

    public long getCommerceStickerId() {
        return this.commerceStickerId;
    }

    public UrlModel getIconUrl() {
        return this.iconUrl;
    }

    public String getLetters() {
        return this.letters;
    }

    public String getOpenUrl() {
        return this.openUrl;
    }

    public String getWebUrl() {
        return this.webUrl;
    }

    public String getWebUrlTitle() {
        return this.webUrlTitle;
    }

    public void setCommerceStickerId(long j) {
        this.commerceStickerId = j;
    }

    public void setIconUrl(UrlModel urlModel) {
        this.iconUrl = urlModel;
    }

    public void setLetters(String str) {
        this.letters = str;
    }

    public void setOpenUrl(String str) {
        this.openUrl = str;
    }

    public void setWebUrl(String str) {
        this.webUrl = str;
    }

    public void setWebUrlTitle(String str) {
        this.webUrlTitle = str;
    }
}
