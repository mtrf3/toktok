package com.ss.android.ugc.aweme.ecommerce.model;

import X.InterfaceC65349Pkn;
import X.WM7;
import com.ss.android.ugc.aweme.base.model.UrlModel;
import java.io.Serializable;
import java.util.List;

/* loaded from: classes9.dex */
public final class EcSuggestWordStruct implements Serializable {

    @InterfaceC65349Pkn("icon_url")
    public UrlModel iconUrl;

    @InterfaceC65349Pkn("redirect_page")
    public Integer redirectPage;

    @InterfaceC65349Pkn("words")
    public List<EcWordStruct> words;

    @InterfaceC65349Pkn(WM7.SCENE_SERVICE)
    public String scene = "";

    @InterfaceC65349Pkn("hint_text")
    public String hintText = "";

    @InterfaceC65349Pkn("extra_info")
    public String extraInfo = "";

    @InterfaceC65349Pkn("qrec_virtual_enable")
    public String qrecVirtualEnable = "";

    public final String getExtraInfo() {
        return this.extraInfo;
    }

    public final String getHintText() {
        return this.hintText;
    }

    public final UrlModel getIconUrl() {
        return this.iconUrl;
    }

    public final String getQrecVirtualEnable() {
        return this.qrecVirtualEnable;
    }

    public final Integer getRedirectPage() {
        return this.redirectPage;
    }

    public final String getScene() {
        return this.scene;
    }

    public final List<EcWordStruct> getWords() {
        return this.words;
    }

    public final void setExtraInfo(String str) {
        this.extraInfo = str;
    }

    public final void setHintText(String str) {
        this.hintText = str;
    }

    public final void setIconUrl(UrlModel urlModel) {
        this.iconUrl = urlModel;
    }

    public final void setQrecVirtualEnable(String str) {
        this.qrecVirtualEnable = str;
    }

    public final void setRedirectPage(Integer num) {
        this.redirectPage = num;
    }

    public final void setScene(String str) {
        this.scene = str;
    }

    public final void setWords(List<EcWordStruct> list) {
        this.words = list;
    }
}
