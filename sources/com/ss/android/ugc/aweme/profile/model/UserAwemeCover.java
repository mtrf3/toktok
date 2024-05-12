package com.ss.android.ugc.aweme.profile.model;

import X.InterfaceC65349Pkn;
import X.InterfaceC65404Plg;
import com.ss.android.ugc.aweme.utils.JsonToStringAdapter;
import java.io.Serializable;

/* loaded from: classes2.dex */
public class UserAwemeCover implements Serializable {

    @InterfaceC65349Pkn("aweme_info")
    @InterfaceC65404Plg(JsonToStringAdapter.class)
    public String awemeInfo;

    @InterfaceC65349Pkn("preview_end")
    public int previewEnd;

    @InterfaceC65349Pkn("preview_start")
    public int previewStart;

    @InterfaceC65349Pkn("pull_text")
    public String pullText;

    public String getAwemeInfo() {
        return this.awemeInfo;
    }

    public int getPreviewEnd() {
        return this.previewEnd;
    }

    public int getPreviewStart() {
        return this.previewStart;
    }

    public String getPullText() {
        return this.pullText;
    }

    public void setAwemeInfo(String str) {
        this.awemeInfo = str;
    }

    public void setPreviewEnd(int i) {
        this.previewEnd = i;
    }

    public void setPreviewStart(int i) {
        this.previewStart = i;
    }

    public void setPullText(String str) {
        this.pullText = str;
    }
}
