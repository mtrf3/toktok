package com.ss.android.ugc.aweme.feed.model;

import X.InterfaceC65349Pkn;
import java.io.Serializable;

/* loaded from: classes13.dex */
public class HotSearchInfoStruct implements Serializable {

    @InterfaceC65349Pkn("ailab_extra")
    public String aiLabExtra;

    @InterfaceC65349Pkn("biz_extra")
    public String bizExtra;

    @InterfaceC65349Pkn("rec_extra")
    public String recExtra;

    @InterfaceC65349Pkn("sentence")
    public String sentence;

    public String getAiLabExtra() {
        return this.aiLabExtra;
    }

    public String getBizExtra() {
        return this.bizExtra;
    }

    public String getRecExtra() {
        return this.recExtra;
    }

    public String getSentence() {
        return this.sentence;
    }

    public void setAiLabExtra(String str) {
        this.aiLabExtra = str;
    }

    public void setBizExtra(String str) {
        this.bizExtra = str;
    }

    public void setRecExtra(String str) {
        this.recExtra = str;
    }

    public void setSentence(String str) {
        this.sentence = str;
    }
}
