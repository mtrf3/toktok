package com.ss.android.ugc.aweme.profile.model;

import X.InterfaceC65349Pkn;
import java.io.Serializable;

/* loaded from: classes13.dex */
public class QuickShopSecondFloorInfo implements Serializable {

    @InterfaceC65349Pkn("enter_text")
    public String enterText;

    @InterfaceC65349Pkn("process_text")
    public String processText;

    @InterfaceC65349Pkn("trans_bg_text")
    public String transBgText;

    public String getEnterText() {
        return this.enterText;
    }

    public String getProcessText() {
        return this.processText;
    }

    public String getTransBgText() {
        return this.transBgText;
    }

    public void setEnterText(String str) {
        this.enterText = str;
    }

    public void setProcessText(String str) {
        this.processText = str;
    }

    public void setTransBgText(String str) {
        this.transBgText = str;
    }
}
