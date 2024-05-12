package com.ss.android.ugc.aweme.feed.model.search;

import X.InterfaceC65349Pkn;
import X.WM7;
import com.ss.android.ugc.aweme.base.model.UrlModel;
import java.io.Serializable;
import java.util.List;
import kotlin.jvm.internal.o;

/* loaded from: classes9.dex */
public final class SuggestWordStruct implements Serializable {

    @InterfaceC65349Pkn("icon_url")
    public UrlModel iconUrl;

    @InterfaceC65349Pkn("words")
    public List<WordStruct> words;

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

    public final String getScene() {
        return this.scene;
    }

    public final List<WordStruct> getWords() {
        return this.words;
    }

    public final void setExtraInfo(String str) {
        o.LJIIIZ(str, "<set-?>");
        this.extraInfo = str;
    }

    public final void setHintText(String str) {
        o.LJIIIZ(str, "<set-?>");
        this.hintText = str;
    }

    public final void setIconUrl(UrlModel urlModel) {
        this.iconUrl = urlModel;
    }

    public final void setQrecVirtualEnable(String str) {
        o.LJIIIZ(str, "<set-?>");
        this.qrecVirtualEnable = str;
    }

    public final void setScene(String str) {
        o.LJIIIZ(str, "<set-?>");
        this.scene = str;
    }

    public final void setWords(List<WordStruct> list) {
        this.words = list;
    }
}
