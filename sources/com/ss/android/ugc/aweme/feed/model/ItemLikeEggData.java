package com.ss.android.ugc.aweme.feed.model;

import X.InterfaceC65349Pkn;
import java.io.Serializable;

/* loaded from: classes13.dex */
public class ItemLikeEggData implements Serializable {

    @InterfaceC65349Pkn("file_type")
    public String fileType;

    @InterfaceC65349Pkn("material_url")
    public String materialUrl;

    public String getFileType() {
        return this.fileType;
    }

    public String getMaterialUrl() {
        return this.materialUrl;
    }

    public void setFileType(String str) {
        this.fileType = str;
    }

    public void setMaterialUrl(String str) {
        this.materialUrl = str;
    }
}
