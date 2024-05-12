package com.ss.android.ugc.aweme.discover.model;

import X.InterfaceC65349Pkn;
import java.io.Serializable;
import kotlin.jvm.internal.o;

/* loaded from: classes2.dex */
public final class LongVideoTag implements Serializable {

    @InterfaceC65349Pkn("tag_word")
    public String tagWord = "";

    @InterfaceC65349Pkn("tag_bg_img")
    public String tagBgImg = "";

    @InterfaceC65349Pkn("tag_word_color")
    public String tagWordColor = "";

    public final String getTagBgImg() {
        return this.tagBgImg;
    }

    public final String getTagWord() {
        return this.tagWord;
    }

    public final String getTagWordColor() {
        return this.tagWordColor;
    }

    public final void setTagBgImg(String str) {
        o.LJIIIZ(str, "<set-?>");
        this.tagBgImg = str;
    }

    public final void setTagWord(String str) {
        o.LJIIIZ(str, "<set-?>");
        this.tagWord = str;
    }

    public final void setTagWordColor(String str) {
        o.LJIIIZ(str, "<set-?>");
        this.tagWordColor = str;
    }
}
